/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bAb
 */
public final class bab_2 {
    public static baa_2 a(blx_1 blx_12) {
        epq_1 epq_12 = blx_12.Z_();
        aff_1 aff_12 = cyp_0.g().h();
        if (epq_12 == epn_2.g && aff_12 != null && blx_12.c(eps_0.e) > 0) {
            boolean bl;
            boolean bl2 = bl = bab_2.a(blx_12, blx_12.P_()) && bab_2.a(blx_12, aff_12);
            if (bl) {
                return baa_2.c;
            }
        }
        if (aff_12 != null && bab_2.b(blx_12) && bab_2.a(blx_12, blx_12.P_(), aff_12)) {
            return baa_2.d;
        }
        return baa_2.b;
    }

    private static boolean b(blx_1 blx_12) {
        return !blx_12.a(eoz_1.aY);
    }

    private static boolean a(blx_1 blx_12, aff_1 aff_12, aff_1 aff_13) {
        bvx_2 bvx_22 = blx_12.bz();
        if (bvx_22 == null) {
            return false;
        }
        ss_0 ss_02 = bvx_22.i();
        byte by = bab_2.a(aff_12, ss_02);
        byte by2 = bab_2.a(aff_13, ss_02);
        return by != -1 && by == by2;
    }

    private static byte a(aff_1 aff_12, ss_0 ss_02) {
        byte by = -1;
        List<sr_0> list = ss_02.c(aff_12);
        for (sr_0 sr_02 : list) {
            if (sr_02.w() != ele_0.q.a()) continue;
            by = sr_02.Y();
        }
        return by;
    }

    public static boolean a(blx_1 blx_12, aff_1 aff_12) {
        bvx_2 bvx_22 = blx_12.bz();
        if (bvx_22 == null) {
            return false;
        }
        ss_0 ss_02 = bvx_22.i();
        List<sr_0> list = ss_02.c(aff_12);
        for (sr_0 sr_02 : list) {
            if (sr_02.v() != blx_12 || sr_02.w() != ele_0.b.a()) continue;
            return true;
        }
        return false;
    }
}

