/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJZ
 */
@fpw_0
public class cjz_0 {
    public static final String PACKAGE = "wakfu.voteInformation";

    public static void voteFor(fzs fzs2, bUC bUC2) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null || bmr_12.a_() != bUC2.a().a()) {
            fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("nation.vote.voteFor.warning", new Object[0]), cfn_0.a(0), 25L, 102, 1);
            fzm_02.a(new cKa(bUC2));
        } else {
            dgY dgY2 = new dgY();
            dgY2.a_(17628);
            dgY2.a(bUC2);
            add_2.b().a(dgY2);
        }
    }

    public static void closeDialog(fzs fzs2) {
        azu_0.j().b(ddH.a());
    }

    public static void validate(fzs fzs2, fug_0 fug_02) {
        String string = fug_02.getText();
        String string2 = cby_2.b(string);
        if (string2.length() == 0 && string.length() != 0) {
            fpm_0.b().a(bae.h().a("error.censoredSentence", new Object[0]), cfn_0.a(1), 2L, 102, 1);
            return;
        }
        fug_02.c(string2);
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("nation.vote.candidateRegistration.warning", new Object[0]), cfn_0.a(0), 25L, 102, 1);
        fzm_02.a(new cKb(fug_02));
    }

    public static void onKeyPress(fzs fzs2) {
        if (fzs2.f() == frd_0.n) {
            fug_0 fug_02 = (fug_0)fzs2.e();
            if (!fug_02.n()) {
                return;
            }
            fcd_2 fcd_22 = (fcd_2)fzs2;
            Object object = fug_02.getText();
            int n = fcd_22.j() == '\n' ? 1 : 0;
            for (int k = 0; k < ((String)object).length(); ++k) {
                if (((String)object).charAt(k) != '\n' || ++n <= 3) continue;
                object = ((String)object).substring(0, k) + " " + ((String)object).substring(k + 1, ((String)object).length());
            }
            if (n > 3) {
                fug_02.c((String)object);
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("carriageReturnLimitError", new Object[0]), cfn_0.a(1), 1027L, 102, 1);
                fzm_02.a(new cKc(fug_02));
            }
            fis_1.a().a("electionSloganLength", (Object)bae.h().a("remainingLetters", 200 - fug_02.getText().length()));
            fis_1.a().a("electionSloganDirty", true);
        }
    }

    public static void previousPage(fzs fzs2) {
        dfc.d((short)16513);
    }

    public static void nextPage(fzs fzs2) {
        dfc.d((short)19930);
    }
}

