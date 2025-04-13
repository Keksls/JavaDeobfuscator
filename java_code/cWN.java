/*
 * Decompiled with CFR 0.152.
 */
class cWN
implements fac_2 {
    final /* synthetic */ fyb_0 a;
    final /* synthetic */ cwk_0 b;

    cWN(cwk_0 cwk_02, fyb_0 fyb_02) {
        this.b = cwk_02;
        this.a = fyb_02;
    }

    @Override
    public void a() {
        dfr dfr2 = new dfr();
        dfr2.a_(17914);
        dfr2.a(true);
        epn_2 epn_22 = this.b.p.b() && this.b.q != null ? this.b.q.ev() : epn_2.j;
        blw_1 blw_12 = this.b.i.get(this.b.a(epn_22));
        dfr2.a(blw_12.a() ? blw_12 : this.b.i.get(this.b.b(this.b.p)));
        fim_1 fim_12 = (fim_1)this.a.getElementMap().a("characterSexRadioGroup");
        int n = this.b.p.b() && this.b.q != null ? (int)this.b.q.gX() : 0;
        fim_12.setValue(String.valueOf(n));
        add_2.b().a(dfr2);
        this.b.y.removeListContentLoadListener(this);
    }
}

