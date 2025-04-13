/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.Cart
 *  org.jetbrains.annotations.NotNull
 */
import com.ankama.shopi.client.model.Cart;
import com.ankamagames.wakfu.client.WakfuClient;
import org.jetbrains.annotations.NotNull;

class ddR
implements btl_1 {
    final /* synthetic */ bsf_0 a;
    final /* synthetic */ bSO b;
    final /* synthetic */ bss_0 c;
    final /* synthetic */ ddO d;

    ddR(ddO ddO2, bsf_0 bsf_02, bSO bSO2, bss_0 bss_02) {
        this.d = ddO2;
        this.a = bsf_02;
        this.b = bSO2;
        this.c = bss_02;
    }

    @Override
    public void a(@NotNull Cart cart) {
        emj.a.a(cart.getId(), this.d.a(this.a.c(), this.a.a(), () -> {
            if (!WakfuClient.a.n().r()) {
                this.b.a(cart);
            }
        }));
    }

    @Override
    public void a(int n) {
        ddO.a.error((Object)("[SHOP] Unable to create cart for following " + this.c));
    }

    @Override
    public void a(Exception exception) {
        ddO.a.error((Object)("[SHOP] Unable to create cart for following " + this.c));
    }
}

