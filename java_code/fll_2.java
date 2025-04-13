/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLL
 */
class fll_2 {
    fll_2() {
    }

    static int a(int n) {
        int n2 = 0;
        while (n != 0) {
            ++n2;
            n >>>= 1;
        }
        return n2;
    }

    static int b(int n) {
        int n2 = 0;
        while (n > 1) {
            ++n2;
            n >>>= 1;
        }
        return n2;
    }

    static int c(int n) {
        int n2 = 0;
        while (n != 0) {
            n2 += n & 1;
            n >>>= 1;
        }
        return n2;
    }
}

