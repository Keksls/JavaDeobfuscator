/*
 * Decompiled with CFR 0.152.
 */
public final class eIg
extends eHV {
    private static final aqr_2 v = new eFw(new eFv("Transmet le niveau de l'etat de la cible aux effets enfants du groupe", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Id de l'\u00e9tat \u00e0 consulter", eFx.c)), new eFv("Transmet le niveau de l'etat aux effets enfants du groupe - Etat sur Target ou Caster", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Id de l'\u00e9tat \u00e0 consulter", eFx.c), new eFu("Check on Target = 0 (defaut), Caster = 1", eFx.c)), new eFv("Transmet le niveau de l'etat aux effets enfants du groupe - Choix de l'incr\u00e9ment par niveau de l'\u00e9tat", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Id de l'\u00e9tat \u00e0 consulter", eFx.c), new eFu("Check on Target = 0 (defaut), Caster = 1", eFx.c), new eFu("Niveau : Incr\u00e9ment pour 1 niveau de l'\u00e9tat", eFx.c)), new eFv("Transmet le niveau de l'etat aux effets enfants du groupe - Niveau de base", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Id de l'\u00e9tat \u00e0 consulter", eFx.c), new eFu("Check on Target = 0 (defaut), Caster = 1", eFx.c), new eFu("Niveau : Incr\u00e9ment pour 1 niveau de l'\u00e9tat", eFx.c), new eFu("Niveau : Niveau de base", eFx.c)));
    private int C;
    private float D;
    private float E = 1.0f;
    private boolean F;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eIg() {
        this.M();
    }

    public eIg aD() {
        return new eIg();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        super.j(sd_02);
        this.C = ((efh_0)this.c).a(6, this.aZ(), eFb.a);
        if (((efh_0)this.c).F() >= 8) {
            this.F = ((efh_0)this.c).a(7, this.aZ(), eFb.a) == 1;
        }
        this.E = ((efh_0)this.c).F() >= 9 ? ((efh_0)this.c).a(8, this.aZ()) : 1.0f;
        if (((efh_0)this.c).F() >= 10) {
            this.D = ((efh_0)this.c).a(9, this.aZ(), eFb.a);
        }
    }

    @Override
    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        Su su;
        efn_0 efn_02 = super.a(ejh_02, bl);
        Su su2 = su = this.F ? this.e : this.f;
        if (su == null) {
            return efn_02;
        }
        se_0 se_02 = su.x_();
        for (sd_0 sd_02 : se_02) {
            fie_0 fie_02;
            if (!(sd_02 instanceof eja_0) || (fie_02 = ((eja_0)sd_02).aF()).p() != this.C) continue;
            int n = (int)Math.floor(this.D + this.E * (float)fie_02.c());
            efn_02.a(n);
            return efn_02;
        }
        if (((efh_0)this.c).F() >= 10) {
            efn_02.a((int)Math.floor(this.D));
        }
        return efn_02;
    }

    @Override
    public void z() {
        super.z();
        this.C = -1;
        this.F = false;
        this.D = 0.0f;
        this.E = 1.0f;
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

