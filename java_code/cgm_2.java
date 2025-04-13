/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from cgm
 */
public class cgm_2
implements ahr_1 {
    public static final boolean a = false;
    private static final cgm_2 c = new cgm_2();
    protected static final Logger b = Logger.getLogger(cgm_2.class);

    public static cgm_2 a() {
        return c;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        switch (adt_12.a()) {
            case 12362: {
                cyr_2 cyr_22 = (cyr_2)adt_12;
                akg_0.a().a(cyr_22.c(), cyr_22.b(), cyr_22.d(), cyr_22.e());
                return false;
            }
            case 13495: {
                cye_2 cye_22 = (cye_2)adt_12;
                blc_2.a().a(cye_22.c(), cye_22.b());
                acx_2 acx_22 = cye_22.e();
                if (acx_22 != null) {
                    int n = acx_22.d();
                    for (int k = 0; k < n; ++k) {
                        blc_2.a().a((byte)acx_22.e(k), acx_22.h(k), cye_22.b());
                    }
                }
                return false;
            }
            case 13258: {
                cyh_1 cyh_12 = (cyh_1)adt_12;
                blc_2.a().g(cyh_12.b());
                bmk_0 bmk_02 = (bmk_0)bmt_0.e.b();
                bmk_02.a(cyh_12.b());
                this.a(bmk_02);
                bua_0.a.a(new buq_2());
                return false;
            }
            case 13908: {
                cyd_2 cyd_22 = (cyd_2)adt_12;
                blc_2.a().a(cyd_22.b(), cyd_22.c());
                return false;
            }
            case 12092: {
                cyl_1 cyl_12 = (cyl_1)adt_12;
                blc_2.a().a(cyl_12.c(), cyl_12.d(), cyl_12.b());
                return false;
            }
            case 12778: {
                cyq_2 cyq_22 = (cyq_2)adt_12;
                b.info((Object)("reception d'un message de Reward pour le challenge " + cyq_22.b()));
                this.a(cyq_22.b(), cyq_22.d());
                return false;
            }
            case 12634: {
                cyb_2 cyb_22 = (cyb_2)adt_12;
                bmr_1 bmr_13 = (bmr_1)euw_2.a.d(cyb_22.f());
                long l = cyb_22.c();
                Object r2 = eyo_1.g().d(cyb_22.b());
                if (r2 != null) {
                    exk_2 exk_22 = new exk_2(l);
                    exk_22.b((ezr_0)r2);
                    exk_22.a(cyb_22.d());
                    if (bmr_13.da().c(exk_22) == null) {
                        b.error((Object)("[Add_item_inventory] : L'ajout d'un item en provenance d'un sc\u00e9nario a \u00e9chou\u00e9. Probl\u00e8me de synchro client/serveur ? Item : " + ((ezr_0)r2).n()));
                    } else if (cyb_22.e() && ((ezr_0)r2).S()) {
                        if (!azu_0.j().c(cxe_0.a())) {
                            azu_0.j().a(cxe_0.a());
                        }
                        cxe_0.a().a(((ezr_0)r2).n(), cyb_22.d());
                    } else {
                        bjy_1.a(exk_22, bmr_13);
                    }
                } else {
                    b.error((Object)("[ADD_ITEM_INVENTORY] : Impossible de trouver de r\u00e9f\u00e9renceItem d'id " + cyb_22.b()));
                }
                return false;
            }
            case 12416: {
                cyo_1 cyo_12 = (cyo_1)adt_12;
                long l = cyo_12.b();
                bmr_1 bmr_14 = (bmr_1)euu_2.c(bmr_12.U_(), l);
                if (bha_0.a(bmr_14, l, false) != null) {
                    return false;
                }
                if (bmr_14.R_().c(l) != null) {
                    return false;
                }
                return false;
            }
            case 13147: {
                exq_2 exq_22;
                int n;
                cyp_2 cyp_22 = (cyp_2)adt_12;
                bmr_1 bmr_15 = (bmr_1)euw_2.a.d(cyp_22.b());
                if (bmr_15 == null) {
                    return false;
                }
                int n2 = cyp_22.c();
                int n3 = cyp_22.d();
                if (n3 == -1) {
                    n = bmr_15.da().c(n2);
                } else {
                    n = bmr_15.da().a(n2, n3);
                    n3 -= n;
                }
                if (n != 0) {
                    bjy_1.a(n2, n);
                }
                if ((exq_22 = bmr_15.R_()) == null) {
                    return false;
                }
                if (n3 == -1) {
                    exq_22.e(n2);
                    bmr_15.cg().a(n2, fie.c, true);
                }
                if (n3 > 0) {
                    exq_22.b(n2, n3);
                    bmr_15.cg().a(n2, fie.c, true);
                }
                return false;
            }
            case 13214: {
                cyw_1 cyw_12 = (cyw_1)adt_12;
                long l = cyw_12.b();
                exk_2 exk_23 = (exk_2)bmr_12.R_().e(l);
                try {
                    evi_2.a().a(bmr_12.R_(), bmr_12.da().d(cyw_12.d()).g(), cyw_12.c(), exk_23, bmr_12, bmr_12.ge());
                }
                catch (uz_0 uz_02) {
                    b.warn((Object)"Ne devrait pas arriver : Impossible de d\u00e9s\u00e9quiper cet objet car la capacit\u00e9 maximum du sac a \u00e9t\u00e9 atteinte");
                }
                catch (Uy uy) {
                    b.warn((Object)"Ne devrait pas arriver : Impossible d'\u00e9quiper cet objet car l'objet est d\u00e9j\u00e0 pr\u00e9sent");
                }
                cyt_0.a().i();
                return false;
            }
            case 12868: {
                bMn bMn2;
                cyg_1 cyg_12 = (cyg_1)adt_12;
                int n = cyg_12.c();
                int n4 = cyg_12.d();
                int n5 = cyg_12.e();
                wu_0 wu_02 = cyg_12.f();
                int n6 = cyg_12.h();
                byte by = cyg_12.g();
                boolean bl = cyg_12.j();
                TIntArrayList tIntArrayList = cyg_12.b();
                int n7 = cyg_12.i();
                eod_0 eod_02 = by != -1 ? eod_0.values()[by] : null;
                b.info((Object)("Challenge courant : " + n + " (dans " + n4 + "s)"));
                blo_1 blo_12 = blo_1.e();
                bls_2 bls_22 = blo_12.c();
                blo_12.j();
                bls_2 bls_23 = blo_12.c();
                if (!bl && bls_23 != null) {
                    blo_12.f();
                }
                boolean bl2 = false;
                if (blo_12.a() != eod_02) {
                    blo_12.a(eod_02, n5);
                    bl2 = true;
                }
                blo_12.a(n6);
                if (!bl || n == -1) {
                    blo_12.a(-1, n5, wu_02, tIntArrayList, n6);
                    b.info((Object)"Pas de challenge dans cette zone, on s'arr\u00eate l\u00e0");
                    return false;
                }
                blo_12.a(n, n5, wu_02, tIntArrayList, n6);
                blo_12.c().g(n7);
                if (bl && bl2) {
                    blo_12.i();
                }
                if ((bMn2 = (bMn)bMs.a.e(n6)) != null) {
                    bml_0 bml_02 = (bml_0)bmt_0.e.b();
                    bml_02.a(bMn2);
                    bml_02.a(n);
                    blt_2 blt_22 = blc_2.a().c(n);
                    if (blt_22 != null) {
                        exk_2 exk_24;
                        bml_02.b(blt_22.c());
                        ArrayList<blg_2> arrayList = blt_22.k();
                        if (!arrayList.isEmpty() && (exk_24 = eyo_1.g().g(arrayList.get(0).c())) != null) {
                            bml_02.a(aUi.a(exk_24));
                        }
                    }
                    this.a(bml_02);
                } else {
                    b.error((Object)("R\u00e9ception d'un \u00e9venement de challenge pour un protecteur qu'on ne connait pas id=" + n6 + " eventType=CHALLENGE_INFORMATION"));
                }
                return false;
            }
            case 12045: {
                cyj_2 cyj_22 = (cyj_2)adt_12;
                eod_0 eod_03 = eod_0.values()[cyj_22.b()];
                blo_1.e().a(eod_03, cyj_22.d());
                blo_1.e().i();
                bls_2 bls_24 = blo_1.e().c();
                if (eod_03 == eod_0.b && blo_1.e().c() == bls_24 && !bls_24.p()) {
                    dlx.a().a(new dlq(dly.g, bls_24.m(), 500, 2500, "AnimChallenge1"));
                    cdw_0.n().c(600144L);
                    dhc dhc2 = new dhc(bae.h().a("notification.challengeStartTitle", new Object[0]), bae.h().a("notification.challengeStartText", new Object[0]), blr_1.h);
                    add_2.b().a(dhc2);
                }
                return false;
            }
            case 13487: {
                crh_0 crh_02 = (crh_0)adt_12;
                switch (crh_02.b()) {
                    case 202: {
                        bls_2 bls_25 = blo_1.e().c();
                        if (bls_25 == null) break;
                        bls_25.b(false);
                    }
                }
                if (crh_02.b() == 0) {
                    aul_0 aul_02 = aul_0.a();
                    bQG.a();
                    aul_02.c(bQG.b(crh_02.b(), new Object[0]));
                } else {
                    bQG.a();
                    bQG.a(crh_02.b(), new Object[0]);
                }
                return false;
            }
            case 13866: {
                cym_1 cym_12 = (cym_1)adt_12;
                fpm_0.b().a("challengeInputDialog", cfi_0.a("challengeInputDialog"), 40961L, (short)10000);
                blo_2 blo_22 = new blo_2(cym_12.b(), cym_12.c(), cym_12.d());
                fpm_0.b().a("wakfu.challenge", blw_2.class);
                fis_1.a().a("waitingForInputChallenge", blo_22);
                return false;
            }
            case 13364: {
                cyt_2 cyt_22 = (cyt_2)adt_12;
                bls_2 bls_26 = blc_2.a().b(cyt_22.b());
                bls_26.a(cyt_22.c());
                return false;
            }
            case 13110: {
                cyf_2 cyf_22 = (cyf_2)adt_12;
                bls_2 bls_27 = blo_1.e().c();
                if (bls_27 != null) {
                    bls_27.g(cyf_22.b());
                }
                return false;
            }
            case 13469: {
                cyk_1 cyk_12 = (cyk_1)adt_12;
                this.a(cyk_12.b(), cyk_12.e());
                boolean bl = blo_1.e().n();
                bls_2 bls_28 = blc_2.a().b(cyk_12.b());
                String string = cyk_12.c();
                if (bl) {
                    bls_28.a((short)(cyk_12.d() + 1));
                    bls_28.d(cyk_12.e());
                    bls_28.b(string);
                    bls_28.e(cyk_12.f());
                    cWG.a().a(bls_28);
                    if (!azu_0.j().c(cWG.a())) {
                        azu_0.j().a(cWG.a());
                    }
                    cdw_0.n().c(600130L);
                }
                if (bls_28.b().a()) {
                    aUh.b("chat.challenge.chaosEnded", new Object[0]);
                } else if (bl) {
                    String string2 = azu_0.j().k().dp();
                    if (string != null && string.length() > 0) {
                        if (!string2.equals(string)) {
                            aUh.b("chat.challenge.won", string, bls_28.m());
                        } else {
                            aUh.b("chat.challenge.selfComplete", bls_28.m());
                        }
                    } else {
                        aUh.b("chat.challenge.self.won", bls_28.m());
                    }
                }
                blo_1.e().a(eod_0.c);
                blo_1.e().i();
                bhy_2.a.b(cyk_12.b());
                return false;
            }
            case 13964: {
                cyn_1 cyn_12 = (cyn_1)adt_12;
                akx_2 akx_22 = akg_0.a().a(cyn_12.b(), false);
                blo_1.e().b(cyn_12.b());
                if (akx_22 != null) {
                    akx_22.n();
                }
                bhy_2.a.b(cyn_12.b());
                return false;
            }
            case 12852: {
                cyv_1 cyv_12 = (cyv_1)adt_12;
                akx_2 akx_23 = akg_0.a().a(cyv_12.c(), false);
                bls_2 bls_29 = blc_2.a().b(cyv_12.c());
                boolean bl = blo_1.e().n();
                if (bls_29 != null) {
                    if (bl && !bls_29.b().a()) {
                        aUh.b("chat.challenge.failed", bls_29.m());
                        bls_29.a((short)-2);
                        bls_29.d(-1);
                        bls_29.b((String)null);
                        bls_29.e(0);
                        bls_29.f(cyv_12.b());
                    }
                    bhy_2.a.b(bls_29.c());
                }
                if (akx_23 != null) {
                    akx_23.n();
                }
                return false;
            }
            case 12339: {
                cyi_1 cyi_12 = (cyi_1)adt_12;
                bls_2 bls_210 = blo_1.e().c();
                if (bls_210 != null) {
                    bls_210.a(cyi_12.b());
                }
                return false;
            }
            case 13431: {
                cup_1 cup_12 = (cup_1)adt_12;
                cgm_2.a(cup_12.d(), cup_12.c(), cup_12.e());
                return false;
            }
        }
        return true;
    }

    private void a(int n, int n2) {
        blc_2.a().a(n, new TIntArrayList(new int[]{n2}));
        blo_1.e().m();
    }

    public void a(bmr_0 bmr_02) {
        int n = blo_1.e().b();
        bMn bMn2 = (bMn)bMs.a.e(n);
        if (bMn2 != null) {
            bmr_02.a(bMn2);
            fgV.a.a(bmr_02);
        } else {
            b.error((Object)("R\u00e9ception d'un \u00e9venement de challenge pour un protecteur qu'on ne connait pas id=" + n + " eventType=" + bmr_02.getClass().getSimpleName()));
        }
    }

    @Override
    public long a_() {
        return 6L;
    }

    @Override
    public void a(long l) {
    }

    public static akx_2 a(epe_0 epe_02, int n, Map<String, Object> map) {
        String string = epe_02 == epe_0.b ? "genericIEActions/%d.lua" : "ie_actions/%d.lua";
        String string2 = String.format(string, n);
        return aks_1.a().a(string2, null, map, (ake_1)new cgn_1(string2), false);
    }
}

