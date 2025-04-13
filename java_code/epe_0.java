/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePE
 */
public enum epe_0 {
    a(0),
    b(1);

    private final byte c;

    private epe_0(byte by) {
        this.c = by;
    }

    public byte a() {
        return this.c;
    }

    public static epe_0 a(byte by) {
        for (epe_0 epe_02 : epe_0.values()) {
            if (epe_02.c != by) continue;
            return epe_02;
        }
        return a;
    }
}

