/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from conn
 */
public class conn_0
extends Pw {
    private long a;
    private long b;
    private byte c;
    private exh_2 e;
    private long f;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.e.a());
        abx_22.a(this.f);
        return this.a((byte)3, abx_22.c());
    }

    public void a(long l) {
        this.a = l;
    }

    public void b(long l) {
        this.b = l;
    }

    public void a(byte by) {
        this.c = by;
    }

    public void a(exh_2 exh_22) {
        this.e = exh_22;
    }

    public void c(long l) {
        this.f = l;
    }

    @Override
    public int a() {
        return 12628;
    }
}

