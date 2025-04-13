/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from eRV
 */
public enum erv_1 {
    a(1),
    b(2),
    c(3),
    d(4),
    e(1),
    f(2),
    g(3),
    h(4),
    i(5),
    j(6),
    k(7),
    l(8),
    m(1),
    n(2),
    o(3),
    p(4),
    q(1);

    private final ArrayList<erw_1> r = new ArrayList();
    private final byte s;
    private eQt t;

    private erv_1(int n2) {
        this.s = Hw.b((long)n2);
    }

    static void a() {
        erv_1 erv_12 = a;
    }

    private void a(erw_1 erw_12) {
        this.r.add(erw_12);
        erw_12.a(this);
    }

    public int b() {
        if (this.r.isEmpty()) {
            return -1;
        }
        return this.r.get((int)0).M;
    }

    public eQt c() {
        return this.t;
    }

    public byte d() {
        return this.s;
    }

    public boolean a(TObjectProcedure<erw_1> tObjectProcedure) {
        int n = this.r.size();
        for (int k = 0; k < n; ++k) {
            if (tObjectProcedure.execute((Object)this.r.get(k))) continue;
            return false;
        }
        return true;
    }

    public ArrayList<erw_1> e() {
        return this.r;
    }

    public erw_1 a(byte by) {
        if (by < 0 || by >= this.r.size()) {
            return null;
        }
        return this.r.get(by);
    }

    static {
        a.a(erw_1.a);
        b.a(erw_1.b);
        c.a(erw_1.c);
        d.a(erw_1.d);
        e.a(erw_1.e);
        e.a(erw_1.f);
        e.a(erw_1.g);
        f.a(erw_1.h);
        f.a(erw_1.i);
        f.a(erw_1.j);
        g.a(erw_1.k);
        g.a(erw_1.l);
        g.a(erw_1.m);
        h.a(erw_1.n);
        h.a(erw_1.o);
        h.a(erw_1.p);
        i.a(erw_1.q);
        i.a(erw_1.r);
        i.a(erw_1.s);
        j.a(erw_1.t);
        j.a(erw_1.u);
        j.a(erw_1.v);
        k.a(erw_1.w);
        k.a(erw_1.x);
        k.a(erw_1.y);
        l.a(erw_1.z);
        l.a(erw_1.A);
        l.a(erw_1.B);
        m.a(erw_1.C);
        m.a(erw_1.D);
        n.a(erw_1.E);
        n.a(erw_1.F);
        o.a(erw_1.G);
        o.a(erw_1.H);
        p.a(erw_1.I);
        p.a(erw_1.J);
        q.a(erw_1.K);
        erv_1.a.t = eQt.k;
        erv_1.b.t = eQt.l;
        erv_1.c.t = eQt.m;
        erv_1.d.t = eQt.n;
        erv_1.e.t = eQt.o;
        erv_1.f.t = eQt.p;
        erv_1.g.t = eQt.q;
        erv_1.h.t = eQt.r;
        erv_1.i.t = eQt.s;
        erv_1.j.t = eQt.t;
        erv_1.k.t = eQt.u;
        erv_1.l.t = eQt.v;
        erv_1.m.t = eQt.w;
        erv_1.n.t = eQt.x;
        erv_1.o.t = eQt.y;
        erv_1.p.t = eQt.z;
        erv_1.q.t = eQt.A;
    }
}

