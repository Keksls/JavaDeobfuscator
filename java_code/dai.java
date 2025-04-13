/*
 * Decompiled with CFR 0.152.
 */
enum dai {
    a(18351, new int[]{2760}),
    b(18401, new int[]{2752}),
    c(18355, new int[]{2766}),
    d(18406, new int[]{2765}),
    e(18357, new int[]{2752, 2760, 2765, 2766});

    final int f;
    final int[] g;

    private dai(int n2, int[] nArray) {
        this.f = n2;
        this.g = nArray;
    }

    public static dai a(int n) {
        dai[] daiArray = dai.values();
        for (int k = 0; k < daiArray.length; ++k) {
            dai dai2 = daiArray[k];
            if (n != dai2.f) continue;
            return dai2;
        }
        return null;
    }
}

