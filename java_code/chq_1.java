/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chQ
 */
public final class chq_1
extends chd_1<cte_2, bvx_2> {
    @Override
    public boolean a(cte_2 cte_22) {
        long l = cte_22.b();
        byte[] byArray = cte_22.c();
        blx_1 blx_12 = (blx_1)((bvx_2)this.a).n(l);
        if (blx_12 == null) {
            return false;
        }
        biI biI2 = blx_12.bv();
        agi agi2 = biI2.aZ();
        biI2.a(agk.a());
        blx_12.b(byArray);
        eps_0[] eps_0Array = epq_2.c;
        for (int k = 0; k < eps_0Array.length; ++k) {
            eps_0 eps_02 = eps_0Array[k];
            epa_1 epa_12 = blx_12.a_(eps_02);
            epa_12.s();
        }
        if (((bvx_2)this.a).e() == elp_0.b) {
            ((bvx_2)this.a).A().t();
            blx_12.gm();
        }
        biI2.a(agi2);
        return false;
    }
}

