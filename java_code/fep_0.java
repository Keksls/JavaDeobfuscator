/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from feP
 */
public enum fep_0 {
    a(-1),
    b(0),
    c(1);

    public final byte d;

    private fep_0(int n2) {
        this.d = (byte)n2;
    }

    public static fep_0 a(byte by) {
        fep_0[] fep_0Array = fep_0.values();
        for (int k = 0; k < fep_0Array.length; ++k) {
            fep_0 fep_02 = fep_0Array[k];
            if (fep_02.d != by) continue;
            return fep_02;
        }
        return null;
    }
}

