/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SC
 */
public enum sc_0 implements aqk_2
{
    a(0, "L'effet n'est pas d\u00e9clench\u00e9"),
    b(1, "La cible sera la cible que l'on a d\u00e9j\u00e0 calcul\u00e9e"),
    c(2, "La cible sera le porteur cet effet"),
    d(3, "La cible sera le lanceur cet effet"),
    e(4, "La cible sera le lanceur de l'effet declencheur"),
    f(5, "La cible sera la cible de l'effet declencheur");

    private final byte g;
    private final String h;

    private sc_0(byte by, String string2) {
        this.g = by;
        this.h = string2;
    }

    @Override
    public String d() {
        return Byte.toString(this.g);
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return this.h;
    }

    public byte a() {
        return this.g;
    }

    public static sc_0 a(byte by) {
        sc_0[] sc_0Array = sc_0.values();
        for (int k = 0; k < sc_0Array.length; ++k) {
            sc_0 sc_02 = sc_0Array[k];
            if (sc_02.g != by) continue;
            return sc_02;
        }
        return null;
    }
}

