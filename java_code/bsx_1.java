/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.CartApi
 *  com.ankama.shopi.client.model.Cart
 *  com.ankama.shopi.client.model.Language
 *  com.ankama.shopi.client.model.ShopKey
 *  org.jetbrains.annotations.NotNull
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.CartApi;
import com.ankama.shopi.client.model.Cart;
import com.ankama.shopi.client.model.Language;
import com.ankama.shopi.client.model.ShopKey;
import com.ankamagames.wakfu.client.WakfuClient;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bSX
 */
class bsx_1
implements btl_1 {
    final /* synthetic */ CartApi a;
    final /* synthetic */ Language b;
    final /* synthetic */ ShopKey c;
    final /* synthetic */ bsf_0 d;
    final /* synthetic */ bSO e;

    bsx_1(bSO bSO2, CartApi cartApi, Language language, ShopKey shopKey, bsf_0 bsf_02) {
        this.e = bSO2;
        this.a = cartApi;
        this.b = language;
        this.c = shopKey;
        this.d = bsf_02;
    }

    @Override
    public void a(@NotNull Cart cart) {
        try {
            if (WakfuClient.a.n().p()) {
                bSO.s.info((Object)("[SHOPI-DEBUG] listPaymentMode with following cart : \"" + cart.getId()));
            }
            this.a.listPaymentModeAsync(this.b, this.c, cart.getId(), (ApiCallback)new bsy_1(this, cart));
        }
        catch (ApiException apiException) {
            bSO.s.error((Object)"Following error occured during listPaymentMode request", (Throwable)apiException);
            this.a(cart, "listPaymentModeException");
        }
    }

    @Override
    public void a(int n) {
        this.e.e("cartCreation" + n);
    }

    @Override
    public void a(Exception exception) {
        this.e.e("cartCreationException");
    }

    void a(@NotNull Cart cart, String string) {
        if (!WakfuClient.a.n().r()) {
            this.e.a(this.a, this.b, this.c, cart);
        }
        this.e.e(string);
    }
}

