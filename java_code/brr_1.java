/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListByKeyCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListByKeyRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.ArticleApi
 *  com.ankama.shopi.client.model.ArticleByKeyRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.ArticleApi;
import com.ankama.shopi.client.model.ArticleByKeyRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bRR
 */
public class brr_1 {
    static final Logger a = Logger.getLogger(brr_1.class);

    public static void a(brq_0 brq_02, String string) {
        if (fis_1.a().c("demo")) {
            return;
        }
        if (cbj_1.a()) {
            ArticleApi articleApi = new ArticleApi(WakfuClient.e());
            try {
                ArticleByKeyRequest articleByKeyRequest = new ArticleByKeyRequest().key(string);
                if (WakfuClient.a.n().p()) {
                    a.info((Object)("[SHOPI-DEBUG] getArticleByKey with following request : " + articleByKeyRequest));
                }
                articleApi.getArticleByKeyAsync(cbj_1.b(), cbj_1.a, articleByKeyRequest, (ApiCallback)new brs_2(string, brq_02));
            }
            catch (ApiException apiException) {
                a.error((Object)("Following error occured during getArticleByKey request for" + string), (Throwable)apiException);
                brq_02.b();
            }
        } else {
            ShopApi.articlesListByKeyRequest articlesListByKeyRequest2 = ShopApi.articlesListByKeyRequest().key(Collections.singletonList(string));
            ShopApi.articlesListByKeyCallback articlesListByKeyCallback2 = ShopApi.articlesListByKeyCallback().on200(apiResponse -> {
                List<bss_0<?, ?>> list = bty_1.a(((ShopArticlesList)apiResponse.getData()).getArticles());
                if (list.isEmpty()) {
                    brq_02.a();
                } else {
                    brq_02.onArticleFound(list.get(0));
                }
            }).on403(apiResponse -> {
                brq_02.b();
                a.error((Object)("Error during loadArticleByKey for " + string + " : " + apiResponse));
            }).onDefault(apiResponse -> {
                brq_02.b();
                a.error((Object)("Error during loadArticleByKey for " + string + " : " + (String)apiResponse.getData()));
            }).onException(throwable -> {
                brq_02.b();
                a.error((Object)("Error during loadArticleByKey for " + string), throwable);
            });
            WakfuClient.c().sendAsync((ApiCallback.Request)articlesListByKeyRequest2, (ApiCallback.Callback)articlesListByKeyCallback2);
        }
    }
}

