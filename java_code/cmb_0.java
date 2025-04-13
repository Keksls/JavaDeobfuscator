/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cmB
 */
public class cmb_0
extends Pw {
    private final int a;
    private long b;
    private long c;
    private long e;

    public cmb_0(int n) {
        this.a = n;
    }

    public cmb_0 a(long l) {
        this.b = l;
        return this;
    }

    public cmb_0 b(long l) {
        this.c = l;
        return this;
    }

    public cmb_0 c(long l) {
        this.e = l;
        return this;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.e);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return this.a;
    }
}

