/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eOI
 */
public class eoi_1
implements eoh_1 {
    private static final Logger a = Logger.getLogger(eoi_1.class);
    private static final int b = -1;
    private int c;
    private final TLongIntHashMap d = new TLongIntHashMap();
    private final TIntObjectHashMap<eou_2<efh_0>> e = new TIntObjectHashMap();
    private final TIntObjectHashMap<List<efh_0>> f = new TIntObjectHashMap();
    private final TLongObjectHashMap<efh_0> g = new TLongObjectHashMap();
    private final TLongHashSet h = new TLongHashSet();
    private final TLongObjectHashMap<abo_2<Integer, Integer>> i = new TLongObjectHashMap();

    @Override
    public void a(int n, List<efh_0> list) {
        eow_2<efh_0> eow_22 = new eow_2<efh_0>();
        int n2 = list.size();
        for (int k = 0; k < n2; ++k) {
            efh_0 efh_02 = list.get(k);
            eow_22.a(efh_02);
        }
        eow_22.a(new eoj_1(this));
        this.e.put(n, eow_22);
    }

    @Override
    public int a() {
        return this.c;
    }

    @Override
    public void a(int n) {
        this.c = n;
    }

    @Override
    public int a(long l) {
        return this.d.get(l);
    }

    @Override
    public void b(long l, int n) {
        if (n == -1) {
            return;
        }
        int n2 = this.d.get(l);
        this.d(l, n2 + n);
    }

    public void d(long l, int n) {
        int n2 = Math.max(0, n);
        int n3 = this.j(l);
        if (!this.d.containsKey(l)) {
            this.h.add(l);
        }
        this.d.put(l, n2);
        int n4 = this.j(l);
        if (n4 > n3) {
            this.h.remove(l);
        }
    }

    public int j(long l) {
        int n = Math.max(1, this.c);
        return this.a(l) / n - 1;
    }

    @Override
    public boolean a(long l, int n, int n2, boolean bl) {
        return this.a(l, this.c(n), n2, bl);
    }

    private boolean a(long l, efh_0 efh_02, int n, boolean bl) {
        List<efh_0> list = this.e(n);
        if (list == null) {
            return false;
        }
        if (!list.contains(efh_02)) {
            return false;
        }
        efh_0 efh_03 = (efh_0)this.g.get(l);
        if (efh_03 != null) {
            list.add(efh_03);
        }
        this.g.put(l, (Object)efh_02);
        this.g(l);
        if (bl) {
            list.remove(efh_02);
        }
        return true;
    }

    @Override
    public void c(long l) {
        this.g(l);
    }

    @Override
    @Nullable
    public efh_0 c(int n) {
        int[] nArray = this.e.keys();
        for (int k = 0; k < nArray.length; ++k) {
            int n2 = nArray[k];
            eou_2 eou_22 = (eou_2)this.e.get(n2);
            Object e2 = eou_22.a(n);
            if (e2 == null) continue;
            return e2;
        }
        return null;
    }

    protected List<efh_0> e(int n) {
        List list = (List)this.f.get(n);
        if (list != null && !list.isEmpty()) {
            return list;
        }
        ArrayList<efh_0> arrayList = new ArrayList<efh_0>();
        eou_2 eou_22 = (eou_2)this.e.get(n);
        if (eou_22 == null) {
            return Collections.emptyList();
        }
        arrayList.addAll(eou_22.a());
        this.f.put(n, arrayList);
        return arrayList;
    }

    @Override
    public List<efh_0> a(long l, int n) {
        return Collections.unmodifiableList(this.e(n));
    }

    @Override
    public void a(epq_2 epq_22, So so) {
        if (epq_22 == null || so == null) {
            return;
        }
        efh_0 efh_02 = (efh_0)this.g.get(epq_22.a_());
        if (efh_02 != null) {
            efh_02.a(eox_2.a(efh_02.i(), efh_02), epq_22, so, efc_0.a(), epq_22.G(), epq_22.H(), epq_22.I(), epq_22, null, false);
        }
        this.g.remove(epq_22.a_());
        this.h(epq_22.a_());
    }

    @Override
    public void i(long l) {
        this.g.remove(l);
    }

    @Override
    public void h(long l) {
        abo_2 abo_22 = (abo_2)this.i.get(l);
        if (abo_22 == null) {
            return;
        }
        abo_22.a(0);
        abo_22.b(0);
    }

    @Override
    public List<efh_0> b(int n) {
        eou_2 eou_22 = (eou_2)this.e.get(n);
        if (eou_22 == null) {
            return Collections.emptyList();
        }
        return eou_22.a();
    }

    @Override
    public TIntObjectHashMap<eou_2<efh_0>> b() {
        return this.e;
    }

    @Override
    public efh_0 d(long l) {
        return (efh_0)this.g.get(l);
    }

    @Override
    public boolean e(long l) {
        return this.g.containsKey(l);
    }

    @Override
    public int c(long l, int n) {
        abo_2<Integer, Integer> abo_22 = (abo_2<Integer, Integer>)this.i.get(l);
        if (abo_22 == null) {
            abo_22 = new abo_2<Integer, Integer>(0, 0);
            this.i.put(l, abo_22);
        }
        abo_22.a((Integer)abo_22.a() + n);
        abo_22.b(abo_22.b() + 1);
        return n;
    }

    @Override
    public int f(long l) {
        abo_2 abo_22 = (abo_2)this.i.get(l);
        if (abo_22 == null) {
            return -1;
        }
        if ((Integer)abo_22.b() == 0) {
            return 0;
        }
        return (Integer)abo_22.a() / (Integer)abo_22.b();
    }

    @Override
    public boolean b(long l) {
        if (!this.d.containsKey(l)) {
            return false;
        }
        return !this.h.contains(l);
    }

    @Override
    public void g(long l) {
        this.h.add(l);
    }

    @Override
    public int c() {
        return this.d.size();
    }

    public TLongIntHashMap d() {
        return this.d;
    }

    public TIntObjectHashMap<List<efh_0>> e() {
        return this.f;
    }

    @Override
    public byte[] d(int n) {
        return eod_1.a(this, n);
    }

    @Override
    public void a(byte[] byArray) {
        eod_1.a(byArray, this);
    }
}

