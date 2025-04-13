/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

public class eFy
extends Sz
implements efh_0 {
    private static final double m = 1.0E-5;
    private final float n;
    private final float o;
    private final float[] p;
    private final int q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private boolean v;
    private final int w;
    private final int x;
    private final apc_2 y;
    private boolean z;
    private final byte A;
    private List<rg_0> B;
    private List<rg_0> C;
    private List<rg_0> D;
    private List<rg_0> E;
    private List<rg_0> F;
    private List<rg_0> G;
    private final boolean H;
    private final boolean I;
    private final boolean J;
    private int K;
    private boolean L = true;
    private boolean M = true;
    private sc_0 N;
    private SA O;
    private final aqd_1 P;
    protected static final int[] j = new int[0];
    protected static final float[] k = new float[0];
    protected static final int[] l = new int[]{0};
    private final float Q;
    private boolean R = false;
    private boolean S;
    private Set<eff_0> T;

    public eFy(int n, int n2, aqd_1 aqd_12, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int[] nArray7, long l, apt_2<Su> apt_22, boolean bl, float[] fArray, float f2, float f3, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n3, int n4, apc_2 apc_22, short s2, float f4, byte by, boolean bl6, boolean bl7, boolean bl8, boolean bl9, boolean bl10, aqd_1 aqd_13, boolean bl11, boolean bl12, boolean bl13) {
        super(n, n2, aqd_12, nArray, nArray2, nArray3, nArray4, nArray5, nArray6, nArray7, l, apt_22, bl, bl2, s2, bl3, bl4, bl5, bl7);
        this.P = aqd_13;
        this.n = f2;
        this.o = f3;
        this.p = fArray;
        this.q = fArray.length / 2;
        this.A = by;
        this.w = n3;
        this.x = n4;
        this.y = apc_22;
        this.r = bl6;
        this.s = bl11;
        this.t = bl12;
        this.u = bl13;
        this.H = bl8;
        this.I = bl9;
        this.Q = f4;
        this.J = bl10;
        if (n2 != -1 && n2 != -2) {
            ejh_0 ejh_02 = (ejh_0)efc_0.a().b(n2);
            if (ejh_02 == null) {
                a.error((Object)("Impossible de cr\u00e9er l'effet " + n + " : action " + n2 + " inconnue"));
            } else if (!ejh_02.c_().a(fArray.length)) {
                a.error((Object)("Impossible de cr\u00e9er l'effet " + n + " : nombre de param\u00e8tres incorrect : " + fArray.length));
            }
        }
    }

    protected eFy(int n, int n2, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4, BitSet bitSet5, BitSet bitSet6, BitSet bitSet7, long l, apt_2<Su> apt_22, boolean bl, float[] fArray, float f2, float f3, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n3, int n4, apc_2 apc_22, short s2, float f4, boolean bl6, boolean bl7, boolean bl8, boolean bl9, boolean bl10, aqd_1 aqd_13, boolean bl11, boolean bl12, boolean bl13) {
        super(n, n2, aqd_12, bitSet, bitSet2, bitSet3, bitSet4, bitSet5, bitSet6, bitSet7, l, apt_22, bl, bl2, s2, bl3, bl4, bl5, bl6);
        this.P = aqd_13;
        this.n = f2;
        this.o = f3;
        this.p = fArray;
        this.q = fArray.length / 2;
        this.A = (byte)-1;
        this.r = bl9;
        this.s = bl11;
        this.t = bl12;
        this.u = bl13;
        this.Q = f4;
        this.w = n3;
        this.x = n4;
        this.y = apc_22;
        this.H = bl7;
        this.I = bl8;
        this.J = bl10;
    }

    @Override
    public byte h() {
        return 0;
    }

    @Override
    public float b(short s2) {
        return this.n + (float)s2 * this.o;
    }

    @Override
    public boolean L() {
        return this.H || this.I;
    }

    @Override
    public boolean M() {
        return this.H;
    }

    @Override
    public boolean N() {
        return this.I;
    }

    public boolean af() {
        return this.J;
    }

    @Override
    public byte D() {
        return this.A;
    }

    @Override
    public float[] E() {
        return this.p;
    }

    @Override
    public int F() {
        return this.q;
    }

    @Override
    public int a(int n, short s2, eFb eFb2) {
        float f2 = this.a(n, s2);
        switch (eFb2) {
            case a: {
                if (this.p[n * 2 + 1] >= 0.0f) {
                    return (int)Math.floor(f2);
                }
                return (int)Math.ceil(f2);
            }
        }
        return (int)f2;
    }

    @Override
    public float a(int n, short s2) {
        if (n < 0 || n >= this.p.length / 2) {
            throw new IllegalArgumentException("Tentative de r\u00e9cup\u00e9ration d'un param\u00e8tre d'ID " + n + " alors que le nombre de valeurs est de " + this.p.length + " effet : " + this.i());
        }
        float f2 = this.p[n * 2 + 1] * (float)s2;
        if ((double)Math.abs(f2 - (float)Math.round(f2)) < 1.0E-5) {
            f2 = Math.round(f2);
        }
        return this.p[n * 2] + f2;
    }

    @Override
    public float a(int n) {
        if (n < 0 || n >= this.p.length / 2) {
            throw new IllegalArgumentException("Tentative de r\u00e9cup\u00e9ration d'un param\u00e8tre d'ID " + n + " alors que le nombre de valeurs est de " + this.p.length);
        }
        return this.p[n * 2];
    }

    public float c(int n) {
        if (n < 0 || n >= this.p.length / 2) {
            throw new IllegalArgumentException("Tentative de r\u00e9cup\u00e9ration d'un param\u00e8tre d'ID " + n + " alors que le nombre de valeurs est de " + this.p.length);
        }
        return this.p[n * 2 + 1];
    }

    @Override
    public boolean G() {
        return this.r;
    }

    @Override
    public boolean H() {
        return this.s;
    }

    @Override
    public boolean I() {
        return this.t;
    }

    @Override
    public boolean J() {
        return this.u;
    }

    public eFy ae() {
        float[] fArray = new float[this.p.length];
        System.arraycopy(this.p, 0, fArray, 0, this.p.length);
        eFy eFy2 = new eFy(this.i(), this.j(), this.u(), this.l(), this.m(), this.n(), this.o(), this.p(), this.q(), this.t(), this.w(), this.k(), this.v(), fArray, this.n, this.o, this.a(), this.d(), this.c(), this.e(), this.w, this.x, this.y, this.x(), this.V(), this.f(), this.M(), this.N(), this.G(), this.af(), this.U(), this.H(), this.I(), this.J());
        eFy2.c = this.c;
        return eFy2;
    }

    @Override
    public float V() {
        return this.Q;
    }

    @Override
    public int W() {
        return this.K;
    }

    @Override
    public void b(int n) {
        this.K = n;
    }

    @Override
    public void a(SB sB) {
        this.c = sB;
    }

    @Override
    public void a(sc_0 sc_02) {
        this.N = sc_02;
    }

    @Override
    public sc_0 A() {
        return this.N;
    }

    @Override
    public void a(SA sA) {
        this.O = sA;
    }

    @Override
    public SA B() {
        return this.O;
    }

    @Override
    public boolean d() {
        return this.N == sc_0.c;
    }

    @Override
    public void a(boolean bl) {
        super.d_(bl);
    }

    @Override
    public apc_2 Q() {
        return this.y;
    }

    @Override
    public int O() {
        return this.w;
    }

    @Override
    public int P() {
        return this.x;
    }

    public float ag() {
        return this.o;
    }

    @Override
    public float R() {
        return this.n;
    }

    @Override
    public void b(boolean bl) {
        this.L = bl;
    }

    @Override
    public boolean Y() {
        return this.L;
    }

    @Override
    public boolean Z() {
        return this.M;
    }

    @Override
    public void c(boolean bl) {
        this.M = bl;
    }

    @Override
    public boolean C() {
        return this.R;
    }

    public void d(boolean bl) {
        this.R = bl;
    }

    @Override
    public void a(rg_0 rg_02) {
        if (this.B == null) {
            this.B = new ArrayList<rg_0>();
        }
        this.B.add(rg_02);
        this.k(rg_02);
    }

    @Override
    public void b(rg_0 rg_02) {
        if (this.C == null) {
            this.C = new ArrayList<rg_0>();
        }
        this.C.add(rg_02);
        this.k(rg_02);
    }

    @Override
    public void c(rg_0 rg_02) {
        if (this.D == null) {
            this.D = new ArrayList<rg_0>();
        }
        this.D.add(rg_02);
        this.k(rg_02);
    }

    @Override
    public void d(rg_0 rg_02) {
        if (this.E == null) {
            this.E = new ArrayList<rg_0>();
        }
        this.E.add(rg_02);
        this.k(rg_02);
    }

    @Override
    public void e(rg_0 rg_02) {
        if (this.F == null) {
            this.F = new ArrayList<rg_0>();
        }
        this.F.add(rg_02);
        this.k(rg_02);
    }

    private void k(rg_0 rg_02) {
        if (this.G == null) {
            this.G = new ArrayList<rg_0>();
        }
        if (!this.G.contains(rg_02)) {
            this.G.add(rg_02);
        }
    }

    @Override
    public Iterator<rg_0> S() {
        return this.B != null ? this.B.iterator() : new abz_2();
    }

    @Override
    public Iterator<rg_0> T() {
        return this.D != null ? this.D.iterator() : new abz_2();
    }

    @Override
    public boolean f(rg_0 rg_02) {
        return this.C != null && this.C.contains(rg_02);
    }

    @Override
    public boolean g(rg_0 rg_02) {
        return this.E != null && this.E.contains(rg_02);
    }

    @Override
    public boolean h(rg_0 rg_02) {
        return this.B != null && this.B.contains(rg_02);
    }

    @Override
    public boolean i(rg_0 rg_02) {
        return this.D != null && this.D.contains(rg_02);
    }

    @Override
    public boolean j(rg_0 rg_02) {
        return this.F != null && this.F.contains(rg_02);
    }

    @Override
    public List<rg_0> X() {
        return this.G;
    }

    @Override
    public aqd_1 U() {
        return this.P;
    }

    public void e(boolean bl) {
        this.v = bl;
    }

    @Override
    public boolean aa() {
        return this.v;
    }

    @Nullable
    public ejh_0 ah() {
        return (ejh_0)efc_0.a().b(this.j());
    }

    @Override
    public boolean ab() {
        return this.z;
    }

    public void f(boolean bl) {
        this.z = bl;
    }

    @Override
    public boolean ac() {
        return this.S;
    }

    public void g(boolean bl) {
        this.S = bl;
    }

    public void a(int ... nArray) {
        for (int k = 0; k < nArray.length; ++k) {
            int n = nArray[k];
            eff_0 eff_02 = eff_0.a(n);
            this.b(eff_02);
        }
    }

    public void b(eff_0 eff_02) {
        if (eff_02 == null) {
            return;
        }
        if (this.T == null) {
            this.T = new HashSet<eff_0>();
        }
        this.T.add(eff_02);
    }

    @Override
    public boolean a(eff_0 eff_02) {
        if (this.T == null) {
            return false;
        }
        return this.T.contains(eff_02);
    }

    @Override
    public Ss a(Sm sm, Su su, So so, xb_0<? extends si_0> xb_02, int n, int n2, short s2, Su su2, Sr sr, boolean bl) {
        if (!this.a(su, so, n, n2, s2)) {
            return null;
        }
        si_0 si_02 = xb_02.b(this.j());
        if (si_02 == null) {
            a.error((Object)("Unknown effect used in data " + this.j()));
            return null;
        }
        sd_0<eFy, Sm> sd_02 = si_02.a(so, null);
        Ss ss = sd_02.a(this, sm, so, su, n, n2, s2, this.af() ? su : su2, sr);
        if (sd_02 instanceof sd_0) {
            sd_02.q();
        }
        if (!bl) {
            ss.f();
            return null;
        }
        return ss;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(Su su, So so, int n, int n2, short s2) {
        void var8_11;
        aej_2 aej_22;
        if (this.U() == null) {
            return true;
        }
        Iterable<Su> iterable = apr_2.a().a(su, so.c(), this.U(), n, n2, s2, this.k());
        for (Su object2 : iterable) {
            if (object2 instanceof ekk_0 && !((ekk_0)object2).ab()) continue;
            return false;
        }
        tg_0 tg_02 = so.e();
        if (tg_02 == null) {
            return true;
        }
        if (su != null) {
            aff_1 aff_12 = su.P_();
            aej_22 = su.F();
        } else {
            aff_1 aff_13 = new aff_1(n, n2, s2);
            aej_22 = aej_2.h;
        }
        Iterable<int[]> iterable2 = this.U().a(n, n2, s2, var8_11.d(), var8_11.e(), var8_11.f(), aej_22);
        for (int[] nArray : iterable2) {
            if (!tg_02.c(nArray[0], nArray[1])) {
                return false;
            }
            if (tg_02.g(nArray[0], nArray[1]) == null) continue;
            return false;
        }
        return true;
    }

    public /* synthetic */ Object clone() {
        return this.ae();
    }

    @Override
    public /* synthetic */ efh_0 K() {
        return this.ae();
    }
}

