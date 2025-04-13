/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

@fpw_0
public class cJF {
    public static final String PACKAGE = "wakfu.spellDetails";
    static int a = -1;

    public static void setSpellLevel(fzs fzs2) {
        if (fzs2 instanceof fcq_1) {
            fyy_0 fyy_02;
            short s2 = (short)((fcq_1)fzs2).j();
            if (s2 > oh_0.a.a()) {
                s2 = oh_0.a.a();
            }
            if ((fyy_02 = ((fyb_0)fzs2.e()).getElementMap()) == null) {
                return;
            }
            cJF.a(s2, fyy_02);
        }
    }

    public static void keyType(fzs fzs2, fug_0 fug_02) {
        fyy_0 fyy_02;
        if (fug_02.getText().length() == 0) {
            return;
        }
        short s2 = Co.h(fug_02.getText());
        if (s2 > oh_0.a.a()) {
            s2 = oh_0.a.a();
        }
        if ((fyy_02 = ((fyb_0)fzs2.e()).getElementMap()) == null) {
            return;
        }
        cJF.a(s2, fyy_02);
    }

    public static void processText(fzs fzs2, fvE fvE2, fil_1 fil_12) {
        cJF.processText(fzs2, fvE2, fil_12, null);
    }

    public static void processText(fzs fzs2, fvE fvE2, fil_1 fil_12, @Nullable fil_1 fil_13) {
        String string;
        String string2;
        String[] stringArray;
        String string3;
        fxQ fxQ2;
        fuk_0 fuk_02 = (fuk_0)fzs2.e();
        fxH fxH2 = fuk_02.getBlockUnderMouse();
        if (fxH2 != null && fxH2.g() == fxI.b) {
            fxQ2 = fxH2.h();
            if (fxQ2 == null) {
                return;
            }
            if (fxQ2.b() == ane_2.b && (string3 = ((fxS)fxQ2).p()) != null && string3.length() > 0 && (stringArray = string3.split("_")).length == 2) {
                int n;
                string2 = stringArray[0];
                string = stringArray[1];
                if (string2 == null || string2.length() == 0) {
                    return;
                }
                if (string2.equals("state")) {
                    n = Integer.parseInt(string);
                    short s2 = Hw.b(n);
                    short s3 = Hw.c(n);
                    bpe_0 bpe_02 = (bpe_0)fih_0.a().a(s2);
                    if (bpe_02.c() != s3) {
                        bpe_02 = bpe_02.b(s3);
                    }
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
                        fvE2.addEventListener(frd_0.G, new cjg_0(fvE2), true);
                    }
                } else if (string2.equals("glyph")) {
                    n = Integer.parseInt(string);
                    short s4 = Hw.b(n);
                    short s5 = Hw.c(n);
                    ekk_0 ekk_02 = elg_0.a().i(s4);
                    bot_0 bot_02 = new bot_0(ekk_02, s5);
                    if (fzs2.f() == frd_0.C) {
                        bpl_0 bpl_03;
                        dgk_0 dgk_02 = new dgk_0(bot_02);
                        if (fvE2.getElementMap() != null && (bpl_03 = (bpl_0)fis_1.a().d("editableDescribedSpell", fvE2.getElementMap().c())) != null) {
                            dgk_02.b(((bph_0)bpl_03.r()).i());
                        }
                        dgk_02.a(fvE2.getElementMap().c());
                        add_2.b().a(dgk_02);
                    } else {
                        fis_1.a().a("describedState", bot_02);
                        fpu_0.popup(fil_12, fvE2);
                        fvE2.addEventListener(frd_0.G, new cjh_0(fvE2), true);
                    }
                } else if (string2.equals("spell")) {
                    n = Integer.parseInt(string);
                    bph_0 bph_02 = bpp_0.a().a(n);
                    if (bph_02 == null) {
                        return;
                    }
                    bpl_0 bpl_04 = new bpl_0(bph_02, 0, -1L, new bmm_2());
                    if (fzs2.f() == frd_0.C) {
                        cGj.openSpellDescription(3, bpl_04, fvE2.getElementMap().c());
                    } else if (fil_13 != null) {
                        fis_1.a().a("describedSpell", bpl_04);
                        fpu_0.popup(fil_13, fvE2);
                        fvE2.addEventListener(frd_0.G, new cji_0(fvE2), true);
                    }
                }
            }
        }
        if (fxH2 != null && fxH2.g() == fxI.c) {
            fxQ2 = fxH2.h();
            if (fxQ2 == null) {
                return;
            }
            if (fxQ2.b() == ane_2.c) {
                fis_1.a().a("describedState", (Object)null);
                string3 = ((fxR)fxQ2).m();
                if (string3 == null) {
                    return;
                }
                stringArray = string3.split("_");
                string2 = stringArray[0];
                if (stringArray.length > 1) {
                    Object[] objectArray = stringArray[1].split(",");
                    string = bae.h().a(string2, objectArray);
                } else {
                    string = bae.h().a(string2, new Object[0]);
                }
                fis_1.a().a("describedIcon", (Object)string);
                fpu_0.popup(fil_12, fuk_02);
                fvE2.addEventListener(frd_0.G, new cJJ(fvE2), true);
            }
        }
    }

    public static void updateBlocks(fzs fzs2, fvE fvE2, fil_1 fil_12, fil_1 fil_13) {
        fuk_0 fuk_02 = (fuk_0)fzs2.e();
        fxH fxH2 = fuk_02.getBlockUnderMouse();
        if (fxH2 != null && a != fxH2.hashCode()) {
            a = fxH2.hashCode();
            cJF.processText(fzs2, fvE2, fil_12, fil_13);
        }
    }

    public static void addSpellLevel(fzs fzs2) {
        fyy_0 fyy_02 = ((fyb_0)fzs2.d()).getElementMap();
        if (fyy_02 == null) {
            return;
        }
        bpl_0 bpl_02 = (bpl_0)fis_1.a().d("editableDescribedSpell", fyy_02.c());
        short s2 = Hw.c((long)(bpl_02.c() + 1));
        if (s2 > oh_0.a.a()) {
            s2 = oh_0.a.a();
        }
        cJF.a(s2, fyy_02);
    }

    public static void removeSpellLevel(fzs fzs2) {
        fyy_0 fyy_02 = ((fyb_0)fzs2.d()).getElementMap();
        if (fyy_02 == null) {
            return;
        }
        bpl_0 bpl_02 = (bpl_0)fis_1.a().d("editableDescribedSpell", fyy_02.c());
        short s2 = Hw.c((long)(bpl_02.c() - 1));
        if (s2 < 0) {
            s2 = 0;
        }
        cJF.a(s2, fyy_02);
    }

    public static void restore(fzs fzs2) {
        fyy_0 fyy_02 = ((fyb_0)fzs2.d()).getElementMap();
        if (fyy_02 == null) {
            return;
        }
        short s2 = (Short)fis_1.a().d("describedSpellRealLevel", fyy_02.c());
        cJF.a(s2, fyy_02);
    }

    private static void a(short s2, fyy_0 fyy_02) {
        bpl_0 bpl_02 = (bpl_0)fis_1.a().d("editableDescribedSpell", fyy_02.c());
        if (bpl_02 == null) {
            return;
        }
        bpl_02.c(s2);
        fut_0 fut_02 = (fut_0)fyy_02.a("tabbedContainer");
        if (fut_02 == null) {
            return;
        }
        boolean bl = fut_02.getSelectedTabIndex() == 0;
        fis_1.a().a((ajf_1)bpl_02, "level", "levelTextShort", "ap", "castInterval", "wp", "chrage", "mp", "castOnlyInLine", "range", "areaOfEffectIconURL", "conditionsDescription", "criticalDescription", "shortDescription", "testLineOfSight", "modifiableRange", "hasEvolutionCondition", "evolutionText", "shortOrCriticalDescription");
        cJF.a(bpl_02, bpl_02, bl);
    }

    public static void updateSpellLevel(fcp_2 fcp_22) {
        fyy_0 fyy_02 = ((fyb_0)fcp_22.e()).getElementMap();
        bpl_0 bpl_02 = (bpl_0)fis_1.a().d("editableDescribedSpell", fyy_02.c());
        bpl_02.b(fcp_22.j());
    }

    private static void a(Sm sm, bpl_0 bpl_02, boolean bl) {
        for (efh_0 efh_02 : sm) {
            boolean bl2 = efh_02.a(1L);
            if (bl2 && bl || !bl2 && !bl || bpl_02.c() > efh_02.P() || bpl_02.c() < efh_02.O()) continue;
            int n = efh_02.F();
            Object[] objectArray = new Object[n];
            for (int k = 0; k < n; ++k) {
                objectArray[k] = efh_02.a(k, bpl_02.c(), eFb.a);
            }
            if (efe_0.a.contains(efh_02.j())) {
                cJF.a(bow_0.a().a(efh_02.i()), bpl_02, bl);
                continue;
            }
            if (efh_02.j() == efc_0.eq.a()) {
                ddg_0.d().a(((bph_0)bpl_02.r()).i(), efh_02.a(0, bpl_02.c(), eFb.a), (short)efh_02.a(1, bpl_02.c(), eFb.a));
                continue;
            }
            sr_0<efh_0, elb_0> sr_02 = edq_0.a(efh_02.j(), objectArray);
            if (sr_02 == null) continue;
            cJF.a(sr_02, bpl_02, bl);
        }
    }

    public static void openCloseDescription(fcb_2 fcb_22, String string) {
        bpl_0 bpl_02;
        if (fcb_22 == null || fcb_22.j() == null) {
            return;
        }
        if (fcb_22.j() instanceof bpl_0) {
            bpl_02 = (bpl_0)fcb_22.j();
        } else if (fcb_22.j() instanceof bpr_0) {
            bpl_02 = ((bpr_0)fcb_22.j()).b();
        } else if (fcb_22.j() instanceof bph_0) {
            bmr_1 bmr_12 = cZI.D() != null ? cZI.D() : azu_0.j().k();
            bpl_02 = new bpl_0((bph_0)fcb_22.j(), bmr_12.dr(), -1L, bmr_12);
        } else {
            return;
        }
        if (bpl_02 == null) {
            return;
        }
        cJF.openCloseDescription(fcb_22, bpl_02, string);
    }

    public static void openCloseDescription(fcb_2 fcb_22, bpl_0 bpl_02, String string) {
        if (fcb_22 == null || fcb_22.j() == null) {
            return;
        }
        if (bpl_02 == null) {
            return;
        }
        epq_2 epq_22 = bpl_02.g();
        bpl_0 bpl_03 = bpl_02.a(false);
        if (epq_22 != null) {
            bpl_03.c(bpl_02.a(epq_22.dz()));
        }
        fis_1.a().a("describedSpell", bpl_03);
        fis_1.a().a("describedSpellRealLevel", bpl_03.c());
        fso fso2 = (fso)fcb_22.e();
        fil_1 fil_12 = (fil_1)fso2.getElementMap().a(string);
        if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
            fpu_0.popup(fil_12, fso2);
        } else if (fcb_22.f() == frd_0.l || fcb_22.f() == frd_0.k) {
            fis_1.a().a("describedSpell", (Object)null);
            fis_1.a().a("describedSpellRealLevel", (short)-1);
            fpu_0.closePopup(fcb_22, fil_12);
        }
    }
}

