/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJL
 */
@fpw_0
public class cjl_0 {
    public static final String PACKAGE = "wakfu.stasisDungeon";

    public static void enterDungeon(fck_2 fck_22) {
        dfc dfc2 = new dfc(16855);
        add_2.b().a(dfc2);
    }

    public static void validateDifficulty(fck_2 fck_22) {
        dfc dfc2 = new dfc(17912);
        add_2.b().a(dfc2);
    }

    public static void teleportGroup(fck_2 fck_22) {
        dfc dfc2 = new dfc(17261);
        add_2.b().a(dfc2);
    }

    public static void changeDifficultyLevel(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(16917);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void toggleAutoDownscale(fcp_2 fcp_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(16804);
        dfc2.a(fcp_22.j());
        add_2.b().a(dfc2);
    }

    public static void changeStasis(fcq_1 fcq_12) {
        int n = Math.round(fcq_12.j());
        dfc dfc2 = new dfc(16917);
        dfc2.b(n);
        add_2.b().a(dfc2);
    }
}

