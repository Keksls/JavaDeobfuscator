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
 * Renamed from bSn
 */
class bsn_2
implements ApiCallback<Void> {
    final /* synthetic */ bsk_2 a;
    final /* synthetic */ int b;

    bsn_2(bsk_2 bsk_22, int n) {
        this.a = bsk_22;
        this.b = n;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bsl_2.a.error((Object)"Following error occured during cancelSteamWalletTransaction request", (Throwable)apiException);
        this.a.a(this.b, bsj_2.a);
    }

    public void a(Void void_, int n, Map<String, List<String>> map) {
        this.a.a(this.b, false);
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Void)object, n, map);
    }
}

