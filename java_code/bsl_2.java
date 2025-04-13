/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$partnerFinalizeTransactionCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$partnerFinalizeTransactionRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopBuyResult
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.PaymentApi
 *  com.ankama.shopi.client.model.CancelSteamWalletTransactionRequest
 *  com.ankama.shopi.client.model.FinalizeSteamWalletTransactionRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopBuyResult;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.PaymentApi;
import com.ankama.shopi.client.model.CancelSteamWalletTransactionRequest;
import com.ankama.shopi.client.model.FinalizeSteamWalletTransactionRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import org.apache.log4j.Logger;

/*
 * Renamed from bSl
 */
public class bsl_2 {
    static final Logger a = Logger.getLogger(bsl_2.class);

    private bsl_2() {
    }

    public static void a(int n, boolean bl, bsk_2 bsk_22) {
        block7: {
            if (cbj_1.a()) {
                PaymentApi paymentApi = new PaymentApi(WakfuClient.e());
                try {
                    if (bl) {
                        if (WakfuClient.a.n().p()) {
                            a.info((Object)("[SHOPI-DEBUG] finalizeSteamWalletTransaction for following order : " + n));
                        }
                        FinalizeSteamWalletTransactionRequest finalizeSteamWalletTransactionRequest = new FinalizeSteamWalletTransactionRequest().orderId(String.valueOf(n));
                        paymentApi.finalizeSteamWalletTransactionAsync(cbj_1.b(), cbj_1.a, finalizeSteamWalletTransactionRequest, (ApiCallback)new bsm_2(bsk_22, n));
                        break block7;
                    }
                    if (WakfuClient.a.n().p()) {
                        a.info((Object)("[SHOPI-DEBUG] cancelSteamWalletTransaction for following order : " + n));
                    }
                    CancelSteamWalletTransactionRequest cancelSteamWalletTransactionRequest = new CancelSteamWalletTransactionRequest().orderId(String.valueOf(n));
                    paymentApi.cancelSteamWalletTransactionAsync(cbj_1.b(), cbj_1.a, cancelSteamWalletTransactionRequest, (ApiCallback)new bsn_2(bsk_22, n));
                }
                catch (ApiException apiException) {
                    a.error((Object)"Following error occured during PartnerFinalizeTxn request", (Throwable)apiException);
                    bsk_22.a(n, bsj_2.a);
                }
            } else {
                ShopApi.partnerFinalizeTransactionRequest partnerFinalizeTransactionRequest2 = ShopApi.partnerFinalizeTransactionRequest().orderId(Long.valueOf(n)).finalize(Boolean.valueOf(bl));
                ShopApi.partnerFinalizeTransactionCallback partnerFinalizeTransactionCallback2 = ShopApi.partnerFinalizeTransactionCallback().on200(apiResponse -> bsk_22.a(n, ((ShopBuyResult)apiResponse.getData()).getBalance())).onDefault(apiResponse -> {
                    a.error((Object)("Error during PartnerFinalizeTxn request : " + (String)apiResponse.getData()));
                    bsk_22.a(n, bsj_2.a);
                }).onException(throwable -> {
                    a.error((Object)"Error during PartnerFinalizeTxn request", throwable);
                    bsk_22.a(n, bsj_2.a);
                });
                WakfuClient.c().sendAsync((ApiCallback.Request)partnerFinalizeTransactionRequest2, (ApiCallback.Callback)partnerFinalizeTransactionCallback2);
            }
        }
    }
}

