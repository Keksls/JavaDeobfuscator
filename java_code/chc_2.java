/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from chC
 */
final class chc_2
extends chd_1<cug_2, bvx_2> {
    private static final Logger b = Logger.getLogger(chc_2.class);

    chc_2() {
    }

    @Override
    public boolean a(cug_2 cug_22) {
        Object object;
        byte by = cug_22.c().a();
        si_0 si_02 = (si_0)efc_0.a().b(cug_22.g());
        if (si_02 == null) {
            b.error((Object)("Impossible d'instancier un runningEffect :" + cug_22.g() + " inconnu"));
            return false;
        }
        ejh_0 ejh_02 = (ejh_0)si_02.a(null, bgh_0.a());
        if (ejh_02.m() == null) {
            object = bwj_1.a().a(cug_22.d());
            if (object != null) {
                ejh_02.a(object.h());
            } else {
                ejh_02.a(bgg_0.k());
            }
        }
        object = ejh_02.b(cug_22.h());
        baq_0 baq_02 = new baq_0(cug_22.e(), by, cug_22.d(), cug_22.b(), ejh_02);
        baq_02.d(cug_22.f());
        if (((iO)object).p() != 0L) {
            baq_02.c(((iO)object).p());
        }
        baa_0.a().a(cug_22.d(), (aku_1)baq_02);
        return false;
    }
}

