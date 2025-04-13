/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpU
 */
@fpw_0
public class fpu_0 {
    public static final String PACKAGE = "xulor";
    private static final fpv_0 a = new fpv_0();

    public static boolean unloadDialog(fzs fzs2) {
        Object t = fzs2.e();
        if (t != null) {
            String string = ((fyb_0)t).getElementMap().c();
            fpm_0.b().a(string, false);
        }
        return false;
    }

    public static void switchDrawer(fzs fzs2, fsy_0 fsy_02) {
        fsy_02.a();
    }

    private static boolean a(fvE fvE2, fil_1 fil_12, float f2, ful_0 ful_02) {
        if (ful_02 != null && !ful_02.isTextReduced()) {
            return false;
        }
        if (fvE2 != null && fil_12 != null && !fta_0.getInstance().isDragging()) {
            adi_2.a().a(a);
            a.a(fil_12);
            a.a(fvE2);
            if (f2 == 0.0f) {
                fil_12.b(fvE2);
            } else {
                adi_2.a().a(a, (long)(1000.0f * f2), -1, 1L);
            }
        }
        return false;
    }

    public static boolean popup(fzs fzs2, fil_1 fil_12, String string) {
        return fpu_0.a(fzs2, fil_12, Float.valueOf(string).floatValue());
    }

    private static abo_2<fil_1, fvE> a(fzs fzs2, fil_1 fil_12) {
        Object t = fzs2.e();
        if (!(t instanceof fvE)) {
            return null;
        }
        fvE fvE2 = (fvE)t;
        abo_2<fil_1, fvE> abo_22 = new abo_2<fil_1, fvE>();
        if (fvE2.getPopup() != null) {
            abo_22.a(fvE2.getPopup());
            abo_22.b(fvE2);
        } else if (fil_12 != null) {
            abo_22.a(fil_12);
            abo_22.b(fil_12.getParentOfType(fvE.class));
        }
        return abo_22;
    }

    private static boolean a(fzs fzs2, fil_1 fil_12, float f2) {
        abo_2<fil_1, fvE> abo_22 = fpu_0.a(fzs2, fil_12);
        if (abo_22 == null) {
            return false;
        }
        fpu_0.popup(abo_22.a(), abo_22.b(), f2);
        return false;
    }

    public static boolean popup(fzs fzs2) {
        Object t = fzs2.e();
        if (!(t instanceof fvE)) {
            return false;
        }
        fil_1 fil_12 = ((fvE)t).getPopup();
        if (fil_12 != null) {
            fpu_0.popup(fzs2, fil_12);
        }
        return false;
    }

    public static boolean popup(fzs fzs2, fil_1 fil_12) {
        return fpu_0.a(fzs2, fil_12, 0.0f);
    }

    public static boolean popup(fil_1 fil_12, fvE fvE2, float f2) {
        return fpu_0.a(fvE2, fil_12, f2, null);
    }

    public static boolean popup(fil_1 fil_12, fvE fvE2) {
        return fpu_0.popup(fil_12, fvE2, 0.0f);
    }

    public static boolean popup(fzs fzs2, fil_1 fil_12, fvE fvE2) {
        return fpu_0.popup(fil_12, fvE2);
    }

    public static boolean popupIfReduced(fzs fzs2, fil_1 fil_12, fvE fvE2, ful_0 ful_02) {
        return fpu_0.a(fvE2, fil_12, 0.0f, ful_02);
    }

    public static boolean popupIfReduced(fzs fzs2, fil_1 fil_12, ful_0 ful_02) {
        abo_2<fil_1, fvE> abo_22 = fpu_0.a(fzs2, fil_12);
        if (abo_22 == null) {
            return false;
        }
        return fpu_0.a(abo_22.b(), abo_22.a(), 0.0f, ful_02);
    }

    public static boolean popupIfReduced(fzs fzs2, fil_1 fil_12, ful_0 ful_02, String string) {
        abo_2<fil_1, fvE> abo_22 = fpu_0.a(fzs2, fil_12);
        if (abo_22 == null) {
            return false;
        }
        return fpu_0.a(abo_22.b(), abo_22.a(), Co.a((Object)string, 0.0f), ful_02);
    }

    public static boolean popupIfReduced(fzs fzs2, fil_1 fil_12, fvE fvE2, ful_0 ful_02, String string) {
        return fpu_0.a(fvE2, fil_12, Co.a((Object)string, 0.0f), ful_02);
    }

    public static boolean popup(fzs fzs2, fil_1 fil_12, fvE fvE2, String string) {
        return fpu_0.a(fvE2, fil_12, Co.a((Object)string, 0.0f), null);
    }

    public static boolean closePopup(fzs fzs2) {
        adi_2.a().a(a);
        fta_0.getInstance().getPopupContainer().b();
        return false;
    }

    public static boolean closePopup(fzs fzs2, fil_1 fil_12) {
        adi_2.a().a(a);
        fta_0.getInstance().getPopupContainer().b();
        return false;
    }

    public static boolean openClosePopup(fzs fzs2, fil_1 fil_12) {
        if (fta_0.getInstance().isDragging()) {
            return false;
        }
        Object t = fzs2.e();
        if (!(t instanceof fvE)) {
            return false;
        }
        fil_1 fil_13 = ((fvE)t).getPopup();
        if (fil_13 == null) {
            fil_13 = fil_12;
        }
        fil_13.a((fvE)t);
        return false;
    }

    public static void playSound(fzs fzs2, String string) {
        int n = Co.a((Object)string, -1);
        if (n != -1) {
            fza_0.a().a(n);
        }
    }

    public static boolean toggleVisible(fzs fzs2, fvE fvE2) {
        return fpu_0.toggleVisible(fvE2);
    }

    public static boolean toggleVisible(fvE fvE2) {
        if (fvE2 != null) {
            fvE2.setVisible(!fvE2.getVisible());
        }
        return false;
    }

    public static boolean setupLook(fzs fzs2, fvk_0 fvk_02, String string) {
        return false;
    }

    public static boolean foldUnfold(fzs fzs2) {
        fsf_0 fsf_02 = fzs2.e().getParentOfType(fsf_0.class);
        if (fsf_02 != null) {
            if (fsf_02.isFolded()) {
                fsf_02.b();
            } else {
                fsf_02.a();
            }
        }
        return false;
    }

    public static boolean unfold(fzs fzs2) {
        fsf_0 fsf_02 = fzs2.e().getParentOfType(fsf_0.class);
        if (fsf_02 != null && fsf_02.isFolded()) {
            fsf_02.b();
        }
        return false;
    }

    public static boolean fold(fzs fzs2) {
        fsf_0 fsf_02 = fzs2.e().getParentOfType(fsf_0.class);
        if (fsf_02 != null && !fsf_02.isFolded()) {
            fsf_02.a();
        }
        return false;
    }
}

