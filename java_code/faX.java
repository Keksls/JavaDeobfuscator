/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class faX {
    protected static final Logger a = Logger.getLogger(faX.class);
    public static final boolean b = false;
    public static final int c = 0;
    public static final int d = 30;
    public static final int e = 31;
    public static final int f = 32;
    public static final int g = 33;
    public static final int h = 34;
    public static final faX i = new faX(0, fcZ.a());
    private static fch_0 j;
    @Nullable
    private fcl_0 k;
    @Nullable
    private fcm_0 l;
    @Nullable
    private fce_0 m;
    @Nullable
    private fci_0 n;
    private int o;
    short p;
    int q;
    int r;
    private final faZ s = new faZ(this);
    private final fca t = new fca(this);
    private final fba u = new fba(this);

    public static boolean a(@Nullable faX faX2, @Nullable faX faX3) {
        boolean bl;
        boolean bl2 = faX2 == null;
        boolean bl3 = bl = faX3 == null;
        if (bl2) {
            return bl || faX3.c() == 0;
        }
        if (bl) {
            return faX2.c() == 0;
        }
        return faX2.c() == faX3.c();
    }

    public void a(short s2, int n, int n2) {
        this.p = s2;
        this.q = n;
        this.r = n2;
    }

    public faZ a() {
        return this.s;
    }

    public static void a(fch_0 fch_02) {
        j = fch_02;
        faX.i.k = fch_02.a(i);
        faX.i.l = fch_02.b(i);
        faX.i.n = fch_02.d(i);
        faX.i.m = fch_02.c(i);
    }

    public static faX b() {
        return faX.a(-1);
    }

    public static faX a(int n) {
        if (j == null) {
            throw new UnsupportedOperationException("La factory de handlers de nation (NationHandlersFactory) doit \u00eatre d\u00e9finie");
        }
        return new faX(n, j);
    }

    private faX(int n, fch_0 fch_02) {
        this.k = fch_02.a(this);
        this.l = fch_02.b(this);
        this.m = fch_02.c(this);
        this.n = fch_02.d(this);
        this.o = n;
    }

    public int c() {
        return this.o;
    }

    public void b(int n) {
        this.o = n;
    }

    public void d() {
        if (this.k != null) {
            this.k.bf_();
        }
        if (this.l != null) {
            this.l.bf_();
        }
        if (this.m != null) {
            this.m.bf_();
        }
        if (this.n != null) {
            this.n.bf_();
        }
    }

    public byte[] a(fby_0 fby_02) {
        return this.t.a(fby_02);
    }

    public void a(byte[] byArray, int n) {
        this.t.a(byArray, n);
    }

    public byte[] e() {
        return this.t.a(fby_0.a);
    }

    public byte[] f() {
        return this.t.a(fby_0.q);
    }

    public fbu_0 a(fbz_0 fbz_02) {
        switch (fbz_02) {
            case a: {
                return this.l();
            }
            case b: {
                return this.g();
            }
            case c: {
                return this.h();
            }
            case h: {
                return this.i();
            }
            case q: {
                return this.R();
            }
            case m: {
                return this.j();
            }
            case n: {
                return this.k();
            }
            case o: {
                return this.r();
            }
            case d: {
                return this.s();
            }
            case e: {
                return this.K();
            }
            case f: {
                return this.L();
            }
            case g: {
                return this.Q();
            }
            case i: {
                return this.M();
            }
            case k: {
                return this.O();
            }
            case l: {
                return this.P();
            }
            case j: {
                return this.N();
            }
            case p: {
                return this.a();
            }
        }
        return fbu_0.b;
    }

    fbu_0 g() {
        if (this.l != null) {
            return this.l.x();
        }
        return fbu_0.b;
    }

    fbu_0 h() {
        if (this.l != null) {
            return this.l.y();
        }
        return fbu_0.b;
    }

    fbu_0 i() {
        if (this.l != null) {
            return this.l.z();
        }
        return fbu_0.b;
    }

    fbu_0 j() {
        if (this.m != null) {
            return this.m.d();
        }
        return fbu_0.b;
    }

    fbu_0 k() {
        if (this.l != null) {
            return this.l.A();
        }
        return fbu_0.b;
    }

    fba l() {
        return this.u;
    }

    public String toString() {
        return "{Nation id=" + this.o + "}";
    }

    public void a(short s2, short s3, int n, int n2) {
        if (this.n != null) {
            this.n.a(s2, s3, n, n2);
        }
    }

    public fdk_0 m() {
        if (this.n != null) {
            return this.n.c();
        }
        throw new UnsupportedOperationException();
    }

    public short n() {
        if (this.n != null) {
            return this.n.d();
        }
        throw new UnsupportedOperationException();
    }

    public short o() {
        if (this.n != null) {
            return this.n.e();
        }
        throw new UnsupportedOperationException();
    }

    public int p() {
        if (this.n != null) {
            return this.n.f();
        }
        throw new UnsupportedOperationException();
    }

    public int q() {
        if (this.n != null) {
            return this.n.h();
        }
        throw new UnsupportedOperationException();
    }

    public void a(long l) {
        if (this.n == null) {
            throw new UnsupportedOperationException();
        }
        this.n.a(l);
    }

    public void b(long l) {
        if (this.n == null) {
            throw new UnsupportedOperationException();
        }
        this.n.b(l);
    }

    fbu_0 r() {
        if (this.n != null) {
            return this.n.i();
        }
        return fbu_0.b;
    }

    fbu_0 s() {
        if (this.n != null) {
            return this.n.j();
        }
        return fbu_0.b;
    }

    public void a(fck fck2) {
        if (this.n == null) {
            return;
        }
        this.n.a(fck2);
    }

    public void b(fck fck2) {
        if (this.n == null) {
            return;
        }
        this.n.b(fck2);
    }

    public void a(fcm fcm2) {
        if (this.l == null) {
            return;
        }
        this.l.a(fcm2);
    }

    public void b(fcm fcm2) {
        if (this.l == null) {
            return;
        }
        this.l.b(fcm2);
    }

    public void a(wx_0 wx_02, wx_0 wx_03) {
        if (this.l != null) {
            this.l.a(wx_02, wx_03);
        }
    }

    public void a(wu_0 wu_02, wx_0 wx_02, boolean bl) {
        if (this.l != null) {
            this.l.a(wu_02, wx_02, bl);
        }
    }

    public boolean t() {
        return this.l != null && this.l.n();
    }

    public boolean u() {
        return this.l != null && this.l.c();
    }

    public void a(wu_0 wu_02) {
        if (this.l != null) {
            this.l.a(wu_02);
        }
    }

    public boolean v() {
        return this.l != null && this.l.s();
    }

    public boolean c(long l) {
        return this.l != null && this.l.g(l);
    }

    public wu_0 w() {
        if (this.l != null) {
            return this.l.o();
        }
        return null;
    }

    public wx_0 x() {
        if (this.l != null) {
            return this.l.q();
        }
        return null;
    }

    public wx_0 y() {
        if (this.l != null) {
            return this.l.r();
        }
        return null;
    }

    public boolean d(long l) {
        return this.l != null && this.l.j(l);
    }

    public fcf e(long l) {
        if (this.l != null) {
            return this.l.k(l);
        }
        return null;
    }

    public TLongObjectIterator<fcf> z() {
        if (this.l != null) {
            return this.l.u();
        }
        return fcm_0.c;
    }

    public int A() {
        if (this.l != null) {
            return this.l.e();
        }
        return 0;
    }

    public int B() {
        if (this.l != null) {
            return this.l.f();
        }
        return 0;
    }

    public void a(int n, int n2, ArrayList<fcf> arrayList) {
        if (this.l != null) {
            this.l.a(n, n2, arrayList);
        }
    }

    public void a(ArrayList<fcf> arrayList) {
        if (this.l != null) {
            this.l.a(arrayList);
        }
    }

    public void a(int n, int n2) {
        if (this.l != null) {
            this.l.a(n, n2);
        }
    }

    public void a(fbl fbl2) {
        if (this.l != null) {
            this.l.a(fbl2);
        }
    }

    public void a(long l, String string) {
        if (this.l != null) {
            this.l.a(l, string);
        }
    }

    public void a(long l, fcf fcf2) {
        if (this.l != null) {
            this.l.a(l, fcf2);
        }
    }

    public void a(fcf fcf2) {
        if (this.l != null) {
            this.l.b(fcf2.a(), fcf2);
        }
    }

    public void a(fbr fbr2) {
        if (this.l != null) {
            this.l.a(fbr2);
        }
    }

    public void a(long l, byte by, long l2) {
        if (this.l != null) {
            this.l.a(l, by, l2);
        }
    }

    public void a(fcu_0 fcu_02, fcu_0 fcu_03, fcx_0 fcx_02) {
        if (this.l != null) {
            this.l.a(fcu_02, fcu_03, fcx_02);
        }
    }

    public void a(long l, fcu_0 fcu_02) {
        if (this.l != null) {
            this.l.a(l, fcu_02);
        }
    }

    public void a(faX faX2) {
        if (this.l != null) {
            this.l.a(faX2);
        }
    }

    public fcg C() {
        return this.l != null ? this.l.v() : fcm_0.d;
    }

    public fcs_0 D() {
        return this.l != null ? this.l.w() : null;
    }

    public feo_0 E() {
        return this.l != null ? this.l.k() : null;
    }

    public fcd F() {
        return this.l != null ? this.l.l() : null;
    }

    public fer_0 G() {
        return this.l != null ? this.l.m() : null;
    }

    @Nullable
    public fcm_0 H() {
        return this.l;
    }

    public void f(long l) {
        if (this.l != null) {
            this.l.e(l);
        }
    }

    public void g(long l) {
        if (this.l != null) {
            this.l.f(l);
        }
    }

    public void a(long l, long l2) {
        if (this.l != null) {
            this.l.b(l, l2);
        }
    }

    public long I() {
        if (this.l != null) {
            return this.l.j();
        }
        return Long.MAX_VALUE;
    }

    public void J() {
        if (this.l != null) {
            this.l.J();
        }
    }

    fbu_0 K() {
        return this.l != null ? this.l.B() : fbu_0.b;
    }

    fbu_0 L() {
        return this.l != null ? this.l.C() : fbu_0.b;
    }

    fbu_0 M() {
        return this.l != null ? this.l.D() : fbu_0.b;
    }

    fbu_0 N() {
        return this.l != null ? this.l.E() : fbu_0.b;
    }

    fbu_0 O() {
        return this.l != null ? this.l.F() : fbu_0.b;
    }

    fbu_0 P() {
        return this.l != null ? this.l.G() : fbu_0.b;
    }

    fbu_0 Q() {
        return this.l != null ? this.l.H() : fbu_0.b;
    }

    fbu_0 R() {
        return this.l != null ? this.l.I() : fbu_0.b;
    }

    public int S() {
        return this.k.b();
    }

    public boolean a(faU faU2) {
        return this.k != null && this.k.d(faU2);
    }

    public void a(fcl fcl2) {
        if (this.k == null) {
            return;
        }
        this.k.a(fcl2);
    }

    public void b(fcl fcl2) {
        if (this.k == null) {
            return;
        }
        this.k.b(fcl2);
    }

    public void h(long l) {
        if (this.k != null) {
            this.k.d(l);
        }
    }

    @Nullable
    public faU i(long l) {
        if (this.k == null) {
            return null;
        }
        return this.k.c(l);
    }

    public void b(@NotNull faU faU2) {
        if (this.k != null) {
            this.k.e(faU2);
        }
    }

    public void c(@NotNull faU faU2) {
        if (this.k != null) {
            this.k.a(faU2);
        }
    }

    public void j(long l) {
        if (this.k != null) {
            this.k.b(l);
        }
    }

    public void a(long l, fct_0 fct_02) {
        if (this.k != null) {
            this.k.a(l, fct_02);
        }
    }

    public void b(long l, fct_0 fct_02) {
        if (this.k != null) {
            this.k.b(l, fct_02);
        }
    }

    public boolean d(@NotNull faU faU2) {
        if (this.k != null) {
            return this.k.g(faU2);
        }
        throw new UnsupportedOperationException();
    }

    public void e(@NotNull faU faU2) {
        if (this.k != null) {
            this.k.f(faU2);
        }
    }

    public void a(TObjectProcedure<faU> tObjectProcedure) {
        if (this.k != null) {
            this.k.a(tObjectProcedure);
        }
    }

    public void a(fci fci2) {
        if (this.m == null) {
            return;
        }
        this.m.a(fci2);
    }

    public void b(fci fci2) {
        if (this.m == null) {
            return;
        }
        this.m.b(fci2);
    }

    public void a(int n, int[] nArray) {
        if (this.m == null) {
            return;
        }
        this.m.b(n, nArray);
    }

    public void b(int n, int[] nArray) {
        if (this.m == null) {
            return;
        }
        this.m.c(n, nArray);
    }

    public void c(int n) {
        if (this.m == null) {
            return;
        }
        this.m.a(n);
    }

    public void c(int n, int[] nArray) {
        if (this.m == null) {
            return;
        }
        this.m.d(n, nArray);
    }

    @Nullable
    public abd_2 d(int n) {
        if (this.m == null) {
            return null;
        }
        return this.m.c(n);
    }

    public void e(int n) {
        if (this.l == null) {
            return;
        }
        this.l.b(n);
    }

    public short T() {
        return this.p;
    }

    public int U() {
        return this.q;
    }

    public int V() {
        return this.r;
    }

    public int hashCode() {
        return this.o;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof faX)) {
            return false;
        }
        return ((faX)object).o == this.o;
    }

    static {
        fbc_0.a.a(i);
        j = null;
    }
}

