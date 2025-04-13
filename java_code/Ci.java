/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

public final class Ci {
    private static final Pattern a = Pattern.compile("[\n\r]+");

    public static String a(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string;
        for (Cj cj : Cj.values()) {
            string2 = cj.j.matcher(string2).replaceAll(cj.k);
        }
        return string2;
    }

    private Ci() {
    }

    public static String b(String string) {
        if (string == null) {
            return null;
        }
        return a.matcher(string).replaceAll("");
    }
}

