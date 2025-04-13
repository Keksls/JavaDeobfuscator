/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBi
 */
public enum fbi_2 {
    a(false, false),
    b(false, true),
    c(true, true),
    d(true, true),
    e(false, true),
    f(true, true),
    g(true, true),
    h(true, false),
    i(true, false);

    private final boolean j;
    private final boolean k;

    private fbi_2(boolean bl, boolean bl2) {
        this.j = bl;
        this.k = bl2;
    }

    public boolean a() {
        return this.j;
    }

    public boolean b() {
        return this.k;
    }

    private static fbi_2 a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl) {
            if (bl3) {
                return c;
            }
            if (bl4) {
                return d;
            }
            return b;
        }
        if (bl2) {
            if (bl3) {
                return f;
            }
            if (bl4) {
                return g;
            }
            return e;
        }
        if (bl3) {
            return h;
        }
        if (bl4) {
            return i;
        }
        return a;
    }

    public static fbi_2 a(int n, int n2, int n3, int n4, fso fso2) {
        return fbi_2.a(fbi_2.a(0, 0, n2), fbi_2.b(fso2.getHeight(), n2, n4), fbi_2.d(fso2.getWidth(), n, n3), fbi_2.c(0, 0, n));
    }

    public static fbi_2 a(int n, int n2, fvk_0 fvk_02, fso fso2) {
        return fbi_2.a(fbi_2.a(0, 0, n2), fbi_2.b(fso2.getHeight(), n2, fvk_02.getHeight()), fbi_2.d(fso2.getWidth(), n, fvk_02.getWidth()), fbi_2.c(0, 0, n));
    }

    public static fbi_2 a(int n, int n2, fvk_0 fvk_02, fvk_0 fvk_03) {
        return fbi_2.a(n, n2, fvk_02.getWidth(), fvk_02.getHeight(), fvk_03.getX(), fvk_03.getY(), fvk_03.getWidth(), fvk_03.getHeight());
    }

    public static fbi_2 a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return fbi_2.a(fbi_2.a(n6, n8, n2) && fbi_2.a(n, n3, n5, n7), fbi_2.b(n6, n2, n4) && fbi_2.a(n, n3, n5, n7), fbi_2.d(n5, n, n3) && fbi_2.b(n2, n4, n6, n8), fbi_2.c(n5, n7, n) && fbi_2.b(n2, n4, n6, n8));
    }

    public int a(int n, fvk_0 fvk_02) {
        switch (this) {
            case g: 
            case d: 
            case i: {
                return 0;
            }
            case c: 
            case h: 
            case f: {
                return fvk_02.getContainer().getWidth() - fvk_02.getWidth();
            }
        }
        return n;
    }

    public int b(int n, fvk_0 fvk_02) {
        switch (this) {
            case c: 
            case d: 
            case b: {
                return 0;
            }
            case f: 
            case e: 
            case g: {
                return fvk_02.getContainer().getHeight() - fvk_02.getHeight();
            }
        }
        return n;
    }

    public int a(int n, fvk_0 fvk_02, fvk_0 fvk_03) {
        switch (this) {
            case c: 
            case h: 
            case f: {
                return fvk_02.getX() - fvk_03.getWidth();
            }
            case g: 
            case d: 
            case i: {
                return fvk_02.getX() + fvk_02.getWidth();
            }
        }
        return n;
    }

    public int b(int n, fvk_0 fvk_02, fvk_0 fvk_03) {
        switch (this) {
            case f: 
            case e: 
            case g: {
                return fvk_02.getY() - fvk_03.getHeight();
            }
            case c: 
            case d: 
            case b: {
                return fvk_02.getY() + fvk_02.getHeight();
            }
        }
        return n;
    }

    private static boolean a(int n, int n2, int n3) {
        return Math.abs(n + n2 - n3) < 20;
    }

    private static boolean b(int n, int n2, int n3) {
        return Math.abs(n2 + n3 - n) < 20;
    }

    private static boolean c(int n, int n2, int n3) {
        return Math.abs(n + n2 - n3) < 20;
    }

    private static boolean d(int n, int n2, int n3) {
        return Math.abs(n2 + n3 - n) < 20;
    }

    private static boolean a(int n, int n2, int n3, int n4) {
        return n <= n3 && n + n2 > n3 || n3 <= n && n3 + n4 > n;
    }

    private static boolean b(int n, int n2, int n3, int n4) {
        return n <= n3 && n + n2 > n3 || n3 <= n && n3 + n4 > n;
    }
}

