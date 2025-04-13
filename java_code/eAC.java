/*
 * Decompiled with CFR 0.152.
 */
public enum eAC {
    a(1),
    b(2);

    private final byte c;

    private eAC(byte by) {
        this.c = by;
    }

    public byte a() {
        return this.c;
    }

    public static eAC a(byte by) {
        eAC[] eACArray = eAC.values();
        for (int k = 0; k < eACArray.length; ++k) {
            eAC eAC2 = eACArray[k];
            if (eAC2.c != by) continue;
            return eAC2;
        }
        return null;
    }
}

