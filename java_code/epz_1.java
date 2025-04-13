/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epZ
 */
public enum epz_1 implements aqk_2
{
    a(0, "Aucun"),
    b(1, "Mob juv\u00e9nile"),
    c(2, "Mob adulte (type1)"),
    d(3, "Mob adulte (type2)"),
    e(4, "Mob chef de groupe"),
    f(5, "Mob chef de famille"),
    g(6, "Extra mob"),
    h(7, "Mob corrompu"),
    i(8, "Mob petit dieu"),
    j(9, "Mob mort-vivant"),
    k(10, "Mob de challenge");

    private final byte l;
    private final String m;

    private epz_1(int n2, String string2) {
        this.l = (byte)n2;
        this.m = string2;
    }

    @Override
    public String d() {
        return String.valueOf(this.l);
    }

    @Override
    public String e() {
        return this.m;
    }

    public byte a() {
        return this.l;
    }

    public static epz_1 a(byte by) {
        for (epz_1 epz_12 : epz_1.values()) {
            if (epz_12.a() != by) continue;
            return epz_12;
        }
        return null;
    }

    @Override
    public String f() {
        return null;
    }
}

