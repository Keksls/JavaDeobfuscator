/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNc
 */
public enum enc_1 {
    a(0),
    b(1),
    c(2);

    private final byte d;

    private enc_1(int n2) {
        this.d = (byte)n2;
    }

    byte a() {
        return this.d;
    }

    static enc_1 a(byte by) {
        for (enc_1 enc_12 : enc_1.values()) {
            if (enc_12.d != by) continue;
            return enc_12;
        }
        throw new IllegalArgumentException("Invalid State Id: " + by);
    }
}

