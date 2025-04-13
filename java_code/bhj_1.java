/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bhJ
 */
public final class bhj_1
implements rm_0 {
    private final int a;
    private final bhq_1 b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final String f;
    private final int g;
    private final long h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final int n;
    private final int o;
    private final ArrayList<bhx_2> p = new ArrayList();
    private final ArrayList<bib_2> q = new ArrayList();
    private boolean r;
    private boolean s;
    private long t;
    private long u;
    private final int v;
    private final int w;
    private final byte x;
    private final int y;
    private final apc_2 z;
    private final apc_2 A;
    private wu_0 B;
    private wx_0 C;

    bhj_1(bhj_1 bhj_12) {
        this.a = bhj_12.a;
        this.r = bhj_12.r;
        this.b = bhj_12.b;
        this.c = bhj_12.c;
        this.d = bhj_12.d;
        this.e = bhj_12.e;
        this.f = bhj_12.f;
        this.z = bhj_12.z;
        this.g = bhj_12.g;
        this.h = bhj_12.h;
        this.i = bhj_12.i;
        this.j = bhj_12.j;
        this.k = bhj_12.k;
        this.v = bhj_12.v;
        this.w = bhj_12.w;
        this.l = bhj_12.l;
        this.o = bhj_12.o;
        this.B = bhj_12.B;
        this.C = bhj_12.C;
        this.m = bhj_12.m;
        this.n = bhj_12.n;
        this.x = bhj_12.x;
        this.A = bhj_12.A;
        this.y = bhj_12.y;
    }

    bhj_1(int n, bhq_1 bhq_12, boolean bl, boolean bl2, String string, String string2, apc_2 apc_22, int n2, long l, boolean bl3, boolean bl4, boolean bl5, int n3, int n4, boolean bl6, int n5, wu_0 wu_02, wx_0 wx_02, boolean bl7, int n6, byte by, apc_2 apc_23, int n7) {
        this.a = n;
        this.b = bhq_12;
        this.c = bl;
        this.d = bl2;
        this.x = by;
        this.A = apc_23;
        this.e = string != null ? string.intern() : null;
        this.f = string2 != null ? string2.intern() : null;
        this.z = apc_22;
        this.g = n2;
        this.h = l;
        this.i = bl3;
        this.j = bl4;
        this.k = bl5;
        this.v = n3;
        this.w = n4;
        this.l = bl6;
        this.o = n5;
        this.B = wu_02;
        this.C = wx_02;
        this.m = bl7;
        this.n = n6;
        this.y = n7;
    }

    void a(bhx_2 bhx_22) {
        if (!this.p.contains(bhx_22)) {
            this.p.add(bhx_22);
        }
    }

    void a(bib_2 bib_22) {
        if (!this.q.contains(bib_22)) {
            this.q.add(bib_22);
        }
    }

    public boolean n() {
        return this.c;
    }

    public boolean a(rp_0 rp_02) {
        return this.c && (this.z == null || this.z.b(rp_02, null, null, rp_02.O_()));
    }

    public boolean b(rp_0 rp_02) {
        return this.A == null || this.A.b(rp_02, null, null, rp_02.O_());
    }

    @Override
    public boolean m() {
        return this.r;
    }

    void a(bhr_1 bhr_12) {
        this.r = true;
        if (this.B != null || this.g != 0) {
            wu_0 wu_02 = wn_0.a.a();
            this.u = wu_02.h();
        }
    }

    @Override
    public void a(boolean bl) {
        this.r = bl;
    }

    @Override
    public boolean l() {
        return this.s;
    }

    void b(bhr_1 bhr_12) {
        this.s = true;
        wu_0 wu_02 = wn_0.a.a();
        if (this.h != 0L) {
            this.t = wu_02.h();
        }
    }

    void b(boolean bl) {
        this.s = bl;
    }

    @Override
    public void a(long l) {
        this.t = l;
    }

    @Override
    public int a() {
        return this.a;
    }

    public bhq_1 o() {
        return this.b;
    }

    public String p() {
        return this.e;
    }

    public String q() {
        return this.f;
    }

    public ArrayList<bhx_2> r() {
        return this.p;
    }

    public ArrayList<bib_2> s() {
        return this.q;
    }

    @Override
    public int b() {
        return this.g;
    }

    @Override
    public long c() {
        return this.h;
    }

    public boolean t() {
        return this.d;
    }

    public boolean u() {
        return this.l;
    }

    public boolean v() {
        return this.u() && this.w();
    }

    public boolean w() {
        return this.o().a(81);
    }

    public boolean x() {
        return this.i;
    }

    @Override
    public boolean d() {
        return this.j;
    }

    @Override
    public long j() {
        return this.t;
    }

    public boolean y() {
        return this.k;
    }

    @Override
    public long k() {
        return this.u;
    }

    public void b(long l) {
        this.u = l;
    }

    public int z() {
        return this.v;
    }

    public int A() {
        return this.w;
    }

    public int B() {
        return this.o;
    }

    public void C() {
        this.r = false;
        this.s = false;
        for (int k = 0; k < this.p.size(); ++k) {
            this.p.get(k).i();
        }
        this.t = 0L;
    }

    public void a(wu_0 wu_02) {
        this.B = wu_02;
    }

    public void a(wx_0 wx_02) {
        this.C = wx_02;
    }

    @Override
    public wu_0 e() {
        return this.B;
    }

    @Override
    public wx_0 f() {
        return this.C;
    }

    @Override
    public boolean i() {
        return true;
    }

    public boolean D() {
        return this.m;
    }

    public int E() {
        return this.n;
    }

    @Override
    public byte g() {
        return this.x;
    }

    @Override
    public int h() {
        return this.y;
    }

    public apc_2 F() {
        return this.A;
    }
}

