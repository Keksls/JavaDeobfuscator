/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.GameApi
 *  com.ankama.haapi.client.okhttp.ankama.api.GameApi$sendEventCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.GameApi$sendEventRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.GameApi;
import com.ankamagames.wakfu.client.WakfuClient;
import org.apache.log4j.Logger;

public final class cef {
    private static final Logger a = Logger.getLogger(cef.class);

    private cef() {
    }

    public static void a(cec cec2, Object ... objectArray) {
        cee cee2 = ceg.a(cec2, objectArray);
        GameApi.sendEventRequest sendEventRequest2 = GameApi.sendEventRequest().game(Long.valueOf(cee2.a())).sessionId(Long.valueOf(cee2.c())).eventId(Long.valueOf(cee2.b())).data(cee2.d()).date(null);
        GameApi.sendEventCallback sendEventCallback2 = GameApi.sendEventCallback().on204(apiResponse -> a.debug((Object)("[" + apiResponse.getStatusCode() + "] Sent event " + cee2.b() + " with result " + apiResponse.getData()))).onDefault(apiResponse -> a.warn((Object)("[" + apiResponse.getStatusCode() + "] sent event " + cee2.b() + " and received unexpected success code : " + (String)apiResponse.getData()))).onException(throwable -> a.warn((Object)("Unable to send event " + cee2.b()), throwable));
        WakfuClient.c().sendAsync((ApiCallback.Request)sendEventRequest2, (ApiCallback.Callback)sendEventCallback2);
    }
}

