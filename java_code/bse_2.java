/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.CategoryList
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.CategoryList;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bSe
 */
class bse_2
implements ApiCallback<CategoryList> {
    final /* synthetic */ bsa_2 a;

    bse_2(bsa_2 bsa_22) {
        this.a = bsa_22;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bsc_2.a.error((Object)"Following error occured during listCategories request", (Throwable)apiException);
        this.a.a();
    }

    public void a(CategoryList categoryList, int n, Map<String, List<String>> map) {
        this.a.a(cbj_1.b(categoryList.getValues()));
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((CategoryList)object, n, map);
    }
}

