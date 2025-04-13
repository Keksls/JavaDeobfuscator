/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frs
 */
public enum frs_0 {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i;

    private static final frs_0[] j;

    public int a(int n) {
        switch (this) {
            case a: 
            case d: 
            case g: {
                return 0;
            }
            case b: 
            case e: 
            case h: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case c: 
            case f: 
            case i: {
                return Math.max(0, n);
            }
        }
        return 0;
    }

    public int b(int n) {
        switch (this) {
            case a: 
            case b: 
            case c: {
                return Math.max(0, n);
            }
            case d: 
            case e: 
            case f: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case g: 
            case h: 
            case i: {
                return 0;
            }
        }
        return 0;
    }

    public int a(int n, int n2) {
        switch (this) {
            case a: 
            case d: 
            case g: {
                return 0;
            }
            case b: 
            case e: 
            case h: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case c: 
            case f: 
            case i: {
                return Math.max(0, n2 - n);
            }
        }
        return 0;
    }

    public int a(int n, int n2, int n3) {
        switch (this) {
            case a: 
            case d: 
            case g: {
                return n - n3;
            }
            case b: 
            case e: 
            case h: {
                return (int)Math.round((double)(n2 - n3) * 0.5) + n;
            }
            case c: 
            case f: 
            case i: {
                return n + n2;
            }
        }
        return 0;
    }

    public int b(int n, int n2, int n3) {
        switch (this) {
            case a: 
            case b: 
            case c: {
                return n + n2;
            }
            case d: 
            case e: 
            case f: {
                return (int)Math.round((double)(n2 - n3) * 0.5) + n;
            }
            case g: 
            case h: 
            case i: {
                return n - n3;
            }
        }
        return 0;
    }

    public int b(int n, int n2) {
        switch (this) {
            case a: 
            case b: 
            case c: {
                return n2 - n;
            }
            case d: 
            case e: 
            case f: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case g: 
            case h: 
            case i: {
                return 0;
            }
        }
        return 0;
    }

    public boolean a() {
        return this == a || this == b || this == c;
    }

    public boolean b() {
        return this == g || this == h || this == i;
    }

    public boolean c() {
        return this == a || this == d || this == g;
    }

    public boolean d() {
        return this == c || this == f || this == i;
    }

    public frs_0 e() {
        switch (this) {
            case a: {
                return c;
            }
            case c: {
                return a;
            }
            case d: {
                return f;
            }
            case f: {
                return d;
            }
            case g: {
                return i;
            }
            case i: {
                return g;
            }
        }
        return this;
    }

    public frs_0 f() {
        switch (this) {
            case a: {
                return g;
            }
            case b: {
                return h;
            }
            case c: {
                return i;
            }
            case g: {
                return a;
            }
            case h: {
                return b;
            }
            case i: {
                return c;
            }
        }
        return this;
    }

    public frs_0 g() {
        return j[j.length - 1 - this.ordinal()];
    }

    public static frs_0 a(String string) {
        String string2 = string.toUpperCase();
        for (frs_0 frs_02 : j) {
            if (!frs_02.name().equals(string2)) continue;
            return frs_02;
        }
        return j[0];
    }

    static {
        j = frs_0.values();
    }
}

