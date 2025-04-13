/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi$sendDeviceInfosCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi$sendDeviceInfosRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.AccountApi;
import com.ankamagames.wakfu.client.WakfuClient;
import org.apache.log4j.Logger;

/*
 * Renamed from cfX
 */
public final class cfx_2
extends ahs_1 {
    static final Logger b = Logger.getLogger(cfx_2.class);
    public static final cfx_2 a = new cfx_2();

    private cfx_2() {
        super(new cfy_1(), new cgb_1(), new cgc_1(), new cge_1(), new cfz_1(), new cgd_2(), new cga_1());
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    static void a() {
        eoW eoW2 = eoW.a();
        long l = bah_0.b();
        String string = eoW2 == eoW.a ? "ANKAMA" : "PARTNER";
        String string2 = "STANDALONE";
        String string3 = ahu_2.a().e();
        String string4 = "PC";
        String string5 = eoW2.c();
        String string6 = azm_0.a().orElseGet(() -> System.getProperty("user.name"));
        AccountApi.sendDeviceInfosRequest sendDeviceInfosRequest2 = AccountApi.sendDeviceInfosRequest().sessionId(Long.valueOf(l)).connectionType(string).clientType("STANDALONE").os(string3).device("PC").partner(string5).deviceUid(string6);
        AccountApi.sendDeviceInfosCallback sendDeviceInfosCallback2 = AccountApi.sendDeviceInfosCallback().on204(apiResponse -> b.info((Object)"Device information sent")).onDefault(apiResponse -> b.warn((Object)("Unable to send device information : " + (String)apiResponse.getData()))).onException(throwable -> b.warn((Object)"Unable to send device information", throwable));
        WakfuClient.c().sendAsync((ApiCallback.Request)sendDeviceInfosRequest2, (ApiCallback.Callback)sendDeviceInfosCallback2);
    }
}

