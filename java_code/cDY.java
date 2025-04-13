/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class cDY<ASG extends all_1>
extends cdr_0<cDY> {
    protected static final Logger c = Logger.getLogger(cDY.class);
    private static final boolean m = false;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    private final TLongArrayList n = new TLongArrayList();
    private boolean o = false;
    protected final TLongArrayList k = new TLongArrayList();
    private int p = 0;
    private int q = 0;
    private int r = 0;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private int v = 0;
    private boolean w = true;
    private int x = 5;
    private int y;
    private int z;
    private int A = 0;
    protected ASG l;
    private long B;
    private long C;
    private long D;
    private long E;
    private long F;
    private long G;
    private int H;
    private long I;
    private long J;
    private long K;
    private int L;
    private amj_1 M;
    private amj_1 N;
    private int O = 0;
    private long P;
    private boolean Q = false;
    private cdz_0 R;

    @Override
    public void a(ASG ASG) {
        this.l = ASG;
    }

    public ASG n() {
        return this.l;
    }

    public int o() {
        return this.r;
    }

    public void c(int n) {
        this.r = n;
    }

    public int p() {
        return this.s;
    }

    public void d(int n) {
        this.s = n;
        this.t = Math.max(this.s, this.t);
    }

    public int q() {
        return this.t;
    }

    public void e(int n) {
        this.t = n;
        this.s = Math.min(this.s, this.t);
    }

    public int r() {
        return this.u;
    }

    public void f(int n) {
        this.u = n;
        this.v = Math.max(this.u, this.v);
    }

    public int s() {
        return this.v;
    }

    public void g(int n) {
        this.v = n;
        this.u = Math.min(this.u, this.v);
    }

    public int t() {
        return this.z;
    }

    public void h(int n) {
        this.z = n;
    }

    public int u() {
        return this.A;
    }

    public void i(int n) {
        this.A = n;
    }

    public int v() {
        return this.q;
    }

    public void j(int n) {
        this.q = n;
    }

    public int w() {
        return this.O;
    }

    public void k(int n) {
        this.O = n;
    }

    public void c(long l) {
        this.n.add(l);
        this.o = false;
    }

    @Override
    public void a(long[] lArray) {
        this.n.add(lArray);
        this.o = false;
    }

    @Override
    public void a(cdz_0 cdz_02) {
        this.R = cdz_02;
    }

    @Override
    public cDY bh_() {
        if (this.a()) {
            return this;
        }
        return null;
    }

    @Override
    public void a(ArrayList<cDY> arrayList) {
        if (this.a()) {
            arrayList.add(this);
        }
    }

    @Override
    public void a(ArrayList<cDY> arrayList, cer_0 cer_02) {
    }

    @Override
    public void a(ArrayList<cDY> arrayList, cdh_0 cdh_02) {
    }

    @Override
    public void b(long l) {
        this.F();
        this.B = l;
        this.H = 0;
        this.E = this.G = (long)0;
        this.F = this.G;
        if (this.C()) {
            this.p = 0;
        }
        if (this.O != 0) {
            this.P = l + (long)this.O;
            this.D = this.z >= 0 ? this.P + (long)this.z : 0L;
            this.Q = true;
            return;
        }
        this.D = this.z >= 0 ? l + (long)this.z : 0L;
        this.Q = true;
    }

    @Override
    public void a(long l) {
        this.x();
    }

    public void x() {
        this.F();
        this.Q = false;
    }

    public boolean d(long l) {
        this.C = l;
        if (!this.Q) {
            return true;
        }
        if (this.P != 0L) {
            if (l < this.P) {
                return true;
            }
            this.P = 0L;
        }
        if (this.z != -1 && this.D <= this.C) {
            this.F();
            this.Q = false;
            return false;
        }
        if (!this.C()) {
            if (this.M == null) {
                long l2 = this.z();
                if (l2 == -1L) {
                    return false;
                }
                boolean bl = false;
                switch (this.A) {
                    case 1: {
                        bl = true;
                        break;
                    }
                    case 2: {
                        bl = false;
                    }
                }
                this.M = this.a(l2, bl);
                if (this.M == null) {
                    return false;
                }
                if (this.A == 2) {
                    this.z = this.M.x();
                    long l3 = this.D = this.O != 0 ? this.P + (long)this.z : this.B + (long)this.z;
                }
                if (this.R != null) {
                    this.R.a(this.M);
                }
                this.H = this.m();
                float f2 = this.D();
                if (this.i()) {
                    this.M.c(f2);
                    this.M.e(f2);
                } else {
                    this.M.c(0.0f);
                    this.M.e(f2);
                    this.M.a(f2, Hw.a(1000, 0, this.M.x()));
                }
            }
            return true;
        }
        if (this.A()) {
            if (l >= this.G && this.G != -1L) {
                long l4;
                if (this.N != null) {
                    this.a(this.N, this.m());
                }
                if (this.M != null) {
                    this.a(this.M, true, this.H);
                }
                if ((l4 = this.z()) == -1L) {
                    return false;
                }
                this.N = this.a(l4, false);
                if (this.N != null) {
                    if (this.R != null) {
                        this.R.a(this.N);
                    }
                    this.I = l;
                    this.J = l + (long)this.N.x();
                    this.L = this.m();
                    this.K = Math.max(this.I, this.J - (long)this.L);
                    this.N.c(0.0f);
                    float f3 = this.D();
                    this.N.e(f3);
                    this.N.a(f3, this.l());
                }
                this.G();
            }
        } else {
            if (this.G == 0L) {
                this.G = l + (long)this.l();
            }
            if (l >= this.F && this.F != 0L) {
                this.a(this.M, false, 0.0f);
                this.M = null;
            }
            if (l >= this.G) {
                long l5 = this.z();
                if (l5 == -1L) {
                    return false;
                }
                this.M = this.a(l5, false);
                if (this.M != null) {
                    if (this.R != null) {
                        this.R.a(this.M);
                    }
                    this.E = l;
                    this.F = l + (long)this.M.x();
                    this.H = this.l();
                    this.G = this.F + (long)this.H;
                    this.M.c(this.D());
                }
            }
        }
        return true;
    }

    @Override
    private void a(amj_1 amj_12) {
        if (this.R != null) {
            this.R.a(amj_12);
        }
    }

    protected abstract amj_1 a(long var1, boolean var3);

    private int l() {
        return Hw.b(this.s, this.t);
    }

    private int m() {
        return Hw.b(this.u, this.v);
    }

    private long z() {
        long l;
        if (this.n.size() == 0) {
            return -1L;
        }
        if (!this.o) {
            this.E();
            this.p = 0;
        }
        if (this.p >= this.k.size()) {
            if (this.q == 1 && this.k.size() > 1 && this.y-- <= 0) {
                l = this.k.getQuick(this.k.size() - 1);
                do {
                    this.E();
                } while (l == this.k.getQuick(0));
            }
            this.p = 0;
        }
        l = this.k.getQuick(this.p);
        ++this.p;
        return l;
    }

    private boolean A() {
        return this.r == 0;
    }

    private boolean B() {
        return this.A == 1;
    }

    private boolean C() {
        return this.A == 0;
    }

    private float D() {
        float f2 = this.g();
        float f3 = this.h();
        if (f3 == -1.0f) {
            return f2;
        }
        f3 = Math.max(f2, f3);
        return Hw.a(f2, f3);
    }

    private void E() {
        if (!this.o || this.q == 1) {
            this.k.clear();
            this.k.add(this.n.toArray());
            this.o = true;
        }
        if (this.q == 1) {
            this.k.shuffle(Hw.b);
            int n = this.x;
            for (int k = this.k.size() - 1; k >= n; --k) {
                this.k.removeAt(k);
            }
            this.y = 20;
        }
    }

    private void F() {
        if (this.M != null) {
            this.a(this.M, true, 1000.0f);
            this.M = null;
        }
        if (this.N != null) {
            this.a(this.N, true, 1000.0f);
            this.N = null;
        }
    }

    private void a(amj_1 amj_12, float f2) {
        this.a(amj_12, this.A(), f2);
    }

    private void a(amj_1 amj_12, boolean bl, float f2) {
        if (amj_12 == null) {
            return;
        }
        if (bl) {
            amj_12.a(0.0f, f2);
            amj_12.f(true);
        } else {
            amj_12.u();
        }
    }

    private void G() {
        this.M = this.N;
        this.E = this.I;
        this.G = this.K;
        this.F = this.J;
        this.H = this.L;
        this.N = null;
        this.I = -1L;
        this.K = -1L;
        this.J = -1L;
        this.L = -1;
    }

    @Override
    protected void a(cey_2 cey_22) {
        super.a(cey_22);
        cey_22.c = false;
        int n = this.n.size();
        for (int k = 0; k < n; ++k) {
            cey_22.h.add(this.n.get(k));
        }
        cey_22.w = this.z;
        cey_22.v = this.A;
        cey_22.o = this.q;
        cey_22.p = this.r;
        cey_22.q = this.s;
        cey_22.r = this.t;
        cey_22.m = cdl_0.a(this.l).a();
    }

    @Override
    public void a(TObjectProcedure<cDY> tObjectProcedure) {
        tObjectProcedure.execute((Object)this);
    }

    public cDY y() {
        cDY cDY2 = this.j();
        this.b(cDY2);
        return cDY2;
    }

    protected abstract cDY j();

    @Override
    protected void b(cdr_0 cdr_02) {
        cDY cDY2 = (cDY)cdr_02;
        super.b(cDY2);
        cDY2.a(this.n.toArray());
        cDY2.q = this.q;
        cDY2.r = this.r;
        cDY2.s = this.s;
        cDY2.t = this.t;
        cDY2.u = this.u;
        cDY2.v = this.v;
        cDY2.w = this.w;
        cDY2.x = this.x;
        cDY2.z = this.z;
        cDY2.A = this.A;
        cDY2.l = this.l;
        cDY2.O = this.O;
    }
}

