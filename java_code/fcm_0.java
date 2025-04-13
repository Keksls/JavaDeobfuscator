/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fcM
 */
public abstract class fcm_0
extends fcg_0<fcm>
implements fcm,
fcn {
    protected static final Logger b = Logger.getLogger(fcm_0.class);
    public static final TLongObjectIterator<fcf> c = new TLongObjectHashMap().iterator();
    public static final fcg d = new fcg();
    private final fcn_0 a = new fcn_0();
    protected boolean e = false;
    protected final wt_0 f = wt_0.b();
    private final wt_0 r = wt_0.b();
    protected final ww_0 g = new ww_0(ww_0.g);
    protected final ww_0 h = new ww_0(ww_0.g);
    protected final TLongObjectHashMap<fcf> i = new TLongObjectHashMap();
    protected final fcg j;
    protected final fer_0 k;
    protected final fcs_0 l;
    protected final feo_0 m;
    protected final fcd n;
    protected final fch o;
    private final List<fcm> s = new ArrayList<fcm>();
    @Nullable
    protected fcY p = null;
    private final fcO t = new fcO(this);
    private final fcR u = new fcR(this);
    private final fcU v = new fcU(this);
    private final fcT w = new fcT(this);
    private final fcQ x = new fcQ(this, true);
    private final fcQ y = new fcQ(this, false);
    private final fcV z = new fcV(this);
    private final fcW A = new fcW(this);
    private final fcP B = new fcP(this);
    private final fcS C = new fcS(this);
    protected fcX q = null;

    protected fcm_0(faX faX2) {
        super(faX2);
        this.j = this.b();
        this.l = this.i();
        this.m = new feo_0(this.g());
        this.n = this.h();
        this.k = new fer_0(this.g());
        this.o = new fch(this);
    }

    protected fcd h() {
        return new fcd(this.g());
    }

    protected fcs_0 i() {
        return new fcs_0(this.g());
    }

    protected fcg b() {
        return new fcg();
    }

    @Override
    public void bf_() {
    }

    @Override
    public void a(@NotNull fcm fcm2) {
        this.s.add(fcm2);
    }

    @Override
    public void b(fcm fcm2) {
        this.s.remove(fcm2);
    }

    public abstract long d(long var1);

    public long j() {
        return 3000L;
    }

    public feo_0 k() {
        return this.m;
    }

    public fcd l() {
        return this.n;
    }

    public fer_0 m() {
        return this.k;
    }

    public abstract void a(long var1, String var3);

    public abstract void a(long var1, fcf var3);

    @Override
    public void a(fbl fbl2) {
        throw new UnsupportedOperationException();
    }

    public abstract void b(long var1, long var3);

    public void a(wu_0 wu_02, wx_0 wx_02, boolean bl) {
        throw new UnsupportedOperationException("Commande non impl\u00e9ment\u00e9e sur ce serveur ou ce client");
    }

    public boolean n() {
        throw new UnsupportedOperationException("Operation non authoris\u00e9e sur ce serveur ou ce client");
    }

    public boolean c() {
        throw new UnsupportedOperationException("Operation non authoris\u00e9e sur ce serveur ou ce client");
    }

    public boolean e(long l) {
        throw new UnsupportedOperationException("Operation non authoris\u00e9e sur ce serveur ou ce client");
    }

    public boolean f(long l) {
        throw new UnsupportedOperationException("Operation non authoris\u00e9e sur ce serveur ou ce client");
    }

    @Override
    public void a(fbr fbr2) {
        throw new UnsupportedOperationException();
    }

    public void a(long l, byte by, long l2) {
        throw new UnsupportedOperationException();
    }

    public void a(fcu_0 fcu_02, fcu_0 fcu_03, fcx_0 fcx_02) {
        throw new UnsupportedOperationException();
    }

    public void a(long l, fcu_0 fcu_02) {
        throw new UnsupportedOperationException();
    }

    public wu_0 o() {
        return this.f;
    }

    public wu_0 p() {
        return this.r;
    }

    public wx_0 q() {
        return this.g;
    }

    public ww_0 r() {
        return this.h;
    }

    public void a(wx_0 wx_02, wx_0 wx_03) {
        this.g.a(wx_02);
        this.h.a(wx_03);
    }

    public final boolean s() {
        return this.e;
    }

    public final boolean g(long l) {
        return this.o.b(l);
    }

    public boolean a(@NotNull wu_0 wu_02) {
        if (faX.a(this.g(), faX.i) || this.g().c() == 34) {
            this.f.a(wt_0.c);
            return true;
        }
        if (wu_02.c()) {
            b.info((Object)("[NATION] La date de d\u00e9but de vote pour la nation " + this.g() + " est d\u00e9finie \u00e0 null. Un nouveau vote va commencer d\u00e8s que possible."));
            wu_02 = wc_0.p().a();
        }
        this.f.a(wu_02);
        this.r.a(wu_02);
        this.r.a(this.g);
        return !this.f.c();
    }

    public boolean c(long l, long l2) {
        fcf fcf2 = (fcf)this.i.get(l2);
        if (fcf2 == null) {
            return false;
        }
        faU faU2 = this.g().i(l);
        if (faU2 == null) {
            return false;
        }
        fcf2.a((short)(fcf2.c() + 1));
        faU2.fE().a(wc_0.p().j());
        faU2.fE().a(fep_0.b);
        for (int k = 0; k < this.s.size(); ++k) {
            fcm fcm2 = this.s.get(k);
            fcm2.a(l, l2);
        }
        return true;
    }

    public final void b(long l, fcf fcf2) {
        if (fcf2 == null) {
            b.error((Object)("[NATION] Tentative d'enregistrement d'un candidat null en tant que candidat. CharacterId : " + l + " Nation : " + this.g()), (Throwable)new IllegalArgumentException());
            return;
        }
        this.i.put(l, (Object)fcf2);
        for (int k = 0; k < this.s.size(); ++k) {
            fcm fcm2 = this.s.get(k);
            fcm2.a(l);
        }
    }

    public final boolean h(long l) {
        fcf fcf2 = (fcf)this.i.get(l);
        if (fcf2 == null) {
            b.info((Object)("[NATION] On demande le d\u00e9sistement du candidat " + l + " mais il n'est pas enregistr\u00e9 dans la nation " + this.g()));
            return false;
        }
        fcf2.a(true);
        for (int k = 0; k < this.s.size(); ++k) {
            fcm fcm2 = this.s.get(k);
            fcm2.b(l);
        }
        return true;
    }

    public final boolean i(long l) {
        fcf fcf2 = (fcf)this.i.get(l);
        if (fcf2 == null) {
            b.info((Object)("[NATION] On demande la r\u00e9\u00e9ligibilit\u00e9 du candidat " + l + " mais il n'est pas enregistr\u00e9 dans la nation " + this.g()));
            return false;
        }
        fcf2.a(false);
        for (int k = 0; k < this.s.size(); ++k) {
            fcm fcm2 = this.s.get(k);
            fcm2.c(l);
        }
        return true;
    }

    public boolean j(long l) {
        return this.i.containsKey(l);
    }

    public fcf k(long l) {
        return (fcf)this.i.get(l);
    }

    protected boolean t() {
        return !this.i.isEmpty();
    }

    protected void d() {
        this.i.clear();
    }

    public TLongObjectIterator<fcf> u() {
        return this.i.iterator();
    }

    public int e() {
        return this.i.size();
    }

    public int f() {
        this.a.a = 0;
        this.i.forEachValue((TObjectProcedure)this.a);
        return this.a.a;
    }

    public void a(int n, int n2, ArrayList<fcf> arrayList) {
        int n3 = n + Math.min(n2, this.i.size() - n);
        Object[] objectArray = this.i.values();
        for (int k = n; k < n3; ++k) {
            arrayList.add((fcf)objectArray[k]);
        }
    }

    @Override
    public void a(ArrayList<fcf> arrayList) {
        throw new UnsupportedOperationException();
    }

    public void a(int n, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(faX faX2) {
        this.j.e();
        this.j.a(faX2);
    }

    public fcg v() {
        return this.j;
    }

    public fcs_0 w() {
        return this.l;
    }

    @Override
    public void b(int n) {
    }

    public fbu_0 x() {
        return this.q;
    }

    public fbu_0 y() {
        return this.t;
    }

    public fbu_0 z() {
        return this.u;
    }

    @NotNull
    public fbu_0 A() {
        if (this.p == null) {
            this.p = new fcY(this);
        }
        return this.p;
    }

    public fbu_0 B() {
        return this.v;
    }

    public fbu_0 C() {
        return this.w;
    }

    public fbu_0 D() {
        return this.x;
    }

    public fbu_0 E() {
        return this.y;
    }

    public fbu_0 F() {
        return this.z;
    }

    public fbu_0 G() {
        return this.A;
    }

    public fcP H() {
        return this.B;
    }

    public fbu_0 I() {
        return this.C;
    }

    public void J() {
        this.d();
    }

    @Override
    public /* synthetic */ void a(fcj fcj2) {
        this.b((fcm)fcj2);
    }

    @Override
    public /* synthetic */ void b(@NotNull fcj fcj2) {
        this.a((fcm)fcj2);
    }
}

