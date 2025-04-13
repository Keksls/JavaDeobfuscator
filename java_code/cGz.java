/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.text.ParseException;
import org.jetbrains.annotations.Nullable;

@fpw_0
public class cGz {
    public static final String PACKAGE = "wakfu.dimensionalBag.craftFee";
    public static final String a = "equipment";

    public static void toggleFreeForGuild(fcp_2 fcp_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(19187);
        dfc2.a(fcp_22.j());
        add_2.b().a(dfc2);
    }

    public static void toggleStepsFallthroughEnabled(fcp_2 fcp_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(18069);
        dfc2.a(fcp_22.j());
        add_2.b().a(dfc2);
    }

    public static void onFeeChanged(fcz_1 fcz_12, bsl_1 bsl_12) {
        if (!fcz_12.j()) {
            cGz.a((fug_0)fcz_12.e(), bsl_12, true);
        }
    }

    public static void onFeeChanged(fcd_2 fcd_22, bsl_1 bsl_12) {
        cGz.a((fug_0)fcd_22.e(), bsl_12, false);
    }

    private static void a(fug_0 fug_02, bsl_1 bsl_12, boolean bl) {
        add_2.b().a(new dhv(bsl_12.a(), a.equals(fug_02.getId()), cGz.a(fug_02), bl));
    }

    @Nullable
    protected static Integer a(fug_0 fug_02) {
        String string = fug_02.getText();
        if (string.isEmpty()) {
            return null;
        }
        try {
            int n = bae.h().g(string);
            return Hw.a(n, 0, 2000000000);
        }
        catch (ParseException parseException) {
            return 0;
        }
    }

    public static void clearFeeForStep(fck_2 fck_22, bsl_1 bsl_12) {
        add_2.b().a(new dhw(bsl_12.a()));
    }

    public static void toggleOverriddenDialog(fzs fzs2) {
        add_2.b().a(new dfc(16785));
    }

    public static void onFeeChanged(fcz_1 fcz_12, bsz_2 bsz_22) {
        if (!fcz_12.j()) {
            cGz.a((fug_0)fcz_12.e(), bsz_22, true);
        }
    }

    public static void onFeeChanged(fcd_2 fcd_22, bsz_2 bsz_22) {
        cGz.a((fug_0)fcd_22.e(), bsz_22, false);
    }

    private static void a(fug_0 fug_02, bsz_2 bsz_22, boolean bl) {
        add_2.b().a(new dhu(bsz_22.g().e(), cGz.a(fug_02), bl));
    }

    public static void resetOverriddenFeesFilter(fzs fzs2, fug_0 fug_02) {
        fug_02.e();
    }

    public static void displayInfo(fck_2 fck_22, bsz_2 bsz_22) {
        if (fck_22.x() != 3) {
            return;
        }
        dfc dfc2 = new dfc(17960);
        dfc2.a(bsz_22.g());
        add_2.b().a(dfc2);
    }
}

