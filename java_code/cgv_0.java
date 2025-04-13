/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGv
 */
@fpw_0
public class cgv_0 {
    public static final String PACKAGE = "wakfu.craftTable";

    public static void openItemDetailWindow(fcb_2 fcb_22, fvk_0 fvk_02) {
        cgo_0.openItemDetailWindow(fcb_22, fvk_02);
    }

    public static void inventoryDragItem(fzs fzs2, exk_2 exk_22) {
        dfF dfF2 = new dfF(exk_22.aT_());
        add_2.b().a(dfF2);
    }

    public static void inventoryDropOutItem(fzs fzs2) {
        cXC.a().a(false);
    }

    public static void dropIngredient(fcv_2 fcv_22) {
        Object object = fcv_22.n();
        if (object instanceof brk_1) {
            cgv_0.a((brk_1)object);
        }
    }

    public static void dropItem(fcv_2 fcv_22) {
        Object object = fcv_22.n();
        if (object instanceof brk_1) {
            cgv_0.a((brk_1)object);
        }
        boolean bl = fcv_22.t();
        boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe.P);
        exk_2 exk_22 = (exk_2)object;
        if (exk_22.e() > 1 && bl ^ bl2) {
            cjk_0.setMaxQuantity(exk_22.e());
            cjk_0.setMessageType((short)16071);
            cjk_0.setItem(exk_22);
            dgL dgL2 = new dgL();
            dgL2.a(exk_22);
            dgL2.g((short)fcv_22.v());
            dgL2.h((short)fcv_22.w());
            dgL2.a_(18919);
            add_2.b().a(dgL2);
        } else {
            dgL dgL3 = new dgL();
            dgL3.a(exk_22);
            dgL3.f((short)-1);
            dgL3.a_(16071);
            add_2.b().a(dgL3);
        }
    }

    public static void itemDropOut(fcx_1 fcx_12) {
        cgv_0.a((brk_1)fcx_12.l());
    }

    private static void a(brk_1 brk_12) {
        cgv_0.a(brk_12, (short)-1);
    }

    private static void a(brk_1 brk_12, short s2) {
        dfG dfG2 = new dfG(brk_12);
        dfG2.a(s2);
        add_2.b().a(dfG2);
    }

    public static void removeIngredient(fcb_2 fcb_22) {
        cgv_0.a((brk_1)fcb_22.j(), (short)1);
    }

    public static void addIngredient(fcb_2 fcb_22) {
        dgL dgL2 = new dgL();
        dgL2.a((exk_2)fcb_22.j());
        dgL2.f((short)1);
        dgL2.a_(16071);
        add_2.b().a(dgL2);
    }

    public static void selectRecipe(fck_2 fck_22, fvk_0 fvk_02, brw_0 brw_02) {
        if (fck_22.x() == 3) {
            cgu_0.openProducedItemDescription(fck_22, brw_02, fvk_02);
            return;
        }
        dfI dfI2 = new dfI(brw_02);
        add_2.b().a(dfI2);
    }

    public static void startCraft(fck_2 fck_22, ftv ftv2) {
        boolean bl = fis_1.a().c("craftRunning");
        if (fck_22.x() != 1) {
            fup_0 fup_02 = (fup_0)fck_22.e();
            fup_02.setSelected(bl);
            return;
        }
        if (bl) {
            dfc.d((short)16332);
        } else {
            add_2.b().a(new dfj_0(ftv2, (fup_0)fck_22.d()));
        }
    }

    public static boolean setCurrentCraftNumber(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        if (string.length() == 0) {
            return true;
        }
        int n = Integer.parseInt(string);
        dfc dfc2 = new dfc();
        dfc2.b(n);
        dfc2.a_(17619);
        add_2.b().a(dfc2);
        return true;
    }

    public static boolean setCurrentCraftMaxNumber(fzs fzs2) {
        dfc.d((short)17495);
        return true;
    }

    public static void changeItemBackground(fck_2 fck_22, exk_2 exk_22) {
        cgv_0.changeItemBackground(fck_22, exk_22, null);
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
                string = ((bjw_1)exk_22.T()).h() ? "itemSetSelectedBackground" : "itemBackground";
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
}

