/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from coo
 */
public class coo_0
extends Pw {
    private long a;
    private long b;
    private byte c;
    private long e;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.e);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13983;
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

    public void c(long l) {
        this.e = l;
    }
}

