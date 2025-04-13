/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eAs
 */
public class eas_0
implements eat_0 {
    private static char[] a;
    private static char[] b;
    private static final char[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    private static boolean a(char c2) {
        return Arrays.binarySearch(a, c2) >= 0;
    }

    private static boolean b(char c2) {
        return Arrays.binarySearch(b, c2) >= 0;
    }

    private static boolean c(char c2) {
        return Arrays.binarySearch(c, c2) >= 0;
    }

    private static boolean d(char c2) {
        return eas_0.b(c2) || eas_0.a(c2) || eas_0.c(c2);
    }

    private static boolean a(Character c2, Character c3) {
        return Cz.e(c2.toString()).equals(Cz.e(c3.toString()));
    }

    public eas_0(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        this.d = n;
        this.e = n2;
        this.f = n3;
        this.g = n4;
        this.h = n5;
        this.i = n6;
        this.j = n7;
        this.k = n8;
        this.l = n9;
        this.m = n10;
    }

    @Override
    public eak_0 a(@NotNull String string) {
        String[] stringArray;
        int n;
        int n2;
        char[] cArray = string.toCharArray();
        for (n2 = 0; n2 < cArray.length; ++n2) {
            if (eas_0.d(cArray[n2])) continue;
            return eai_0.a(eaj_0.d, cArray[n2]);
        }
        if (string.length() < this.d) {
            return eai_0.a(eaj_0.b);
        }
        if (string.length() > this.e) {
            return eai_0.a(eaj_0.c);
        }
        n2 = 0;
        int n3 = 0;
        int n4 = 1;
        int n5 = 0;
        int n6 = 47;
        for (int k = 0; k < cArray.length; ++k) {
            n = cArray[k];
            if (eas_0.a((char)n)) {
                ++n2;
                n3 = 0;
            } else if (eas_0.b((char)n)) {
                ++n3;
                n2 = 0;
            } else {
                ++n5;
                n3 = 0;
                n2 = 0;
            }
            n4 = eas_0.a(Character.valueOf((char)n6), Character.valueOf((char)n)) ? ++n4 : 1;
            n6 = n;
            if (n2 > this.f) {
                return eai_0.a(eaj_0.f);
            }
            if (n3 > this.g) {
                return eai_0.a(eaj_0.e);
            }
            if (n4 > this.h) {
                return eai_0.a(eaj_0.g);
            }
            if (n5 <= this.i) continue;
            return eai_0.a(eaj_0.l);
        }
        String[] stringArray2 = string.split("([ -])");
        for (n = 0; n < stringArray2.length; ++n) {
            n5 = 0;
            n3 = 0;
            n2 = 0;
            char[] objectArray = stringArray2[n].toCharArray();
            for (int k = 0; k < objectArray.length; ++k) {
                if (eas_0.a(objectArray[k])) {
                    ++n2;
                    continue;
                }
                if (eas_0.b(objectArray[k])) {
                    ++n3;
                    continue;
                }
                if (!eas_0.c(objectArray[k])) continue;
                ++n5;
            }
            if (n2 < this.j) {
                return eai_0.a(eaj_0.h);
            }
            if (n3 < this.k) {
                return eai_0.a(eaj_0.i);
            }
            if (n5 > this.l) {
                return eai_0.a(eaj_0.j);
            }
            if (objectArray.length <= this.m) continue;
            return eai_0.a(eaj_0.k);
        }
        if (string.length() > 1 && (string.charAt(0) == '-' || string.charAt(string.length() - 1) == '-')) {
            return eai_0.a(eaj_0.n);
        }
        for (String string2 : stringArray = string.split("[ \\-']")) {
            if (string2.length() >= 1 && !Character.isLowerCase(string2.charAt(0)) && string2.substring(1).equals(string2.substring(1).toLowerCase())) continue;
            return eai_0.a(eaj_0.o);
        }
        return eai_0.a(eaj_0.a);
    }

    static {
        int n;
        a = new char[]{'a', 'e', 'i', 'o', 'u', 'y', '\u00e9', '\u00e8', '\u00eb', '\u00ea', '\u00e2', '\u00e4', '\u00fc', '\u00fb', '\u00f9', '\u00f4', '\u00f6', '\u00ee', '\u00ef'};
        b = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        c = new char[]{' ', '-', '\''};
        char[] cArray = new char[a.length * 2];
        System.arraycopy(a, 0, cArray, 0, a.length);
        for (n = 0; n < a.length; ++n) {
            cArray[eas_0.a.length + n] = Character.toUpperCase(a[n]);
        }
        a = cArray;
        cArray = new char[b.length * 2];
        System.arraycopy(b, 0, cArray, 0, b.length);
        for (n = 0; n < b.length; ++n) {
            cArray[eas_0.b.length + n] = Character.toUpperCase(b[n]);
        }
        b = cArray;
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
    }
}

