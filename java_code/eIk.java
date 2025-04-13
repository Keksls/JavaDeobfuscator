/*
 * Decompiled with CFR 0.152.
 */
public class eIk
extends eHV {
    private static final aqr_2 F = new eFw(new eFv("Niveau des effets du groupe bas\u00e9 sur une application d'\u00e9tat : le niveau de l'\u00e9tat sert de 'faux niveau'", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Niveau : Base", eFx.b), new eFu("Niveau : Incr\u00e9ment par niveau de l'\u00e9tat", eFx.b)), new eFv("Niveau des effets du groupe bas\u00e9 sur une application d'\u00e9tat : niveau par paliers de la carac (+1 tous les x niveaux de l'\u00e9tat)", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Palier de Charac pour avoir +1 niveau", eFx.b)));
    protected boolean v;
    protected int C;
    protected float D;
    protected float E;

    @Override
    public aqr_2 c_() {
        return F;
    }

    public eIk() {
        this.M();
    }

    public eIk aD() {
        return new eIk();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        super.j(sd_02);
        if (((efh_0)this.c).F() == 7) {
            this.v = true;
            this.C = ((efh_0)this.c).a(6, this.aZ(), eFb.a);
        } else {
            this.v = false;
            this.D = ((efh_0)this.c).a(6, this.aZ());
            this.E = ((efh_0)this.c).a(7, this.aZ());
        }
    }

    @Override
    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        efn_0 efn_02 = super.a(ejh_02, bl);
        sd_0 sd_02 = this.m(ejh_02);
        if (!(sd_02 instanceof eGm)) {
            throw new IllegalStateException("Cet effet doit \u00eatre d\u00e9clench\u00e9 par une application d'\u00e9tat");
        }
        int n = ((eGm)sd_02).aK();
        int n2 = this.v ? (this.C == 0 ? n : (int)Math.floor((float)n / (float)this.C)) : Math.round(this.D + this.E * (float)n);
        efn_02.a(n2);
        return efn_02;
    }

    @Override
    public void z() {
        super.z();
        this.v = false;
        this.C = 0;
        this.D = 0.0f;
        this.E = 0.0f;
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

