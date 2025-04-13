/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;

class cXr
implements brt_2 {
    final /* synthetic */ TIntObjectHashMap a;
    final /* synthetic */ cxq_0 b;

    cXr(cxq_0 cxq_02, TIntObjectHashMap tIntObjectHashMap) {
        this.b = cxq_02;
        this.a = tIntObjectHashMap;
    }

    @Override
    public void a(long l, List<bss_0<?, ?>> list) {
        for (bss_0<?, ?> bss_02 : list) {
            bSJ bSJ2;
            int n;
            int n2;
            ArrayList<bSJ> arrayList = bss_02.m();
            if (arrayList.size() != 1 || (n2 = bqW.a.b(n = (bSJ2 = (bSJ)arrayList.get(0)).a())) == 0) continue;
            bqU bqU2 = (bqU)this.a.get(n2);
            if (bqU2 == null) {
                cxq_0.b.error((Object)("Le compagnon de breed " + n2 + " n'existe pas !"));
                continue;
            }
            bqU2.a(bss_02);
        }
    }

    @Override
    public void a() {
        cxq_0.b.warn((Object)"Error has occured during listing of companion articles. (More detail in previous logs)");
    }
}

