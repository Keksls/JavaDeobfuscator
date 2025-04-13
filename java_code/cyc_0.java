/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cYC
 */
public class cyc_0
extends cVb {
    private static final cyc_0 b = new cyc_0();
    private static final Logger c = Logger.getLogger(cyc_0.class);
    private boolean d;
    ans_1 e;

    public static cyc_0 d() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12 instanceof adh_2) {
            fis_1.a().a("exchange.valid", true);
            adi_2.a().a(this);
            return false;
        }
        switch (adt_12.a()) {
            case 17060: {
                dgi_0 dgi_02 = (dgi_0)adt_12;
                cmk_0 cmk_02 = new cmk_0();
                cmk_02.a(dgi_02.k());
                azu_0.j().K().c(cmk_02);
                fis_1.a().a((ajf_1)azu_0.j().k(), "states");
                return false;
            }
            case 17489: {
                dgg_0 dgg_02;
                if (fpm_0.b().q("splitStackDialog")) {
                    fpm_0.b().o("splitStackDialog");
                }
                if (fpm_0.b().q("splitExchangeAmountOfCashDialog")) {
                    fpm_0.b().o("splitExchangeAmountOfCashDialog");
                }
                if ((dgg_02 = (dgg_0)adt_12).k().isEmpty()) {
                    return false;
                }
                cmd_0 cmd_02 = new cmd_0();
                cmd_02.a(dgg_02.o());
                for (exk_2 exk_22 : dgg_02.k()) {
                    cmd_02.b(exk_22.a());
                }
                azu_0.j().K().c(cmd_02);
                return false;
            }
            case 17119: {
                dgf_0 dgf_02;
                exk_2 exk_23;
                if (fis_1.a().f("exchange.sourceBag") == null || fis_1.a().f("exchange.sourcePosition") == null) {
                    c.error((Object)"Impossible d'ajouter l'objet : le bag / position de la source n'ont pas \u00e9t\u00e9 sp\u00e9cifi\u00e9s");
                    return false;
                }
                if (fpm_0.b().q("splitStackDialog")) {
                    fpm_0.b().o("splitStackDialog");
                }
                if (fpm_0.b().q("splitExchangeAmountOfCashDialog")) {
                    fpm_0.b().o("splitExchangeAmountOfCashDialog");
                }
                if (!this.a(exk_23 = (dgf_02 = (dgf_0)adt_12).o())) {
                    aUh.a("exchange.itemUnexchangeable", new Object[0]);
                    return false;
                }
                long l = exk_23.a();
                bmr_1 bmr_12 = azu_0.j().k();
                if (!bmr_12.da().j(l)) {
                    for (brn brn2 : bmr_12.cU()) {
                        bqU bqU2;
                        if (brn2 == null || brn2.c() || (bqU2 = (bqU)cxo_0.c(brn2.f())) == null || !bqU2.m().d(l)) continue;
                        aUh.a("exchange.itemFromCompanion", new Object[0]);
                        break;
                    }
                    return false;
                }
                cmc_0 cmc_02 = new cmc_0();
                cmc_02.b(dgf_02.p());
                cmc_02.a(l);
                cmc_02.a((short)dgf_02.k());
                azu_0.j().K().c(cmc_02);
                this.e();
                return false;
            }
            case 19955: {
                if (fpm_0.b().q("splitStackDialog")) {
                    fpm_0.b().o("splitStackDialog");
                }
                if (fpm_0.b().q("splitExchangeAmountOfCashDialog")) {
                    fpm_0.b().o("splitExchangeAmountOfCashDialog");
                }
                dgg_0 dgg_03 = (dgg_0)adt_12;
                cmi_0 cmi_02 = new cmi_0(dgg_03.o());
                for (exk_2 exk_24 : dgg_03.k()) {
                    cmi_02.a(exk_24.a());
                }
                azu_0.j().K().c(cmi_02);
                this.e();
                return false;
            }
            case 18612: {
                if (fpm_0.b().q("splitStackDialog")) {
                    fpm_0.b().o("splitStackDialog");
                }
                if (fpm_0.b().q("splitExchangeAmountOfCashDialog")) {
                    fpm_0.b().o("splitExchangeAmountOfCashDialog");
                }
                dgf_0 dgf_03 = (dgf_0)adt_12;
                cmh_0 cmh_02 = new cmh_0();
                cmh_02.b(dgf_03.p());
                cmh_02.a(dgf_03.o().a());
                cmh_02.a((short)dgf_03.k());
                azu_0.j().K().c(cmh_02);
                this.e();
                return false;
            }
            case 19652: {
                bvz_2.a.b().g(((dfc)adt_12).d());
                return false;
            }
            case 16707: {
                dgh_0 dgh_02 = (dgh_0)adt_12;
                bmr_1 bmr_13 = azu_0.j().k();
                bvc_2 bvc_22 = bvz_2.a.b();
                long l = bvc_22.B();
                bvd_2 bvd_22 = (bvd_2)bvc_22.a(bmr_13.a_());
                long l2 = bvd_22.f();
                if (l2 == l) {
                    return false;
                }
                long l3 = bmr_13.cq() + l2;
                if (l3 < l) {
                    l = l3;
                }
                cmj_0 cmj_02 = new cmj_0();
                cmj_02.a(l);
                cmj_02.b(dgh_02.k());
                azu_0.j().K().c(cmj_02);
                this.e();
                bvd_22.d(l);
                fis_1.a().a((ajf_1)bvc_22, "kamaValueHasChanged");
                return false;
            }
            case 19027: {
                dfc dfc2 = (dfc)adt_12;
                long l = dfc2.d();
                cme_0 cme_02 = new cme_0();
                cme_02.a(l);
                azu_0.j().K().c(cme_02);
                return false;
            }
        }
        return true;
    }

    public boolean a(exk_2 exk_22) {
        return !exk_22.ab() && (exk_22.T().a(exz_1.e) == null || exk_22.T().a(exz_1.e).b(azu_0.j().k(), azu_0.j().k().P_(), exk_22, azu_0.j().k().ge()));
    }

    public void e() {
        if (!azu_0.j().c(this)) {
            return;
        }
        fis_1.a().a("exchange.valid", false);
        adi_2.a().a(this);
        adi_2.a().a(this, 5000L, 0);
    }

    public boolean f() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    void g() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            c.error((Object)"on tente d'annuler l'\u00e9change mais le joueur n'existe d\u00e9j\u00e0 plus");
            return;
        }
        bvc_2 bvc_22 = bvz_2.a.b();
        if (bvc_22 != null) {
            cme_0 cme_02 = new cme_0();
            cme_02.a(bvc_22.a());
            azu_0.j().K().c(cme_02);
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        Object object;
        ajf_1 ajf_12;
        super.a(aav_22, bl);
        if (bl) {
            return;
        }
        fis_1.a().a("exchange.valid", true);
        this.e = new cyd_0(this);
        fpm_0.b().a(this.e);
        fvk_0 fvk_02 = (fvk_0)fpm_0.b().a("exchangeDialog", cfi_0.a("exchangeDialog"), 32785L, (short)10000);
        if (fvk_02 == null) {
            c.error((Object)("Impossible de r\u00e9cup\u00e9rer la fen\u00eatre d'\u00e9change !!! loaded=" + fpm_0.b().q("exchangeDialog")));
        } else {
            this.a(fvk_02);
        }
        if (this.a && (ajf_12 = bzf_1.a()) != null) {
            object = bzg_1.a.a((bnh_1)ajf_12);
            fis_1.a().a("characterSheet", object, "inventoryDialog");
            dfc dfc2 = new dfc(16198);
            dfc2.a(((epq_2)((Object)ajf_12)).a_());
            add_2.b().a(dfc2);
        }
        azu_0.j().b(dei.a());
        azu_0.j().b(cyq_0.a);
        azu_0.j().b(cXC.a());
        azu_0.j().b(dhI.a());
        cyt_0.a().d();
        dan.a().d();
        fis_1.a().a("equipment.can.transfer.bag", true);
        fpm_0.b().a("wakfu.exchange", cGS.class);
        ajf_12 = bvz_2.a.b();
        object = new dfc();
        ((anw_1)object).a_(18741);
        ((anw_1)object).a(((bvc_2)ajf_12).A().h());
        add_2.b().a((adt_1)object);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            dey.a();
            if (fpm_0.b().q("splitStackDialog")) {
                fpm_0.b().o("splitStackDialog");
            }
            adi_2.a().a(this);
            fpm_0.b().o("exchangeDialog");
            this.d = false;
            fis_1.a().a("equipment.can.transfer.bag", false);
            fpm_0.b().e("wakfu.exchange");
            if (azu_0.j().k() == null) {
                return;
            }
            azu_0.j().a(dei.a());
        }
    }
}

