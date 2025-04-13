/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

/*
 * Renamed from cSE
 */
public final class cse_1 {
    private static final Pattern a = Pattern.compile("^1[0-9]{3}0[1-3]$");

    private cse_1() {
    }

    public static boolean a(String string) {
        return a.matcher(string).matches();
    }
}

