/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCf
 */
public class bcf_1
extends bFZ
implements abb_0 {
    public static final short q = 1;
    public static final short r = 2;
    protected static final Logger s = Logger.getLogger(bcf_1.class);
    public static final short t = 0;
    public static final short u = 1;
    public static final short v = 2;
    bsx_2 J;
    boolean K;
    boolean L;
    private final fo_1 M = new bcg_2(this);

    public void a(boolean bl) {
        this.K = bl;
    }

    public void h(boolean bl) {
        this.L = bl;
    }

    public boolean u() {
        return this.L;
    }

    protected bcf_1() {
    }

    public bsx_2 Z() {
        return this.J;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        return false;
    }

    void ap() {
        aej_2 aej_22;
        int n = this.e.d();
        int n2 = this.e.e();
        short s2 = this.e.f();
        aej_2 aej_23 = aej_2.b;
        aoc_0 aoc_02 = (aoc_0)aew_0.a().a(n, n2);
        if (aoc_02 != null && (aej_22 = aoc_02.b(n, n2, s2)) != null && aej_22 != aej_2.k) {
            aej_23 = aej_22;
        }
        this.a(aej_23);
    }

    @Override
    protected fo_1 ad() {
        return this.M;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public Tv ap_() {
        return Tv.l;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.l};
    }

    @Override
    public cSS[] az_() {
        return new cSS[]{cSY.i.a(), cSY.j.a()};
    }

    @Override
    public String al_() {
        return bae.h().a("bag.of", this.J.s());
    }

    @Override
    public boolean an_() {
        if (this.x == 0 && this.g == 1) {
            this.x = 0;
            return true;
        }
        if (this.g == 2) {
            this.x = 1;
            return true;
        }
        return false;
    }

    void aq() {
        blx_1 blx_12 = bmf_2.a().c(this.J.q());
        if (blx_12 != null) {
            biI biI2 = blx_12.bv();
            ((afv)biI2).a(aej_2.b);
            biI2.a(this);
        }
    }

    private void ar() {
        if (this.J != null) {
            long l = this.J.q();
            blx_1 blx_12 = bmf_2.a().c(l);
            if (blx_12 != null) {
                biI biI2 = blx_12.bv();
                biI2.s(false);
                biI2.b(this);
            }
        }
    }

    @Override
    public void animationEnded(abu abu2) {
        this.ar();
    }

    @Override
    public void aC_() {
        this.g = 1;
        this.aI_();
        blx_1 blx_12 = bmf_2.a().c(this.J.q());
        if (blx_12 != null) {
            biI biI2 = blx_12.bv();
            ((afv)biI2).a(aej_2.b);
            biI2.e("AnimStatique");
        }
    }

    @Override
    public boolean P() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return false;
        }
        bvx_2 bvx_22 = bmr_12.cP();
        aff_1 aff_12 = this.P_();
        return super.P() && (bvx_22 == null || !bvx_22.g().c(aff_12.d(), aff_12.e()));
    }

    public boolean ao() {
        return this.K;
    }

    @Override
    public void onCheckIn() {
        this.ar();
        this.J = null;
        super.onCheckIn();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.B = true;
        this.x = 0;
        this.K = false;
        this.g = 0;
        this.y = true;
        this.z = true;
        this.E = true;
        assert (this.J == null);
    }

    static /* synthetic */ long a(bcf_1 bcf_12, long l) {
        bcf_12.f = l;
        return bcf_12.f;
    }

    static /* synthetic */ aff_1 a(bcf_1 bcf_12) {
        return bcf_12.e;
    }

    static /* synthetic */ short b(bcf_1 bcf_12) {
        return bcf_12.g;
    }

    static /* synthetic */ short c(bcf_1 bcf_12) {
        return bcf_12.g;
    }

    static /* synthetic */ short d(bcf_1 bcf_12) {
        return bcf_12.g;
    }

    static /* synthetic */ void a(bcf_1 bcf_12, abm_1 abm_12) {
        bcf_12.a(abm_12);
    }
}

