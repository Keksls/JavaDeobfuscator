/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

@fpw_0
public class cHh {
    public static final String PACKAGE = "wakfu.guildBannerCreator";

    public static void selectColor(fcb_2 fcb_22) {
        dgt_0 dgt_02 = new dgt_0();
        dgt_02.a_(16552);
        dgt_02.a((azj_2)fcb_22.j());
        add_2.b().a(dgt_02);
    }

    public static void selectBackground(fcb_2 fcb_22) {
        dfc dfc2 = new dfc(17018);
        byd_1 byd_12 = (byd_1)fcb_22.j();
        dfc2.b(byd_12.a());
        add_2.b().a(dfc2);
    }

    public static void selectEmblem(fcb_2 fcb_22) {
        dfc dfc2 = new dfc(19289);
        byd_1 byd_12 = (byd_1)fcb_22.j();
        dfc2.b(byd_12.a());
        add_2.b().a(dfc2);
    }

    public static void createGuild(fzs fzs2, fug_0 fug_02, String string) {
        String string2 = cHh.a(fug_02);
        dgv_0 dgv_02 = new dgv_0();
        dgv_02.b(string2);
        add_2.b().a(dgv_02);
    }

    @NotNull
    private static String a(fug_0 fug_02) {
        String string = fug_02.getText();
        String string2 = Cz.d(string).replaceAll("[?]", "");
        if (!string2.equals(string)) {
            fug_02.setTextImmediate(string2);
        }
        return string2;
    }

    public static void validateBlazonChange(fzs fzs2) {
        dfc dfc2 = new dfc(18040);
        add_2.b().a(dfc2);
    }

    public static void validateNameChange(fzs fzs2, fug_0 fug_02) {
        String string = cHh.a(fug_02);
        dfc dfc2 = new dfc(16703);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void notifyNameChange(fcz_1 fcz_12) {
        if (!fcz_12.j()) {
            fug_0 fug_02 = (fug_0)fcz_12.e();
            String string = cHh.a(fug_02);
            dfc dfc2 = new dfc(16041);
            dfc2.a(string);
            add_2.b().a(dfc2);
        }
    }

    public static void onIconTypeChanged(fcp_2 fcp_22, String string) {
        if (!fcp_22.j()) {
            return;
        }
        dfc dfc2 = new dfc(19041);
        dfc2.b(Integer.parseInt(string));
        add_2.b().a(dfc2);
    }

    public static void selectEmblemCategory(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(16395);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void closeDialog(fzs fzs2) {
        azu_0.j().b(cZl.a());
    }

    public static void restoreBlazon(fzs fzs2) {
        add_2.b().a(new dfc(18066));
    }

    public static void openShop(fzs fzs2) {
        ddO.a().b("wakfu_service");
        add_2.b().a(new dfc(16029));
    }
}

