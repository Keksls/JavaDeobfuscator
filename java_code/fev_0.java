/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

/*
 * Renamed from feV
 */
@Deprecated(forRemoval=true)
public enum fev_0 {
    a(1, 1),
    b(2, 10),
    c(3, 50),
    d(4, 100);

    private static final TByteObjectHashMap<fev_0> g;
    public final byte e;
    public final short f;

    private fev_0(int n2, int n3) {
        this.e = (byte)n2;
        this.f = (short)n3;
    }

    public static fev_0 a(byte by) {
        return (fev_0)((Object)g.get(by));
    }

    public static fev_0 a(short s2) {
        fev_0[] fev_0Array = fev_0.values();
        for (int k = 0; k < fev_0Array.length; ++k) {
            fev_0 fev_02 = fev_0Array[k];
            if (fev_02.f != s2) continue;
            return fev_02;
        }
        return null;
    }

    static {
        g = new TByteObjectHashMap();
        fev_0[] fev_0Array = fev_0.values();
        for (int k = 0; k < fev_0Array.length; ++k) {
            fev_0 fev_02 = fev_0Array[k];
            g.put(fev_02.e, (Object)fev_02);
        }
    }
}

