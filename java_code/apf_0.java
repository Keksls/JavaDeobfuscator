/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aPF
 */
public class apf_0
extends abv_0 {
    private static final apf_0 b = new apf_0();
    private static final String c = "debugDisplayer";

    public static apf_0 b() {
        return b;
    }

    private apf_0() {
        super(c, anr_0.J);
    }

    public void a(int n, int[][] nArray) {
        this.a();
        for (int k = 0; k < n; ++k) {
            int[] nArray2 = nArray[k];
            this.a(nArray2[0], nArray2[1], (short)nArray2[2]);
        }
    }
}

