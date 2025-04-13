/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from eNW
 */
final class enw_1 {
    private elv_0 a;
    private epq_2 b;
    private fio_0 c;
    private int d;
    private int e;
    private aff_1 f;
    private final Map<sr_0, Set<fir_0>> g = new HashMap<sr_0, Set<fir_0>>();
    private final Set<sr_0> h = new HashSet<sr_0>();
    private final Set<sr_0> i = new HashSet<sr_0>();

    enw_1() {
    }

    void a() {
        this.c();
        this.f();
    }

    private void c() {
        this.e();
        this.d();
    }

    private void d() {
        this.i.clear();
        Set<sr_0> set = this.h;
        if (set.isEmpty()) {
            return;
        }
        this.i.addAll(this.g());
        if (set.size() == 1) {
            this.i.removeAll(set);
        }
    }

    private void e() {
        aff_1 aff_12 = this.b.P_();
        this.h.clear();
        Set<sr_0> set = this.g();
        for (sr_0 sr_02 : set) {
            int n = aob_2.c((aoc_2)sr_02, aff_12);
            if (n > this.e || n < this.d || !this.a(this.b.P_(), sr_02.P_()) || !this.b(sr_02.P_(), aff_12)) continue;
            this.h.add(sr_02);
        }
    }

    private void f() {
        this.g.clear();
        Set<sr_0> set = this.i;
        if (set.isEmpty()) {
            return;
        }
        for (sr_0 sr_02 : set) {
            aff_1 aff_12 = sr_02.P_();
            HashSet<fir_0> hashSet = new HashSet<fir_0>();
            int n = aff_12.c(this.f.d(), this.f.e());
            if (((fin_0)this.c.r()).b(fic_0.o)) {
                if (n > 0) {
                    hashSet.add(fir_0.f);
                }
            } else {
                if (!this.b(this.f, aff_12)) {
                    hashSet.add(fir_0.r);
                }
                if (!enw_1.a(this.d, this.e, n)) {
                    hashSet.add(fir_0.f);
                }
                if (!this.a(sr_02.P_(), this.f)) {
                    hashSet.add(fir_0.d);
                }
            }
            this.g.put(sr_02, hashSet);
        }
    }

    private Set<sr_0> g() {
        HashSet<sr_0> hashSet = new HashSet<sr_0>();
        for (sr_0 sr_02 : this.a.i().f()) {
            TByteHashSet tByteHashSet;
            if (sr_02 == null || sr_02.w() != ele_0.q.a() || sr_02.Y() != this.b.Y() || (tByteHashSet = this.a.g().f(sr_02.G(), sr_02.H())) != null && !tByteHashSet.isEmpty()) continue;
            hashSet.add(sr_02);
        }
        return hashSet;
    }

    private static boolean a(int n, int n2, int n3) {
        return n3 <= n2 && n3 >= n;
    }

    private boolean a(aff_1 aff_12, aff_1 aff_13) {
        boolean bl = ((fin_0)this.c.r()).a(this.c, (Object)this.b, (Object)null, (Object)this.a.h());
        if (!bl) {
            return true;
        }
        return emj_2.a(aff_12.d(), aff_12.e(), aff_12.f(), this.b.W(), aff_13.d(), aff_13.e(), aff_13.f(), this.a.g());
    }

    private boolean b(aff_1 aff_12, aff_1 aff_13) {
        boolean bl = ((fin_0)this.c.r()).b(this.c, (Object)this.b, (Object)aff_12, (Object)this.a.h());
        if (!bl) {
            return true;
        }
        return enw_1.c(aff_12, aff_13);
    }

    private static boolean c(aff_1 aff_12, aff_1 aff_13) {
        return aff_13.d() == aff_12.d() || aff_13.e() == aff_12.e();
    }

    void a(Collection<sr_0> collection, Map<sr_0, Set<fir_0>> map) {
        collection.addAll(this.h);
        map.putAll(this.g);
    }

    void a(elv_0 elv_02, epq_2 epq_22, fio_0 fio_02, int n, int n2, aff_1 aff_12) {
        this.a = elv_02;
        this.b = epq_22;
        this.c = fio_02;
        this.d = n;
        this.e = n2;
        this.f = aff_12;
    }

    void b() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = null;
    }
}

