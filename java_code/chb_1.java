/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from chB
 */
final class chb_1
extends chd_1<cuf_2, bvx_2> {
    private static final Logger b = Logger.getLogger(chb_1.class);

    chb_1() {
    }

    @Override
    public boolean a(cuf_2 cuf_22) {
        Object object;
        byte by = cuf_22.c().a();
        si_0 si_02 = (si_0)efc_0.a().b(cuf_22.g());
        if (si_02 == null) {
            b.error((Object)("Impossible d'instancier un runningEffect :" + cuf_22.g() + " inconnu"));
            return false;
        }
        ejh_0 ejh_02 = (ejh_0)si_02.a(null, bgh_0.a());
        if (ejh_02.m() == null) {
            object = bwj_1.a().a(cuf_22.d());
            if (object != null) {
                ejh_02.a(object.h());
            } else {
                ejh_02.a(bgg_0.k());
            }
        }
        object = ejh_02.b(cuf_22.h());
        bbN bbN2 = new bbN(cuf_22.e(), by, cuf_22.b(), cuf_22.d(), ejh_02, cuf_22.i());
        bbN2.d(cuf_22.f());
        bbN2.r();
        if (((iO)object).p() != 0L) {
            bbN2.c(((iO)object).p());
        }
        if (((iO)object).n() != 0L) {
            bbN2.e(((iO)object).n());
        }
        baa_0.a().a(cuf_22.d(), (aku_1)bbN2);
        bbN2.a(new alb_1(bbN2.i()));
        return false;
    }
}

