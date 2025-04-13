/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.HashMap;

/*
 * Renamed from emt
 */
public enum emt_0 {
    a(1, "WKSTEAMER"),
    b(2, "ANTIADDICT"),
    c(3, "WKCHARACTERS"),
    d(4, "WKVAULTUP"),
    e(5, "WKBUILDCARAC"),
    f(6, "WKBUILDEQUIP"),
    g(7, "WKBUILDSORT"),
    h(8, "WKBETAACCESS"),
    i(9, "WKBETAREWARD"),
    j(10, "WKOUGINAK"),
    k(11, "WKEARLYMONO");

    private static final TByteObjectHashMap<emt_0> l;
    private static final HashMap<String, emt_0> m;
    private final byte n;
    private final String o;

    private emt_0(byte by, String string2) {
        this.n = by;
        this.o = string2;
    }

    public byte a() {
        return this.n;
    }

    public String b() {
        return this.o;
    }

    public static emt_0 a(byte by) {
        return (emt_0)((Object)l.get(by));
    }

    public static emt_0 a(String string) {
        return m.get(string);
    }

    static {
        l = new TByteObjectHashMap();
        m = new HashMap();
        for (emt_0 emt_02 : emt_0.values()) {
            l.put(emt_02.n, (Object)emt_02);
            m.put(emt_02.o, emt_02);
        }
    }
}

