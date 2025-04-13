/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import org.apache.commons.lang3.StringUtils;

@fpw_0
public class cHl {
    public static final String PACKAGE = "wakfu.guildManagement";
    private static int a;
    private static byj_2 b;
    private static int c;

    public static void closeDialog(fzs fzs2) {
        azu_0.j().b(cZu.a());
    }

    public static void onRankDropped(fcv_2 fcv_22) {
        Object t = fcv_22.e();
        if (t == null || ((fyb_0)t).getRenderableParent() == null) {
            return;
        }
        dfc dfc2 = new dfc();
        dfc2.a_(17297);
        dfc2.a((short)a);
        dfc2.a(b.h());
        add_2.b().a(dfc2);
        b = null;
        a = -1;
        c = -1;
        fis_1.a().a("draggedGuildRank", (Object)null);
    }

    public static void onRankDragged(fcp_1 fcp_12) {
        Object t = fcp_12.e();
        fsQ fsQ2 = (fsQ)((fyb_0)t).getElementMap().a("rankList");
        b = (byj_2)fcp_12.k();
        c = fsQ2.getOffsetByRenderable(((fyb_0)t).getRenderableParent());
        fis_1.a().a("draggedGuildRank", b);
    }

    public static void onRankDropOut(fcx_1 fcx_12) {
        fsv_0 fsv_02 = fcx_12.j();
        if (fsv_02 == null || fsv_02.getRenderableParent() == null) {
            return;
        }
        fsQ fsQ2 = (fsQ)fsv_02.getElementMap().a("rankList");
        fsQ2.moveValueToIndex(b, c);
        b = null;
        a = -1;
        c = -1;
        fis_1.a().a("draggedGuildRank", (Object)null);
        byp_2.a().c(true);
    }

    public static void onRankDraggedOver(fct_2 fct_22) {
        fsv_0 fsv_02 = fct_22.k();
        if (b == null || fsv_02 == null || fsv_02.getRenderableParent() == null) {
            return;
        }
        fsQ fsQ2 = (fsQ)fsv_02.getElementMap().a("rankList");
        if (fsQ2 == null) {
            return;
        }
        int n = fsQ2.getOffsetByRenderable(fsv_02.getRenderableParent());
        byj_2 byj_22 = (byj_2)fsQ2.getValue(n);
        if (!byj_22.b()) {
            return;
        }
        a = n;
        fsQ2.moveValueToIndex(b, a);
    }

    public static void onMouseEnter(fzs fzs2, fso fso2, byj_2 byj_22) {
        byj_2 byj_23 = (byj_2)fis_1.a().e("draggedGuildRank");
        if (byj_23 != null) {
            return;
        }
        if (!byj_22.b()) {
            return;
        }
        fis_1.a().a("overGuildRank", byj_22);
        byp_2.a().c(true);
    }

    public static void onMouseExit(fzs fzs2, fso fso2, byj_2 byj_22) {
        byj_2 byj_23 = (byj_2)fis_1.a().e("draggedGuildRank");
        if (byj_23 != null) {
            return;
        }
        fis_1.a().a("overGuildRank", (Object)null);
        byp_2.a().c(true);
    }

    public static void switchRank(fcf_2 fcf_22, Long l) {
        if (fcf_22.k()) {
            dgu_0 dgu_02 = new dgu_0(l, ((byj_2)fcf_22.l()).h());
            add_2.b().a(dgu_02);
        }
    }

    public static void addToGuild(fzs fzs2, fug_0 fug_02, fru_0 fru_02) {
        String string = fug_02.getText();
        if (fzs2.f() == frd_0.o && ((fcd_2)fzs2).k() != 10) {
            fru_02.setEnabled(!StringUtils.isEmpty((CharSequence)string));
            return;
        }
        if (!StringUtils.isEmpty((CharSequence)string)) {
            erg_1 erg_12 = byp_2.a().h();
            if (erg_12.n()) {
                String string2 = bae.h().a("notification.guildMaxCountMembersRaisedText", new Object[0]);
                dbo_0.a.a(string2, 4);
            } else {
                fru_02.setEnabled(false);
                dfc dfc2 = new dfc();
                dfc2.a_(19081);
                dfc2.a(string);
                add_2.b().a(dfc2);
                fug_02.c("");
                fyc_0.a().c(null);
            }
        }
    }

    public static void excludeCharacter(fzs fzs2, Long l) {
        dfc dfc2 = new dfc();
        dfc2.a_(19709);
        dfc2.a(l);
        add_2.b().a(dfc2);
    }

    public static void leaveGuild(fzs fzs2) {
        dfc.d(byp_2.a().q() ? (short)18634 : 17636);
    }

    public static void openRenameDialog(fzs fzs2) {
        if (!azu_0.j().c(cZl.a())) {
            bDp bDp2 = new bDp();
            bDn bDn2 = (bDn)bDp2.a();
            cZl.a().a(bDn2, byi_1.c);
        }
    }

    public static void createRank(fzs fzs2) {
        dfc.d((short)16978);
    }

    public static void deleteRank(fzs fzs2, byj_2 byj_22) {
        dfc dfc2 = new dfc();
        dfc2.a(byj_22.h());
        dfc2.a_(18898);
        add_2.b().a(dfc2);
    }

    public static void applyRankModifications(fzs fzs2) {
        dfc.d((short)16811);
    }

    public static void displayDisconnectedMembers(fcp_2 fcp_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(19866);
        dfc2.a(fcp_22.j());
        add_2.b().a(dfc2);
    }

    public static void addToParty(fzs fzs2, Long l) {
        byo_2 byo_22 = byp_2.a().d(l);
        if (byo_22 == null) {
            return;
        }
        dgs_0 dgs_02 = new dgs_0();
        dgs_02.a(Xd.b);
        dgs_02.b(byo_22.f());
        add_2.b().a(dgs_02);
    }

    public static void addToFriendlist(fzs fzs2, Long l) {
        byo_2 byo_22 = byp_2.a().d(l);
        if (byo_22 == null) {
            return;
        }
        aUG.a(byo_22.f());
        fvE fvE2 = (fvE)fzs2.e();
        fvE2.setEnabled(false);
    }

    public static void addPrivatePipe(fzs fzs2, Long l) {
        byo_2 byo_22 = byp_2.a().d(l);
        if (byo_22 == null) {
            return;
        }
        cFS.addPrivatePipe(fzs2, byo_22.f());
    }

    public static void editPersonalNote(fzs fzs2) {
    }

    public static void changeRankName(fcd_2 fcd_22) {
        if (fcd_22.k() == 10 && cHl.checkRankModificationDirty()) {
            cHl.applyRankModifications(fcd_22);
            return;
        }
        byn_2 byn_22 = (byn_2)fis_1.a().e("selectedGuildRank");
        if (byn_22 == null) {
            return;
        }
        fug_0 fug_02 = (fug_0)((fyb_0)fcd_22.d()).getElementMap().a("guildName");
        byn_22.a(fug_02.getText());
        cHl.checkRankModificationDirty();
    }

    public static void checkAuthorisation(fck_2 fck_22, bxl_1 bxl_12) {
        fup_0 fup_02 = (fup_0)fck_22.d();
        bxl_12.a(fup_02.getSelected());
        cHl.checkRankModificationDirty();
    }

    public static boolean checkRankModificationDirty() {
        byj_2 byj_22 = (byj_2)fis_1.a().e("selectedGuildRank");
        if (byj_22 == null) {
            return false;
        }
        boolean bl = !byj_22.equals(byp_2.a().a(byj_22.h()));
        fis_1.a().a("rankModificationDirty", bl);
        return bl;
    }

    public static void selectRank(fcb_2 fcb_22) {
        byj_2 byj_22 = (byj_2)fcb_22.j();
        fug_0 fug_02 = (fug_0)((fyb_0)fcb_22.e()).getElementMap().a("guildName");
        fug_02.c(byj_22.e());
        fis_1.a().a("selectedGuildRank", byj_22.j());
        byp_2.a().c(true);
    }

    public static void displayPage(fcp_2 fcp_22) {
        if (fcp_22.j()) {
            ftI ftI2 = (ftI)fcp_22.e();
            int n = Integer.valueOf(ftI2.getValue());
            fis_1.a().a("currentPage", (Object)n, ftI2.getElementMap());
        }
    }

    public static void openMessagesEditionDialog(fzs fzs2) {
        fis_1.a().a("isEditingGuildDescs", true);
        fpm_0.b().a("guildTextEditorDialog", cfi_0.a("guildTextEditorDialog"), 257L, (short)10000);
    }

    public static void onKeyEvent(fzs fzs2, fru_0 fru_02) {
        if (fzs2.f() == frd_0.n) {
            String string;
            fcd_2 fcd_22;
            fug_0 fug_02 = (fug_0)fzs2.e();
            if (cht_0.checkText(fug_02, (fcd_22 = (fcd_2)fzs2).j() == '\n')) {
                // empty if block
            }
            if ((string = fug_02.getText()) != null && string.length() > 0) {
                fru_02.setEnabled(true);
            }
        }
    }

    private static void a(String string, fug_0 fug_02) {
        fzm_0 fzm_02 = fpm_0.b().a(string, cfn_0.a(1), 1027L, 102, 1);
        fzm_02.a(new chm_0(fug_02));
    }

    public static void applyGuildDescription(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        String string2 = cby_2.b(string);
        fug_02.c(string2);
        if (string2.length() == 0 && string.length() != 0) {
            cHl.a(bae.h().a("error.censoredSentence", new Object[0]), fug_02);
            return;
        }
        dfc dfc2 = new dfc();
        dfc2.a_(17803);
        dfc2.a(string2);
        add_2.b().a(dfc2);
        ((fru_0)fzs2.e()).setEnabled(false);
    }

    public static void applyGuildMessage(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        String string2 = cby_2.b(string);
        fug_02.c(string2);
        if (string2.length() == 0 && string.length() != 0) {
            cHl.a(bae.h().a("error.censoredSentence", new Object[0]), fug_02);
            return;
        }
        dfc dfc2 = new dfc();
        dfc2.a_(17832);
        dfc2.a(string2);
        add_2.b().a(dfc2);
        ((fru_0)fzs2.e()).setEnabled(false);
    }

    public static void applyGuildPersonalDescription(fzs fzs2, fug_0 fug_02) {
        dfc dfc2 = new dfc();
        dfc2.a_(16101);
        dfc2.a(fug_02.getText());
        add_2.b().a(dfc2);
        ((fru_0)fzs2.e()).setEnabled(false);
    }

    public static void chooseSmiley(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc();
            dfc2.a((byte)((bxj_1)fcf_22.l()).a());
            dfc2.a_(17559);
            add_2.b().a(dfc2);
        }
    }

    public static void acceptQuest(fzs fzs2, biw_2 biw_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(17688);
        dfc2.b(biw_22.i());
        add_2.b().a(dfc2);
    }

    public static void switchContainerVisibility(fzs fzs2, fso fso2, fru_0 fru_02) {
        boolean bl = !fso2.isVisible();
        fso2.setVisible(bl);
        fru_02.setStyle(bl ? "YellowUpArrow" : "YellowDownArrow");
    }

    public static void selectUpgradeSubCategory(fzs fzs2, bxx_1 bxx_12) {
        bxx_12.b();
    }
}

