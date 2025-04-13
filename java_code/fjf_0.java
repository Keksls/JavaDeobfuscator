/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fjf
 */
public enum fjf_0 {
    a(1),
    b(2),
    c(3),
    d(4),
    e(5);

    private final byte f;

    private fjf_0(int n2) {
        this.f = (byte)n2;
    }

    public static fjf_0 a(int n) {
        for (fjf_0 fjf_02 : fjf_0.values()) {
            if (fjf_02.f != n) continue;
            return fjf_02;
        }
        return null;
    }

    public byte a() {
        return this.f;
    }
}

