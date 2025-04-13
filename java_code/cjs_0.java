/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJs
 */
@fpw_0
public class cjs_0 {
    public static final String PACKAGE = "wakfu.roomAdministration";

    public static void changeGuildPerms(fzs fzs2, bsa_1 bsa_12) {
        dfq_0 dfq_02 = new dfq_0();
        dfq_02.a_(18075);
        dfq_02.b(bsa_12.a());
        dfq_02.a(!bsa_12.a(ffp.b));
        dfq_02.a(bsa_12);
        add_2.b().a(dfq_02);
    }

    public static void changeAnonymousPerms(fzs fzs2, bsa_1 bsa_12) {
        dfq_0 dfq_02 = new dfq_0();
        dfq_02.a_(19014);
        dfq_02.b(bsa_12.a());
        dfq_02.a(!bsa_12.a(ffp.a));
        dfq_02.a(bsa_12);
        add_2.b().a(dfq_02);
    }

    public static void addPermission(fzs fzs2, fug_0 fug_02) {
        if (fzs2.f() == frd_0.C || fzs2.f() == frd_0.n && ((fcd_2)fzs2).k() == 10) {
            dfc dfc2 = new dfc();
            dfc2.a_(19814);
            dfc2.a(fug_02.getText());
            add_2.b().a(dfc2);
            fug_02.c("");
        }
    }

    public static void removePermission(fzs fzs2, Long l) {
        dfc dfc2 = new dfc();
        dfc2.a_(17908);
        dfc2.a(l);
        add_2.b().a(dfc2);
    }

    public static void changeIndividualPerms(fcp_2 fcp_22, Long l, bsa_1 bsa_12) {
        dfq_0 dfq_02 = new dfq_0();
        dfq_02.a_(17542);
        dfq_02.b(bsa_12.a());
        dfq_02.a(l);
        dfq_02.a(fcp_22.j());
        dfq_02.a(bsa_12);
        add_2.b().a(dfq_02);
    }
}

