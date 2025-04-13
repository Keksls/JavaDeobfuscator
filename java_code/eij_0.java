/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIj
 */
public final class eij_0
extends eHV {
    private static final aqr_2 v = new eFw(new eFv("Calcul le niveau des effets du groupe en fonction du cout du sort d\u00e9clenchant", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Niveau par PA", eFx.c), new eFu("Niveau par PM", eFx.c), new eFu("Niveau par PW", eFx.c)));
    private float C = 0.0f;
    private float D = 0.0f;
    private float E = 0.0f;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eij_0() {
        this.M();
    }

    public eij_0 aD() {
        return new eij_0();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        super.j(sd_02);
        this.C = ((efh_0)this.c).a(6, this.aZ());
        this.D = ((efh_0)this.c).a(7, this.aZ());
        this.E = ((efh_0)this.c).a(8, this.aZ());
    }

    @Override
    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = super.a(ejh_02, bl);
        if (ejh_02 == null) {
            a.error((Object)"Unable to execute a RunningEffectGroupLevelFunctionTriggeringActionCost without triggering effect");
            return efn_02;
        }
        if (!(ejh_02 instanceof efz_0)) {
            a.error((Object)"Unable to execute a RunningEffectGroupLevelFunctionTriggeringActionCost without actionCost triggering effect");
            return efn_02;
        }
        efz_0 efz_02 = (efz_0)ejh_02;
        byte by = efz_02.aF();
        byte by2 = efz_02.aE();
        byte by3 = efz_02.aD();
        float f2 = (float)by * this.C + (float)by2 * this.D + (float)by3 * this.E;
        efn_02.a(Math.round(f2));
        return efn_02;
    }

    @Override
    public void z() {
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

