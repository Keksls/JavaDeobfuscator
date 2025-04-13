/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cmz
 */
public class cmz_0
extends Pw {
    private boolean a;
    private long b;

    public cmz_0(boolean bl, long l) {
        this.a = bl;
        this.b = l;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12305;
    }
}

