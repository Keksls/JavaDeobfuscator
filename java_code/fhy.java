/*
 * Decompiled with CFR 0.152.
 */
public enum fhy {
    a(0),
    b(1),
    c(2);

    private final byte d;

    private fhy(byte by) {
        this.d = by;
    }

    public static fhy a(byte by) {
        for (fhy fhy2 : fhy.values()) {
            if (fhy2.d != by) continue;
            return fhy2;
        }
        throw new IllegalArgumentException("Unknown result id=" + by);
    }

    public byte a() {
        return this.d;
    }

    public boolean b() {
        return this == b || this == c;
    }
}

