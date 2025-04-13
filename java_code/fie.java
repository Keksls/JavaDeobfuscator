/*
 * Decompiled with CFR 0.152.
 */
public enum fie {
    a(0, 0),
    b(1, 1),
    c(2, 2),
    d(3, 3),
    e(5, 5),
    f(6, 6);

    private final byte g;
    private final int h;
    private fif i;

    private fie(byte by, int n2) {
        this.g = by;
        this.h = n2;
    }

    public byte a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public fif c() {
        return this.i;
    }

    public void a(fif fif2) {
        this.i = fif2;
    }

    public static fie a(byte by) {
        for (fie fie2 : fie.values()) {
            if (fie2.a() != by) continue;
            return fie2;
        }
        return null;
    }
}

