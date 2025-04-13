/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bwO
 */
public class bwo_1 {
    private bwo_1() {
    }

    public static bwq_0 a(@NotNull bwh_0 bwh_02, @NotNull blx_1 blx_12) {
        return new bwn_0(bwh_02, azu_0.j().k(), blx_12);
    }

    public static bwq_0 b(@NotNull bwh_0 bwh_02, @NotNull blx_1 blx_12) {
        return new bwt_0(bwh_02, azu_0.j().k(), blx_12);
    }

    public static bwq_0 a(@NotNull bwh_0 bwh_02) {
        return new bwm_1(bwh_02, azu_0.j().k());
    }

    public static bwq_0 a(@NotNull bMn bMn2) {
        bvw_2 bvw_22 = bMn2.m().bw();
        if (bvw_22 == null) {
            return new bwp_0();
        }
        return new bwm_1(bvw_22, azu_0.j().k()).a();
    }
}

