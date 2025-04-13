/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

/*
 * Renamed from fgK
 */
public enum fgk_0 {
    a(-1, 0),
    b(1, -2),
    c(2, 1),
    d(3, 2);

    private static final TByteObjectHashMap<fgk_0> e;
    private final byte f;
    private final int g;

    private fgk_0(byte by, int n2) {
        this.f = by;
        this.g = n2;
    }

    public byte a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public static fgk_0 a(int n, int n2) {
        if (n2 == 0) {
            return a;
        }
        if (n == 0) {
            return b;
        }
        if (n == n2) {
            return d;
        }
        return c;
    }

    public static fgk_0 a(byte by) {
        return (fgk_0)((Object)e.get(by));
    }

    static {
        e = new TByteObjectHashMap();
        for (fgk_0 fgk_02 : fgk_0.values()) {
            e.put(fgk_02.f, (Object)fgk_02);
        }
    }
}

