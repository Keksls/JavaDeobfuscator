/*
 * Decompiled with CFR 0.152.
 */
public class eHl
extends ehi_0 {
    private static final aqr_2 y = new eFw(new eFv("Gain de PV (Valeur * (1 + (LIFE_STOLEN_BONUS / 100))", new eFu("Valeur", eFx.b)), new eFv("Gain de PV, avec LIFE_STOLEN_BONUS ou non", new eFu("Valeur", eFx.b), new eFu("La valeur est modifi\u00e9e par le LIFE_STOLEN_BONUS (0=non, 1=oui (default))", eFx.c)));
    private boolean z = true;

    public eHl() {
        this.M();
        this.c(20);
    }

    @Override
    public aqr_2 c_() {
        return y;
    }

    public eHl aI() {
        return new eHl();
    }

    @Override
    public void j(sd_0 sd_02) {
        this.aE();
        this.aG();
    }

    @Override
    public void aE() {
        this.aF();
        if (this.c != null) {
            short s2 = this.aZ();
            switch (((efh_0)this.c).F()) {
                case 1: {
                    this.m = ((efh_0)this.c).a(0, s2, eFb.a);
                    break;
                }
                case 2: {
                    this.m = ((efh_0)this.c).a(0, s2, eFb.a);
                    this.z = ((efh_0)this.c).a(1, s2, eFb.a) != 0;
                }
            }
        }
    }

    @Override
    protected void aG() {
        int n;
        float f2;
        efn_0 efn_02 = (efn_0)this.l();
        float f3 = f2 = efn_02 != null && efn_02.j() != 0 ? (float)efn_02.j() : (float)this.m;
        if (this.z && this.e.a(eps_0.L)) {
            n = this.e.c(eps_0.L);
            f2 = f2 * (100.0f + (float)n) / 100.0f;
        }
        if (this.f.a(eps_0.z)) {
            n = this.f.c(eps_0.z);
            f2 -= f2 * (float)n / 1000.0f;
        }
        this.m = n = Math.max(0, Hw.c(f2));
        if (efn_02 != null) {
            efn_02.b(n);
        }
    }

    @Override
    protected void aF() {
        this.z = true;
    }

    @Override
    public /* synthetic */ ehi_0 aD() {
        return this.aI();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aI();
    }
}

