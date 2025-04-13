/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.commonIn.MapCommand;
import com.ankamagames.wakfu.client.console.command.world.EnterLeaveDimensionalBagCommand;
import org.apache.log4j.Logger;

/*
 * Renamed from cGq
 */
@fpw_0
public class cgq_0 {
    public static final String PACKAGE = "wakfu.controlCenter";
    private static final Logger a = Logger.getLogger(cgq_0.class);
    private static int b = 0;

    public static void openCloseShortcutBar(fzs fzs2) {
        dfc.d((short)18065);
    }

    public static void openCloseStateBar(fzs fzs2) {
        dfc.d((short)16573);
    }

    public static void openCloseEventsCalendarDialog(fzs fzs2) {
        if (azu_0.j().c(cYA.a())) {
            azu_0.j().b(cYA.a());
        } else {
            azu_0.j().a(cYA.a());
        }
    }

    public static void setMode(fzs fzs2, String string) {
        fis_1.a().a("controlCenterDisplayMode", (Object)string);
    }

    public static void dropCommand(fzs fzs2, String string) {
        if (fzs2 instanceof fcv_2) {
            fcv_2 fcv_22 = (fcv_2)fzs2;
        }
    }

    public static void openInventory(fzs fzs2) {
        if (azu_0.j().c(cyt_0.a())) {
            azu_0.j().b(cyt_0.a());
        } else {
            cyt_0.a().g();
        }
    }

    public static void openCharacterSheet(fzs fzs2) {
        cwu_0 cwu_02 = cwu_0.h();
        if (!azu_0.j().c(cwu_02)) {
            azu_0.j().a(cwu_02);
        } else {
            azu_0.j().b(cwu_02);
        }
    }

    public static void openSpellsPage(fzs fzs2) {
        det.a(1);
    }

    public static void openBuildSheetSet(fzs fzs2) {
        det.a(0);
    }

    public static void openCloseGuildManagement(fzs fzs2) {
        if (!azu_0.j().c(cZu.a())) {
            azu_0.j().a(cZu.a());
        } else {
            azu_0.j().b(cZu.a());
        }
    }

    public static void openCloseDimensionBagRoomManager(fzs fzs2) {
        if (!azu_0.j().c(cXQ.d())) {
            azu_0.j().a(cXQ.d());
        } else {
            azu_0.j().b(cXQ.d());
        }
    }

    public static void openCloseMiniMap(fzs fzs2) {
        throw new UnsupportedOperationException("il n'y a plus de minimap.");
    }

    public static void openCloseGlobalMap(fzs fzs2) {
        MapCommand.b();
    }

    public static void openCloseCraftDialog(fzs fzs2) {
        if (!azu_0.j().c(cxa_0.a())) {
            azu_0.j().a(cxa_0.a());
        } else {
            azu_0.j().b(cxa_0.a());
        }
    }

    public static void openOptionsDialog(fzs fzs2) {
        dfc.d((short)18197);
    }

    public static void cycleProgressBarDisplayMode(fzs fzs2, ftF ftF2) {
        cgq_0.a(ftF2, false);
    }

    public static void cycleProgressBarDisplayModeFull(fzs fzs2, ftF ftF2) {
        cgq_0.a(ftF2, true);
    }

    private static void a(ftF ftF2, boolean bl) {
        fqz_0 fqz_02;
        int n = ftF2.getDisplayValue().ordinal();
        fqz_0[] fqz_0Array = fqz_0.values();
        do {
            fqz_02 = fqz_0Array[(n + 1) % fqz_0Array.length];
            ++n;
        } while (!bl && fqz_02 == fqz_0.b);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.O, fqz_02.ordinal());
        cdw_0.n().c(600004L);
    }

    public static void clickHp(fck_2 fck_22, ftF ftF2) {
        if (fck_22.x() == 1) {
            cgq_0.a(ftF2, true);
        }
    }

    public static void openCloseSmallWeatherDialog(fzs fzs2) {
        if (azu_0.j().c(ddm_0.a())) {
            azu_0.j().b(ddm_0.a());
        } else {
            azu_0.j().a(ddm_0.a());
        }
    }

    public static void openCloseWeatherDialog(fzs fzs2) {
        if (azu_0.j().c(ddK.a())) {
            azu_0.j().b(ddK.a());
        } else {
            azu_0.j().a(ddK.a());
        }
    }

    public static void openCloseEcosystemEquilibriumDialog(fzs fzs2) {
        if (azu_0.j().c(cyl_0.a())) {
            azu_0.j().b(cyl_0.a());
        } else {
            azu_0.j().a(cyl_0.a());
        }
    }

    public static void openAchievementsDialog(fzs fzs2, biw_2 biw_22) {
        boolean bl = biz_2.a.e(azu_0.j().k().a_(), biw_22.i());
        cVh.e().a(bl, biw_22);
    }

    public static void openCloseAchievementsDialog(fzs fzs2) {
        cVh.e().b(false);
    }

    public static void openCloseQuestsDialog(fzs fzs2) {
        cVh.e().b(true);
    }

    public static void openCloseProtectorView(fzs fzs2) {
        if (!azu_0.j().c(dcq_0.a())) {
            azu_0.j().a(dcq_0.a());
        } else {
            azu_0.j().b(dcq_0.a());
        }
    }

    public static void openClosePassport(fzs fzs2) {
        if (!azu_0.j().c(dbr_0.a())) {
            azu_0.j().a(dbr_0.a());
        } else {
            azu_0.j().b(dbr_0.a());
        }
    }

    public static void openCloseCitizen(fzs fzs2) {
        if (!azu_0.j().c(dbd.a())) {
            azu_0.j().a(dbd.a());
        } else {
            azu_0.j().b(dbd.a());
        }
    }

    public static void onMiniMapItemOver(fci_2 fci_22) {
        cxu_0.a().a(fci_22);
    }

    public static void onMiniMapItemOut(fci_2 fci_22) {
        fta_0.getInstance().getPopupContainer().b();
    }

    public static void openRunningEffectDescription(fcb_2 fcb_22) {
        bPb bPb2 = (bPb)fcb_22.j();
        if (bPb2 == null) {
            return;
        }
        bPb bPb3 = bPb2.h();
        String string = "runningEffectDetailDialog" + bPb2.c().aS_();
        if (fpm_0.b().q(string)) {
            fpm_0.b().o(string);
        } else {
            fpm_0.b().a(string, cfi_0.a("runningEffectDetailDialog"), 16L, (short)10000);
            fis_1.a().a("describedRunningEffect", (Object)bPb3, string);
        }
    }

    public static void openCloseOsamodasSymbiotDialog(fzs fzs2) {
        dfc.d((short)19168);
    }

    public static void openCloseDimensionalBag(fzs fzs2) {
        EnterLeaveDimensionalBagCommand.b();
    }

    public static void openCloseDungeonListDialog(fzs fzs2) {
        if (azu_0.j().c(cYb.a())) {
            azu_0.j().b(cYb.a());
        } else {
            azu_0.j().a(cYb.a());
        }
    }

    public static void openCloseBattlegroundListDialog(fzs fzs2) {
        if (azu_0.j().c(cwg_0.a())) {
            azu_0.j().b(cwg_0.a());
        } else {
            azu_0.j().a(cwg_0.a());
        }
    }

    public static void openCloseRewardsDialog(fzs fzs2) {
        if (azu_0.j().c(dct.a())) {
            azu_0.j().b(dct.a());
        } else {
            azu_0.j().a(dct.a());
        }
    }

    public static void openCloseGuideListDialog(fzs fzs2) {
        if (azu_0.j().c(czj_0.a())) {
            azu_0.j().b(czj_0.a());
        } else {
            azu_0.j().a(czj_0.a());
        }
    }

    public static void openHavenWorldCatalog(fzs fzs2) {
    }

    public static void leaveInstance(fzs fzs2) {
        if (fis_1.a().c("isInHavenWorld")) {
            cne_0 cne_02 = new cne_0();
            azu_0.j().K().c(cne_02);
            if (fpm_0.b().q("furnitureListDialog")) {
                fpm_0.b().o("furnitureListDialog");
            }
        } else if (fis_1.a().c("isInBattleground")) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12.dn()) {
                aUh.a("error.cantLeaveBGDuringSpectate", new Object[0]);
                return;
            }
            cqu cqu2 = new cqu();
            azu_0.j().K().c(cqu2);
        }
    }

    public static void openCompanionsManagement(fzs fzs2) {
        if (!euu_2.b()) {
            return;
        }
        if (azu_0.j().c(cxq_0.a)) {
            azu_0.j().b(cxq_0.a);
        } else {
            azu_0.j().a(cxq_0.a);
        }
    }

    public static void openStasisDungeon(fzs fzs2) {
        if (azu_0.j().c(dde_0.a())) {
            azu_0.j().b(dde_0.a());
        } else {
            dde_0.a().c();
        }
    }

    public static void openCloseFurnitureDialog(fzs fzs2) {
        czh_0 czh_02 = czh_0.a();
        if (!azu_0.j().c(czh_02)) {
            azu_0.j().a(czh_02);
        } else {
            azu_0.j().b(czh_02);
        }
    }

    public static void showStatePopup(fcb_2 fcb_22, fil_1 fil_12) {
        if (fil_12 == null) {
            return;
        }
        if (fcb_22.j() == null) {
            return;
        }
        cJl.showPopup(fcb_22, fil_12);
    }
}

