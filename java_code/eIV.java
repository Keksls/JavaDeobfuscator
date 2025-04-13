/*
 * Decompiled with CFR 0.152.
 */
abstract class eIV
extends ejh_0 {
    private static final aqr_2 w = new eFw(new eFv("Propri\u00e9t\u00e9", new eFu("Valeur", eFx.b), new eFu("Propri\u00e9t\u00e9", eFx.c)));
    protected int v;

    eIV() {
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(this.v));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            this.v = iO2.r().e();
        }
    }

    @Override
    public aqr_2 c_() {
        return w;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        this.v = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (!(this.f instanceof epq_2)) {
            this.ba();
            return;
        }
        fic_0 fic_02 = fic_0.a(this.v);
        if (fic_02 == null) {
            a.error((Object)("Propri\u00e9t\u00e9 inconnue " + this.v + " m_effectId = " + this.o()));
            this.ba();
            return;
        }
        this.a(fic_02);
    }

    @Override
    public void al() {
        if (!(this.f instanceof epq_2)) {
            return;
        }
        fic_0 fic_02 = fic_0.a(this.v);
        if (fic_02 == null) {
            a.error((Object)("Propri\u00e9t\u00e9 inconnue " + this.v + " m_effectId = " + this.o()));
            return;
        }
        this.b(fic_02);
    }

    @Override
    abstract void a(fic_0 var1);

    abstract void b(fic_0 var1);

    @Override
    public boolean Q() {
        return false;
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
        super.z();
    }
}

