/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from afz
 */
public class afz_0
extends abt<afv> {
    protected static final Logger d = Logger.getLogger(afz_0.class);
    private static final afz_0 g = new afz_0();
    protected final ConcurrentHashMap<Long, afv> e;
    protected final List<afv> f;
    private final List<afv> h = new ArrayList<afv>();
    private boolean i;
    private final ArrayList<afw_0> j;
    private final ArrayList<afx_0> k;
    private final ArrayList<afw_0> l;
    private final ArrayList<afx_0> m;

    private afz_0() {
        this.e = new ConcurrentHashMap();
        this.f = new ArrayList<afv>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
    }

    public static afz_0 d() {
        return g;
    }

    protected Collection<afv> e() {
        return this.e.values();
    }

    public void a(afv afv2) {
        ArrayList<afv> arrayList = afv2.aJ();
        if (arrayList != null) {
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                afv afv3 = arrayList.get(k);
                if (!afv3.b()) continue;
                this.a(afv3);
            }
        }
        this.e.put(afv2.a(), afv2);
        this.f.remove(afv2);
        this.d(afv2);
    }

    private void d(afv afv2) {
        int n = this.l.size();
        for (int k = 0; k < n; ++k) {
            this.l.get(k).onMobileCreation(afv2);
        }
    }

    public afv a(long l) {
        afv afv2 = this.e.remove(l);
        if (afv2 != null) {
            this.f.add(afv2);
            this.e(afv2);
        }
        return afv2;
    }

    private void e(afv afv2) {
        int n = this.m.size();
        for (int k = 0; k < n; ++k) {
            this.m.get(k).onMobileDestruction(afv2);
        }
    }

    public afv b(afv afv2) {
        return this.a(afv2.a());
    }

    public afv c(afv afv2) {
        ArrayList<afv> arrayList = afv2.aJ();
        if (arrayList != null) {
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                afv afv3 = arrayList.get(k);
                if (!afv3.b()) continue;
                this.c(afv3);
            }
        }
        afv afv4 = this.e.remove(afv2.a());
        this.e(afv2);
        return afv4;
    }

    public void f() {
        for (afv afv2 : this.e.values()) {
            this.e(afv2);
        }
        for (afv afv2 : this.f) {
            this.e(afv2);
        }
        for (afv afv2 : this.e.values()) {
            afv2.R();
        }
        this.e.clear();
        for (afv afv2 : this.f) {
            afv2.R();
        }
        this.f.clear();
        this.c.clear();
        this.h.clear();
        this.l.clear();
        this.l.addAll(this.j);
        this.m.clear();
        this.m.addAll(this.k);
    }

    public afv b(long l) {
        return this.e.get(l);
    }

    public Collection<afv> g() {
        return this.e.values();
    }

    public int h() {
        return this.e.size();
    }

    public void i() {
        this.f.addAll(this.e.values());
        for (int k = this.f.size(); k <= 0; --k) {
            this.f.get(k).E();
        }
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        int n2 = this.f.size();
        for (int k = 0; k < n2; ++k) {
            afv afv3 = this.f.get(k);
            if (afv3.e()) {
                afv3.d().aH();
            }
            if (afv3.aG()) {
                afv3.aH();
            }
            if (afv3.aJ() != null) {
                afv3.aI();
            }
            if (afv3.aK() != null) {
                afv3.aK().e(afv3);
            }
            this.c.remove(afv3);
            afv3.R();
        }
        this.f.clear();
        this.k();
        List<afv> list = List.copyOf(this.h);
        list.forEach(afv2 -> afv2.a(acb_02, n));
        list.forEach(afv2 -> afv2.a((ahg_0)acb_02, n));
    }

    private List<afv> k() {
        Collection<afv> collection = this.e.values();
        this.h.clear();
        for (afv afv2 : collection) {
            int n = -1;
            afv afv3 = afv2.d();
            if (afv3 != null && (n = this.h.indexOf(afv3)) != -1) {
                this.h.add(n + 1, afv2);
                continue;
            }
            afv afv4 = afv2.c();
            if (afv4 != null && (n = this.h.indexOf(afv4)) != -1) {
                this.h.add(n, afv2);
                continue;
            }
            afv afv5 = afv2.aK();
            if (afv5 != null && !this.h.contains(afv2) && (n = this.h.indexOf(afv5)) != -1) {
                this.h.add(n + 1, afv2);
                continue;
            }
            this.h.add(afv2);
            ArrayList<afv> arrayList = afv2.aJ();
            if (arrayList == null) continue;
            int n2 = arrayList.size();
            for (int k = 0; k < n2; ++k) {
                afv afv6 = arrayList.get(k);
                if (!this.h.remove(afv6)) continue;
                this.h.add(afv6);
            }
        }
        return this.h;
    }

    @Override
    public void a(acb_0 acb_02, float f2, float f3) {
        this.c.clear();
        for (int k = 0; k < this.h.size(); ++k) {
            afv afv2 = this.h.get(k);
            if (afv2.a(acb_02)) {
                afv2.k(false);
                this.a(afv2, acb_02);
                this.c.add(afv2);
                continue;
            }
            afv2.k(true);
        }
    }

    public void a(afw_0 afw_02) {
        if (!this.j.contains(afw_02)) {
            this.j.add(afw_02);
        }
    }

    public void a(afx_0 afx_02) {
        if (!this.k.contains(afx_02)) {
            this.k.add(afx_02);
        }
    }

    public void b(afw_0 afw_02) {
        if (!this.l.contains(afw_02)) {
            this.l.add(afw_02);
        }
    }

    public void c(afw_0 afw_02) {
        this.l.remove(afw_02);
    }

    public void b(afx_0 afx_02) {
        if (!this.m.contains(afx_02)) {
            this.m.add(afx_02);
        }
    }

    public void c(afx_0 afx_02) {
        this.m.remove(afx_02);
    }

    @Override
    public void c() {
        for (afv afv2 : this.e.values()) {
            aiI.a(afv2);
        }
    }

    public boolean j() {
        return this.i;
    }

    public void a(boolean bl) {
        this.i = bl;
    }
}

