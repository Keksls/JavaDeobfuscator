/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cHs
 */
@fpw_0
public class chs_0 {
    protected static final Logger a = Logger.getLogger(chs_0.class);
    public static final String PACKAGE = "wakfu.heroBuild";

    public static void toggleBuildReduction(fck_2 fck_22) {
        dfc dfc2 = new dfc(18077);
        add_2.b().a(dfc2);
    }

    public static void unloadDialog(fzs fzs2) {
        add_2.b().a(new dfc(18991));
    }

    private static void a(exk_2 exk_22) {
        if (exk_22.aQ_()) {
            dgO<bMi> dgO2 = new dgO<bMi>(new bMi(exk_22));
            dgO2.a_(18765);
            dgO2.b("heroBuildDialog");
            add_2.b().a(dgO2);
        } else {
            cfq_0.sendOpenCloseItemDetailMessage("heroBuildDialog", exk_22);
        }
    }

    public static void changeBuildTab(fcp_2 fcp_22) {
        if (!fcp_22.j() || !(fcp_22.e() instanceof ftI)) {
            return;
        }
        try {
            int n = Integer.parseInt(((ftI)fcp_22.e()).getValue()) - 1;
            if (n < 0) {
                return;
            }
            dfc dfc2 = new dfc(16923);
            dfc2.b(n);
            add_2.b().a(dfc2);
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Invalid tab value: " + ((ftI)fcp_22.e()).getValue()));
        }
    }

    public static void openCreateBuildDialog(fck_2 fck_22) {
        dfc dfc2 = new dfc(18649);
        add_2.b().a(dfc2);
    }

    public static void addNewBuildSheet(fzs fzs2, fuh_0 fuh_02, fsk fsk2, fsQ fsQ2, bzy_2 bzy_22) {
        blb_0 blb_02 = (blb_0)fsk2.getSelectedValue();
        if (blb_02 == null) {
            return;
        }
        if (bzy_22 == null) {
            return;
        }
        bla_0 bla_02 = (bla_0)fsQ2.getSelectedValue();
        int n = bla_02 == null ? ezp_1.b() : bla_02.a();
        String string = fuh_02.getText();
        String string2 = string == null || string.isBlank() ? cZI.d(blb_02.a()) : string;
        dfk dfk2 = new dfk(ezn_1.a(string2), blb_02.a(), n, bzy_22.i());
        add_2.b().a(dfk2);
        fpm_0.b().o("createBuildDialog");
    }

    public static void selectBuildSheet(fcf_2 fcf_22) {
        if (!fcf_22.k()) {
            return;
        }
        if (!(fcf_22.l() instanceof ble_0)) {
            return;
        }
        dfc dfc2 = new dfc(18529);
        dfc2.a(fcf_22.l());
        add_2.b().a(dfc2);
    }

    public static void activateBuildSheet(fck_2 fck_22, ble_0 ble_02) {
        dfc dfc2 = new dfc(19700);
        dfc2.a(ble_02);
        add_2.b().a(dfc2);
    }

    public static void activateBuildSheet(fck_2 fck_22) {
        dfc dfc2 = new dfc(19700);
        dfc2.a((Object)null);
        add_2.b().a(dfc2);
    }

    public static void saveBuildChanges(fzs fzs2) {
        add_2.b().a(new dfc(16954));
    }

    public static void discardBuildChanges(fzs fzs2) {
        add_2.b().a(new dfc(19616));
    }

    public static void deleteBuildSheet(fck_2 fck_22) {
        dfc dfc2 = new dfc(17577);
        add_2.b().a(dfc2);
    }

    public static void overBuild(fcb_2 fcb_22, bld_0 bld_02) {
        Object object = fcb_22.j();
        if (!(object instanceof ble_0)) {
            return;
        }
        ble_0 ble_02 = (ble_0)object;
        bld_02.a((byte)ble_02.c());
        fis_1.a().a((ajf_1)bld_02, "currentOverBuildSheet");
    }

    public static void outBuild(fcb_2 fcb_22, bld_0 bld_02) {
        bld_02.a((byte)-2);
        fis_1.a().a((ajf_1)bld_02, "currentOverBuildSheet");
    }

    public static void searchBuildsList(fzs fzs2, fuh_0 fuh_02) {
        dfc dfc2 = new dfc(18219);
        dfc2.a(fuh_02.getText());
        add_2.b().a(dfc2);
    }

    public static void togglePermanentBuildVisibility(fcp_2 fcp_22) {
        dfc dfc2 = new dfc(16651);
        dfc2.a(fcp_22.j());
        add_2.b().a(dfc2);
    }

    public static void sortBuildsListBy(fzs fzs2, String string) {
        bzn_2 bzn_22 = bzn_2.a(string);
        if (bzn_22 == null) {
            return;
        }
        dfc dfc2 = new dfc(17269);
        dfc2.a((Object)bzn_22);
        add_2.b().a(dfc2);
    }

    public static void onDropBuild(fcv_2 fcv_22) {
        if (!(fcv_22.m() instanceof ble_0)) {
            return;
        }
        if (!(fcv_22.l() instanceof ble_0)) {
            return;
        }
        if (((ble_0)fcv_22.m()).c() == 0) {
            return;
        }
        int n = fcv_22.o();
        ble_0 ble_02 = (ble_0)fcv_22.l();
        dfm dfm2 = new dfm(n, ble_02);
        add_2.b().a(dfm2);
    }

    public static void openEditBuildDialog(fzs fzs2) {
        dfc dfc2 = new dfc(17975);
        add_2.b().a(dfc2);
    }

    public static void openSaveBuildAsDialog(fzs fzs2) {
        dfc dfc2 = new dfc(17445);
        add_2.b().a(dfc2);
    }

    public static void openCopyBuildToDialog(fzs fzs2) {
        dfc dfc2 = new dfc(17416);
        dfc2.a(true);
        add_2.b().a(dfc2);
    }

    public static void openCopyBuildFromDialog(fzs fzs2) {
        dfc dfc2 = new dfc(17416);
        dfc2.a(false);
        add_2.b().a(dfc2);
    }

    public static void changePartsToCopy(fzs fzs2, fup_0 fup_02, fup_0 fup_03, fup_0 fup_04) {
        dfl dfl2 = new dfl(fup_02.getSelected(), fup_03.getSelected(), fup_04.getSelected());
        add_2.b().a(dfl2);
    }

    public static void searchBuildsForCopy(fzs fzs2, fuh_0 fuh_02) {
        dfc dfc2 = new dfc(18428);
        dfc2.a(fuh_02.getText());
        add_2.b().a(dfc2);
    }

    public static void filterBuildsForCopyListBySameLevel(fck_2 fck_22, fup_0 fup_02) {
        dfc dfc2 = new dfc(19204);
        dfc2.a(fup_02.getSelected());
        add_2.b().a(dfc2);
    }

    public static void toggleAutoCleanBuildOnCopy(fzs fzs2, fup_0 fup_02) {
        dfc dfc2 = new dfc(17457);
        dfc2.a(fup_02.getSelected());
        add_2.b().a(dfc2);
    }

    public static void selectBuildForCopy(fcf_2 fcf_22) {
        if (!fcf_22.k()) {
            return;
        }
        if (!(fcf_22.l() instanceof bzk_1)) {
            return;
        }
        dfc dfc2 = new dfc(17555);
        dfc2.a(((bzk_1)fcf_22.l()).a());
        add_2.b().a(dfc2);
    }

    public static void copyBuild(fzs fzs2) {
        dfc dfc2 = new dfc(19711);
        add_2.b().a(dfc2);
    }

    public static void clickOnEquipmentSlot(fck_2 fck_22, bja_1 bja_12) {
        if (aUi.a(fck_22)) {
            aUi.a(bja_12);
            return;
        }
        if (fck_22.x() == 1) {
            dfc dfc2 = new dfc(19757);
            exk_2 exk_22 = bja_12.h();
            fis_1.a().a("itemDetail", (Object)exk_22, "heroBuildDialog");
            fis_1.a().a("pet", exk_22 != null && exk_22.aQ_() ? new bMi(exk_22) : null, "heroBuildDialog");
            dfc2.a(bja_12);
            add_2.b().a(dfc2);
        } else if (fck_22.x() == 3) {
            if (bja_12.h() == null) {
                return;
            }
            chs_0.a(bja_12.h());
        }
    }

    public static void unselectEquipmentSlot(fck_2 fck_22) {
        dfc dfc2 = new dfc(19757);
        dfc2.a((Object)null);
        add_2.b().a(dfc2);
    }

    public static void clickCategory(fck_2 fck_22, bzr_2 bzr_22) {
        dfc dfc2 = new dfc(16715);
        dfc2.a(bzr_22);
        add_2.b().a(dfc2);
    }

    public static void onDragItem(fcp_1 fcp_12) {
        exk_2 exk_22;
        if (fcp_12.l() instanceof exk_2) {
            exk_22 = (exk_2)fcp_12.l();
        } else if (fcp_12.l() instanceof bja_1) {
            exk_22 = ((bja_1)fcp_12.l()).h();
        } else {
            return;
        }
        cZI.a().c(exk_22);
    }

    public static void onDropOutItemFromInventory(fzs fzs2) {
        cZI.a().v();
    }

    public static void itemDroppedOnSlot(fcv_2 fcv_22, bja_1 bja_12) {
        cZI.a().v();
        Object object = fcv_22.n();
        if (!(object instanceof exk_2)) {
            return;
        }
        dfj dfj2 = new dfj((exk_2)object, bja_12.a());
        add_2.b().a(dfj2);
    }

    public static void clickOnItem(fcb_2 fcb_22) {
        Object object = fcb_22.j();
        if (!(object instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)object;
        if (aUi.a(fcb_22)) {
            aUi.a((eAM)exk_22);
        } else if (fcb_22.x() == 3) {
            chs_0.a(exk_22);
        }
        if (fcb_22.x() == 1) {
            fis_1.a().a("itemDetail", (Object)exk_22, "heroBuildDialog");
            fis_1.a().a("pet", (Object)(exk_22.aQ_() ? new bMi(exk_22) : null), "heroBuildDialog");
        }
    }

    public static void doubleClickOnItem(fcb_2 fcb_22) {
        if (fcb_22.x() != 1) {
            return;
        }
        Object object = fcb_22.j();
        if (!(object instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)object;
        if (fcb_22.r()) {
            chs_0.removeEquipmentFromAllBuilds(fcb_22, exk_22);
            return;
        }
        if (exk_22.T().ag() && !exk_22.ak()) {
            dcB dcB2 = dcB.a();
            dcB2.a(exk_22);
            azu_0.j().a(dcB2);
            return;
        }
        if (exk_22.ah() || exk_22.ai()) {
            dfc dfc2 = new dfc(16321);
            dfc2.a(exk_22.a());
            add_2.b().a(dfc2);
            cgo_0.addRollElementsParticleToContainer((ftj_0)fcb_22.e());
            return;
        }
        if (exk_22.e() > 1) {
            dfc dfc3 = new dfc(18127);
            dfc3.a(exk_22);
            add_2.b().a(dfc3);
            return;
        }
        dfj dfj2 = new dfj(exk_22, null);
        add_2.b().a(dfj2);
    }

    public static void unequipItem(fck_2 fck_22, bja_1 bja_12) {
        if (fck_22.x() == 1) {
            chs_0.a(bja_12);
        }
    }

    public static void itemDroppedInInventory(fcv_2 fcv_22) {
        chs_0.a(fcv_22.n());
        cZI.a().v();
    }

    public static void itemDroppedOutOfSlot(fcx_1 fcx_12) {
        chs_0.a(fcx_12.l());
        cZI.a().v();
    }

    private static void a(Object object) {
        if (!(object instanceof bja_1)) {
            return;
        }
        bja_1 bja_12 = (bja_1)object;
        if (bja_12.h() == null) {
            return;
        }
        dfc dfc2 = new dfc(19941);
        dfc2.a(bja_12);
        add_2.b().a(dfc2);
    }

    public static void filterItemsByName(fzs fzs2, fuh_0 fuh_02) {
        String string = fuh_02.getText();
        if (string == null) {
            return;
        }
        dfc dfc2 = new dfc(16937);
        dfc2.a(new bzf_2(string));
        add_2.b().a(dfc2);
    }

    public static void removeItemsFilterByLevel(fzs fzs2) {
        dfc dfc2 = new dfc(16937);
        dfc2.a(bze_1.d());
        add_2.b().a(dfc2);
    }

    public static void filterItemsByBuildLevel(fzs fzs2, String string) {
        dfc dfc2 = new dfc(16850);
        dfc2.a(string.equals(Boolean.TRUE.toString()));
        add_2.b().a(dfc2);
    }

    public static void toggleItemRarityFilter(fcp_2 fcp_22, bLl bLl2) {
        bLl2.a(fcp_22.j());
        dfc dfc2 = new dfc(16997);
        dfc2.a(bLl2);
        add_2.b().a(dfc2);
    }

    public static void sortEquipmentsBy(fzs fzs2, String string) {
        bzh_2 bzh_22 = bzh_2.a(string.toUpperCase());
        if (bzh_22 == null) {
            return;
        }
        dfc dfc2 = new dfc(19975);
        dfc2.a((Object)bzh_22);
        add_2.b().a(dfc2);
    }

    public static void toggleSplitByEquipmentPosition(fcp_2 fcp_22, fup_0 fup_02) {
        dfc dfc2 = new dfc(18789);
        dfc2.a(fup_02.getSelected());
        add_2.b().a(dfc2);
    }

    public static void toggleDisplayOtherHeroesItems(fcp_2 fcp_22, fup_0 fup_02) {
        dfc dfc2 = new dfc(17643);
        dfc2.a(fup_02.getSelected());
        add_2.b().a(dfc2);
    }

    public static void changeActorDirection(fck_2 fck_22, frO frO2) {
        int n = fck_22.x();
        if (n != 1 && n != 3) {
            return;
        }
        int n2 = n == 1 ? -1 : 1;
        chs_0.a(frO2, n2);
    }

    public static void changeActorDirectionOnScroll(fck_2 fck_22, frO frO2) {
        chs_0.a(frO2, fck_22.z());
    }

    private static void a(frO frO2, int n) {
        if (!bqt_1.a.a()) {
            return;
        }
        if (bqt_1.a.b()) {
            frO2.setDirection(aej_2.b.a());
            frO2.setAnimName("AnimEmote-Vomis");
            return;
        }
        aej_2 aej_22 = aej_2.a(frO2.getDirection()).c(n);
        frO2.setDirection(aej_22.l);
    }

    public static void removeEquipmentFromAllBuilds(fzs fzs2, exk_2 exk_22) {
        dfc dfc2 = new dfc(19795);
        dfc2.a(exk_22);
        add_2.b().a(dfc2);
    }

    public static void doubleClickOnSpell(fcb_2 fcb_22) {
        if (fcb_22.x() != 1) {
            return;
        }
        bpl_0 bpl_02 = (bpl_0)fcb_22.j();
        if (cZI.a().I().a() && bpl_02.a((blx_1)cZI.D())) {
            dfc dfc2 = new dfc(18011);
            Optional<bpr_0> optional = cZI.a().a(bpl_02);
            if (optional.isEmpty()) {
                return;
            }
            dfc2.a(optional.get());
            add_2.b().a(dfc2);
        } else {
            dhz dhz2 = new dhz(bpl_02, null);
            add_2.b().a(dhz2);
        }
    }

    public static void spellDrop(fcv_2 fcv_22, bpr_0 bpr_02) {
        bpl_0 bpl_02;
        Object object = fcv_22.n();
        if (object instanceof bpl_0) {
            bpl_02 = (bpl_0)object;
        } else if (object instanceof bpr_0) {
            bpl_02 = ((bpr_0)object).b();
        } else {
            return;
        }
        dhz dhz2 = new dhz(bpl_02, bpr_02);
        add_2.b().a(dhz2);
    }

    public static void spellDropOut(fcx_1 fcx_12) {
        dfc dfc2 = new dfc(18011);
        bpr_0 bpr_02 = (bpr_0)fcx_12.l();
        dfc2.a(bpr_02);
        add_2.b().a(dfc2);
    }

    public static void spellRemove(fcb_2 fcb_22) {
        if (fcb_22.x() != 1) {
            return;
        }
        if (!(fcb_22.j() instanceof bpr_0) || ((bpr_0)fcb_22.j()).b() == null) {
            return;
        }
        dfc dfc2 = new dfc(18011);
        bpr_0 bpr_02 = (bpr_0)fcb_22.j();
        dfc2.a(bpr_02);
        add_2.b().a(dfc2);
    }

    public static void onDeckKeyPress(fcd_2 fcd_22, fuh_0 fuh_02) {
        if (fcd_22.k() != 10) {
            return;
        }
        String string = fuh_02.getText();
        dfc dfc2 = new dfc(17304);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void copyDeckKeyToClipboard(fzs fzs2, fuh_0 fuh_02) {
        ca_0.a(fuh_02.getText());
    }

    public static void pasteKeyDeckAndApply(fzs fzs2, fuh_0 fuh_02) {
        Optional<String> optional = ca_0.a();
        if (optional.isEmpty()) {
            return;
        }
        String string = chs_0.a(fuh_02, optional.get());
        if (string == null) {
            return;
        }
        fuh_02.c(string);
        dfc dfc2 = new dfc(17304);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    private static String a(@NotNull fuh_0 fuh_02, String string) {
        if (fuh_02.getText() == null) {
            return string;
        }
        Pattern pattern = Pattern.compile(fuh_02.getRestrict());
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < string.length(); ++k) {
            String string2 = Character.toString(string.charAt(k));
            if (!pattern.matcher(string2).matches()) continue;
            stringBuilder.append(string2);
        }
        if (stringBuilder.length() <= 0) {
            return null;
        }
        String string3 = stringBuilder.toString();
        int n = fuh_02.getMaxCharacters();
        if (string3.length() > n) {
            return string3.substring(0, n);
        }
        return string3;
    }

    public static void openCloseSpellDescription(fcb_2 fcb_22) {
        cJF.openCloseDescription(fcb_22, "spellPopup");
    }

    public static void clickOnSpell(fcb_2 fcb_22) {
        bpl_0 bpl_02;
        if (fcb_22.x() != 3 && fcb_22.x() != 1) {
            return;
        }
        if (fcb_22.j() instanceof bpl_0) {
            bpl_02 = (bpl_0)fcb_22.j();
        } else if (fcb_22.j() instanceof bpr_0) {
            bpl_02 = ((bpr_0)fcb_22.j()).b();
        } else if (fcb_22.j() instanceof bph_0) {
            bmr_1 bmr_12 = cZI.D() != null ? cZI.D() : azu_0.j().k();
            bpl_02 = new bpl_0((bph_0)fcb_22.j(), 0, -1L, bmr_12);
        } else {
            return;
        }
        if (bpl_02 == null) {
            return;
        }
        short s2 = cZI.G();
        bpl_0 bpl_03 = bpl_02.a(false);
        bpl_03.c(s2);
        if (fcb_22.x() == 1) {
            fis_1.a().a("editableDescribedSpell", (Object)bpl_03, "heroBuildDialog");
            fis_1.a().a("describedSpellRealLevel", (Object)s2, "heroBuildDialog");
            return;
        }
        dhb_0 dhb_02 = new dhb_0();
        dhb_02.a(bpl_03);
        dhb_02.c(3);
        dhb_02.a("heroBuildDialog");
        dhb_02.a_(18677);
        add_2.b().a(dhb_02);
    }

    public static void showHideState(fzs fzs2, fvE fvE2, fil_1 fil_12, bpe_0 bpe_02) {
        if (fzs2.f() == frd_0.C) {
            bpl_0 bpl_02;
            dgo_0 dgo_02 = new dgo_0();
            dgo_02.a(bpe_02);
            if (fvE2.getElementMap() != null && (bpl_02 = (bpl_0)fis_1.a().d("editableDescribedSpell", fvE2.getElementMap().c())) != null) {
                dgo_02.b(((bph_0)bpl_02.r()).i());
            }
            dgo_02.a(fvE2.getElementMap().c());
            add_2.b().a(dgo_02);
        } else {
            fis_1.a().a("describedState", bpe_02);
            fpu_0.popup(fil_12, fvE2);
            fvE2.addEventListener(frd_0.G, new cHt(fvE2), true);
        }
    }

    public static void increaseAptitudeLevel(fck_2 fck_22, bkx_2 bkx_22) {
        chs_0.a(fck_22, bkx_22, true);
    }

    public static void decreaseAptitudeLevel(fck_2 fck_22, bkx_2 bkx_22) {
        chs_0.a(fck_22, bkx_22, false);
    }

    public static void setAptitudeLevel(fzs fzs2, bkx_2 bkx_22, fuh_0 fuh_02) {
        int n;
        if (fzs2 instanceof fcz_1 && ((fcz_1)fzs2).j()) {
            return;
        }
        short s2 = bkx_22.b();
        try {
            n = fuh_02.getText().isBlank() ? 0 : Integer.parseInt(fuh_02.getText());
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("[Build] Cannot parse " + fuh_02.getText() + " into number"), (Throwable)numberFormatException);
            return;
        }
        dfi_0 dfi_02 = new dfi_0(bkx_22, n - s2);
        add_2.b().a(dfi_02);
    }

    private static void a(fck_2 fck_22, bkx_2 bkx_22, boolean bl) {
        dfi_0 dfi_02 = new dfi_0(bkx_22, chs_0.b(fck_22, bkx_22, bl));
        add_2.b().a(dfi_02);
    }

    private static int b(fck_2 fck_22, bkx_2 bkx_22, boolean bl) {
        if (fck_22.r()) {
            return bl ? bkx_22.a(cZI.H()) : (int)(-bkx_22.b());
        }
        if (fck_22.t()) {
            return bl ? 10 : -10;
        }
        return bl ? 1 : -1;
    }

    public static void overAptitude(fcb_2 fcb_22) {
        chs_0.overAptitude(fcb_22, (ajf_1)fcb_22.j());
    }

    public static void overAptitude(fzs fzs2, ajf_1 ajf_12) {
        fis_1.a().a("describedAptitude", ajf_12);
    }

    public static void onAptitudeCodeUpdate(fcd_2 fcd_22, fuh_0 fuh_02) {
        if (fcd_22.k() != 10) {
            return;
        }
        String string = fuh_02.getText();
        dfc dfc2 = new dfc(16001);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void copyAptitudeCodeToClipboard(fzs fzs2, fuh_0 fuh_02) {
        ca_0.a(fuh_02.getText());
    }

    public static void pasteAptitudeCodeAndApply(fzs fzs2, fuh_0 fuh_02) {
        Optional<String> optional = ca_0.a();
        if (optional.isEmpty()) {
            return;
        }
        fuh_02.c(bkp_2.b(optional.get()));
        dfc dfc2 = new dfc(16001);
        dfc2.a(optional.get());
        add_2.b().a(dfc2);
    }

    public static void resetCurrentAptitudeSheet(fzs fzs2) {
        add_2.b().a(new dfc(18473));
    }
}

