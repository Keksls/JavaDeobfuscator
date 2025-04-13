/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from epL
 */
public class epl_2 {
    private static final epl_2 a = new epl_2();
    private final TIntObjectHashMap<TIntObjectHashMap<List<epm_2>>> b = new TIntObjectHashMap();

    public static epl_2 a() {
        return a;
    }

    public void a(int n, int n2, short s2, short s3, short s4) {
        ArrayList<epm_2> arrayList;
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.b.get(n);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.b.put(n, (Object)tIntObjectHashMap);
        }
        if ((arrayList = (ArrayList<epm_2>)tIntObjectHashMap.get(n2)) == null) {
            arrayList = new ArrayList<epm_2>();
            tIntObjectHashMap.put(n2, arrayList);
        }
        Iterator iterator = arrayList.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            epm_2 epm_22 = (epm_2)iterator.next();
            if (epm_22.a() == s2) {
                throw new UnsupportedOperationException("Impossible d'ajouter deux fois un step de m\u00eame limite");
            }
            if (epm_22.a() > s2) break;
            ++n3;
        }
        arrayList.add(n3, new epm_2(s2, s3, s4));
    }

    public short a(int n, int n2, short s2) {
        epm_2 epm_22 = this.c(n, n2, s2);
        if (epm_22 != null) {
            return epm_22.c();
        }
        return Short.MAX_VALUE;
    }

    public short b(int n, int n2, short s2) {
        epm_2 epm_22 = this.c(n, n2, s2);
        if (epm_22 != null) {
            return epm_22.b();
        }
        return 0;
    }

    private epm_2 c(int n, int n2, short s2) {
        List list;
        epm_2 epm_22 = null;
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.b.get(n);
        if (tIntObjectHashMap != null && (list = (List)tIntObjectHashMap.get(n2)) != null) {
            for (epm_2 epm_23 : list) {
                if (epm_23.a() > s2) {
                    return epm_22;
                }
                epm_22 = epm_23;
            }
        }
        return epm_22;
    }

    public void b() {
        this.b.clear();
    }
}

