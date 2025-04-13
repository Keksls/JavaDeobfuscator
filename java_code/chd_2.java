/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from chD
 */
final class chd_2
extends chd_1<cuh_2, bvx_2> {
    private static final Logger b = Logger.getLogger(chd_2.class);

    chd_2() {
    }

    @Override
    public boolean a(cuh_2 cuh_22) {
        byte by = cuh_22.c().a();
        si_0 si_02 = (si_0)efc_0.a().b(cuh_22.g());
        if (si_02 == null) {
            b.error((Object)("Impossible d'instancier un runningEffect :" + cuh_22.g() + " inconnu"));
            return false;
        }
        bbY bbY2 = new bbY(cuh_22.e(), by, cuh_22.d(), cuh_22.b(), si_02, cuh_22.j(), cuh_22.i(), cuh_22.h());
        bbY2.d(cuh_22.f());
        baa_0.a().a(cuh_22.d(), (aku_1)bbY2);
        return false;
    }
}

