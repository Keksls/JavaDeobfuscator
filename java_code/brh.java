/*
 * Decompiled with CFR 0.152.
 */
class brh
implements eQg {
    final /* synthetic */ brd_0 a;

    brh(brd_0 brd_02) {
        this.a = brd_02;
    }

    @Override
    public void a(eQf eQf2, epl_0 epl_02) {
        boolean bl;
        long l = azu_0.j().k().U_();
        boolean bl2 = epl_02.o() != l || epl_02.f() == this.a.p.b().l().a_();
        boolean bl3 = bl = epl_02.w() || epl_02.v();
        if (bl && !bl2) {
            bmk_1 bmk_12 = this.a.a(epl_02);
            this.a.d(bmk_12);
            this.a.e(this.a.a(epl_02));
            dbO.a().c();
            this.a.b(true);
        }
    }

    @Override
    public void a(eQf eQf2, epl_0 epl_02, boolean bl) {
        long l = azu_0.j().k().U_();
        if ((epl_02.w() || epl_02.v()) && epl_02.o() == l) {
            bmk_1 bmk_12 = this.a.a(epl_02);
            this.a.f(bmk_12);
            this.a.e(this.a.a(epl_02));
            dbO.a().c();
        }
    }

    @Override
    public void a(eQf eQf2, long l, long l2) {
    }
}

