/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLH
 */
class flh_1
extends fle_2 {
    flh_1() {
    }

    @Override
    int a(fkx_2 fkx_22, Object object, float[][] fArray, int[] nArray, int n) {
        int n2 = 0;
        for (int k = 0; k < n; ++k) {
            if (nArray[k] == 0) continue;
            fArray[n2++] = fArray[k];
        }
        if (n2 != 0) {
            return flh_1.a(fkx_22, object, fArray, n2, 1);
        }
        return 0;
    }
}

