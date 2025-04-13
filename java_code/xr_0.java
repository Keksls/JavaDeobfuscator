/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from XR
 */
public enum xr_0 implements aqk_2
{
    a(0, "Toutes", null),
    b(1, "Fran\u00e7ais", Ow.a),
    c(2, "Anglais", Ow.b),
    d(3, "Allemand", Ow.e),
    e(4, "Espagnol", Ow.c),
    f(5, "Italien", Ow.f),
    g(6, "Portugais", Ow.d),
    h(8, "Tagalog", Ow.m),
    i(9, "Malay", Ow.l);

    private final short j;
    private final String k;
    private final Ow l;
    private final boolean m;

    private xr_0(short s2, String string2, Ow ow) {
        this(s2, string2, ow, false);
    }

    private xr_0(short s2, String string2, Ow ow, boolean bl) {
        this.j = s2;
        this.k = string2;
        this.l = ow;
        this.m = bl;
    }

    public short a() {
        return this.j;
    }

    public boolean b() {
        return this.m;
    }

    @Override
    public String d() {
        return Integer.toString(this.j);
    }

    @Override
    public String e() {
        return this.k;
    }

    @Override
    public String f() {
        return null;
    }

    public static xr_0 a(short s2) {
        for (xr_0 xr_02 : xr_0.values()) {
            if (xr_02.j != s2) continue;
            return xr_02;
        }
        return null;
    }

    public static xr_0 a(Ow ow) {
        for (xr_0 xr_02 : xr_0.values()) {
            if (xr_02.l != ow) continue;
            return xr_02;
        }
        return a;
    }
}

