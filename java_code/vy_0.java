/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Vy
 */
public enum vy_0 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private final byte f;

    private vy_0(int n2) {
        this.f = (byte)n2;
    }

    public byte a() {
        return this.f;
    }

    public static vy_0 a(byte by) {
        for (vy_0 vy_02 : vy_0.values()) {
            if (by != vy_02.f) continue;
            return vy_02;
        }
        throw new IllegalArgumentException("Invalid " + vy_0.class.getName() + " id");
    }
}

