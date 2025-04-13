/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fro
 */
public enum fro_0 {
    a,
    b,
    c,
    d,
    e;


    public int a(int n) {
        switch (this) {
            case d: {
                return 0;
            }
            case a: 
            case e: 
            case b: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case c: {
                return Math.max(0, n);
            }
        }
        return 0;
    }

    public int b(int n) {
        switch (this) {
            case a: {
                return Math.max(0, n);
            }
            case d: 
            case e: 
            case c: {
                return (int)Math.max(0.0, (double)n * 0.5);
            }
            case b: {
                return 0;
            }
        }
        return 0;
    }

    public int a(int n, int n2) {
        switch (this) {
            case d: {
                return 0;
            }
            case a: 
            case e: 
            case b: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case c: {
                return Math.max(0, n2 - n);
            }
        }
        return 0;
    }

    public int b(int n, int n2) {
        switch (this) {
            case a: {
                return n2 - n;
            }
            case d: 
            case e: 
            case c: {
                return (int)Math.round((double)(n2 - n) * 0.5);
            }
            case b: {
                return 0;
            }
        }
        return 0;
    }

    public boolean a() {
        return this == a;
    }

    public boolean b() {
        return this == b;
    }

    public boolean c() {
        return this == d;
    }

    public boolean d() {
        return this == c;
    }

    public static fro_0 a(String string) {
        fro_0[] fro_0Array = fro_0.values();
        String string2 = string.toUpperCase();
        for (fro_0 fro_02 : fro_0Array) {
            if (!fro_02.name().equals(string2)) continue;
            return fro_02;
        }
        return fro_0Array[0];
    }
}

