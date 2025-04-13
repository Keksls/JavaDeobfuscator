/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

@fpw_0
public class cGS {
    public static final String PACKAGE = "wakfu.exchange";
    private static final Logger a = Logger.getLogger(cGS.class);
    private static adv_1 b;

    public static void setReadyForExchange(fzs fzs2, Long l) {
        long l2;
        bmr_1 bmr_12 = azu_0.j().k();
        bvc_2 bvc_22 = bvz_2.a.b();
        fug_0 fug_02 = (fug_0)((fyb_0)fzs2.e()).getElementMap().a("exchangeKamasEditor");
        String string = fug_02.getText();
        bvd_2 bvd_22 = (bvd_2)bvc_22.a(bmr_12.a_());
        long l3 = l2 = string.length() == 0 ? 0L : bae.h().f(string);
        if (bvd_22.f() != l2) {
            return;
        }
        if (bvc_22.x() == ell_0.a) {
            dgi_0 dgi_02 = new dgi_0();
            dgi_02.b(l);
            add_2.b().a(dgi_02);
        } else {
            cGS.showErrorMessage(bvc_22);
        }
    }

    public static void dragItem(fcp_1 fcp_12, Long l) {
        Object object;
        if (fpm_0.b().q("splitStackDialog")) {
            fpm_0.b().o("splitStackDialog");
        }
        if ((object = fcp_12.l()) != null && object instanceof exk_2) {
            exk_2 exk_22 = (exk_2)object;
            bvc_2 bvc_22 = bvz_2.a.b();
            if (bvc_22 != null) {
                bvc_22.f(exk_22.a());
            }
        }
    }

    public static void transferAllItems(fck_2 fck_22, Long l) {
        if (cyc_0.d().f()) {
            return;
        }
        String string2 = bae.h().a("exchange.confirm.transfer.all.inventory", new Object[0]);
        fzm_0 fzm_02 = fpm_0.b().a(string2, cfn_0.a(0), 18439L, 102, 2);
        if (fzm_02 == null) {
            return;
        }
        fzm_02.a((n, string) -> {
            if (n != 2) {
                return;
            }
            bmr_1 bmr_12 = azu_0.j().k();
            ArrayList<exg_2> arrayList = bmr_12.da().h();
            cGS.transferBagContent(l, arrayList);
        });
    }

    public static void transferBagContent(long l, List<exg_2> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        dgg_0 dgg_02 = new dgg_0();
        dgg_02.a_(17489);
        dgg_02.b(l);
        for (exg_2 exg_22 : list) {
            for (exk_2 exk_22 : exg_22) {
                if (!exk_22.U().m() || exk_22.y()) continue;
                dgg_02.a(exk_22);
            }
        }
        if (dgg_02.k().isEmpty()) {
            return;
        }
        cyc_0.d().a(true);
        add_2.b().a(dgg_02);
    }

    public static void removeExchangeContent(fzs fzs2, Long l) {
        if (cyc_0.d().f()) {
            return;
        }
        String string2 = bae.h().a("exchange.confirm.remove.exchange.content", new Object[0]);
        fzm_0 fzm_02 = fpm_0.b().a(string2, cfn_0.a(0), 18439L, 102, 2);
        if (fzm_02 == null) {
            return;
        }
        fzm_02.a((n, string) -> {
            if (n != 2) {
                return;
            }
            bmr_1 bmr_12 = azu_0.j().k();
            bvc_2 bvc_22 = bvz_2.a.b();
            bvd_2 bvd_22 = (bvd_2)bvc_22.a(bmr_12.a_());
            if (bvd_22 == null || bvd_22.c() == null) {
                return;
            }
            dgg_0 dgg_02 = new dgg_0();
            dgg_02.a_(19955);
            dgg_02.b(l);
            for (exk_2 exk_22 : bvd_22.j()) {
                dgg_02.a(exk_22);
            }
            if (dgg_02.k().isEmpty()) {
                return;
            }
            cyc_0.d().a(true);
            add_2.b().a(dgg_02);
        });
    }

    public static void dropItem(fcv_2 fcv_22, Long l) {
        fyt_0.a().c();
        Object object = fcv_22.n();
        if (object != null && object instanceof exk_2) {
            exk_2 exk_22 = (exk_2)fcv_22.n();
            bvc_2 bvc_22 = bvz_2.a.b();
            if (bvc_22.o() == exk_22.a()) {
                return;
            }
            boolean bl = fcv_22.t();
            boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe.P);
            if (!cyc_0.d().a(exk_22)) {
                aUh.a("exchange.itemUnexchangeable", new Object[0]);
                return;
            }
            if (exk_22.e() > 1 && bl ^ bl2) {
                cjk_0.setMaxQuantity(exk_22.e());
                cjk_0.setItem(exk_22);
                cjk_0.setExchangeId(l);
                cjk_0.setMessageType((short)17119);
                dgL dgL2 = new dgL();
                dgL2.a(exk_22);
                dgL2.g((short)fcv_22.v());
                dgL2.h((short)fcv_22.w());
                dgL2.a_(18919);
                add_2.b().a(dgL2);
            } else {
                dgf_0 dgf_02 = new dgf_0();
                dgf_02.a_(17119);
                dgf_02.b(l);
                dgf_02.a((exk_2)object);
                dgf_02.c(exk_22.e());
                add_2.b().a(dgf_02);
            }
        }
    }

    public static void dropOut(fzs fzs2, Long l) {
        fcx_1 fcx_12;
        Object object;
        if (fzs2 instanceof fcx_1 && (object = (fcx_12 = (fcx_1)fzs2).l()) != null && object instanceof exk_2) {
            exk_2 exk_22 = (exk_2)object;
            bvc_2 bvc_22 = bvz_2.a.b();
            if (bvc_22 != null) {
                bvc_22.f(-1L);
            }
            boolean bl = fcx_12.t();
            boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe.P);
            if (exk_22.e() > 1 && bl ^ bl2) {
                cjk_0.setMaxQuantity(exk_22.e());
                cjk_0.setItem(exk_22);
                cjk_0.setExchangeId(l);
                cjk_0.setMessageType((short)18612);
                dgL dgL2 = new dgL();
                dgL2.a(exk_22);
                dgL2.g((short)fcx_12.v());
                dgL2.h((short)fcx_12.w());
                dgL2.a_(18919);
                add_2.b().a(dgL2);
            } else {
                dgf_0 dgf_02 = new dgf_0();
                dgf_02.a_(18612);
                dgf_02.b(l);
                dgf_02.a(exk_22);
                dgf_02.c(exk_22.e());
                add_2.b().a(dgf_02);
            }
        }
    }

    public static void removeItem(fcb_2 fcb_22, Long l) {
        Object object = fcb_22.j();
        if (object != null && object instanceof exk_2) {
            exk_2 exk_22 = (exk_2)object;
            dgf_0 dgf_02 = new dgf_0();
            dgf_02.a_(18612);
            dgf_02.b(l);
            dgf_02.a(exk_22);
            dgf_02.c(exk_22.e());
            add_2.b().a(dgf_02);
            bvc_2 bvc_22 = bvz_2.a.b();
            if (bvc_22 != null) {
                bvc_22.f(-1L);
            }
        }
    }

    public static void exchangeMoney(fzs fzs2, Long l) {
        if (fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() != 10) {
            return;
        }
        cGS.exchangeMoney(l);
    }

    public static void valueChanged(fcd_2 fcd_22, Long l) {
        if (fcd_22.q()) {
            return;
        }
        dfc dfc2 = new dfc(19652);
        dfc2.a(bae.h().f(((fug_0)fcd_22.d()).getText()));
        add_2.b().a(dfc2);
    }

    public static void exchangeMoney(Long l) {
        dgh_0 dgh_02 = new dgh_0();
        dgh_02.b(l);
        dgh_02.a_(16707);
        add_2.b().a(dgh_02);
    }

    public static void openItemDetailWindow(fcb_2 fcb_22, fvk_0 fvk_02) {
        if (fcb_22.x() == 3) {
            Object object = fcb_22.j();
            if (object instanceof exk_2) {
                cfq_0.sendOpenCloseItemDetailMessage(fvk_02.getElementMap().c(), (exk_2)object);
            } else if (object instanceof bjw_1) {
                cfq_0.sendOpenCloseItemDetailMessage(fvk_02.getElementMap().c(), (bjw_1)object);
            }
        }
    }

    public static void showErrorMessage(bvc_2 bvc_22) {
        String string;
        Object object;
        if (bvc_22.x() == ell_0.a) {
            a.error((Object)"On veut afficher un message d'erreur pour un \u00e9change valide");
            return;
        }
        if (bvc_22.x() == ell_0.b) {
            object = bvc_22.e();
            string = "inventoryFull";
        } else if (bvc_22.x() == ell_0.c) {
            object = bvc_22.f();
            string = "inventoryFull";
        } else if (bvc_22.x() == ell_0.e) {
            object = bvc_22.e();
            string = "objectDoesntExist";
        } else if (bvc_22.x() == ell_0.f) {
            object = bvc_22.z();
            string = "tooMuchKamas";
        } else {
            object = bvc_22.f();
            string = "objectDoesntExist";
        }
        String string2 = bae.h().a("exchange.error." + string, object.h());
        fpm_0.b().a(string2, cfn_0.a(1), 1027L, 102, 1);
    }

    public static void closeExchangeDialog(fzs fzs2, Long l) {
        Object object;
        boolean bl = false;
        switch (fzs2.f()) {
            case n: 
            case p: {
                break;
            }
            case o: {
                object = (fcd_2)fzs2;
                bl = ((fcd_2)object).k() == 27;
                break;
            }
            case C: {
                bl = true;
            }
        }
        if (bl) {
            object = new dfc();
            ((anw_1)object).a_(19027);
            ((anw_1)object).a(l);
            add_2.b().a((adt_1)object);
            cyc_0.d().a(false);
        }
    }

    public static void onMouseOverExhange(fzs fzs2) {
        ftj_0 ftj_02;
        fyb_0 fyb_02;
        if (fta_0.getInstance().isDragging() && (fyb_02 = fta_0.getInstance().getDragged().getParent()) instanceof ftj_0 && (ftj_02 = (ftj_0)fyb_02).getItemValue() instanceof exk_2) {
            exk_2 exk_22 = (exk_2)ftj_02.getItemValue();
            if (!cyc_0.d().a(exk_22)) {
                fyt_0.a().a(frb_0.g, true);
            }
        }
    }

    public static void showItemDetailPopup(fcb_2 fcb_22, fvk_0 fvk_02) {
        Object object = fcb_22.j();
        if (!(object instanceof exk_2)) {
            return;
        }
        if (fcb_22.f() == frd_0.m) {
            fil_1 fil_12 = (fil_1)fvk_02.getElementMap().a("itemDetailPopup");
            fis_1.a().a("itemPopupDetail", fcb_22.j());
            fpu_0.popup(fcb_22, fil_12);
        } else if (fcb_22.f() == frd_0.l) {
            fpu_0.closePopup(fcb_22);
        }
    }
}

