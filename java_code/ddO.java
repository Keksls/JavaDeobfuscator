/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.auth.ApiKeyAuth
 *  com.ankama.haapi.client.okhttp.auth.Authentication
 *  com.ankama.shopi.client.auth.Authentication
 *  com.ankama.shopi.client.auth.HttpBearerAuth
 *  com.ankamagames.steam.wrapper.SteamApi
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.haapi.client.okhttp.auth.ApiKeyAuth;
import com.ankama.haapi.client.okhttp.auth.Authentication;
import com.ankama.shopi.client.auth.HttpBearerAuth;
import com.ankamagames.steam.wrapper.SteamApi;
import com.ankamagames.wakfu.client.WakfuClient;
import gnu.trove.set.hash.THashSet;
import java.text.ParseException;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ddO
implements ahr_1 {
    static final ddO b = new ddO();
    protected static final Logger a = Logger.getLogger(ddO.class);
    final THashSet<String> c = new THashSet();
    private static final int d = 5000;
    private static final int e = 500;
    private static final int f = 10000;
    private static final long g = 10000L;
    fsQ h;
    int i;
    long j;
    long k;
    private long l;
    bSO m;
    ddX n;
    private boolean o = false;
    private boolean p;
    private ans_1 q;
    private final Runnable r = new ddp_0(this);

    public static ddO a() {
        return b;
    }

    private ddO() {
    }

    public void a(boolean bl) {
        this.p = bl;
    }

    public void c() {
        this.b(true);
    }

    public void b(boolean bl) {
        if (this.c.contains((Object)"webShopDialog")) {
            fpm_0.b().o("webShopDialog");
        } else {
            this.c(bl);
        }
    }

    @NotNull
    public ddY d() {
        block9: {
            if (!enp_2.a.d(ens_2.m)) {
                return ddY.b;
            }
            if (bPL.a.e() && !bPL.a.d()) {
                return ddY.c;
            }
            if (cbj_1.a()) {
                com.ankama.shopi.client.auth.Authentication authentication = WakfuClient.e().getAuthentication("jwt");
                if (!(authentication instanceof HttpBearerAuth)) {
                    a.error((Object)"Bad implementation of the shopi JWT retrieval");
                    return ddY.d;
                }
                try {
                    if (((HttpBearerAuth)authentication).getBearerToken() == null) {
                        return ddY.d;
                    }
                    break block9;
                }
                catch (NullPointerException nullPointerException) {
                    a.warn((Object)(nullPointerException.getClass() + " occured during jwt retrieval"));
                    return ddY.d;
                }
            }
            Authentication authentication = WakfuClient.c().getAuthentication("AuthAnkamaApiKey");
            if (!(authentication instanceof ApiKeyAuth)) {
                a.error((Object)"Bad implementation of the zaap client API key retrieval");
                return ddY.d;
            }
            if (((ApiKeyAuth)authentication).getApiKey() == null) {
                return ddY.d;
            }
        }
        return ddY.a;
    }

    public void c(boolean bl) {
        if (!this.a(bl, true)) {
            return;
        }
        add_2.b().a(new dfc(17509));
    }

    public void a(bss_0<?, ?> bss_02) {
        if (!this.a(false, true)) {
            return;
        }
        add_2.b().a(new dhg_0(19006, bss_02));
    }

    public void e() {
        if (!this.a(false, true)) {
            return;
        }
        add_2.b().a(new dfc(17389));
    }

    public void a(int n, boolean bl) {
        if (!this.a(false, false)) {
            a.error((Object)("Unable to initialiaze on steamFinalizeTxn, wait what ? (orderId : " + n + ", authorized : " + bl + ")"));
            return;
        }
        dfc dfc2 = new dfc(19065);
        dfc2.b(n);
        dfc2.a(bl);
        add_2.b().a(dfc2);
    }

    public void a(String string) {
        this.c.add((Object)string);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17509: {
                this.a("webShopDialog", "webShopDialog");
                this.g();
                return false;
            }
            case 19006: {
                dhg_0 dhg_02 = (dhg_0)adt_12;
                bss_0<?, ?> bss_02 = dhg_02.k();
                String string = this.a(bss_02.a());
                ddQ ddQ2 = new ddQ(this, string, bss_02);
                fpm_0.b().a(ddQ2);
                this.a(string, "webShopArticleDialog");
                this.m.b(bss_02);
                fis_1.a().a("webShop.article", bss_02, string);
                return false;
            }
            case 17389: {
                this.a("webShopDialog", "webShopDialog");
                this.g();
                this.m.a();
                return false;
            }
            case 19329: {
                dfc dfc2 = (dfc)adt_12;
                int n = dfc2.c();
                this.a(n);
                return false;
            }
            case 16208: {
                bSt<?> bSt2 = this.m.a("ogrins");
                if (bSt2 != null) {
                    this.m.a(bSt2);
                    this.m.c("");
                    return false;
                }
                String string = azs_0.a().a("shopBuyOgrinesUrl", (String)null);
                String string2 = String.format(string, bae.h().f().i());
                aii_1.a(string2);
                ado_1.a().b(this.r);
                ado_1.a().a(this.r, 10000L, -1);
                return false;
            }
            case 18903: {
                String string = azs_0.a().a("shopServices", (String)null);
                String string3 = String.format(string, bae.h().f().i(), bae.h().a("webShop.title.short", new Object[0]).toLowerCase(), ((dhh_0)adt_12).k());
                aii_1.a(string3);
                return false;
            }
            case 19506: {
                String string = ((dfc)adt_12).h();
                if (string == null) {
                    return false;
                }
                aii_1.a(string);
                return false;
            }
            case 19065: {
                dfc dfc3 = (dfc)adt_12;
                int n = dfc3.c();
                boolean bl = dfc3.i();
                this.m.a(n, bl);
                if (this.c.isEmpty()) {
                    azu_0.j().b(b);
                }
                return false;
            }
            case 16425: {
                this.m.a();
                return false;
            }
            case 18648: {
                byte by = ((anw_1)adt_12).b();
                btv_0 btv_02 = btv_0.a(by);
                this.m.b().a(btv_02);
                return false;
            }
            case 19022: {
                this.m.b().g();
                return false;
            }
            case 18295: {
                this.m.b().h();
                return false;
            }
            case 18798: {
                dfc dfc4 = (dfc)adt_12;
                btq_1 btq_12 = this.m.b();
                btq_12.a(dfc4.d());
                return false;
            }
            case 19193: {
                dfc dfc5 = (dfc)adt_12;
                btq_1 btq_13 = this.m.b();
                try {
                    btq_13.b(bae.h().f(dfc5.h()));
                }
                catch (ParseException parseException) {
                    a.error((Object)"Error parsing price to sell conversion stone", (Throwable)parseException);
                }
                return false;
            }
            case 19156: {
                dfc dfc6 = (dfc)adt_12;
                this.m.b().b((btp_1)dfc6.j());
                return false;
            }
            case 19097: {
                this.m.b().b();
                return false;
            }
            case 19610: {
                this.m.b().c();
                return false;
            }
            case 16243: {
                this.m.b().e();
                return false;
            }
            case 16073: {
                this.m.b().a((btp_1)((anw_1)adt_12).j());
                return false;
            }
            case 16330: {
                this.m.b().i();
                return false;
            }
            case 19954: {
                if (this.o) {
                    return false;
                }
                this.o = true;
                Cm cm = (Cm)((dfc)adt_12).j();
                bss_0 bss_03 = (bss_0)cm.a();
                if (bss_03 == null) {
                    a.error((Object)"Cannot purchase a null article");
                    return false;
                }
                if (bss_03 instanceof bsa_0) {
                    bsa_0 bsa_02 = (bsa_0)bss_03;
                    emj.a.a((Integer)bsa_02.a(), this.a(bsa_02.c(), bsa_02.a()));
                } else if (bss_03 instanceof bsf_0) {
                    bsf_0 bsf_02 = (bsf_0)bss_03;
                    bSO bSO2 = (bSO)cm.b();
                    if (bSO2 == null) {
                        a.error((Object)"Cannot purchase an article without session");
                        return false;
                    }
                    bSO2.a(bsf_02, new ddR(this, bsf_02, bSO2, bss_03));
                } else {
                    a.error((Object)("[SHOP] Unable to buy following " + bss_03));
                }
                return false;
            }
        }
        return true;
    }

    public bSO f() {
        return this.m;
    }

    private boolean a(boolean bl, boolean bl2) {
        if (!azu_0.j().c(this)) {
            ddY ddY2;
            if (bl2 && !(ddY2 = this.d()).a()) {
                switch (ddY2) {
                    case b: {
                        fzn_0 fzn_02 = new fzn_0(102, 0, bae.h().a("shop.disabled", new Object[0]), 2L);
                        fpm_0.b().a(fzn_02);
                        break;
                    }
                    case c: {
                        fzn_0 fzn_03 = new fzn_0(102, 0, bae.h().a("steam.needOverlayForShop", new Object[0]), 2L);
                        fpm_0.b().a(fzn_03);
                        break;
                    }
                    case d: {
                        fzn_0 fzn_04 = new fzn_0(102, 0, bae.h().a("shop.missingAuth", new Object[0]), 2L);
                        fpm_0.b().a(fzn_04);
                        if (this.l != -1L && System.currentTimeMillis() - this.l < 10000L) break;
                        azu_0.j().K().c(new cbv_0(bae.h().f().h()));
                        this.l = System.currentTimeMillis();
                        break;
                    }
                    default: {
                        a.warn((Object)("Following " + ddY.class.getName() + " not managed"));
                    }
                }
                return false;
            }
            this.a(bl);
            azu_0.j().a(this);
        } else if (bl) {
            this.m.j();
        }
        return true;
    }

    private void a(String string, String string2) {
        if (!this.c.contains((Object)string)) {
            fpm_0.b().a(string, cfi_0.a(string2), 32768L, (short)10000);
            this.c.add((Object)string);
        }
    }

    private void g() {
        fyy_0 fyy_02 = fpm_0.b().h().d("webShopDialog");
        if (fyy_02 == null) {
            return;
        }
        this.h = (fsQ)fyy_02.a("bannerList");
        if (this.h == null) {
            return;
        }
        this.h.setScrollMode(fqv_0.b);
        this.h.setScrollOnMouseWheel(false);
        this.j = System.currentTimeMillis();
        this.n = new ddX(this);
        ado_1.a().a(this.n, 250L, -1);
    }

    private void a(int n) {
        if (!this.n.a) {
            return;
        }
        int n2 = (this.i % this.m.c() + this.m.c()) % this.m.c();
        this.a(n, n2);
        this.k = System.currentTimeMillis();
    }

    void a(int n, int n2) {
        if (this.h == null) {
            return;
        }
        this.h.removeTweensOfType(fjn_2.class);
        fjn_2 fjn_22 = new fjn_2(n2, n, this.h, 0, 500, fjw_2.b);
        fjn_22.a(new ddS(this));
        this.h.addTween(fjn_22);
    }

    private String a(Object object) {
        return "webShopArticleDialog" + object;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.q = new ddT(this);
            this.d(this.p);
            fpm_0.b().a(this.q);
            fpm_0.b().a("wakfu.webShop", cKf.class);
        }
    }

    public void d(boolean bl) {
        this.m = new bSO();
        this.m.a(new ddu_0(this), bl);
        fis_1.a().a("webShop", this.m);
        this.o = false;
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.q);
            for (String string : this.c) {
                fpm_0.b().o(string);
            }
            this.c.clear();
            fpm_0.b().e("wakfu.webShop");
            fis_1.a().a("webShop");
            cnp_0 cnp_02 = new cnp_0();
            cnp_02.a(bae.h().f().i());
            azu_0.j().K().c(cnp_02);
            ado_1.a().b(this.r);
            this.m = null;
            this.o = false;
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void b(String string) {
        if (!fpm_0.b().q("webShopDialog")) {
            this.c(false);
            if (this.m.m()) {
                this.c(string);
            } else {
                this.m.a(new ddV(this, string));
            }
        } else {
            this.c(string);
        }
    }

    void c(String string) {
        this.m.a(this.m.a(string));
        this.m.c("");
    }

    private Consumer<emh> a(String string, Object object) {
        return this.a(string, object, null);
    }

    Consumer<emh> a(String string, Object object, @Nullable Runnable runnable) {
        return emh2 -> {
            this.o = false;
            if (emh2 != emh.a && runnable != null) {
                runnable.run();
            }
            switch (emh2) {
                case a: {
                    return;
                }
                case b: {
                    return;
                }
                case d: {
                    try {
                        String string2 = azs_0.a().a("payementHandleUrl");
                        String string3 = String.format(string2, bae.h().f().i(), string, bae.h().a("webShop.title.short", new Object[0]).toLowerCase(), object);
                        if (bPL.a.e()) {
                            SteamApi.SteamFriends().ActivateGameOverlayToWebPage(string3);
                            break;
                        }
                        aii_1.a(string3);
                        break;
                    }
                    catch (gm_0 gm_02) {
                        a.error((Object)"Failed to open browser shop", (Throwable)gm_02);
                    }
                }
                default: {
                    fpm_0.b().a(bae.h().a("webShop.oneClick.error", -3), cfn_0.a(7), 1027L, 102, 1);
                }
            }
        };
    }
}

