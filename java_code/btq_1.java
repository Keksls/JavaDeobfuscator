/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListByKeyCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListByKeyRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$cancelCallback
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$cancelRequest
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$getRateCallback
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$getRateRequest
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$listBidsCallback
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$listBidsRequest
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$listCallback
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$listRequest
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$sellCallback
 *  com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi$sellRequest
 *  com.ankama.haapi.client.okhttp.wakfu.model.OgrineToken
 *  com.ankama.haapi.client.okhttp.wakfu.model.Rate
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.ArticleApi
 *  com.ankama.shopi.client.model.ArticleByKeyRequest
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.threeten.bp.DateTimeUtils
 *  org.threeten.bp.Instant
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList;
import com.ankama.haapi.client.okhttp.wakfu.api.OgrineTokenApi;
import com.ankama.haapi.client.okhttp.wakfu.model.OgrineToken;
import com.ankama.haapi.client.okhttp.wakfu.model.Rate;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.ArticleApi;
import com.ankama.shopi.client.model.ArticleByKeyRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.threeten.bp.DateTimeUtils;
import org.threeten.bp.Instant;

/*
 * Renamed from bTq
 */
public class btq_1
implements ajh_1 {
    static final Logger b = Logger.getLogger(btq_1.class);
    private static final Timer d = new Timer();
    private static final String e = "mode";
    private static final String f = "offersList";
    private static final String g = "bestOffer";
    private static final String h = "price";
    private static final String i = "averagePrice";
    private static final String j = "averagePriceText";
    private static final String k = "lastRefreshDelayText";
    private static final String l = "ownPendingStoneAmount";
    private static final String m = "ownPendingStoneAmountText";
    private static final String n = "ownOffersCheckboxValue";
    private static final String o = "canBuyBestOffer";
    private static final String p = "canBuyBestOfferText";
    private static final String q = "notificationMessage";
    private static final String r = "exchangeConversionStoneText";
    private static final String s = "exchangeKamasText";
    private static final String t = "canPurchaseStone";
    public static final int a = 6000;
    private static final Date u = new Date(2019, 10, 1, 10, 0, 0);
    private static final wt_0 v = new wt_0(0, 0, 10, 1, 11, 2019);
    private final List<OgrineToken> w = new ArrayList<OgrineToken>();
    private final List<btp_1> x = new ArrayList<btp_1>();
    btv_0 y;
    private long z;
    private long A;
    private Rate B = new Rate();
    private bss_0<?, ?> C;
    private bss_0<?, ?> D;
    private java.time.Instant E = java.time.Instant.now();
    TimerTask F;
    private boolean G;
    private boolean H;
    String I;

    @Override
    public String[] d() {
        return new String[]{e, f, g, h, i, j, k, l, m, n, o, p, q, r, s};
    }

    public void a() {
        if (this.C == null) {
            this.a((List<bss_0<?, ?>> list) -> {
                this.C = this.a((List<bss_0<?, ?>>)list, "CONVERSION_STONE");
            }, "CONVERSION_STONE");
        }
        if (this.D == null) {
            this.a((List<bss_0<?, ?>> list) -> {
                this.D = this.a((List<bss_0<?, ?>>)list, "CONVERSION_STONE_MULTI");
            }, "CONVERSION_STONE_MULTI");
        }
        this.m();
        this.l();
    }

    private bss_0<?, ?> a(List<bss_0<?, ?>> list, String string) {
        for (bss_0<?, ?> bss_02 : list) {
            if (bss_02 == null || !Objects.equals(bss_02.b(), string)) continue;
            return bss_02;
        }
        return null;
    }

    private void k() {
        if (this.F != null) {
            this.F.cancel();
        }
        this.F = new btr_1(this);
        d.scheduleAtFixedRate(this.F, 1000L, 1000L);
    }

    public void a(btp_1 btp_12) {
        Optional<OgrineToken> optional = btp_12.b();
        if (optional.isEmpty()) {
            return;
        }
        OgrineToken ogrineToken = optional.get();
        Long l = ogrineToken.getId();
        OgrineTokenApi.cancelRequest cancelRequest2 = OgrineTokenApi.cancelRequest().tokenId(l);
        OgrineTokenApi.cancelCallback cancelCallback2 = OgrineTokenApi.cancelCallback().on204(apiResponse -> {
            this.l();
            this.e();
            this.a("webShop.conversion.stone.cancel.success.message", false);
        }).on403(apiResponse -> {
            b.error((Object)("Error cancelling offer of conversion stone, tokenId : " + l + " : " + apiResponse));
            this.a("webShop.conversion.stone.cancel.error.message", true);
        }).on404(apiResponse -> {
            b.error((Object)("Error cancelling offer of conversion stone, tokenId : " + l + " : " + apiResponse));
            this.a("webShop.conversion.stone.cancel.error.message", true);
        }).on422(apiResponse -> {
            b.error((Object)("Error cancelling offer of conversion stone, tokenId : " + l + " : " + apiResponse));
            this.a("webShop.conversion.stone.cancel.error.message", true);
        }).onDefault(apiResponse -> {
            b.error((Object)("Error cancelling offer of conversion stone, tokenId : " + l + " : " + (String)apiResponse.getData()));
            this.a("webShop.conversion.stone.cancel.error.message", true);
        }).onException(throwable -> {
            b.error((Object)("Error cancelling offer of conversion stone, tokenId : " + l), throwable);
            this.a("webShop.conversion.stone.cancel.error.message", true);
        });
        WakfuClient.d().sendAsync((ApiCallback.Request)cancelRequest2, (ApiCallback.Callback)cancelCallback2);
    }

    public void a(long l) {
        this.z = l;
        fis_1.a().a((ajf_1)this, h);
    }

    public void b(long l) {
        if (this.w.isEmpty()) {
            return;
        }
        if (l <= 0L) {
            this.a("webShop.conversion.stone.price.cant.be.zero", true);
            return;
        }
        Optional<OgrineToken> optional = this.w.stream().filter(ogrineToken -> ogrineToken.getSellingPrice() == null).findFirst();
        optional.ifPresent(ogrineToken -> this.a(l, (OgrineToken)ogrineToken));
    }

    private void a(long l, OgrineToken ogrineToken) {
        if (l < this.A / 2L || l > this.A * 2L) {
            String string2 = bae.h().a("webShop.conversion.stone.warning.sell.price", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 0, string2, 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a((int n, String string) -> {
                if (n == 8) {
                    this.a(ogrineToken, l);
                }
            });
        } else {
            this.a(ogrineToken, l);
        }
    }

    private void a(OgrineToken ogrineToken, long l) {
        long l2 = enp_2.a.b(ens_2.ay);
        this.w.remove(ogrineToken);
        OgrineTokenApi.sellRequest sellRequest2 = OgrineTokenApi.sellRequest().tokenId(ogrineToken.getId()).serverId(Long.valueOf(l2)).price(Long.valueOf(l));
        OgrineTokenApi.sellCallback sellCallback2 = OgrineTokenApi.sellCallback().on204(apiResponse -> {
            this.l();
            this.a("webShop.conversion.stone.sell.success.message", false);
        }).onDefault(apiResponse -> {
            this.l();
            this.a("webShop.conversion.stone.sell.error.message", true);
            b.error((Object)("Error requesting to sell conversion stone, price : " + l + " : " + (String)apiResponse.getData()));
        }).onException(throwable -> {
            this.l();
            this.a("webShop.conversion.stone.sell.error.message", true);
            b.error((Object)("Error requesting to sell conversion stone, price : " + l), throwable);
        });
        WakfuClient.d().sendAsync((ApiCallback.Request)sellRequest2, (ApiCallback.Callback)sellCallback2);
    }

    private void l() {
        OgrineTokenApi.listRequest listRequest2 = OgrineTokenApi.listRequest();
        OgrineTokenApi.listCallback listCallback2 = OgrineTokenApi.listCallback().on200(apiResponse -> {
            this.w.clear();
            this.w.addAll((Collection)apiResponse.getData());
            fis_1.a().a((ajf_1)this, l, m, r);
            this.w.stream().filter(ogrineToken -> ogrineToken.getSellingPrice() == null).findFirst().ifPresent(ogrineToken -> {
                Date date = DateTimeUtils.toDate((Instant)ogrineToken.getAddedDate().toInstant());
                Date date2 = bae.f(date);
                if (date2.after(u)) {
                    return;
                }
                this.a("webShop.conversion.stone.sell.price.changed", false);
            });
        }).on403(apiResponse -> b.error((Object)("Error requesting own conversion stones : " + apiResponse))).on404(apiResponse -> b.error((Object)("Error requesting own conversion stones : " + apiResponse))).onDefault(apiResponse -> b.error((Object)("Error requesting own conversion stones : " + (String)apiResponse.getData()))).onException(throwable -> b.error((Object)("Error requesting own conversion stones : " + throwable)));
        WakfuClient.d().sendAsync((ApiCallback.Request)listRequest2, (ApiCallback.Callback)listCallback2);
    }

    public void b() {
        this.m();
        this.l();
    }

    public void c() {
        this.m();
        this.e();
    }

    private void m() {
        long l = enp_2.a.b(ens_2.ay);
        OgrineTokenApi.getRateRequest getRateRequest2 = OgrineTokenApi.getRateRequest().serverId(Long.valueOf(l));
        OgrineTokenApi.getRateCallback getRateCallback2 = OgrineTokenApi.getRateCallback().on200(apiResponse -> {
            this.B = (Rate)apiResponse.getData();
            this.n();
            this.z = this.A;
            fis_1.a().a((ajf_1)this, h);
        }).onDefault(apiResponse -> b.error((Object)("ApiError " + apiResponse.getStatusCode() + " requesting average conversion stone price " + (String)apiResponse.getData()))).onException(throwable -> b.error((Object)"ApiError requesting average conversion stone price", throwable));
        WakfuClient.d().sendAsync((ApiCallback.Request)getRateRequest2, (ApiCallback.Callback)getRateCallback2);
    }

    private void n() {
        if (this.B.getAvgLast30d() == null || this.w.isEmpty()) {
            return;
        }
        this.w.stream().filter(ogrineToken -> ogrineToken.getSellingPrice() == null).findFirst().ifPresent(ogrineToken -> {
            this.A = ogrineToken.getOgrineQuantity() * this.B.getAvgLast30d().longValue();
        });
        fis_1.a().a((ajf_1)this, i, j);
    }

    public void e() {
        this.G = false;
        fis_1.a().a((ajf_1)this, n);
        long l = enp_2.a.b(ens_2.ay);
        OgrineTokenApi.listBidsRequest listBidsRequest2 = OgrineTokenApi.listBidsRequest().serverId(Long.valueOf(l)).page(Long.valueOf(1L)).resultsPerPage(Long.valueOf(20L));
        OgrineTokenApi.listBidsCallback listBidsCallback2 = OgrineTokenApi.listBidsCallback().on200(apiResponse -> this.a((List)apiResponse.getData())).onDefault(apiResponse -> b.error((Object)("ApiError requesting conversion stone bids : " + (String)apiResponse.getData()))).onException(throwable -> b.error((Object)"ApiError requesting conversion stone bids", throwable));
        WakfuClient.d().sendAsync((ApiCallback.Request)listBidsRequest2, (ApiCallback.Callback)listBidsCallback2);
    }

    public void a(Consumer<List<bss_0<?, ?>>> consumer, String string) {
        if (cbj_1.a()) {
            ArticleApi articleApi = new ArticleApi(WakfuClient.e());
            try {
                ArticleByKeyRequest articleByKeyRequest = new ArticleByKeyRequest().key(string);
                if (WakfuClient.a.n().p()) {
                    b.info((Object)("[SHOPI-DEBUG] getArticleByKey with following request : " + articleByKeyRequest));
                }
                articleApi.getArticleByKeyAsync(cbj_1.b(), cbj_1.a, articleByKeyRequest, (ApiCallback)new bts_1(this, consumer));
            }
            catch (ApiException apiException) {
                b.error((Object)"Following error occured during getArticleByKey request", (Throwable)apiException);
            }
        } else {
            ShopApi.articlesListByKeyRequest articlesListByKeyRequest2 = ShopApi.articlesListByKeyRequest().key(Collections.singletonList(string));
            ShopApi.articlesListByKeyCallback articlesListByKeyCallback2 = ShopApi.articlesListByKeyCallback().on200(apiResponse -> {
                List<bss_0<?, ?>> list = bty_1.a(((ShopArticlesList)apiResponse.getData()).getArticles());
                if (list == null || list.isEmpty()) {
                    return;
                }
                consumer.accept(list);
            }).onDefault(apiResponse -> b.error((Object)("Error requesting" + string + " article : " + (String)apiResponse.getData()))).onException(throwable -> b.error((Object)("Error requesting " + string + " article"), throwable));
            WakfuClient.c().sendAsync((ApiCallback.Request)articlesListByKeyRequest2, (ApiCallback.Callback)articlesListByKeyCallback2);
        }
    }

    public void b(btp_1 btp_12) {
        if (this.H) {
            return;
        }
        if (!bsp_2.b()) {
            this.a("webShop.conversion.stone.error.message.conditions.not.met", true);
            return;
        }
        this.H = true;
        fis_1.a().a((ajf_1)this, o, p);
        Optional<OgrineToken> optional = btp_12.a();
        if (optional.isEmpty()) {
            return;
        }
        cln_1 cln_12 = new cln_1(optional.get().getId(), btp_12.c());
        azu_0.j().K().c(cln_12);
    }

    public void a(long l, boolean bl, eza_2 eza_22) {
        this.H = false;
        this.c();
        ddO.a().f().n();
        this.a(this.a(bl, eza_22), !bl);
    }

    private String a(boolean bl, eza_2 eza_22) {
        switch (eza_22) {
            case b: {
                if (!bl) {
                    return "webShop.conversion.stone.error.message.relayed";
                }
                throw new IllegalStateException("We received a state RELAYED with success true on conversion stone buy result");
            }
            case c: {
                if (!bl) {
                    return "webShop.conversion.stone.error.message.requested";
                }
                throw new IllegalStateException("We received a state REQUESTED with success true on conversion stone buy result");
            }
            case d: {
                if (!bl) {
                    return "webShop.conversion.stone.error.message.booked";
                }
                throw new IllegalStateException("We received a state BOOKED with success true on conversion stone buy result");
            }
            case e: {
                if (!bl) {
                    return "webShop.conversion.stone.error.message.paid";
                }
                throw new IllegalStateException("We received a state PAID with success true on conversion stone buy result");
            }
            case h: {
                if (!bl) {
                    return "webShop.conversion.stone.error.message.conditions.not.met";
                }
                throw new IllegalStateException("We received a state NOT_ELIGIBLE with success true on conversion stone buy result");
            }
            case g: {
                return "webShop.conversion.stone.buy.success.message";
            }
        }
        return "webShop.conversion.stone.error.message.generic";
    }

    public void f() {
        this.l();
        if (this.y == btv_0.c) {
            this.b();
        }
    }

    public void a(String string, boolean bl) {
        String string2;
        if (string == null || string.isEmpty()) {
            this.I = null;
            fis_1.a().a((ajf_1)this, q);
            return;
        }
        this.I = string2 = new ani_2().a().a(bl ? azf_2.i : azf_2.k).a((CharSequence)bae.h().a(string, new Object[0])).r();
        fis_1.a().a((ajf_1)this, q);
        new Timer().schedule((TimerTask)new btt_0(this, string2), 6000L);
    }

    public void g() {
        if (this.C == null) {
            this.a("webShop.conversion.stone.error.message.no.article", true);
            return;
        }
        ddO.a().a(this.C);
    }

    public void h() {
        if (this.D == null) {
            this.a("webShop.conversion.stone.error.message.no.article", true);
            return;
        }
        ddO.a().a(this.D);
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(e)) {
            return this.y.a();
        }
        if (string.equals(f)) {
            return this.x;
        }
        if (string.equals(g)) {
            return this.x.isEmpty() ? btw_0.a : this.x.get(0);
        }
        if (string.equals(h)) {
            return bae.h().a(this.z);
        }
        if (string.equals(i)) {
            return this.A;
        }
        if (string.equals(j)) {
            return bae.h().a("webShop.conversion.stone.average.price", this.A);
        }
        if (string.equals(k)) {
            long l = Duration.between(this.E, java.time.Instant.now()).getSeconds();
            return bae.h().a("webShop.conversion.stone.last.refresh.delay", l);
        }
        if (string.equals(l)) {
            return this.p();
        }
        if (string.equals(m)) {
            return bae.h().a("webShop.conversion.stone.own.pending.amount", this.p());
        }
        if (string.equals(n)) {
            return this.G ? 1 : 0;
        }
        if (string.equals(o)) {
            if (this.x.isEmpty()) {
                return false;
            }
            if (this.H) {
                return false;
            }
            return this.o();
        }
        if (string.equals(p)) {
            if (this.x.isEmpty()) {
                return bae.h().a("webShop.conversion.stone.no.sale", new Object[0]);
            }
            if (this.H) {
                return bae.h().a("webShop.conversion.stone.pending.buy.request", new Object[0]);
            }
            return this.o() ? "" : bae.h().a("webShop.conversion.stone.not.enough.kama", new Object[0]);
        }
        if (string.equals(q)) {
            return this.I;
        }
        if (string.equals(r)) {
            return bae.h().a("webShop.conversion.stone.exchange.stone.available", this.p());
        }
        if (string.equals(s) && azu_0.j().k() != null) {
            return bae.h().a("webShop.conversion.stone.exchange.kamas.available", azu_0.j().k().dK().a());
        }
        if (string.equals(t)) {
            return bsp_2.b();
        }
        return null;
    }

    private boolean o() {
        btp_1 btp_12 = this.x.get(0);
        return btp_12.c() <= azu_0.j().k().dK().a();
    }

    private long p() {
        return this.w.stream().filter(ogrineToken -> ogrineToken.getSellingPrice() == null).count();
    }

    public void i() {
        boolean bl = this.G = !this.G;
        if (!this.G) {
            this.e();
            return;
        }
        long l = enp_2.a.b(ens_2.ay);
        OgrineTokenApi.listRequest listRequest2 = OgrineTokenApi.listRequest().sellingServerId(Long.valueOf(l)).status("ON_SALE");
        OgrineTokenApi.listCallback listCallback2 = OgrineTokenApi.listCallback().on200(apiResponse -> this.a((List)apiResponse.getData())).onDefault(apiResponse -> b.error((Object)("Error requesting own conversion stones for offers list : " + (String)apiResponse.getData()))).onException(throwable -> b.error((Object)"Error requesting own conversion stones for offers list", throwable));
        WakfuClient.d().sendAsync((ApiCallback.Request)listRequest2, (ApiCallback.Callback)listCallback2);
    }

    private void a(List<OgrineToken> list) {
        this.x.clear();
        list.forEach(ogrineToken -> {
            Optional<btp_1> optional = this.x.stream().filter(btp_12 -> btp_12.c() == ogrineToken.getSellingPrice().longValue()).findFirst();
            if (optional.isPresent()) {
                optional.get().a((OgrineToken)ogrineToken);
            } else {
                this.x.add(new btp_1((OgrineToken)ogrineToken));
            }
        });
        this.x.sort(Comparator.comparingLong(btp_1::c));
        this.E = java.time.Instant.now();
        fis_1.a().a((ajf_1)this, f, g, o, p, k);
    }

    public void a(btv_0 btv_02) {
        this.y = btv_02;
        switch (this.y) {
            case a: {
                break;
            }
            case b: {
                fis_1.a().a((ajf_1)this, r, s);
                break;
            }
            case c: {
                this.b();
                break;
            }
            case d: {
                this.c();
                this.k();
                if (!wc_0.p().a().b(v)) break;
                this.a("webShop.conversion.stone.buy.price.changed", false);
                break;
            }
            case e: {
                this.e();
            }
        }
        fis_1.a().a((ajf_1)this, this.d());
    }

    public btv_0 j() {
        return this.y;
    }
}

