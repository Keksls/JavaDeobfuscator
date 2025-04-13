/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cju
 */
final class cju_2
implements adx_1<cum_2> {
    private static final Logger a = Logger.getLogger(cju_2.class);

    cju_2() {
    }

    @Override
    public boolean a(cum_2 cum_22) {
        euy_2 euy_22 = euy_2.a(cum_22.b());
        if (euy_22 != euy_2.a) {
            a.error((Object)("[H\u00e9ros] Impossible de changer de leader : errorId " + euy_22.a()));
            aZG.e().a(true);
            aUh.a("error.cantSwitchHeroLeader" + euy_22.a(), new Object[0]);
            bmr_1 bmr_12 = azu_0.j().k();
            bmr_12.n(true);
            euv_2.a.a(bmr_12.R(), bmr_12.a_());
            return false;
        }
        a.info((Object)("[H\u00e9ros] Nouveau leader local : " + cum_22.c()));
        dfc dfc2 = new dfc();
        dfc2.a_(16705);
        dfc2.a(cum_22.c());
        add_2.b().a(dfc2);
        dbA.h();
        return false;
    }

    @Override
    public int a() {
        return 13485;
    }
}

