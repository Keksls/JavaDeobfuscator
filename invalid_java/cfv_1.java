/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cfV
 */
public class cfv_1
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfv_1.class);
    private static final cfv_1 b = new cfv_1();

    @Override
    public boolean a(adt_1 adt_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        switch (adt_12.a()) {
            case 13116: {
                cwo_2 cwo_22 = (cwo_2)adt_12;
                blx_1 blx_12 = bzf_1.a(cwo_22.f());
                if (blx_12 == null) {
                    return false;
                }
                if (cwo_22.e() == 4 && cwo_22.h() == 1 && blx_12.ak()) {
                    return true;
                }
                this.a(cwo_22.e(), cwo_22.g(), cwo_22.f(), cwo_22.h());
                return false;
            }
            case 13925: {
                cwl_2 cwl_22 = (cwl_2)adt_12;
                if (cwl_22.h() != 1 && cwl_22.e() != 2) {
                    a.error((Object)"Erreur : on recoit un PLANT START MESSAGE pour une occupation ne d\u00e9butant pas / une occupation autre que PLANT");
                    return false;
                }
                int n = cwl_22.j();
                fii fii2 = fij.a().a(n);
                if (cwl_22.f() == bmr_12.a_()) {
                    long l = cwl_22.c();
                    int n2 = cwl_22.b();
                    bqc_2 bqc_22 = new bqc_2(cwl_22.d(), cwl_22.i());
                    bqc_22.a(l);
                    bqc_22.a(n2);
                    bqc_22.b(fii2);
                    if (bqc_22.g()) {
                        bqc_22.a();
                    }
                    return false;
                }
                blx_1 blx_13 = bmf_2.a().c(cwl_22.f());
                if (blx_13 == null) {
                    a.error((Object)"[PLANT OCCUPATION] Uknown Mobile");
                    return false;
                }
                biI biI2 = blx_13.bv();
                if (biI2.bb() != null) {
                    biF biF2 = new biF(blx_13, n, cwl_22.d(), cwl_22.i());
                    blx_13.a(biF2);
                    return false;
                }
                fii fii3 = fij.a().a(n);
                if (fii3 != null) {
                    bNK bNK2 = bNT.f().c(cwl_22.d(), cwl_22.i());
                    if (bNK2 != null) {
                        a.warn((Object)"On a recu un d\u00e9but de plantation sur une place non libre ! ");
                    }
                    bOE.a(biI2, fii3);
                    return false;
                }
                return false;
            }
            case 13283: {
                cwm_2 cwm_22 = (cwm_2)adt_12;
                if (cwm_22.h() != 1 && cwm_22.e() != 26) {
                    a.error((Object)"Erreur : on recoit un SEARCH TREASURE START MESSAGE pour une occupation ne d\u00e9butant pas / une occupation autre que SEARCH_TREASURE");
                    return false;
                }
                int n = cwm_22.j();
                fii fii4 = fij.a().a(n);
                if (cwm_22.f() == bmr_12.a_()) {
                    long l = cwm_22.b();
                    bqk_2 bqk_22 = new bqk_2(cwm_22.c(), cwm_22.d(), cwm_22.i());
                    bqk_22.a(l);
                    bqk_22.b(fii4);
                    if (bqk_22.g()) {
                        bqk_22.a();
                    }
                    return false;
                }
                blx_1 blx_14 = bmf_2.a().c(cwm_22.f());
                if (blx_14 == null) {
                    a.error((Object)"[SEARCH TREASURE OCCUPATION] Uknown Mobile");
                    return false;
                }
                biI biI3 = blx_14.bv();
                if (biI3.bb() != null) {
                    biF biF3 = new biF(blx_14, n, cwm_22.c(), cwm_22.d());
                    blx_14.a(biF3);
                    return false;
                }
                fii fii5 = fij.a().a(n);
                if (fii5 != null) {
                    bNK bNK3 = bNT.f().c(cwm_22.c(), cwm_22.d());
                    if (bNK3 != null) {
                        a.error((Object)"On a recu un d\u00e9but de recherche de tr\u00e9sor sur une place non libre ! ");
                    }
                    bOE.a(biI3, fii5);
                    return false;
                }
                return false;
            }
            case 12821: {
                cwk_2 cwk_22 = (cwk_2)adt_12;
                if (cwk_22.e() != 3) {
                    a.error((Object)"Message COLLECT START re\u00e7u avec de mauvais param\u00e8tres");
                    return false;
                }
                byte by = cwk_22.d();
                byte by2 = cwk_22.i();
                int n = cwk_22.j();
                int n3 = cwk_22.k();
                bNK bNK4 = bNT.f().c(n, n3);
                if (bNK4 == null) {
                    return false;
                }
                brw_1 brw_12 = bNK4.b(cwk_22.o());
                if (brw_12 == null) {
                    return false;
                }
                byte by3 = cwk_22.b();
                boolean bl = by3 == 1;
                long l = cwk_22.f();
                if (cwk_22.h() == 1) {
                    long l2 = cwk_22.c();
                    double d2 = cwk_22.p();
                    int n4 = cwk_22.q();
                    return this.a(bmr_12, by3, by, l, l2, d2, bl, by2, brw_12, bNK4, n, n3, n4);
                }
                if (cwk_22.h() == 3) {
                    return this.a(bmr_12, l, by2, brw_12, bNK4);
                }
                return false;
            }
            case 12109: {
                crf_0 crf_02 = (crf_0)adt_12;
                if (crf_02.e() != 6) {
                    a.error((Object)"Message COLLECT MONSTER START re\u00e7u avec de mauvais param\u00e8tres");
                    return false;
                }
                bmv_1 bmv_12 = (bmv_1)bmf_2.a().c(crf_02.d());
                if (bmv_12 == null) {
                    a.error((Object)"Message COLLECT MONSTER START re\u00e7u avec une cible invalide");
                    return false;
                }
                brw_1 brw_13 = (brw_1)bmv_12.cW().c(crf_02.b());
                if (brw_13 == null) {
                    a.error((Object)("skillAction inconnu id= " + crf_02.b()));
                    return false;
                }
                if (crf_02.f() == bmr_12.a_()) {
                    ece_0 ece_02 = bmr_12.eX();
                    if (brw_13.l() != 0 && !ece_02.e(brw_13.l())) {
                        a.error((Object)("le joueur ne poss\u00e8de pas ce craft " + brw_13.l()));
                        return false;
                    }
                    bpk_2 bpk_22 = new bpk_2(brw_13, bmv_12);
                    bpk_22.a(crf_02.c());
                    if (bpk_22.g()) {
                        bpk_22.a();
                    }
                } else {
                    blx_1 blx_15 = bmf_2.a().c(crf_02.f());
                    if (blx_15 == null) {
                        a.error((Object)"[COLLECT MODIF] Pas de character retrouv\u00e9");
                    } else {
                        biI biI4 = blx_15.bv();
                        int n = brw_13.h();
                        if (biI4.bb() != null) {
                            biF biF4 = new biF(blx_15, n, bmv_12.P_().d(), bmv_12.P_().e());
                            blx_15.a(biF4);
                        } else {
                            fii fii6 = fij.a().a(n);
                            if (fii6 != null) {
                                String string;
                                blx_15.a((abz_0)bmv_12.bv());
                                String[] stringArray = biI4.F().split("-");
                                String string2 = string = bmv_12 == null ? "" : bOE.b(fii6);
                                if (!stringArray[0].equals(string)) {
                                    bOE.a(biI4, fii6);
                                }
                            } else {
                                a.error((Object)("Action Description non trouv\u00e9e pour le monstre " + bmv_12.a_() + " et le skill " + brw_13.l()));
                            }
                        }
                    }
                }
                return false;
            }
            case 13763: {
                crn_0 crn_02 = (crn_0)adt_12;
                if (crn_02.e() != 13 && crn_02.e() != 28) {
                    a.error((Object)"Message DISTRIBUTION re\u00e7u avec de mauvais param\u00e8tres");
                    return false;
                }
                bEw bEw2 = (bEw)((Object)ccm_1.g().a(crn_02.c()));
                if (bEw2 == null) {
                    a.error((Object)"Message START_COLLECT_ON_INTERACTIVE_ELEMENT re\u00e7u avec une cible invalide");
                    return false;
                }
                blx_1 blx_16 = bmf_2.a().c(crn_02.f());
                if (blx_16 == null) {
                    a.error((Object)"Message START_COLLECT_ON_INTERACTIVE_ELEMENT re\u00e7u avec un character player invalide");
                    return false;
                }
                bpw_2 bpw_22 = new bpw_2(bEw2, crn_02.e());
                bpw_22.a(crn_02.b());
                if (bpw_22.g()) {
                    bpw_22.a();
                }
                return false;
            }
            case 12020: {
                crm_0 crm_02 = (crm_0)adt_12;
                bFi bFi2 = (bFi)ccm_1.g().a(crm_02.b());
                if (bFi2 == null) {
                    a.error((Object)"Message SIT_OCCUPATION_START_MESSAGE re\u00e7u avec un stool invalide");
                    return false;
                }
                blx_1 blx_17 = bmf_2.a().c(crm_02.c());
                if (blx_17 == null) {
                    a.error((Object)"Message SIT_OCCUPATION_START_MESSAGE re\u00e7u avec un character player invalide");
                    return false;
                }
                bql_2 bql_22 = new bql_2(blx_17, bFi2);
                if (bql_22.g()) {
                    bql_22.a();
                    if (blx_17 == bmr_12) {
                        azu_0.j().a(dct_0.a());
                    }
                }
                return false;
            }
        }
        return true;
    }

    void a(brw_1 brw_12, blx_1 blx_12, bNK bNK2, biI biI2, byte by) {
        fii fii2 = fij.a().a(brw_12.h());
        if (fii2 == null) {
            a.error((Object)("Action Description non trouv\u00e9e pour ressource " + bNK2.a() + " et  la skill " + by));
            return;
        }
        blx_12.a(bNK2);
        String[] stringArray = biI2.F().split("-");
        String string = bOE.b(fii2);
        if (!stringArray[0].equals(string)) {
            bOE.a(biI2, fii2);
        }
    }

    public void a(short s2, byte[] byArray, long l, short s3) {
        bmr_1 bmr_12 = azu_0.j().k();
        switch (s2) {
            case 14: {
                blx_1 blx_12 = bmf_2.a().c(l);
                if (blx_12 == null) {
                    a.error((Object)("[RIDE] Personnage inexistant : " + l));
                    return;
                }
                if (s3 == 1) {
                    bqi_2 bqi_22 = new bqi_2(blx_12);
                    if (bqi_22.g()) {
                        bqi_22.a();
                    }
                } else if (s3 == 2) {
                    if (blx_12.fl() != null && blx_12.fl().ac_() == 14) {
                        blx_12.r(false);
                    } else {
                        a.warn((Object)("[RIDE] Demande d'arr\u00eat d'occupation alors que le personnage est en " + blx_12.fl()));
                    }
                } else if (s3 == 3) {
                    if (blx_12.fl() != null && blx_12.fl().ac_() == 14) {
                        blx_12.a(true, false);
                    } else {
                        a.warn((Object)("[RIDE] Demande d'arr\u00eat d'occupation alors que le personnage est en " + blx_12.fl()));
                    }
                }
                return;
            }
            case 20: {
                blx_1 blx_13 = bmf_2.a().c(l);
                if (blx_13 == null) {
                    a.error((Object)("[EMOTE] Personnage inexistant : " + l));
                    return;
                }
                if (s3 == 1) {
                    bps_2 bps_22 = new bps_2(blx_13);
                    bps_22.a(byArray);
                    if (bps_22.g()) {
                        bps_22.a();
                    }
                } else if (s3 == 2) {
                    if (blx_13.fl() != null && blx_13.fl().ac_() == 20) {
                        blx_13.dN();
                    } else {
                        a.warn((Object)("[EMOTE] Demande d'arr\u00eat d'occupation alors que le personnage est en " + blx_13.fl()));
                    }
                }
                return;
            }
            case 1: {
                blx_1 blx_14 = bmf_2.a().c(l);
                if (blx_14 != null) {
                    if (s3 == 1) {
                        bqh_2 bqh_22 = new bqh_2(blx_14);
                        if (bqh_22.g()) {
                            bqh_22.a();
                        }
                    } else if (s3 == 2) {
                        if (blx_14.fl() != null && blx_14.fl().ac_() == 1) {
                            blx_14.dN();
                        } else {
                            a.error((Object)("[REST_OCCUPATION] Demande d'annulation alors que le personnage est en " + blx_14.fl()));
                        }
                    }
                } else {
                    a.error((Object)("[REST_OCCUPATION] Personnage inexistant : " + l));
                }
                return;
            }
            case 3: {
                a.fatal((Object)"We are not supposed to pass here");
                break;
            }
            case 6: {
                if (s3 != 3) break;
                if (l == bmr_12.a_()) {
                    if (bmr_12.eE() != null) {
                        if (bmr_12.eE().ac_() != 6) break;
                        bmr_12.a(true, false);
                        return;
                    }
                    a.info((Object)"[COLLECT CANCELLATION] No occupation or occupation already ended");
                    return;
                }
                blx_1 blx_15 = bmf_2.a().c(l);
                if (blx_15 == null) {
                    a.error((Object)("[COLLECT CANCELLATION] Character not found " + l));
                    return;
                }
                biI biI2 = blx_15.bv();
                if (biI2.bF() == null) break;
                biI2.bF().a();
                return;
            }
            case 4: {
                bmr_1 bmr_13;
                bnh_1 bnh_12 = bmr_13 = l == bmr_12.a_() ? bmr_12 : (bnh_1)bzf_1.a(l);
                if (bmr_13 == null) {
                    a.info((Object)"Demande de d\u00e9but ou de fin d'occupation (death) pour un joueur non connu");
                    return;
                }
                switch (s3) {
                    case 1: {
                        bqp_2 bqp_22 = new bqp_2(bmr_13);
                        bqp_22.a(byArray);
                        if (bqp_22.g()) {
                            bqp_22.a();
                        }
                        return;
                    }
                    case 2: {
                        bpc_2 bpc_22 = bmr_13.eE();
                        if (!(bpc_22 instanceof bqp_2)) {
                            return;
                        }
                        ((bnh_1)bmr_13).dN();
                        return;
                    }
                }
                return;
            }
            case 5: {
                if (l == bmr_12.a_() && s3 == 3) {
                    a.info((Object)"Recu demande d'annulation du browsing du local player");
                    bpc_2 bpc_23 = bmr_12.eE();
                    if (bpc_23 != null && bpc_23 instanceof bpg_2) {
                        bmr_12.a(true, false);
                    }
                }
                return;
            }
            case 7: {
                if (l == bmr_12.a_() && s3 == 3) {
                    a.info((Object)"Recu demande d'annulation du managing du local player");
                    bpc_2 bpc_24 = bmr_12.eE();
                    if (bpc_24 != null && bpc_24 instanceof bpy_2) {
                        bmr_12.a(true, false);
                    }
                }
                return;
            }
            case 16: {
                blx_1 blx_16 = bmf_2.a().c(l);
                if (blx_16 != null) {
                    if (s3 == 3) {
                        blx_16.a(true, false);
                    } else if (s3 == 2) {
                        blx_16.dN();
                    }
                } else {
                    a.error((Object)("[REST_OCCUPATION] Personnage inexistant : " + l));
                }
                return;
            }
            case 25: {
                if (s3 == 1) {
                    // empty if block
                }
                if (s3 == 3) {
                    a.info((Object)"Received a cancel occupation for ManageHavenWorldOccupation");
                    bpc_2 bpc_25 = bmr_12.eE();
                    if (bpc_25 instanceof bpz_2) {
                        bmr_12.a(true, false);
                    }
                }
                return;
            }
            case 30: {
                bpc_2 bpc_26;
                if (bmr_12.a_() != l) {
                    return;
                }
                if (s3 == 1) {
                    bpc_26 = new bpt_2();
                    if (!bpc_26.g()) {
                        return;
                    }
                    bpc_26.a();
                    bmr_12.a(bpc_26);
                }
                if (s3 == 3 || s3 == 2) {
                    a.info((Object)"Received a cancel occupation for EnchantmentMachine");
                    bpc_26 = bmr_12.eE();
                    if (bpc_26 instanceof bpt_2) {
                        bmr_12.a(true, false);
                    }
                }
                return;
            }
            case 32: {
                if (s3 == 3 || s3 == 2) {
                    a.info((Object)"Received a cancel occupation for haven world resources collector");
                    bpc_2 bpc_27 = bmr_12.eE();
                    if (bpc_27 instanceof bpv_2) {
                        bmr_12.a(true, false);
                    }
                }
                return;
            }
            default: {
                blx_1 blx_17 = bmf_2.a().c(l);
                if (blx_17 != null) {
                    if (s3 == 3) {
                        blx_17.a(true, false);
                        break;
                    }
                    if (s3 != 2) break;
                    blx_17.dN();
                    break;
                }
                a.error((Object)("[OCCUPATION] Personnage inexistant : " + l));
            }
        }
        if (s3 == 3) {
            if (l != bmr_12.a_()) {
                a.error((Object)"Message d'annulation re\u00e7u pour un autre client que le localplayer");
                return;
            }
            if (bmr_12.eE() == null) {
                a.info((Object)"Occupation d\u00e9ja termin\u00e9e");
                return;
            }
            if (bmr_12.eE().ac_() == s2) {
                bmr_12.a(true, false);
            } else {
                a.error((Object)"Message d'annulation recu pour une occupation diff\u00e9rente de celle en cours");
            }
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public static cfv_1 a() {
        return b;
    }

    private static void a(bNK bNK2, int n, int n2) {
        int n3 = bNK2.G();
        int n4 = bNK2.H();
        aik_0.a().a(n3, n4);
        int n5 = n - n2;
        if (n5 != n && n5 > 0) {
            int n6 = cfv_1.a(n5);
            FreeParticleSystem freeParticleSystem = aij_0.a().a(n6);
            if (freeParticleSystem != null) {
                freeParticleSystem.b(true);
                freeParticleSystem.a(n3, (float)n4, (float)(bNK2.I() + 10));
                aik_0.a().b(freeParticleSystem);
            }
        }
    }

    private boolean a(bmr_1 bmr_12, byte by, byte by2, long l, long l2, double d2, boolean bl, byte by3, brw_1 brw_12, bNK bNK2, int n, int n2, int n3) {
        if (by == 7) {
            return false;
        }
        if (by == 4) {
            aUh.a("collect.error.resourceOccupied", new Object[0]);
            return false;
        }
        Optional<ece_0> optional = bmr_12.eW();
        if (optional.isEmpty()) {
            a.error((Object)String.format("[OCCUPATION] Unable to fetch craftHandler of following user %s during start of collectOccupation", l));
            return false;
        }
        if (!optional.get().e(by2)) {
            a.error((Object)("Character hasn't required skill " + by2));
            return false;
        }
        if (by == 5) {
            a.error((Object)"We got collect success for starting collect");
            return false;
        }
        if (l == bmr_12.a_()) {
            bpl_2 bpl_22 = new bpl_2(brw_12, bNK2);
            bpl_22.a(l2);
            bpl_22.a(by3);
            bpl_22.a(bl);
            if (bpl_22.g()) {
                bpl_22.a(d2);
            }
            aik_0.a().a(n, n2);
        } else {
            Object object;
            blx_1 blx_12 = bmf_2.a().c(l);
            if (blx_12 == null) {
                a.error((Object)("No character found for id " + l));
                return false;
            }
            biI biI2 = blx_12.bv();
            if (bNK2 == bmr_12.bB() && bmr_12.eE().ac_() == 3) {
                object = (bpl_2)bmr_12.eE();
                ((bpb_2)object).a(l2);
                ((bpl_2)object).a(by3);
                ((bpl_2)object).a(bl);
                if (((bpl_2)object).g()) {
                    ((bpl_2)object).b(d2);
                }
            } else {
                cfv_1.a(bNK2, brw_12.j(), by3);
            }
            object = (bjw_1)eyo_1.g().d(n3);
            if (biI2.bb() != null) {
                biI2.b(new cfw_1(this, (bjw_1)object, biI2, brw_12, blx_12, bNK2, by2));
            } else {
                if (object != null) {
                    biI2.a((ezr_0)object, (short)exh_2.r.A);
                }
                this.a(brw_12, blx_12, bNK2, biI2, by2);
            }
        }
        return false;
    }

    private boolean a(bmr_1 bmr_12, long l, byte by, brw_1 brw_12, bNK bNK2) {
        if (l == bmr_12.a_()) {
            if (!(bmr_12.eE() instanceof bpl_2)) {
                return false;
            }
            bmr_12.a(true, false);
            cfv_1.a(bNK2, brw_12.j(), by);
        } else {
            Object object;
            blx_1 blx_12 = bmf_2.a().c(l);
            if (blx_12 == null) {
                a.error((Object)("No character found for id " + l));
                return false;
            }
            if (bNK2 == bmr_12.bB() && bmr_12.eE() instanceof bpl_2) {
                object = (bpl_2)bmr_12.eE();
                ((bpl_2)object).a(by);
                bmr_12.do().a(by);
            } else {
                cfv_1.a(bNK2, brw_12.j(), by);
            }
            object = blx_12.bv();
            bnx_0 bnx_02 = ((biE)object).bF();
            if (bnx_02 != null) {
                bnx_02.a();
            }
        }
        return false;
    }

    private static int a(int n) {
        switch (n) {
            case 1: {
                return 800792;
            }
            case 2: {
                return 800793;
            }
            case 3: {
                return 800794;
            }
            case 4: {
                return 800795;
            }
            case 5: {
                return 800796;
            }
        }
        return 0;
    }
}

