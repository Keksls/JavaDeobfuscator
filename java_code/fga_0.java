/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

/*
 * Renamed from fgA
 */
public enum fga_0 {
    a(1),
    b(2),
    c(3),
    d(4),
    e(5),
    f(6);

    private static final TByteObjectHashMap<fga_0> g;
    private final byte h;

    private fga_0(byte by) {
        this.h = by;
    }

    public byte a() {
        return this.h;
    }

    public static fga_0 a(byte by) {
        return (fga_0)((Object)g.get(by));
    }

    static {
        g = new TByteObjectHashMap();
        for (fga_0 fga_02 : fga_0.values()) {
            g.put(fga_02.a(), (Object)fga_02);
        }
    }
}

