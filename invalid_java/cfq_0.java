/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.zaap.ZaapParametersSources
 *  com.ankamagames.steam.wrapper.SteamApi
 *  org.apache.log4j.Logger
 */
import com.ankama.zaap.ZaapParametersSources;
import com.ankamagames.steam.wrapper.SteamApi;
import com.ankamagames.wakfu.client.console.command.debug.CinematicsSelectorCommand;
import com.ankamagames.wakfu.client.console.command.xulor.NinePatchCommand;
import com.ankamagames.wakfu.client.console.command.xulor.ThemeInfoCommand;
import org.apache.log4j.Logger;

/*
 * Renamed from cFq
 */
@fpw_0
public class cfq_0 {
    protected static final Logger a = Logger.getLogger(cfq_0.class);
    public static final String PACKAGE = "wakfu";
    public static final String b = "item";
    public static final String c = "state";
    private static fso d;

    public static void quit(fzs fzs2) {
        dfc.d((short)16782);
    }

    public static void cancelSteamLink(fzs fzs2) {
        fpm_0.b().o("steamLinkAccountDialog");
        cuo_0.e().b();
        azu_0.j().a("Cancel Steam Link");
        azu_0.j().a(cvv_0.a());
    }

    public static void moderatorRequestUserRequest(fzs fzs2) {
        if (azu_0.j().c(daz_0.a())) {
            String string = bae.h().a("moderator.error.chatStillOpened", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 0, string, 2L);
            fpm_0.b().a(fzn_02);
        } else {
            PI pI = new PI();
            azu_0.j().K().c(pI);
        }
    }

    public static void onLanguageSelected(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            bag_2 bag_22 = (bag_2)fcf_22.l();
            dfD dfD2 = new dfD();
            dfD2.a(bag_22.a());
            add_2.b().a(dfD2);
            ((bvx_0)ans_0.D().h()).a((agp_0)agq_0.a, bag_22.a().b().getLanguage());
        }
    }

    public static void setLanguage(fzs fzs2, String string) {
        dfD dfD2 = new dfD();
        dfD2.a(Ow.a(string));
        add_2.b().a(dfD2);
        ((bvx_0)ans_0.D().h()).a((agp_0)agq_0.a, string);
    }

    public static void selectServer(fzs fzs2, fug_0 fug_02, fug_0 fug_03) {
        cfq_0.selectServer(fzs2, fug_02, fug_03, null);
    }

    public static void selectServer(fzs fzs2, fug_0 fug_02, fug_0 fug_03, fup_0 fup_02) {
        boolean bl;
        if (fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() != 10) {
            return;
        }
        boolean bl2 = fis_1.a().c("demo");
        String string = fug_02.getText();
        String string2 = bl2 ? "demo" : fug_03.getText();
        boolean bl3 = bl = fup_02 != null && fup_02.getSelected();
        if (string != null && string2 != null && !string.isEmpty() && !string2.isEmpty()) {
            dfE dfE2 = new dfE();
            dfE2.b(string);
            dfE2.c(string2);
            dfE2.a((Boolean)bl);
            add_2.b().a(dfE2);
            cdw_0.n().c(600002L);
        } else {
            fpm_0.b().a(bae.h().a("logon.invalidForm", new Object[0]), cfn_0.a(1), 1027L, 1, 2);
        }
    }

    public static void loginWithLauncher(fck_2 fck_22) {
        a.info((Object)"Launcher Button clicked");
        boolean bl = fis_1.a().c("demo");
        if (bl) {
            a.info((Object)"Demo mode. Pushing normal auth frame.");
            emj.c();
            return;
        }
        ZaapParametersSources zaapParametersSources = emj.b();
        emj.a.a(new cfr_0(), zaapParametersSources);
    }

    public static void openMenuDialog(fzs fzs2) {
        dfc.d((short)18197);
    }

    public static void openReportBugDialog(fzs fzs2) {
        if (azu_0.j().c(daB.a())) {
            azu_0.j().b(daB.a());
        }
        dfc.d((short)16191);
    }

    public static void openAdminMonitorPanel(fzs fzs2) {
        dfc.d((short)19885);
    }

    public static void openHeroBuildTempUI(fck_2 fck_22) {
        det.a();
    }

    public static void openAdminCharacterEditor(fzs fzs2) {
        dfc.d((short)18296);
    }

    public static void openThemeInfoDialog(fzs fzs2) {
        ThemeInfoCommand.b();
    }

    public static void openNinePatch(fzs fzs2) {
        NinePatchCommand.b();
    }

    public static void openCinematicsSelectorDialog(fzs fzs2) {
        CinematicsSelectorCommand.b();
    }

    public static void openStuffDebugPreviewEditor(fzs fzs2) {
        if (azu_0.j().c(ddn.a())) {
            azu_0.j().b(ddn.a());
        } else {
            azu_0.j().a(ddn.a());
        }
    }

    public static void hackClientRights(fzs fzs2) {
        emg_0 emg_02 = azu_0.j().k().N_();
        boolean bl = !emg_02.o();
        emg_02.a(bl);
        fis_1.a().a("rightsHackMode", bl);
    }

    public static void moderation(fzs fzs2) {
        if (azu_0.j().c(daX.a)) {
            azu_0.j().b(daX.a);
        } else {
            azu_0.j().a(daX.a);
        }
    }

    public static void closePrivateMessageDialog(fzs fzs2) {
        dfc.d((short)19213);
    }

    public static boolean checkNameValidity(String string) {
        String string2;
        int[] nArray = azu_0.j().n().v();
        if (emp_0.b(nArray, emq_0.ba) && string.length() <= 25 && string.length() >= 3) {
            return true;
        }
        eak_0 eak_02 = eai_0.b(string);
        char c2 = eak_02.a();
        switch (eak_02.b()) {
            case m: {
                string2 = bae.h().a("error.characterCreation.forbiddenName", new Object[0]);
                break;
            }
            case n: {
                if (c2 != '\uffffffff') {
                    string2 = bae.h().a("error.characterCreation.invalidDashPosition2", Character.valueOf(c2));
                    break;
                }
                string2 = bae.h().a("error.characterCreation.invalidDashPosition", new Object[0]);
                break;
            }
            case e: {
                string2 = bae.h().a("error.characterCreation.tooManyConsonant", new Object[0]);
                break;
            }
            case f: {
                string2 = bae.h().a("error.characterCreation.tooManyVowel", new Object[0]);
                break;
            }
            case c: {
                string2 = bae.h().a("error.characterCreation.nameTooLong", new Object[0]);
                break;
            }
            case b: {
                string2 = bae.h().a("error.characterCreation.nameTooShort", new Object[0]);
                break;
            }
            case d: {
                if (c2 != '\uffffffff') {
                    string2 = bae.h().a("error.characterCreation.badChar2", String.valueOf(c2));
                    break;
                }
                string2 = bae.h().a("error.characterCreation.badChar", new Object[0]);
                break;
            }
            case g: {
                string2 = bae.h().a("error.characterCreation.tooManyConsecutiveIdentical", new Object[0]);
                break;
            }
            case h: {
                string2 = bae.h().a("error.characterCreation.tooFewVowelInPart", new Object[0]);
                break;
            }
            case i: {
                string2 = bae.h().a("error.characterCreation.tooFewConsonantInPart", new Object[0]);
                break;
            }
            case j: {
                string2 = bae.h().a("error.characterCreation.tooManySpecialInPart", new Object[0]);
                break;
            }
            case k: {
                string2 = bae.h().a("error.characterCreation.parTooLong", new Object[0]);
                break;
            }
            case l: {
                string2 = bae.h().a("error.characterCreation.tooManySpecial", new Object[0]);
                break;
            }
            case o: {
                string2 = bae.h().a("error.characterCreation.nameWithBadCase", new Object[0]);
                break;
            }
            default: {
                return true;
            }
        }
        fpm_0.b().a(string2, cfn_0.a(1), 1027L, 1, 2);
        return false;
    }

    public static String formatNumber(String string) {
        Object object = "";
        if (string != null && string.length() > 0) {
            int n = 1;
            while (string.length() > 3 * n) {
                object = "." + string.substring(string.length() - 3 * n, string.length() - 3 * (n - 1)) + (String)object;
                ++n;
            }
            object = string.substring(0, string.length() - 3 * (n - 1)) + (String)object;
        }
        return object;
    }

    public static int parseStringNumber(String string) {
        string = string.replaceAll("\\.", "");
        try {
            return Integer.parseInt(string);
        }
        catch (Exception exception) {
            a.error((Object)("Exception during parseStringNumber(" + string + ")"), (Throwable)exception);
            return Integer.MAX_VALUE;
        }
    }

    public static void openItemDetailWindow(fcb_2 fcb_22, fvk_0 fvk_02) {
        if (fcb_22.x() == 3) {
            exk_2 exk_22 = null;
            Object object = fcb_22.j();
            if (object instanceof bHN) {
                exk_22 = ((bHN)object).h();
            } else if (object instanceof bwk_2) {
                exk_22 = eyo_1.g().g(((bwk_2)object).a().n());
            }
            cfq_0.sendOpenCloseItemDetailMessage(fvk_02 == null ? null : fvk_02.getElementMap().c(), exk_22);
        }
    }

    public static exk_2 getItemWithReferenceItem(ezr_0 ezr_02) {
        exk_2 exk_22 = new exk_2(ezr_02.n());
        exk_22.b(ezr_02);
        exk_22.a((short)1);
        return exk_22;
    }

    public static void sendOpenCloseItemDetailMessage(String string, ezr_0 ezr_02) {
        cfq_0.sendOpenCloseItemDetailMessage(string, cfq_0.getItemWithReferenceItem(ezr_02));
    }

    public static void sendOpenCloseItemDetailMessage(ezr_0 ezr_02, int n, int n2) {
        cfq_0.sendOpenCloseItemDetailMessage(cfq_0.getItemWithReferenceItem(ezr_02), n, n2);
    }

    public static dgE getOpenCloseItemDetailMessage(exk_2 exk_22) {
        dgE dgE2;
        if (exk_22.aQ_()) {
            dgE2 = new dgO<bMi>(new bMi(exk_22));
            dgE2.a_(18168);
        } else {
            dgE2 = new dgK();
            dgE2.a_(16130);
            dgE2.a(exk_22);
        }
        return dgE2;
    }

    public static void sendOpenCloseItemDetailMessage(String string, exk_2 exk_22) {
        cfq_0.sendOpenCloseItemDetailMessage(string, exk_22, false);
    }

    public static void sendOpenCloseItemDetailMessage(String string, exk_2 exk_22, boolean bl) {
        dgE dgE2 = cfq_0.getOpenCloseItemDetailMessage(exk_22);
        dgE2.b(string);
        dgE2.b(bl);
        add_2.b().a(dgE2);
    }

    public static void sendOpenCloseItemDetailMessage(exk_2 exk_22, int n, int n2) {
        dgE dgE2 = cfq_0.getOpenCloseItemDetailMessage(exk_22);
        dgE2.c(n);
        dgE2.d(n2);
        add_2.b().a(dgE2);
    }

    public static void openRefItemDetailWindow(fzs fzs2, bjw_1 bjw_12) {
        cfq_0.sendOpenCloseItemDetailMessage(((fyb_0)fzs2.e()).getElementMap().b(), bjw_12);
    }

    public static void sendOpenItemDetailMessage(String string, exk_2 exk_22, boolean bl) {
        dgE dgE2;
        if (exk_22.aQ_()) {
            dgE2 = new dgO<bMi>(new bMi(exk_22));
            dgE2.a_(19026);
        } else {
            dgE2 = new dgK();
            dgE2.a_(17123);
            dgE2.a(exk_22);
        }
        dgE2.b(string);
        dgE2.b(bl);
        add_2.b().a(dgE2);
    }

    public static void sendCloseItemDetailMessage(String string, exk_2 exk_22, boolean bl) {
        dgE dgE2;
        if (exk_22.aQ_()) {
            dgE2 = new dgO<bMi>(new bMi(exk_22));
            dgE2.a_(17713);
        } else {
            dgE2 = new dgK();
            dgE2.a_(16236);
            dgE2.a(exk_22);
        }
        dgE2.b(string);
        dgE2.b(bl);
        add_2.b().a(dgE2);
    }

    public static void openItemDetailWindow(fcb_2 fcb_22) {
        cfq_0.openItemDetailWindow(fcb_22, null);
    }

    public static boolean openLinkInBrowser(fzs fzs2) {
        fuk_0 fuk_02;
        fxH fxH2;
        if (fzs2.e() instanceof fuk_0 && (fxH2 = (fuk_02 = (fuk_0)fzs2.e()).getBlockUnderMouse()) != null && fxH2.g() == fxI.b) {
            String string;
            fxQ fxQ2 = fxH2.h();
            if (fxQ2 == null) {
                return false;
            }
            if (fxQ2.b() == ane_2.b && (string = ((fxS)fxQ2).p()) != null) {
                cfq_0.a(string);
                return true;
            }
        }
        return false;
    }

    public static void openInBrowser(fzs fzs2, String string) {
        cfq_0.a(string);
    }

    static void a(String string) {
        if (string == null) {
            return;
        }
        if (bPL.a.e()) {
            SteamApi.SteamFriends().ActivateGameOverlayToWebPage(string);
        } else {
            aii_1.a(string);
        }
    }

    public static void createAccount(fzs fzs2) {
        try {
            String string = azs_0.a().a("accountCreationUrl");
            String string2 = String.format(string, bae.h().f().i());
            cfq_0.a(string2);
        }
        catch (gm_0 gm_02) {
            gm_02.printStackTrace();
        }
    }

    public static void forgottenPassword(fzs fzs2) {
        try {
            String string = azs_0.a().a("forgottenPasswordUrl");
            String string2 = String.format(string, bae.h().f().i());
            cfq_0.a(string2);
        }
        catch (gm_0 gm_02) {
            gm_02.printStackTrace();
        }
    }

    public static void linkSteamAccount(fzs fzs2) {
        try {
            String string = azs_0.a().a("linkSteamAccountUrl");
            bcl_2.a.a(new cFt(string));
        }
        catch (gm_0 gm_02) {
            gm_02.printStackTrace();
        }
    }

    public static void checkAntiAddictionAccount(fzs fzs2) {
        try {
            String string = azs_0.a().a("antiAddictionAccountCheckURL");
            String string2 = String.format(string, bae.h().f().i());
            cfq_0.a(string2);
        }
        catch (gm_0 gm_02) {
            gm_02.printStackTrace();
        }
    }

    public static void validateNickname(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        if (string.length() < 3) {
            fpm_0.b().a(bae.h().a("error.connection.nicknameTooShort", new Object[0]), cfn_0.a(1), 1027L, 1, 2);
        } else if (string.equalsIgnoreCase(azu_0.j().A())) {
            fpm_0.b().a(bae.h().a("error.connection.nicknameEqualsLogin", new Object[0]), cfn_0.a(1), 1027L, 1, 2);
        } else {
            dfc dfc2 = new dfc();
            dfc2.a_(19132);
            dfc2.a(string);
            add_2.b().a(dfc2);
            fpm_0.b().o("nicknameChoiceDialog");
        }
    }

    public static void setLeftArrowVisible(fzs fzs2) {
        if (!cvv_0.a().e().b()) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("logonDialog");
        fvE fvE2 = (fvE)fyy_02.a("leftArrowContainer");
        fvE fvE3 = (fvE)fyy_02.a("leftArrowImage");
        fvE2.setVisible(true);
        fvE3.setVisible(true);
        cfq_0.a(true, fvE2);
        cfq_0.a(true, fvE3);
    }

    public static void setLeftArrowInvisible(fzs fzs2) {
        cfq_0.setLeftArrowInvisible(fzs2, false);
    }

    public static void setLeftArrowInvisible(fzs fzs2, boolean bl) {
        if (!bl && !cvv_0.a().e().b()) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("logonDialog");
        fvE fvE2 = (fvE)fyy_02.a("leftArrowContainer");
        fvE fvE3 = (fvE)fyy_02.a("leftArrowImage");
        fvE2.setVisible(true);
        fvE3.setVisible(true);
        cfq_0.a(false, fvE2);
        cfq_0.a(false, fvE3);
    }

    public static void setRightArrowVisible(fzs fzs2) {
        if (!cvv_0.a().e().a()) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("logonDialog");
        fvE fvE2 = (fvE)fyy_02.a("rightArrowContainer");
        fvE fvE3 = (fvE)fyy_02.a("rightArrowImage");
        fvE2.setVisible(true);
        fvE3.setVisible(true);
        cfq_0.a(true, fvE2);
        cfq_0.a(true, fvE3);
    }

    public static void setRightArrowInvisible(fzs fzs2) {
        cfq_0.setRightArrowInvisible(fzs2, false);
    }

    public static void setRightArrowInvisible(fzs fzs2, boolean bl) {
        if (!bl && !cvv_0.a().e().a()) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("logonDialog");
        fvE fvE2 = (fvE)fyy_02.a("rightArrowContainer");
        fvE fvE3 = (fvE)fyy_02.a("rightArrowImage");
        fvE2.setVisible(true);
        fvE3.setVisible(true);
        cfq_0.a(false, fvE2);
        cfq_0.a(false, fvE3);
    }

    private static void a(boolean bl, fvE fvE2) {
        int n;
        int n2;
        if (bl) {
            n2 = azf_2.b.i();
            n = azf_2.e.i();
        } else {
            n2 = azf_2.e.i();
            n = azf_2.b.i();
        }
        if (bl) {
            cdw_0.n().z();
        } else {
            cdw_0.n().A();
        }
        azf_2 azf_22 = new azf_2(n2);
        azf_2 azf_23 = new azf_2(n);
        fvE2.getAppearance().removeTweensOfType(fjp_2.class);
        fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, fvE2.getAppearance(), 0, 500, 1, false, fjw_2.b);
        fvE2.getAppearance().addTween(fjp_22);
    }

    public static void togglePlayPauseVideo(fzs fzs2) {
        dfc.d((short)16090);
    }

    public static void selectNew(fzs fzs2, bvd_0 bvd_02) {
        dhb dhb2 = new dhb(bvd_02);
        add_2.b().a(dhb2);
    }

    public static void selectNextNew(fzs fzs2) {
        dfc.d((short)19691);
    }

    public static void selectPreviousNew(fzs fzs2) {
        dfc.d((short)17589);
    }

    public static void setVideoVolume(fcq_1 fcq_12, fsy_0 fsy_02) {
        dfc dfc2 = new dfc();
        dfc2.a_(19414);
        dfc2.a(fcq_12.j());
        add_2.b().a(dfc2);
    }

    public static void setVideoProgression(fck_2 fck_22) {
        dfc dfc2 = new dfc();
        if (!(fck_22.e() instanceof ftv)) {
            return;
        }
        ftv ftv2 = (ftv)fck_22.e();
        int n = ftv2.getWidth();
        if (n == 0) {
            return;
        }
        float f2 = (float)fck_22.a(ftv2) / (float)n;
        dfc2.a_(17780);
        dfc2.a(f2);
        add_2.b().a(dfc2);
    }

    public static void seek(fzs fzs2, ftv ftv2) {
        fck_2 fck_22 = (fck_2)fzs2;
        int n = fck_22.a(ftv2);
        int n2 = fck_22.b(ftv2);
        ftv2.setValue(n / ftv2.getWidth());
    }

    public static void mouseOverQuality(fzs fzs2, fso fso2) {
        fso2.setVisible(true);
        d = fso2;
    }

    public static void mouseOutQuality(fzs fzs2, fso fso2) {
        fso2.setVisible(false);
    }

    public static void mouseOverNew(fcb_2 fcb_22) {
        fis_1.a().a("overNew", fcb_22.j());
    }

    public static void mouseOutNew(fcb_2 fcb_22) {
        fis_1.a().a("overNew", (Object)null);
    }

    public static void selectQuality(fcb_2 fcb_22) {
        if (d != null) {
            d.setVisible(false);
            d = null;
        }
        bvm_0 bvm_02 = (bvm_0)fcb_22.j();
        dfc dfc2 = new dfc();
        dfc2.a_(19183);
        dfc2.b(bvm_02.a());
        add_2.b().a(dfc2);
    }

    public static void muteVideo(fzs fzs2) {
        dfc.d((short)19365);
    }

    public static void onMouseOutDrawer(fck_2 fck_22, fsy_0 fsy_02, fvE fvE2, fso fso2) {
        if (!fsy_02.isPopupIsBeingDisplayed()) {
            return;
        }
        fvE fvE3 = fta_0.getInstance().getWidget(fck_22.v(), fck_22.w());
        if (fvE2.equals(fvE3)) {
            return;
        }
        if (fvE3 == fso2 || fvE3.hasInParentHierarchy(fso2)) {
            return;
        }
        fpu_0.switchDrawer(fck_22, fsy_02);
    }

    public static void displayQuests(fzs fzs2) {
        fyy_0 fyy_02 = fpm_0.b().h().d("verticalFollowedAchievementsDialog");
        if (fyy_02 == null) {
            fyy_02 = fpm_0.b().h().d("followedAchievementsDialog");
        }
        if (fyy_02 == null) {
            return;
        }
        fvk_0 fvk_02 = (fvk_0)fyy_02.a("window");
        int n = fvk_02.getY() + fvk_02.getHeight();
        fvk_02.setVisible(false);
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        boolean bl = !fis_1.a().c("followedQuestsDisplay");
        bvx_02.a((agp_0)bWe.ah, bl);
        dem.a();
        fvk_02.a(new cfu_0(fvk_02, n));
    }

    public static void setVideoToFullScreen(fzs fzs2) {
        dfc.d((short)19808);
    }

    public static void shop(fzs fzs2) {
        ddO.a().c();
    }

    public static void openShopOnConversionStone(fzs fzs2) {
        ddO.a().e();
    }

    public static void openBoosterShop(fzs fzs2) {
        ddO.a().b("WAKFU_BOOSTER_PACK");
    }

    public static void subscriptionEndTeleport(fzs fzs2) {
        azu_0.j().K().c(new cqQ());
        fpm_0.b().o("subscriptionEndedDialog");
    }

    public static void connectWithSteam(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(17697);
        add_2.b().a(dfc2);
        cdw_0.n().c(600002L);
    }

    public static void nationPvpLadderDialog(fzs fzs2) {
        if (azu_0.j().c(dbj_0.a)) {
            azu_0.j().b(dbj_0.a);
        } else {
            azu_0.j().a(dbj_0.a);
        }
    }

    public static void aptitudesBonusDialog(fzs fzs2) {
        if (azu_0.j().c(cVw.a)) {
            azu_0.j().b(cVw.a);
        } else {
            azu_0.j().a(cVw.a);
        }
    }

    public static void toggleBattlegroundBarDetail(fcp_2 fcp_22) {
        if (fcp_22.j() != fis_1.a().c("battlegroundBarDetail")) {
            dfc dfc2 = new dfc(16571);
            dfc2.a(fcp_22.j());
            add_2.b().a(dfc2);
        }
    }

    public static void displayBattlegroundExplanation(fzs fzs2, bkm_2 bkm_22) {
        dfc dfc2 = new dfc(19597);
        dfc2.b(bkm_22.a().b());
        add_2.b().a(dfc2);
    }

    public static void showItemPopup(fcb_2 fcb_22, fil_1 fil_12) {
        Object object = fcb_22.j();
        if (object == null) {
            return;
        }
        fvE fvE2 = (fvE)fcb_22.e();
        if (object instanceof exk_2) {
            cJl.showPopup(fcb_22, (exk_2)object, fil_12, fvE2);
        } else if (object instanceof exs_1) {
            exs_1 exs_12 = (exs_1)object;
            if (!exs_12.t()) {
                return;
            }
            exk_2 exk_22 = exs_12.h();
            if (exk_22 == null) {
                return;
            }
            cJl.showPopup(fcb_22, exk_22, fil_12, fvE2);
        } else if (object instanceof bhx_1) {
            bjw_1 bjw_12 = ((bhx_1)object).a();
            if (bjw_12 == null) {
                return;
            }
            exk_2 exk_23 = eyo_1.g().g(bjw_12.n());
            if (exk_23 == null) {
                a.warn((Object)String.format("ReferenceItem with id %s(%d) isn't found by ReferenceItemManager", bjw_12.e(), bjw_12.n()));
                cJl.showPopup(fcb_22, bjw_12, fil_12, fvE2);
            } else {
                cJl.showPopup(fcb_22, exk_23, fil_12, fvE2);
            }
        }
    }

    public static void transferClickEventToWorldInteractionFrame(fck_2 fck_22) {
        aNF aNF2 = (aNF)ans_0.D().c();
        float f2 = aNF2.F() - (float)fck_22.w();
        dhL.b(fck_22.v(), (int)f2, fck_22.x());
    }

    public static void switchPvpMode(fzs fzs2, String string) {
        fhD fhD2 = fhD.valueOf(string);
        add_2.b().a(new dfc(17820, (Object)fhD2));
    }

    public static void logEvent(fzs fzs2) {
        StringBuilder stringBuilder = new StringBuilder(fzs2.toString());
        Object t = fzs2.e();
        if (t instanceof fxz) {
            stringBuilder.append(String.format(" with following text : \"%s\"", ((fxz)t).getText()));
        }
        a.info((Object)stringBuilder.toString());
    }
}

