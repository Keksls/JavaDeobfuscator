/*
 * Decompiled with CFR 0.152.
 */
public enum fkf {
    a(-1, 0.0),
    b(0, 5.0),
    c(1, 15.0),
    d(2, 30.0),
    e(3, 50.0),
    f(4, 100.0),
    g(5, 200.0);

    public static final int h = 6;
    private final int i;
    private final double j;

    private fkf(int n2, double d2) {
        this.i = n2;
        this.j = d2;
    }

    public static fkf a(int n) {
        for (fkf fkf2 : fkf.values()) {
            if (fkf2.i != n) continue;
            return fkf2;
        }
        return null;
    }

    public double a() {
        return this.j;
    }

    public int b() {
        return this.i;
    }
}

