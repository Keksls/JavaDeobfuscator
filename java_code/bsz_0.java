/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.PaymentApi
 *  com.ankama.shopi.client.model.CreateAnkamaFreePaymentRequest
 *  com.ankama.shopi.client.model.CreateAnkamaOgrinePaymentRequest
 *  com.ankama.shopi.client.model.InitializeSteamWalletTransactionRequest
 *  com.ankama.shopi.client.model.Order
 *  com.ankama.shopi.client.model.PaymentRequestOneOf
 *  com.ankama.shopi.client.model.PaymentRequestOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.VirtualPaymentModeId
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.PaymentApi;
import com.ankama.shopi.client.model.CreateAnkamaFreePaymentRequest;
import com.ankama.shopi.client.model.CreateAnkamaOgrinePaymentRequest;
import com.ankama.shopi.client.model.InitializeSteamWalletTransactionRequest;
import com.ankama.shopi.client.model.Order;
import com.ankama.shopi.client.model.PaymentRequestOneOf;
import com.ankama.shopi.client.model.VirtualPaymentModeId;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bSZ
 */
class bsz_0
implements ApiCallback<Order> {
    final /* synthetic */ PaymentRequestOneOf a;
    final /* synthetic */ bsy_1 b;

    bsz_0(bsy_1 bsy_12, PaymentRequestOneOf paymentRequestOneOf) {
        this.b = bsy_12;
        this.a = paymentRequestOneOf;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bSO.s.error((Object)"Following error occured during createOrder request", (Throwable)apiException);
        this.b.b.a(this.b.a, "createOrder" + n);
    }

    public void a(Order order, int n, Map<String, List<String>> map) {
        PaymentApi paymentApi = new PaymentApi(WakfuClient.e());
        if (this.a.getDiscriminator() == PaymentRequestOneOf.DiscriminatorEnum.FREE) {
            try {
                CreateAnkamaFreePaymentRequest createAnkamaFreePaymentRequest = new CreateAnkamaFreePaymentRequest().orderId(order.getId());
                if (WakfuClient.a.n().p()) {
                    bSO.s.info((Object)("[SHOPI-DEBUG] createAnkamaFreePayment with following request : " + createAnkamaFreePaymentRequest));
                }
                paymentApi.createAnkamaFreePaymentAsync(this.b.b.b, this.b.b.c, createAnkamaFreePaymentRequest, (ApiCallback)new bta_0(this));
            }
            catch (ApiException apiException) {
                bSO.s.error((Object)"Following error occured during createAnkamaOgrinePayment request", (Throwable)apiException);
                this.b.b.a(this.b.a, "freePaymentException");
            }
        } else if (this.a.getDiscriminator() == PaymentRequestOneOf.DiscriminatorEnum.VIRTUAL && this.a.getVirtualPaymentRequest() != null && this.a.getVirtualPaymentRequest().getPaymentModeId() == VirtualPaymentModeId.OG) {
            try {
                CreateAnkamaOgrinePaymentRequest createAnkamaOgrinePaymentRequest = new CreateAnkamaOgrinePaymentRequest().orderId(order.getId());
                if (WakfuClient.a.n().p()) {
                    bSO.s.info((Object)("[SHOPI-DEBUG] createAnkamaOgrinePayment with following request : " + createAnkamaOgrinePaymentRequest));
                }
                paymentApi.createAnkamaOgrinePaymentAsync(this.b.b.b, this.b.b.c, createAnkamaOgrinePaymentRequest, (ApiCallback)new btb_0(this));
            }
            catch (ApiException apiException) {
                bSO.s.error((Object)"Following error occured during createAnkamaOgrinePayment request", (Throwable)apiException);
                this.b.b.a(this.b.a, "ogrinePaymentException");
            }
        } else if (this.a.getDiscriminator() == PaymentRequestOneOf.DiscriminatorEnum.VIRTUAL && this.a.getVirtualPaymentRequest() != null && this.a.getVirtualPaymentRequest().getPaymentModeId() == VirtualPaymentModeId.SW) {
            try {
                InitializeSteamWalletTransactionRequest initializeSteamWalletTransactionRequest = new InitializeSteamWalletTransactionRequest().orderId(order.getId()).steamUserId(String.valueOf(bPL.a.f().ConvertToUint64()));
                if (WakfuClient.a.n().p()) {
                    bSO.s.info((Object)("[SHOPI-DEBUG] initializeSteamWalletTransaction with following request : " + initializeSteamWalletTransactionRequest));
                }
                paymentApi.initializeSteamWalletTransactionAsync(this.b.b.b, this.b.b.c, initializeSteamWalletTransactionRequest, (ApiCallback)new btc_1(this, order));
            }
            catch (ApiException apiException) {
                bSO.s.error((Object)"Following error occured during initializeSteamWalletTransaction request", (Throwable)apiException);
                this.b.b.a(this.b.a, "steamWalletTransactionException");
            }
        } else {
            bSO.s.error((Object)String.format("Unmanaged payment finalization with %s", this.a));
            this.b.b.a(this.b.a, "unmanagedPaymentMode");
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Order)object, n, map);
    }
}

