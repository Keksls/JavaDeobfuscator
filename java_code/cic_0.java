/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cIc
 */
@fpw_0
public class cic_0 {
    public static final String PACKAGE = "wakfu.nationPvpLadder";

    public static void first(fzs fzs2) {
        dfc.d((short)17896);
    }

    public static void previous(fzs fzs2) {
        dfc.d((short)18636);
    }

    public static void next(fzs fzs2) {
        dfc.d((short)18794);
    }

    public static void last(fzs fzs2) {
        dfc.d((short)19423);
    }

    public static void selectFilter(fcp_2 fcp_22, bnr_0 bnr_02) {
        if (fcp_22.j()) {
            dfc dfc2 = new dfc(16653);
            dfc2.a(bnr_02);
            add_2.b().a(dfc2);
        }
    }

    public static void selectBreed(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(17374);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void selectNation(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(18624);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void openPvpLadderEntry(fzs fzs2, bno_0 bno_02) {
        dfc dfc2 = new dfc(17856);
        dfc2.a(bno_02);
        add_2.b().a(dfc2);
    }

    public static void search(fcd_2 fcd_22) {
        if (fcd_22.f() == frd_0.n && fcd_22.k() == 10) {
            ful_0 ful_02 = (ful_0)fcd_22.e();
            cic_0.a(ful_02);
        }
    }

    public static void search(fzs fzs2, fug_0 fug_02) {
        cic_0.a(fug_02);
    }

    private static void a(ful_0 ful_02) {
        String string = ful_02.getText();
        if (string.isEmpty()) {
            bnp_0.b.c();
            return;
        }
        dfc dfc2 = new dfc(18410);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void resetSearch(fzs fzs2, fug_0 fug_02) {
        dfc.d((short)19622);
        fug_02.e();
    }
}

