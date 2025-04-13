/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from env
 */
public enum env_0 {
    a(0),
    b(1);

    private final byte c;

    private env_0(byte by) {
        this.c = by;
    }

    public byte a() {
        return this.c;
    }

    public static env_0 a(byte by) {
        for (env_0 env_02 : env_0.values()) {
            if (env_02.a() != by) continue;
            return env_02;
        }
        return null;
    }
}

