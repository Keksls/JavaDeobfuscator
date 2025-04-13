/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class fcg {
    private final wt_0 c;
    protected final ArrayList<fcf> a = new ArrayList();
    protected int b = 0;

    public fcg() {
        this.c = wt_0.b(0L);
    }

    public int a() {
        return this.a.size();
    }

    public int b() {
        return this.b;
    }

    public wt_0 c() {
        return this.c;
    }

    public void a(int n, int n2, ArrayList<fcf> arrayList) {
        int n3 = n + Math.min(n2, this.a.size() - n);
        for (int k = n; k < n3; ++k) {
            arrayList.add(this.a.get(k));
        }
    }

    public void a(faX faX2) {
        this.c.a(faX2.w().h());
        this.b = 0;
        TLongObjectIterator<fcf> tLongObjectIterator = faX2.z();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fcf fcf2 = (fcf)tLongObjectIterator.value();
            this.a.add(fcf2);
            this.b += fcf2.c();
        }
        this.a.sort(eoo_0.B);
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.c.h());
        byteBuffer.putInt(this.b);
        byteBuffer.putShort((short)this.a.size());
        for (int k = 0; k < this.a.size(); ++k) {
            this.a.get(k).b(byteBuffer);
        }
    }

    public void b(ByteBuffer byteBuffer) {
        this.a.clear();
        this.c.a(byteBuffer.getLong());
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            this.a.add(fcf.c(byteBuffer));
        }
    }

    public int d() {
        int n = 14;
        for (int k = 0; k < this.a.size(); ++k) {
            n += this.a.get(k).e();
        }
        return n;
    }

    public void e() {
        this.c.a(0L);
        this.a.clear();
        this.b = 0;
    }
}

