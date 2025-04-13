/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eMi
 */
public enum emi_2 {
    a(0),
    b(1),
    c(2),
    d(3);

    private final byte e;

    private emi_2(int n2) {
        this.e = (byte)n2;
    }

    public static emi_2 a(byte by) {
        for (emi_2 emi_22 : emi_2.values()) {
            if (emi_22.e != by) continue;
            return emi_22;
        }
        return a;
    }

    public byte a() {
        return this.e;
    }
}

