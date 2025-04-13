/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from fin
 */
public abstract class fin_0 {
    protected static final Logger c = Logger.getLogger(fin_0.class);
    private final int a;
    private final short b;
    private final int d;
    private final byte e;
    private final float f;
    private final float g;
    private final byte h;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final byte n;
    private final byte o;
    private final short p;
    private final byte q;
    private final apc_2 r;
    private final apc_2 s;
    private final int t;
    private final apc_2 u;
    private final short v;
    private final fix w;
    private final Map<apc_2, fix> x;
    private final abc_2<efh_0> y = new abc_2();
    private EnumSet<fic_0> z;
    private boolean A;
    private final byte B;
    private final boolean C;
    private final boolean D;
    private final boolean E;
    private final boolean F;
    private final boolean G;
    private final boolean H;
    private final enV I;
    protected final short i;

    protected fin_0(fib_0 fib_02) {
        this.a = fib_02.a();
        this.b = fib_02.b();
        this.d = fib_02.c();
        this.e = fib_02.d();
        this.f = fib_02.e();
        this.g = fib_02.S();
        this.h = fib_02.f();
        this.j = fib_02.i();
        this.l = fib_02.l();
        this.k = fib_02.k();
        this.m = fib_02.m();
        this.t = fib_02.t();
        this.u = fib_02.u();
        this.v = fib_02.v();
        this.w = new fix();
        Map<eps_0, fiq_0> map = fib_02.O();
        if (map != null) {
            for (Map.Entry<eps_0, fiq_0> entry : map.entrySet()) {
                this.w.a(entry.getKey(), entry.getValue().a(), entry.getValue().b());
            }
        }
        this.x = fib_02.N();
        this.w.a(fib_02.w(), fib_02.x());
        this.w.b(fib_02.y(), fib_02.z());
        this.w.a(fib_02.j());
        this.w.b(fib_02.g());
        this.w.c(fib_02.h());
        this.w.d(fib_02.D());
        this.w.a(fib_02.f());
        this.w.b(fib_02.d());
        this.w.c(fib_02.e());
        this.w.d(fib_02.S());
        this.w.e(fib_02.i());
        this.w.f(fib_02.k());
        this.w.g(fib_02.l());
        this.w.h(fib_02.P());
        this.o = fib_02.o();
        this.n = fib_02.n();
        this.p = fib_02.p();
        this.r = fib_02.r();
        this.s = fib_02.s();
        this.q = fib_02.q();
        this.B = fib_02.A();
        this.C = fib_02.B();
        this.D = fib_02.C();
        this.E = fib_02.E();
        this.A = false;
        this.F = fib_02.F();
        this.G = fib_02.M();
        this.H = fib_02.P();
        this.I = fib_02.R();
        this.i = fib_02.J();
        this.a(fib_02.T());
    }

    public int i() {
        return this.a;
    }

    public void a(efh_0 efh_02) {
        this.y.a(efh_02);
        if (efh_02.a(1L)) {
            this.A = true;
        }
    }

    public Iterator<efh_0> a(short s2) {
        return this.b(s2).iterator();
    }

    public ArrayList<efh_0> b(short s2) {
        int n = this.y.a();
        ArrayList<efh_0> arrayList = new ArrayList<efh_0>(n);
        for (int k = 0; k < n; ++k) {
            efh_0 efh_02 = this.y.a(k);
            if (s2 < efh_02.O() || s2 > efh_02.P()) continue;
            arrayList.add(efh_02);
        }
        return arrayList;
    }

    public boolean j() {
        return this.A;
    }

    public int k() {
        return this.b;
    }

    public int l() {
        return this.d;
    }

    public short m() {
        return this.v;
    }

    public byte a(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        return (byte)fix2.i();
    }

    public float b(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        return (byte)fix2.j();
    }

    public float c(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        return (byte)fix2.k();
    }

    public byte d(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        return (byte)fix2.h();
    }

    public boolean a(fio_0 fio_02, Object object, Object object2, Object object3) {
        fix fix2 = this.a(object, object2, fio_02, object3);
        return fix2.d();
    }

    public boolean b(fio_0 fio_02, Object object, Object object2, Object object3) {
        fix fix2 = this.a(object, object2, fio_02, object3);
        return fix2.e();
    }

    public boolean c(fio_0 fio_02, Object object, Object object2, Object object3) {
        fix fix2 = this.a(object, object2, fio_02, object3);
        return fix2.f();
    }

    public boolean d(fio_0 fio_02, Object object, Object object2, Object object3) {
        fix fix2 = this.a(object, object2, fio_02, object3);
        return fix2.g();
    }

    public boolean e(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        return fix2.n();
    }

    public boolean f(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        return fix2.m();
    }

    public boolean n() {
        return this.m;
    }

    public int o() {
        return this.t;
    }

    public apc_2 p() {
        return this.u;
    }

    public byte q() {
        return this.n;
    }

    public byte r() {
        return this.o;
    }

    public fiy g(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        eqw_1 eqw_12 = epq_22.hs();
        fiy fiy2 = new fiy();
        Map<eps_0, fiq_0> map = fix2.a();
        Set<eps_0> set = map.keySet();
        short s2 = fio_02.c();
        for (eps_0 eps_02 : set) {
            fiq_0 fiq_02 = map.get(eps_02);
            int n = fiq_02.a(s2);
            int n2 = 0;
            if (this.z != null) {
                for (fic_0 fic_02 : this.z) {
                    n2 += eqw_12.a(eps_02, fic_02);
                }
            }
            if (eps_02 == eps_0.al) {
                fiy2.b(eps_02.a(), n + n2);
                continue;
            }
            fiy2.a(eps_02.a(), Math.max(0, n + n2));
        }
        return fiy2;
    }

    public int a(int n) {
        if (n < 0 || n > this.b) {
            throw new IllegalArgumentException("Level invalide : " + n + " demand\u00e9, max=" + this.b);
        }
        fix fix2 = this.w;
        return fix2.a(eps_0.c, n);
    }

    public int h(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        if (fio_02 == null) {
            throw new IllegalArgumentException("SpellLevel null");
        }
        short s2 = fio_02.c();
        if (s2 < 0 || s2 > this.b) {
            throw new IllegalArgumentException("Level invalide : " + s2 + " demand\u00e9, max=" + this.b);
        }
        fiy fiy2 = this.g(fio_02, epq_22, object, object2);
        return fiy2.a(eps_0.c);
    }

    public int b(int n) {
        if (n < 0 || n > this.b) {
            throw new IllegalArgumentException("Level invalide : " + n + " demand\u00e9, max=" + this.b);
        }
        return this.w.a(eps_0.e, n);
    }

    public int e(fio_0 fio_02, Object object, Object object2, Object object3) {
        if (fio_02 == null) {
            throw new IllegalArgumentException("SpellLevel null");
        }
        short s2 = fio_02.c();
        if (s2 < 0 || s2 > this.b) {
            throw new IllegalArgumentException("Level invalide : " + fio_02 + " demand\u00e9, max=" + this.b);
        }
        fix fix2 = this.a(object, object2, (Object)fio_02, object3);
        return fix2.a(eps_0.e, s2);
    }

    public int c(int n) {
        if (n < 0 || n > this.b) {
            throw new IllegalArgumentException("Level invalide : " + n + " demand\u00e9, max=" + this.b);
        }
        return this.w.a(eps_0.ax, n);
    }

    public int f(fio_0 fio_02, Object object, Object object2, Object object3) {
        if (fio_02 == null) {
            throw new IllegalArgumentException("SpellLevel null");
        }
        short s2 = fio_02.c();
        if (s2 < 0 || s2 > this.b) {
            throw new IllegalArgumentException("Level invalide : " + fio_02 + " demand\u00e9, max=" + this.b);
        }
        fix fix2 = this.a(object, object2, (Object)fio_02, object3);
        return fix2.a(eps_0.ax, s2);
    }

    public int d(int n) {
        if (n < 0 || n > this.b) {
            throw new IllegalArgumentException("Level invalide : " + n + " demand\u00e9, max=" + this.b);
        }
        return this.w.a(eps_0.d, n);
    }

    public int g(fio_0 fio_02, Object object, Object object2, Object object3) {
        fix fix2 = this.a(object, object2, fio_02, object3);
        short s2 = fio_02.c();
        return fix2.a(eps_0.d, s2);
    }

    public int e(int n) {
        if (n < 0 || n > this.b) {
            throw new IllegalArgumentException("Level invalide : " + n + " demand\u00e9, max=" + this.b);
        }
        return this.w.c().a(n);
    }

    public int i(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        short s2 = fio_02.c();
        int n = fix2.c().a(s2);
        eqw_1 eqw_12 = epq_22.hs();
        int n2 = 0;
        if (this.z != null) {
            for (fic_0 fic_02 : this.z) {
                n2 += eqw_12.b(fic_02);
            }
        }
        return n + n2;
    }

    public int j(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        short s2 = fio_02.c();
        return fix2.b().a(s2);
    }

    public short s() {
        return this.p;
    }

    public apc_2 t() {
        return this.r;
    }

    public apc_2 u() {
        return this.s;
    }

    public byte v() {
        return this.q;
    }

    public boolean w() {
        return this.B != fiv.a.a();
    }

    public boolean x() {
        return this.B == fiv.c.a();
    }

    public boolean y() {
        return this.C;
    }

    public byte z() {
        return exh_2.p.a();
    }

    public boolean A() {
        return this.D;
    }

    public boolean B() {
        return this.E;
    }

    public boolean k(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        return fix2.l();
    }

    public boolean C() {
        return this.F;
    }

    public boolean D() {
        return this.G;
    }

    public boolean l(fio_0 fio_02, epq_2 epq_22, Object object, Object object2) {
        fix fix2 = this.a((Object)epq_22, object, fio_02, object2);
        return fix2.o();
    }

    public enV E() {
        return this.I;
    }

    public short F() {
        return this.i;
    }

    public final void a(int ... nArray) {
        if (nArray == null) {
            return;
        }
        for (int k = 0; k < nArray.length; ++k) {
            int n = nArray[k];
            fic_0 fic_02 = fic_0.a(n);
            this.a(fic_02);
        }
    }

    public final void a(fic_0 fic_02) {
        if (fic_02 == null) {
            return;
        }
        if (this.z == null) {
            this.z = EnumSet.noneOf(fic_0.class);
        }
        this.z.add(fic_02);
    }

    public final boolean b(fic_0 fic_02) {
        if (this.z == null) {
            return false;
        }
        return this.z.contains(fic_02);
    }

    private fix a(Object object, Object object2, fio_0 fio_02, Object object3) {
        if (fio_02 == null) {
            throw new IllegalArgumentException("SpellLevel null");
        }
        short s2 = fio_02.c();
        if (s2 < 0 || s2 > this.b) {
            throw new IllegalArgumentException("Level invalide : " + s2 + " demand\u00e9, max=" + this.b);
        }
        return this.a(object, object2, (Object)fio_02, object3);
    }

    private fix a(Object object, Object object2, Object object3, Object object4) {
        fix fix2 = this.w;
        if (this.x != null && !this.x.isEmpty()) {
            Set<apc_2> set = this.x.keySet();
            for (apc_2 apc_22 : set) {
                if (!apc_22.b(object, object2, object3, object4)) continue;
                fix2 = this.x.get(apc_22);
            }
        }
        return fix2;
    }
}

