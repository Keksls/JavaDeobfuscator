/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;

/*
 * Renamed from cHw
 */
@fpw_0
public class chw_0 {
    public static final String PACKAGE = "wakfu.itemDetails";
    private static final long a = 500L;
    private static long b = -1L;

    public static void mount(fzs fzs2, Object object) {
        if (!(object instanceof exk_2)) {
            return;
        }
        if (b != -1L && System.currentTimeMillis() - b < 500L) {
            return;
        }
        b = System.currentTimeMillis();
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_1 bmr_13 = (bmr_1)euu_2.f(bmr_12.U_(), ((exk_2)object).a());
        if (bmr_13 == null || bmr_13.a_() != bmr_12.a_()) {
            return;
        }
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 != null && bpc_22.ac_() == 14) {
            bmr_12.dN();
            return;
        }
        cpw_0 cpw_02 = new cpw_0();
        azu_0.j().K().c(cpw_02);
    }

    public static void mergeSet(fzs fzs2, Object object) {
        if (object instanceof exk_2) {
            bmr_1 bmr_12 = azu_0.j().k();
            bpc_2 bpc_22 = bmr_12.eE();
            if (bpc_22 != null && bpc_22.ac_() == 24) {
                aUh.a("error.impossibleDuringExchange", new Object[0]);
                return;
            }
            fac_0 fac_02 = (fac_0)object;
            dfc dfc2 = new dfc();
            dfc2.a_(17155);
            dfc2.a(fac_02.a());
            add_2.b().a(dfc2);
            fru_0 fru_02 = (fru_0)fzs2.e();
            fqd_0 fqd_02 = fru_02.getAppearance();
            fqd_02.b();
        }
    }

    public static void inventorySort(fzs fzs2, Object object, bmr_1 bmr_12) {
        if (object instanceof bHg) {
            bHg bHg2 = (bHg)object;
            bHe bHe2 = bHg2.o();
            if (bHe2 == null) {
                return;
            }
            bha_0.a(bmr_12, bHe2.e());
        }
    }

    public static void toggleCollapseBag(fzs fzs2, Object object, bmr_1 bmr_12) {
        if (!(object instanceof bHp)) {
            return;
        }
        ((bHp)object).ak_();
    }

    public static void inventoryMoveToExchange(fzs fzs2, Object object, bmr_1 bmr_12) {
        if (cyc_0.d().f()) {
            return;
        }
        if (!(object instanceof bHg)) {
            return;
        }
        bvc_2 bvc_22 = bvz_2.a.b();
        if (bvc_22 == null) {
            return;
        }
        bHg bHg2 = (bHg)object;
        bHe bHe2 = bHg2.o();
        if (bHe2 == null) {
            return;
        }
        long l = bvc_22.a();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 == null || bpc_22.ac_() != 24) {
            return;
        }
        String string2 = bae.h().a("exchange.confirm.transfer.bag.content", new Object[0]);
        fzm_0 fzm_02 = fpm_0.b().a(string2, cfn_0.a(0), 18439L, 102, 2);
        if (fzm_02 == null) {
            return;
        }
        fzm_02.a((n, string) -> {
            if (n != 2) {
                return;
            }
            cGS.transferBagContent(l, Collections.singletonList(bHe2));
        });
    }

    public static void openSetDetailWindow(fzs fzs2, fyb_0 fyb_02, Object object) {
        if (fzs2.f() == frd_0.C) {
            bhd_1 bhd_12;
            if (object instanceof exk_2) {
                bhd_12 = bhe_0.a().a(((exk_2)object).T().x());
            } else if (object instanceof bjw_1) {
                bhd_12 = bhe_0.a().a(((bjw_1)object).x());
            } else if (object instanceof brw_0) {
                bhd_12 = bhe_0.a().a(((brw_0)object).h().x());
            } else {
                return;
            }
            dgM dgM2 = new dgM();
            dgM2.b(fyb_02.getElementMap().c());
            dgM2.a(bhd_12);
            add_2.b().a(dgM2);
        }
    }

    public static void openItemDetailWindow(fcb_2 fcb_22) {
        Object object = fcb_22.j();
        if (!(object instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)object;
        if (exk_22 == null) {
            return;
        }
        if (fcb_22.x() == 3) {
            dgK dgK2 = new dgK();
            dgK2.a_(16130);
            dgK2.b(((fyb_0)fcb_22.d()).getElementMap().c());
            dgK2.a(exk_22);
            add_2.b().a(dgK2);
        }
    }

    public static void openStuffPreviewWindow(fzs fzs2, Object object) {
        if (object instanceof brw_0) {
            ((brw_0)object).h().k();
            return;
        }
        exk_2 exk_22 = object instanceof bMi ? ((bMi)object).j() : (exk_2)object;
        if ("inventoryDialog".equals(((fyb_0)fzs2.e()).getElementMap().c())) {
            ddo_0.b.a(exk_22, cyt_0.s());
        } else {
            ddo_0.b.a(exk_22);
        }
    }

    public static void processText(fzs fzs2, fvE fvE2, fil_1 fil_12) {
        cJF.processText(fzs2, fvE2, fil_12);
    }

    public static void openLinkedCraft(fzs fzs2, Object object) {
        if (fzs2.f() == frd_0.C) {
            bjw_1 bjw_12;
            if (object instanceof exk_2) {
                bjw_12 = (bjw_1)((exk_2)object).T();
            } else if (object instanceof bjw_1) {
                bjw_12 = (bjw_1)object;
            } else if (object instanceof brw_0) {
                bjw_12 = ((brw_0)object).h();
            } else {
                return;
            }
            dfc dfc2 = new dfc();
            dfc2.a_(19922);
            dfc2.b(bjw_12.n());
            add_2.b().a(dfc2);
        }
    }

    public static void openItemRecipes(fzs fzs2, Object object) {
        if (fzs2.f() == frd_0.C) {
            ezr_0 ezr_02;
            if (object instanceof exk_2) {
                ezr_02 = ((exk_2)object).T();
            } else if (object instanceof ezr_0) {
                ezr_02 = (ezr_0)object;
            } else if (object instanceof brw_0) {
                ezr_02 = ((brw_0)object).h();
            } else {
                return;
            }
            if (ezr_02 == null) {
                return;
            }
            if (!azu_0.j().c(cxa_0.a())) {
                azu_0.j().a(cxa_0.a());
            }
            dfc dfc2 = new dfc();
            dfc2.a_(16700);
            dfc2.b(ezr_02.n());
            add_2.b().a(dfc2);
        }
    }

    public static void closeWindow(fzs fzs2, fyb_0 fyb_02) {
        if (fzs2.f() == frd_0.C) {
            dgK dgK2 = new dgK();
            dgK2.a_(16130);
            dgK2.b(fyb_02.getElementMap().c());
            add_2.b().a(dgK2);
        }
    }

    public static void setItemLevel(fcq_1 fcq_12) {
        fyy_0 fyy_02 = ((fyb_0)fcq_12.e()).getElementMap();
        if (fyy_02 == null) {
            return;
        }
        Object object = fis_1.a().d("itemDetail", fyy_02.c());
        if (object == null) {
            return;
        }
        if (object instanceof bjw_1) {
            return;
        }
        if (object instanceof bMi) {
            return;
        }
        exk_2 exk_22 = (exk_2)object;
        if (!exk_22.w()) {
            return;
        }
        ezv_0 ezv_02 = exk_22.x();
        short s2 = (short)fcq_12.j();
        if (s2 > ezv_02.f().a()) {
            s2 = ezv_02.f().a();
        }
        chw_0.a(s2, fyy_02);
    }

    public static void keyType(fzs fzs2, ful_0 ful_02) {
        fyy_0 fyy_02 = ((fyb_0)fzs2.e()).getElementMap();
        if (fyy_02 == null) {
            return;
        }
        exk_2 exk_22 = (exk_2)fis_1.a().d("itemDetail", fyy_02.c());
        if (exk_22 == null) {
            return;
        }
        if (!exk_22.w()) {
            return;
        }
        ezv_0 ezv_02 = exk_22.x();
        if (ful_02.getText().length() == 0) {
            return;
        }
        short s2 = Co.h(ful_02.getText());
        if (s2 > ezv_02.f().a()) {
            s2 = ezv_02.f().a();
        }
        chw_0.a(s2, fyy_02);
    }

    public static void restore(fzs fzs2) {
        fyy_0 fyy_02 = ((fyb_0)fzs2.e()).getElementMap();
        if (fyy_02 == null) {
            return;
        }
        bjz_2 bjz_22 = (bjz_2)fis_1.a().d("itemLevelController", fyy_02.c());
        bjz_22.a();
    }

    private static void a(short s2, fyy_0 fyy_02) {
        bjz_2 bjz_22 = (bjz_2)fis_1.a().d("itemLevelController", fyy_02.c());
        bjz_22.a(s2);
    }

    public static void openEnchantmentFrame(fcb_2 fcb_22, Object object) {
        if (!azu_0.j().c(cyq_0.a)) {
            azu_0.j().a(cyq_0.a);
        }
        cyq_0.a.a((exk_2)object);
    }

    public static void changeItemBackground(fck_2 fck_22, exk_2 exk_22) {
        chw_0.changeItemBackground(fck_22, exk_22, null);
    }

    public static void changeItemBackground(fck_2 fck_22) {
        String string = "";
        fvE fvE2 = (fvE)fck_22.e();
        if (fck_22.f() == frd_0.y) {
            string = "itemSelectedBackground";
        } else if (fck_22.f() == frd_0.z) {
            string = "itemBackground";
        }
        fvE2.setStyle(string);
    }

    public static void changeItemBackground(fck_2 fck_22, exk_2 exk_22, fil_1 fil_12) {
        String string = "";
        fvE fvE2 = (fvE)fck_22.e();
        if (exk_22 != null) {
            if (fck_22.f() == frd_0.y) {
                string = "itemSelectedBackground";
            } else if (fck_22.f() == frd_0.z) {
                string = "itemBackground";
            }
            fvE2.setStyle(string);
        }
        if (fil_12 != null) {
            if (fck_22.f() == frd_0.y) {
                cJl.showPopup(fck_22, exk_22, fil_12, fvE2);
            } else {
                cJl.closePopup(fck_22);
            }
        }
    }

    public static void showItemDetails(fcb_2 fcb_22, fso fso2) {
        exi_2 exi_22 = (exi_2)fcb_22.j();
        fil_1 fil_12 = (fil_1)fso2.getElementMap().a("itemDetailPopup");
        if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
            fis_1.a().a("itemPopupDetail", exi_22);
            fis_1.a().a("isFromShortcut", false);
            fpu_0.popup(fil_12, (fvE)fcb_22.e());
        } else if (fcb_22.f() == frd_0.l) {
            fis_1.a().a("itemPopupDetail", (Object)null);
            fis_1.a().a("isFromShortcut", false);
            fis_1.a().a("isFromEquipedShortcut", false);
            fpu_0.closePopup(fcb_22, fil_12);
        }
    }

    public static void deleteItem(fzs fzs2, exk_2 exk_22) {
        cgo_0.deleteItem(exk_22);
    }

    public static void useItem(fzs fzs2) {
        cgo_0.useItem(fzs2);
    }

    public static void mimiSymbicUnmake(fzs fzs2) {
        cgo_0.mimiSymbicUnmake(fzs2);
    }

    public static void regenWith(fzs fzs2) {
        cgo_0.regenWith(fzs2);
    }
}

