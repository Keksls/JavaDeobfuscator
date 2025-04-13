/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frk
 */
public enum frk_0 {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i,
    j,
    k,
    l,
    m,
    n,
    o,
    p,
    q;


    public int a(int n) {
        switch (this) {
            case a: 
            case f: 
            case h: 
            case k: 
            case m: {
                return 0;
            }
            case b: 
            case n: {
                return (int)Math.max(0.0, (double)n * 0.25);
            }
            case c: 
            case i: 
            case o: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case d: 
            case p: {
                return (int)Math.max(0.0, (double)n * 0.75);
            }
            case e: 
            case g: 
            case j: 
            case l: 
            case q: {
                return Math.max(0, n);
            }
        }
        return 0;
    }

    public int b(int n) {
        switch (this) {
            case a: 
            case b: 
            case c: 
            case d: 
            case e: {
                return Math.max(0, n);
            }
            case f: 
            case g: {
                return (int)Math.max(0.0, (double)n * 0.75);
            }
            case h: 
            case i: 
            case j: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case k: 
            case l: {
                return (int)Math.max(0.0, (double)n * 0.25);
            }
            case m: 
            case n: 
            case o: 
            case p: 
            case q: {
                return 0;
            }
        }
        return 0;
    }

    public int a(int n, int n2) {
        switch (this) {
            case a: 
            case f: 
            case h: 
            case k: 
            case m: {
                return 0;
            }
            case b: 
            case n: {
                return (int)Math.round((double)(n2 - n) * 0.25);
            }
            case c: 
            case i: 
            case o: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case d: 
            case p: {
                return (int)Math.round((double)(n2 - n) * 0.75);
            }
            case e: 
            case g: 
            case j: 
            case l: 
            case q: {
                return Math.max(0, n2 - n);
            }
        }
        return 0;
    }

    public int b(int n, int n2) {
        switch (this) {
            case a: 
            case b: 
            case c: 
            case d: 
            case e: {
                return n2 - n;
            }
            case f: 
            case g: {
                return (int)Math.round((double)(n2 - n) * 0.75);
            }
            case h: 
            case i: 
            case j: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case k: 
            case l: {
                return (int)Math.round((double)(n2 - n) * 0.25);
            }
            case m: 
            case n: 
            case o: 
            case p: 
            case q: {
                return 0;
            }
        }
        return 0;
    }

    public boolean a() {
        return this == f || this == a || this == b || this == c || this == d || this == e || this == g;
    }

    public boolean b() {
        return this == k || this == m || this == n || this == o || this == p || this == q || this == l;
    }

    public boolean c() {
        return this == f || this == a || this == b || this == h || this == n || this == m || this == k;
    }

    public boolean d() {
        return this == g || this == e || this == d || this == j || this == p || this == q || this == l;
    }

    public static frk_0 a(String string) {
        frk_0[] frk_0Array = frk_0.values();
        String string2 = string.toUpperCase();
        for (frk_0 frk_02 : frk_0Array) {
            if (!frk_02.name().equals(string2)) continue;
            return frk_02;
        }
        return frk_0Array[0];
    }
}

