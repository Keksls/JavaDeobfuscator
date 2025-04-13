/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi$markAsReadCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi$markAsReadRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.CmsPollInGame
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi;
import com.ankama.haapi.client.okhttp.ankama.model.CmsPollInGame;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from dcb
 */
public class dcb_0
implements ahr_1 {
    private static final dcb_0 a = new dcb_0();
    private ans_1 b;
    private static final Logger c = Logger.getLogger(dcb_0.class);

    private dcb_0() {
    }

    public static dcb_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17225: {
                bvn_0 bvn_02 = (bvn_0)fis_1.a().f("pollView").f();
                if (bvn_02 == null) {
                    return false;
                }
                String string = bvn_02.b();
                if (Cz.f(string)) {
                    return false;
                }
                azu_0.j().b(a);
                aii_1.a(string);
                dcb_0.b(bvn_02.a());
                return false;
            }
            case 16344: {
                bvn_0 bvn_03 = (bvn_0)fis_1.a().f("pollView").f();
                if (bvn_03 == null) {
                    return false;
                }
                azu_0.j().b(a);
                dcb_0.b(bvn_03.a());
                return false;
            }
        }
        return true;
    }

    private static void b(long l) {
        CmsPollInGameApi.markAsReadRequest markAsReadRequest2 = CmsPollInGameApi.markAsReadRequest().item(Long.valueOf(l));
        CmsPollInGameApi.markAsReadCallback markAsReadCallback2 = CmsPollInGameApi.markAsReadCallback().on200(apiResponse -> c.info((Object)("Poll " + l + " answered"))).onDefault(apiResponse -> c.error((Object)("Error " + apiResponse.getStatusCode() + "  when answering poll: " + (String)apiResponse.getData()))).onException(throwable -> c.error((Object)"Error when answering poll", throwable));
        WakfuClient.c().sendAsync((ApiCallback.Request)markAsReadRequest2, (ApiCallback.Callback)markAsReadCallback2);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.b = string -> {
                if (string.equals("pollNotificationDialog")) {
                    azu_0.j().b(a);
                }
            };
            fpm_0.b().a(this.b);
            fpm_0.b().a("pollNotificationDialog", cfi_0.a("pollNotificationDialog"), 1L, (short)10000);
            cdw_0.n().c(600012L);
            fpm_0.b().a("wakfu.pollNotifications", cJk.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.b);
            fpm_0.b().o("pollNotificationDialog");
            fis_1.a().a("pollView");
            cdw_0.n().c(600013L);
            fpm_0.b().e("wakfu.pollNotifications");
        }
    }

    public static void a(List<CmsPollInGame> list) {
        if (list.isEmpty()) {
            return;
        }
        Optional<CmsPollInGame> optional = list.stream().filter(dcb_0::a).findFirst();
        if (optional.isEmpty()) {
            return;
        }
        CmsPollInGame cmsPollInGame = optional.get();
        bvn_0 bvn_02 = new bvn_0(cmsPollInGame);
        fis_1.a().a("pollView", bvn_02);
        azu_0.j().a(a);
    }

    private static boolean a(CmsPollInGame cmsPollInGame) {
        if (Cz.f(cmsPollInGame.getCriterion())) {
            return true;
        }
        apc_2 apc_22 = dcb_0.b(cmsPollInGame);
        if (apc_22 == null) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        return apc_22.b(bmr_12, bmr_12.P_(), null, bmr_12.Q_());
    }

    private static apc_2 b(CmsPollInGame cmsPollInGame) {
        try {
            return eyS.c(cmsPollInGame.getCriterion());
        }
        catch (Exception exception) {
            c.error((Object)("Error when compiling the poll " + cmsPollInGame.getItemId() + " criterion"), (Throwable)exception);
            return null;
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

