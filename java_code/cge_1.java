/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ApiResponse
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$getAccessTokenFromAnkamaApiKeyCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$getAccessTokenFromAnkamaApiKeyRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.AccessToken
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ApiResponse;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.AccessToken;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.Date;
import java.util.function.Consumer;

/*
 * Renamed from cge
 */
class cge_1
implements adx_1<cbt_0> {
    cge_1() {
    }

    @Override
    public boolean a(cbt_0 cbt_02) {
        if (WakfuClient.a.n().q()) {
            cfx_2.b.info((Object)"[WEB-TOKEN-DEBUG] Received shopKey !");
        }
        if (fis_1.a().c("demo")) {
            return false;
        }
        String string = WakfuClient.i();
        WakfuClient.c().setApiKey(cbt_02.b());
        WakfuClient.c().setUserAgent(string);
        WakfuClient.d().setApiKey(cbt_02.b());
        WakfuClient.d().setUserAgent(string);
        if (WakfuClient.a.n().q()) {
            cfx_2.b.info((Object)("[WEB-TOKEN-DEBUG] Haapi ApiKey used : " + cbt_02.b() + " with following user agent : " + string));
        }
        ShopApi.getAccessTokenFromAnkamaApiKeyRequest getAccessTokenFromAnkamaApiKeyRequest2 = ShopApi.getAccessTokenFromAnkamaApiKeyRequest();
        Consumer<ApiResponse> consumer = apiResponse -> cfx_2.b.error((Object)String.format("Unexpected code received on apiKey conversion (code : %s, result : %s)", apiResponse.getStatusCode(), apiResponse));
        ShopApi.getAccessTokenFromAnkamaApiKeyCallback getAccessTokenFromAnkamaApiKeyCallback2 = ShopApi.getAccessTokenFromAnkamaApiKeyCallback().on200(apiResponse -> {
            WakfuClient.e().setBearerToken(((AccessToken)apiResponse.getData()).getToken());
            WakfuClient.e().setUserAgent(string);
            if (WakfuClient.a.n().q()) {
                cfx_2.b.info((Object)("[WEB-TOKEN-DEBUG] Shopi BearerToken used : " + ((AccessToken)apiResponse.getData()).getToken() + " with following user agent : " + string));
            }
        }).on401(consumer).on403(consumer).on500(consumer).onDefault(apiResponse -> cfx_2.b.error((Object)String.format("Unexpected code received on apiKey conversion (code : %s, result : %s)", apiResponse.getStatusCode(), apiResponse))).onException(throwable -> cfx_2.b.error((Object)"Following error occured on apiKey conversion", throwable));
        WakfuClient.c().sendAsync((ApiCallback.Request)getAccessTokenFromAnkamaApiKeyRequest2, (ApiCallback.Callback)getAccessTokenFromAnkamaApiKeyCallback2);
        cfx_2.a();
        bsp_2.a.a(cbt_02.d());
        bsp_2.a.b(enp_2.a.e(ens_2.bx));
        if (azu_0.j().c(cWI.a())) {
            boi_1.b.a();
        }
        long l = cbt_02.c();
        wt_0 wt_02 = wt_0.a(new Date(l));
        ww_0 ww_02 = wt_02.g(wt_0.a(new Date()));
        long l2 = Math.abs(ww_02.g() * 1000L);
        ado_1.a().a(() -> {
            if (WakfuClient.a.n().q()) {
                cfx_2.b.info((Object)"[WEB-TOKEN-DEBUG] Send request for shopApiKey !");
            }
            azu_0.j().K().c(new cbv_0(bae.h().f().h()));
        }, l2, 1);
        return false;
    }

    @Override
    public int a() {
        return 22913;
    }
}

