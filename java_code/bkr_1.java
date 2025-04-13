/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkR
 */
public enum bkr_1 {
    a(0, 0, new int[]{104, 105, 106, 107}),
    b(1, 1, new int[]{104, 105, 106, 107}),
    c(2, 2, new int[]{104, 105, 106, 107}),
    d(3, 3, new int[]{104, 105, 106, 107}),
    e(4, 4, new int[]{106, 107}),
    f(5, 5, new int[]{107});

    private final int g;
    private final int h;
    private final int[] i;

    private bkr_1(int n2, int n3, int[] nArray) {
        this.g = n2;
        this.h = n3;
        this.i = nArray;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public boolean a(int n) {
        for (int n2 : this.i) {
            if (n2 != n) continue;
            return true;
        }
        return false;
    }
}

