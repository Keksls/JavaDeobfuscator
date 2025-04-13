/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.commonIn.MapCommand;

/*
 * Renamed from cFG
 */
@fpw_0
public class cfg_0 {
    public static final String PACKAGE = "wakfu.battlegroundList";

    public static void outBattleground(fzs fzs2, fvE fvE2) {
        if (fvE2 != null) {
            fvE2.setVisible(false);
        }
    }

    public static void overBattleground(fzs fzs2, fvE fvE2) {
        if (fvE2 != null) {
            fvE2.setVisible(true);
        }
    }

    public static void selectBattleground(fck_2 fck_22, bkn_2 bkn_22) {
        dfc dfc2 = new dfc(19591);
        dfc2.a(bkn_22);
        add_2.b().a(dfc2);
    }

    public static void previousPage(fzs fzs2) {
        add_2.b().a(new dfc(19452));
    }

    public static void nextPage(fzs fzs2) {
        add_2.b().a(new dfc(19103));
    }

    public static void validMinLevelFilter(fzs fzs2, fug_0 fug_02) {
        bkf_2 bkf_22 = (bkf_2)fis_1.a().e("battlegroundListView");
        short s2 = -1;
        String string = fug_02.getText();
        if (string != null && string.length() > 0) {
            s2 = Co.h(string);
        }
        if (s2 != bkf_22.b()) {
            bkf_22.a(s2);
        }
    }

    public static void validMaxLevelFilter(fzs fzs2, fug_0 fug_02) {
        bkf_2 bkf_22 = (bkf_2)fis_1.a().e("battlegroundListView");
        short s2 = Short.MAX_VALUE;
        String string = fug_02.getText();
        if (string != null && string.length() > 0) {
            s2 = Co.h(string);
        }
        if (s2 != bkf_22.c()) {
            bkf_22.b(s2);
        }
    }

    public static void checkFinishedFilter(fzs fzs2) {
        ((bkf_2)fis_1.a().e("battlegroundListView")).e();
    }

    public static void selectBattlegroundType(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(16883);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void onCompassClick(fck_2 fck_22, brm_1 brm_12) {
        MapCommand.b();
        bLP bLP2 = blf_1.a((long)((short)brm_12.c()), true);
        bLP bLP3 = blf_1.a(brm_12.b(), (short)brm_12.c());
        ble_1.E().a(bLP3 != null ? bLP3 : bLP2);
    }
}

