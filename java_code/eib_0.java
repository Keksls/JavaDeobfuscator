/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIb
 */
public class eib_0
extends eHV {
    public static final int v = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 3;
    public static final int F = 4;
    private static final aqr_2 Q = new eFw(new eFv("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique : la carac sert de 'faux niveau'", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Id de a Charact\u00e9ristique \u00e0 regarder", eFx.c), new eFu("Charac prise sur Target = 0 (defaut), Caster = 1", eFx.c), new eFu("Niveau : Base", eFx.b), new eFu("Niveau : Incr\u00e9ment par point de charac", eFx.b)), new eFv("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique : niveau par paliers de la carac (+1 tous les x carac)", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Id de a Charact\u00e9ristique \u00e0 regarder", eFx.c), new eFu("Charac prise sur Target = 0 (defaut), Caster = 1", eFx.c), new eFu("Palier de Charac pour avoir +1 niveau", eFx.b)), new eFv("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique (ou son max) : la carac sert de 'faux niveau'", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Id de a Charact\u00e9ristique \u00e0 regarder", eFx.c), new eFu("Charac prise sur Target = 0 (defaut), Caster = 1", eFx.c), new eFu("Niveau : Base", eFx.b), new eFu("Niveau : Incr\u00e9ment par point de charac", eFx.b), new eFu("Valeur \u00e0 utiliser (default: 0=valeur courante, 1=maximum, 2=valeur courante en %, 3=valeur manquante en %), 4=valeur manquante )", eFx.c)), new eFv("Niveau des effets du groupe bas\u00e9 sur une caract\u00e9ristique (ou son max) : Modifier le type d'arrondi pour le calcul de la valeur finale", new eFu("nb maximum d'effect \u00e0 executer", eFx.b), new eFu("avec r\u00e9ussite (1 : oui, 0 : non = standard", eFx.c), new eFu("0 = cellule, 1 = cibles (default)", eFx.c), new eFu("proba relative = 1 (on regarde les effets reellement executable et on recalcule leurs proba entre eux) ", eFx.c), new eFu("Transmission de la cible originale aux effets du groupe : oui = 1 (d\u00e9faut), non = 0 ", eFx.c), new eFu("Change le caster du groupe d'effet par sa cible oui = 1, non = 0 (d\u00e9faut)", eFx.c), new eFu("Id de a Charact\u00e9ristique \u00e0 regarder", eFx.c), new eFu("Charac prise sur Target = 0 (defaut), Caster = 1", eFx.c), new eFu("Niveau : Base", eFx.b), new eFu("Niveau : Incr\u00e9ment par point de charac", eFx.b), new eFu("Valeur \u00e0 utiliser (default: 0=valeur courante, 1=maximum, 2=valeur courante en %, 3=valeur manquante en %), 4=valeur manquante )", eFx.c), new eFu("Mode d'arrondi du niveau : 1=round (d\u00e9faut), 2=floor, 3=ceil", eFx.c)));
    private eps_0 R;
    protected boolean G = false;
    protected boolean H = false;
    protected int I;
    protected float J;
    protected float K;
    protected int L = 0;
    protected eFb M = eFb.b;

    @Override
    public aqr_2 c_() {
        return Q;
    }

    public eib_0() {
        this.M();
    }

    public eib_0 aD() {
        return new eib_0();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        super.j(sd_02);
        int n = ((efh_0)this.c).a(6, this.aZ(), eFb.a);
        this.R = eps_0.a((byte)n);
        this.L = 0;
        if (this.R == null) {
            a.error((Object)("Unable to get characteristic with id " + n));
        }
        boolean bl = this.G = ((efh_0)this.c).a(7, this.aZ(), eFb.a) == 1;
        if (((efh_0)this.c).F() == 9) {
            this.H = true;
            this.I = ((efh_0)this.c).a(8, this.aZ(), eFb.a);
        } else {
            this.H = false;
            this.J = ((efh_0)this.c).a(8, this.aZ());
            this.K = ((efh_0)this.c).a(9, this.aZ());
            if (((efh_0)this.c).F() >= 11) {
                this.L = ((efh_0)this.c).a(10, this.aZ(), eFb.a);
            }
            if (((efh_0)this.c).F() >= 12) {
                this.M = eFb.a(((efh_0)this.c).a(11, this.aZ(), eFb.a));
            }
        }
    }

    @Override
    public efn_0 a(ejh_0 ejh_02, boolean bl) {
        int n;
        efn_0 efn_02 = super.a(ejh_02, bl);
        if (this.R == null) {
            return efn_02;
        }
        Su su = this.G ? this.e : this.f;
        if (su == null) {
            return efn_02;
        }
        rs_0 rs_02 = su.b(this.R);
        int n2 = rs_02 != null ? (this.L == 1 ? rs_02.c() : (this.L == 2 ? rs_02.a() * 100 / rs_02.c() : (this.L == 3 ? (rs_02.c() - rs_02.a()) * 100 / rs_02.c() : (this.L == 4 ? rs_02.c() - rs_02.a() : rs_02.a())))) : 0;
        if (this.H) {
            n = this.I == 0 ? n2 : (int)Math.floor((float)n2 / (float)this.I);
        } else {
            switch (this.M) {
                case d: {
                    n = (int)Math.ceil(this.J + this.K * (float)n2);
                    break;
                }
                case c: {
                    n = (int)Math.floor(this.J + this.K * (float)n2);
                    break;
                }
                default: {
                    n = Math.round(this.J + this.K * (float)n2);
                }
            }
        }
        efn_02.a(n);
        return efn_02;
    }

    @Override
    public void z() {
        super.z();
        this.R = null;
        this.L = 0;
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

