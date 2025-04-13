/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkp
 */
public final class bkp_2 {
    private static final String a = "-";
    private static final String b = ":";
    private static final String c = "[^0-9:-]";
    private static final int d = 200;

    private bkp_2() {
    }

    @NotNull
    @Contract(pure=true)
    public static String a(@Nullable ezx_2 ezx_22) {
        if (ezx_22 == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        ezx_22.d().forEach((n, s2) -> {
            if (s2 > 0) {
                stringBuilder.append(n).append(b).append(s2).append(a);
            }
        });
        if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    @NotNull
    @Contract(pure=true)
    public static ezx_2 a(@NotNull String string) {
        String[] stringArray;
        ezu_1 ezu_12 = new ezu_1();
        for (String string2 : stringArray = bkp_2.b(string).split(a)) {
            String[] stringArray2 = string2.split(b);
            if (stringArray2.length < 2) continue;
            try {
                int n = Integer.parseInt(stringArray2[0]);
                short s2 = Short.parseShort(stringArray2[1]);
                if (!ezh_2.a.b(n) || s2 <= 0) continue;
                ezu_12.a(n, s2);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return ezu_12;
    }

    @NotNull
    @Contract(pure=true)
    public static String b(@NotNull String string) {
        String string2 = string.replaceAll(c, "");
        if (string2.length() > 200) {
            return string2.substring(0, 200);
        }
        return string2;
    }
}

