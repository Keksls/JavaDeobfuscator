/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIw
 */
public class eiw_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Param standard", new eFu[0]));
    private static final boolean w = false;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eiw_0 aD() {
        eiw_0 eiw_02 = new eiw_0();
        return eiw_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.bk() != 14) {
            return;
        }
        if (!(this.e instanceof epq_2) || !(this.f instanceof epq_2)) {
            a.error((Object)"La cible ou le caster n'est pas du bon type");
            this.j(true);
            return;
        }
        epq_2 epq_22 = (epq_2)this.e;
        erp_2 erp_22 = epq_22.dQ();
        if (erp_22 == null) {
            a.error((Object)"On n'a pas de symbiote");
            this.j(true);
            return;
        }
        epq_2 epq_23 = (epq_2)this.f;
        if (epq_23.gY() != 1 || epq_23.C_()) {
            a.error((Object)"La cible que l'on tente de seduire n'est pas seductible");
            this.j(true);
            return;
        }
        eqy_1 eqy_12 = erp_22.c(epq_23.gO());
        if (eqy_12 == null) {
            return;
        }
        a.info((Object)("S\u00e9duction d'une cr\u00e9ature avec " + eqy_12.c() + " PV"));
        if (this.D()) {
            this.m = erp_22.b(eqy_12);
        } else {
            erp_22.a(eqy_12, (byte)this.m);
        }
        if (this.m == -1) {
            a.info((Object)"Erreur lors de l'ajout de la creature au symbiot, annulation de la seduction");
            this.j(true);
            return;
        }
        this.f.c(eoz_1.s);
        this.f.c(eoz_1.m);
        this.f.c(erl_2.r);
        this.f.c(eoz_1.am);
        this.f.c(eoz_1.al);
        this.c(sd_02, bl);
    }

    @Override
    public void j(sd_0 sd_02) {
        if (!(this.f instanceof epq_2) || this.f.a(eoz_1.B) || !this.f.a(eoz_1.N)) {
            this.b((byte)13);
            return;
        }
        this.b((byte)14);
    }

    @Override
    public void al() {
        super.al();
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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

