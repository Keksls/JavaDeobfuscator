/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHz
 */
@fpw_0
public class chz_0 {
    public static final String PACKAGE = "wakfu.jukebox";

    public static void pickInstance(fcb_2 fcb_22) {
        if (!(fcb_22.j() instanceof bkd_1)) {
            return;
        }
        bkd_1 bkd_12 = (bkd_1)fcb_22.j();
        dfc.a((short)16533, bkd_12);
    }

    public static void pickAmbienceZone(fcb_2 fcb_22) {
        if (!(fcb_22.j() instanceof bke_1)) {
            return;
        }
        bke_1 bke_12 = (bke_1)fcb_22.j();
        dfc.a((short)16144, bke_12);
    }

    public static void pickMusic(fcb_2 fcb_22) {
        dfc.a((short)19698, fcb_22.j());
    }

    public static void dropMusic(fzs fzs2) {
        dfc.a((short)19698, -1L);
    }

    public static void randomMusic(fzs fzs2) {
        dfc.d((short)17842);
    }

    public static void onInstanceSearch(fcd_2 fcd_22) {
        dfc.a((short)18275, ((ful_0)fcd_22.e()).getText());
    }

    public static void overList(fzs fzs2, fvE fvE2) {
        if (fvE2 != null) {
            fvE2.setVisible(true);
        }
    }

    public static void outList(fzs fzs2, fvE fvE2) {
        if (fvE2 != null) {
            fvE2.setVisible(false);
        }
    }
}

