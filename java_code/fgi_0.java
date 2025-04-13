/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

/*
 * Renamed from fgI
 */
public enum fgi_0 {
    a(1, 5055),
    b(3, 5071);

    private static final TByteObjectHashMap<fgi_0> c;
    private byte d;
    private int e;

    private fgi_0(byte by, int n2) {
        this.d = by;
        this.e = n2;
    }

    public byte a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public static fgi_0 a(byte by) {
        return (fgi_0)((Object)c.get(by));
    }

    static {
        c = new TByteObjectHashMap();
        for (fgi_0 fgi_02 : fgi_0.values()) {
            c.put(fgi_02.a(), (Object)fgi_02);
        }
    }
}

