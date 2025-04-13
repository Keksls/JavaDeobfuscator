/*
 * Decompiled with CFR 0.152.
 */
public enum fkg {
    a(0, 50.0),
    b(1, 100.0),
    c(2, 150.0),
    d(3, 200.0),
    e(4, 250.0);

    public static final int f = 5;
    private final int g;
    private final double h;

    private fkg(int n2, double d2) {
        this.g = n2;
        this.h = d2;
    }

    public int a() {
        return this.g;
    }

    public double b() {
        return this.h;
    }

    public static fkg a(int n) {
        switch (n) {
            case 0: {
                return a;
            }
            case 1: {
                return b;
            }
            case 2: {
                return c;
            }
            case 3: {
                return d;
            }
            case 4: {
                return e;
            }
        }
        return a;
    }
}

