/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cJV {
    public static final String PACKAGE = "wakfu.tutorialBook";

    public static void launchTutorial(fcb_2 fcb_22) {
        cJV.launchTutorial(fcb_22, (brg_2)fcb_22.j());
    }

    public static void launchTutorial(fzs fzs2, brg_2 brg_22) {
        if (brg_22.c()) {
            dfc dfc2 = new dfc();
            ((adt_1)dfc2).a_(19914);
            add_2.b().a(dfc2);
        } else {
            brg_22.b();
        }
    }

    public static void searchTutorial(fzs fzs2) {
        fug_0 fug_02 = (fug_0)fzs2.e();
        fis_1.a().a("tutorialSearchDirty", fug_02.getText().length() > 0);
        cJV.searchTutorial(fzs2, fug_02);
    }

    public static void searchTutorial(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        if (string != null) {
            dfc dfc2 = new dfc();
            dfc2.a_(18877);
            dfc2.a(string);
            add_2.b().a(dfc2);
        }
    }

    public static void setPreviousTutorialPage(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(19262);
        add_2.b().a(dfc2);
    }

    public static void setNextTutorialPage(fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(18867);
        add_2.b().a(dfc2);
    }

    public static void clearSearch(fzs fzs2, fug_0 fug_02) {
        dfc dfc2 = new dfc();
        dfc2.a_(18877);
        dfc2.a((String)null);
        add_2.b().a(dfc2);
        fug_02.e();
    }
}

