/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLI
 */
class fli_2
extends fle_2 {
    fli_2() {
    }

    @Override
    int a(fkx_2 fkx_22, Object object, float[][] fArray, int[] nArray, int n) {
        int n2 = 0;
        for (n2 = 0; n2 < n && nArray[n2] == 0; ++n2) {
        }
        if (n2 == n) {
            return 0;
        }
        return fli_2.a(fkx_22, object, fArray, n);
    }
}

