/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGv
 */
public class egv_0
extends eit_0 {
    private static final aqr_2 v = new eFw(new eFv("Normal", new eFu[0]), new eFv("Original controleur", new eFu("Controleur courant du caster (0 = non, 1 = oui)", eFx.c)));
    private boolean w;
    private boolean x;

    @Override
    protected void b(iQ iQ2) {
        super.b(iQ2);
        iQ2.a(iQ2.r().aj().a(this.x));
    }

    @Override
    protected void c(iO iO2) {
        super.c(iO2);
        if (iO2.q()) {
            this.x = iO2.r().t();
        }
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    public egv_0 aD() {
        return new egv_0();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.e == null || this.f == null) {
            this.ba();
            return;
        }
        if (!(this.e instanceof epq_2)) {
            return;
        }
        if (!(this.f instanceof epq_2)) {
            return;
        }
        epq_2 epq_22 = (epq_2)this.e;
        long l = this.x && epq_22.cl() != null ? epq_22.cl().a_() : this.e.a_();
        epq_22.a(this.f.a_(), l);
        if (this.D()) {
            this.aE();
        }
        this.w = ((epq_2)this.f).gk();
        if (((epq_2)this.e).gk()) {
            ((epq_2)this.f).y(true);
        }
    }

    @Override
    public void al() {
        if (this.P && this.f instanceof epq_2) {
            epq_2 epq_22 = (epq_2)this.f;
            epq_22.aA();
            epq_22.y(this.w);
        }
        super.al();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        this.x = ((efh_0)this.c).F() >= 1 ? ((efh_0)this.c).a(0, this.aZ(), eFb.a) == 1 : false;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void z() {
        this.x = false;
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

