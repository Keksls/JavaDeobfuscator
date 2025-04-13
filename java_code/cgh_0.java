/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.commonIn.MapCommand;

/*
 * Renamed from cGH
 */
@fpw_0
public class cgh_0 {
    public static final String PACKAGE = "wakfu.dungeon";
    private static final ans_1 a = new cgi_0();

    public static void selectDungeon(fcb_2 fcb_22) {
        btb btb2 = (btb)fcb_22.j();
        dfc dfc2 = new dfc();
        dfc2.a_(18278);
        dfc2.b(btb2.m());
        add_2.b().a(dfc2);
    }

    public static void setFilter(fzs fzs2, bsX bsX2) {
        dfc dfc2 = new dfc();
        dfc2.a_(16408);
        dfc2.a(bsX2.a().a());
        add_2.b().a(dfc2);
    }

    public static void validNameFilter(fzs fzs2, fuh_0 fuh_02) {
        String string = fuh_02.getText();
        dfc dfc2 = new dfc();
        dfc2.a_(17731);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void validMinLevelFilter(fzs fzs2, fug_0 fug_02) {
        short s2 = -1;
        String string = fug_02.getText();
        if (string != null && !string.isEmpty()) {
            s2 = Co.h(string);
        }
        dfc dfc2 = new dfc();
        dfc2.a_(18164);
        dfc2.a(s2);
        add_2.b().a(dfc2);
    }

    public static void validMaxLevelFilter(fzs fzs2, fug_0 fug_02) {
        short s2 = Short.MAX_VALUE;
        String string = fug_02.getText();
        if (string != null && !string.isEmpty()) {
            s2 = Co.h(string);
        }
        dfc dfc2 = new dfc();
        dfc2.a_(16139);
        dfc2.a(s2);
        add_2.b().a(dfc2);
    }

    public static void changeDungeonGameplayFilter(fcf_2 fcf_22) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof bsY)) {
            return;
        }
        bsY bsY2 = (bsY)fcf_22.l();
        dfc dfc2 = new dfc(18941);
        dfc2.a(bsY2.b());
        add_2.b().a(dfc2);
    }

    public static void heroPrevious(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(19125);
        dfc2.a(true);
        add_2.b().a(dfc2);
    }

    public static void heroNext(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(19125);
        dfc2.a(false);
        add_2.b().a(dfc2);
    }

    public static void next(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(17174);
        dfc2.a(false);
        add_2.b().a(dfc2);
    }

    public static void previous(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(17174);
        dfc2.a(true);
        add_2.b().a(dfc2);
    }

    public static void first(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(18180);
        add_2.b().a(dfc2);
    }

    public static void last(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(16020);
        add_2.b().a(dfc2);
    }

    public static void changeLadderType(fcp_2 fcp_22, String string) {
        if (!fcp_22.j()) {
            return;
        }
        int n = Integer.parseInt(string);
        dfc dfc2 = new dfc();
        dfc2.a_(18264);
        dfc2.b(n);
        add_2.b().a(dfc2);
    }

    public static void changeFilterType(fcp_2 fcp_22, String string) {
        if (!fcp_22.j()) {
            return;
        }
        int n = Integer.parseInt(string);
        dfc dfc2 = new dfc();
        dfc2.a_(17237);
        dfc2.b(n);
        add_2.b().a(dfc2);
    }

    public static void searchPlayer(fzs fzs2, fug_0 fug_02) {
        if (fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() != 10) {
            return;
        }
        String string = fug_02.getText();
        dfc dfc2 = new dfc();
        dfc2.a_(18432);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void cancelSearchPlayer(fzs fzs2, fug_0 fug_02) {
        fug_02.c("");
        dfc dfc2 = new dfc();
        dfc2.a_(18312);
        add_2.b().a(dfc2);
    }

    public static void openLadderRewards(fzs fzs2) {
        if (fpm_0.b().q("ladderRewardsDialog")) {
            cgh_0.unloadRewardPreviewDialog(new fck_2());
        } else {
            fpm_0.b().a("ladderRewardsDialog", cfi_0.a("ladderRewardsDialog"), 32768L, (short)10000);
            if (!fpm_0.b().d("wakfu.exchangeMachine")) {
                fpm_0.b().a("wakfu.exchangeMachine", cGU.class);
            }
            fpm_0.b().a(a);
        }
    }

    public static void switchToNextRewards(fzs fzs2) {
        dfc dfc2 = new dfc(19792);
        dfc2.a(false);
        add_2.b().a(dfc2);
    }

    public static void switchToAvailableRewards(fzs fzs2) {
        dfc dfc2 = new dfc(19792);
        dfc2.a(true);
        add_2.b().a(dfc2);
    }

    public static void unloadRewardPreviewDialog(fck_2 fck_22) {
        fpm_0.b().o("ladderRewardsDialog");
    }

    public static void openItemDetailWindow(fck_2 fck_22, bht_1 bht_12, fvk_0 fvk_02) {
        ezr_0<bhg_0> ezr_02 = bht_12.i();
        exk_2 exk_22 = new exk_2(bht_12.i().n());
        exk_22.b(ezr_02);
        cgo_0.openItemDetailWindow(fck_22, fvk_02, exk_22);
    }

    public static void openMap(fzs fzs2, btb btb2) {
        MapCommand.b();
        bLP bLP2 = blf_1.a(btb2.q(), false);
        ble_1.E().a(bLP2);
    }

    public static void requestSteleInformation(fzs fzs2, btb btb2) {
        int n = btb2.b();
        if (n < 0) {
            return;
        }
        dfc dfc2 = new dfc(18780);
        dfc2.b(n);
        add_2.b().a(dfc2);
    }
}

