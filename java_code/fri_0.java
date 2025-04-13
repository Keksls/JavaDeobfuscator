/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fri
 */
public enum fri_0 {
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
    p;


    public int a(int n) {
        switch (this) {
            case a: 
            case f: 
            case h: 
            case j: 
            case l: {
                return 0;
            }
            case b: 
            case m: {
                return (int)Math.max(0.0, (double)n * 0.25);
            }
            case c: 
            case n: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case d: 
            case o: {
                return (int)Math.max(0.0, (double)n * 0.75);
            }
            case e: 
            case g: 
            case i: 
            case k: 
            case p: {
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
            case i: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case j: 
            case k: {
                return (int)Math.max(0.0, (double)n * 0.25);
            }
            case l: 
            case m: 
            case n: 
            case o: 
            case p: {
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
            case j: 
            case l: {
                return 0;
            }
            case b: 
            case m: {
                return (int)Math.round((double)(n2 - n) * 0.25);
            }
            case c: 
            case n: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case d: 
            case o: {
                return (int)Math.round((double)(n2 - n) * 0.75);
            }
            case e: 
            case g: 
            case i: 
            case k: 
            case p: {
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
            case i: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case j: 
            case k: {
                return (int)Math.round((double)(n2 - n) * 0.25);
            }
            case l: 
            case m: 
            case n: 
            case o: 
            case p: {
                return 0;
            }
        }
        return 0;
    }

    public boolean a() {
        return this == f || this == a || this == b || this == c || this == d || this == e || this == g;
    }

    public boolean b() {
        return this == j || this == l || this == m || this == n || this == o || this == p || this == k;
    }

    public boolean c() {
        return this == f || this == a || this == b || this == h || this == m || this == l || this == j;
    }

    public boolean d() {
        return this == g || this == e || this == d || this == i || this == o || this == p || this == k;
    }

    public static fri_0 a(String string) {
        fri_0[] fri_0Array = fri_0.values();
        String string2 = string.toUpperCase();
        for (fri_0 fri_02 : fri_0Array) {
            if (!fri_02.name().equals(string2)) continue;
            return fri_02;
        }
        return fri_0Array[0];
    }
}

