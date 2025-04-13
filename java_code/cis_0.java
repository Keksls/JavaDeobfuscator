/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cIs
 */
class cis_0
implements cIW {
    final /* synthetic */ bWe a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ aPr d;

    cis_0(bWe bWe2, boolean bl, boolean bl2, aPr aPr2) {
        this.a = bWe2;
        this.b = bl;
        this.c = bl2;
        this.d = aPr2;
    }

    @Override
    public void a() {
        ((bvx_0)ans_0.D().h()).a((agp_0)this.a, this.b);
    }

    @Override
    public void b() {
        ((bvx_0)ans_0.D().h()).a((agp_0)this.a, this.c);
        this.d.a(this.c);
    }
}

