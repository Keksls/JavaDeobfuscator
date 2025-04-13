/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@fpw_0
public class cJx {
    private static final Logger a = Logger.getLogger(cJx.class);
    public static final String PACKAGE = "wakfu.serverChoice";

    public static void backToAuthentication(fzs fzs2) {
        azu_0.j().b(dcD.a);
        fzw_0.a.a("loginLock", true);
        azu_0.j().a(cvv_0.a());
    }

    public static void selectServer(fzs fzs2, bwj_0 bwj_02) {
        fis_1.a().a("serverChoice.selectedServerReference", bwj_02);
        dcD.a.a(true);
    }

    public static void forceAccount(fzs fzs2, bwj_0 bwj_02) {
        fzn_0 fzn_02 = new fzn_0(102, 1, "Saisissez l'ID de compte \u00e0 forcer :", 65542L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(new cJy(bwj_02));
    }

    public static void filterServerList(fzs fzs2) {
        ftI ftI2 = (ftI)fzs2.e();
        try {
            byte by = Byte.parseByte(ftI2.getValue());
            dcD.a.a(by);
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Invalid filter value : " + ftI2.getValue()));
        }
    }

    public static void validServer(fzs fzs2, bwj_0 bwj_02) {
        dhx dhx2 = new dhx();
        dhx2.a(bwj_02);
        dhx2.a_(19218);
        add_2.b().a(dhx2);
    }

    public static void validServerDoubleClick(fzs fzs2, bwj_0 bwj_02) {
        if (fzs2 != null && bwj_02 != null) {
            dhx dhx2 = new dhx();
            dhx2.a(bwj_02);
            dhx2.a_(19218);
            add_2.b().a(dhx2);
        }
    }

    public static void startScrollLeft(fzs fzs2) {
        dcD.a.a(dex.b);
    }

    public static void startScrollRight(fzs fzs2) {
        dcD.a.a(dex.c);
    }

    public static void stopScroll(fzs fzs2) {
        dcD.a.a(dex.a);
    }

    public static void openSteamLinkAccountUrlInBrowser(fzs fzs2) {
    }
}

