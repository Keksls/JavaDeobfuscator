/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cGU {
    public static final String PACKAGE = "wakfu.exchangeMachine";

    public static void selectExchange(fck_2 fck_22, bvk_1 bvk_12) {
        if (!"exchangeBackground".equals(((fyb_0)fck_22.e()).getId())) {
            return;
        }
        if (fck_22.x() == 3) {
            cGU.a(fck_22, bvk_12);
            return;
        }
    }

    private static void a(fck_2 fck_22, bvk_1 bvk_12) {
        dgO<bMi> dgO2;
        exk_2 exk_22;
        if (fck_22.x() != 3) {
            return;
        }
        brk_1 brk_12 = bvk_12.g();
        if (brk_12 == null) {
            return;
        }
        if (brk_12.g() != null && brk_12.g().i() != null) {
            exk_22 = eyl_1.a(brk_12.g().i());
        } else {
            dgO2 = brk_12.a();
            exk_22 = exk_2.a((ezr_0)((Object)dgO2));
            exk_22.b((ezr_0)((Object)dgO2));
        }
        if (exk_22 == null) {
            return;
        }
        if (exk_22.aQ_()) {
            dgO2 = new dgO<bMi>(new bMi(exk_22));
            dgO2.a_(18168);
        } else {
            dgO2 = new dgK();
            dgO2.a((bMi)((Object)exk_22));
            dgO2.a_(16130);
        }
        dgO2.c(fyf_0.a().c());
        fvE fvE2 = (fvE)fck_22.e();
        dgO2.d(fck_22.w() + fvE2.getHeight());
        add_2.b().a(dgO2);
    }

    public static void purchase(fzs fzs2, bvk_1 bvk_12) {
        if (!(fzs2 instanceof fck_2)) {
            cGU.a(bvk_12);
            return;
        }
        fck_2 fck_22 = (fck_2)fzs2;
        brk_1 brk_12 = bvk_12.g();
        long l = brk_12 == null ? 1 : brk_12.a().o() / brk_12.b();
        long l2 = bvk_12.c();
        long l3 = Math.min(l2, l);
        if (l3 == 1L) {
            cGU.a(bvk_12);
            return;
        }
        cjk_0.setMaxQuantity(l3);
        cjk_0.setMessageType((short)18696);
        cjk_0.setExchangeEntryView(bvk_12);
        dgL dgL2 = new dgL();
        dgL2.f((short)1);
        dgL2.g((short)fck_22.v());
        dgL2.h((short)fck_22.w());
        dgL2.a_(18919);
        add_2.b().a(dgL2);
    }

    public static void checkIsAffordable(fzs fzs2) {
        bvo_1 bvo_12 = (bvo_1)fis_1.a().e("exchangeMachine");
        bvo_12.b();
    }

    public static void checkIsLearnable(fzs fzs2) {
        bvo_1 bvo_12 = (bvo_1)fis_1.a().e("exchangeMachine");
        bvo_12.c();
    }

    public static void changeTypeSelected(fcf_2 fcf_22) {
        if (!fcf_22.k() || !(fcf_22.l() instanceof bvt_1)) {
            return;
        }
        bvo_1 bvo_12 = (bvo_1)fis_1.a().e("exchangeMachine");
        bvo_12.a((bvt_1)fcf_22.l());
    }

    private static void a(bvk_1 bvk_12) {
        dgj_0 dgj_02 = new dgj_0();
        dgj_02.a(bvk_12);
        dgj_02.b((short)1);
        dgj_02.a_(18696);
        add_2.b().a(dgj_02);
    }

    public static void outExchange(fzs fzs2, fsk_0 fsk_02) {
        cGU.outExchange(fzs2, fsk_02, null);
    }

    public static void overExchange(fzs fzs2, fsk_0 fsk_02) {
        cGU.overExchange(fzs2, fsk_02, null);
    }

    public static void outExchange(fzs fzs2, fsk_0 fsk_02, fvE fvE2) {
        fsk_02.setDisplaySize(new fjf_2(46, 46));
        if (fvE2 != null) {
            fvE2.setVisible(false);
        }
    }

    public static void overExchange(fzs fzs2, fsk_0 fsk_02, fvE fvE2) {
        fsk_02.setDisplaySize(new fjf_2(50, 50));
        if (fvE2 != null) {
            fvE2.setVisible(true);
        }
    }

    public static void resetItemFilter(fzs fzs2, fug_0 fug_02) {
        fug_02.e();
    }

    public static void switchCharacter(fzs fzs2, bmr_1 bmr_12) {
        dfc dfc2 = new dfc();
        dfc2.a_(16539);
        dfc2.a(bmr_12);
        add_2.b().a(dfc2);
    }
}

