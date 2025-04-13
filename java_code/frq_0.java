/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frq
 */
public enum frq_0 {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h;


    public int a(int n) {
        switch (this) {
            case a: 
            case d: 
            case f: {
                return 0;
            }
            case b: 
            case g: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case c: 
            case e: 
            case h: {
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
            case e: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case f: 
            case g: 
            case h: {
                return 0;
            }
        }
        return 0;
    }

    public int a(int n, int n2) {
        switch (this) {
            case a: 
            case d: 
            case f: {
                return 0;
            }
            case b: 
            case g: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case c: 
            case e: 
            case h: {
                return Math.max(0, n2 - n);
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
            case e: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case f: 
            case g: 
            case h: {
                return 0;
            }
        }
        return 0;
    }

    public frq_0 a() {
        switch (this) {
            case a: {
                return h;
            }
            case b: {
                return g;
            }
            case c: {
                return f;
            }
            case d: {
                return e;
            }
            case e: {
                return d;
            }
            case f: {
                return c;
            }
            case g: {
                return b;
            }
            case h: {
                return a;
            }
        }
        return null;
    }

    public boolean b() {
        return this == a || this == b || this == c;
    }

    public boolean c() {
        return this == f || this == g || this == h;
    }

    public boolean d() {
        return this == a || this == d || this == f;
    }

    public boolean e() {
        return this == c || this == e || this == h;
    }

    public static frq_0 a(String string) {
        frq_0[] frq_0Array = frq_0.values();
        String string2 = string.toUpperCase();
        for (frq_0 frq_02 : frq_0Array) {
            if (!frq_02.name().equals(string2)) continue;
            return frq_02;
        }
        return frq_0Array[0];
    }
}

