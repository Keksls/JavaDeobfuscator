/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHW
 */
public class ahw_2 {
    private static final String[] a = new String[]{"I", "V", "X", "L", "C", "D", "M"};
    private static final String[] b = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] c = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] d = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] e = new String[]{"", "M", "MM", "MMM", "", "", "", "", "", ""};

    static boolean a(String string) {
        for (int k = 0; k < string.length(); ++k) {
            boolean bl = false;
            for (int i2 = 0; i2 < a.length; ++i2) {
                if (!string.substring(k, k + 1).equals(a[i2])) continue;
                bl = true;
            }
            if (bl) continue;
            return false;
        }
        return true;
    }

    static boolean a(int n) {
        return n > 0 && n <= 39999;
    }

    static int a(char c2) {
        switch (c2) {
            case 'I': {
                return 1;
            }
            case 'V': {
                return 5;
            }
            case 'X': {
                return 10;
            }
            case 'L': {
                return 50;
            }
            case 'C': {
                return 100;
            }
            case 'D': {
                return 500;
            }
            case 'M': {
                return 1000;
            }
        }
        return 0;
    }

    public static String b(int n) {
        if (ahw_2.a(n)) {
            if (n >= 0 && n <= 9) {
                return b[n];
            }
            if (n >= 10 && n <= 99) {
                return c[n / 10] + b[n % 10];
            }
            if (n >= 100 && n <= 999) {
                return d[n / 100] + c[n / 10 % 10] + b[n % 10];
            }
            if (n >= 1000 && n <= 3999) {
                return e[n / 1000] + d[n / 100 % 10] + c[n / 10 % 10] + b[n % 10];
            }
        }
        return "";
    }

    public static int b(String string) {
        int n = 0;
        int n2 = 0;
        if (ahw_2.a(string)) {
            for (int k = 0; k < string.length(); ++k) {
                int n3 = ahw_2.a(string.toCharArray()[k]);
                n2 = n3 > n ? (n2 += n3 - (n << 1)) : (n2 += n3);
                n = n3;
            }
        } else {
            return -1;
        }
        return n2;
    }
}

