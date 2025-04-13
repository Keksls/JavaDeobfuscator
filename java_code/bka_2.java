/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkA
 */
public enum bka_2 implements aqk_2
{
    a(1, "St\u00e8le"),
    b(2, "Parchemin"),
    c(3, "Livre", true, 20, 55),
    d(4, "Panneau"),
    e(5, "Affiche"),
    f(6, "Vide"),
    g(7, "Gazette", true, 35, 45, 600148, 600149),
    h(8, "Parchemin", true, 35, 45),
    i(9, "St\u00e8le frigost"),
    j(10, "St\u00e8le Blanche"),
    k(11, "Eliatrope (simple)"),
    l(12, "Eliatrope - Livre", true, 20, 55);

    private final short m;
    private final String n;
    private final boolean o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;

    private bka_2(short s2, String string2, boolean bl, int n2, int n3, int n4, int n5) {
        this.m = s2;
        this.o = bl;
        this.n = string2 + (this.o ? " (double)" : "");
        this.p = n3;
        this.q = n2;
        this.r = n4;
        this.s = n5;
    }

    private bka_2(short s2, String string2, boolean bl, int n2, int n3) {
        this(s2, string2, bl, n2, n3, 600120, 600121);
    }

    private bka_2(short s2, String string2) {
        this(s2, string2, false, 25, 25);
    }

    public int a() {
        return this.m;
    }

    public boolean b() {
        return this.o;
    }

    public int c() {
        return this.p;
    }

    public int g() {
        return this.q;
    }

    public int h() {
        return this.r;
    }

    public int i() {
        return this.s;
    }

    @Override
    public String d() {
        return Integer.toString(this.m);
    }

    @Override
    public String e() {
        return this.n;
    }

    @Override
    public String f() {
        return null;
    }

    public static bka_2 a(short s2) {
        for (bka_2 bka_22 : bka_2.values()) {
            if (bka_22.a() != s2) continue;
            return bka_22;
        }
        return null;
    }
}

