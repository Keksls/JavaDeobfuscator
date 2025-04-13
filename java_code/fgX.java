/*
 * Decompiled with CFR 0.152.
 */
public enum fgX {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6);

    private final byte h;

    private fgX(int n2) {
        this.h = Hw.b((long)n2);
    }

    public byte a() {
        return this.h;
    }

    public static fgX a(int n) {
        fgX[] fgXArray = fgX.values();
        if (n < 0 || n >= fgXArray.length) {
            return a;
        }
        return fgXArray[n];
    }
}

