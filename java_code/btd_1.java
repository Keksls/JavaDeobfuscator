/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bTd
 */
class btd_1
implements ApiCallback<Void> {
    final /* synthetic */ bSO a;

    btd_1(bSO bSO2) {
        this.a = bSO2;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bSO.s.error((Object)"Following error occured during deleteCart request", (Throwable)apiException);
    }

    public void a(Void void_, int n, Map<String, List<String>> map) {
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Void)object, n, map);
    }
}

