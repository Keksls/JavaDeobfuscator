/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from VA
 */
public abstract class va_0
implements Vv {
    protected static final Logger a = Logger.getLogger(va_0.class);
    private static final int k = 16;
    protected int b = -1;
    protected vg_0 c;
    private final We l;
    protected final Wg d = new Wg();
    private final vd_0 m;
    protected short e;
    private int n = 0;
    protected long f;
    private boolean o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    protected final Map<Long, Long> g = new HashMap<Long, Long>();
    protected boolean h;
    protected vy_0 i = vy_0.a;
    protected boolean j;
    private long u;

    protected va_0(int n, vg_0 vg_02, We we, vd_0 vd_02) {
        this.b = n;
        this.c = vg_02;
        this.l = we;
        this.m = vd_02;
        this.q = 30000L;
        this.r = 20000L;
    }

    public boolean g() {
        return this.o;
    }

    public void a(boolean bl) {
        this.o = bl;
    }

    public void a(long l) {
        this.q = l;
    }

    public long h() {
        return this.q;
    }

    public void b(long l) {
        this.r = l;
    }

    public long i() {
        return this.r;
    }

    public long j() {
        return this.s;
    }

    public void c(long l) {
        this.s = l;
    }

    public void d(long l) {
        this.t = l;
    }

    public void e(long l) {
        this.p = l;
    }

    public long k() {
        return this.p;
    }

    public void f(long l) {
        this.f = l;
    }

    public long l() {
        return this.f;
    }

    public long m() {
        return this.f - wc_0.p().getTimeInMillis();
    }

    protected abstract long g(long var1);

    public void a(long l, boolean bl, boolean bl2) {
        long l2;
        long l3 = l2 = bl ? this.r : this.q;
        if (this.g.containsKey(l)) {
            l2 += this.g.get(l).longValue();
            this.g.remove(l);
        }
        if (bl2 && this.e == 1) {
            l2 += this.t;
        }
        long l4 = this.g(l);
        this.f = wc_0.p().getTimeInMillis() + l4 + Math.min(this.s, l2);
    }

    @Override
    public void b() {
        this.h = true;
    }

    @Override
    public void c() {
        this.h = false;
    }

    @Override
    public boolean ai_() {
        return this.h;
    }

    public void a(long l, boolean bl, vw_0 vw_02) {
        if (bl) {
            this.c.a(l, this.e, vw_02);
        } else {
            this.c.a(l, this.e);
        }
        this.u(l);
    }

    public boolean h(long l) {
        if (this.ai_()) {
            if (this.i(l) && this.i != vy_0.a) {
                this.x(l);
            }
            this.v(l);
            this.c.a(l);
        }
        return true;
    }

    private void x(long l) {
        this.j = true;
        this.u = l;
    }

    public boolean n() {
        return this.j;
    }

    private void H() {
        this.j = false;
        this.u = 0L;
    }

    protected TLongArrayList o() {
        return this.c.i();
    }

    public boolean p() {
        return this.c.o() || this.j;
    }

    public boolean i(long l) {
        if (this.j) {
            return this.u == l;
        }
        return this.c.f(l);
    }

    public boolean j(long l) {
        if (this.i != vy_0.b) {
            return false;
        }
        if (this.j) {
            return this.u == l;
        }
        return this.c.f(l);
    }

    public long q() {
        return this.j ? this.u : this.c.b();
    }

    public int r() {
        return this.c.a() + (this.j ? (byte)1 : 0);
    }

    public int k(long l) {
        return this.y(l);
    }

    private int y(long l) {
        return this.c.i().indexOf(l);
    }

    public int l(long l) {
        return this.c.j().indexOf(l);
    }

    public void s() {
        this.c.f();
    }

    public void t() {
        this.c.h();
    }

    public short u() {
        return this.e;
    }

    public void v() {
        if (!this.ai_()) {
            return;
        }
        if (this.e == 0) {
            if (this.i != vy_0.a) {
                return;
            }
            this.i = vy_0.c;
        } else {
            if (!this.I()) {
                return;
            }
            this.a(Wb.a());
        }
        this.w();
    }

    public void w() {
        if (!this.ai_()) {
            return;
        }
        this.e = (short)(this.e + 1);
        this.c.g();
        this.a(Wc.a());
        if (!this.ai_()) {
            return;
        }
        this.d.a(this.e, this);
        if (!this.ai_()) {
            return;
        }
        this.D();
    }

    public int x() {
        return this.n;
    }

    protected boolean m(long l) {
        if (!this.n(l)) {
            return false;
        }
        return this.o(l);
    }

    public boolean n(long l) {
        if (!this.C(l)) {
            return false;
        }
        this.H();
        this.i = vy_0.e;
        this.c.d();
        this.E();
        this.A(l);
        return true;
    }

    public boolean o(long l) {
        this.d.a(l, this.e, this);
        if (!this.ai_()) {
            return false;
        }
        if (this.i != vy_0.e) {
            return true;
        }
        this.i = vy_0.b;
        ++this.n;
        this.z(l);
        return true;
    }

    public boolean p(long l) {
        if (this.i == vy_0.d) {
            return true;
        }
        if (this.j) {
            if (this.u != l) {
                return false;
            }
        } else {
            if (!this.D(l)) {
                return false;
            }
            this.i = vy_0.d;
            this.d.b(l, this.e, this);
            if (!this.j) {
                this.c.m();
            }
        }
        if (!this.ai_()) {
            return false;
        }
        if (this.i == vy_0.e) {
            this.q(l);
            return true;
        }
        this.i = vy_0.c;
        if (this.u == 0L) {
            this.H();
        }
        this.B(l);
        return true;
    }

    public void q(long l) {
        this.i = vy_0.c;
        this.s(l);
    }

    public Wg y() {
        return this.d;
    }

    @Override
    public We aj_() {
        return this.l;
    }

    public VW a(vl_0 vl_02, vx_0 vx_02) {
        if (this.b(vl_02, vx_02)) {
            return VW.a();
        }
        long l = vl_02.a();
        return this.a(vl_02, vx_02, l);
    }

    private VW a(vl_0 vl_02, vx_0 vx_02, long l) {
        boolean bl = this.r(l);
        int n = this.y(l);
        byte by = this.c.a();
        boolean bl2 = n < 0 || n > by;
        return this.d.a(vl_02, vx_02, bl, bl2, (short)Math.max(this.u(), 1));
    }

    public void z() {
        this.d.a();
    }

    private boolean b(vl_0 vl_02, vx_0 vx_02) {
        boolean bl = vx_02.f();
        if (bl) {
            this.a(vl_02);
        }
        return bl;
    }

    protected boolean r(long l) {
        return this.c.f(l) && this.i == vy_0.b;
    }

    public vk_0 A() {
        return new vk_0(this.r(), this.u(), false);
    }

    public short a(VW vW) {
        if (!this.c.b(vW.c())) {
            return -1;
        }
        return this.c.a(vW);
    }

    public int B() {
        return 15 + this.c.n();
    }

    @Override
    public byte[] e() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(this.B());
        this.a(byteBuffer);
        return byteBuffer.array();
    }

    protected void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.e);
        byteBuffer.putInt(this.n);
        byteBuffer.put(this.i.a());
        byteBuffer.putLong(this.f);
        this.c.a(byteBuffer);
    }

    @Override
    public void a(So so, byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.C();
        vz_0 vz_02 = this.a(so);
        this.a(vz_02, byteBuffer);
    }

    public vz_0 a(So so) {
        return new vz_0(so, this.m);
    }

    protected void a(vz_0 vz_02, ByteBuffer byteBuffer) {
        this.e = byteBuffer.getShort();
        this.n = byteBuffer.getInt();
        byte by = byteBuffer.get();
        this.i = vy_0.a(by);
        this.f = byteBuffer.getLong();
        this.c.l();
        this.c.a(vz_02, byteBuffer);
    }

    protected void C() {
        this.c();
        this.c.l();
    }

    public void a(Wd wd) {
        if (wd == null) {
            a.error((Object)"On ne peut pas envoyer un timeEvent null");
            return;
        }
        if (this.l == null) {
            a.error((Object)"Pas de TimeEventHandler sur la timeline");
            return;
        }
        try {
            wd.a(this.l);
        }
        catch (Exception exception) {
            a.error((Object)("[Fight] An error occurred while sending time event " + wd + " to handler " + this.l + " in fight " + this.b), (Throwable)exception);
        }
    }

    protected void s(long l) {
        long l2 = this.f - wc_0.p().getTimeInMillis();
        if (l2 > 0L && l > 0L) {
            this.g.put(l, l2);
        }
    }

    protected abstract void t(long var1);

    protected abstract void D();

    protected abstract void u(long var1);

    protected abstract void v(long var1);

    protected abstract void E();

    private void z(long l) {
        vt_0 vt_02 = new vt_0(l);
        this.a(vt_02);
        if (this.c.f(l)) {
            this.t(l);
        }
    }

    private void A(long l) {
        vv_0 vv_02 = new vv_0(l);
        this.a(vv_02);
    }

    private void B(long l) {
        vr_0 vr_02 = new vr_0(l);
        this.a(vr_02);
        this.s(l);
    }

    private boolean I() {
        if (this.i != vy_0.c) {
            a.error((Object)this.a("Etat de la timeline incorrect : " + this.i + ", attendu: " + vy_0.c + " at " + aho_2.a(5)));
            return false;
        }
        if (this.c.c()) {
            a.error((Object)this.a("Assertion incorrecte sur la timeline (demande de fin de tour alors que joueur suivant = " + (Serializable)(this.c.c() ? Long.valueOf(this.c.e()) : "null") + ")").append(aho_2.a(16)));
            return false;
        }
        return true;
    }

    private boolean C(long l) {
        if (this.i != vy_0.c) {
            a.error((Object)this.a("Etat de la timeline incorrect : " + this.i + ", attendu: " + vy_0.c + " at " + aho_2.a(5)));
            return false;
        }
        if (!this.c.c(l)) {
            a.error((Object)this.a("Assertion incorrecte sur la timeline (joueur suivant = " + (Serializable)(this.c.c() ? Long.valueOf(this.c.e()) : "null") + ", attendu = " + l + ")").append(aho_2.a(16)));
            return false;
        }
        return true;
    }

    private boolean D(long l) {
        if (this.i != vy_0.b) {
            a.error((Object)this.a("Etat de la timeline incorrect : " + this.i + ", attendu: " + vy_0.b));
            return false;
        }
        if (!this.c.d(l)) {
            String string = this.p() ? String.valueOf(this.q()) : "NONE";
            a.error((Object)this.a("Assertion incorrecte sur la timeline (joueur courant = " + string + ", attendu = " + l + ")").append(aho_2.a(16)));
            return false;
        }
        return true;
    }

    @Override
    public int f() {
        return this.b;
    }

    @Override
    public void a(int n) {
        this.b = n;
    }

    protected StringBuilder a(String string) {
        return new StringBuilder().append("[_TL_] fightId=").append(this.b).append(" - ").append(string).append(" - ").append((CharSequence)this.F());
    }

    public StringBuilder F() {
        StringBuilder stringBuilder = new StringBuilder(this.c.toString());
        if (this.j) {
            stringBuilder.append(" R:").append(this.u);
        }
        return stringBuilder;
    }

    public void w(long l) {
    }

    public long G() {
        if (this.c.c()) {
            return this.c.e();
        }
        TLongArrayList tLongArrayList = this.c.j();
        if (!tLongArrayList.isEmpty()) {
            return tLongArrayList.get(0);
        }
        return 0L;
    }
}

