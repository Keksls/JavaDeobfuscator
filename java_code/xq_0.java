/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from XQ
 */
public enum xq_0 implements aqk_2
{
    a(0, "Filtre Obs\u00e9nit\u00e9"),
    b(1, "Banni"),
    c(2, "Nom prot\u00e9g\u00e9");

    private final short d;
    private final String e;

    private xq_0(short s2, String string2) {
        this.d = s2;
        this.e = string2;
    }

    public int a() {
        return this.d;
    }

    @Override
    public String d() {
        return Integer.toString(this.d);
    }

    @Override
    public String e() {
        return this.e;
    }

    @Override
    public String f() {
        return null;
    }

    public static xq_0 a(short s2) {
        for (xq_0 xq_02 : xq_0.values()) {
            if (xq_02.a() != s2) continue;
            return xq_02;
        }
        return null;
    }
}

