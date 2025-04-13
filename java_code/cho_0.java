/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHo
 */
@fpw_0
public class cho_0 {
    public static final String PACKAGE = "wakfu.havenWorldEntrance";

    public static void selectHavenWorld(fcb_2 fcb_22) {
        bzd_2 bzd_22 = (bzd_2)fcb_22.j();
        dgd_0 dgd_02 = new dgd_0(bzd_22);
        add_2.b().a(dgd_02);
    }

    public static void enterHavenWorld(fck_2 fck_22) {
        add_2.b().a(new dfc(18691));
    }

    public static void openHavenWorld(fck_2 fck_22) {
        add_2.b().a(new dfc(18853));
    }

    public static void validNameFilter(fzs fzs2, fug_0 fug_02) {
        bze_2 bze_22 = (bze_2)fis_1.a().e("havenWorldViewList");
        bze_22.a(fug_02.getText());
    }

    public static void firstPage(fck_2 fck_22) {
        bze_2 bze_22 = (bze_2)fis_1.a().e("havenWorldViewList");
        if (bze_22 == null) {
            return;
        }
        bze_22.b();
    }

    public static void previousPage(fck_2 fck_22) {
        bze_2 bze_22 = (bze_2)fis_1.a().e("havenWorldViewList");
        if (bze_22 == null) {
            return;
        }
        bze_22.c();
    }

    public static void nextPage(fck_2 fck_22) {
        bze_2 bze_22 = (bze_2)fis_1.a().e("havenWorldViewList");
        if (bze_22 == null) {
            return;
        }
        bze_22.e();
    }

    public static void lastPage(fck_2 fck_22) {
        bze_2 bze_22 = (bze_2)fis_1.a().e("havenWorldViewList");
        if (bze_22 == null) {
            return;
        }
        bze_22.f();
    }

    public static void checkOpenedFilter(fzs fzs2) {
        ((bze_2)fis_1.a().e("havenWorldViewList")).i();
    }

    public static void checkGuildFilter(fzs fzs2) {
        ((bze_2)fis_1.a().e("havenWorldViewList")).k();
    }
}

