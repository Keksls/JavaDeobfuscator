/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dcI
 */
enum dci_0 {
    a(1),
    b(3),
    c(4);

    final byte d;

    private dci_0(byte by) {
        this.d = by;
    }

    public static dci_0 a(byte by) {
        for (dci_0 dci_02 : dci_0.values()) {
            if (dci_02.d != by) continue;
            return dci_02;
        }
        return a;
    }
}

