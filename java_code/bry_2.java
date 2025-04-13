/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.ArticleList
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.ArticleList;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bRY
 */
class bry_2
implements ApiCallback<ArticleList> {
    final /* synthetic */ brw_2 a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    bry_2(brw_2 brw_22, String string, int n, int n2) {
        this.a = brw_22;
        this.b = string;
        this.c = n;
        this.d = n2;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        brx_2.c.error((Object)"Following error occured during searchArticles request", (Throwable)apiException);
        this.a.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ArticleList articleList, int n, Map<String, List<String>> map) {
        Class<bru_2> clazz = bru_2.class;
        synchronized (bru_2.class) {
            brx_2.a = this.b;
            brx_2.b = cbj_1.a(articleList.getValues());
            brx_2.a(this.a, this.c, this.d);
            // ** MonitorExit[var4_4] (shouldn't be in output)
            return;
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((ArticleList)object, n, map);
    }
}

