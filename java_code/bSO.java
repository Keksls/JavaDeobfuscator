/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$buyCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$buyRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance
 *  com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance$CurrencyEnum
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopBuyResult
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.CartApi
 *  com.ankama.shopi.client.model.ArticlePaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.Cart
 *  com.ankama.shopi.client.model.CartDetailClassicRequest
 *  com.ankama.shopi.client.model.CartDetailRequestOneOf
 *  com.ankama.shopi.client.model.CartDetailRequestOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.CreateCartRequest
 *  com.ankama.shopi.client.model.Language
 *  com.ankama.shopi.client.model.PaymentRequestOneOf
 *  com.ankama.shopi.client.model.PaymentRequestOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ReferenceOneOf
 *  com.ankama.shopi.client.model.ShopKey
 *  com.ankama.shopi.client.model.SingleReference
 *  com.ankama.shopi.client.model.VirtualPaymentModeId
 *  com.ankama.shopi.client.model.VirtualPaymentRequest
 *  com.google.gson.Gson
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance;
import com.ankama.haapi.client.okhttp.ankama.model.ShopBuyResult;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.CartApi;
import com.ankama.shopi.client.model.ArticlePaymentModeOneOf;
import com.ankama.shopi.client.model.Cart;
import com.ankama.shopi.client.model.CartDetailClassicRequest;
import com.ankama.shopi.client.model.CartDetailRequestOneOf;
import com.ankama.shopi.client.model.CreateCartRequest;
import com.ankama.shopi.client.model.Language;
import com.ankama.shopi.client.model.PaymentRequestOneOf;
import com.ankama.shopi.client.model.ReferenceOneOf;
import com.ankama.shopi.client.model.ShopKey;
import com.ankama.shopi.client.model.SingleReference;
import com.ankama.shopi.client.model.VirtualPaymentModeId;
import com.ankama.shopi.client.model.VirtualPaymentRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import com.google.gson.Gson;
import gnu.trove.map.hash.TByteIntHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bSO
implements ajh_1 {
    private static final int[] r = new int[]{8818, 8819, 8820, 8821, 8822, 8823};
    static final Logger s = Logger.getLogger(bSO.class);
    public static final String a = "ready";
    public static final String b = "mode";
    public static final String d = "conversionStoneView";
    public static final String e = "carrousel";
    public static final String f = "rootCategories";
    public static final String g = "categories";
    public static final String h = "currentCategory";
    public static final String i = "parentCategory";
    public static final String j = "articles";
    public static final String k = "homeArticles";
    public static final String l = "highlights";
    public static final String m = "currentPage";
    public static final String n = "totalPages";
    public static final String o = "currentCarrousel";
    private static final String t = "wallet";
    private static final String u = "ogrinWallet";
    private static final String v = "pagesDescription";
    public static final int p = 12;
    public static final int q = 1000;
    final Object w = new Object();
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 3;
    private boolean A;
    btn_1 B;
    final btq_1 C = new btq_1();
    private btm_1 D;
    final List<bSN> E = new ArrayList<bSN>();
    private final TByteIntHashMap F = new TByteIntHashMap();
    final List<bSt<?>> G = new ArrayList();
    final List<bSt<?>> H = new ArrayList();
    final List<bsv_0<?, ?>> I = new ArrayList();
    final List<bss_0<?, ?>> J = new ArrayList();
    private final List<bss_0<?, ?>> K = new ArrayList();
    final List<bsv_0<?, ?>> L = new ArrayList();
    bSt<?> M;
    private bsv_0<?, ?> N;
    private final List<bss_0<?, ?>> O = new ArrayList();
    private int P = 0;
    int Q = 0;
    private String R = null;
    private int S = 1;
    int T = 1;
    int U = 1;
    private final List<bSK> V = new ArrayList<bSK>();
    final Map<Integer, btk_1> W = new HashMap<Integer, btk_1>();
    final Map<String, bsf_0> X = new HashMap<String, bsf_0>();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(bSN bSN2, boolean bl) {
        if (fis_1.a().c("demo")) {
            return;
        }
        Object object = this.w;
        synchronized (object) {
            if (this.S == 3) {
                bSN2.a();
            } else {
                this.E.add(bSN2);
            }
            this.B = btn_1.a;
            this.C.a(btv_0.a);
            this.D = btm_1.a;
            if (this.S != 1) {
                return;
            }
            s.info((Object)"WebSession Init");
            this.S = 2;
            this.U = 2;
            this.T = 2;
            this.V.add(new bSK(bsz_1.a, this));
            fis_1.a().a((ajf_1)this, t, u);
            this.a(bl, true, true);
            brp_1.a(new bSP(this));
        }
    }

    private void a(boolean bl, boolean bl2, boolean bl3) {
        if (!bl && !bl2) {
            return;
        }
        bst_0 bst_02 = new bst_0(this, bl, bl2, bl3);
        bsu_0 bsu_02 = new bsu_0(this, bl, bst_02);
        bsv_1 bsv_12 = new bsv_1(this, bst_02);
        if (bl2 && !bl) {
            bsc_2.a(bsu_02);
        } else if (!bl2) {
            bsc_2.a(bsv_12, null);
        } else {
            bsc_2.a(bsv_12, bsu_02);
        }
    }

    public void a() {
        this.B = btn_1.d;
        this.C.a(btv_0.b);
        this.C.a();
        fis_1.a().a((ajf_1)this, b);
    }

    public void a(byte by) {
        this.C.a(btv_0.a(by));
    }

    public btq_1 b() {
        return this.C;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void p() {
        Object object = this.w;
        synchronized (object) {
            if (this.S != 3 && this.U == 3 && this.T == 3) {
                this.S = 3;
                for (bSN bSN2 : new ArrayList<bSN>(this.E)) {
                    bSN2.a();
                }
            }
        }
    }

    public int c() {
        return this.I.size();
    }

    public int a(bsv_0<?, ?> bsv_02) {
        return this.I.indexOf(bsv_02);
    }

    public void a(int n) {
        this.N = n < 0 || n >= this.I.size() ? null : this.I.get(n);
        fis_1.a().a((ajf_1)this, o);
    }

    void b(int n) {
        this.F.put(bsz_1.a.a(), n);
        this.V.forEach(bSK::a);
        Stream.concat(Stream.concat(this.J.stream(), this.O.stream()), this.K.stream()).forEach(bss_02 -> fis_1.a().a((ajf_1)bss_02, "hasEnoughMoney"));
    }

    public void a(@NotNull PaymentRequestOneOf paymentRequestOneOf) {
        bsz_1 bsz_12 = bsz_1.a;
        PaymentRequestOneOf.DiscriminatorEnum discriminatorEnum = paymentRequestOneOf.getDiscriminator();
        if (paymentRequestOneOf.getDiscriminator() != PaymentRequestOneOf.DiscriminatorEnum.VIRTUAL) {
            return;
        }
        VirtualPaymentRequest virtualPaymentRequest = paymentRequestOneOf.getVirtualPaymentRequest();
        if (virtualPaymentRequest == null) {
            s.warn((Object)String.format("Missing %s with following discriminator %s in following %s", VirtualPaymentRequest.class, discriminatorEnum, paymentRequestOneOf));
            return;
        }
        if (virtualPaymentRequest.getCurrency() != bsz_12.g()) {
            return;
        }
        int n = this.a(bsz_12) - virtualPaymentRequest.getAmount().intValue();
        this.b(n);
    }

    public void a(@NotNull bsf_0 bsf_02) {
        int n = this.a(bsz_1.a);
        block3: for (SingleReference singleReference : bsf_02.t()) {
            ReferenceOneOf referenceOneOf = singleReference.getReference();
            switch (referenceOneOf.getDiscriminator()) {
                case OGRINEREFERENCE: {
                    n += singleReference.getQuantity().intValue();
                    continue block3;
                }
            }
        }
        this.b(n);
    }

    int a(bsz_1 bsz_12) {
        if (bsz_12 == null) {
            return 0;
        }
        return this.F.get(bsz_12.a());
    }

    public bSt<?> e() {
        return this.M;
    }

    public void a(bSt<?> bSt2) {
        this.M = bSt2;
        if (this.M != null) {
            this.D = btm_1.a;
        }
        fis_1.a().a((ajf_1)this, h);
        fis_1.a().a((ajf_1)this, i);
        this.r();
    }

    public bSt<?> a(Object object) {
        if (this.U != 3) {
            return null;
        }
        Optional<bSt> optional = this.H.stream().filter(bSt2 -> Objects.equals(bSt2.a(), object)).findFirst();
        return optional.orElse(null);
    }

    public bSt<?> a(String string) {
        if (string == null || this.U != 3) {
            return null;
        }
        Optional<bSt> optional = this.H.stream().filter(Objects::nonNull).filter(bSt2 -> bSt2.f() != null).filter(bSt2 -> bSt2.f().equals(string)).findFirst();
        return optional.orElse(null);
    }

    public void c(String string) {
        this.a(string, 1);
    }

    public void f() {
        if (this.P == 1) {
            return;
        }
        this.a(this.R, 1);
    }

    public void g() {
        if (this.P <= 1) {
            return;
        }
        this.a(this.R, this.P - 1);
    }

    public void h() {
        if (this.P == this.Q) {
            return;
        }
        this.a(this.R, this.P + 1);
    }

    public void i() {
        if (this.P == this.Q) {
            return;
        }
        this.a(this.R, this.Q);
    }

    public void a(bss_0<?, ?> bss_02) {
        if (bss_02.j() == bsz_1.a && bss_02.g() > (double)this.a(bsz_1.a)) {
            return;
        }
        this.s();
        if (bss_02 instanceof bsa_0) {
            this.a((bsa_0)bss_02);
        } else if (bss_02 instanceof bsf_0) {
            this.b((bsf_0)bss_02);
        } else {
            s.error((Object)("[SHOP] Unable to quick buy following " + bss_02));
            this.e("unknownArticleType");
        }
    }

    void d(bss_0<?, ?> bss_02) {
        bSJ bSJ2;
        ArrayList<bSJ> arrayList;
        String string = "shop.purchaseSuccessWarning";
        if (bss_02.a(bsx_0.c)) {
            arrayList = new ckn_1(env_0.a.a());
            azu_0.j().K().c(arrayList);
        } else if (bss_02.a(bsx_0.d)) {
            arrayList = bss_02.m();
            if (!arrayList.isEmpty()) {
                bSJ2 = (bSJ)arrayList.get(0);
                if ("WKCHARACTERS".equals(bSJ2.c("STATUS"))) {
                    ckm_1 ckm_12 = new ckm_1();
                    azu_0.j().K().c(ckm_12);
                    string = "shop.purchaseCharacterSlotSuccessWarning";
                } else if ("WKVAULTUP".equals(bSJ2.c("STATUS"))) {
                    cBu cBu2 = new cBu();
                    azu_0.j().K().c(cBu2);
                    string = "shop.purchaseCharacterSlotSuccessWarning";
                }
            }
        } else if (bss_02.a(bsw_0.a)) {
            string = "shop.purchaseConversionStoneSuccessWarning";
            this.C.f();
        } else if (bss_02.a(bsx_0.h)) {
            string = "shop.purchaseWebRedirection";
        }
        bss_02.l();
        arrayList = new cnp_0();
        ((cnp_0)((Object)arrayList)).a(bae.h().f().i());
        azu_0.j().K().c(arrayList);
        bSJ2 = bss_02.a();
        if (ahi_2.a(r, bSJ2 instanceof Integer ? (Integer)((Object)bSJ2) : Integer.parseInt(bSJ2.toString()))) {
            string = "shop.purchaseSubSuccessWarning";
        }
        fpm_0.b().a(bae.h().a(string, new Object[0]), cfn_0.a(7), 16899L, 102, 1);
    }

    private void a(bsa_0 bsa_02) {
        bsd_0 bsd_02 = new bsd_0(bsa_02);
        Gson gson = new Gson();
        String string = gson.toJson((Object)bsd_02);
        ShopApi.buyRequest buyRequest2 = ShopApi.buyRequest().data("[" + string + "]").currency(bsa_02.j().b());
        ShopApi.buyCallback buyCallback2 = ShopApi.buyCallback().on200(apiResponse -> {
            try {
                this.d(bsa_02);
                int n = 0;
                for (MoneyBalance moneyBalance : ((ShopBuyResult)apiResponse.getData()).getBalance()) {
                    if (moneyBalance.getCurrency() != MoneyBalance.CurrencyEnum.OGR) continue;
                    n = Hw.c(moneyBalance.getAmount().floatValue());
                }
                this.b(n);
            }
            catch (Exception exception) {
                s.error((Object)("Error during on200 of buy, result : " + apiResponse), (Throwable)exception);
            }
            finally {
                this.l();
            }
        }).onDefault(apiResponse -> {
            s.error((Object)("Error when buying an article: " + bsa_02.a() + " : " + (String)apiResponse.getData()));
            this.e("haapiBuy" + apiResponse.getStatusCode());
        }).onException(throwable -> {
            s.error((Object)("Error when buying an article: " + bsa_02.a()), throwable);
            this.e("haapiBuyException");
        });
        WakfuClient.c().sendAsync((ApiCallback.Request)buyRequest2, (ApiCallback.Callback)buyCallback2);
    }

    public void a(@NotNull bsf_0 bsf_02, @NotNull btl_1 btl_12) {
        this.a(new CartApi(WakfuClient.e()), cbj_1.b(), cbj_1.a, bsf_02, btl_12);
    }

    public void a(@NotNull CartApi cartApi, @NotNull Language language, @NotNull ShopKey shopKey, @NotNull bsf_0 bsf_02, @NotNull btl_1 btl_12) {
        try {
            CreateCartRequest createCartRequest = new CreateCartRequest().addCartDetailsItem(new CartDetailRequestOneOf().discriminator(CartDetailRequestOneOf.DiscriminatorEnum.CARTDETAILCLASSICREQUEST).cartDetailClassicRequest(new CartDetailClassicRequest().articleId((String)bsf_02.a()).quantity(Integer.valueOf(1)).chosenReferences(bsf_02.K.stream().map(cbj_1::a).filter(Objects::nonNull).collect(Collectors.toList()))));
            if (WakfuClient.a.n().p()) {
                s.info((Object)("[SHOPI-DEBUG] createCart with following request : " + createCartRequest));
            }
            cartApi.createCartAsync(language, shopKey, createCartRequest, (ApiCallback)new bsw_1(this, btl_12));
        }
        catch (ApiException apiException) {
            s.error((Object)"Following error occured during createCart request", (Throwable)apiException);
            btl_12.a((Exception)((Object)apiException));
        }
    }

    private void b(bsf_0 bsf_02) {
        Object object = bsf_02.w();
        if (object != VirtualPaymentModeId.OG && object != VirtualPaymentModeId.SW && object != ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEFREEPAYMENTMODE) {
            s.warn((Object)String.format("Unable to quickBuy following %s because following paymentMode %s isn't supported", bsf_02, object));
            this.e("paymentModeUnsupported");
            return;
        }
        CartApi cartApi = new CartApi(WakfuClient.e());
        Language language = cbj_1.b();
        ShopKey shopKey = cbj_1.a;
        this.a(cartApi, language, shopKey, bsf_02, new bsx_1(this, cartApi, language, shopKey, bsf_02));
    }

    public void a(@NotNull Cart cart) {
        this.a(new CartApi(WakfuClient.e()), cbj_1.b(), cbj_1.a, cart);
    }

    public void a(@NotNull CartApi cartApi, Language language, ShopKey shopKey, @NotNull Cart cart) {
        try {
            if (WakfuClient.a.n().p()) {
                s.info((Object)("[SHOPI-DEBUG] deleteCart with following id : " + cart.getId()));
            }
            cartApi.deleteCartAsync(language, shopKey, cart.getId(), (ApiCallback)new btd_1(this));
        }
        catch (ApiException apiException) {
            s.error((Object)"Following error occured during deleteCart request", (Throwable)apiException);
        }
    }

    void e(String string) {
        fpm_0.b().a(bae.h().a("webShop.oneClick.error", string), cfn_0.a(7), 17411L, 102, 1);
        this.l();
    }

    public void a(int n, boolean bl) {
        if (!bPL.a.e()) {
            return;
        }
        this.s();
        bsl_2.a(n, bl, new bte_1(this));
    }

    private void a(String string, int n) {
        if (this.A) {
            return;
        }
        if (!Cz.a(this.R, string, true)) {
            this.r();
        }
        this.R = string;
        this.P = n;
        if (this.D == btm_1.a && this.M == null && Cz.f(string)) {
            this.k();
        } else {
            this.a(n, new bto_1(this, this.M != null ? this.M.a() : Integer.valueOf(0)));
        }
    }

    private void a(int n, btj_1 btj_12) {
        if (this.W.get(n) != null) {
            btj_12.a(null);
            return;
        }
        if (this.D == btm_1.a) {
            if (Cz.f(this.R)) {
                bru_2.a(new btf_1(this, btj_12, n), this.M.a(), n, 12);
            } else {
                bth_1 bth_12 = new bth_1(this.R, n, btj_12, this);
                this.W.put(n, bth_12);
                bth_12.c();
            }
        }
    }

    public void j() {
        this.k();
        this.B = btn_1.b;
        this.C.a(btv_0.a);
        fis_1.a().a((ajf_1)this, b);
    }

    public void k() {
        this.a(true, false, false);
    }

    void b(Object object) {
        if (object != null && this.M != null && object != this.M.a()) {
            return;
        }
        this.q();
    }

    private void q() {
        btk_1 btk_12 = this.W.get(this.P);
        if (btk_12 == null) {
            this.a(new ArrayList(), true);
            return;
        }
        if (btk_12.b()) {
            this.a(btk_12.a(), false);
        } else {
            this.s();
            btk_12.a(new bSQ(this));
        }
        for (bSN bSN2 : new ArrayList<bSN>(this.E)) {
            bSN2.e();
        }
    }

    private void r() {
        this.W.values().forEach(btk_1::d);
        this.W.clear();
    }

    void a(List<bss_0<?, ?>> list, boolean bl) {
        this.B = btn_1.c;
        this.C.a(btv_0.a);
        this.O.clear();
        this.O.addAll(list);
        if (bl) {
            this.l();
        }
        fis_1.a().a((ajf_1)this, j, m, n, v, b);
    }

    private void s() {
        this.A = true;
        fis_1.a().a((ajf_1)this, a);
    }

    void l() {
        this.A = false;
        fis_1.a().a((ajf_1)this, a);
    }

    public boolean m() {
        return this.S == 3;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(t)) {
            return this.V;
        }
        if (string.equals(b)) {
            return this.B.a();
        }
        if (string.equals(d)) {
            return this.C;
        }
        if (string.equals(g)) {
            return this.H;
        }
        if (string.equals(o)) {
            return this.N;
        }
        if (string.equals(k)) {
            return this.J;
        }
        if (string.equals(l)) {
            return this.L;
        }
        if (string.equals(e)) {
            return this.I;
        }
        if (string.equals(f)) {
            return this.G;
        }
        if (string.equals(h)) {
            return this.M;
        }
        if (string.equals(i)) {
            return this.M != null ? this.M.e() : null;
        }
        if (string.equals(j)) {
            return this.O;
        }
        if (string.equals(m)) {
            return this.P;
        }
        if (string.equals(n)) {
            return this.Q;
        }
        if (string.equals(a)) {
            return !this.A;
        }
        if (string.equals(v)) {
            if (this.Q != 0) {
                return this.P + "/" + this.Q;
            }
            return bae.h().a("marketBoard.noResults", new Object[0]);
        }
        if (string.equals(u)) {
            Optional<bSK> optional = this.V.stream().filter(bSK2 -> bSK2.b().a() == bsz_1.a.a()).findFirst();
            return optional.orElse(null);
        }
        return null;
    }

    public void n() {
        brp_1.a(new bSR(this));
    }

    public btn_1 o() {
        return this.B;
    }

    public void a(bSN bSN2) {
        this.E.add(bSN2);
    }

    public void b(bSN bSN2) {
        this.E.remove(bSN2);
    }

    @Nullable
    protected bsf_0 c(int n) {
        return this.X.get(String.valueOf(n));
    }

    protected void d(int n) {
        this.X.remove(String.valueOf(n));
    }

    public void b(bss_0<?, ?> bss_02) {
        this.K.add(bss_02);
    }

    public void c(bss_0<?, ?> bss_02) {
        this.K.remove(bss_02);
    }
}

