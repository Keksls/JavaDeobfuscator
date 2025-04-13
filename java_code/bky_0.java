/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKy
 */
public class bky_0
implements ajh_1 {
    private final bkk_0 D = new bkk_0("entries");
    private final bkk_0 E = new bkk_0("offers");
    private final bLf F = new bLf(9);
    private final bLf G = new bLf(9);
    private final bLf H = new bLf(8);
    private final bLf I = new bLf(10);
    private final bLf J = new bLf(10);
    private final bLf K = new bLf(8);
    private final bLf L = new bLf(10);
    private final bLf M = new bLf(10);
    private final bLf N = new bLf(11);
    private final bkv_0 O = new bkv_0();
    private bKX P = null;
    private final bkt_0 Q = new bkt_0();
    private final bKp R = new bKp();
    private final bkr_0 S = new bkr_0();
    private final bkh_0 T = new bkh_0();
    private final List<bLd> U = new ArrayList<bLd>();
    private String V = "";
    public static final String a = "marketSearch";
    public static final String b = "marketOfferSearch";
    public static final String d = "onSaleEntriesSearch";
    public static final String e = "expiredEntriesSearch";
    public static final String f = "soldItemsSearch";
    public static final String g = "currentOffersSearch";
    public static final String h = "expiredOffersSearch";
    public static final String i = "purchasedItemsSearch";
    public static final String j = "marketHistorySearch";
    public static final String k = "mainSearchSelectedObject";
    public static final String l = "canSellItem";
    public static final String m = "sellItemBtnText";
    public static final String n = "canCreateOffer";
    public static final String o = "createOfferBtnText";
    public static final String p = "sellDurationList";
    public static final String q = "sellData";
    public static final String r = "itemToSell";
    public static final String s = "inventoryTypes";
    public static final String t = "allHistoryElementTypes";
    public static final String u = "selectedHistoryElementType";
    public static final String v = "allTimespans";
    public static final String w = "selectedTimespan";
    public static final String x = "createOfferData";
    public static final String[] y = new String[]{"marketSearch", "onSaleEntriesSearch", "expiredEntriesSearch", "expiredEntriesCount", "expiredEntriesCountText", "claimExpiredEntriesText", "kamasCount", "soldItemsCount", "soldItemsCountText", "claimKamasText", "itemToSell", "sellDurationList", "sellData", "inventoryTypes", "soldItemsSearch", "sellItemBtnText", "canSellItem", "mainSearchSelectedObject", "marketHistorySearch", "allHistoryElementTypes", "selectedHistoryElementType", "allTimespans", "selectedTimespan", "createOfferData", "canCreateOffer", "createOfferBtnText", "currentOffersSearch", "expiredOffersSearch", "purchasedItemsSearch"};
    public static final List<bLg> z = Arrays.stream(faO.values()).sorted(Comparator.comparing(faO::b)).map(bLg::new).collect(Collectors.toList());
    public static final bLg A = z.get(faO.a.a());
    private static final List<bKU> W = new ArrayList<bKU>();
    public static final bKU B = new bKU(null);
    private static final List<bLk> X;
    public static final bLk C;
    private static final bky_0 Y;

    public static bky_0 a() {
        return Y;
    }

    private bky_0() {
    }

    @Override
    public String[] d() {
        return y;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "marketSearch": {
                return this.F;
            }
            case "marketOfferSearch": {
                return this.G;
            }
            case "onSaleEntriesSearch": {
                return this.H;
            }
            case "soldItemsSearch": {
                return this.I;
            }
            case "expiredEntriesSearch": {
                return this.J;
            }
            case "currentOffersSearch": {
                return this.K;
            }
            case "expiredOffersSearch": {
                return this.L;
            }
            case "purchasedItemsSearch": {
                return this.M;
            }
            case "marketHistorySearch": {
                return this.N;
            }
            case "mainSearchSelectedObject": {
                return this.P;
            }
            case "soldItemsCount": 
            case "kamasCount": 
            case "soldItemsCountText": 
            case "claimKamasText": 
            case "expiredEntriesCount": 
            case "expiredEntriesCountText": 
            case "claimExpiredEntriesText": {
                return this.Q.b(string);
            }
            case "purchasedItemsCount": 
            case "purchasedItemsCountText": 
            case "retrievePurchasedItemsText": 
            case "expiredOffersCount": 
            case "expiredOffersCountText": 
            case "claimExpiredOffersText": {
                return this.R.b(string);
            }
            case "canSellItem": {
                return this.e();
            }
            case "sellItemBtnText": {
                return bae.h().a("market.offers.create.offer", this.Q.e(), 400);
            }
            case "canCreateOffer": {
                return this.g();
            }
            case "createOfferBtnText": {
                return bae.h().a("market.offers.create.purchase.offer", this.R.e(), 400);
            }
            case "sellData": {
                return this.S;
            }
            case "itemToSell": {
                return this.S.f();
            }
            case "sellDurationList": {
                return z;
            }
            case "inventoryTypes": {
                return this.U;
            }
            case "allHistoryElementTypes": {
                return W;
            }
            case "selectedHistoryElementType": {
                faJ faJ2 = daw.d().v().e();
                return faJ2 == null ? B : X.get(faJ2.a());
            }
            case "allTimespans": {
                return X;
            }
            case "selectedTimespan": {
                faP faP2 = daw.d().v().h();
                return faP2 == null ? C : X.get(faP2.a());
            }
            case "createOfferData": {
                return this.T;
            }
        }
        return null;
    }

    @NotNull
    public bkk_0 b() {
        if (daw.p()) {
            return this.D;
        }
        if (daw.q()) {
            return this.E;
        }
        throw new IllegalArgumentException("Invalid sub tab: " + fis_1.a().d("marketViewSearchSubTab"));
    }

    @NotNull
    public bLf c() {
        if (daw.p()) {
            return this.F;
        }
        if (daw.q()) {
            return this.G;
        }
        throw new IllegalArgumentException("Invalid sub tab: " + fis_1.a().d("marketViewSearchSubTab"));
    }

    public void a(bKX bKX2) {
        this.P = bKX2;
        fis_1.a().a((ajf_1)this, k);
    }

    public void a(exk_2 exk_22) {
        this.S.a(exk_22);
        fis_1.a().a((ajf_1)this, r);
        if (exk_22 != null) {
            fis_1.a().a((ajf_1)this, q);
        }
    }

    public void a(mq_0 mq_02) {
        this.F.a(mq_02.c(), mq_02.e().stream().map(mm_02 -> new bKT((mm_0)mm_02, mq_02.i())).collect(Collectors.toList()));
        fis_1.a().a((ajf_1)this, a);
    }

    public void a(mu_0 mu_02) {
        this.G.a(mu_02.c(), mu_02.e().stream().map(mq_12 -> new bKY((mq_1)mq_12, mu_02.i())).collect(Collectors.toList()));
        fis_1.a().a((ajf_1)this, b);
    }

    public void b(mq_0 mq_02) {
        this.H.a(mq_02.c(), mq_02.e().stream().map(mm_02 -> new bKT((mm_0)mm_02, mq_02.i())).collect(Collectors.toList()));
        this.Q.b(this.H.g());
        fis_1.a().a((ajf_1)this, d, l, m);
    }

    public void a(no no2) {
        this.I.a(no2.c(), no2.e().stream().map(bLa::new).collect(Collectors.toList()));
        fis_1.a().a((ajf_1)this, f);
    }

    public void c(mq_0 mq_02) {
        this.J.a(mq_02.c(), mq_02.e().stream().map(mm_02 -> new bKT((mm_0)mm_02, mq_02.i())).collect(Collectors.toList()));
        fis_1.a().a((ajf_1)this, e);
    }

    public void b(mu_0 mu_02) {
        this.K.a(mu_02.c(), mu_02.e().stream().map(mq_12 -> new bKY((mq_1)mq_12, mu_02.i())).collect(Collectors.toList()));
        this.R.c(this.K.g());
        fis_1.a().a((ajf_1)this, g, l, o);
    }

    public void c(mu_0 mu_02) {
        this.L.a(mu_02.c(), mu_02.e().stream().map(mq_12 -> new bKY((mq_1)mq_12, mu_02.i())).collect(Collectors.toList()));
        fis_1.a().a((ajf_1)this, h);
    }

    public void a(ne ne2) {
        this.M.a(ne2.c(), ne2.e().stream().map(bKZ::new).collect(Collectors.toList()));
        fis_1.a().a((ajf_1)this, i);
    }

    public void a(mk_0 mk_02) {
        this.N.a(mk_02.c(), mk_02.e().stream().map(mE2 -> new bKV((mE)mE2, mk_02.i())).collect(Collectors.toList()));
        fis_1.a().a((ajf_1)this, j);
    }

    public boolean e() {
        return this.Q.e() < 400 && this.z() < 800;
    }

    public boolean f() {
        return this.S.e() && fzw_0.a.d("marketSellViewLock");
    }

    private int z() {
        return this.H.g() + this.Q.b() + this.Q.f() + this.K.g() + this.R.b() + this.R.f();
    }

    public boolean g() {
        return this.R.e() < 400 && this.z() < 800;
    }

    public boolean h() {
        return this.T.e() && fzw_0.a.d("marketSellViewLock");
    }

    public void a(boolean bl) {
        this.F.f();
        this.G.f();
        this.H.f();
        this.I.f();
        this.J.f();
        this.K.f();
        this.L.f();
        this.M.f();
        this.N.f();
        this.O.i();
        this.D.c(bl);
        this.E.c(bl);
        this.A();
    }

    private void A() {
        this.U.clear();
        for (bhg_0 bhg_02 : bHJ.a().d()) {
            if (!bhg_02.k()) continue;
            this.U.add(new bLd(bhg_02));
        }
        this.U.add(new bLd(null));
        this.U.sort(bLd.a);
    }

    public void i() {
        HashMap hashMap = new HashMap();
        this.U.forEach(bLd2 -> {
            hashMap.put(bLd2.f(), bLd2);
            bLd2.b();
        });
        euu_2.a(azu_0.j().k().U_(), (TObjectObjectProcedure<epq_2, exk_2>)((TObjectObjectProcedure)(epq_22, exk_22) -> {
            if (daw.a(exk_22, epq_22)) {
                return true;
            }
            bhg_0 bhg_02 = (bhg_0)exk_22.T().F();
            while (bhg_02.f() != null) {
                bhg_02 = (bhg_0)bhg_02.f();
            }
            bLd bLd2 = (bLd)hashMap.get(bhg_02);
            if (bLd2 != null) {
                bLd2.a((exk_2)exk_22);
            } else {
                ((bLd)hashMap.get(null)).a((exk_2)exk_22);
            }
            return true;
        }));
        this.U.forEach(bLd2 -> bLd2.a(this.V));
        fis_1.a().a((ajf_1)this, s);
    }

    public void a(String string) {
        String string2 = Cz.e(string);
        if (string2.equals(this.V)) {
            return;
        }
        this.V = string2;
        this.U.forEach(bLd2 -> bLd2.a(this.V));
        fis_1.a().a((ajf_1)this, s);
    }

    public void a(Comparator<exk_2> comparator) {
        this.U.forEach(bLd2 -> bLd2.a(comparator));
        fis_1.a().a((ajf_1)this, s);
    }

    public bkk_0 j() {
        return this.D;
    }

    public bkk_0 k() {
        return this.E;
    }

    public bLf l() {
        return this.F;
    }

    public bLf m() {
        return this.G;
    }

    public bLf n() {
        return this.H;
    }

    public bLf o() {
        return this.I;
    }

    public bLf p() {
        return this.J;
    }

    public bLf q() {
        return this.K;
    }

    public bLf r() {
        return this.L;
    }

    public bLf s() {
        return this.M;
    }

    public bLf t() {
        return this.N;
    }

    public bkv_0 u() {
        return this.O;
    }

    public bkt_0 v() {
        return this.Q;
    }

    public bKp w() {
        return this.R;
    }

    public bkr_0 x() {
        return this.S;
    }

    public bkh_0 y() {
        return this.T;
    }

    static {
        W.add(B);
        for (faJ faJ2 : faJ.values()) {
            W.add(new bKU(faJ2));
        }
        X = Arrays.stream(faP.values()).sorted(Comparator.comparing(faP::b)).map(bLk::new).collect(Collectors.toList());
        C = X.get(faP.e.a());
        Y = new bky_0();
    }
}

