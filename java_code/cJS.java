/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@fpw_0
public class cJS {
    public static final String PACKAGE = "wakfu.themeInfo";
    public static final String a = "colorPickerValue";
    public static final String b = "colorPickerPreview";
    public static final String c = "colorPickerHexPreview";
    private static final Logger d = LoggerFactory.getLogger(cJS.class);

    public static void copyToClipBoard(fck_2 fck_22, String string) {
        cJS.a(string);
    }

    public static void copyToClipBoard(fck_2 fck_22) {
        if (!(fck_22.e() instanceof ful_0)) {
            return;
        }
        String string = ((ful_0)fck_22.e()).getText();
        cJS.a(string);
    }

    private static void a(String string) {
        ca_0.a(string);
        aul_0.a().c(string + " copied to clipboard");
    }

    public static void pasteCodeAndApply(fzs fzs2, fug_0 fug_02) {
        if (fug_02 == null) {
            return;
        }
        Optional<String> optional = ca_0.a();
        if (optional.isEmpty()) {
            return;
        }
        fug_02.setText(optional);
        cJS.a(fug_02, optional.get());
    }

    public static void applyColor(fct_1 fct_12) {
        azj_2 azj_22 = (azj_2)fct_12.j();
        cJS.a(azj_22, ((fyb_0)fct_12.e()).getElementMap());
    }

    public static void convertColorCode(fcz_1 fcz_12) {
        if (fcz_12.j()) {
            return;
        }
        fug_0 fug_02 = (fug_0)fcz_12.e();
        String string = fug_02.getText();
        cJS.a(fug_02, string);
    }

    public static void convertColorCode(fcd_2 fcd_22) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        String string = fug_02.getText();
        cJS.a(fug_02, string);
    }

    private static void a(fug_0 fug_02, String string) {
        if (string == null || string.isEmpty()) {
            return;
        }
        azj_2 azj_22 = fyg.d.a(string);
        if (azj_22 == null) {
            return;
        }
        cJS.a(azj_22, fug_02.getElementMap());
        fis_1.a().a(a, (Object)azj_22, "themeInfoDialog");
    }

    private static void a(azj_2 azj_22, fyy_0 fyy_02) {
        fis_1.a().a(b, (Object)azj_22, "themeInfoDialog");
        fis_1.a().a(c, (Object)azj_22.w().toUpperCase(), "themeInfoDialog");
        ((ful_0)fyy_02.a("colorCodeHex")).c("#" + azj_22.w().toUpperCase());
        ((ful_0)fyy_02.a("colorCodeFloat")).c(String.format("%s,%s,%s,%s", Float.valueOf(Hw.a(azj_22.q(), 2)), Float.valueOf(Hw.a(azj_22.r(), 2)), Float.valueOf(Hw.a(azj_22.s(), 2)), Float.valueOf(Hw.a(azj_22.p(), 2))));
        ((ful_0)fyy_02.a("colorCodeInt")).c(String.format("%s,%s,%s,%s", azj_22.c(), azj_22.d(), azj_22.e(), azj_22.b()));
    }

    public static void toggleNetId(fzs fzs2, fvE fvE2, String string) {
        String string2 = fvE2.getNetEnabledId();
        if (string2 == null) {
            return;
        }
        boolean bl = fzw_0.a.a(string2);
        if (!bl) {
            fzw_0.a.b(string2);
            fzw_0.a.a(string2, fvE2);
        }
        d.info("Disable following group : " + string2);
        fzw_0.a.a(string2, false);
        ado_1.a().a(() -> {
            d.info("Enable following group : " + string2);
            fzw_0.a.a(string2, true);
            if (!bl) {
                fzw_0.a.b(string2, fvE2);
                fzw_0.a.c(string2);
            }
        }, Integer.parseInt(string), 1);
    }

    public static void saveTextChange(fzs fzs2, fxz fxz2, cea_2 cea_22) {
        cea_22.a(fxz2.getText());
        d.info("Text updated !");
    }

    public static void notifyTextChange(fzs fzs2, cea_2 cea_22) {
        cJS.notifyTextChange(fzs2, cea_22, null);
    }

    public static void notifyTextChange(fzs fzs2, cea_2 cea_22, @Nullable String string) {
        Runnable runnable = () -> {
            cea_22.b();
            d.info(String.format("Text change notify ! (Event : %s, timeBeforeNotify : %s)", fzs2, string));
        };
        if (string == null) {
            runnable.run();
        } else {
            ado_1.a().a(runnable, Integer.parseInt(string), 1);
            d.info(String.format("Text change notification scheduled in %s ms.", string));
        }
    }
}

