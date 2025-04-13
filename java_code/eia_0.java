/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIa
 */
public final class eia_0
extends eHV {
    private static final aqr_2 v = new eFw(new eFv("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique : la carac sert de 'faux niveau'", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Charac prise sur Target = 0 (defaut), Caster = 1", eFx.c), new eFu("Ratio en % (100 = 100% du niveau du personnage)", eFx.b)), new eFv("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique : la carac sert de 'faux niveau'", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Charac prise sur Target = 0 (defaut), Caster = 1", eFx.c), new eFu("Ratio en % appliqu\u00e9 \u00e0 l'incr\u00e9ment (100 = 100% du niveau du personnage)", eFx.b), new eFu("Niveau : Base du niveau", eFx.b), new eFu("Niveau : Incr\u00e9ment par niveau du personnage", eFx.b)));
    private boolean C = false;
    private float D;
    private float E = 1.0f;
    private int F;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eia_0() {
        this.M();
    }

    public eia_0 aD() {
        eia_0 eia_02 = new eia_0();
        eia_02.F = this.F;
        eia_02.C = this.C;
        eia_02.D = this.D;
        eia_02.E = this.E;
        return eia_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        super.j(sd_02);
        this.C = ((efh_0)this.c).a(6, this.aZ(), eFb.a) == 1;
        this.F = ((efh_0)this.c).a(7, this.aZ(), eFb.a);
        if (((efh_0)this.c).F() < 10) {
            this.D = 0.0f;
            this.E = 1.0f;
        } else {
            this.D = ((efh_0)this.c).a(8, this.aZ());
            this.E = ((efh_0)this.c).a(9, this.aZ());
        }
    }

    @Override
    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = super.a(ejh_02, bl);
        Su su = this.C ? this.e : this.f;
        if (!(su instanceof epq_2)) {
            return efn_02;
        }
        int n = ((epq_2)su).dr();
        n = n * this.F / 100;
        n = (int)Math.floor(this.D + this.E * (float)n);
        efn_02.a(n);
        return efn_02;
    }

    @Override
    public void z() {
        super.z();
        this.F = 0;
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

