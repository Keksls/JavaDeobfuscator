/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@fpw_0
public class cJU {
    protected static final Logger a = Logger.getLogger(cJU.class);
    public static final String PACKAGE = "wakfu.timeline";

    public static void displayNextFighterInTimeline(fzs fzs2, fsQ fsQ2) {
        fsQ2.setOffset(fsQ2.getOffset() + 1.0f);
    }

    public static void displayPreviousFighterInTimeline(fzs fzs2, fsQ fsQ2) {
        fsQ2.setOffset(fsQ2.getOffset() - 1.0f);
    }

    public static void openCloseSecondTimeline(fzs fzs2) {
        dfc.d((short)18578);
    }

    public static void openCloseStateBar(fzs fzs2) {
        dfc.d((short)16538);
    }

    public static void selectFighterInTimeline(fck_2 fck_22, blx_1 blx_12) {
        if (fck_22.f() == frd_0.A) {
            if (fck_22.x() == 1) {
                if (bvu_0.c() == bvu_0.b) {
                    apw_0.a().a(blx_12.a_());
                }
                if (azu_0.j().c(cYW.a())) {
                    bmr_1 bmr_12 = azu_0.j().k();
                    if (blx_12.bp()) {
                        cYW.a().a(blx_12);
                        cYW.a().d();
                    }
                    return;
                }
                if (!azu_0.j().c(cZa.a())) {
                    return;
                }
                cux_0 cux_02 = cZa.a().e();
                if (!azu_0.j().c(cux_02)) {
                    return;
                }
                if (blx_12.ca()) {
                    aff_1 aff_12 = cJU.a(blx_12);
                    cyp_0.g().a(aff_12 != null ? aff_12 : blx_12.P_());
                    cux_02.j();
                }
            } else if (fck_22.x() == 3) {
                ddy_0.a().a(blx_12);
            }
        }
    }

    private static aff_1 a(blx_1 blx_12) {
        blx_1 blx_13;
        int n = blx_12.X();
        aff_1 aff_12 = null;
        if (n > 0 && (blx_13 = cZa.a().d()) != null && blx_13.bp()) {
            aff_1 aff_13 = blx_13.P_();
            for (int k = -n; k < n + 1; ++k) {
                for (int i2 = -n; i2 < n + 1; ++i2) {
                    aff_1 aff_14 = new aff_1(blx_12.G() + k, blx_12.H() + i2);
                    if (aff_12 != null && aff_12.e(aff_13) < aff_14.e(aff_13)) continue;
                    aff_12 = aff_14;
                }
            }
        }
        return aff_12;
    }

    public static void highlightFighterInTimeline(fzs fzs2, blx_1 blx_12) {
        if (blx_12 != null && blx_12.ao() != null) {
            ddy_0.a().d().a(blx_12);
            if (bvu_0.c() == bvu_0.a) {
                apw_0.a().a(blx_12.a_());
            }
            fis_1.a().a("fight.describedFighter", blx_12);
            if (azu_0.j().c(cyp_0.g())) {
                aff_1 aff_12 = cJU.a(blx_12);
                cyp_0.g().b(true);
                blx_12.bz().A().a(blx_12, true);
                if (blx_12.ca()) {
                    cyp_0.g().a(aff_12 != null ? aff_12 : blx_12.P_());
                }
            } else if (azu_0.j().c(cYX.c)) {
                blx_12.bz().A().a(blx_12, true);
            }
        }
    }

    public static void unhighlightFighterInTimeline(fzs fzs2, blx_1 blx_12) {
        if (blx_12 != null && blx_12.ao() != null) {
            ddy_0.a().d().O();
            fis_1.a().a("fight.describedFighter", (Object)null);
            blx_12.bz().A().a(blx_12, false);
            cyp_0.g().b(false);
        }
    }

    public static void onFighterClick(fcb_2 fcb_22) {
        ddy_0.a().a((blx_1)fcb_22.j());
    }
}

