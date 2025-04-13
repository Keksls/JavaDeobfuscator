/*
 * Decompiled with CFR 0.152.
 */
public enum Yf {
    a(0),
    b(1),
    c(2),
    d(3);

    private final int e;

    private Yf(int n2) {
        this.e = n2;
    }

    public static Yf a(int n) {
        Yf[] yfArray;
        for (Yf yf : yfArray = Yf.values()) {
            if (yf.e != n) continue;
            return yf;
        }
        throw new IllegalArgumentException("Not found " + n);
    }

    public int a() {
        return this.e;
    }
}

