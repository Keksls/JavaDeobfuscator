/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.nio.ByteBuffer;

/*
 * Renamed from VB
 */
public class vb_0 {
    private final TLongArrayList a = new TLongArrayList();
    private final TLongArrayList b = new TLongArrayList();
    private final vd_0 c;

    vb_0(vd_0 vd_02) {
        this.c = vd_02;
    }

    void a(long l) {
        this.c.a(this, l);
    }

    void a(long l, int n) {
        this.c.a(this, l, n);
    }

    void b(long l) {
        int n;
        while ((n = this.b.indexOf(l)) != -1) {
            this.b.removeAt(n);
        }
        this.c.b(this, l);
    }

    void a() {
        this.c.a(this);
    }

    void b() {
        this.c.b(this);
    }

    void c() {
        this.c.c(this);
    }

    public TLongArrayList d() {
        return this.b;
    }

    public TLongArrayList e() {
        return this.a;
    }

    public int f() {
        return 1 + 8 * this.b.size() + 1 + 8 * this.a.size();
    }

    public void a(ByteBuffer byteBuffer) {
        int n;
        byteBuffer.put((byte)this.b.size());
        for (n = 0; n < this.b.size(); ++n) {
            byteBuffer.putLong(this.b.get(n));
        }
        byteBuffer.put((byte)this.a.size());
        for (n = 0; n < this.a.size(); ++n) {
            byteBuffer.putLong(this.a.get(n));
        }
    }

    public void b(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.get();
        for (n = 0; n < n2; ++n) {
            long l = byteBuffer.getLong();
            this.b.add(l);
        }
        n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            this.a.add(l);
        }
    }

    public void g() {
        this.b.clear();
        this.a.clear();
    }
}

