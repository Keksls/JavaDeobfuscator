/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHV
 */
public class ahv_2 {
    private static final String[] c = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    private static final int[] d = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    public static final int a = 1;
    public static final int b = 3999;
    private static final int e = 16;
    private static final StringBuilder f = new StringBuilder(16);

    public static String a(int n) {
        if (n < 1 || 3999 < n) {
            throw new IllegalArgumentException();
        }
        int n2 = n;
        for (int k = d.length - 1; 0 <= k; --k) {
            int n3 = d[k];
            while (n2 >= n3) {
                f.append(c[k]);
                n2 -= n3;
            }
        }
        String string = f.toString();
        f.delete(0, f.length());
        return string;
    }
}

