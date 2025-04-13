/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmS
 */
enum bms_1 {
    a(0),
    b(1),
    c(2);

    private final byte d;

    private bms_1(byte by) {
        this.d = by;
    }

    public boolean a(bms_1 bms_12) {
        return this.d > bms_12.d;
    }
}

