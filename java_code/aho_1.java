/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aHo
 */
class aho_1
extends ahc_2 {
    private final String a;
    private final String b;
    private final float c;
    private static final abj_2<Long, Float> d = new abj_2(0x100000);
    private static final int e = 4096;

    aho_1(String string, String string2, float f2) {
        this.a = string;
        this.b = string2;
        this.c = f2;
    }

    private int a(int n, int n2, int n3) {
        int n4 = n;
        if (n2 < n4) {
            n4 = n2;
        }
        if (n3 < n4) {
            n4 = n3;
        }
        return n4;
    }

    public int a(String string, String string2) {
        int n;
        int n2;
        byte[] byArray = string.getBytes();
        byte[] byArray2 = string2.getBytes();
        int n3 = Math.min(byArray.length, 4096);
        int n4 = Math.min(byArray2.length, 4096);
        if (n3 == 0) {
            return n4;
        }
        if (n4 == 0) {
            return n3;
        }
        int[][] nArray = new int[n3 + 1][n4 + 1];
        for (n2 = 0; n2 <= n3; ++n2) {
            nArray[n2][0] = n2;
        }
        for (n = 0; n <= n4; ++n) {
            nArray[0][n] = n;
        }
        for (n2 = 1; n2 <= n3; ++n2) {
            byte by = byArray[n2 - 1];
            for (n = 1; n <= n4; ++n) {
                byte by2 = byArray2[n - 1];
                int n5 = by == by2 ? 0 : 1;
                nArray[n2][n] = this.a(nArray[n2 - 1][n] + 1, nArray[n2][n - 1] + 1, nArray[n2 - 1][n - 1] + n5);
            }
        }
        return nArray[n3][n4];
    }

    @Override
    boolean a(HashMap<String, Object> hashMap) {
        String string = (String)hashMap.get(this.a);
        if (string != null) {
            float f2;
            long l;
            if (string.equals(this.b)) {
                return true;
            }
            long l2 = (long)this.b.hashCode() & 0xFFFFFFFFL;
            long l3 = l2 << 32 | (l = (long)string.hashCode() & 0xFFFFFFFFL);
            Float f3 = d.a(l3);
            if (f3 != null) {
                f2 = f3.floatValue();
            } else {
                int n = Math.max(string.length(), this.b.length());
                int n2 = this.a(string, this.b);
                f2 = (float)n2 / (float)n;
                d.a(l3, Float.valueOf(f2));
            }
            return f2 < this.c;
        }
        return false;
    }
}

