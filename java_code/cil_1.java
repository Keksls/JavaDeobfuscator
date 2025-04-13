/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ciL
 */
final class cil_1
extends chd_1<cto_2, bvw_2> {
    private static final Logger b = Logger.getLogger(cil_1.class);

    cil_1() {
    }

    @Override
    public boolean a(cto_2 cto_22) {
        bwh_0 bwh_02 = bwj_1.a().a(cto_22.d());
        boolean bl = azu_0.j().k().bz() == null;
        long l = cto_22.e();
        b.info((Object)("Starting join procedure for " + l));
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            b.error((Object)("Unknown Fighter " + l));
            return false;
        }
        blx_12.d(cto_22.b());
        blx_12.a(cto_22.d());
        blx_12.C(true);
        bvw_2 bvw_22 = (bvw_2)bwh_02;
        bvw_22.a(blx_12, cto_22.f());
        if (bl) {
            blx_12.bv().c(cto_22.f());
            if (blx_12.gY() == 1 && (bwh_02.e() == elp_0.b || bwh_02.e() == elp_0.d)) {
                blx_12.bv().e((byte)-1);
            }
        }
        aPc.f().a(blx_12, cto_22.d());
        blx_12.bj();
        return false;
    }
}

