/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from bwH
 */
public class bwh_1
implements ena_1 {
    public static final bwh_1 a = new bwh_1();
    private final TIntObjectHashMap<ArrayList<bwe_1>> b = new TIntObjectHashMap();

    private bwh_1() {
    }

    public boolean a(bwg_0 bwg_02, long l) {
        ArrayList arrayList = (ArrayList)this.b.get(bwg_02.ordinal());
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            bwe_1 bwe_12 = (bwe_1)iterator.next();
            if (bwe_12.c() != l && bwe_12.c() != 0L) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    public boolean a(bwg_0 bwg_02, bwe_1 bwe_12) {
        ArrayList<bwe_1> arrayList = (ArrayList<bwe_1>)this.b.get(bwg_02.ordinal());
        if (arrayList == null) {
            arrayList = new ArrayList<bwe_1>();
            this.b.put(bwg_02.ordinal(), arrayList);
        }
        for (bwe_1 bwe_13 : arrayList) {
            if (bwe_13.c() != bwe_12.c()) continue;
            return false;
        }
        return arrayList.add(bwe_12);
    }

    private void a(bwg_0 bwg_02) {
        ArrayList arrayList = (ArrayList)this.b.get(bwg_02.ordinal());
        if (arrayList != null) {
            for (int k = 0; k < arrayList.size(); ++k) {
                ((bwe_1)arrayList.get(k)).a();
            }
        }
    }

    private void a(bwg_0 bwg_02, epq_2 epq_22) {
        ArrayList arrayList = (ArrayList)this.b.get(bwg_02.ordinal());
        if (arrayList != null) {
            for (int k = 0; k < arrayList.size(); ++k) {
                ((bwe_1)arrayList.get(k)).a(epq_22);
            }
        }
    }

    private void a(bwg_0 bwg_02, epq_2 epq_22, long l) {
        ArrayList arrayList = (ArrayList)this.b.get(bwg_02.ordinal());
        if (arrayList != null) {
            for (int k = 0; k < arrayList.size(); ++k) {
                ((bwe_1)arrayList.get(k)).a(epq_22, l);
            }
        }
    }

    @Override
    public void b() {
        this.a(bwg_0.a);
    }

    @Override
    public void c() {
        this.a(bwg_0.b);
    }

    @Override
    public void a() {
        this.a(bwg_0.c);
    }

    @Override
    public void d() {
    }

    @Override
    public void e() {
        this.a(bwg_0.e);
    }

    @Override
    public void bj_() {
        this.a(bwg_0.f);
    }

    public void a(epq_2 epq_22) {
        this.a(bwg_0.g, epq_22);
    }

    public void b(epq_2 epq_22) {
        this.a(bwg_0.h, epq_22);
    }

    public void c(epq_2 epq_22) {
        this.a(bwg_0.i, epq_22);
    }

    public void d(epq_2 epq_22) {
        this.a(bwg_0.j, epq_22);
    }

    public void e(epq_2 epq_22) {
        this.a(bwg_0.k, epq_22);
    }

    public void f(epq_2 epq_22) {
        this.a(bwg_0.l, epq_22);
    }

    @Override
    public void a(ekk_0 ekk_02) {
    }

    public void g(epq_2 epq_22) {
    }

    @Override
    public void g() {
        this.a(bwg_0.d);
        this.b.clear();
    }
}

