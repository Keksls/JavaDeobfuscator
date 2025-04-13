/*
 * Decompiled with CFR 0.152.
 */
public final class eIr
extends eHV {
    private static final aqr_2 v = new eFw(new eFv("groupe d'effet standard", new eFu("nb maximum d'effect \u00e0 executer", eFx.b)), new eFv("groupe de r\u00e9ussite", new eFu("nb maximum d'effect \u00e0 r\u00e9ussir", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c)), new eFv("groupe d'effet cibl\u00e9", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c)), new eFv("groupe d'effet cibl\u00e9, probabilit\u00e9 relative", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c)), new eFv("Gestion de la tansmission de la cible originale", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles  (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c)), new eFv("Change le caster du groupe d'effet pas sa cible", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c)), new eFv("avec un Ratio sur la valeur de l'effet d\u00e9clencheur", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Ratio de l'effet d\u00e9clencheur (default = 100)", eFx.c)), new eFv("avec le niveau du container de cet effet ajout\u00e9 \u00e0 la valeur", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Ratio de l'effet d\u00e9clencheur (default = 100)", eFx.c), new eFu("Valeur ajout\u00e9e \u00e0 celle de l'effet d\u00e9clencheur (default = 0)", eFx.c)));
    private float C;
    private float D;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eIr() {
        this.M();
    }

    public eIr aD() {
        eIr eIr2 = new eIr();
        eIr2.C = this.C;
        eIr2.D = this.D;
        return eIr2;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        super.j(sd_02);
        this.C = 100.0f;
        this.D = 0.0f;
        if (((efh_0)this.c).F() > 6) {
            this.C = ((efh_0)this.c).a(6, this.aZ());
        }
        if (((efh_0)this.c).F() > 7) {
            this.D = ((efh_0)this.c).a(7, this.aZ());
        }
    }

    @Override
    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = super.a(ejh_02, bl);
        if (ejh_02 == null) {
            a.error((Object)"Unable to execute a RunningEffectGroupValueFunctionTriggeringActionCost without triggering effect");
            return efn_02;
        }
        int n = (int)((float)ejh_02.n() * this.C / 100.0f + this.D);
        efn_02.b(n);
        return efn_02;
    }

    @Override
    public void z() {
        this.C = 100.0f;
        this.D = 0.0f;
        super.z();
    }

    @Override
    public /* synthetic */ eHV aE() {
        return this.aD();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

