/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.Article
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.Article;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bRS
 */
class brs_2
implements ApiCallback<Article> {
    final /* synthetic */ String a;
    final /* synthetic */ brq_0 b;

    brs_2(String string, brq_0 brq_02) {
        this.a = string;
        this.b = brq_02;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        switch (n) {
            case 404: {
                brr_1.a.info((Object)("Article with following key " + this.a + " isn't found"));
                this.b.a();
                break;
            }
            default: {
                brr_1.a.error((Object)("Following error occured during getArticleByKey request for " + this.a), (Throwable)apiException);
                this.b.b();
            }
        }
    }

    public void a(Article article, int n, Map<String, List<String>> map) {
        bsf_0 bsf_02 = bsp_2.a(article);
        if (bsf_02 != null) {
            this.b.onArticleFound(bsf_02);
        } else {
            this.b.a();
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Article)object, n, map);
    }
}

