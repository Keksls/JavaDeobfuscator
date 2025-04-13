/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.AlmanaxApi
 *  com.ankama.haapi.client.okhttp.ankama.api.AlmanaxApi$getEventCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.AlmanaxApi$getEventRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.Almanax
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.TestOnly
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.AlmanaxApi;
import com.ankama.haapi.client.okhttp.ankama.model.Almanax;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/*
 * Renamed from bTx
 */
public class btx_1 {
    private static final Logger b = Logger.getLogger(bkg_1.class);
    @NotNull
    public static btx_1 a = new btx_1();
    private final Set<String> c = new HashSet<String>();

    @NotNull
    public static btx_1 a() {
        return a;
    }

    @TestOnly
    public static void a(@NotNull btx_1 btx_12) {
        a = btx_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, wu_0 wu_02) {
        if (bkg_1.a.b(wu_02)) {
            return;
        }
        String string2 = new WR(TimeZone.getDefault()).format(wu_02.i());
        AlmanaxApi.getEventRequest getEventRequest2 = this.c;
        synchronized (getEventRequest2) {
            if (this.c.contains(string2)) {
                return;
            }
            this.c.add(string2);
        }
        getEventRequest2 = AlmanaxApi.getEventRequest().lang(string).date(string2);
        AlmanaxApi.getEventCallback getEventCallback2 = AlmanaxApi.getEventCallback().on200(apiResponse -> {
            bkf_0 bkf_02 = bkf_0.a(((Almanax)apiResponse.getData()).getEvent());
            bkh_1 bkh_12 = bkh_1.a(((Almanax)apiResponse.getData()).getMonth());
            bkg_1.a.a(bkf_02, wu_02);
            bkg_1.a.a(bkh_12, wu_02);
            Set<String> set = this.c;
            synchronized (set) {
                this.c.remove(string2);
            }
            b.debug((Object)String.format("Almanac of %s retrieved", string2));
        }).onDefault(apiResponse -> b.error((Object)("Unable to get Almanac entry : " + (String)apiResponse.getData()))).onException(throwable -> b.error((Object)"Unable to get Almanac entry", throwable));
        WakfuClient.c().sendAsync((ApiCallback.Request)getEventRequest2, (ApiCallback.Callback)getEventCallback2);
    }
}

