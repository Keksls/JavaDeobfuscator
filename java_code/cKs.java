/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cKs {
    public static final String PACKAGE = "wakfu.zaap";

    public static void onKeyType(fcd_2 fcd_22) {
        if (fcd_22.f() == frd_0.p) {
            fug_0 fug_02 = (fug_0)fcd_22.e();
            String string = fug_02.getText();
            if (fcd_22.j() == '\n') {
                dfc dfc2 = new dfc();
                dfc2.a_(17128);
                dfc2.a(string);
                add_2.b().a(dfc2);
                return;
            }
            dfc dfc3 = new dfc();
            dfc3.a_(17165);
            dfc3.a(string);
            add_2.b().a(dfc3);
        }
    }

    public static void selectZaap(fzs fzs2, bqo_0 bqo_02) {
        dfc dfc2 = new dfc();
        dfc2.a_(17770);
        dfc2.a(bqo_02.a());
        add_2.b().a(dfc2);
    }

    public static void toggleFavourite(fck_2 fck_22, bqo_0 bqo_02) {
        dfc dfc2 = new dfc();
        dfc2.a_(18370);
        dfc2.a(bqo_02.a());
        add_2.b().a(dfc2);
    }
}

