/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFz
 */
public class afz_2 {
    private static final String a = ";";
    private static final String b = ":";

    public static String a(afx_2 afx_22) {
        StringBuilder stringBuilder = new StringBuilder();
        afz_2.a(stringBuilder, afx_22);
        afz_2.b(stringBuilder, afx_22);
        for (int k = 0; k < afx_22.j(); ++k) {
            afz_2.a(stringBuilder, afx_22.a(k));
        }
        return stringBuilder.toString();
    }

    public static afx_2 a(String string) {
        afx_2 afx_22 = new afx_2("");
        return afz_2.a(afx_22, string) ? afx_22 : null;
    }

    public static boolean a(afx_2 afx_22, String string) {
        if (string == null) {
            afx_22.h();
            return false;
        }
        afx_22.k();
        try {
            String[] stringArray;
            for (String string2 : stringArray = string.split(a)) {
                String[] stringArray2 = string2.split(b);
                afz_2.a(afx_22, stringArray2[0], stringArray2[1]);
            }
            afx_22.i();
        }
        catch (Exception exception) {
            afx_22.h();
        }
        return true;
    }

    private static void a(afx_2 afx_22, String string, String string2) {
        if (string.equals("bounds")) {
            afz_2.b(afx_22, string2);
        } else if (string.equals("point")) {
            afz_2.c(afx_22, string2);
        } else if (string.equals("name")) {
            afx_22.a(string2);
        }
    }

    private static void a(StringBuilder stringBuilder, afx_2 afx_22) {
        stringBuilder.append("name").append(b);
        stringBuilder.append(afx_22.c());
        stringBuilder.append(a);
    }

    private static void b(StringBuilder stringBuilder, afx_2 afx_22) {
        stringBuilder.append("bounds").append(b);
        stringBuilder.append(afx_22.d()).append(",");
        stringBuilder.append(afx_22.f()).append(",");
        stringBuilder.append(afx_22.e()).append(",");
        stringBuilder.append(afx_22.g());
        stringBuilder.append(a);
    }

    private static void b(afx_2 afx_22, String string) {
        String[] stringArray = string.split(",");
        double d2 = Double.parseDouble(stringArray[0]);
        double d3 = Double.parseDouble(stringArray[1]);
        double d4 = Double.parseDouble(stringArray[2]);
        double d5 = Double.parseDouble(stringArray[3]);
        afx_22.a(d2, d3, d4, d5);
    }

    private static void a(StringBuilder stringBuilder, afu_2 afu_22) {
        stringBuilder.append("point").append(b);
        stringBuilder.append(afu_22.a()).append(",").append(afu_22.b());
        if (afu_22.h()) {
            stringBuilder.append(",").append("i").append(",").append(afu_22.c()).append(",").append(afu_22.d());
        }
        if (afu_22.i()) {
            stringBuilder.append(",").append("o").append(",").append(afu_22.e()).append(",").append(afu_22.f());
        }
        stringBuilder.append(a);
    }

    private static void c(afx_2 afx_22, String string) {
        String[] stringArray = string.split(",");
        double d2 = Double.parseDouble(stringArray[0]);
        double d3 = Double.parseDouble(stringArray[1]);
        afu_2 afu_22 = new afu_2(d2, d3);
        if (stringArray.length > 2) {
            afz_2.a(afu_22, stringArray, 2);
        }
        if (stringArray.length > 5) {
            afz_2.a(afu_22, stringArray, 5);
        }
        afx_22.a(afu_22);
    }

    private static void a(afu_2 afu_22, String[] stringArray, int n) {
        double d2 = Double.parseDouble(stringArray[n + 1]);
        double d3 = Double.parseDouble(stringArray[n + 2]);
        if (stringArray[n].equals("i")) {
            afu_22.b(d2, d3);
            return;
        }
        if (stringArray[n].equals("o")) {
            afu_22.c(d2, d3);
            return;
        }
    }
}

