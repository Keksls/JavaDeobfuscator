/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czd
 */
public class czd_1
extends Pw {
    private eco_0 a;
    private int b;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a.p());
        abx_22.a(this.a.f());
        abx_22.a(this.a.e());
        abx_22.a(this.b);
        abx_22.a(this.a.c(ecp_0.a));
        return this.a((byte)6, abx_22.c());
    }

    public void a(eco_0 eco_02) {
        this.a = eco_02;
    }

    public void b(int n) {
        this.b = n;
    }

    @Override
    public int a() {
        return 14218;
    }
}

