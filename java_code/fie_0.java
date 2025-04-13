/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fiE
 */
public class fie_0
implements efi_0 {
    private static final int a = 981;
    public static final short c = 0;
    public static final short v = 0;
    public static final short w = 0;
    protected short x;
    protected short y;
    protected short z;
    protected int A;
    protected boolean B;
    protected int C;
    protected int D;
    protected boolean E;
    protected boolean F;
    protected boolean G;
    protected boolean H;
    protected boolean I = false;
    protected boolean J = false;
    protected TIntHashSet K;
    protected apc_2 L;
    private final HashSet<Integer> b = new HashSet();
    private boolean d;
    protected boolean M;
    protected byte N;
    protected epg O;
    protected List<rg_0> P = null;
    protected boolean Q = false;
    protected short R;
    protected int S;
    protected abc_2<efh_0> T = new abc_2();
    private boolean e = false;
    protected boolean U = false;
    protected boolean V = false;

    public static int a(short s2, short s3) {
        return (s2 << 16) + (s3 & 0xFFFF);
    }

    public static short b(int n) {
        return (short)(n >> 16);
    }

    public apc_2 l() {
        return this.L;
    }

    public static short c(int n) {
        return (short)(n & 0xFFFF);
    }

    @Override
    public short c() {
        return this.R;
    }

    public fie_0 c(short s2) {
        fie_0 fie_02 = new fie_0();
        this.a(s2, fie_02);
        return fie_02;
    }

    protected void a(short s2, fie_0 fie_02) {
        fie_02.y = this.y;
        fie_02.x = this.x;
        fie_02.z = this.z;
        fie_02.A = this.A;
        fie_02.C = this.C;
        fie_02.B = this.B;
        fie_02.D = this.D;
        fie_02.T = this.T;
        fie_02.b.addAll(this.b);
        fie_02.R = (short)Math.min(s2, this.x);
        fie_02.S = fie_0.a(this.y, s2);
        fie_02.E = this.E;
        fie_02.F = this.F;
        fie_02.G = this.G;
        fie_02.K = this.K;
        fie_02.H = this.H;
        fie_02.I = this.I;
        fie_02.J = this.J;
        fie_02.Q = this.Q;
        fie_02.M = this.M;
        fie_02.e = this.e;
        fie_02.N = this.N;
        fie_02.U = this.U;
        fie_02.V = this.V;
    }

    public int m() {
        return this.d((int)this.R);
    }

    public vx_0 n() {
        return this.d(this.R);
    }

    public vx_0 d(short s2) {
        short s3 = (short)this.d((int)s2);
        return vx_0.a(s3).b(false).a(this.B).a((short)(this.z + 1));
    }

    public int d(int n) {
        return this.z + (int)Math.floor((n < this.x ? n : (int)this.x) * this.A);
    }

    public int o() {
        return this.C + (this.R < this.x ? this.R : this.x) * this.D;
    }

    public short p() {
        return this.y;
    }

    public int q() {
        return this.S;
    }

    public void a(efh_0 efh_02) {
        this.T.a(efh_02);
    }

    @Override
    @NotNull
    public Iterator<efh_0> iterator() {
        return this.e(this.c()).iterator();
    }

    public ArrayList<efh_0> e(short s2) {
        int n = this.T.a();
        ArrayList<efh_0> arrayList = new ArrayList<efh_0>(n);
        for (int k = 0; k < n; ++k) {
            efh_0 efh_02 = this.T.a(k);
            if (s2 < efh_02.O() || s2 > efh_02.P()) continue;
            arrayList.add(efh_02);
        }
        return arrayList;
    }

    public HashSet<Integer> r() {
        return this.b;
    }

    public void e(int n) {
        this.b.add(n);
    }

    @Override
    public int G_() {
        return 1;
    }

    @Override
    public long aS_() {
        return this.S;
    }

    public boolean s() {
        return this.E && !this.d;
    }

    public Iterator<rg_0> t() {
        return this.P != null ? this.P.iterator() : new abz_2();
    }

    public boolean u() {
        return this.P != null && !this.P.isEmpty();
    }

    public boolean v() {
        return this.G;
    }

    @Override
    public short be_() {
        return 0;
    }

    @Override
    public short z_() {
        return 0;
    }

    @Override
    public short A_() {
        return 0;
    }

    public boolean w() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public boolean x() {
        return this.M;
    }

    public TIntHashSet y() {
        return this.K;
    }

    public boolean z() {
        return this.o() < 0 && this.m() < 0;
    }

    public boolean A() {
        return this.H;
    }

    public boolean B() {
        return this.I;
    }

    public boolean C() {
        return this.J;
    }

    public void b(boolean bl) {
        this.J = bl;
    }

    public short D() {
        return this.x;
    }

    public boolean E() {
        return this.Q;
    }

    public String g() {
        return "state-" + this.p();
    }

    public void c(boolean bl) {
        this.e = bl;
    }

    public boolean F() {
        return this.e;
    }

    public boolean G() {
        return this.y == 981;
    }

    public epg H() {
        return this.O;
    }

    public fii_0 I() {
        return fii_0.a(this.N);
    }

    public boolean J() {
        return this.U;
    }

    public boolean K() {
        return this.V;
    }

    public void d(boolean bl) {
        this.V = bl;
    }

    public String toString() {
        return "State{m_stateBaseId=" + this.y + ", m_level=" + this.R + "}";
    }
}

