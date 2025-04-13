/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.awt.Point;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class daw
extends cVb {
    private static final Logger k = Logger.getLogger(daw.class);
    public static final String b = "marketWindow";
    public static final String c = "sellItemView";
    private static final String l = "createOfferView";
    private static final String m = "offerItemChoiceSearch";
    public static final String d = "priceSellItemTE";
    private static final String n = "offerUnitPriceTE";
    private static final int o = 821;
    private static final int p = 468;
    public static final byte e = 0;
    public static final byte f = 1;
    public static final byte g = 2;
    public static final byte h = 99;
    public static final int i = 0;
    public static final int j = 1;
    private static final daw q = new daw();
    private static final Map<Long, faF> r = new HashMap<Long, faF>();
    private final faC s = new fax_0();
    private final faC t = new faA();
    private final faC u = new fax_0();
    private final faB v = new faB();
    private final faB w = new faB();
    private final faC x = new faA();
    private final faB y = new faB();
    private final faB z = new faB();
    private final fay_0 A = new fay_0();
    private final bKm B = new bKm();
    private boolean C = true;
    private final ans_1 D = string -> {
        if ("marketDialog".equals(string)) {
            azu_0.j().b(q);
        }
        if ("marketFulfillOfferDialog".equals(string)) {
            fis_1.a().a("marketOfferFulfillment", (Object)null);
            daw.D();
            r.clear();
        }
        if ("marketOfferItemChoiceDialog".equals(string)) {
            bhc_1.a().b();
        }
    };

    private daw() {
    }

    public static daw d() {
        return q;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17251: {
                dfc dfc2 = (dfc)adt_12;
                byte by = dfc2.b();
                fis_1.a().a("marketViewTab", by);
                switch (by) {
                    case 1: {
                        this.A();
                        daw.g();
                        fis_1.a().a("marketSellItemMode", false);
                        fis_1.a().a("marketCreateOfferMode", false);
                        break;
                    }
                    case 0: {
                        this.a(this.B().j());
                        break;
                    }
                    case 2: {
                        this.j(this.A.j());
                        break;
                    }
                }
                return false;
            }
            case 18494: {
                int n2;
                String string2;
                String string3;
                dfc dfc3 = (dfc)adt_12;
                int n3 = dfc3.c();
                fis_1.a().a("marketViewSearchSubTab", n3);
                if (n3 == 0) {
                    string3 = "marketAdvancedOfferFiltersDialog";
                    string2 = "marketAdvancedFiltersDialog";
                    n2 = -353;
                } else if (n3 == 1) {
                    string3 = "marketAdvancedFiltersDialog";
                    string2 = "marketAdvancedOfferFiltersDialog";
                    n2 = 353;
                } else {
                    return false;
                }
                if (fpm_0.b().q(string3)) {
                    Point point = ((fvk_0)fpm_0.b().k(string3)).getPosition();
                    fpm_0.b().o(string3);
                    fvk_0 fvk_02 = (fvk_0)fpm_0.b().a(string2, cfi_0.a(string2), 163968L, (short)10000);
                    fvk_02.setPosition(point.x, point.y + n2);
                }
                return false;
            }
            case 17067: {
                dfc dfc4 = (dfc)adt_12;
                fis_1.a().a("marketViewMyOffersSubTab", dfc4.c());
                this.B.a();
                this.A();
                return false;
            }
            case 19404: {
                this.a(bky_0.a().c().a());
                return false;
            }
            case 16686: {
                this.a(bky_0.a().c().b());
                return false;
            }
            case 17154: {
                dfc dfc5 = (dfc)adt_12;
                bKT bKT2 = (bKT)dfc5.j();
                int n4 = dfc5.c();
                cpb cpb2 = new cpb();
                cpb2.a(bKT2.a());
                cpb2.b(n4);
                azu_0.j().K().c(cpb2);
                return false;
            }
            case 19496: {
                dgS dgS2 = (dgS)adt_12;
                faC faC2 = this.B();
                daw.a(faC2, dgS2.k());
                this.a(faC2.j());
                return false;
            }
            case 16434: {
                String string4;
                if (daw.p()) {
                    string4 = "marketAdvancedFiltersDialog";
                } else if (daw.q()) {
                    string4 = "marketAdvancedOfferFiltersDialog";
                } else {
                    return false;
                }
                if (fpm_0.b().q(string4)) {
                    fpm_0.b().o(string4);
                } else {
                    fpm_0.b().a(string4, cfi_0.a(string4), 163840L, (short)10000);
                }
                return false;
            }
            case 19249: {
                dgX dgX2 = (dgX)adt_12;
                List<bKH> list = dgX2.k();
                bkk_0 bkk_02 = bky_0.a().b();
                list.forEach(bKH2 -> {
                    bkk_02.b((bKH)bKH2);
                    bKH2.a(this.B());
                });
                this.a(0);
                return false;
            }
            case 19771: {
                dgU dgU2 = (dgU)adt_12;
                bkk_0 bkk_03 = bky_0.a().b();
                for (bKH bKH3 : dgU2.o()) {
                    bkk_03.c(bKH3);
                    bKH3.c(this.B());
                }
                if (dgU2.k()) {
                    this.a(0);
                }
                return false;
            }
            case 18994: {
                dgV dgV2 = (dgV)adt_12;
                bkk_0 bkk_04 = bky_0.a().b();
                boolean bl = false;
                for (bKG bKG2 : dgV2.k()) {
                    Collection<bKH> collection = bkk_04.b(bKG2);
                    if (collection.isEmpty()) continue;
                    bl = true;
                    collection.forEach(bKH2 -> {
                        bkk_04.c((bKH)bKH2);
                        bKH2.c(this.B());
                    });
                }
                if (bl) {
                    this.a(0);
                }
                return false;
            }
            case 17565: {
                bky_0.a().b().a(this.B());
                this.a(0);
                return false;
            }
            case 18733: {
                bHp bHp2 = ((dgT)adt_12).k();
                bHp2.ak_();
                return false;
            }
            case 16939: {
                dgW dgW2 = (dgW)adt_12;
                bLl bLl2 = dgW2.k();
                if (bLl2.e() == dgW2.o()) {
                    return false;
                }
                bLl2.a(dgW2.o());
                bkk_0 bkk_05 = bky_0.a().b();
                bKQ bKQ2 = new bKQ(bLl2, () -> {
                    if (bLl2.e()) {
                        bLl2.a(false);
                        bkk_05.j();
                    }
                });
                if (bLl2.e()) {
                    bkk_05.a(bKQ2);
                    bKQ2.a(this.B());
                } else {
                    bkk_05.c(bKQ2);
                    bKQ2.c(this.B());
                }
                bkk_05.j();
                this.a(0);
                return false;
            }
            case 16988: {
                boolean bl = ((anw_1)adt_12).i();
                bkk_0 bkk_06 = bky_0.a().b();
                bKR bKR2 = (bKR)bkk_06.a(bKG.i);
                bkk_06.a();
                bkk_06.a(bl);
                bKR bKR3 = bkk_06.b(bl);
                bKR3.a(this.B());
                if (!bKR3.equals(bKR2)) {
                    this.a(0);
                }
                return false;
            }
            case 16303: {
                bky_0.a().b().k();
                bKR.g().c(this.B());
                this.a(0);
                return false;
            }
            case 19988: {
                bky_0.a().b().d(((dfc)adt_12).i());
                bky_0.a().b().b(bKG.k).forEach(bKH2 -> bKH2.a(this.B()));
                this.b(0);
                return false;
            }
            case 17963: {
                bKG bKG3 = (bKG)((Object)((dfc)adt_12).j());
                bky_0.a().j().b(bKG3).forEach(bKH2 -> bKH2.a(this.s));
                bky_0.a().k().b(bKG3).forEach(bKH2 -> bKH2.a(this.t));
                return false;
            }
            case 16938: {
                dfc dfc6 = (dfc)adt_12;
                this.a(dfc6.i(), true);
                return false;
            }
            case 18553: {
                dfc dfc7 = (dfc)adt_12;
                Comparator comparator = (Comparator)dfc7.j();
                bky_0.a().a(comparator);
                return false;
            }
            case 17378: {
                dgQ dgQ2 = (dgQ)adt_12;
                exk_2 exk_22 = dgQ2.k();
                if (daw.a(exk_22)) {
                    Object t = euu_2.d(bhh_1.b(), exk_22.a());
                    if (t != null) {
                        k.warn((Object)"Cannot put equipment up for sale");
                        aUh.a("market.cannot.add.equipment", new Object[0]);
                    } else {
                        k.warn((Object)("Cannot put up item " + exk_22.aT_() + " for sale"));
                        aUh.a("market.addItem.unauthorized", new Object[0]);
                    }
                    return false;
                }
                this.a(true, false);
                bky_0.a().a(exk_22);
                daw.a(dgQ2.o());
                return false;
            }
            case 18479: {
                bky_0.a().a((exk_2)null);
                return false;
            }
            case 19079: {
                if (!bky_0.a().f()) {
                    return false;
                }
                daw.x();
                return false;
            }
            case 16046: {
                bLg bLg2 = ((dgR)adt_12).k();
                bky_0.a().x().a(bLg2);
                return false;
            }
            case 17604: {
                bky_0.a().u().b();
                return false;
            }
            case 16010: {
                bky_0.a().u().e();
                return false;
            }
            case 16683: {
                dgS dgS3 = (dgS)adt_12;
                bky_0.a().u().a(dgS3.k());
                return false;
            }
            case 17862: {
                bky_0.a().u().c();
                return false;
            }
            case 19807: {
                bky_0.a().u().f();
                return false;
            }
            case 19034: {
                dgS dgS4 = (dgS)adt_12;
                bky_0.a().u().b(dgS4.k());
                return false;
            }
            case 17038: {
                String string5 = ((dfc)adt_12).h();
                this.u.a(string5.isBlank() ? null : string5).a(daw.u());
                this.d(bky_0.a().n().e());
                return false;
            }
            case 18656: {
                this.d(bky_0.a().n().a());
                return false;
            }
            case 17400: {
                this.d(bky_0.a().n().b());
                return false;
            }
            case 18123: {
                dgS dgS5 = (dgS)adt_12;
                daw.a(this.u, dgS5.k());
                this.d(this.u.j());
                return false;
            }
            case 19161: {
                bKT bKT3 = (bKT)((dfc)adt_12).j();
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("market.removeItemConfirmation", new Object[0]), cfn_0.a(0), 25L, 102, 1);
                fzm_02.a((int n, String string) -> {
                    if (n == 8) {
                        fzw_0.a.a("marketRetrieveLock", false);
                        cpi_0 cpi_02 = new cpi_0(bKT3.e());
                        azu_0.j().K().c(cpi_02);
                    }
                });
                return false;
            }
            case 18786: {
                dgS dgS6 = (dgS)adt_12;
                daw.a(this.v, dgS6.k());
                this.e(this.v.j());
                return false;
            }
            case 16381: {
                fzw_0.a.a("marketRetrieveLock", false);
                azu_0.j().K().c(new coH());
                return false;
            }
            case 19879: {
                daw.a("marketSoldItemsDetailDialog", () -> this.e(0));
                return false;
            }
            case 17556: {
                this.e(bky_0.a().o().a());
                return false;
            }
            case 19232: {
                this.e(bky_0.a().o().b());
                return false;
            }
            case 16461: {
                dgS dgS7 = (dgS)adt_12;
                daw.a(this.w, dgS7.k());
                this.f(this.w.j());
                return false;
            }
            case 18576: {
                fzw_0.a.a("marketRetrieveLock", false);
                bKT bKT4 = (bKT)((dfc)adt_12).j();
                azu_0.j().K().c(new cpg_0(bKT4.e()));
                return false;
            }
            case 18463: {
                fzw_0.a.a("marketRetrieveLock", false);
                azu_0.j().K().c(new cpg_0());
                return false;
            }
            case 17675: {
                daw.a("marketExpiredEntriesDetailDialog", () -> this.f(0));
                return false;
            }
            case 16859: {
                this.f(bky_0.a().p().a());
                return false;
            }
            case 18058: {
                this.f(bky_0.a().p().b());
                return false;
            }
            case 17110: {
                if (fpm_0.b().q("marketOfferItemChoiceDialog")) {
                    return false;
                }
                bky_0.a().y().a("");
                fpm_0.b().a("marketOfferItemChoiceDialog", cfi_0.a("marketOfferItemChoiceDialog"), 385L, (short)10000);
                return false;
            }
            case 16550: {
                dfc dfc8 = (dfc)adt_12;
                bky_0.a().y().a(dfc8.h());
                return false;
            }
            case 19686: {
                dfc dfc9 = (dfc)adt_12;
                boolean bl = dfc9.i();
                this.a(bl);
                if (bl) {
                    bky_0.a().y().a((bjw_1)dfc9.j());
                    fyb_0 fyb_02 = fpm_0.b().h().d("marketDialog").a("createOfferModeMainInnerContainer");
                    fyb_02.addChildrenAddedListener(new dax_0(this, fyb_02));
                    bhc_1.a().b();
                } else {
                    this.f();
                }
                if (fpm_0.b().q("marketOfferItemChoiceDialog")) {
                    fpm_0.b().o("marketOfferItemChoiceDialog");
                }
                return false;
            }
            case 16283: {
                dfc dfc10 = (dfc)adt_12;
                boolean bl = dfc10.i();
                boolean bl2 = dfc10.c() == 1;
                bky_0.a().y().c();
                bky_0.a().y().c(bl);
                if (bl2) {
                    bky_0.a().y().m().a((String)null);
                    bky_0.a().y().a((bLj)null);
                }
                return false;
            }
            case 16864: {
                bky_0.a().y().b(false);
                return false;
            }
            case 19376: {
                if (!bky_0.a().h()) {
                    return false;
                }
                daw.y();
                return false;
            }
            case 16014: {
                exk_2 exk_23 = (exk_2)((dfc)adt_12).j();
                bkn_0 bkn_02 = daw.C();
                if (bkn_02 == null) {
                    return false;
                }
                if (daw.a(exk_23)) {
                    return false;
                }
                bkn_02.a(exk_23);
                return false;
            }
            case 19179: {
                exk_2 exk_24 = (exk_2)((dfc)adt_12).j();
                bkn_0 bkn_03 = daw.C();
                if (bkn_03 == null) {
                    return false;
                }
                bkn_03.b(exk_24);
                return false;
            }
            case 17990: {
                bKY bKY2 = (bKY)((dfc)adt_12).j();
                fis_1.a().a("marketOfferFulfillment", new bkn_0(bKY2));
                fvk_0 fvk_03 = (fvk_0)fpm_0.b().a("marketFulfillOfferDialog", cfi_0.a("marketFulfillOfferDialog"), 131200L, (short)10000);
                fxu_0 fxu_02 = new fxu_0();
                fxu_02.a("level", new fxw_0(bkn_0.k));
                fxu_02.a("shards", new fxw_0(bkn_0.l));
                fxu_02.a("quantity", new fxw_0(bkn_0.j));
                fxu_02.b();
                fuc_0 fuc_02 = (fuc_0)fvk_03.getElementMap().a("selectedItemsTable");
                fuc_02.setTableModel(fxu_02);
                r.clear();
                daw.D();
                return false;
            }
            case 18974: {
                bkn_0 bkn_04 = daw.C();
                if (bkn_04 == null || !bkn_04.c()) {
                    return false;
                }
                coJ coJ2 = new coJ();
                coJ2.a(bkn_04.e().e().c());
                bkn_04.a((bko_0 bko_02) -> coJ2.a(bko_02.b(), bko_02.h().a(), bko_02.c()));
                azu_0.j().K().c(coJ2);
                fzw_0.a.a("marketFulfillOfferLock", false);
                return false;
            }
            case 17234: {
                bkn_0 bkn_05 = daw.C();
                if (bkn_05 == null) {
                    return false;
                }
                bkn_05.b();
                return false;
            }
            case 19714: {
                String string6 = ((dfc)adt_12).h();
                this.x.a(string6.isBlank() ? null : string6).a(daw.u());
                this.g(bky_0.a().q().e());
                return false;
            }
            case 18320: {
                this.g(bky_0.a().q().a());
                return false;
            }
            case 16515: {
                this.g(bky_0.a().q().b());
                return false;
            }
            case 16773: {
                dgS dgS8 = (dgS)adt_12;
                daw.a(this.x, dgS8.k());
                this.g(this.x.j());
                return false;
            }
            case 17754: {
                bKY bKY3 = (bKY)((dfc)adt_12).j();
                fzm_0 fzm_03 = fpm_0.b().a(bae.h().a("market.cancel.offer.confirmation", new Object[0]), cfn_0.a(0), 25L, 102, 1);
                fzm_03.a((int n, String string) -> {
                    if (n == 8) {
                        fzw_0.a.a("marketRetrieveLock", false);
                        coz coz2 = new coz(bKY3.e().c());
                        azu_0.j().K().c(coz2);
                    }
                });
                return false;
            }
            case 16250: {
                daw.a("marketExpiredOffersDetailDialog", () -> this.h(0));
                return false;
            }
            case 16463: {
                this.h(bky_0.a().r().a());
                return false;
            }
            case 18492: {
                this.h(bky_0.a().r().b());
                return false;
            }
            case 16346: {
                dgS dgS9 = (dgS)adt_12;
                daw.a(this.y, dgS9.k());
                this.h(this.y.j());
                return false;
            }
            case 16105: {
                fzw_0.a.a("marketRetrieveLock", false);
                azu_0.j().K().c(new cpd_0());
                return false;
            }
            case 19826: {
                daw.a("marketPurchasedItemsDetailDialog", () -> this.i(0));
                return false;
            }
            case 18652: {
                this.i(bky_0.a().s().a());
                return false;
            }
            case 17994: {
                this.i(bky_0.a().s().b());
                return false;
            }
            case 17046: {
                dgS dgS10 = (dgS)adt_12;
                daw.a(this.z, dgS10.k());
                this.i(this.z.j());
                return false;
            }
            case 19033: {
                fzw_0.a.a("marketRetrieveLock", false);
                bKZ bKZ2 = (bKZ)((dfc)adt_12).j();
                cpk_0 cpk_02 = new cpk_0(bKZ2.e());
                azu_0.j().K().c(cpk_02);
                return false;
            }
            case 19116: {
                fzw_0.a.a("marketRetrieveLock", false);
                azu_0.j().K().c(new cpk_0());
                return false;
            }
            case 18912: {
                this.j(bky_0.a().t().a());
                return false;
            }
            case 19229: {
                this.j(bky_0.a().t().b());
                return false;
            }
            case 16084: {
                dgS dgS11 = (dgS)adt_12;
                daw.a(this.A, dgS11.k());
                this.j(this.A.j());
                return false;
            }
            case 16559: {
                this.j(bky_0.a().t().a(0));
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        super.a(aav_22, bl);
        if (bl) {
            return;
        }
        azu_0.j().b(dei.a());
        ans_0.D().e().a(bKl.a, true);
        fis_1.a().a("marketViewTab", (byte)0);
        fis_1.a().a("marketView", bky_0.a());
        fis_1.a().a("marketTableModels", bkw_0.a());
        fis_1.a().a("marketEntryFilters", bky_0.a().j());
        fis_1.a().a("marketOfferFilters", bky_0.a().k());
        fis_1.a().a("marketViewSearchSubTab", 0);
        fis_1.a().a("marketViewMyOffersSubTab", 0);
        fis_1.a().a("marketSellItemMode", false);
        fis_1.a().a("marketCreateOfferMode", false);
        fis_1.a().a("marketSimilarSearches", bky_0.a().u());
        fis_1.a().a("marketOfferCreationData", bky_0.a().y());
        fis_1.a().a("marketOfferFulfillment", (Object)null);
        fis_1.a().a("marketOptions", new bLc());
        fzw_0.a.b("marketSearchesLock");
        fzw_0.a.b("marketSellViewLock");
        fzw_0.a.b("marketFulfillOfferLock");
        fzw_0.a.b("marketRetrieveLock");
        fpm_0.b().a(this.D);
        fvk_0 fvk_02 = (fvk_0)fpm_0.b().a("marketDialog", cfi_0.a("marketDialog"), 32768L, (short)10000);
        daw.b(fvk_02);
        fpm_0.b().a("wakfu.market", cHE.class);
        cdw_0.n().c(600012L);
        boolean bl2 = bLc.a(bWe.aZ);
        bky_0.a().a(bl2);
        bky_0.a().a((exk_2)null);
        bky_0.a().a("");
        if (this.C || !bl2) {
            this.s.a();
            this.A.a();
            this.t.a();
            daw.a(bky_0.a().j(), this.s, true);
            daw.a(bky_0.a().k(), this.t, false);
            this.z();
        }
        this.u.a();
        this.x.a();
        this.b(0);
        this.c(0);
        this.C = false;
    }

    @Override
    protected boolean a() {
        return true;
    }

    @Override
    protected boolean c() {
        return bLc.a(bWe.aY);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        super.b(aav_22, bl);
        if (bl) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null) {
            bmr_12.dN();
        }
        bky_0.a().a(bLc.a(bWe.aZ));
        this.w();
        azu_0.j().a(dei.a());
        ans_0.D().e().a(bKl.a);
        cdw_0.n().c(600013L);
        fzw_0.a.c("marketSearchesLock");
        fzw_0.a.c("marketSellViewLock");
        fzw_0.a.c("marketFulfillOfferLock");
        fzw_0.a.c("marketRetrieveLock");
        r.clear();
    }

    private void w() {
        fpm_0.b().b(this.D);
        fpm_0.b().o("marketDialog");
        fpm_0.b().o("marketAdvancedFiltersDialog");
        fpm_0.b().o("marketAdvancedOfferFiltersDialog");
        fpm_0.b().o("marketConfirmPurchaseDialog");
        fpm_0.b().o("marketSoldItemsDetailDialog");
        fpm_0.b().o("marketExpiredEntriesDetailDialog");
        fpm_0.b().o("marketOfferItemChoiceDialog");
        fpm_0.b().o("marketFulfillOfferDialog");
        fpm_0.b().o("marketPurchasedItemsDetailDialog");
        fpm_0.b().o("marketExpiredOffersDetailDialog");
        fpm_0.b().e("wakfu.market");
    }

    private static void b(fvk_0 fvk_02) {
        fyy_0 fyy_02 = fpm_0.b().h().d("inventoryDialog");
        if (fyy_02 == null) {
            return;
        }
        fvk_0 fvk_03 = (fvk_0)fyy_02.a("equipInventWindow");
        if (fvk_03 == null) {
            return;
        }
        fvk_02.a(new day_0(fvk_02, fvk_03));
    }

    private static void a(String string, Runnable runnable) {
        if (fpm_0.b().q(string)) {
            fpm_0.b().o(string);
        } else {
            fpm_0.b().a(string, cfi_0.a(string), 32768L, (short)10000);
            runnable.run();
        }
    }

    private static void x() {
        bkr_0 bkr_02 = bky_0.a().x();
        String string2 = bae.h().a("market.sell.confirmation", bkr_02.i(), bkr_02.f().N(), bkr_02.a(), bkr_02.a() * (long)bkr_02.i(), bkr_02.o());
        fzm_0 fzm_02 = fpm_0.b().a(string2, cfn_0.a(0), 7L, 102, 1);
        fzm_02.a((int n, String string) -> {
            if (n != 2) {
                return;
            }
            if (!bky_0.a().f()) {
                return;
            }
            fzw_0.a.a("marketSellViewLock", false);
            cox cox2 = new cox();
            cox2.a(bkr_02.f().a());
            cox2.a((short)bkr_02.i());
            cox2.b(bkr_02.a());
            cox2.a(bkr_02.j().a());
            azu_0.j().K().c(cox2);
        });
    }

    private static void y() {
        bkh_0 bkh_02 = bky_0.a().y();
        String string2 = bae.h().a("market.create.offer.confirmation", bkh_02.i(), bkh_02.h().e(), bkh_02.a(), bkh_02.a() * (long)bkh_02.i(), bkh_02.o(), bkh_02.a() * (long)bkh_02.i() + bkh_02.o());
        fzm_0 fzm_02 = fpm_0.b().a(string2, cfn_0.a(0), 7L, 102, 1);
        fzm_02.a((int n, String string) -> {
            if (n != 2) {
                return;
            }
            if (!bky_0.a().h()) {
                return;
            }
            fzw_0.a.a("marketSellViewLock", false);
            coF coF2 = new coF();
            coF2.a(bkh_02.f());
            azu_0.j().K().c(coF2);
        });
    }

    private static void a(bkk_0 bkk_02, faC faC2, boolean bl) {
        bkl_0 bkl_02 = new bkl_0(true, bl ? "market.filter.only.cheapest" : "market.filter.only.most.expensive", bkk_02);
        bkk_02.a(bkl_02);
        bkl_02.a(faC2);
        fis_1.a().a((ajf_1)bkk_02, "onlyExtremePrice");
        if (eag_0.a(bhh_1.b())) {
            bKJ bKJ2 = new bKJ(0, 50, bkk_02);
            bkk_02.a(bKJ2);
            bKJ2.a(faC2);
            fis_1.a().a((ajf_1)bkk_02, "minLevel", "maxLevel");
        }
    }

    private void z() {
        this.A.a(faM.g);
        this.A.a(false);
        this.A.a(bky_0.B.a());
        fis_1.a().a((ajf_1)bky_0.a(), "selectedHistoryElementType");
        this.A.a(bky_0.C.a());
        fis_1.a().a((ajf_1)bky_0.a(), "selectedTimespan");
    }

    private void a(boolean bl, boolean bl2) {
        fis_1.a().a("marketSellItemMode", bl);
        if (bl) {
            bky_0.a().i();
            if (bl2) {
                bky_0.a().a(bky_0.a().x().f());
            }
        } else {
            this.e();
        }
    }

    private static void a(@Nullable fug_0 fug_02) {
        if (fug_02 != null) {
            daw.b(fug_02);
        } else {
            ado_1.a().a(() -> {
                fug_0 fug_02;
                fyb_0 fyb_03 = fpm_0.b().k("marketDialog");
                fug_0 fug_03 = fug_02 = fyb_03 == null ? null : (fug_0)fyb_03.getElementRecursively(d, fyb_02 -> !fyb_02.isATemplate());
                if (fug_02 != null) {
                    daw.b(fug_02);
                }
            }, 50L, 1);
        }
    }

    private static void b(@NotNull fug_0 fug_02) {
        fug_02.setFocused(true);
        if (!Cz.f(fug_02.getText())) {
            fug_02.setEnabled(false);
            ado_1.a().a(() -> {
                fug_02.setEnabled(true);
                fug_02.a();
            }, 100L, 1);
        }
    }

    private void a(boolean bl) {
        fis_1.a().a("marketCreateOfferMode", bl);
        if (!bl) {
            this.f();
        }
    }

    public void e() {
        this.d(bky_0.a().n().e());
        daw.g();
    }

    public void f() {
        this.g(bky_0.a().q().e());
        daw.g();
    }

    public void a(int n) {
        if (daw.p()) {
            this.b(n);
        } else if (daw.q()) {
            this.c(n);
        }
    }

    public void b(int n) {
        this.a(n, false);
    }

    public void a(int n, boolean bl) {
        this.s.c(n);
        if (!this.B.a(this.s) && !bl) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        coD coD2 = new coD(faK.b);
        coD2.a(this.s);
        azu_0.j().K().c(coD2);
    }

    public void c(int n) {
        this.b(n, false);
    }

    public void b(int n, boolean bl) {
        this.t.c(n);
        if (!this.B.a(this.t) && !bl) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        coC coC2 = new coC(faK.d);
        coC2.a(this.t);
        azu_0.j().K().c(coC2);
    }

    private void A() {
        if (daw.r()) {
            this.d(0);
        } else if (daw.s()) {
            this.g(0);
        }
    }

    public void d(int n) {
        this.c(n, false);
    }

    public void c(int n, boolean bl) {
        this.u.c(n);
        if (!this.B.a(this.u) && !bl) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        coS coS2 = new coS(this.u);
        azu_0.j().K().c(coS2);
    }

    public static void g() {
        azu_0.j().K().c(new coW());
    }

    public void e(int n) {
        this.d(n, false);
    }

    public void d(int n, boolean bl) {
        this.v.c(n);
        if (!this.B.a(this.v) && !bl) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        coy_0 coy_02 = new coy_0(this.v);
        azu_0.j().K().c(coy_02);
    }

    public void f(int n) {
        this.e(n, false);
    }

    public void e(int n, boolean bl) {
        this.w.c(n);
        if (!this.B.a(this.w) && !bl) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        coNN coNN2 = new coNN(this.w);
        azu_0.j().K().c(coNN2);
    }

    public void g(int n) {
        this.f(n, false);
    }

    public void f(int n, boolean bl) {
        this.x.c(n);
        if (!this.B.a(this.x) && !bl) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        coL coL2 = new coL(this.x);
        azu_0.j().K().c(coL2);
    }

    public void h(int n) {
        this.g(n, false);
    }

    public void g(int n, boolean bl) {
        this.y.c(n);
        if (!this.B.a(this.y) && !bl) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        coP coP2 = new coP(this.y);
        azu_0.j().K().c(coP2);
    }

    public void i(int n) {
        this.h(n, false);
    }

    public void h(int n, boolean bl) {
        this.z.c(n);
        if (!this.B.a(this.z) && !bl) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        coU coU2 = new coU(this.z);
        azu_0.j().K().c(coU2);
    }

    private void j(int n) {
        this.A.c(n);
        if (!this.B.a(this.A)) {
            return;
        }
        fzw_0.a.a("marketSearchesLock", false);
        cpm_0 cpm_02 = new cpm_0();
        cpm_02.a(this.A);
        azu_0.j().K().c(cpm_02);
    }

    public static boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(bhh_1.b(), exk_22.a());
        if (bmr_12 == null) {
            return true;
        }
        return daw.a(exk_22, bmr_12);
    }

    public static boolean a(exk_2 exk_22, @NotNull epq_2 epq_22) {
        if (exk_22.aa() && exk_22.n().a().b() || exk_22.ab()) {
            return true;
        }
        if (exk_22.G() == exw_1.i) {
            return true;
        }
        return exk_22.T().a(exz_1.e) != null && !exk_22.T().a(exz_1.e).b(epq_22, epq_22.P_(), exk_22, epq_22.ge());
    }

    public static void a(faB faB2, faM faM2) {
        faM faM3 = faB2.k();
        if (faM2 == faM3) {
            faB2.a(!faB2.l());
        } else {
            faB2.a(faM2);
            faB2.a(true);
            if (faM2 == faM.c) {
                faB2.d(daw.u().c());
            } else {
                faB2.d(-1);
            }
        }
    }

    private faC B() {
        if (daw.p()) {
            return this.s;
        }
        if (daw.q()) {
            return this.t;
        }
        throw new IllegalArgumentException("Invalid sub tab: " + fis_1.a().d("marketViewSearchSubTab"));
    }

    @Nullable
    private static bkn_0 C() {
        return (bkn_0)fis_1.a().e("marketOfferFulfillment");
    }

    public static boolean b(exk_2 exk_22) {
        if (!fpm_0.b().q("marketFulfillOfferDialog")) {
            return false;
        }
        bkn_0 bkn_02 = (bkn_0)fis_1.a().e("marketOfferFulfillment");
        if (bkn_02 == null) {
            return false;
        }
        return bkn_02.a(exk_22.a()) || daw.a(exk_22, bkn_02.e().e()) != faF.a;
    }

    public static faF a(exk_2 exk_22, mq_1 mq_12) {
        faF faF2 = r.get(exk_22.a());
        if (faF2 != null) {
            return faF2;
        }
        faF faF3 = faD.a(exk_22, mq_12);
        r.put(exk_22.a(), faF3);
        return faF3;
    }

    private static void D() {
        TLongHashSet tLongHashSet = euw_2.a.e(bhh_1.b());
        for (long l : tLongHashSet.toArray()) {
            Object t = euw_2.a.d(l);
            ((epq_2)t).dS().a((TObjectProcedure<exk_2>)((TObjectProcedure)exk_22 -> {
                fis_1.a().a((ajf_1)exk_22, "movable");
                return true;
            }));
        }
    }

    public static void h() {
        if (daw.k()) {
            fis_1.a().a((ajf_1)bky_0.a().x(), bky_0.a().x().d());
        } else if (daw.m()) {
            fis_1.a().a((ajf_1)bky_0.a().y(), bky_0.a().y().d());
        }
    }

    public static boolean i() {
        return fis_1.a().d("marketViewTab") == 0;
    }

    public static boolean j() {
        return fis_1.a().d("marketViewTab") == 1;
    }

    public static boolean k() {
        return daw.j() && fis_1.a().c("marketSellItemMode");
    }

    public static boolean l() {
        return daw.j() && !fis_1.a().c("marketSellItemMode");
    }

    public static boolean m() {
        return daw.j() && fis_1.a().c("marketCreateOfferMode");
    }

    public static boolean n() {
        return daw.j() && !fis_1.a().c("marketCreateOfferMode");
    }

    public static boolean o() {
        return fis_1.a().d("marketViewTab") == 2;
    }

    public static boolean p() {
        return daw.i() && fis_1.a().d("marketViewSearchSubTab") == 0;
    }

    public static boolean q() {
        return daw.i() && fis_1.a().d("marketViewSearchSubTab") == 1;
    }

    public static boolean r() {
        return daw.j() && fis_1.a().d("marketViewMyOffersSubTab") == 0;
    }

    public static boolean s() {
        return daw.j() && fis_1.a().d("marketViewMyOffersSubTab") == 1;
    }

    public static boolean t() {
        return fis_1.a().d("marketViewTab") == 99;
    }

    public static Ow u() {
        Ow ow = bae.h().f();
        return ow.f() ? ow : Ow.o;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public fay_0 v() {
        return this.A;
    }
}

