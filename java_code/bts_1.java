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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/*
 * Renamed from bTs
 */
class bts_1
implements ApiCallback<Article> {
    final /* synthetic */ Consumer a;
    final /* synthetic */ btq_1 b;

    bts_1(btq_1 btq_12, Consumer consumer) {
        this.b = btq_12;
        this.a = consumer;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        btq_1.b.error((Object)"Following error occured during getArticleByKey request", (Throwable)apiException);
    }

    public void a(Article article, int n, Map<String, List<String>> map) {
        bsf_0 bsf_02 = bsp_2.a(article);
        this.a.accept(bsf_02 != null ? Collections.singletonList(bsf_02) : Collections.emptyList());
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Article)object, n, map);
    }
}

