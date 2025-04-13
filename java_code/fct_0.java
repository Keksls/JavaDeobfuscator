/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.EnumSet;
import java.util.Iterator;

/*
 * Renamed from fct
 */
public enum fct_0 {
    a(1, fcu_0.c),
    b(2, fcu_0.d);

    private static final TByteObjectHashMap<fct_0> c;
    private final byte d;
    private long e;
    private final fcu_0 f;

    private fct_0(int n2, fcu_0 fcu_02) {
        this.d = (byte)n2;
        this.e = 1 << this.d;
        this.f = fcu_02;
    }

    public byte a() {
        return this.d;
    }

    public long b() {
        return this.e;
    }

    public fcu_0 c() {
        return this.f;
    }

    public static long a(EnumSet<fct_0> enumSet) {
        long l = 0L;
        Iterator iterator = enumSet.iterator();
        while (iterator.hasNext()) {
            l |= ((fct_0)((Object)iterator.next())).e;
        }
        return l;
    }

    public static EnumSet<fct_0> a(long l) {
        EnumSet<fct_0> enumSet = EnumSet.noneOf(fct_0.class);
        fct_0[] fct_0Array = fct_0.values();
        for (int k = 0; k < fct_0Array.length; ++k) {
            fct_0 fct_02 = fct_0Array[k];
            if ((l & fct_02.e) != fct_02.e) continue;
            enumSet.add(fct_02);
        }
        return enumSet;
    }

    public static fct_0 a(byte by) {
        return (fct_0)((Object)c.get(by));
    }

    static {
        c = new TByteObjectHashMap();
        fct_0[] fct_0Array = fct_0.values();
        for (int k = 0; k < fct_0Array.length; ++k) {
            fct_0 fct_02 = fct_0Array[k];
            c.put(fct_02.d, (Object)fct_02);
        }
    }
}

