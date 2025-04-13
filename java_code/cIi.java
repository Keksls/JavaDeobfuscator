/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.WakfuClient;
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;
import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;

@fpw_0
public class cIi {
    public static final String PACKAGE = "wakfu.options";
    private static final Logger b = Logger.getLogger(cIi.class);
    private static boolean c;
    private static boolean d;
    static int e;
    private static boolean f;
    public static final int a = 3;
    private static final TIntObjectHashMap<cIW> g;
    private static int h;
    private static amj_1 i;

    public static void setSelectedTabIndex(int n) {
        if (h == n) {
            return;
        }
        if (n == 3) {
            cdw_0.n().a(1.0f, 1000);
            cdw_0.n().b(1.0f, 1000);
        } else {
            cdw_0.n().a(0.2f, 1000);
            cdw_0.n().b(0.2f, 1000);
        }
        h = n;
    }

    public static void tabClick(fck_2 fck_22, fut_0 fut_02) {
        cIi.setSelectedTabIndex(fut_02.getSelectedTabIndex());
    }

    public static void clearOptionActions() {
        g.clear();
    }

    public static void setMusicVolume(fcq_1 fcq_12) {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        ago_0 ago_02 = ago_0.a;
        float f2 = fcq_12.j();
        cdw_0.n().a(f2);
        g.put(ago_02.hashCode(), (Object)new cij_0(bvx_02, ago_02, f2));
    }

    public static void setAmbianceSoundsVolume(fcq_1 fcq_12) {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        ago_0 ago_02 = ago_0.b;
        float f2 = fcq_12.j();
        cdw_0.n().c(f2);
        g.put(ago_02.hashCode(), (Object)new cIu(bvx_02, ago_02, f2));
    }

    public static void setUiSoundsVolume(fcq_1 fcq_12) {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        ago_0 ago_02 = ago_0.c;
        float f2 = fcq_12.j();
        cdw_0.n().b(f2);
        g.put(ago_02.hashCode(), (Object)new cif_0(bvx_02, ago_02, f2));
    }

    public static void setMusicMute(fcp_2 fcp_22) {
        ago_0 ago_02 = ago_0.d;
        int n = ago_02.hashCode();
        boolean bl = fcp_22.j();
        cdw_0.n().i(bl);
        g.put(n, (Object)new ciq_0(ago_02, bl));
    }

    public static void setMusicContinuousMode(fcp_2 fcp_22) {
        ago_0 ago_02 = ago_0.g;
        int n = ago_02.hashCode();
        boolean bl = fcp_22.j();
        cdw_0.n().d(bl);
        g.put(n, (Object)new cIR(ago_02, bl));
    }

    public static void setAmbianceSoundsMute(fcp_2 fcp_22) {
        ago_0 ago_02 = ago_0.e;
        int n = ago_02.hashCode();
        boolean bl = fcp_22.j();
        cdw_0.n().k(bl);
        g.put(n, (Object)new cIS(ago_02, bl));
    }

    public static void setUiSoundsMute(fcp_2 fcp_22) {
        ago_0 ago_02 = ago_0.f;
        int n = ago_02.hashCode();
        boolean bl = fcp_22.j();
        cdw_0.n().j(bl);
        g.put(n, (Object)new cit_0(ago_02, bl));
    }

    public static void startAmbianceSoundTest(fzs fzs2) {
        i = cdw_0.n().b(600025L, true);
    }

    public static void startUiSoundTest(fzs fzs2) {
        i = cdw_0.n().a(600025L, true);
    }

    public static void stopSoundTest(fzs fzs2) {
        if (i != null) {
            i.m(0.2f);
            i = null;
        }
    }

    public static void closeOptionsDialog(fzs fzs2) {
        dfc.d((short)17806);
    }

    public static void closeOptionsAndMenuDialogs(fzs fzs2) {
        dfc.d((short)17806);
        dfc.d((short)19547);
    }

    public static void onScreenModeChanged(fcf_2 fcf_22) {
        d = true;
        dbA.a().c().a((dhp_0)fcf_22.l());
    }

    public static void onScreenSizeChanged(fcf_2 fcf_22) {
        d = true;
        dbA.a().c().a(fcf_22.l());
    }

    public static void onGraphicalPresetsChanged(fcf_2 fcf_22) {
        bWd bWd2;
        if (!fcf_22.k()) {
            return;
        }
        bWe bWe2 = bWe.o;
        bWd bWd3 = bWd.a((byte)((bvx_0)ans_0.D().h()).d(bWe2));
        if (bWd3 == (bWd2 = (bWd)fcf_22.l())) {
            return;
        }
        switch (bWd2) {
            case a: {
                break;
            }
            case b: {
                cIi.activateVSync(true);
                cIi.enableRunningRadius(false);
                cIi.b(false);
                cIi.c(false);
                break;
            }
            case d: {
                cIi.activateVSync(true);
                cIi.enableRunningRadius(false);
                cIi.b(true);
                cIi.c(true);
                break;
            }
            case e: {
                cIi.activateVSync(true);
                cIi.enableRunningRadius(true);
                cIi.b(true);
                cIi.c(true);
            }
        }
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, bWd2.a());
    }

    public static void setUIScale(fck_2 fck_22) {
        float f2 = ((fum)fck_22.d()).getValue() / 25.0f - 5.0f;
        cIi.setUIScale((byte)f2);
    }

    public static void resetUIScaleToDefault(fzs fzs2) {
        cIi.setUIScale((byte)0);
    }

    public static boolean setUIScale(byte by) {
        agq_0 agq_02 = agq_0.c;
        int n = ((bvx_0)ans_0.D().h()).d(agq_02);
        if (n == by) {
            return false;
        }
        ((bvx_0)ans_0.D().h()).a((agp_0)agq_02, by);
        ans_0.D().c(by);
        fis_1.a().a((ajf_1)bvw_0.a(), "currentUiScaleText");
        g.put(agq_02.hashCode(), (Object)new ciu_0(agq_02, n));
        ado_1.a().a(() -> {
            fso fso2 = (fso)fpm_0.b().k("optionsDialog");
            fso fso3 = (fso)fso2.getElementMap().a("optionsWindow");
            int n = (fta_0.getInstance().getWidth() - fso3.getWidth()) / 2;
            int n2 = (fta_0.getInstance().getHeight() - fso3.getHeight()) / 2;
            fso3.setPosition(n, n2);
        }, 1L, 1);
        return true;
    }

    public static void onSelectedThemeChanged(fcf_2 fcf_22) {
        if (!(fcf_22.l() instanceof fje_1)) {
            return;
        }
        fje_1 fje_12 = (fje_1)fcf_22.l();
        fit_1 fit_12 = fis_1.a().f("selectedTheme");
        fje_1 fje_13 = fit_12 != null && fit_12.f() instanceof fje_1 ? (fje_1)fit_12.f() : null;
        fyu.a(WakfuClient.a.m(), fje_12);
        if (!fje_12.equals(fje_13) && fje_13 != null) {
            g.put("selectedTheme".hashCode(), (Object)new cIV());
        }
    }

    public static void saveSelectedTheme(fje_1 fje_12) {
        try {
            Properties properties = new Properties();
            if (fje_12.a() != null) {
                properties.setProperty("selectedTheme", fje_12.a());
            }
            properties.store(new FileOutputStream(WakfuClient.a.m()), null);
            fis_1.a().a("selectedTheme", fje_12);
        }
        catch (IOException iOException) {
            b.error((Object)"[THEME] Error while saving selected custom theme", (Throwable)iOException);
        }
    }

    public static void setActivateAreaChallenges(fcp_2 fcp_22) {
        bWe bWe2 = bWe.F;
        int n = bWe2.hashCode();
        boolean bl = fcp_22.j();
        g.put(bWe2.hashCode(), (Object)new cIk(bWe2, bl));
    }

    public static void activateVSync(fcp_2 fcp_22) {
        if (cIi.activateVSync(fcp_22.j())) {
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.o, bWd.a.a());
        }
    }

    public static boolean activateVSync(boolean bl) {
        bWe bWe2 = bWe.D;
        int n = bWe2.hashCode();
        boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe2);
        if (bl2 == bl) {
            return false;
        }
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, bl);
        ans_0.D().e().d(bl);
        g.put(n, (Object)new cil_0(bl2, bWe2));
        return true;
    }

    public static void enableRunningRadius(fcp_2 fcp_22) {
        if (cIi.enableRunningRadius(fcp_22.j())) {
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.o, bWd.a.a());
        }
    }

    public static boolean enableRunningRadius(boolean bl) {
        bWe bWe2 = bWe.E;
        int n = bWe2.hashCode();
        boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe2);
        if (bl2 == bl) {
            return false;
        }
        abu.n(bl);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, bl);
        g.put(n, (Object)new cIm(bl2, bWe2));
        return true;
    }

    public static void setAutoLockFights(fcp_2 fcp_22) {
        bWe bWe2 = bWe.G;
        int n = bWe2.hashCode();
        boolean bl = fcp_22.j();
        g.put(bWe2.hashCode(), (Object)new cin_0(bWe2));
    }

    public static void setAutoJoinFights(fcp_2 fcp_22) {
        bWe bWe2 = bWe.ar;
        int n = bWe2.hashCode();
        boolean bl = fcp_22.j();
        g.put(n, (Object)new cio_0(bWe2));
    }

    public static void onTacticalViewModeChanged(fcf_2 fcf_22) {
        aPw aPw2;
        aPr aPr2 = aPr.a();
        aPw aPw3 = aPr2.d();
        if (aPw3 == (aPw2 = (aPw)fcf_22.l())) {
            return;
        }
        aPr2.a(aPw2, true);
        bWe bWe2 = bWe.H;
        g.put(bWe2.hashCode(), (Object)new cip_0(bWe2, aPw2, aPw3, aPr2));
    }

    public static void onAutoRunModeChanged(fcf_2 fcf_22) {
        blu_1 blu_12 = (blu_1)fcf_22.l();
        bWe bWe2 = bWe.am;
        g.put(bWe2.hashCode(), (Object)new cIq(bWe2, blu_12));
    }

    public static void setDisplayParallax(fcp_2 fcp_22) {
        boolean bl;
        aPr aPr2 = aPr.a();
        boolean bl2 = aPr2.c();
        if (bl2 == (bl = fcp_22.j())) {
            return;
        }
        aPr2.b(bl);
        bWe bWe2 = bWe.J;
        g.put(bWe2.hashCode(), (Object)new cir_0(bWe2, bl, bl2, aPr2));
    }

    public static void setDisplayExternalCells(fcp_2 fcp_22) {
        boolean bl;
        aPr aPr2 = aPr.a();
        boolean bl2 = aPr2.b();
        if (bl2 == (bl = fcp_22.j())) {
            return;
        }
        aPr2.a(bl);
        bWe bWe2 = bWe.K;
        g.put(bWe2.hashCode(), (Object)new cis_0(bWe2, bl, bl2, aPr2));
    }

    public static void setSpellBarCompactMode(fcp_2 fcp_22) {
        boolean bl = fcp_22.j();
        bWe bWe2 = bWe.aK;
        g.put(bWe2.hashCode(), (Object)new cIt(bWe2, bl));
    }

    public static void setMaskWorld(fcp_2 fcp_22) {
        bWe bWe2 = bWe.r;
        int n = bWe2.hashCode();
        boolean bl = fcp_22.j();
        AlphaMaskCommand.a(bl);
        g.put(bWe2.hashCode(), (Object)new civ_0(bWe2, bl));
    }

    public static void onDisplayHPBarChanged(fcf_2 fcf_22) {
        bWe bWe2 = bWe.x;
        int n = bWe2.hashCode();
        String string = (String)fcf_22.l();
        bvq_0 bvq_02 = bvq_0.a(string);
        if (bvq_02 == null) {
            return;
        }
        g.put(n, (Object)new ciw_0(bvq_02, bWe2));
    }

    public static void onSpecificEffectAreaDisplayModeChanged(fcf_2 fcf_22) {
        bWe bWe2 = bWe.z;
        int n = bWe2.hashCode();
        String string = (String)fcf_22.l();
        bvu_0 bvu_02 = bvu_0.a(string);
        if (bvu_02 == null) {
            return;
        }
        g.put(n, (Object)new cIx(bWe2, bvu_02));
    }

    public static void onRelicAuraDisplayChanged(fcf_2 fcf_22) {
        bvt_0 bvt_02 = (bvt_0)fcf_22.l();
        int n = bWe.aI.hashCode();
        g.put(n, (Object)new cIy(bvt_02));
    }

    public static void onTitleColorDisplayChanged(fcf_2 fcf_22) {
        bvv_0 bvv_02 = (bvv_0)fcf_22.l();
        int n = bWe.aJ.hashCode();
        g.put(n, (Object)new cIz(bvv_02));
    }

    public static void setHideFightOccluders(fcp_2 fcp_22) {
        bWe bWe2 = bWe.s;
        int n = bWe2.hashCode();
        boolean bl = fcp_22.j();
        cIi.proceedHideFightOccluders(bl);
        g.put(bWe2.hashCode(), (Object)new cia_0(bWe2, bl));
    }

    public static void setFightersTransparency(fcp_2 fcp_22) {
        bWe bWe2 = bWe.t;
        int n = bWe2.hashCode();
        boolean bl = fcp_22.j();
        cIi.proceedFightersTransparency(bl);
        g.put(bWe2.hashCode(), (Object)new cib_0(bWe2, bl));
    }

    public static void proceedHideFightOccluders(boolean bl) {
        float f2 = bl ? 0.3f : 1.0f;
        int n = HideFightOccluders.a(f2);
        HideFightOccluders.a(n, f2, 1000);
    }

    public static void proceedFightersTransparency(boolean bl) {
        float f2;
        float f3 = f2 = bl ? 0.3f : 1.0f;
        if (azu_0.j().c(cyp_0.g()) || azu_0.j().c(cYX.c)) {
            cuy_0.a(bl);
        }
    }

    public static void setCellSelection(fcp_2 fcp_22) {
        bWe bWe2 = bWe.C;
        int n = bWe2.hashCode();
        boolean bl = fcp_22.j();
        g.put(n, (Object)new cIC(bWe2, bl));
    }

    public static void setFollowedQuestAutoDisplay(fcp_2 fcp_22) {
        bWe bWe2 = bWe.u;
        int n = bWe2.hashCode();
        boolean bl = fcp_22.j();
        g.put(n, (Object)new cid_0(bWe2, bl));
    }

    public static void displayRangeOnOver(fcp_2 fcp_22) {
        bWe bWe2 = bWe.v;
        int n = bWe2.hashCode();
        boolean bl = fcp_22.j();
        g.put(bWe2.hashCode(), (Object)new cIE(bWe2, bl));
    }

    public static void activateShaders(fcp_2 fcp_22) {
        if (cIi.b(fcp_22.j())) {
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.o, bWd.a.a());
        }
    }

    private static boolean b(boolean bl) {
        if (!axy_2.b.a()) {
            return false;
        }
        bWe bWe2 = bWe.p;
        boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe2);
        if (bl2 == bl) {
            return false;
        }
        cIi.a(bl);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, bl);
        g.put(bWe2.hashCode(), (Object)new cig_0(bl2, bWe2));
        return true;
    }

    protected static void a(boolean bl) {
        acs_0 acs_02;
        aui_1.a().a(bl);
        aed.a.d();
        afz_0.d().a();
        bNT.f().a();
        abe_0.d().a();
        ahs.d().a();
        aNF aNF2 = (aNF)ans_0.D().c();
        if (aNF2 != null && (acs_02 = aNF2.n()) != null) {
            acs_02.f();
        }
    }

    public static void activateMeteoEffect(fcp_2 fcp_22) {
        if (cIi.c(fcp_22.j())) {
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.o, bWd.a.a());
        }
    }

    private static boolean c(boolean bl) {
        bWe bWe2 = bWe.q;
        boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe2);
        if (bl2 == bl) {
            return false;
        }
        cbt_1.a.b(bl);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, bl);
        g.put(bWe2.hashCode(), (Object)new cih_0(bl2, bWe2));
        return true;
    }

    public static void activateFixedCamera(fcp_2 fcp_22) {
        if (cIi.activateFixedCamera(fcp_22.j())) {
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.o, bWd.a.a());
        }
    }

    public static boolean activateFixedCamera(boolean bl) {
        bWe bWe2 = bWe.A;
        boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe2);
        if (bl2 == bl) {
            return false;
        }
        ans_0.D().c().i(bl);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, bl);
        g.put(bWe2.hashCode(), (Object)new cii_0(bl2, bWe2));
        return true;
    }

    public static void setFpsBackgroundCapDisabled(fcp_2 fcp_22) {
        if (cIi.setFpsBackgroundCapDisabled(fcp_22.j())) {
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.o, bWd.a.a());
        }
    }

    public static boolean setFpsBackgroundCapDisabled(boolean bl) {
        bWe bWe2 = bWe.B;
        boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe2);
        if (bl2 == bl) {
            return false;
        }
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, bl);
        azu_2.c = bl;
        return true;
    }

    public static void clickOnBindTextEditor(fck_2 fck_22) {
        c = true;
    }

    public static void bindKey(fcb_2 fcb_22) {
        if (c) {
            return;
        }
        cIi.bindKey((aZF)fcb_22.j(), 17401);
    }

    public static void bindKey(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        if (string == null || string.isEmpty()) {
            fpm_0.b().a(bae.h().a("notification.emptyField", new Object[0]), cfn_0.a(1), 4099L, 102, 1);
            return;
        }
        any_1 any_12 = aZH.a().c(string);
        cIi.bindKey(new aZF(any_12), 16755);
    }

    public static void bindKey(aZF aZF2, int n) {
        dhd_0 dhd_02 = new dhd_0(aZF2);
        dhd_02.a_(n);
        add_2.b().a(dhd_02);
    }

    public static void selectCurrentBind(fcf_2 fcf_22, fug_0 fug_02) {
        aZF aZF2 = (aZF)fcf_22.j().getItemValue();
        fug_02.c(aZF2.i());
        aZH.a().a(aZF2);
    }

    public static void changeBindText(fzs fzs2, fug_0 fug_02, aZF aZF2) {
        String string = fug_02.getText();
        if (string == null || string.isEmpty()) {
            fpm_0.b().a(bae.h().a("notification.emptyField", new Object[0]), cfn_0.a(1), 4099L, 102, 1);
            return;
        }
        if (!string.equals(aZF2.i())) {
            dhd_0 dhd_02 = new dhd_0(aZF2);
            dhd_02.a(string);
            dhd_02.a_(16777);
            add_2.b().a(dhd_02);
        }
    }

    public static void activateBindTextEdition(fzs fzs2) {
        fup_0 fup_02 = (fup_0)fzs2.d();
        if (fup_02.getSelected()) {
            aZH.a().a(false);
        } else {
            aZH.a().a(true);
        }
    }

    public static void deleteCurrentBind(fzs fzs2) {
        dfc.d((short)19924);
    }

    public static void onShortcutOver(fcb_2 fcb_22) {
        fis_1.a().a("shortcutOver", fcb_22.j());
    }

    public static void onShortcutOut(fcb_2 fcb_22) {
        fis_1.a().a("shortcutOver", (Object)null);
    }

    public static void restore(fzs fzs2) {
        dfc.d((short)18525);
    }

    public static void setInteractionOnLeftClick(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.M);
    }

    public static void setDefaultSplitMode(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.P);
    }

    public static void setOverHeadDelay(fzs fzs2) {
        if (fzs2 != null && fzs2 instanceof fcq_1) {
            bWe bWe2 = bWe.Q;
            g.put(bWe2.hashCode(), (Object)new cIJ(fzs2, bWe2));
        }
    }

    public static void setAutoSwitchBarsMode(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.S);
    }

    public static void setEmoteIconsActivated(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.X);
    }

    public static void setTipsActivated(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.Z);
    }

    public static void setBattlegroundNotificationActivated(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.aa);
    }

    public static void setShowPvpExtractionActivation(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.aS);
    }

    public static void setAddSeedsToShortcutBar(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.al);
    }

    public static void setChatAutomaticDisactivation(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.V);
    }

    public static void setChatLockFade(fcp_2 fcp_22) {
        bWe bWe2 = bWe.L;
        int n = bWe2.hashCode();
        boolean bl = fcp_22.j();
        cIi.d(bl);
        g.put(bWe2.hashCode(), (Object)new cik_0(bWe2, bl));
    }

    public static void setChatTime(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.ad);
        aUxx.a().s();
    }

    public static void setChatAutoChangeChannel(fcp_2 fcp_22) {
        cIi.a(fcp_22.j(), bWe.ae);
    }

    static void d(boolean bl) {
        Object object = aUxx.a().h();
        while (object.hasNext()) {
            object.advance();
            int n = ((aUv)object.value()).a();
            if (bl) {
                aUh.c(n, true);
                continue;
            }
            aUh.b(n, true);
        }
        object = new dfc();
        ((anw_1)object).a_(18946);
        ((anw_1)object).a(!bl);
        add_2.b().a((adt_1)object);
    }

    public static void setFontSize(fcq_1 fcq_12) {
        bWe bWe2 = bWe.W;
        int n = (int)fcq_12.j();
        if (e == -1) {
            e = ((bvx_0)ans_0.D().h()).d(bWe2);
        }
        cIi.a(n);
        g.put(bWe2.hashCode(), (Object)new cIL());
    }

    static void a(int n) {
        bWe bWe2 = bWe.W;
        aUz aUz2 = aUz.values()[n];
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe2, aUz2.ordinal());
        fis_1.a().a((ajf_1)aUxx.a(), "chatTextStyle");
        ajg_1.a().a((ajf_1)ans_0.D().h(), bWe2.b());
        for (aUr aUr2 : aUxx.a().n()) {
            fis_1.a().a((ajf_1)aUr2, "history");
        }
    }

    public static void setViewedLanguage(fcp_2 fcp_22, String string) {
        bWe bWe2;
        if (fis_1.a().c("isClientLanguageRestricted")) {
            return;
        }
        switch (Ow.a(string, true)) {
            case a: {
                bWe2 = bWe.aL;
                break;
            }
            case b: {
                bWe2 = bWe.aM;
                break;
            }
            case c: {
                bWe2 = bWe.aN;
                break;
            }
            case d: {
                bWe2 = bWe.aO;
                break;
            }
            default: {
                return;
            }
        }
        cIi.a(fcp_22.j(), bWe2);
        f = true;
    }

    public static void onLanguageDisplayModeChange(fcf_2 fcf_22) {
        bWe bWe2 = bWe.aQ;
        bvs_0 bvs_02 = bvs_0.a(((bvx_0)ans_0.D().h()).d(bWe2));
        bvs_0 bvs_03 = (bvs_0)fcf_22.l();
        if (bvs_02 == null || bvs_03 == null || bvs_02 == bvs_03) {
            return;
        }
        g.put(bWe2.hashCode(), (Object)new cim_0(bWe2, bvs_03, bvs_02));
    }

    private static void a(boolean bl, bWe bWe2) {
        int n = bWe2.hashCode();
        g.put(bWe2.hashCode(), (Object)new cIN(bWe2, bl));
    }

    public static void cancel(fzs fzs2) {
        if (g.isEmpty()) {
            cIi.closeOptionsDialog(fzs2);
            return;
        }
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.confirmCloseOptionsWithChanges", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a(new cIO(fzs2));
    }

    public static void cancel() {
        TIntObjectIterator<any_1> tIntObjectIterator = g.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((cIW)tIntObjectIterator.value()).b();
        }
        g.clear();
        tIntObjectIterator = dbA.a().e();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            any_1 any_12 = (any_1)tIntObjectIterator.value();
            any_1 any_13 = aZG.e().a(any_12.g());
            try {
                dbA.a().a(any_12.g(), any_12.b(), any_12.l());
                String string = any_12.m();
                dbA.a().a(any_13, string);
            }
            catch (Exception exception) {
                b.error((Object)"Exception during cancel", (Throwable)exception);
            }
        }
        f = false;
    }

    public static void apply(fzs fzs2) {
        Object object = g.iterator();
        while (object.hasNext()) {
            object.advance();
            ((cIW)object.value()).a();
        }
        g.clear();
        if (d) {
            object = dbA.a().c();
            ((dhm_0)object).a((Object)((dhm_0)object).a(), ((dhm_0)object).b(), ((dhm_0)object).c());
            d = false;
        }
        if (f) {
            dfc.d((short)16339);
            f = false;
        }
        cIi.closeOptionsDialog(fzs2);
    }

    public static void setBindText(fzs fzs2, fug_0 fug_02, aZF aZF2) {
        if (fzs2 instanceof fcz_1 && ((fcz_1)fzs2).j()) {
            c = true;
            return;
        }
        if (fzs2 instanceof fcz_1 && !((fcz_1)fzs2).j() || fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() == 10) {
            String string = fug_02.getText();
            if (string == null) {
                fpm_0.b().a(bae.h().a("notification.emptyField", new Object[0]), cfn_0.a(1), 4099L, 102, 1);
                return;
            }
            if (!string.equals(aZF2.i())) {
                dhd_0 dhd_02 = new dhd_0(aZF2);
                dhd_02.a(string);
                dhd_02.a_(16777);
                add_2.b().a(dhd_02);
            }
            c = false;
        }
    }

    public static void reloadTheme(fck_2 fck_22) {
        dfc.d((short)17835);
    }

    public static void refreshCustomThemeList(fck_2 fck_22) {
        dfc.d((short)17667);
    }

    public static void openThemeFolder(fck_2 fck_22) {
        if (gi_0.p(WakfuClient.a.l())) {
            return;
        }
        String string = WakfuClient.a.a();
        gi_0.p(string);
    }

    public static void openSelectedThemeFolder(fck_2 fck_22) {
        fje_1 fje_12;
        fit_1 fit_12 = fis_1.a().f("selectedTheme");
        fje_1 fje_13 = fje_12 = fit_12 != null && fit_12.f() instanceof fje_1 ? (fje_1)fit_12.f() : null;
        if (fje_12 == null) {
            b.info((Object)"selectedTheme is null ");
            return;
        }
        if (fje_12.a() == null) {
            cIi.openThemeFolder(fck_22);
            return;
        }
        gi_0.p(WakfuClient.a.l() + "/" + fje_12.a());
    }

    static {
        e = -1;
        f = false;
        g = new TIntObjectHashMap();
        h = -1;
        i = null;
    }
}

