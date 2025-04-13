/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLo
 */
public abstract class blo_0
implements ajh_1,
afk_0<afe_0> {
    private static final Logger m = Logger.getLogger(blo_0.class);
    public static final String a = "map";
    public static final String b = "mapId";
    public static final String d = "zoomScale";
    public static final String e = "centerX";
    public static final String f = "centerY";
    public static final String g = "centerZ";
    public static final String h = "isMapAvailable";
    public static final String i = "landmarks";
    public static final String[] j = new String[]{"map", "zoomScale", "centerX", "centerY", "centerZ", "isMapAvailable"};
    private static final String[] n = new String[]{"centerX", "centerY", "centerZ"};
    private double o;
    private double p;
    private double q;
    private long r;
    protected fsS k;
    private final blc_1 s = new blc_1();
    protected bLP l;

    public void b() {
        fis_1.a().a("landMark.filters", this.s.j());
    }

    public fsS c() {
        return this.k;
    }

    public void a(fsS fsS2) {
        this.k = fsS2;
        this.s.a(this.k);
        if (this.k != null && this.s()) {
            this.t();
        }
    }

    public fwA e() {
        return this.l;
    }

    public void a(long l) {
        this.r = l;
    }

    public void a(bLP bLP2) {
        if (this.c() != null) {
            this.c().setForceDisplayEntity(false);
        }
        this.l = bLP2;
        fis_1.a().a((ajf_1)this, a, b);
        if (this.l != null) {
            this.l.a(this);
        }
        this.q();
    }

    public void a(afe_0 afe_02, int n, int n2, short s2) {
        this.s.a(afe_02.a(), 0, (float)n, (float)n2, s2, azu_0.j().k().T_());
    }

    public void f() {
        abY abY2 = ans_0.D().c().b();
        this.a(abY2.e_(), abY2.f_(), abY2.A());
    }

    public abstract float g();

    public void a(float f2) {
        this.a();
    }

    public double h() {
        return this.o;
    }

    public double i() {
        return this.p;
    }

    public double j() {
        return this.q;
    }

    public void a(double d2, double d3, double d4) {
        this.o = d2;
        this.p = d3;
        this.q = d4;
        this.D();
    }

    private void a() {
        fis_1.a().a((ajf_1)this, d);
    }

    private void D() {
        fis_1.a().a((ajf_1)this, n);
    }

    @Nullable
    protected String k() {
        return this.l != null ? this.l.b() : null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(h)) {
            return this.r();
        }
        if (string.equals(a)) {
            return this.k();
        }
        if (string.equals(b)) {
            return this.u();
        }
        if (string.equals(d)) {
            return Float.valueOf(this.g());
        }
        if (string.equals(e)) {
            return this.h();
        }
        if (string.equals(f)) {
            return this.i();
        }
        if (string.equals(g)) {
            return this.j();
        }
        if (string.equals(i)) {
            return this.s;
        }
        return null;
    }

    @Override
    public String[] d() {
        return j;
    }

    public abstract fjh_1 l();

    public boolean m() {
        return this.l != null && this.l.f();
    }

    public boolean n() {
        return this.l != null && this.l.l();
    }

    public void o() {
        if (this.l != null && this.l.f()) {
            this.l.b(this);
        }
    }

    public void p() {
        if (this.l != null && this.l.l()) {
            this.l.c(this);
        }
    }

    private void E() {
        this.q();
    }

    protected void q() {
        boolean bl;
        fsS fsS2 = this.c();
        long l = this.u();
        boolean bl2 = bl = l == azu_0.j().k().T_();
        if (fsS2 != null) {
            fsS2.setDisplayPoints(true);
            fsS2.setDisplayCompass(true);
        }
        this.w();
        this.y();
        fis_1.a().a((ajf_1)this, a);
    }

    public boolean r() {
        if (this.s()) {
            return true;
        }
        String string = this.k();
        return string != null && cd_0.b(string);
    }

    public final boolean s() {
        return cci_2.a.g();
    }

    protected final void t() {
        if (this.c() == null) {
            return;
        }
        ccy_2 ccy_22 = cci_2.a.e();
        bLx.a(ccy_22, this.c());
        this.l = null;
        this.s.a();
    }

    public long u() {
        if (this.s()) {
            return cci_2.a.e().o();
        }
        if (this.l instanceof blb_1) {
            return this.l.j();
        }
        if (this.l instanceof bLN) {
            return ((bLN)this.l).g();
        }
        return -1L;
    }

    public boolean v() {
        return azu_0.j().k().T_() == this.u();
    }

    protected void w() {
        fsS fsS2 = this.c();
        if (fsS2 == null) {
            return;
        }
        try {
            fsS2.setMapAnmPath(azs_0.z("worldMapAnmFilePath"));
        }
        catch (gm_0 gm_02) {
            m.error((Object)gm_02.getMessage());
        }
        this.x();
    }

    protected void x() {
        fsS fsS2 = this.c();
        if (fsS2 == null) {
            return;
        }
        fsS2.d();
        if (this.l != null) {
            Collection<fwA> collection = this.l.bb_();
            for (fwA fwA2 : collection) {
                fsS2.a(fwA2);
            }
        }
    }

    protected abstract void y();

    public blc_1 z() {
        return this.s;
    }

    public void a(long l, int n, float f2, float f3, float f4, long l2, String string, Object object, fjh_1 fjh_12, String string2, float[] fArray) {
        this.s.a(l, n, f2, f3, f4, string, object, fjh_12, string2, fArray, l2);
    }

    public void a(int n, long l) {
        this.s.a(n, l);
    }

    public void a(long l, int n, float f2, float f3, float f4, long l2, String string, Object object, fjh_1 fjh_12, float[] fArray) {
        this.s.a(l, n, f2, f3, f4, l2, string, object, fjh_12, fArray);
    }

    public void b(int n, long l) {
        this.s.b(n, l);
    }

    public void a(float f2, float f3, float f4, long l, String string, Object object, fjh_1 fjh_12, float[] fArray) {
        this.s.a(f2, f3, f4, l, string, object, fjh_12, fArray);
    }

    protected fjg_1 A() {
        return this.s.k();
    }

    public void B() {
        this.s.l();
    }

    public void C() {
        this.s.n();
    }

    @Override
    public /* synthetic */ void cellPositionChanged(ahh_0 ahh_02, int n, int n2, short s2) {
        this.a((afe_0)ahh_02, n, n2, s2);
    }
}

