/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class cDO
implements alm_1 {
    private static final Logger a = Logger.getLogger(cDO.class);
    private static final boolean b = false;
    private long c;
    private int d;
    private String e;
    private final acy_2<acy_2<ArrayList<cDY>>> f = new acy_2(4);
    private final ach_2<ArrayList<cDY>> g = new ach_2();
    private final ArrayList<cdx_0> h = new ArrayList();
    private final ArrayList<cDY> i = new ArrayList();
    private final ArrayList<all_1> j = new ArrayList();
    private final TIntArrayList k = new TIntArrayList();
    private boolean l = false;
    private final ArrayList<cdp_0> m = new ArrayList();
    private final ArrayList<cDY> n = new ArrayList();
    private final ArrayList<cDY> o = new ArrayList();
    private final ArrayList<cDY> p = new ArrayList();

    public int a() {
        return this.d;
    }

    public void a(int n) {
        this.d = n;
    }

    public String b() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }

    public ArrayList<cDY> c() {
        return this.i;
    }

    public ArrayList<cdx_0> d() {
        return this.h;
    }

    public void a(cdx_0 cdx_02) {
        this.h.add(cdx_02);
    }

    public long e() {
        return this.c;
    }

    public void a(long l) {
        this.c = l;
    }

    public void f() {
        this.h.clear();
    }

    public void a(cdp_0 cdp_02) {
        this.m.add(cdp_02);
    }

    public void b(cdp_0 cdp_02) {
        this.m.remove(cdp_02);
    }

    public void b(long l) {
        if (this.i.size() == 0) {
            this.e(l);
        } else {
            this.l = true;
        }
    }

    private void a(all_1 all_12) {
        int n = this.j.indexOf(all_12);
        if (n == -1) {
            this.j.add(all_12);
            this.k.add(1);
            all_12.a(this);
        } else {
            this.k.setQuick(n, this.k.getQuick(n) + 1);
        }
    }

    private void b(all_1 all_12) {
        int n = this.j.indexOf(all_12);
        if (n != -1) {
            int n2 = this.k.getQuick(n);
            if (n2 > 1) {
                this.k.setQuick(n, n2 - 1);
            } else {
                this.j.remove(n);
                this.k.removeAt(n);
                all_12.b(this);
            }
        }
    }

    private void i() {
        this.n.clear();
        for (int k = this.h.size() - 1; k >= 0; --k) {
            this.h.get(k).a(this.n);
        }
    }

    public void g() {
        this.c(System.currentTimeMillis());
    }

    public synchronized void c(long l) {
        int n;
        Iterable<Object> iterable;
        int n2;
        for (n2 = this.f.d() - 1; n2 >= 0; --n2) {
            iterable = this.f.h(n2);
            if (iterable == null) continue;
            for (n = ((acq_2)((Object)iterable)).d() - 1; n >= 0; --n) {
                ArrayList arrayList = (ArrayList)((acy_2)iterable).h(n);
                int n3 = arrayList.size();
                for (int k = 0; k < n3; ++k) {
                    cDY cDY2 = (cDY)arrayList.get(k);
                    cDY2.a(l);
                    this.b((all_1)cDY2.n());
                }
            }
            ((acy_2)iterable).c();
        }
        for (n2 = this.g.d() - 1; n2 >= 0; --n2) {
            iterable = this.g.c(n2);
            if (iterable == null) continue;
            int n4 = ((ArrayList)iterable).size();
            for (n = 0; n < n4; ++n) {
                cDY cDY3 = (cDY)((ArrayList)iterable).get(n);
                cDY3.a(l);
                this.b((all_1)cDY3.n());
            }
            ((ArrayList)iterable).clear();
        }
        this.g.c();
        int n5 = this.i.size();
        for (n2 = 0; n2 < n5; ++n2) {
            cDY cDY4 = this.i.get(n2);
            cDY4.a(l);
            this.b((all_1)cDY4.n());
        }
        this.i.clear();
    }

    public void h() {
        this.d(System.currentTimeMillis());
    }

    public void d(long l) {
        this.e(l);
    }

    private void a(@NotNull cDY cDY2, long l) {
        this.a(this.i, cDY2, l);
    }

    private void a(@NotNull ArrayList<cDY> arrayList, @NotNull cDY cDY2, long l) {
        arrayList.add(cDY2);
        cDY2.b(l);
        this.a((all_1)cDY2.n());
    }

    private void b(@NotNull cDY cDY2, long l) {
        this.b(this.i, cDY2, l);
    }

    private void b(@NotNull ArrayList<cDY> arrayList, @NotNull cDY cDY2, long l) {
        arrayList.remove(cDY2);
        cDY2.a(l);
        this.b((all_1)cDY2.n());
    }

    public synchronized void a(cer_0 cer_02, long l) {
        int n;
        int n2;
        ArrayList<cDY> arrayList;
        this.o.clear();
        for (int k = this.h.size() - 1; k >= 0; --k) {
            this.h.get(k).a(this.o, cer_02);
        }
        acy_2<ArrayList<cDY<Object>>> acy_22 = this.f.g(cer_02.h());
        if (acy_22 == null) {
            acy_22 = new acy_2();
            this.f.a(cer_02.h(), acy_22);
        }
        if ((arrayList = acy_22.g(n2 = cer_02.d())) == null) {
            arrayList = new ArrayList();
            acy_22.a(n2, arrayList);
        }
        for (n = arrayList.size() - 1; n >= 0; --n) {
            cDY<Object> cDY2 = arrayList.get(n);
            if (this.o.contains(cDY2)) continue;
            this.b(arrayList, cDY2, l);
        }
        int n3 = this.o.size();
        for (n = 0; n < n3; ++n) {
            cDY cDY3 = this.o.get(n);
            if (cer_02.i() && cDY3 instanceof cDW) {
                cDW cDW2 = (cDW)cDY3;
                cDW2.a(cer_02.j());
            }
            if (arrayList.contains(cDY3)) continue;
            this.a(arrayList, cDY3, l);
        }
    }

    public synchronized void a(long l, alo_1 alo_12, cdh_0 cdh_02, long l2) {
        this.p.clear();
        for (int k = this.h.size() - 1; k >= 0; --k) {
            this.h.get(k).a(this.p, cdh_02);
        }
        if (this.p.size() == 0) {
            return;
        }
        ArrayList<cDY> arrayList = this.g.e(l);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.g.a(l, arrayList);
        }
        int n = this.p.size();
        for (int k = 0; k < n; ++k) {
            cDY cDY2 = this.p.get(k).y();
            if (cDY2 instanceof cDW) {
                cDW cDW2 = (cDW)cDY2;
                cDW2.a(alo_12);
            }
            if (arrayList.contains(cDY2)) continue;
            this.a(arrayList, cDY2, l2);
        }
    }

    public synchronized void a(long l, long l2) {
        ArrayList<cDY> arrayList = this.g.d(l);
        if (arrayList == null) {
            return;
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            cDY cDY2 = arrayList.get(k);
            cDY2.a(l2);
            this.b((all_1)cDY2.n());
        }
    }

    private void e(long l) {
        int n;
        this.i();
        for (n = this.i.size() - 1; n >= 0; --n) {
            cDY cDY2 = this.i.get(n);
            if (this.n.contains(cDY2)) continue;
            this.b(cDY2, l);
        }
        int n2 = this.n.size();
        for (n = 0; n < n2; ++n) {
            cDY cDY3 = this.n.get(n);
            if (this.i.contains(cDY3)) continue;
            this.a(cDY3, l);
        }
        this.l = false;
    }

    @Override
    public synchronized void a(all_1 all_12, long l) {
        int n;
        Iterable<Object> iterable;
        int n2;
        if (this.l) {
            this.e(l);
        }
        for (n2 = this.i.size() - 1; n2 >= 0; --n2) {
            this.a(all_12, l, this.i, n2);
        }
        for (n2 = this.f.d() - 1; n2 >= 0; --n2) {
            iterable = this.f.h(n2);
            for (n = ((acq_2)((Object)iterable)).d() - 1; n >= 0; --n) {
                ArrayList<cDY> arrayList = ((acy_2)iterable).h(n);
                for (int k = arrayList.size() - 1; k >= 0; --k) {
                    this.a(all_12, l, arrayList, k);
                }
            }
        }
        for (n2 = this.g.d() - 1; n2 >= 0; --n2) {
            iterable = this.g.c(n2);
            for (n = ((ArrayList)iterable).size() - 1; n >= 0; --n) {
                this.a(all_12, l, (ArrayList<cDY>)iterable, n);
            }
        }
        int n3 = this.m.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.m.get(n2).a(this);
        }
    }

    private void a(all_1 all_12, long l, ArrayList<cDY> arrayList, int n) {
        cDY cDY2 = arrayList.get(n);
        if (cDY2.n() != all_12) {
            return;
        }
        if (!cDY2.d(l)) {
            arrayList.remove(cDY2);
            this.b((all_1)cDY2.n());
        }
    }
}

