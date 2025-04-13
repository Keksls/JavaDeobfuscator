/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteLongHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteLongHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from eqX
 */
public abstract class eqx_1 {
    protected static final Logger a = Logger.getLogger(eqx_1.class);
    private static final TLongObjectHashMap<TByteLongHashMap> b = new TLongObjectHashMap();

    protected long a(epq_2 epq_22, erl_2 erl_22) {
        if (epq_22 != null) {
            long l = epq_22.a_();
            TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)b.get(l);
            if (tByteLongHashMap == null) {
                tByteLongHashMap = new TByteLongHashMap(3);
                b.put(l, (Object)tByteLongHashMap);
            }
            long l2 = tByteLongHashMap.put(erl_22.b(), System.currentTimeMillis());
            b.put(l, (Object)tByteLongHashMap);
            epq_22.c(erl_22);
            return l2;
        }
        return 0L;
    }

    public byte[] a(long l) {
        TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)b.get(l);
        if (tByteLongHashMap != null) {
            return tByteLongHashMap.keys();
        }
        return null;
    }

    public static boolean a(long l, erl_2 erl_22) {
        TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)b.get(l);
        return tByteLongHashMap != null && tByteLongHashMap.containsKey(erl_22.b());
    }

    public static long b(long l, erl_2 erl_22) {
        TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)b.get(l);
        long l2 = 0L;
        if (tByteLongHashMap != null) {
            l2 = tByteLongHashMap.get(erl_22.b());
        }
        return l2;
    }

    public void b(long l) {
        TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)b.get(l);
        if (tByteLongHashMap != null) {
            tByteLongHashMap.clear();
        }
    }

    public long b(epq_2 epq_22, erl_2 erl_22) {
        if (epq_22 != null) {
            TByteLongHashMap tByteLongHashMap = (TByteLongHashMap)b.get(epq_22.a_());
            long l = 0L;
            if (tByteLongHashMap != null) {
                l = tByteLongHashMap.remove(erl_22.b());
            }
            epq_22.e(erl_22);
            return l;
        }
        return 0L;
    }

    public TByteLongHashMap c(long l) {
        return (TByteLongHashMap)b.remove(l);
    }

    public void b() {
        b.clear();
    }
}

