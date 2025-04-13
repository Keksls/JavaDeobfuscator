/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class bdd
implements adx_1<cso_0> {
    private static final Logger a = Logger.getLogger(bdd.class);

    bdd() {
    }

    @Override
    public boolean a(cso_0 cso_02) {
        bai_0 bai_02 = azu_0.j().n();
        bmr_1 bmr_12 = new bmr_1(true);
        bmr_12.g(false);
        bmr_12.a(ezl_1.a(cso_02.b()));
        bmr_12.a(ezl_2.b(cso_02.c()));
        bmr_12.b(cso_02.d());
        bmr_12.cw();
        ccm_1.g().b(bmr_12);
        bmr_1 bmr_13 = (bmr_1)bzf_1.a(bmr_12.a_());
        if (bmr_13 != null) {
            bmr_13.q(true);
            bmr_13.g(true);
            afz_0.d().a(bmr_13.bv());
            bmr_13.a(ezl_1.a(cso_02.b()));
            bmr_13.a(ezl_2.b(cso_02.c()));
            bmr_13.b(cso_02.d());
            bmr_13.cw();
            bmr_13.bv().c(false);
        }
        bPJ.a(bmr_12.dz(), bmr_12.aZ(), bmr_12.cg());
        euj_2<bmr_1> euj_22 = new euj_2<bmr_1>(bai_02.u());
        try {
            euj_22.a(bmr_12);
            euj_22.b(bmr_12);
        }
        catch (eui_2 eui_22) {
            a.error((Object)"Probl\u00e8me \u00e0 l'ajout du h\u00e9ros : ", (Throwable)eui_22);
        }
        return false;
    }

    @Override
    public int a() {
        return 12073;
    }
}

