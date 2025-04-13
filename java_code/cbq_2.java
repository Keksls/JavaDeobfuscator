/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.ArrayList;

/*
 * Renamed from cbq
 */
public class cbq_2
implements xp_0 {
    @Override
    public void a(xu_0 xu_02) {
        TShortObjectHashMap tShortObjectHashMap = new TShortObjectHashMap();
        TShortObjectHashMap tShortObjectHashMap2 = new TShortObjectHashMap();
        TShortObjectHashMap tShortObjectHashMap3 = new TShortObjectHashMap();
        TShortObjectHashMap tShortObjectHashMap4 = new TShortObjectHashMap();
        TShortObjectHashMap tShortObjectHashMap5 = new TShortObjectHashMap();
        TShortObjectHashMap tShortObjectHashMap6 = new TShortObjectHashMap();
        TIntObjectHashMap<xs_0> tIntObjectHashMap = xu_02.d();
        ArrayList<xr_0> arrayList = xu_02.c();
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            xs_0 xs_02 = (xs_0)tIntObjectIterator.value();
            for (xr_0 xr_02 : arrayList) {
                if (!xs_02.a(xr_02)) continue;
                cbq_2.a(xr_02, xs_02, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap2, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap3, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap4, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap6, (TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap5);
            }
        }
        xu_02.a((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap6);
        xu_02.b((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap5);
        xu_02.e((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap2);
        xu_02.f((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap);
        xu_02.c((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap3);
        xu_02.d((TShortObjectHashMap<ArrayList<String>>)tShortObjectHashMap4);
    }

    private static void a(xr_0 xr_02, xs_0 xs_02, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap2, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap3, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap4, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap5, TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap6) {
        short s2 = xr_02.a();
        switch (xs_02.c()) {
            case b: {
                if (xs_02.d()) {
                    if (!tShortObjectHashMap6.containsKey(s2)) {
                        tShortObjectHashMap6.put(s2, new ArrayList());
                    }
                    ArrayList arrayList = (ArrayList)tShortObjectHashMap6.get(s2);
                    arrayList.add(xs_02.b());
                    break;
                }
                if (!tShortObjectHashMap5.containsKey(s2)) {
                    tShortObjectHashMap5.put(s2, new ArrayList());
                }
                ArrayList arrayList = (ArrayList)tShortObjectHashMap5.get(s2);
                arrayList.add(xs_02.b());
                break;
            }
            case c: {
                if (xs_02.d()) {
                    if (!tShortObjectHashMap4.containsKey(s2)) {
                        tShortObjectHashMap4.put(s2, new ArrayList());
                    }
                    ArrayList arrayList = (ArrayList)tShortObjectHashMap4.get(s2);
                    arrayList.add(xs_02.b());
                    break;
                }
                if (!tShortObjectHashMap3.containsKey(s2)) {
                    tShortObjectHashMap3.put(s2, new ArrayList());
                }
                ArrayList arrayList = (ArrayList)tShortObjectHashMap3.get(s2);
                arrayList.add(xs_02.b());
                break;
            }
            case a: {
                if (xs_02.d()) {
                    if (!tShortObjectHashMap2.containsKey(s2)) {
                        tShortObjectHashMap2.put(s2, new ArrayList());
                    }
                    ArrayList arrayList = (ArrayList)tShortObjectHashMap2.get(s2);
                    arrayList.add(xs_02.b());
                    break;
                }
                if (!tShortObjectHashMap.containsKey(s2)) {
                    tShortObjectHashMap.put(s2, new ArrayList());
                }
                ArrayList arrayList = (ArrayList)tShortObjectHashMap.get(s2);
                arrayList.add(xs_02.b());
            }
        }
    }
}

