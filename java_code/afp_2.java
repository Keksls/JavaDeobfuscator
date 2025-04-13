/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFp
 */
public class afp_2 {
    private static final int[] a = new int[]{0, 0};
    private static final int[][] b = new int[][]{{1, 0}, {0, 1}};
    private static final int[][] c = new int[][]{{-1, 0}, {0, -1}};
    private int d = 0;
    private int e = 0;
    private int f;

    public int[] a() {
        if (this.d == 0) {
            this.d = 1;
            this.f = 0;
            return a;
        }
        ++this.e;
        int[][] nArray = this.d % 2 == 0 ? c : b;
        int[] nArray2 = nArray[this.f];
        if (this.e == this.d) {
            if (this.f == 0) {
                this.f = 1;
                this.e = 0;
            } else {
                this.f = 0;
                this.e = 0;
                ++this.d;
            }
        }
        return nArray2;
    }
}

