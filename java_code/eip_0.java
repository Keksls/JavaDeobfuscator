/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIP
 */
public class eip_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Attaque avec un sort sur cible", new eFu("spellId", eFx.a)), new eFv("Attaque avec un sort sur cellule", new eFu("spellId", eFx.a), new eFu("Sur cellule (1 : oui, 0 : sur cible (default))", eFx.c)), new eFv("Consomme le co\u00fbt du sort", new eFu("spellId", eFx.a), new eFu("Sur cellule (1 : oui, 0 : sur cible (default))", eFx.c), new eFu("Consomme le co\u00fbt (1 : oui (default), 0 : non)", eFx.c)));
    private boolean w = true;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eip_0 aD() {
        eip_0 eip_02 = new eip_0();
        return eip_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        int n = ((efh_0)this.c).a(0, (short)1, eFb.a);
        if (!(this.e instanceof epq_2)) {
            this.j(true);
            return;
        }
        if (this.f != null) {
            Su su = this.i();
            ((epq_2)this.e).a(n, new aff_1(su.G(), su.H(), su.I()), this.w);
        } else {
            ((epq_2)this.e).a(n, new aff_1(this.j()), this.w);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        this.w = true;
        if (this.c != null && ((efh_0)this.c).F() >= 3) {
            this.w = ((efh_0)this.c).a(2, this.aZ(), eFb.a) == 1;
        }
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        if (this.c != null && ((efh_0)this.c).F() >= 2) {
            return ((efh_0)this.c).a(1) != 1.0f;
        }
        return true;
    }

    @Override
    public boolean S() {
        if (this.c != null && ((efh_0)this.c).F() >= 2) {
            return ((efh_0)this.c).a(1) == 1.0f;
        }
        return false;
    }

    @Override
    public void z() {
        super.z();
        this.w = true;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

