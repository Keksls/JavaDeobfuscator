/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ciP
 */
final class cip_1
extends chd_1<ctu_2, bvw_2> {
    private static final Logger b = Logger.getLogger(cip_1.class);

    cip_1() {
    }

    @Override
    public boolean a(ctu_2 ctu_22) {
        bwh_0 bwh_02 = bwj_1.a().a(ctu_22.d());
        if (!(bwh_02 instanceof bvw_2)) {
            b.error((Object)String.format("Un message %s concernant le %s id=%d a \u00e9t\u00e9 adress\u00e9 \u00e0 la %s", ctu_22.getClass().getSimpleName(), bwh_02.getClass().getSimpleName(), bwh_02.c(), this.getClass().getSimpleName()));
            return false;
        }
        bbj_0 bbj_02 = new bbj_0(alc_1.q(), ctu_22.c().a(), ctu_22.b(), ctu_22.d());
        bbj_02.d(ctu_22.g());
        baa_0.a().a(ctu_22.d(), (aku_1)bbj_02);
        baa_0.a().a(ctu_22.d());
        return false;
    }
}

