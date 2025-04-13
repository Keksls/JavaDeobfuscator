/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from bvD
 */
public class bvd_2
extends TJ<exk_2> {
    private static final Logger c = Logger.getLogger(bvd_2.class);
    private final bnh_1 d;
    private bpu_2 e;
    private bva_2 f;

    public bvd_2(bnh_1 bnh_12) {
        this.d = bnh_12;
    }

    public bnh_1 k() {
        return this.d;
    }

    public boolean l() {
        return this.d.bo();
    }

    @Override
    public long g() {
        return this.d.a_();
    }

    @Override
    public String h() {
        return this.d.dp();
    }

    public bpu_2 m() {
        return this.e;
    }

    public void a(bpu_2 bpu_22) {
        this.e = bpu_22;
        this.d.a(bpu_22);
    }

    @Override
    public void a(Us us) {
        if (!this.l()) {
            return;
        }
        switch (us.c()) {
            case e: {
                Up up = (Up)us;
                fis_1.a().a("exchange.itemTrade", (Object)null);
                fis_1.a().a("exchange.remotePlayer");
                if (us.d().h() != tx_0.b) {
                    if (fpm_0.b().q("splitExchangeAmountOfCashDialog")) {
                        fpm_0.b().o("splitExchangeAmountOfCashDialog");
                    }
                    if (fpm_0.b().q("splitStackDialog")) {
                        fpm_0.b().o("splitStackDialog");
                    }
                    bvz_2.a.a(null);
                }
                switch (up.b()) {
                    case g: {
                        ty_0 ty_02 = us.d();
                        cmf_0 cmf_02 = new cmf_0();
                        cmf_02.a(ty_02.a());
                        cmf_02.a((byte)4);
                        azu_0.j().K().c(cmf_02);
                        break;
                    }
                    case b: 
                    case a: {
                        bvc_2 bvc_22 = (bvc_2)us.d();
                        fzm_0 fzm_02 = bvc_22.p();
                        if (fzm_02 == null) break;
                        fpm_0.b().o(fzm_02.a());
                        break;
                    }
                    case c: {
                        long l;
                        bvd_2 bvd_22;
                        bvc_2 bvc_23 = (bvc_2)us.d();
                        fzm_0 fzm_03 = bvc_23.p();
                        if (fzm_03 != null) {
                            fpm_0.b().o(fzm_03.a());
                        }
                        if ((bvd_22 = (bvd_2)bvc_23.a(l = us.e())) != bvc_23.f()) break;
                        aUh.b("exchange.declinedBy", bvd_22.h());
                        azu_0.j().b(cyc_0.d());
                        azu_0.j().b(cfp_1.a());
                        break;
                    }
                    case e: {
                        this.b(us);
                        aUh.b("exchange.locallyCanceled", new Object[0]);
                        break;
                    }
                    case d: {
                        this.b(us);
                        bvc_2 bvc_24 = (bvc_2)us.d();
                        bvd_2 bvd_23 = bvc_24.d(this);
                        aUh.b("exchange.canceledBy", bvd_23.h());
                        break;
                    }
                    case f: {
                        aUh.b("exchange.done", new Object[0]);
                        azu_0.j().b(cyc_0.d());
                        azu_0.j().b(cfp_1.a());
                        break;
                    }
                    case h: {
                        this.b(us);
                        aUh.a("exchange.failed", new Object[0]);
                    }
                }
                break;
            }
            case c: {
                bvc_2 bvc_25 = (bvc_2)us.d();
                bvc_25.p().g();
                azu_0.j().b(cye_0.a());
                fis_1.a().a("exchange.itemTrade", bvc_25);
                bvd_2 bvd_24 = bvc_25.d(this);
                fis_1.a().a("exchange.remotePlayer", bvd_24.d);
                this.f = new bva_2(bvc_25);
                if (!azu_0.j().c(cyc_0.d())) {
                    azu_0.j().a(cyc_0.d());
                }
                azu_0.j().a(cyc_0.d());
                azu_0.j().a(cfp_1.a());
                bua_0.a.a(new buw_2());
                c.info((Object)"Le joueur d?marre un ?change");
                break;
            }
            case b: {
                azu_0.j().a(cye_0.a());
                bvc_2 bvc_26 = (bvc_2)us.d();
                String string = bae.h().a("exchangeInvitation.messageIn", ((bvd_2)bvc_26.f()).h());
                fzm_0 fzm_04 = fpm_0.b().a(string, cfn_0.a(2), 18437L, 102, 2);
                if (fzm_04 != null) {
                    bvc_26.a(fzm_04);
                    fzm_04.a(new bve_2(this, bvc_26));
                    break;
                }
                dge_0 dge_02 = new dge_0();
                dge_02.b(bvc_26.a());
                add_2.b().a(dge_02);
                break;
            }
            case a: {
                azu_0.j().a(cye_0.a());
                bvc_2 bvc_27 = (bvc_2)us.d();
                bvd_2 bvd_25 = (bvd_2)bvc_27.e();
                blx_1 blx_12 = bmf_2.a().c(bvd_25.g());
                Object object = bae.h().a("exchangeInvitation.messageOut", bvd_25.h());
                cTz cTz2 = new cTz();
                cTz2.a(blx_12);
                String string = ((cSS)cTz2).h();
                if (string != null) {
                    object = (String)object + "\n" + string;
                }
                cTz2 = null;
                fzm_0 fzm_05 = fpm_0.b().a((String)object, cfn_0.a(2), 2073L, 102, 1);
                bvc_27.a(fzm_05);
                fzm_05.a(new bvf_2(this, bvc_27));
                break;
            }
            case d: {
                Uv uv = (Uv)us;
                bvc_2 bvc_28 = (bvc_2)uv.d();
                if (uv.e() == this.g()) {
                    switch (uv.b()) {
                        case d: {
                            if (fis_1.a().f("exchange.sourceBag") == null || fis_1.a().f("exchange.sourcePosition") == null) {
                                c.error((Object)"Impossible d'ajouter l'objet : le bag / position de la source n'ont pas \u00e9t\u00e9 sp\u00e9cifi\u00e9s");
                                return;
                            }
                            bmr_1 bmr_12 = (bmr_1)this.d;
                            Object object = fis_1.a().f("exchange.sourceBag").f();
                            if (object instanceof bHe) {
                                short s2 = -uv.h();
                                bmr_12.da().a(uv.f().a(), s2);
                                short s3 = fis_1.a().f("exchange.sourcePosition").j();
                                this.f.a(uv.f(), object, s3);
                            }
                            bvc_28.r();
                            fis_1.a().a("exchange.sourceBag");
                            fis_1.a().a("exchange.sourcePosition");
                            break;
                        }
                        case e: {
                            Object object = this.f.a((exk_2)uv.f(), uv.h());
                            if (object instanceof exq_2) {
                                cyt_0.a().i();
                            }
                            bvc_28.r();
                            break;
                        }
                        case c: {
                            if (uv instanceof eLJ) {
                                bvc_28.t();
                                fvE fvE2 = (fvE)fpm_0.b().h().d("exchangeDialog").a("localMoney");
                                azf_2 azf_22 = new azf_2(0.1f, 0.8f, 0.98f, 0.55f);
                                azf_2 azf_23 = new azf_2(azf_2.e.i());
                                fvE2.getAppearance().addTween(new fjp_2(azf_23, azf_22, fvE2.getAppearance(), 0, 100, 11, fjw_2.b));
                                break;
                            }
                            c.error((Object)"Impossible de mettre a jour le portefeuille du client : l'?v?nement re?u n'est pas de la classe WakfuItemExchangerModifiedEvent");
                            break;
                        }
                        case a: {
                            bmr_1 bmr_13 = (bmr_1)this.d;
                            bHi bHi2 = bmr_13.da();
                            Collection collection = bHi2.j();
                            block28: for (ts_0 ts_03 : uv.g()) {
                                for (exg_2 exg_22 : collection) {
                                    short s4 = exg_22.a(ts_03.a());
                                    if (s4 < 0) continue;
                                    this.f.a(ts_03, exg_22, s4);
                                    short s5 = -ts_03.e();
                                    exg_22.b(ts_03.a(), s5);
                                    continue block28;
                                }
                            }
                            bvc_28.r();
                            break;
                        }
                        case b: {
                            uv.g().forEach(ts_02 -> this.f.a((exk_2)ts_02, ts_02.e()));
                            cyt_0.a().i();
                            bvc_28.r();
                        }
                    }
                } else {
                    switch (uv.b()) {
                        case c: {
                            bvc_28.u();
                            fvE fvE3 = (fvE)fpm_0.b().h().d("exchangeDialog").a("remoteMoney");
                            azf_2 azf_24 = new azf_2(0.1f, 0.8f, 0.98f, 0.55f);
                            azf_2 azf_25 = new azf_2(azf_2.e.i());
                            fvE3.getAppearance().addTween(new fjp_2(azf_25, azf_24, fvE3.getAppearance(), 0, 50, 11, fjw_2.b));
                            if (!(uv instanceof eLJ)) break;
                            eLJ eLJ2 = (eLJ)uv;
                            this.a(bae.h().a("exchange.cashChanged", this.e.h().A().h(), eLJ2.k()));
                            break;
                        }
                        case d: 
                        case e: {
                            bvc_28.s();
                            exk_2 exk_22 = (exk_2)uv.f();
                            short s6 = uv.h();
                            String string = uv.b() == Ux.d ? "exchange.itemAdded" : "exchange.itemRemoved";
                            String string2 = bae.h().a(15, (long)exk_22.aT_(), new Object[0]);
                            this.a(bae.h().a(string, this.e.h().A().h(), s6, string2));
                            break;
                        }
                        case a: 
                        case b: {
                            String string = uv.b() == Ux.a ? "exchange.multiple.itemAdded" : "exchange.multiple.itemRemoved";
                            int n = uv.i();
                            if (n <= 0) break;
                            this.a(bae.h().a(string, this.e.h().A().h(), n));
                            bvc_28.s();
                        }
                    }
                }
                bvc_28.w();
                bvc_28.v();
                break;
            }
        }
    }

    private void a(String string) {
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)string).m();
        aUv aUv2 = (aUv)fis_1.a().d("chat", "exchangeDialog");
        if (aUv2 == null || aUv2.h() == null) {
            return;
        }
        aUv2.h().c("history", ani_22.r());
        ajg_1.a().a((ajf_1)aUv2.h(), "history");
    }

    private void b(Us us) {
        bvc_2 bvc_22 = (bvc_2)us.d();
        this.f.a(bvc_22);
        azu_0.j().b(cyc_0.d());
        azu_0.j().b(cfp_1.a());
    }

    public boolean n() {
        return false;
    }

    public void o() {
        if (this.e != null && this.d.eE() == this.e) {
            this.d.dN();
        }
        this.e = null;
    }

    @Override
    public void d() {
        super.d();
        this.o();
    }
}

