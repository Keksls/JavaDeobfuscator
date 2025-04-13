/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

public abstract class Vf<R extends Vk<T>, T extends Vi>
implements Vn<R> {
    private static final Logger d = Logger.getLogger(Vf.class);
    protected final Vr<R> a;
    private final Vj<T> e;
    private final ArrayList<Vl<R>> f = new ArrayList();
    protected final TLongObjectHashMap<R> b = new TLongObjectHashMap();
    private final TIntObjectHashMap<TLongArrayList> g = new TIntObjectHashMap();
    private final TIntArrayList h = new TIntArrayList();
    protected final boolean c = false;
    private boolean i = false;
    private final TObjectProcedure<R> j = new Vg(this);

    protected Vf(Vj<T> vj, Vr<R> vr) {
        this.e = vj;
        this.a = vr;
    }

    @Override
    public void a(Vh<R> vh) {
        for (Vk vk : vh) {
            this.b.put(vk.a(), (Object)vk);
        }
        this.b.forEachValue(this.j);
    }

    public Set<Long> a() {
        long[] lArray;
        HashSet<Long> hashSet = new HashSet<Long>();
        for (long l : lArray = this.b.keys()) {
            hashSet.add(l);
        }
        return hashSet;
    }

    protected void a(R r2) {
        this.a(r2.a(), 0, r2.b(), false);
    }

    @Override
    public void a(Vl<R> vl) {
        this.f.add(vl);
    }

    public boolean b() {
        return false;
    }

    private T c(R r2) {
        return this.e.a(r2.b(), this.b(r2));
    }

    public int b(R r2) {
        long l = r2.a();
        int n = r2.b();
        int n2 = 0;
        for (int k = this.h.size() - 1; k >= 0; --k) {
            int n3 = this.h.get(k);
            if (n3 > n) {
                n2 += ((TLongArrayList)this.g.get(n3)).size();
                continue;
            }
            if (n3 == n) {
                n2 += this.a(l, n3);
                continue;
            }
            return n2;
        }
        return n2;
    }

    private int a(long l, int n) {
        int n2;
        TLongArrayList tLongArrayList = (TLongArrayList)this.g.get(n);
        if (tLongArrayList.size() == 1) {
            return 0;
        }
        Vk vk = null;
        ArrayList<Vk> arrayList = new ArrayList<Vk>(tLongArrayList.size());
        int n3 = tLongArrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            long l2 = tLongArrayList.get(n2);
            Vk vk2 = (Vk)this.b.get(l2);
            if (vk2 == null) continue;
            if (l2 == l) {
                vk = vk2;
            }
            arrayList.add(vk2);
        }
        if (vk == null) {
            return 0;
        }
        Collections.sort(arrayList);
        n2 = arrayList.indexOf(vk);
        return n2 == -1 ? 0 : n2;
    }

    public int c() {
        return this.b.size();
    }

    public R a(long l) {
        Vk vk = (Vk)this.b.get(l);
        if (vk != null) {
            return (R)vk;
        }
        R r2 = this.c(l);
        r2.a(this.d());
        this.b.put(l, r2);
        this.a(r2);
        return r2;
    }

    public void b(long l) {
        Vk vk = (Vk)this.b.remove(l);
        if (vk == null) {
            return;
        }
        TLongArrayList tLongArrayList = (TLongArrayList)this.g.get(vk.b());
        if (tLongArrayList != null) {
            int n = tLongArrayList.indexOf(l);
            if (n >= 0) {
                tLongArrayList.removeAt(n);
            }
            if (tLongArrayList.isEmpty()) {
                this.g.remove(vk.b());
                int n2 = this.h.binarySearch(vk.b());
                if (n2 > -1) {
                    this.h.removeAt(n2);
                }
            }
        }
        this.d(vk);
    }

    protected abstract R c(long var1);

    public int d(long l) {
        if (l > 0L && this.b.containsKey(l)) {
            return ((Vk)this.b.get(l)).b();
        }
        return -1;
    }

    public R e(long l) {
        return (R)(this.b.containsKey(l) ? (Vk)this.b.get(l) : null);
    }

    public int d() {
        if (this.a != null) {
            return this.a.a();
        }
        return 1000;
    }

    public int e() {
        if (this.a != null) {
            return this.a.b();
        }
        return 2000;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l, int n, int n2, boolean bl) {
        if (n == n2) {
            return;
        }
        try {
            TLongArrayList tLongArrayList = (TLongArrayList)this.g.get(n);
            if (tLongArrayList != null) {
                ahx_2.a(tLongArrayList, l);
                if (tLongArrayList.isEmpty()) {
                    this.g.remove(n);
                    int n3 = this.h.binarySearch(n);
                    if (n3 > -1) {
                        this.h.removeAt(n3);
                    }
                }
            }
            if ((tLongArrayList = (TLongArrayList)this.g.get(n2)) == null) {
                tLongArrayList = new TLongArrayList();
                this.g.put(n2, (Object)tLongArrayList);
                this.h.add(n2);
                this.h.sort();
            }
            if (!tLongArrayList.contains(l)) {
                tLongArrayList.add(l);
            }
        }
        finally {
            this.a(l, bl);
        }
    }

    public Vm<R> a(R[] RArray) {
        if (RArray[0] != null && RArray[1] != null) {
            Vm vm = new Vm(RArray);
            vm.a(this);
            return vm;
        }
        return null;
    }

    @Override
    public void a(long l, Vm<R> vm) {
        Vk[] vkArray = vm.a();
        int[] nArray = vm.b();
        if (this.a != null) {
            this.a.a(vm);
        }
        this.a(vkArray[0].a(), nArray[0], vkArray[0].b(), true);
        this.a(vkArray[1].a(), nArray[1], vkArray[1].b(), true);
    }

    @Override
    public void a(Vq<R> vq) {
        TLongIntHashMap tLongIntHashMap = vq.d();
        if (this.a != null) {
            this.a.a(vq);
        }
        for (Vk vk : vq.a()) {
            this.a(vk.a(), tLongIntHashMap.get(vk.a()), vk.b(), true);
        }
        for (Vk vk : vq.b()) {
            this.a(vk.a(), tLongIntHashMap.get(vk.a()), vk.b(), true);
        }
    }

    public void a(long l, int n, boolean bl) {
        if (n < 0) {
            return;
        }
        Vk vk = (Vk)this.b.get(l);
        if (vk == null) {
            return;
        }
        int n2 = vk.b();
        vk.a(n);
        this.a(vk.a(), n2, n, false);
        if (bl) {
            vk.b(this.b(vk));
            vk.a(this.c(vk));
        }
    }

    public boolean a(TObjectProcedure<R> tObjectProcedure) {
        return this.b.forEachValue(tObjectProcedure);
    }

    private void a(long l, boolean bl) {
        Vk vk = (Vk)this.b.get(l);
        if (vk != null) {
            for (Vl<R> vl : this.f) {
                vl.a(vk, bl);
            }
        }
    }

    private void d(R r2) {
        if (r2 != null) {
            for (Vl<R> vl : this.f) {
                vl.a(r2);
            }
        }
    }

    public Vr<R> f() {
        return this.a;
    }
}

