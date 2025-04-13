/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bVW
 */
public class bvw_0
implements ajh_1 {
    private static final bvw_0 f = new bvw_0();
    public static final String a = "uiScaleSliderValuesCount";
    public static final String b = "currentUiScaleText";
    public static final String d = "minUiScaleText";
    public static final String e = "maxUiScaleText";

    public static bvw_0 a() {
        return f;
    }

    private bvw_0() {
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "uiScaleSliderValuesCount": {
                return 26;
            }
            case "currentUiScaleText": {
                float f2 = ((bvx_0)ans_0.D().h()).c(agq_0.c);
                return "(" + bvw_0.a(f2) + ")";
            }
            case "minUiScaleText": {
                return bvw_0.a(-5.0f);
            }
            case "maxUiScaleText": {
                return bvw_0.a(20.0f);
            }
        }
        return null;
    }

    private static String a(float f2) {
        float f3 = 1.0f + fyX.a(f2);
        return Math.round(100.0f * f3) + "%";
    }

    @Override
    public String[] d() {
        return new String[]{b, a, d, e};
    }
}

