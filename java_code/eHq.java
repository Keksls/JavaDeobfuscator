/*
 * Decompiled with CFR 0.152.
 */
public final class eHq
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Se lie avec la cible", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHq() {
        this.M();
    }

    public eHq aD() {
        eHq eHq2 = new eHq();
        return eHq2;
    }

    @Override
    public void M() {
        super.M();
        this.c(2123);
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        boolean bl2;
        boolean bl3 = true;
        boolean bl4 = bl2 = ((eqq_1)((Object)this.f)).Y() == ((eqq_1)((Object)this.e)).Y();
        if (this.f == null || this.e == null) {
            this.j(true);
            return;
        }
        if (!this.a(eff_0.I)) {
            if (this.f.a(eoz_1.l) || this.e.a(eoz_1.l)) {
                bl3 = false;
            } else if (!bl2 && (this.f.a(eoz_1.bd) || this.e.a(eoz_1.bd))) {
                bl3 = false;
            } else if (bl2 && (this.f.a(eoz_1.be) || this.e.a(eoz_1.be))) {
                bl3 = false;
            } else if (!(this.f instanceof epq_2) || !(this.e instanceof epq_2)) {
                bl3 = false;
            }
            if (!bl3) {
                this.j(true);
                return;
            }
        }
        epq_2 epq_22 = (epq_2)this.e;
        epq_2 epq_23 = (epq_2)this.f;
        epq_22.hc();
        epq_23.hc();
        epq_22.a(epq_23);
        epq_23.a(epq_22);
    }

    @Override
    public void al() {
        if (this.f == null || this.e == null) {
            return;
        }
        if (!(this.f instanceof epq_2) || !(this.e instanceof epq_2)) {
            return;
        }
        ((epq_2)this.e).hc();
        ((epq_2)this.f).hc();
        if (this.D()) {
            if (this.A() == this.e.x_()) {
                this.f.x_().a((Sm)this.k(), true);
            } else {
                this.e.x_().a((Sm)this.k(), true);
            }
        }
        super.al();
    }

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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

