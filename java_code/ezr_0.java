/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eZr
 */
public abstract class ezr_0<T extends exq_1<T>>
implements ewv_2 {
    private int c;
    private short d;
    private int e;
    private int f;
    private int g;
    private final abc_2<efh_0> h;
    private short i;
    private final EnumMap<exz_1, apc_2> j = new EnumMap(exz_1.class);
    private exq_1<T> k;
    protected short a;
    private boolean l;
    private boolean m;
    private byte n;
    private byte o;
    private byte p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private exw_1 w;
    private eyc_1 x;
    private eyh_1 y = eyh_1.a;
    private float z;
    private float A;
    private final EnumSet<ext_1> B = EnumSet.noneOf(ext_1.class);
    private boolean C;
    protected eyw_1 b;
    private ezf_0 D;
    private eZu E;
    private byte F;
    private byte G;
    private exy_1 H;

    protected ezr_0() {
        this.h = new abc_2();
    }

    void b(int n) {
        this.c = n;
    }

    void a(short s2) {
        this.d = s2;
    }

    void c(int n) {
        this.e = n;
    }

    void d(int n) {
        this.f = n;
    }

    void e(int n) {
        this.g = n;
    }

    void b(short s2) {
        this.i = s2;
    }

    void a(exq_1 exq_12) {
        this.b(exq_12);
        this.k = exq_12;
    }

    void a(Map<exz_1, apc_2> map) {
        this.j.putAll(map);
    }

    void c(short s2) {
        this.a = (short)Math.max(1, s2);
    }

    void a(byte by) {
        this.n = by;
    }

    void b(byte by) {
        this.o = by;
    }

    void c(byte by) {
        this.p = by;
    }

    void f(int n) {
        this.q = n;
    }

    void g(int n) {
        this.r = n;
    }

    void a(boolean bl) {
        this.s = bl;
    }

    void b(boolean bl) {
        this.t = bl;
    }

    void c(boolean bl) {
        this.u = bl;
    }

    void d(boolean bl) {
        this.v = bl;
    }

    void a(exw_1 exw_12) {
        this.w = exw_12;
    }

    void a(eyh_1 eyh_12) {
        this.y = eyh_12;
    }

    void a(eyc_1 eyc_12) {
        this.x = eyc_12;
    }

    void a(ezf_0 ezf_02) {
        this.D = ezf_02;
    }

    void a(eZu eZu2) {
        this.E = eZu2;
    }

    void d(byte by) {
        this.F = by;
    }

    void e(byte by) {
        this.G = by;
    }

    public void a(float f2) {
        this.z = f2;
    }

    public void b(float f2) {
        this.A = f2;
    }

    public void a(exy_1 exy_12) {
        this.H = exy_12;
    }

    public final void b(exq_1<T> exq_12) {
        if (exq_12 == null) {
            throw new IllegalArgumentException("m_itemType ne peut \u00eatre null pour l'objet " + this.c);
        }
    }

    public abc_2<efh_0> q() {
        return this.h;
    }

    public Iterator<Map.Entry<exz_1, apc_2>> r() {
        return this.j.entrySet().iterator();
    }

    public void a(ext_1 ext_12) {
        this.B.add(ext_12);
    }

    public boolean b(ext_1 ext_12) {
        return this.B.contains(ext_12);
    }

    public void a(efh_0 efh_02) {
        this.h.a(efh_02);
        if (efh_02.M()) {
            this.l = true;
        }
        if (efh_02.N()) {
            this.m = true;
        }
        if (efh_02.a(1L)) {
            this.C = true;
        }
    }

    public boolean s() {
        return this.C;
    }

    public byte t() {
        return this.n;
    }

    public apc_2 a(exz_1 exz_12) {
        return this.j.get(exz_12);
    }

    public boolean a(exz_1 exz_12, epq_2 epq_22, eco_0 eco_02) {
        apc_2 apc_22 = this.a(exz_12);
        return apc_22 == null || apc_22.b(epq_22, epq_22, eco_02, epq_22.Q_());
    }

    public String g() {
        throw new UnsupportedOperationException("M\u00e9thode non cod\u00e9e dans le refactor");
    }

    @Override
    public String e() {
        throw new UnsupportedOperationException("M\u00e9thode non cod\u00e9e dans le refactor");
    }

    public Iterator<efh_0> u() {
        return this.h.iterator();
    }

    public byte v() {
        return this.p;
    }

    public byte w() {
        return this.o;
    }

    public short x() {
        return this.d;
    }

    public boolean y() {
        return this.s;
    }

    public boolean z() {
        return this.u;
    }

    public boolean A() {
        return this.t;
    }

    public boolean a(exh_2 exh_22) {
        return this.k.a(exh_22);
    }

    public boolean B() {
        Object[] objectArray = this.k.j();
        if (objectArray == null) {
            return false;
        }
        Object[] objectArray2 = this.k.h();
        return ArrayUtils.contains((Object[])objectArray2, (Object)exh_2.p) && ArrayUtils.contains((Object[])objectArray, (Object)exh_2.q);
    }

    public int C() {
        return this.e;
    }

    public int D() {
        return this.f;
    }

    public int E() {
        return this.g;
    }

    @Override
    public int n() {
        return this.c;
    }

    public exq_1<T> F() {
        return this.k;
    }

    public short G() {
        return this.i;
    }

    public int H() {
        return this.r;
    }

    public int I() {
        return this.q;
    }

    public boolean J() {
        if (enp_2.a.h(ens_2.aH).contains(this.c)) {
            return false;
        }
        return this.l;
    }

    public boolean K() {
        if (enp_2.a.h(ens_2.aH).contains(this.c)) {
            return false;
        }
        return this.m;
    }

    public boolean L() {
        return this.v;
    }

    @Override
    public short o() {
        return this.a;
    }

    public void e(boolean bl) {
        this.m = bl;
    }

    public void a(eyw_1 eyw_12) {
        this.b = eyw_12;
    }

    @Override
    @Nullable
    public eyw_1 p() {
        return this.b;
    }

    public exw_1 M() {
        return this.w;
    }

    public eyh_1 N() {
        return this.y;
    }

    public eyc_1 O() {
        return this.x;
    }

    public float P() {
        return this.z;
    }

    public float Q() {
        return this.A;
    }

    public exy_1 R() {
        return this.H;
    }

    public boolean S() {
        return this.b(ext_1.a);
    }

    public boolean T() {
        exh_2[] exh_2Array;
        for (exh_2 exh_22 : exh_2Array = this.k.h()) {
            if (exh_22 == exh_2.x) continue;
            return true;
        }
        return false;
    }

    public boolean U() {
        return this.T() || this.k.d() == 218 || this.k.d() == 399;
    }

    public boolean V() {
        return this.b(ext_1.v);
    }

    public boolean i() {
        return false;
    }

    public int W() {
        if (this.b(ext_1.k)) {
            return 2;
        }
        return ezw_0.a(this.c) ? 1 : 0;
    }

    public boolean X() {
        return ezz_0.a.b(this.W());
    }

    public boolean Y() {
        return fgh.a.b(this.c) != null;
    }

    public short Z() {
        ezy_0 ezy_02 = ezz_0.a.a(this.W());
        if (ezy_02 == null) {
            return this.i;
        }
        ezv_0 ezv_02 = fab_0.a(ezy_02);
        return ezv_02.d();
    }

    public ezf_0 aa() {
        return this.D;
    }

    public eZu ab() {
        return this.E;
    }

    public boolean ac() {
        return this.F != 0 && this.G != 0;
    }

    public byte ad() {
        return this.F;
    }

    public byte ae() {
        return this.G;
    }

    public boolean af() {
        Iterator<efh_0> iterator = this.u();
        while (iterator.hasNext()) {
            efh_0 efh_02 = iterator.next();
            if (efh_02.j() != efc_0.ct.a()) continue;
            return true;
        }
        return false;
    }

    public boolean ag() {
        Iterator<efh_0> iterator = this.u();
        while (iterator.hasNext()) {
            int n = iterator.next().j();
            if (n != efc_0.p.a() && n != efc_0.q.a()) continue;
            return true;
        }
        return false;
    }

    public int h(int n) {
        int n2 = 0;
        Iterator<efh_0> iterator = this.u();
        while (iterator.hasNext()) {
            efh_0 efh_02 = iterator.next();
            int n3 = efh_02.j();
            if (n3 != n) continue;
            n2 += (int)efh_02.a(1);
        }
        return n2;
    }

    public abstract boolean l();

    public String toString() {
        return "AbstractReferenceItem{m_id=" + this.c + ", m_setId=" + this.d + ", m_level=" + this.i + "}";
    }
}

