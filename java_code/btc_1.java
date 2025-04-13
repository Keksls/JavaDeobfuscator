/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.Order
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.Order;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bTc
 */
class btc_1
implements ApiCallback<Void> {
    final /* synthetic */ Order a;
    final /* synthetic */ bsz_0 b;

    btc_1(bsz_0 bsz_02, Order order) {
        this.b = bsz_02;
        this.a = order;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bSO.s.error((Object)"Following error occured during initializeSteamWalletTransaction request", (Throwable)apiException);
        this.b.b.b.a(this.b.b.a, "steamWalletTransaction" + n);
    }

    public void a(Void void_, int n, Map<String, List<String>> map) {
        this.b.b.b.e.X.put(this.a.getId(), this.b.b.b.d);
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Void)object, n, map);
    }
}

