/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from blv
 */
public class blv_2
extends blu_2 {
    protected static final Logger ac = Logger.getLogger(blv_2.class);
    private static final long a = 131072L;
    public static final String ad = "remainingTime";
    public static final String ae = "rewards";
    public static final String af = "failures";
    public static final String ag = "goal";
    public static final String ah = "isFinished";
    public static final String ai = "isLaunched";
    public static final String aj = "isActivated";
    public static final String ak = "isFailed";
    public static final String al = "selectedReward";
    public static final String am = "isProposed";
    public static final String an = "needActivation";
    public static final String ao = "compass";
    public static final String ap = "stateText";
    public static final String aq = "coloredTitle";
    public static final String[] ar = new String[]{"remainingTime", "rewards", "goal", "isFinished", "isLaunched", "isActivated", "isFailed", "selectedReward", "isProposed", "needActivation", "stateText", "coloredTitle"};
    public static final String[] as = new String[ar.length + bnh_1.ct.length];
    protected bls_2 at;
    private String b;
    private byte d;

    public blv_2(bls_2 bls_22) {
        super(bls_22.b());
        this.at = bls_22;
    }

    public blv_2(blv_2 blv_22) {
        super(blv_22.w());
        this.at = blv_22.D();
    }

    public bls_2 D() {
        return this.at;
    }

    public String E() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
    }

    @Override
    public String[] d() {
        return as;
    }

    @Override
    public Object b(String string) {
        if (string.equals("isModel")) {
            return false;
        }
        if (string.equals(ag)) {
            ArrayList arrayList = new ArrayList();
            ArrayList<bla_2> arrayList2 = this.F.r();
            int n = arrayList2.size();
            for (int k = 0; k < n; ++k) {
            }
            return arrayList;
        }
        if (string.equals(ae)) {
            return this.at.k().length > 0 ? this.at.k() : null;
        }
        if (string.equals(af)) {
            return this.at.l() != null && this.at.l().length > 0 ? this.at.l() : null;
        }
        if (string.equals(ah)) {
            return this.at.i();
        }
        if (string.equals(ai)) {
            return this.at.h();
        }
        if (string.equals(aj)) {
            return this.at.s();
        }
        if (string.equals(al)) {
            return this.at.j();
        }
        if (string.equals(am)) {
            return this.at.g();
        }
        if (string.equals(ad)) {
            short s2 = this.at.o();
            return s2 > 0 ? blv_2.a(s2) : null;
        }
        if (string.equals(an)) {
            return !this.at.g() && !this.F.q() && !this.at.s();
        }
        if (string.equals(ak)) {
            return !this.at.i() && this.at.u();
        }
        if (string.equals(ap)) {
            return this.R();
        }
        if (string.equals(aq)) {
            String string2 = this.F.c();
            if (string2 != null && string2.length() == 0) {
                return null;
            }
            if (this.N()) {
                return "<text color=\"7ad1d6\">" + string2 + "</text>";
            }
            if (this.L()) {
                return string2;
            }
            return "<text color=\"7ad1d6\">" + string2 + "</text>";
        }
        return super.b(string);
    }

    public static String a(short s2) {
        int n = s2 / 60;
        int n2 = s2 - 60 * n;
        return String.format("%d:%s", n, n2 > 9 ? Integer.valueOf(n2) : "0" + n2);
    }

    public short F() {
        return this.at.v();
    }

    public void a(wu_0 wu_02) {
        this.at.a(wu_02);
    }

    public void a(blf_2 blf_22) {
        this.at.a(blf_22);
    }

    public blf_2 G() {
        return this.at.j();
    }

    public boolean H() {
        return this.at.t();
    }

    @Override
    public blr_2 A() {
        return this.at.d();
    }

    public boolean I() {
        return this.at.i();
    }

    public void f(boolean bl) {
        this.at.c(bl);
        fis_1.a().a((ajf_1)this, ah);
    }

    public boolean J() {
        return this.at.u();
    }

    public void g(boolean bl) {
        this.at.f(bl);
    }

    public boolean K() {
        return this.at.s();
    }

    public void h(boolean bl) {
        this.at.d(bl);
    }

    public boolean L() {
        return this.at.h();
    }

    public void i(boolean bl) {
        this.at.b(bl);
    }

    public boolean M() {
        return this.at.n();
    }

    public boolean N() {
        return this.at.g();
    }

    public void j(boolean bl) {
        this.at.a(bl);
    }

    public boolean O() {
        return this.at.r();
    }

    public int P() {
        return this.at.c();
    }

    public String Q() {
        return this.at.m();
    }

    public String R() {
        if (this.N()) {
            return "<text color=\"7ad1d6\">" + bae.h().a("challenge.state.proposal", new Object[0]) + "</text>";
        }
        if (this.K()) {
            if (this.L()) {
                return "<text color=\"7ad1d6\">" + bae.h().a("challenge.state.activatedAndLaunched", new Object[0]) + "</text>";
            }
            return "<text color=\"BB0606\">" + bae.h().a("challenge.state.activatedNotLaunched", new Object[0]) + "</text>";
        }
        if (this.I()) {
            return "<text color=\"14C800\">" + bae.h().a("challenge.state.complete", new Object[0]) + "</text>";
        }
        if (this.J()) {
            return "<text color=\"BB0606\">" + bae.h().a("challenge.state.failed", new Object[0]) + "</text>";
        }
        if (this.L()) {
            return "<text color=\"BB0606\">" + bae.h().a("challenge.state.launchedWaitStart", new Object[0]) + "</text>";
        }
        return "<text color=\"BB0606\">" + bae.h().a("challenge.state.activatedNotLaunched", new Object[0]) + "</text>";
    }

    public void k() {
        fis_1.a().a((ajf_1)this, ar);
        fis_1.a().a((ajf_1)this, aa);
    }

    public void j() {
        if (fpm_0.b().q(this.b)) {
            fpm_0.b().o(this.b);
        }
    }

    public void g() {
        if (fpm_0.b().q(this.b)) {
            fis_1.a().a((ajf_1)this, ad);
        }
    }

    public void S() {
        this.k();
    }

    public boolean f() {
        return false;
    }

    public String toString() {
        return this.Q();
    }

    public void a(byte by) {
        this.d = by;
    }

    public byte T() {
        return this.d;
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    static {
        System.arraycopy(ar, 0, as, 0, ar.length);
        System.arraycopy(blu_2.aa, 0, as, ar.length, blu_2.aa.length);
    }
}

