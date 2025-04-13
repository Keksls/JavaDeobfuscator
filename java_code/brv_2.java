/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.ArticleList
 *  com.ankama.shopi.client.model.CatalogPage
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.ArticleList;
import com.ankama.shopi.client.model.CatalogPage;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bRV
 */
class brv_2
implements ApiCallback<CatalogPage> {
    final /* synthetic */ brt_2 a;

    brv_2(brt_2 brt_22) {
        this.a = brt_22;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bru_2.a.error((Object)("Following error (status code : " + n + ") occured during listArticles request"), (Throwable)apiException);
        this.a.a();
    }

    public void a(CatalogPage catalogPage, int n, Map<String, List<String>> map) {
        ArticleList articleList = catalogPage.getArticles();
        this.a.a(articleList.getCount().intValue(), cbj_1.a(articleList.getValues()));
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((CatalogPage)object, n, map);
    }
}

