/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.MoneyApi
 *  com.ankama.haapi.client.okhttp.ankama.api.MoneyApi$ogrinsAmountCallback
 *  com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.MoneyApi;
import com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance;
import com.ankamagames.wakfu.client.WakfuClient;
import org.apache.log4j.Logger;

/*
 * Renamed from bRP
 */
public final class brp_1 {
    private static final Logger a = Logger.getLogger(brp_1.class);

    private brp_1() {
    }

    public static void a(bro_1 bro_12) {
        MoneyApi.ogrinsAmountCallback ogrinsAmountCallback2 = MoneyApi.ogrinsAmountCallback().on200(apiResponse -> bro_12.a(Hw.b(((MoneyBalance)apiResponse.getData()).getAmount().floatValue()))).onDefault(apiResponse -> {
            a.warn((Object)("Error " + apiResponse.getStatusCode() + " while retrieving Ogrins amount : " + (String)apiResponse.getData()));
            bro_12.a(0);
        }).onException(throwable -> {
            a.error(throwable);
            bro_12.a(0);
        });
        WakfuClient.c().sendAsync((ApiCallback.Request)MoneyApi.ogrinsAmountRequest(), (ApiCallback.Callback)ogrinsAmountCallback2);
    }
}

