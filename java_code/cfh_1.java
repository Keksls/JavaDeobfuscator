/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cfh
 */
public class cfh_1
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfh_1.class);
    public static final cfh_1 b = new cfh_1();

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 12549: {
                Optional<ece_0> optional = this.a();
                if (optional.isEmpty()) {
                    return false;
                }
                csv_0 csv_02 = (csv_0)adt_12;
                this.a(optional.get(), csv_02);
                return false;
            }
            case 13655: {
                Optional<ece_0> optional = this.a();
                if (optional.isEmpty()) {
                    return false;
                }
                csw_1 csw_12 = (csw_1)adt_12;
                this.a(optional.get(), csw_12);
                return false;
            }
            case 12473: {
                Optional<ece_0> optional = this.a();
                if (optional.isEmpty()) {
                    return false;
                }
                csa_0 csa_02 = (csa_0)adt_12;
                this.a(optional.get(), csa_02);
                return false;
            }
            case 12457: {
                Optional<ece_0> optional = this.a();
                if (optional.isEmpty()) {
                    return false;
                }
                csy_1 csy_12 = (csy_1)adt_12;
                this.a(azu_0.j().k(), optional.get(), csy_12);
                return false;
            }
            case 12673: {
                Optional<ece_0> optional = this.a();
                if (optional.isEmpty()) {
                    return false;
                }
                csx_1 csx_12 = (csx_1)adt_12;
                this.a(azu_0.j().k(), optional.get(), csx_12);
                return false;
            }
        }
        return true;
    }

    private Optional<ece_0> a() {
        long l = azu_0.j().n().u();
        Optional<ece_0> optional = bgg.a.a(l);
        if (optional.isEmpty()) {
            a.error((Object)String.format("[CRAFT] Unable to fetch CraftHandler for handle craftMessage for following user %s", l));
        }
        return optional;
    }

    private void a(bmr_1 bmr_12, ece_0 ece_02, csx_1 csx_12) {
        ebw_0 ebw_02 = csx_12.b();
        switch (ebw_02) {
            case h: {
                break;
            }
            case c: {
                break;
            }
            case d: {
                break;
            }
            case b: {
                break;
            }
            case g: {
                break;
            }
            case i: {
                break;
            }
            case j: {
                break;
            }
            case l: {
                break;
            }
            case k: {
                break;
            }
            case m: {
                break;
            }
            case w: {
                aUh.a("error.notEnoughKamas", new Object[0]);
                break;
            }
            case v: {
                aUh.a("craft.secured.error.too.rich", new Object[0]);
                break;
            }
            case n: {
                String string;
                cXC.a().a("6001039.xps");
                cdw_0.n().c(600125L);
                brw_0 brw_02 = (brw_0)fis_1.a().e("selectedRecipe");
                if (brw_02 == null) {
                    eco_0 eco_02 = cXC.a().g();
                    string = bae.h().a(15, (long)eco_02.k().a(), new Object[0]);
                } else {
                    string = brw_02.e();
                }
                aUh.b("craft.knownRecipeExecutionFailure", string);
                cXC.a().c();
                return;
            }
            case o: {
                cXC.a().a("6001039.xps");
                cdw_0.n().c(600125L);
                aUh.b("craft.unknownRecipeExecutionFailure", new Object[0]);
                cXC.a().c();
                return;
            }
            case p: {
                cXC.a().a("6001039.xps");
                cdw_0.n().c(600125L);
                aUh.b("craft.unknownRecipeCantBeCraftedHere", new Object[0]);
                cXC.a().c();
                return;
            }
            case a: {
                String string;
                brw_0 brw_03 = (brw_0)fis_1.a().e("selectedRecipe");
                if (brw_03 == null) {
                    eco_0 eco_03 = cXC.a().g();
                    string = bae.h().a(15, (long)eco_03.k().a(), new Object[0]);
                } else {
                    string = brw_03.e();
                }
                aUh.b("craft.knownRecipeExecutionSuccess", string);
                cXC.a().i();
                return;
            }
            case q: {
                aUh.a("craft.errorOccupation", new Object[0]);
                if (azu_0.j().c(cXC.a())) {
                    azu_0.j().b(cXC.a());
                }
                return;
            }
            case t: {
                aUh.a("craft.secured.craftsman.absent", new Object[0]);
                break;
            }
            case u: 
            case s: {
                aUh.a("craft.errorOccupation", new Object[0]);
                break;
            }
            case e: {
                aUh.a("craft.data.unreachable", new Object[0]);
                break;
            }
            default: {
                a.error((Object)("Reception d'un message d'erreur de craft " + ebw_02 + " non g\u00e9r\u00e9 par le client"));
            }
        }
        cXC.e();
    }

    private void a(ece_0 ece_02, csv_0 csv_02) {
        int n = csv_02.b();
        ect_0 ect_02 = ecn_0.a.a(n);
        if (ect_02 == null) {
            a.error((Object)("R\u00e9ception d'un message d'apprentissage pour le m\u00e9tier " + n + " inconnu du manager"));
            return;
        }
        ece_02.a(ect_02);
    }

    private void a(ece_0 ece_02, csw_1 csw_12) {
        int n = csw_12.b();
        int n2 = csw_12.c();
        ect_0 ect_02 = ecn_0.a.a(n);
        if (ect_02 == null) {
            a.error((Object)("R\u00e9ception d'un message d'apprentissage de recette pour le metier " + n + " inconnu du manager"));
            return;
        }
        eco_0 eco_02 = ect_02.a(n2);
        if (eco_02 == null) {
            a.error((Object)("R\u00e9ception d'un message d'apprentissage de la recette " + n + " inconnue du manager"));
            return;
        }
        ece_02.a(n, n2);
    }

    private void a(ece_0 ece_02, csa_0 csa_02) {
        int n = csa_02.b();
        long l = csa_02.c();
        ece_02.a(n, l);
    }

    private void a(bmr_1 bmr_12, ece_0 ece_02, csy_1 csy_12) {
        Object object;
        eco_0 eco_02;
        long l = csy_12.b();
        int n = csy_12.c();
        byte by = csy_12.d();
        long l2 = csy_12.e();
        bgq_1 bgq_12 = (bgq_1)((Object)ccm_1.g().a(l));
        if (!bgq_12.aK_().contains(bmr_12.P_())) {
            a.error((Object)("D\u00e9Snchro de position? le joueur " + bmr_12 + " essaye d'interagir avec la machine " + bgq_12 + " sans se trouver dans le pattern d'activation"));
            return;
        }
        int n2 = bgq_12.Z();
        ect_0 ect_02 = ecn_0.a.a(n2);
        if (ect_02 == null) {
            a.error((Object)("Le joueur " + bmr_12 + " essaye d'utiliser la recette " + n + " du m\u00e9tier " + n2 + " alors que celui-ci n'existe pas"));
            return;
        }
        if (by == -1) {
            eco_02 = new ecr_0(n2, ece_02.f(n2));
        } else if (by == -2) {
            object = ect_02.a(n);
            eco_02 = new ecq_0((eco_0)object, n2, ((eco_0)object).f());
        } else {
            eco_02 = ect_02.a(n);
        }
        if (eco_02 == null) {
            a.error((Object)("Le joueur " + bmr_12 + " essaye d'utiliser la recette " + n + " du m\u00e9tier " + n2 + " alors que celle-ci n'existe pas"));
            return;
        }
        object = new bpn_2(bgq_12, eco_02, l2);
        if (((bpn_2)object).g()) {
            bmr_12.a((ead_0)object);
            ((bpn_2)object).a();
        } else {
            ((bpc_2)object).d();
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

