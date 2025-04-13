/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

public final class eAV {
    private static final Pattern b = Pattern.compile("[0-9a-fA-F]+");
    public static final int a = 16;

    private eAV() {
    }

    public static boolean a(String string) {
        return string != null && !string.isEmpty() && string.length() <= 16;
    }

    public static boolean b(String string) {
        if (string == null || string.isEmpty()) {
            return true;
        }
        if (string.length() != 6) {
            return false;
        }
        return b.matcher(string).matches();
    }
}

