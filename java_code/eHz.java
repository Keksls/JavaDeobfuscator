/*
 * Decompiled with CFR 0.152.
 */
public class eHz
extends eHs {
    private static final aqr_2 F = new eFw(new eFv("Poussage standard", new eFu("Nombre de case", eFx.b), new eFu("Perte PA si collision (default : 1, 0 = pas de perte)", eFx.b)), new eFv("Poussage dans une direction pr\u00e9cise", new eFu("Nombre de case", eFx.b), new eFu("Perte PA si collision (default : 1, 0 = pas de perte)", eFx.b), new eFu("Direction particuli\u00e8re : -1 (defaut) 0:NE 1:SE 2:NW 3:SW 4:Oppos\u00e9e \u00e0 la direction de la cible 5:Oppos\u00e9 \u00e0 la cellule cible 6:al\u00e9atoire 7: direction du caster", eFx.c)), new eFv("NE PLUS UTILISER", new eFu("Nombre de case", eFx.b), new eFu("Perte PA si collision (default : 1, 0 = pas de perte)", eFx.b), new eFu("Direction particuli\u00e8re : -1 (defaut) 0:NE 1:SE 2:NW 3:SW 4:Oppos\u00e9e \u00e0 la direction de la cible 5:Oppos\u00e9 \u00e0 la cellule cible 6:al\u00e9atoire 7: direction du caster", eFx.c), new eFu("Elements des d\u00e9g\u00e2ts de collision (default = EARTH(3))", eFx.c)));
    public static final byte x = 0;
    public static final byte y = 1;
    public static final byte z = 2;
    public static final byte A = 3;
    public static final byte B = 4;
    public static final byte C = 5;
    public static final byte D = 6;
    public static final byte E = 7;

    @Override
    public aqr_2 c_() {
        return F;
    }

    @Override
    public void M() {
        super.M();
        this.c(187);
    }

    public eHz aD() {
        return new eHz();
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
        return false;
    }

    @Override
    public boolean aE() {
        return this.f != null && !this.aM() && !this.aN() && (this.aY() || !this.aP()) && !this.aQ();
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
        int n = -1;
        if (((efh_0)this.c).F() >= 3) {
            short s2 = this.aZ();
            n = (byte)((efh_0)this.c).a(2, s2, eFb.a);
        }
        block0 : switch (n) {
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
                aej_22 = this.f.j().g();
                break;
            }
            case 5: {
                return this.g;
            }
            case 6: {
                switch (xc_0.a(1, 4)) {
                    case 1: {
                        aej_22 = aej_2.h;
                        break block0;
                    }
                    case 2: {
                        aej_22 = aej_2.f;
                        break block0;
                    }
                    case 3: {
                        aej_22 = aej_2.b;
                        break block0;
                    }
                }
                aej_22 = aej_2.d;
                break;
            }
            case 7: {
                aej_22 = this.e.F();
                break;
            }
            default: {
                aej_22 = this.aX() ? aej_2.k : new afs_2(this.e.G(), this.e.H(), this.e.I(), this.f.G(), this.f.H(), this.f.I()).h();
            }
        }
        return new aff_1(this.f.G() + aej_22.b().m, this.f.H() + aej_22.b().n);
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

