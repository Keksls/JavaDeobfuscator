/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhi
 */
class bhi_2
implements afu_0 {
    final /* synthetic */ ekk_0 a;
    final /* synthetic */ abz_0 b;
    final /* synthetic */ bhh_2 c;

    bhi_2(bhh_2 bhh_22, ekk_0 ekk_02, abz_0 abz_02) {
        this.c = bhh_22;
        this.a = ekk_02;
        this.b = abz_02;
    }

    public void a(abz_0 abz_02, boolean bl) {
        if (bl) {
            Object object;
            fvE fvE2 = fta_0.getInstance().getMouseOver();
            if (fvE2 != null && fvE2 != fta_0.getInstance()) {
                return;
            }
            Su su = this.a.v();
            StringBuilder stringBuilder = new StringBuilder();
            if (su != null) {
                stringBuilder.append(" [").append(((blx_1)su).dp()).append("] ");
            }
            stringBuilder.append(bae.h().a(6, (long)((int)this.a.A()), new Object[0]));
            rs_0 rs_02 = this.a.av();
            ru_0 ru_02 = rs_02.p();
            if (ru_02 == eps_0.b) {
                object = "hp.var";
                stringBuilder.append(" (").append(bae.h().a("hp.var", this.a.c(ru_02))).append(")");
            }
            object = new dhg(this.b, 0);
            ((dhg)object).a(stringBuilder.toString(), null);
            dbm_0.a().a((dhg)object);
        } else {
            dbm_0.a().a(this.b);
        }
    }
}

