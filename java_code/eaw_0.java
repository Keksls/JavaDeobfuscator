/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eAw
 */
public class eaw_0
implements eat_0 {
    private static boolean a(char c2) {
        return c2 >= '\u0e00' && c2 <= '\u0e7f';
    }

    @Override
    public eak_0 a(@NotNull String string) {
        char[] cArray = string.toCharArray();
        for (int k = 0; k < cArray.length; ++k) {
            if (eaw_0.a(cArray[k])) continue;
            return eai_0.a(eaj_0.d, cArray[k]);
        }
        if (string.length() < 3) {
            return eai_0.a(eaj_0.b);
        }
        if (string.length() > 25) {
            return eai_0.a(eaj_0.c);
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

