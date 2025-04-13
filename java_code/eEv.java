/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class eEv {
    private long a;
    private final int b;
    private final wu_0 c;
    private final ww_0 d;
    private final int e;
    private final int f;
    private final int g;
    private final long h;
    private final ArrayList<eEw> i = new ArrayList();

    public eEv(long l, int n, wu_0 wu_02, ww_0 ww_02, int n2, int n3, int n4, long l2) {
        this.a = l;
        this.b = n;
        this.c = wu_02;
        this.d = ww_02;
        this.e = n2;
        this.f = n3;
        this.g = n4;
        this.h = l2;
    }

    public int a() {
        return this.b;
    }

    public wu_0 b() {
        return this.c;
    }

    public ww_0 c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public long g() {
        return this.h;
    }

    public void a(eEw eEw2) {
        this.i.add(eEw2);
    }

    public ArrayList<eEw> h() {
        return this.i;
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putLong(this.c.h());
        byteBuffer.putLong(this.d.g());
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.f);
        byteBuffer.putInt(this.g);
        byteBuffer.putLong(this.h);
        byteBuffer.putShort((short)this.i.size());
        for (int k = 0; k < this.i.size(); ++k) {
            this.i.get(k).a(byteBuffer);
        }
    }

    public static eEv b(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        long l2 = byteBuffer.getLong();
        long l3 = byteBuffer.getLong();
        int n2 = byteBuffer.getInt();
        int n3 = byteBuffer.getInt();
        int n4 = byteBuffer.getInt();
        long l4 = byteBuffer.getLong();
        eEv eEv2 = new eEv(l, n, wt_0.b(l2), ww_0.a(l3), n2, n3, n4, l4);
        int n5 = byteBuffer.getShort();
        for (int k = 0; k < n5; ++k) {
            eEv2.a(eEw.b(byteBuffer));
        }
        return eEv2;
    }

    public int i() {
        int n = 0;
        for (int k = 0; k < this.i.size(); ++k) {
            n += this.i.get(k).b();
        }
        return 50 + n;
    }

    @Nullable
    public eEw a(int n) {
        if (n >= this.i.size()) {
            return null;
        }
        return this.i.get(n);
    }

    public long j() {
        return this.a;
    }

    public void a(long l) {
        this.a = l;
    }

    public String toString() {
        return "date=" + this.c + ", score=" + this.h + ", charactersCount=" + this.i.size();
    }
}

