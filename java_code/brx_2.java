/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListSearchCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListSearchRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.ArticleApi
 *  com.ankama.shopi.client.model.ArticleSearchRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.ArticleApi;
import com.ankama.shopi.client.model.ArticleSearchRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from bRX
 */
public class brx_2 {
    static final Logger c = Logger.getLogger(brx_2.class);
    public static String a;
    public static List<bss_0<?, ?>> b;

    static void a(brw_2 brw_22, int n, int n2) {
        int n3 = n2 * (n - 1);
        int n4 = n3 + n2;
        int n5 = b.size();
        int n6 = Math.min(n4, n5);
        brw_22.a(n5, n5 <= n3 ? Collections.emptyList() : b.subList(n3, n6));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(brw_2 brw_22, String string, int n, int n2) {
        if (cbj_1.a()) {
            Class<bru_2> clazz = bru_2.class;
            synchronized (bru_2.class) {
                if (b != null && Objects.equals(string, a)) {
                    brx_2.a(brw_22, n, n2);
                    // ** MonitorExit[var4_4] (shouldn't be in output)
                    return;
                }
                ArticleApi articleApi = new ArticleApi(WakfuClient.e());
                try {
                    ArticleSearchRequest articleSearchRequest = new ArticleSearchRequest().text(string).limit(Integer.valueOf(100));
                    if (WakfuClient.a.n().p()) {
                        c.info((Object)("[SHOPI-DEBUG] searchArticles with following request : " + articleSearchRequest));
                    }
                    articleApi.searchArticlesAsync(cbj_1.b(), cbj_1.a, articleSearchRequest, (ApiCallback)new bry_2(brw_22, string, n, n2));
                }
                catch (ApiException apiException) {
                    c.error((Object)"Following error occured during searchArticles request", (Throwable)apiException);
                    brw_22.a();
                }
            }
        }
        ShopApi.articlesListSearchRequest articlesListSearchRequest2 = ShopApi.articlesListSearchRequest().text(string).page(Long.valueOf(n)).size(Long.valueOf(n2));
        ShopApi.articlesListSearchCallback articlesListSearchCallback2 = ShopApi.articlesListSearchCallback().on200(apiResponse -> brw_22.a(((ShopArticlesList)apiResponse.getData()).getTotalCount(), ((ShopArticlesList)apiResponse.getData()).getArticles().stream().map(bsp_2::a).filter(Objects::nonNull).filter(bss_0::o).collect(Collectors.toList()))).on403(apiResponse -> {
            brw_22.a();
            c.error((Object)("Error during ArticlesListSearch load : " + apiResponse));
        }).onDefault(apiResponse -> {
            brw_22.a();
            c.error((Object)("Error during ArticlesListSearch load : " + (String)apiResponse.getData()));
        }).onException(throwable -> {
            brw_22.a();
            c.error((Object)"Error during ArticlesListSearch load", throwable);
        });
        WakfuClient.c().sendAsync((ApiCallback.Request)articlesListSearchRequest2, (ApiCallback.Callback)articlesListSearchCallback2);
    }
}

