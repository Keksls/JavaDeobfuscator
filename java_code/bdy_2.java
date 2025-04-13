/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from bdY
 */
class bdy_2
implements asb_2<aTn> {
    final /* synthetic */ ect_0 a;
    final /* synthetic */ TIntObjectHashMap b;
    final /* synthetic */ TIntObjectHashMap c;
    final /* synthetic */ Map d;
    final /* synthetic */ Map e;

    bdy_2(ect_0 ect_02, TIntObjectHashMap tIntObjectHashMap, TIntObjectHashMap tIntObjectHashMap2, Map map, Map map2) {
        this.a = ect_02;
        this.b = tIntObjectHashMap;
        this.c = tIntObjectHashMap2;
        this.d = map;
        this.e = map2;
    }

    public void a(aTn aTn2) {
        try {
            eco_0 eco_02 = bdw_2.a(aTn2);
            this.a.a(aTn2.c(), eco_02);
            int n = eco_02.k().a();
            if (!this.b.containsKey(n)) {
                this.b.put(n, new ArrayList());
            }
            ((ArrayList)this.b.get(n)).add(eco_02);
            Iterator<Map.Entry<Integer, Cm<Short, Short>>> iterator = eco_02.l();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Cm<Short, Short>> entry = iterator.next();
                int n2 = entry.getKey();
                ArrayList<eco_0> arrayList = (ArrayList<eco_0>)this.c.get(n2);
                if (arrayList == null) {
                    arrayList = new ArrayList<eco_0>();
                    this.c.put(n2, arrayList);
                }
                arrayList.add(eco_02);
                brj_1.a.a(n2, this.a.a(), eco_02.e(), eco_02.c(ecp_0.a));
            }
            if (!eco_02.n()) {
                return;
            }
            int n3 = eco_02.o();
            if (n3 == n) {
                return;
            }
            this.d.put(n3, n);
            this.e.put(n, n3);
        }
        catch (Exception exception) {
            bdw_2.a.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aTn)asu_22);
    }
}

