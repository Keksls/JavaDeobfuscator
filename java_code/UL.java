/*
 * Decompiled with CFR 0.152.
 */
public enum UL implements aqk_2
{
    a(1, 300, "vitesse de course normale", "300ms/cell, 7.5 frames \u00e0 25fps"),
    b(2, 600, "vitesse de marche normale", "600ms/cell, 15 frames \u00e0 25fps"),
    c(3, 1000, "vitesse de marche lente", "1000ms/cell, 25 frames \u00e0 25fps"),
    d(4, 1200, "vitesse de marche tr\u00e8s lente", "1200ms/cell, 30 frames \u00e0 25fps"),
    e(5, 240, "Monture +25%", "240ms/cell"),
    f(6, 200, "Monture +50%", "200ms/cell"),
    g(7, 172, "Monture +75%", "172ms/cell");

    private static final acy_2<UL> h;
    private final int i;
    private final String j;
    private final String k;
    private final int l;

    private UL(int n2, int n3, String string2, String string3) {
        this.i = n2;
        this.l = n3;
        this.j = string2;
        this.k = string3;
    }

    @Override
    public String d() {
        return Integer.toString(this.i);
    }

    @Override
    public String e() {
        return this.j;
    }

    @Override
    public String f() {
        return this.k;
    }

    public int a() {
        return this.i;
    }

    public int b() {
        return this.l;
    }

    public static UL a(int n) {
        return h.g(n);
    }

    static {
        h = new acy_2();
        for (UL uL : UL.values()) {
            h.a(uL.a(), uL);
        }
    }
}

