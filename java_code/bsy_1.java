/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.Cart
 *  com.ankama.shopi.client.model.CartPaymentModeList
 *  com.ankama.shopi.client.model.CreateOrderRequest
 *  com.ankama.shopi.client.model.PaymentRequestOneOf
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.Cart;
import com.ankama.shopi.client.model.CartPaymentModeList;
import com.ankama.shopi.client.model.CreateOrderRequest;
import com.ankama.shopi.client.model.PaymentRequestOneOf;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bSY
 */
class bsy_1
implements ApiCallback<CartPaymentModeList> {
    final /* synthetic */ Cart a;
    final /* synthetic */ bsx_1 b;

    bsy_1(bsx_1 bsx_12, Cart cart) {
        this.b = bsx_12;
        this.a = cart;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bSO.s.error((Object)"Following error occured during listPaymentMode request", (Throwable)apiException);
        this.b.a(this.a, "listPaymentMode" + n);
    }

    public void a(CartPaymentModeList cartPaymentModeList, int n, Map<String, List<String>> map) {
        PaymentRequestOneOf paymentRequestOneOf = cbj_1.a(cartPaymentModeList);
        if (paymentRequestOneOf == null) {
            bSO.s.warn((Object)String.format("No suitable payment methods found to pay this cart from client (In context of following cart : %s with following article : %s)", this.a.getId(), this.b.d.a()));
            this.b.a(this.a, "noPaymentModeFound");
            return;
        }
        try {
            CreateOrderRequest createOrderRequest = new CreateOrderRequest().accountId(String.valueOf(ans_0.F().n().u())).payment(paymentRequestOneOf);
            if (WakfuClient.a.n().p()) {
                bSO.s.info((Object)("[SHOPI-DEBUG] createOrder with following cart : \"" + this.a.getId() + "\" and following request : " + createOrderRequest));
            }
            this.b.a.createOrderAsync(this.b.b, this.b.c, this.a.getId(), createOrderRequest, (ApiCallback)new bsz_0(this, paymentRequestOneOf));
        }
        catch (ApiException apiException) {
            bSO.s.error((Object)"Following error occured during createOrder request", (Throwable)apiException);
            this.b.a(this.a, "createOrderException");
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((CartPaymentModeList)object, n, map);
    }
}

