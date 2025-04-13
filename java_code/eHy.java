/*
 * Decompiled with CFR 0.152.
 */
public class eHy
extends eHs {
    private static final aqr_2 D = new eFw(new eFv("Attraction standard", new eFu("Nombre de case (tire vers le caster)", eFx.b), new eFu("Perte PA si collision (default : 0, 1 = perte)", eFx.b)), new eFv("Tirage dans une direction pr\u00e9cise", new eFu("Nombre de case", eFx.b), new eFu("Perte PA si collision (default : 0, 1 = perte)", eFx.b), new eFu("Direction particuli\u00e8re : 0:NE 1:SE 2:NW 3:SW 4:Dans la direction de la cible 5:Vers la cellule cible", eFx.c)), new eFv("NE PLUS UTILISER", new eFu("Nombre de case", eFx.b), new eFu("Perte PA si collision (default : 0, 1 = perte)", eFx.b), new eFu("Direction particuli\u00e8re : -1 (defaut) 0:NE 1:SE 2:NW 3:SW 4:Oppos\u00e9e \u00e0 la direction de la cible 5:Oppos\u00e9 \u00e0 la cellule cible 6:al\u00e9atoire 7: direction du caster", eFx.c), new eFu("Elements des d\u00e9g\u00e2ts de collision (default = EARTH(3))", eFx.c)));
    public static final byte x = 0;
    public static final byte y = 1;
    public static final byte z = 2;
    public static final byte A = 3;
    public static final byte B = 4;
    public static final byte C = 5;

    @Override
    public aqr_2 c_() {
        return D;
    }

    public eHy aD() {
        eHy eHy2 = new eHy();
        eHy2.w = false;
        return eHy2;
    }

    @Override
    public void M() {
        super.M();
        this.c(188);
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
    boolean aJ() {
        return true;
    }

    @Override
    public boolean aE() {
        return !this.aM() && !this.aN() && (this.aY() || !this.aP()) && !this.aQ();
    }

    @Override
    boolean aF() {
        return true;
    }

    @Override
    public eKm aG() {
        if (this.f instanceof eKm) {
            return (eKm)this.f;
        }
        return null;
    }

    @Override
    aff_1 aI() {
        aej_2 aej_22;
        if (((efh_0)this.c).F() < 3) {
            return this.bw();
        }
        int n = -1;
        if (((efh_0)this.c).F() >= 3) {
            short s2 = this.aZ();
            n = (byte)((efh_0)this.c).a(2, s2, eFb.a);
        }
        switch (n) {
            case 0: {
                aej_22 = aej_2.h;
                break;
            }
            case 1: {
                aej_22 = aej_2.b;
                break;
            }
            case 2: {
                aej_22 = aej_2.f;
                break;
            }
            case 3: {
                aej_22 = aej_2.d;
                break;
            }
            case 4: {
                aej_22 = this.f.j();
                break;
            }
            case 5: {
                return this.g;
            }
            default: {
                aej_22 = this.aX() ? aej_2.k : new afs_2(this.e.G(), this.e.H(), this.e.I(), this.f.G(), this.f.H(), this.f.I()).h();
            }
        }
        return new aff_1(this.f.G() + aej_22.m * this.v, this.f.H() + aej_22.n * this.v);
    }

    private aff_1 bw() {
        aej_2 aej_22 = new afs_2(this.e.G(), this.e.H(), this.e.I(), this.aG().G(), this.aG().H(), this.aG().I()).h();
        return new aff_1(this.e.G() + aej_22.m, this.e.H() + aej_22.n, this.e.I());
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

