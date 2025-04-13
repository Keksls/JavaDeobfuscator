/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ciV
 */
public class civ_1
extends chd_1<cta_2, bvw_2> {
    private static final Logger b = Logger.getLogger(civ_1.class);

    @Override
    public boolean a(cta_2 cta_22) {
        byte by = cta_22.b().e();
        boolean bl = cta_22.b().b();
        bwh_0 bwh_02 = bwj_1.a().a(cta_22.d());
        if (bwh_02 == null) {
            b.warn((Object)("The fight with the id " + cta_22.d() + " has not been found"));
            return false;
        }
        if (bwh_02 instanceof bvw_2) {
            bvw_2 bvw_22 = (bvw_2)bwh_02;
            bvw_22.b(by, bl);
            aoy_0.b(bvw_22, by, bl);
        } else if (bwh_02 instanceof bvx_2) {
            bvx_2 bvx_22 = (bvx_2)bwh_02;
            bvx_22.a(cta_22.b());
        }
        return false;
    }
}

