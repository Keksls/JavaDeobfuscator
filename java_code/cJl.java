/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cJl {
    public static final String PACKAGE = "wakfu.popupInfos";

    public static void showPopup(fzs fzs2, fil_1 fil_12) {
        cJl.showPopup(fzs2, fil_12, null);
    }

    public static void showPopup(fzs fzs2, fil_1 fil_12, fvE fvE2) {
        Object object;
        if (fzs2 instanceof fcb_2 && (object = ((fcb_2)fzs2).j()) instanceof ajf_1) {
            cJl.showPopup(fzs2, (ajf_1)object, fil_12, fvE2);
            return;
        }
        cJl.showPopup(fzs2, null, fil_12, fvE2);
    }

    public static void showPopup(fzs fzs2, ajf_1 ajf_12, fil_1 fil_12) {
        cJl.showPopup(fzs2, ajf_12, fil_12, null);
    }

    public static void showPopup(fzs fzs2, ajf_1 ajf_12, fil_1 fil_12, fvE fvE2) {
        if (ajf_12 instanceof boq_0) {
            cJl.a((boq_0)ajf_12);
        } else if (ajf_12 instanceof bop_0) {
            fis_1.a().a("osamodasSymbiot.describedCreature", ajf_12);
        } else if (ajf_12 instanceof bhd_1 || ajf_12 instanceof exk_2 || ajf_12 instanceof bjw_1 || ajf_12 instanceof bwk_2) {
            fis_1.a().a("itemPopupDetail", ajf_12);
        } else if (ajf_12 instanceof bht_1) {
            ezr_0<bhg_0> ezr_02 = ((bht_1)ajf_12).i();
            fis_1.a().a("itemPopupDetail", ezr_02);
        } else if (ajf_12 instanceof bhy_1) {
            bhy_1 bhy_12 = (bhy_1)ajf_12;
            if (bhy_12.a() instanceof exk_2) {
                fis_1.a().a("itemPopupDetail", bhy_12.a());
            }
        } else if (ajf_12 instanceof bPb) {
            fis_1.a().a("describedRunningEffect", (Object)ajf_12, ((fyb_0)fzs2.e()).getElementMap());
        } else if (ajf_12 instanceof bli_2) {
            bli_2 bli_22 = (bli_2)ajf_12;
            fis_1.a().a("displayedAchievement", (Object)bli_22, ((fyb_0)fzs2.e()).getElementMap());
        } else if (ajf_12 instanceof bnf_0) {
            bnf_0 bnf_02 = (bnf_0)ajf_12;
            fis_1.a().a("displayedAchievement", (Object)blj_2.a.a(bnf_02.c()), ((fyb_0)fzs2.e()).getElementMap());
        } else if (ajf_12 instanceof bng_0) {
            fis_1.a().a("climateDetail", ajf_12);
        } else if (ajf_12 instanceof brw_0) {
            fis_1.a().a("overRecipe", ajf_12);
        } else if (fil_12.getId().equals("itemDetailPopup")) {
            fis_1.a().a("itemPopupDetail", ajf_12);
        }
        if (fvE2 == null) {
            fpu_0.popup(fzs2, fil_12);
        } else {
            fpu_0.popup(fzs2, fil_12, fvE2);
        }
    }

    public static void closePopup(fzs fzs2) {
        fta_0.getInstance().getPopupContainer().b();
        fis_1.a().a("describedSpell");
        fis_1.a().a("describedSpellRealLevel");
        fis_1.a().a("currentDescribedContainer");
        fis_1.a().a("handsOfWeapon");
        fis_1.a().a("itemPopupDetail");
        fis_1.a().a("isFromEquipedShortcut");
        fis_1.a().a("isFromShortcut");
        fis_1.a().a("currentDescribedChallenge");
        fta_0.getInstance().getPopupContainer().b();
    }

    private static void a(boq_0 boq_02) {
        ajf_1 ajf_12;
        bmr_1 bmr_12;
        blx_1 blx_12 = bmr_12 = azu_0.j().k();
        if (bmr_12.ak() && bmr_12.bz() != null) {
            if (bmr_12.bz().A().p() && bmr_12.bz().A().H().a_() == bmr_12.a_()) {
                blx_12 = bmr_12.bz().A().H();
            }
            if (blx_12 == null) {
                blx_12 = bmr_12;
            }
        }
        if (boq_02.n() == fie.a) {
            ajf_12 = ((blx_1)blx_12).c(boq_02.a());
            fis_1.a().a("describedSpell", ajf_12);
            fis_1.a().a("describedSpellRealLevel", ((fio_0)((Object)ajf_12)).c());
        }
        if (boq_02.n() == fie.d) {
            if (!fta_0.getInstance().isDragging()) {
                if (boq_02.aT_() == 2145) {
                    ajf_12 = new exk_2(-1L);
                    Object r2 = eyo_1.g().d(2145);
                    ((exk_2)ajf_12).b((ezr_0)r2);
                    ((exk_2)ajf_12).a((short)1);
                } else {
                    ajf_12 = (exk_2)bmr_12.R_().e(boq_02.a());
                    if (ajf_12 == null) {
                        ajf_12 = ((epq_2)bmr_12).dS().i(boq_02.a());
                    }
                }
                fis_1.a().a("handsOfWeapon", (Object)"twoHands");
                fis_1.a().a("itemPopupDetail", ajf_12);
                fis_1.a().a("isFromEquipedShortcut", true);
            } else {
                fis_1.a().a("itemPopupDetail", (Object)null);
                fis_1.a().a("isFromEquipedShortcut", false);
                fis_1.a().a("isFromShortcut", false);
                fis_1.a().a("handsOfWeapon", (Object)"none");
            }
        }
        if (boq_02.n() == fie.c) {
            ajf_12 = (exk_2)azu_0.j().k().R_().c(boq_02.aT_());
            if (ajf_12 != null) {
                short s2 = azu_0.j().k().R_().f(((exk_2)ajf_12).a());
                if (s2 == 15 || s2 == 16) {
                    if (!fta_0.getInstance().isDragging()) {
                        if (s2 == 15) {
                            if (((exk_2)ajf_12).T().B()) {
                                fis_1.a().a("handsOfWeapon", (Object)"twoHands");
                            } else {
                                fis_1.a().a("handsOfWeapon", (Object)"rightHand");
                            }
                        } else if (s2 == 16) {
                            fis_1.a().a("handsOfWeapon", (Object)"leftHand");
                        }
                        fis_1.a().a("itemPopupDetail", ajf_12);
                        fis_1.a().a("isFromEquipedShortcut", true);
                    } else {
                        fis_1.a().a("itemPopupDetail", (Object)null);
                        fis_1.a().a("isFromEquipedShortcut", false);
                        fis_1.a().a("isFromShortcut", false);
                        fis_1.a().a("handsOfWeapon", (Object)"none");
                    }
                } else {
                    fis_1.a().a("isFromShortcut", false);
                    if (((exk_2)ajf_12).X()) {
                        fis_1.a().a("isFromEquipedShortcut", true);
                    } else {
                        fis_1.a().a("isFromEquipedShortcut", false);
                    }
                    fis_1.a().a("itemPopupDetail", ajf_12);
                }
            } else {
                ajf_12 = (exk_2)azu_0.j().k().da().d(boq_02.aT_());
                if (ajf_12 != null) {
                    if (!fta_0.getInstance().isDragging()) {
                        fis_1.a().a("itemPopupDetail", ajf_12);
                        fis_1.a().a("isFromShortcut", true);
                    } else {
                        fis_1.a().a("itemPopupDetail", (Object)null);
                        fis_1.a().a("isFromShortcut", false);
                        fis_1.a().a("isFromEquipedShortcut", false);
                    }
                }
            }
        }
    }

    public static void showPopup(fzs fzs2, ajf_1 ajf_12, String string) {
        cJl.showPopup(ajf_12, Integer.parseInt(string));
    }

    public static void showPopup(ajf_1 ajf_12, int n) {
        dhm dhm2 = new dhm(ajf_12);
        dhm2.b(n);
        dhm2.a_(19927);
        add_2.b().a(dhm2);
    }

    public static void hidePopup(fcb_2 fcb_22) {
        Object object = fcb_22.j();
        if (object instanceof ajf_1) {
            cJl.hidePopup(fcb_22, (ajf_1)object);
        }
    }

    public static void hidePopup(fzs fzs2, ajf_1 ajf_12) {
        dhm dhm2 = new dhm(ajf_12);
        dhm2.a_(16278);
        add_2.b().a(dhm2);
    }
}

