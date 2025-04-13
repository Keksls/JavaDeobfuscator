/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHT
 */
@fpw_0
public class cht_0 {
    public static final String PACKAGE = "wakfu.nation";
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    static boolean e;

    public static void onKeyPress(fzs fzs2) {
        if (fzs2.f() == frd_0.n) {
            String string;
            fcd_2 fcd_22;
            fug_0 fug_02 = (fug_0)fzs2.e();
            if (cht_0.checkText(fug_02, (fcd_22 = (fcd_2)fzs2).j() == '\n')) {
                // empty if block
            }
            if ((string = fug_02.getText()) != null && string.length() > 0) {
                fis_1.a().a("speechDirty", true);
            }
        }
    }

    public static boolean checkText(fug_0 fug_02, boolean bl) {
        boolean bl2 = true;
        Object object = fug_02.getText();
        int n = bl ? 1 : 0;
        for (int k = 0; k < ((String)object).length(); ++k) {
            if (((String)object).charAt(k) != '\n' || ++n <= 3) continue;
            object = ((String)object).substring(0, k) + " " + ((String)object).substring(k + 1, ((String)object).length());
        }
        if (n > 3) {
            bl2 = false;
            fug_02.c((String)object);
            cht_0.a(bae.h().a("carriageReturnLimitError", new Object[0]), fug_02);
        }
        return bl2;
    }

    private static void a(String string, fug_0 fug_02) {
        fzm_0 fzm_02 = fpm_0.b().a(string, cfn_0.a(1), 1027L, 102, 1);
        fzm_02.a(new cHU(fug_02));
    }

    public static void cancelGovernorSpeech(fzs fzs2) {
        bUW.a().a((String)null);
        bUW.a().D();
        fis_1.a().a("speechVisualisationMode", true);
        fis_1.a().a("speechDirty", false);
    }

    public static void cancelMarshalSpeech(fzs fzs2) {
        bUW.a().a((String)null);
        bUW.a().h();
        fis_1.a().a("speechVisualisationMode", true);
        fis_1.a().a("speechDirty", false);
    }

    public static void cancelGeneralSpeech(fzs fzs2) {
        bUW.a().a((String)null);
        bUW.a().i();
        fis_1.a().a("speechVisualisationMode", true);
        fis_1.a().a("speechDirty", false);
    }

    public static void validateGovernorSpeech(fzs fzs2, fug_0 fug_02) {
        cht_0.validate(fzs2, fug_02, fcu_0.a, 16200, bUW.a().z());
    }

    public static void validateMarshalSpeech(fzs fzs2, fug_0 fug_02) {
        cht_0.validate(fzs2, fug_02, fcu_0.c, 19784, bUW.a().A());
    }

    public static void validateGeneralSpeech(fzs fzs2, fug_0 fug_02) {
        cht_0.validate(fzs2, fug_02, fcu_0.d, 18326, bUW.a().B());
    }

    public static void validate(fzs fzs2, fug_0 fug_02, fcu_0 fcu_02, int n, bUM bUM2) {
        if (!cht_0.checkText(fug_02, false)) {
            return;
        }
        String string = fug_02.getText();
        String string2 = cby_2.b(string);
        fug_02.c(string2);
        if (string2.length() == 0 && string.length() != 0) {
            cht_0.a(bae.h().a("error.censoredSentence", new Object[0]), fug_02);
            return;
        }
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("nation.speechWarning", new Object[0]), cfn_0.a(0), 25L, 102, 1);
        fzm_02.a(new chv_0(n, fug_02, fcu_02, bUM2));
    }

    public static void changeTitle(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc();
            dfc2.a_(16794);
            bUO bUO2 = ((bUP)fcf_22.l()).a();
            dfc2.a(bUO2 == null ? (short)-1 : (short)bUO2.a());
            add_2.b().a(dfc2);
        }
    }

    public static void switchGovernmentVisibility(fzs fzs2, fru_0 fru_02, fso fso2) {
        cht_0.switchVisibility(fru_02, fso2);
    }

    public static void switchEconomyVisibility(fzs fzs2, fru_0 fru_02, fso fso2) {
        if (cht_0.switchVisibility(fru_02, fso2)) {
            dfc.d((short)18604);
        }
    }

    public static void switchGovernorPopularityVisibility(fzs fzs2, fru_0 fru_02, fso fso2) {
        if (cht_0.switchVisibility(fru_02, fso2)) {
            dfc.d((short)17059);
        }
    }

    public static void switchOtherNationLaws(fzs fzs2, fru_0 fru_02, fso fso2, bVm bVm2) {
        if (cht_0.switchVisibility(fru_02, fso2)) {
            bUW.a().b(bVm2.a());
            dfc dfc2 = new dfc();
            dfc2.a_(18105);
            dfc2.b(bVm2.a().c());
            add_2.b().a(dfc2);
        } else {
            bUW.a().c(bVm2.a());
        }
    }

    public static boolean switchVisibility(fru_0 fru_02, fso fso2) {
        boolean bl = !fso2.isVisible();
        fso2.setVisible(bl);
        fru_02.setStyle(bl ? "YellowUpArrow" : "YellowDownArrow");
        return bl;
    }

    public static void displayPage(fzs fzs2, String string) {
        int n;
        Byte by = Byte.valueOf(string);
        int n2 = fis_1.a().d("nationCurrentPageIndex");
        if (by == n2) {
            return;
        }
        fis_1.a().a("nationCurrentPageIndex", by);
        faV faV2 = azu_0.j().k().fE();
        bMn bMn2 = bwy_2.h().j();
        int n3 = n = bMn2 == null ? -1 : bMn2.D().c();
        if (by == 1) {
            cAa cAa2 = new cAa();
            azu_0.j().K().c(cAa2);
            dbd.a().a(false);
            bUW.a().a(false);
        } else if (by == 2) {
            bUW.a().p();
            fis_1.a().a((ajf_1)bUW.a(), "laws");
            if (faV2.n() != n) {
                cAe cAe2 = new cAe();
                cAe2.b(faV2.n());
                azu_0.j().K().c(cAe2);
                dbd.a().a(false);
            }
        } else if (by == 3) {
            bUW.a().a(true);
            czt_1 czt_12 = new czt_1();
            azu_0.j().K().c(czt_12);
            dbd.a().a(false);
        } else {
            bUW.a().a(false);
        }
    }

    public static void detailRankMember(fzs fzs2, bVo bVo2) {
        dfc dfc2 = new dfc();
        dfc2.a_(19512);
        dfc2.a(bVo2.b());
        add_2.b().a(dfc2);
    }

    public static void revokeRankMember(fzs fzs2, bVo bVo2) {
        fcs_0 fcs_02 = bUW.a().x().D();
        fcq_0 fcq_02 = fcs_02.b(azu_0.j().k().a_());
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a(fcq_02.b().a() == bVo2.b() ? "nation.governmentResignationConfirmation" : "nation.governmentRevokeConfirmation", bVo2.c()), cfn_0.a(0), 25L, 102, 1);
        fzm_02.a(new cHW(bVo2));
    }

    public static void addToRank(fzs fzs2, bVo bVo2, fug_0 fug_02) {
        if (fzs2.f() == frd_0.n && ((fcd_2)fzs2).k() != 10) {
            return;
        }
        String string = fug_02.getText();
        if (string != null && string.length() > 0) {
            dfc dfc2 = new dfc();
            dfc2.a_(16670);
            dfc2.a(bVo2.b());
            dfc2.a(string);
            add_2.b().a(dfc2);
            fug_02.c("");
            fyc_0.a().c(null);
        }
    }

    public static void switchVisualizeSpeech(fzs fzs2, fug_0 fug_02) {
        boolean bl = fis_1.a().c("speechVisualisationMode");
        fis_1.a().a("speechVisualisationMode", !bl);
        if (!bl) {
            bUW.a().a(fug_02.getText());
            bUW.a().D();
        }
    }

    public static void switchVisualizeMarshalSpeech(fzs fzs2, fug_0 fug_02) {
        boolean bl = fis_1.a().c("speechVisualisationMode");
        fis_1.a().a("speechVisualisationMode", !bl);
        if (!bl) {
            bUW.a().a(fug_02.getText());
            bUW.a().h();
        }
    }

    public static void switchVisualizeGeneralSpeech(fzs fzs2, fug_0 fug_02) {
        boolean bl = fis_1.a().c("speechVisualisationMode");
        fis_1.a().a("speechVisualisationMode", !bl);
        if (!bl) {
            bUW.a().a(fug_02.getText());
            bUW.a().i();
        }
    }

    public static void cancelLawPoints(fzs fzs2) {
        dfc.d((short)18911);
    }

    public static void validateLawPoints(fzs fzs2) {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a(bUW.a().x().m().b() ? "nation.firstLawChangesConfirmation" : "nation.lawChangesConfirmation", new Object[0]), cfn_0.a(0), 537L, 102, 1);
        fzm_02.a(new chx_0());
    }

    public static void chooseLaw(fcp_2 fcp_22, bUR bUR2) {
        if (fcp_22.j() == bUR2.b()) {
            return;
        }
        if (fcp_22.j() && bUR2.a().c() + bUW.a().c() > 50) {
            if (e) {
                return;
            }
            fyy_0 fyy_02 = ((fyb_0)fcp_22.d()).getElementMap();
            if (fyy_02 == null) {
                return;
            }
            fup_0 fup_02 = (fup_0)fcp_22.d();
            fsM fsM2 = (fsM)fyy_02.a("lawPointsLabel");
            azf_2 azf_22 = new azf_2(1.0f, 0.2f, 0.2f, 1.0f);
            azf_2 azf_23 = azf_2.e;
            fsM2.removeTweensOfType(fjp_2.class);
            fup_02.removeTweensOfType(fjp_2.class);
            fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, fsM2, 0, 250, 5, fjw_2.b);
            fsM2.addTween(fjp_22);
            fjp_2 fjp_23 = new fjp_2(azf_22, azf_23, fup_02, 0, 250, 5, fjw_2.b);
            fup_02.addTween(fjp_23);
            e = true;
            fjp_23.a(new cHY(fup_02, fjp_23));
            return;
        }
        bUR2.a(fcp_22.j());
        dfc dfc2 = new dfc();
        dfc2.a(bUR2.a().a());
        dfc2.a_(18582);
        add_2.b().a(dfc2);
    }

    public static void suggestAlliance(fzs fzs2, buu_0 buu_02) {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("nation.suggestAllianceConfirmation", buu_02.f()), cfn_0.a(0), 25L, 102, 1);
        fzm_02.a(new cHZ(buu_02));
    }

    public static void declareWar(fzs fzs2, buu_0 buu_02) {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("nation.declareWarConfirmation", buu_02.f()), cfn_0.a(0), 25L, 102, 1);
        fzm_02.a(new cIa(buu_02));
    }

    public static void validProposal(fzs fzs2, buu_0 buu_02) {
        dgZ dgZ2 = new dgZ();
        dgZ2.c(buu_02.g());
        dgZ2.b(buu_02.a() ? fbl_0.b.a() : fbl_0.a.a());
        add_2.b().a(dgZ2);
    }

    public static void cancelProposal(fzs fzs2, buu_0 buu_02) {
        dgZ dgZ2 = new dgZ();
        dgZ2.c(buu_02.g());
        dgZ2.b(buu_02.b().a());
        add_2.b().a(dgZ2);
    }

    public static void changeOpinion(fzs fzs2, String string) {
        bUW.a().a(Byte.parseByte(string));
    }

    public static void confirmOpinionChange(fzs fzs2) {
        dfc.d((short)17292);
    }

    public static void onZoneOver(fcm_1 fcm_12, bVs bVs2) {
        fis_1.a().a("protectorInList", bVs2);
    }

    public static void onZoneOut(fcm_1 fcm_12) {
        fis_1.a().a("protectorInList");
    }

    public static void onFocusGain(fcz_1 fcz_12, fru_0 fru_02) {
        fru_02.setEnabled(true);
    }
}

