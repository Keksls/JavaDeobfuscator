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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eYJ
 */
public class eyj_1 {
    private static final Logger b = Logger.getLogger(eyj_1.class);
    public static final List<efa_0> a = Arrays.asList(efa_0.e, efa_0.d, efa_0.b, efa_0.c);
    private TIntObjectHashMap<HashSet<efa_0>> c = new TIntObjectHashMap();

    public eyj_1() {
    }

    public eyj_1(eyj_1 eyj_12) {
        TIntObjectIterator tIntObjectIterator = eyj_12.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            HashSet<efa_0> hashSet = new HashSet<efa_0>();
            for (efa_0 efa_02 : (HashSet)tIntObjectIterator.value()) {
                hashSet.add(efa_02);
            }
            this.c.put(tIntObjectIterator.key(), hashSet);
        }
    }

    public void a(wn_2 wn_22) {
        wn_22.a = eyj_1.a((HashSet)this.c.get(efc_0.p.a()));
        wn_22.b = eyj_1.a((HashSet)this.c.get(efc_0.q.a()));
    }

    public static eyj_1 b(wn_2 wn_22) {
        eyj_1 eyj_12 = new eyj_1();
        eyj_1.a(eyj_12, wn_22.a, efc_0.p.a());
        eyj_1.a(eyj_12, wn_22.b, efc_0.q.a());
        return eyj_12;
    }

    public static void a(eyj_1 eyj_12, byte by, int n) {
        if (by != 0) {
            HashSet<efa_0> hashSet = new HashSet<efa_0>();
            for (efa_0 efa_02 : a) {
                if ((by & 1 << efa_02.a()) == 0) continue;
                hashSet.add(efa_02);
            }
            eyj_12.a(n, hashSet);
        }
    }

    private void a(int n, HashSet<efa_0> hashSet) {
        this.c.put(n, hashSet);
    }

    public static byte a(HashSet<efa_0> hashSet) {
        byte by = 0;
        if (hashSet != null) {
            for (efa_0 efa_02 : a) {
                if (!hashSet.contains(efa_02)) continue;
                by = (byte)(by | 1 << efa_02.a());
            }
        }
        return by;
    }

    public byte a(int n) {
        return eyj_1.a((HashSet)this.c.get(n));
    }

    public void a(exk_2 exk_22) {
        for (efh_0 efh_02 : exk_22) {
            int n = efh_02.j();
            if (n != efc_0.p.a() && n != efc_0.q.a()) continue;
            if (this.c == null) {
                this.c = new TIntObjectHashMap();
            }
            HashSet hashSet = (HashSet)this.c.get(n);
            HashSet<efa_0> hashSet2 = new HashSet<efa_0>();
            do {
                hashSet2.clear();
                ArrayList<efa_0> arrayList = new ArrayList<efa_0>(a);
                int n2 = (int)efh_02.a(1);
                if (n2 > arrayList.size()) {
                    b.error((Object)("[GD-SAISIE] un effet \u00e0 \u00e9l\u00e9ments variables demande un nombre d'\u00e9l\u00e9ments trop important : " + efh_02));
                    continue;
                }
                while (n2 > hashSet2.size()) {
                    int n3 = xc_0.a(arrayList.size()) - 1;
                    efa_0 efa_02 = arrayList.remove(n3);
                    hashSet2.add(efa_02);
                }
            } while (eyj_1.a(hashSet) == eyj_1.a(hashSet2));
            this.c.put(n, hashSet2);
        }
    }

    public HashSet<efa_0> b(int n) {
        return (HashSet)this.c.get(n);
    }

    public TIntObjectHashMap<HashSet<efa_0>> a() {
        return this.c;
    }

    public boolean b() {
        if (this.c.isEmpty()) {
            return true;
        }
        TIntObjectIterator tIntObjectIterator = this.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (((HashSet)tIntObjectIterator.value()).isEmpty()) continue;
            return false;
        }
        return true;
    }

    public int c(int n) {
        if (!this.c.containsKey(n)) {
            return 0;
        }
        return ((HashSet)this.c.get(n)).size();
    }

    public String toString() {
        return "MultiElementsInfo{m_multiElementsEffects=" + this.c + "}";
    }
}

