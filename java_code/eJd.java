/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

abstract class eJd
extends ejh_0 {
    protected long v;
    protected eqy_1 w;
    private eKq y;
    private static final aqr_2 z = new eFw(new eFv("Params", new eFu[0]), new eFv("Avec Ratio de puissance", new eFu("Ratio", eFx.c)));
    public final fo_1 x = new eje_0(this);

    @Override
    public aqr_2 c_() {
        return z;
    }

    protected eJd() {
        this.M();
    }

    @Override
    public void z() {
        this.y = null;
        this.w = null;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (!(this.e instanceof epq_2)) {
            this.ba();
            return;
        }
        a.info((Object)("Instanciation d'une nouvelle invocation avec un id de " + this.v));
        eKq eKq2 = this.aN();
        epq_2 epq_22 = this.aF();
        epq_2 epq_23 = epq_22.b(this.v, this.aM(), eKq2.a(), this.w, null, eKq2.f(), null);
        if (eKq2.l() && this.e instanceof epq_2) {
            epq_23.q(((epq_2)this.e).en());
        }
        if (this.D()) {
            this.w.a(epq_23.Z());
        }
        this.c(sd_02, bl);
        if (this.D() && epq_22.ck() != null) {
            epq_22.ck().Q(epq_23);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        this.v = this.h.f().a((byte)1);
        epq_2 epq_22 = this.aG();
        eKq eKq2 = this.aN();
        eKp eKp2 = eKq2.i();
        fiz<fio_0> fiz2 = eKp2.a(epq_22, eKq2, this.aZ());
        this.w = eKq2.h().b(epq_22.Z_().s(), epq_22.dp() + " clone", epq_22.c(eps_0.b), epq_22.dr(), epq_22, this.aE(), fiz2);
    }

    @Override
    protected void a(iQ iQ2) {
        super.a(iQ2);
        iQ2.a(is_0.m().b(this.v).n());
    }

    @Override
    protected void b(iO iO2) {
        super.b(iO2);
        if (iO2.A()) {
            is_0 is_02 = iO2.B();
            this.v = is_02.i();
            this.f = null;
        }
    }

    @Override
    public fo_1 ax() {
        return this.x;
    }

    protected void aD() {
        epq_2 epq_22 = (epq_2)this.h();
        this.w = epq_22.aZ() == null ? this.aN().h().b() : this.aN().h().b((short)100, epq_22.aZ().a(), epq_22.aZ().e(), false, false, false);
    }

    protected final int aE() {
        short s2 = this.aZ();
        if (this.c != null && ((efh_0)this.c).F() > 0) {
            return ((efh_0)this.c).a(0, s2, eFb.a);
        }
        return 100;
    }

    protected final epq_2 aF() {
        if (this.e instanceof epq_2) {
            return (epq_2)this.e;
        }
        return null;
    }

    protected epq_2 aG() {
        Su su;
        Su su2 = su = this.aN().e() ? this.e : this.f;
        if (su instanceof epq_2) {
            return (epq_2)su;
        }
        return null;
    }

    protected aff_1 aM() {
        return this.g;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public boolean R() {
        return false;
    }

    @NotNull
    protected eKq aN() {
        if (this.y != null) {
            return this.y;
        }
        this.y = this.aP();
        return this.y;
    }

    @NotNull
    protected abstract eKq aP();
}

