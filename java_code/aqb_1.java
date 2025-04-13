/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aqb
 */
class aqb_1
extends aqa_1 {
    private final int[][] a;

    aqb_1(int n, int n2, aej_2 aej_22) {
        if (aej_22 == aej_2.k) {
            aej_22 = aej_2.b;
        }
        int n3 = aej_22.m;
        int n4 = aej_22.n;
        this.a = new int[][]{{n3, -n4, n}, {n4, n3, n2}};
    }

    @Override
    public int[] a(int ... nArray) {
        return new int[]{this.a[0][0] * nArray[0] + this.a[0][1] * nArray[1] + this.a[0][2], this.a[1][0] * nArray[0] + this.a[1][1] * nArray[1] + this.a[1][2]};
    }

    @Override
    public int[] b(int ... nArray) {
        int n = nArray[0] - this.a[0][2];
        int n2 = nArray[1] - this.a[1][2];
        return new int[]{this.a[0][0] * n + this.a[1][0] * n2, this.a[0][1] * n + this.a[1][1] * n2};
    }
}

