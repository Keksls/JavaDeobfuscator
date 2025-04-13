/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.Cart
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.Cart;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bSW
 */
class bsw_1
implements ApiCallback<Cart> {
    final /* synthetic */ btl_1 a;
    final /* synthetic */ bSO b;

    bsw_1(bSO bSO2, btl_1 btl_12) {
        this.b = bSO2;
        this.a = btl_12;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bSO.s.error((Object)"Following error occured during createCart request", (Throwable)apiException);
        this.a.a(n);
    }

    public void a(Cart cart, int n, Map<String, List<String>> map) {
        this.a.a(cart);
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Cart)object, n, map);
    }
}

