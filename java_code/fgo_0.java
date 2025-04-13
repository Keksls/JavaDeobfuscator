/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fgO
 */
public enum fgo_0 {
    a(0),
    b(1),
    c(2);

    public final byte d;

    private fgo_0(int n2) {
        this.d = (byte)n2;
    }

    public static fgo_0 a(byte by) {
        fgo_0[] fgo_0Array = fgo_0.values();
        for (int k = 0; k < fgo_0Array.length; ++k) {
            fgo_0 fgo_02 = fgo_0Array[k];
            if (fgo_02.d != by) continue;
            return fgo_02;
        }
        return null;
    }
}

