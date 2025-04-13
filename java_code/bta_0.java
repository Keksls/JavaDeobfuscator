/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.AnkamaFreePayment
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.AnkamaFreePayment;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bTa
 */
class bta_0
implements ApiCallback<AnkamaFreePayment> {
    final /* synthetic */ bsz_0 a;

    bta_0(bsz_0 bsz_02) {
        this.a = bsz_02;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bSO.s.error((Object)"Following error occured during createAnkamaOgrinePayment request", (Throwable)apiException);
        this.a.b.b.a(this.a.b.a, "freePayment" + n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(AnkamaFreePayment ankamaFreePayment, int n, Map<String, List<String>> map) {
        try {
            this.a.b.b.e.d(this.a.b.b.d);
            this.a.b.b.e.a(this.a.b.b.d);
        }
        catch (Exception exception) {
            bSO.s.error((Object)"Following error occured during createAnkamaOgrinePayment request", (Throwable)exception);
        }
        finally {
            this.a.b.b.e.l();
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((AnkamaFreePayment)object, n, map);
    }
}

