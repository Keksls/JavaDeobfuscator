/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frm
 */
public enum frm_0 {
    a,
    b,
    c,
    d;


    public int a(int n) {
        switch (this) {
            case d: {
                return 0;
            }
            case a: 
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

    public static frm_0 a(String string) {
        frm_0[] frm_0Array = frm_0.values();
        String string2 = string.toUpperCase();
        for (frm_0 frm_02 : frm_0Array) {
            if (!frm_02.name().equals(string2)) continue;
            return frm_02;
        }
        return frm_0Array[0];
    }
}

