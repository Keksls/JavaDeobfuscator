/*
 * Decompiled with CFR 0.152.
 */
public enum eEG {
    a(2, hw_1.c),
    b(1, hw_1.b),
    c(0, hw_1.a);

    private final byte d;
    private final hw_1 e;

    private eEG(byte by, hw_1 hw_12) {
        this.d = by;
        this.e = hw_12;
    }

    public static eEG a(byte by) {
        for (eEG eEG2 : eEG.values()) {
            if (eEG2.d != by) continue;
            return eEG2;
        }
        throw new IllegalArgumentException("Invalid ladderType request from typeId");
    }

    public static eEG a(hw_1 hw_12) {
        for (eEG eEG2 : eEG.values()) {
            if (eEG2.e != hw_12) continue;
            return eEG2;
        }
        throw new IllegalArgumentException("Invalid ladderType request from protobuf ladderType");
    }

    public hw_1 a() {
        return this.e;
    }

    public byte b() {
        return this.d;
    }
}

