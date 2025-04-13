/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cgh
 */
public class cgh_2
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cgh_2.class);
    public static final cgh_2 b = new cgh_2();

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 13416: {
                this.a((cxz_2)adt_12);
                return false;
            }
            case 13639: {
                this.a((cxa_2)adt_12);
                return false;
            }
            case 13253: {
                this.a((cxb_2)adt_12);
                return false;
            }
            case 12151: {
                cxy_2 cxy_22 = (cxy_2)adt_12;
                bMn bMn2 = (bMn)bMs.a.e(cxy_22.b());
                if (bMn2 == null) {
                    bMn2 = bMs.a.a(cxy_22.b());
                }
                String string = bae.h().a(66, (long)bMn2.E().e(), new Object[0]);
                String string2 = bae.h().a("notification.protectorAcquiredTitle", new Object[0]);
                String string3 = cIg.createLink(bae.h().a("notification.protectorAcquiredText", string), blr_1.e, "1");
                dhc dhc2 = new dhc(string2, string3, blr_1.e, 600132);
                add_2.b().a(dhc2);
                return false;
            }
            case 12213: {
                cxe_2 cxe_22 = (cxe_2)adt_12;
                this.a(cxe_22);
                return false;
            }
            case 13371: {
                cxd_2 cxd_22 = (cxd_2)adt_12;
                this.a(cxd_22);
                return false;
            }
            case 13305: {
                cxg_2 cxg_22 = (cxg_2)adt_12;
                this.a(cxg_22);
                return false;
            }
            case 13715: {
                cxf_2 cxf_22 = (cxf_2)adt_12;
                this.a(cxf_22);
                return false;
            }
            case 12686: {
                cxw_2 cxw_22 = (cxw_2)adt_12;
                int n = cxw_22.b();
                bMn bMn3 = (bMn)bMs.a.e(cxw_22.c());
                if (bMn3 == null) {
                    a.error((Object)("Reponse pour la mise d'un protecteur inconnu de notre manager " + cxw_22.c()));
                    return false;
                }
                this.b(bMn3, n);
                return false;
            }
            case 12954: {
                cxx_2 cxx_22 = (cxx_2)adt_12;
                ArrayList<byte[]> arrayList = cxx_22.b();
                for (byte[] byArray : arrayList) {
                    ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
                    int n = bMy.a.b(byteBuffer);
                    bMn bMn4 = (bMn)bMs.a.e(n);
                    if (bMn4 != null) {
                        byteBuffer.rewind();
                        bMy.a.a(byteBuffer, bMn4);
                        continue;
                    }
                    a.error((Object)("Le protecteur ID (" + n + ") n'existe pas. Pas de mise \u00e0 jour, et pas de cr\u00e9ation."));
                }
                ble_1.E().L();
                return false;
            }
            case 13480: {
                cxc_2 cxc_22 = (cxc_2)adt_12;
                this.a(cxc_22);
                return false;
            }
        }
        return true;
    }

    private void a(cxc_2 cxc_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        bMn bMn2 = (bMn)bMs.a.e(cxc_22.b());
        bMq bMq2 = bMn2.y();
        bwe_2 bwe_22 = bMq2.a();
        int n = cxc_22.e();
        if (cxc_22.c()) {
            switch (cxc_22.d()) {
                case a: {
                    bwd_2 bwd_22 = bwe_22.a(n, true);
                    bMq2.k(n);
                    bMn2.l().c(fgo_0.c, bwd_22.k());
                    bmd_0 bmd_02 = (bmd_0)bwy_2.h().j().l();
                    bmd_02.a(bMn2).a();
                    bwd_22.m();
                    break;
                }
                case b: {
                    bwd_2 bwd_23 = bwe_22.a(n, false);
                    bMq2.l(n);
                    bMn2.l().c(fgo_0.c, bwd_23.k());
                    bmd_0 bmd_03 = (bmd_0)bwy_2.h().j().l();
                    bmd_03.a(bMn2).a();
                    bwd_23.m();
                    break;
                }
                case c: {
                    bwd_2 bwd_24 = bwe_22.a(n, true);
                    bMq2.m(n);
                    bwd_24.m();
                    break;
                }
                case d: {
                    bwd_2 bwd_25 = bwe_22.a(n, false);
                    bMq2.n(n);
                    bwd_25.m();
                    break;
                }
                case e: {
                    bwd_2 bwd_26 = bwe_22.a(n, true);
                    bMq2.a(bmr_12, n);
                    bMn2.l().c(fgo_0.c, bwd_26.l());
                    bRz bRz2 = bRC.c().a(n);
                    if (bRz2 != null) {
                        bRz2.a(true);
                    }
                    bwd_26.n();
                    bmd_0 bmd_04 = (bmd_0)bwy_2.h().j().l();
                    bmd_04.a(bMn2).a();
                    break;
                }
                case f: {
                    bwd_2 bwd_27 = bwe_22.a(n, false);
                    bMq2.b(bmr_12, n);
                    bMn2.l().c(fgo_0.c, bwd_27.l());
                    bRz bRz3 = bRD.c().a(n);
                    if (bRz3 != null) {
                        bRz3.a(true);
                    }
                    bwd_27.n();
                    bmd_0 bmd_05 = (bmd_0)bwy_2.h().j().l();
                    bmd_05.a(bMn2).a();
                    break;
                }
            }
        } else {
            a.warn((Object)("Le serveur a renvoy\u00e9 une erreur pour l'action " + cxc_22.d().name() + " pour le protecteur " + cxc_22.b() + " et la famille " + cxc_22.e()));
        }
        fzw_0.a.a("protectorEcosystemLock", true);
    }

    private void a(cxf_2 cxf_22) {
        int n = cxf_22.b();
        byte by = cxf_22.c();
        fgk_0 fgk_02 = fgk_0.a(by);
        bMn bMn2 = (bMn)bMs.a.e(n);
        bMn2.v().a(fgk_02);
        bnd_0 bnd_02 = (bnd_0)bmt_0.g.b();
        bnd_02.a(fgk_02);
        bnd_02.a(bMn2);
        fgV.a.a(bnd_02);
    }

    private void a(cxg_2 cxg_22) {
        int n = cxg_22.b();
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = bmr_12 != null && bmr_12.di() == bmr_12.dj();
        bMn bMn2 = !bl ? (bMn)bMs.a.e(n) : bwy_2.h().k();
        if (bMn2 == null) {
            a.error((Object)("R\u00e9ception de donn\u00e9es de taxe de protecteur pour un protecteur inconnu protectorId=" + n));
            return;
        }
        byte[] byArray = cxg_22.c();
        bMy.a.a(ByteBuffer.wrap(byArray), bMn2);
        fis_1.a().a((ajf_1)bwy_2.h(), "tax");
    }

    private void a(cxd_2 cxd_22) {
        int n = cxd_22.b();
        bMn bMn2 = (bMn)bMs.a.e(n);
        if (bMn2 == null) {
            a.error((Object)("R\u00e9ception de donn\u00e9es de gestion de protecteur pour un protecteur inconnu protectorId=" + n));
            return;
        }
        byte[] byArray = cxd_22.c();
        bMy.a.a(ByteBuffer.wrap(byArray), bMn2);
        byte[] byArray2 = cxd_22.d();
        if (byArray2 != null && byArray2.length > 0) {
            bre_0 bre_02 = new bre_0();
            bre_02.a(ByteBuffer.wrap(byArray2));
            brh_0.a().b(bre_02);
        }
        fis_1.a().a((ajf_1)bwy_2.h(), bwy_2.U);
    }

    private void b(bMn bMn2, int n) {
        String string = bae.h().a("protector.question.askMoneyToFight", n, bMn2.d());
        fzm_0 fzm_02 = fpm_0.b().a(string, cfn_0.a(0), 24L, 102, 0);
        fzm_02.a(new cgi_1(this, bMn2, n));
    }

    void a(bMn bMn2, int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.cq();
        if (l < (long)n) {
            aUh.a("protector.error.notEnoughMoneyToFight", new Object[0]);
            return;
        }
        bmv_1 bmv_12 = bMn2.m();
        if (bmv_12.ak()) {
            bwq_0 bwq_02 = bwo_1.a(bMn2);
            bwq_02.c();
            ema_1 ema_12 = bwq_02.ag_();
            if (ema_12 == ema_1.a) {
                return;
            }
            bQG.a();
            bQG.a(ema_12.a(), new Object[0]);
        } else {
            bmr_12.m(bmv_12);
        }
    }

    private void a(cxe_2 cxe_22) {
        int n = cxe_22.b();
        bMn bMn2 = (bMn)bMs.a.e(n);
        if (bMn2 != null) {
            bMs.a.a(bMn2.B(), cxe_22.c());
        } else {
            a.error((Object)("R\u00e9ception d'un \u00e9v\u00e9nement pour un protecteur inconnu id=" + cxe_22.b()));
        }
    }

    private void a(cxb_2 cxb_22) {
        bMn bMn2 = (bMn)bMs.a.e(cxb_22.b());
        if (bMn2 != null) {
            bmq_0 bmq_02 = (bmq_0)bmt_0.b.b();
            bmq_02.a(bMn2);
            bmq_02.a(null);
            fgV.a.a(bmq_02);
        } else {
            a.error((Object)("R\u00e9ception d'un \u00e9v\u00e9nement pour un protecteur inconnu id=" + cxb_22.b()));
        }
    }

    private void a(cxa_2 cxa_22) {
        bMn bMn2 = (bMn)bMs.a.e(cxa_22.b());
        if (bMn2 != null) {
            bMP bMP2 = (bMP)bmt_0.c.b();
            bMP2.a(bMn2);
            bMP2.a(fbc_0.a.a(cxa_22.c()));
            fgV.a.a(bMP2);
            String string = bae.h().a(66, (long)bMn2.E().e(), new Object[0]);
            String string2 = bae.h().a("notification.protectorLostTitle", new Object[0]);
            String string3 = cIg.createLink(bae.h().a("notification.protectorLostText", string), blr_1.e, "1");
            dhc dhc2 = new dhc(string2, string3, blr_1.e, 600132);
            add_2.b().a(dhc2);
        } else {
            a.error((Object)("R\u00e9ception d'un \u00e9v\u00e9nement pour un protecteur inconnu id=" + cxa_22.b()));
        }
    }

    private void a(cxz_2 cxz_22) {
        bMn bMn2 = (bMn)bMs.a.e(cxz_22.b());
        if (bMn2 != null) {
            bmj_0 bmj_02 = (bmj_0)bmt_0.a.b();
            bmj_02.a(bMn2);
            bmj_02.a(null);
            fgV.a.a(bmj_02);
        } else {
            a.error((Object)("R\u00e9ception d'un \u00e9v\u00e9nement pour un protecteur inconnu id=" + cxz_22.b()));
        }
    }

    private void a(cxy_2 cxy_22) {
        bMn bMn2 = (bMn)bMs.a.e(cxy_22.b());
        if (bMn2 != null) {
            bmj_0 bmj_02 = (bmj_0)bmt_0.a.b();
            bmj_02.a(bMn2);
            bmj_02.a(null);
            fgV.a.a(bmj_02);
        } else {
            a.error((Object)("R\u00e9ception d'un \u00e9v\u00e9nement pour un protecteur inconnu id=" + cxy_22.b()));
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

