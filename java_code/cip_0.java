/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cIp
 */
class cip_0
implements cIW {
    final /* synthetic */ bWe a;
    final /* synthetic */ aPw b;
    final /* synthetic */ aPw c;
    final /* synthetic */ aPr d;

    cip_0(bWe bWe2, aPw aPw2, aPw aPw3, aPr aPr2) {
        this.a = bWe2;
        this.b = aPw2;
        this.c = aPw3;
        this.d = aPr2;
    }

    @Override
    public void a() {
        ((bvx_0)ans_0.D().h()).a((agp_0)this.a, this.b.a());
    }

    @Override
    public void b() {
        ((bvx_0)ans_0.D().h()).a((agp_0)this.a, this.c.a());
        this.d.a(this.c, false);
    }
}

