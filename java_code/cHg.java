/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@fpw_0
public class cHg {
    private static final Logger a = Logger.getLogger(cHg.class);
    public static final String PACKAGE = "wakfu.guidePopup";

    public static void nextPage(fck_2 fck_22, brr_2 brr_22) {
        dfc dfc2 = new dfc(18676);
        dfc2.a(brr_22);
        add_2.b().a(dfc2);
    }

    public static void previousPage(fck_2 fck_22, brr_2 brr_22) {
        dfc dfc2 = new dfc(17655);
        dfc2.a(brr_22);
        add_2.b().a(dfc2);
    }

    public static void setLeftArrowVisible(fck_2 fck_22, brr_2 brr_22, fso fso2) {
        if (brr_22 == null || !brr_22.b()) {
            return;
        }
        fso2.setVisible(true);
    }

    public static void setLeftArrowInvisible(fck_2 fck_22, brr_2 brr_22, fso fso2) {
        fso2.setVisible(false);
    }

    public static void setRightArrowVisible(fck_2 fck_22, brr_2 brr_22, fso fso2) {
        if (brr_22 == null || !brr_22.a()) {
            return;
        }
        fso2.setVisible(true);
    }

    public static void setRightArrowInvisible(fck_2 fck_22, brr_2 brr_22, fso fso2) {
        fso2.setVisible(false);
    }

    public static void close(fck_2 fck_22) {
        add_2.b().a(new dfc(18038));
    }
}

