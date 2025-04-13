/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cJg {
    public static final String PACKAGE = "wakfu.passport";

    public static void selectTitle(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            bQF bQF2 = (bQF)fcf_22.l();
            dfc dfc2 = new dfc();
            dfc2.a_(16240);
            dfc2.a(bQF2.a());
            add_2.b().a(dfc2);
        }
    }

    public static void removeNewFlagOfTitle(fcb_2 fcb_22) {
        bQF bQF2 = (bQF)fcb_22.j();
        if (!bQF2.b()) {
            return;
        }
        dfc dfc2 = new dfc();
        dfc2.a_(16766);
        dfc2.a(bQF2);
        add_2.b().a(dfc2);
    }

    public static void setViewMode(fzs fzs2, String string) {
        int n = Co.a((Object)string, 0);
        fis_1.a().a("passportViewMode", n);
    }

    public static void setCategory(fzs fzs2, String string) {
        int n = Co.a((Object)string, 0);
        fis_1.a().a("passportCategory", n);
    }

    public static void previousSecretPage(fzs fzs2, bOn bOn2) {
        bOn2.a();
    }

    public static void nextSecretPage(fzs fzs2, bOn bOn2) {
        bOn2.b();
    }
}

