/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bra
 */
public enum bra_0 {
    a(0),
    b(1),
    c(2);

    private final int d;

    private bra_0(int n2) {
        this.d = n2;
    }

    public int a() {
        return this.d;
    }

    public static bra_0 a(int n) {
        for (bra_0 bra_02 : bra_0.values()) {
            if (bra_02.a() != n) continue;
            return bra_02;
        }
        return null;
    }
}

