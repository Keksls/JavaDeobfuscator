/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.THashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

public class fyP {
    private static final Logger f = Logger.getLogger(fyP.class);
    private static final fyP g = new fyP();
    private static final boolean h = false;
    private static final THashSet<String> i = new THashSet();
    private static final int j = 100;
    private boolean k;
    private final Set<fyo> l = new HashSet<fyo>(100);
    private final Set<fyo> m = new HashSet<fyo>(100);
    private final Set<fyo> n = new HashSet<fyo>(100);
    private final Set<fyo> o = new HashSet<fyo>(100);
    private final Set<fyo> p = new HashSet<fyo>(100);
    private final Set<fyo> q = new HashSet<fyo>(100);
    private final Set<fyo> r = new HashSet<fyo>(100);
    private final Set<fyo> s = new HashSet<fyo>(100);
    private final Set<fyo> t = new HashSet<fyo>(100);
    private int u = 4;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private int v;
    private boolean w;

    private fyP() {
    }

    public static fyP a() {
        return g;
    }

    public void b() {
        this.k = true;
    }

    public boolean c() {
        return this.u != 4;
    }

    private void a(fyo fyo2, Set<fyo> set, Set<fyo> set2, int n) {
        if (!fyo2.isUnloading() && !fyo2.isInTreeDepthManager()) {
            if (this.u == n) {
                set.add(fyo2);
            } else {
                set2.add(fyo2);
            }
        }
    }

    private void a(fyo fyo2, Set<fyo> set) {
        if (!(fyo2.isUnloading() || fyo2.isATemplate() || fyo2.isAddedNextInTreeDepthManager())) {
            set.add(fyo2);
        }
    }

    public void a(fyo fyo2) {
        this.a(fyo2, this.m);
    }

    public void b(fyo fyo2) {
        this.a(fyo2, this.p);
    }

    public void c(fyo fyo2) {
        this.a(fyo2, this.s);
    }

    public void d(fyo fyo2) {
        if (!fyo2.isATemplate()) {
            if (this.u == 4 || this.u <= 1 && fyo2.getLastPreProcessFrame() != this.v) {
                this.a(fyo2, this.n, this.l, 1);
            } else {
                this.a(fyo2);
            }
        }
    }

    public void e(fyo fyo2) {
        if (!fyo2.isATemplate()) {
            if (this.u == 4 || this.u <= 2 && fyo2.getLastMiddleProcessFrame() != this.v) {
                this.a(fyo2, this.q, this.o, 2);
            } else {
                this.b(fyo2);
            }
        }
    }

    public void f(fyo fyo2) {
        if (!fyo2.isATemplate()) {
            if (this.u == 4 || this.u <= 3 && fyo2.getLastPostProcessFrame() != this.v) {
                this.a(fyo2, this.t, this.r, 3);
            } else {
                this.c(fyo2);
            }
        }
    }

    public boolean g(fyo fyo2) {
        return this.i(fyo2) || this.k(fyo2) || this.m(fyo2);
    }

    public boolean h(fyo fyo2) {
        return this.j(fyo2) || this.l(fyo2) || this.n(fyo2);
    }

    public boolean i(fyo fyo2) {
        return fyP.a(fyo2, this.l);
    }

    public boolean j(fyo fyo2) {
        return fyP.b(fyo2, this.l);
    }

    public boolean k(fyo fyo2) {
        return fyP.a(fyo2, this.o);
    }

    public boolean l(fyo fyo2) {
        return fyP.b(fyo2, this.o);
    }

    public boolean m(fyo fyo2) {
        return fyP.a(fyo2, this.r);
    }

    public boolean n(fyo fyo2) {
        return fyP.b(fyo2, this.r);
    }

    public static boolean a(fyo fyo2, Collection<fyo> collection) {
        if (fyo2.isATemplate()) {
            return false;
        }
        return collection.stream().anyMatch(fyo3 -> fyo3 == fyo2);
    }

    public static boolean b(fyo fyo2, Collection<fyo> collection) {
        if (fyo2.isATemplate()) {
            return false;
        }
        return collection.stream().anyMatch(fyo3 -> !fyo3.isATemplate() && fyo3.isChildOf(fyo2));
    }

    private int a(fyb_0 fyb_02, int n) {
        fyb_02.setTreePosition(n);
        if (fyb_02.m_children != null) {
            int n2 = fyb_02.m_children.size();
            for (int k = 0; k < n2; ++k) {
                n = this.a(fyb_02.m_children.get(k), n + 1);
            }
        }
        return n;
    }

    public void d() {
        this.w = true;
    }

    private void o(fyo fyo2) {
        fyb_0 fyb_02;
        fyy_0 fyy_02;
        if (fyo2.getElementType() == fyz.a && (fyy_02 = (fyb_02 = (fyb_0)fyo2).getElementMap()) != null) {
            i.add((Object)fyy_02.b());
        }
    }

    public void a(int n) {
        this.w = true;
        while (this.w) {
            ArrayList<fyo> arrayList;
            this.w = false;
            this.u = 0;
            this.v = (this.v + 1) % Integer.MAX_VALUE;
            if (this.k) {
                this.a(fpm_0.b().j().a(), 0);
                this.k = false;
            }
            fyX.c();
            this.u = 1;
            while (!this.l.isEmpty()) {
                arrayList = new ArrayList<fyo>(this.l);
                arrayList.sort(fyq_0.a);
                for (fyo fyo2 : arrayList) {
                    fyo2.setLastPreProcessFrame(this.v);
                    fyo2.doPreProcess(n);
                }
                this.l.clear();
                this.l.addAll(this.n);
                this.n.clear();
            }
            this.u = 2;
            while (!this.o.isEmpty()) {
                arrayList = new ArrayList<fyo>(this.o);
                arrayList.sort(fyR.a);
                for (fyo fyo2 : arrayList) {
                    fyo2.setLastMiddleProcessFrame(this.v);
                    fyo2.doMiddleProcess(n);
                }
                this.o.clear();
                this.o.addAll(this.q);
                this.q.clear();
            }
            this.u = 3;
            while (!this.r.isEmpty()) {
                arrayList = new ArrayList<fyo>(this.r);
                arrayList.sort(fyR.a);
                for (fyo fyo2 : arrayList) {
                    fyo2.setLastPostProcessFrame(this.v);
                    fyo2.doPostProcess(n);
                }
                this.r.clear();
                this.r.addAll(this.t);
                this.t.clear();
            }
            this.u = 4;
            this.l.addAll(this.m);
            this.m.clear();
            this.o.addAll(this.p);
            this.p.clear();
            this.r.addAll(this.s);
            this.s.clear();
        }
    }

    private void e() {
        if (!i.isEmpty()) {
            f.info((Object)("[Frame " + this.v + "] Dialog process\u00e9es : "));
            for (String string : i) {
                f.info((Object)("\t\t" + string));
            }
        }
    }
}

