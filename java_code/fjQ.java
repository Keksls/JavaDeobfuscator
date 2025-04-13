/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

public enum fjQ implements aqk_2
{
    a(0, 1, false, "monstre neutre"),
    b(100, 3, true, "monstre wakfu"),
    c(200, 3, false, "monstre stasis");

    private static final TIntObjectHashMap<fjQ> d;
    private final int e;
    private final int f;
    private final boolean g;
    private final String h;

    private fjQ(int n2, int n3, boolean bl, String string2) {
        this.e = n2;
        this.f = n3;
        this.g = bl;
        this.h = string2;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public String c() {
        return this.h;
    }

    @Override
    public String d() {
        return String.valueOf(this.e);
    }

    @Override
    public String e() {
        return this.h;
    }

    @Override
    public String f() {
        return "multiplicateur x" + this.f;
    }

    public boolean g() {
        return this.g;
    }

    public static fjQ a(int n) {
        return (fjQ)d.get(n);
    }

    static {
        d = new TIntObjectHashMap();
        for (fjQ fjQ2 : fjQ.values()) {
            d.put(fjQ2.a(), (Object)fjQ2);
        }
    }
}

