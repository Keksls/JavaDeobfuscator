/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$homeCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$homeRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopHome
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.CategoryApi
 *  com.ankama.shopi.client.api.PromoteApi
 *  com.ankama.shopi.client.model.ShopKey
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopHome;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.CategoryApi;
import com.ankama.shopi.client.api.PromoteApi;
import com.ankama.shopi.client.model.ShopKey;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSc
 */
public class bsc_2 {
    static final Logger a = Logger.getLogger(bsc_2.class);

    private bsc_2() {
    }

    private static void b(@Nullable bsb_2 bsb_22, @Nullable bsa_2 bsa_22) {
        ShopApi.homeRequest homeRequest2 = ShopApi.homeRequest();
        ShopApi.homeCallback homeCallback2 = ShopApi.homeCallback().on200(apiResponse -> {
            List<ajh_1> list;
            if (bsa_22 != null) {
                list = bty_1.b(((ShopHome)apiResponse.getData()).getCategories());
                bsa_22.a(list);
            }
            if (bsb_22 != null) {
                list = bty_1.a(((ShopHome)apiResponse.getData()).getGondolaheadArticle());
                List<bsv_0<?, ?>> list2 = bsp_2.a(((ShopHome)apiResponse.getData()).getHightlightCarousel());
                List<bsv_0<?, ?>> list3 = bsp_2.a(((ShopHome)apiResponse.getData()).getHightlightImage());
                bsb_22.a(list2, list3, list);
            }
        }).onDefault(apiResponse -> {
            a.warn((Object)("Error " + apiResponse.getStatusCode() + " while retrieving shop home: " + (String)apiResponse.getData()));
            if (bsa_22 != null) {
                bsa_22.a();
            }
            if (bsb_22 != null && bsb_22 != bsa_22) {
                bsb_22.a();
            }
        }).onException(throwable -> {
            a.error((Object)"Error while retrieving shop home", throwable);
            if (bsa_22 != null) {
                bsa_22.a();
            }
            if (bsb_22 != null && bsb_22 != bsa_22) {
                bsb_22.a();
            }
        });
        WakfuClient.c().sendAsync((ApiCallback.Request)homeRequest2, (ApiCallback.Callback)homeCallback2);
    }

    private static void a(@NotNull bsb_2 bsb_22) {
        PromoteApi promoteApi = new PromoteApi(WakfuClient.e());
        try {
            if (WakfuClient.a.n().p()) {
                a.info((Object)"[SHOPI-DEBUG] getHomePagePromoteGroup");
            }
            promoteApi.getHomePagePromoteGroupAsync(cbj_1.b(), cbj_1.a, (ApiCallback)new bsd_2(bsb_22));
        }
        catch (ApiException apiException) {
            a.error((Object)"Following error occured during getHomePhagePromoteGroup request", (Throwable)apiException);
            bsb_22.a();
        }
    }

    private static void b(@NotNull bsa_2 bsa_22) {
        CategoryApi categoryApi = new CategoryApi(WakfuClient.e());
        try {
            int n = 100;
            boolean bl = true;
            String string = "0";
            if (WakfuClient.a.n().p()) {
                a.info((Object)"[SHOPI-DEBUG] listCategories with following limit : 100, page : 1, parentCategoryId: 0");
            }
            categoryApi.listCategoriesAsync(cbj_1.b(), ShopKey.WAKFU_INGAME, Integer.valueOf(100), Integer.valueOf(1), "0", (ApiCallback)new bse_2(bsa_22));
        }
        catch (ApiException apiException) {
            a.error((Object)"Exception occured during retrieval of categories", (Throwable)apiException);
            bsa_22.a();
        }
    }

    public static void a(@NotNull bsa_2 bsa_22) {
        if (cbj_1.a()) {
            bsc_2.b(bsa_22);
        } else {
            bsc_2.b(null, bsa_22);
        }
    }

    public static void a(@NotNull bsb_2 bsb_22, @Nullable bsa_2 bsa_22) {
        if (cbj_1.a()) {
            if (bsa_22 != null) {
                bsc_2.b(bsa_22);
            }
            bsc_2.a(bsb_22);
        } else {
            bsc_2.b(bsb_22, bsa_22);
        }
    }
}

