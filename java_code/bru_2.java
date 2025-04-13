/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListByCategoryCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$articlesListByCategoryRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.CatalogApi
 *  com.ankama.shopi.client.model.GetCatalogPageRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopArticlesList;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.CatalogApi;
import com.ankama.shopi.client.model.GetCatalogPageRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import org.apache.log4j.Logger;

/*
 * Renamed from bRU
 */
public class bru_2 {
    static final Logger a = Logger.getLogger(bru_2.class);

    public static void a(brt_2 brt_22, Object object, int n, int n2) {
        if (cbj_1.a()) {
            CatalogApi catalogApi = new CatalogApi(WakfuClient.e());
            try {
                GetCatalogPageRequest getCatalogPageRequest = new GetCatalogPageRequest().categoryId(String.valueOf(object)).limit(Integer.valueOf(n2)).page(Integer.valueOf(n));
                if (WakfuClient.a.n().p()) {
                    a.info((Object)("[SHOPI-DEBUG] getCatalogPage with following request : " + getCatalogPageRequest));
                }
                catalogApi.getCatalogPageAsync(cbj_1.b(), cbj_1.a, getCatalogPageRequest, (ApiCallback)new brv_2(brt_22));
            }
            catch (ApiException apiException) {
                a.error((Object)"Following error occured during listArticles request", (Throwable)apiException);
                brt_22.a();
            }
        } else {
            ShopApi.articlesListByCategoryRequest articlesListByCategoryRequest2 = ShopApi.articlesListByCategoryRequest().categoryId(Long.valueOf(object instanceof Number ? ((Number)object).longValue() : Long.parseLong(String.valueOf(object)))).page(Long.valueOf(n)).size(Long.valueOf(n2));
            ShopApi.articlesListByCategoryCallback articlesListByCategoryCallback2 = ShopApi.articlesListByCategoryCallback().on200(apiResponse -> brt_22.a(((ShopArticlesList)apiResponse.getData()).getTotalCount(), bty_1.a(((ShopArticlesList)apiResponse.getData()).getArticles()))).on403(apiResponse -> {
                brt_22.a();
                a.error((Object)("Error during articlesListByCategoryRequest load : " + apiResponse));
            }).onDefault(apiResponse -> {
                brt_22.a();
                a.error((Object)("Error during articlesListByCategoryRequest load : " + (String)apiResponse.getData()));
            }).onException(throwable -> {
                brt_22.a();
                a.error((Object)"Error during articlesListByCategoryRequest load", throwable);
            });
            WakfuClient.c().sendAsync((ApiCallback.Request)articlesListByCategoryRequest2, (ApiCallback.Callback)articlesListByCategoryCallback2);
        }
    }
}

