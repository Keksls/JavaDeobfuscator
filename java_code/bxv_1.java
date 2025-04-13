/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from bxV
 */
public class bxv_1 {
    private bxv_1() {
    }

    public static String a(eqd_0 eqd_02) {
        eqh_0 eqh_02 = eqd_02.f();
        switch (eqh_02.a()) {
            case e: {
                ani_2 ani_22 = new ani_2();
                eQQ eQQ2 = (eQQ)eqh_02;
                erw_1 erw_12 = eQQ2.b();
                ani_22.a((CharSequence)bae.h().a("storageCompartmentBonusDesc", erw_12.N));
                return ani_22.r();
            }
            case a: {
                ani_2 ani_23 = new ani_2();
                eqk_0 eqk_02 = (eqk_0)eqh_02;
                int n = eqk_02.b();
                efh_0 efh_02 = bgh_0.a().d(n);
                eDr eDr2 = new eDr(Collections.singletonList(efh_02), 0, 0);
                ArrayList<String> arrayList = eDr2.a();
                int n2 = arrayList.size();
                for (int k = 0; k < n2; ++k) {
                    ani_23.a((CharSequence)arrayList.get(k));
                }
                return ani_23.r();
            }
            case b: {
                return bae.h().a("guildBonus.increaseMaxAuthorizedEvolution", new Object[0]);
            }
            case c: {
                return bae.h().a("guildBonus.reduceLearningDuration", new Object[0]);
            }
            case f: {
                return bae.h().a("guildBonus.setWeeklyPointsLimit", new Object[0]);
            }
            case g: {
                return bae.h().a("guildBonus.setPointsEarnedFactor", new Object[0]);
            }
            case d: {
                return bae.h().a(138, (long)eqd_02.a(), new Object[0]);
            }
            case i: {
                return bae.h().a("guildBonus.unlockHavenWorld", new Object[0]);
            }
            case j: {
                return bae.h().a("guildBonus.increaseMembersSize", ((eqj_0)eqh_02).b());
            }
        }
        return null;
    }

    public static boolean a(erh_1 erh_12, eqd_0 eqd_02, erg_1 erg_12) {
        double d2 = erg_12.q().a();
        bos_2 bos_22 = azu_0.j().k().eV();
        float f2 = ((bot_2)bos_22).i();
        return erf_1.b(erh_12, eqd_02, d2 * (double)f2);
    }

    public static wt_0 b(erh_1 erh_12, eqd_0 eqd_02, erg_1 erg_12) {
        double d2 = erg_12.q().a();
        bos_2 bos_22 = azu_0.j().k().eV();
        float f2 = ((bot_2)bos_22).i();
        return erf_1.a(erh_12, eqd_02, d2 * (double)f2);
    }

    public static wt_0 c(erh_1 erh_12, eqd_0 eqd_02, erg_1 erg_12) {
        return erf_1.d(erh_12, eqd_02, erg_12.q().c());
    }

    public static boolean b(eqd_0 eqd_02) {
        return eqd_02.c() || eqd_02.e();
    }
}

