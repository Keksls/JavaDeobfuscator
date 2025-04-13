/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eAr
 */
public class ear_0
implements eat_0 {
    private static final char a = '\u00b7';

    private static boolean a(char c2) {
        boolean bl = c2 >= '\u4e00' && c2 <= '\u9fa5';
        boolean bl2 = c2 >= '\u3041' && c2 <= '\u3096';
        return bl || bl2 || c2 == '\u00b7';
    }

    @Override
    public eak_0 a(@NotNull String string) {
        char[] cArray = string.toCharArray();
        for (int k = 0; k < cArray.length; ++k) {
            if (ear_0.a(cArray[k])) continue;
            return eai_0.a(eaj_0.d, cArray[k]);
        }
        if (string.length() < 2) {
            return eai_0.a(eaj_0.b);
        }
        if (string.length() > 10) {
            return eai_0.a(eaj_0.c);
        }
        if (ear_0.a(string, '\u00b7') > 1) {
            return eai_0.a(eaj_0.l, '\u00b7');
        }
        if (string.length() > 1 && (string.charAt(0) == '\u00b7' || string.charAt(string.length() - 1) == '\u00b7')) {
            return eai_0.a(eaj_0.n, '\u00b7');
        }
        return eai_0.a(eaj_0.a);
    }

    private static int a(String string, char c2) {
        int n = 0;
        int n2 = string.length();
        for (int k = 0; k < n2; ++k) {
            if (string.charAt(k) != c2) continue;
            ++n;
        }
        return n;
    }
}

