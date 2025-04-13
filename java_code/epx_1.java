/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from epX
 */
public class epx_1 {
    protected static final Logger a = Logger.getLogger(epx_1.class);
    private static final epx_1 b = new epx_1();
    private final TIntObjectHashMap<epw_1> c = new TIntObjectHashMap();

    public void a(epw_1 epw_12) {
        int n = epw_12.b();
        if (!this.c.containsKey(n)) {
            this.c.put(n, (Object)epw_12);
        } else {
            a.warn((Object)"tentative de surchage de la d\u00e9finition d'une famille dans le MonsterFamilyManager");
        }
    }

    public epw_1 a(int n) {
        return (epw_1)this.c.get(n);
    }

    public TIntObjectIterator<epw_1> a() {
        return this.c.iterator();
    }

    public epw_1 b(epw_1 epw_12) {
        return this.a(epw_12, epy_1.a);
    }

    public epw_1 c(epw_1 epw_12) {
        return this.a(epw_12, epy_1.b);
    }

    public epw_1 d(epw_1 epw_12) {
        return this.a(epw_12, epy_1.c);
    }

    private epw_1 a(epw_1 epw_12, epy_1 epy_12) {
        TIntObjectIterator tIntObjectIterator = this.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            epw_1 epw_13 = (epw_1)tIntObjectIterator.value();
            if (epw_13.e() != epw_12.b() || epw_13.f() != epy_12) continue;
            return epw_13;
        }
        return null;
    }

    public static epx_1 b() {
        return b;
    }
}

