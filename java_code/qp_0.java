/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Qp
 */
public class qp_0
extends Pw {
    public static final byte a = 0;
    public static final byte b = 1;
    public boolean c = true;
    private byte e;
    private long f;
    private String g;
    private long h;
    private long i;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.e);
        abx_22.a(this.f);
        abx_22.a(this.i);
        if (this.g != null) {
            byte[] byArray = Cz.a(this.g);
            abx_22.a((byte)0);
            abx_22.a((byte)byArray.length);
            abx_22.b(byArray);
        } else {
            abx_22.a((byte)1);
            abx_22.a(this.h);
        }
        if (this.c) {
            return this.a((byte)6, abx_22.c());
        }
        return this.a((byte)2, abx_22.c());
    }

    @Override
    public int a() {
        return 1058;
    }

    public void a(byte by) {
        this.e = by;
    }

    public void a(String string) {
        this.g = string;
        this.h = -1L;
    }

    public void a(long l) {
        this.h = l;
        this.g = null;
    }

    public void b(long l) {
        this.i = l;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public void c(long l) {
        this.f = l;
    }
}

