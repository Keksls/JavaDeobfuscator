/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.auth.ApiKeyAuth
 *  com.ankama.haapi.client.okhttp.auth.Authentication
 *  com.ankama.shopi.client.auth.Authentication
 *  com.ankama.shopi.client.auth.HttpBearerAuth
 *  com.ankama.zaap.OverlayPosition
 *  com.ankama.zaap.ZaapClient
 *  com.ankama.zaap.ZaapParametersSources
 *  com.google.gson.GsonBuilder
 *  org.apache.log4j.Logger
 *  org.apache.thrift.TException
 *  org.jetbrains.annotations.NotNull
 */
import com.ankama.haapi.client.okhttp.auth.ApiKeyAuth;
import com.ankama.haapi.client.okhttp.auth.Authentication;
import com.ankama.shopi.client.auth.HttpBearerAuth;
import com.ankama.zaap.OverlayPosition;
import com.ankama.zaap.ZaapClient;
import com.ankama.zaap.ZaapParametersSources;
import com.ankamagames.wakfu.client.WakfuClient;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;
import org.jetbrains.annotations.NotNull;

public class emj {
    private static final Logger b = Logger.getLogger(emj.class);
    private static final String c = "demo";
    private static final String d = "local";
    public static final emj a = new emj();
    private ZaapClient e;
    private ZaapParametersSources f;
    private static final OverlayPosition g = new OverlayPosition(15, 15, 70, 70);

    public static void a() {
        String string = azs_0.a().a("branch");
        if (Cz.f(string)) {
            fis_1.a().a("branch", (Object)"null");
            fis_1.a().a(c, false);
            throw new gm_0("Property 'branch' can't be null");
        }
        fis_1.a().a("branch", (Object)string);
        fis_1.a().a(c, c.equals(string));
    }

    public static ZaapParametersSources b() {
        String string = fis_1.a().b("branch");
        return d.equals(string) ? ZaapParametersSources.FILE : ZaapParametersSources.ENV_VARIABLES;
    }

    public static void c() {
        ado_1.a().a(() -> {
            azu_0.j().a(dai_0.a);
            azu_0.j().a(cvv_0.a());
        });
    }

    public static void a(String string) {
        azu_0 azu_02 = azu_0.j();
        azu_02.d(string);
        azu_02.b(false);
        emj.d();
    }

    public static void d() {
        azu_0.j().a(dai_0.a);
        fzw_0.a.a("loginLock", false);
        azu_0.j().a(azp_0.b);
        ArrayList<QP> arrayList = azs_0.a().s();
        azu_0.j().a(arrayList);
    }

    public boolean e() {
        return this.e != null;
    }

    public void a(emi emi2) {
        this.a(emi2, ZaapParametersSources.ENV_VARIABLES);
    }

    public void a(emi emi2, ZaapParametersSources zaapParametersSources) {
        this.f = zaapParametersSources;
        this.a(() -> {
            block5: {
                try {
                    b.info((Object)("connect(" + zaapParametersSources + ")"));
                    this.e = ZaapClient.connect((ZaapParametersSources)this.f);
                    if (emi2 != null) {
                        emi2.a();
                    }
                }
                catch (TException tException) {
                    b.error((Object)"Error during Zaap init ", (Throwable)tException);
                    if (emi2 != null) {
                        emi2.a("thrift.exception");
                    }
                }
                catch (Exception exception) {
                    b.error((Object)"Error during Zaap init ", (Throwable)exception);
                    if (emi2 == null) break block5;
                    emi2.a("connect.exception");
                }
            }
            return this.e;
        }, emi2);
    }

    public void b(emi emi2) {
        if (this.e == null) {
            this.a(new emk(this, emi2), this.f);
            return;
        }
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        this.a(() -> {
            String string;
            block3: {
                string = null;
                try {
                    string = this.e.getClient().auth_getGameToken(this.e.session, 3);
                    b.info((Object)"Token received from Zaap");
                    azu_0.j().d(string);
                    if (emi2 != null) {
                        emi2.b(string);
                    }
                }
                catch (TException tException) {
                    b.error((Object)"Error during Zaap init ", (Throwable)tException);
                    if (emi2 == null) break block3;
                    emi2.a("token.exception");
                }
            }
            return string;
        }, emi2);
    }

    public void c(emi emi2) {
        if (this.e == null) {
            this.a(new eml(this, emi2), this.f);
            return;
        }
        this.a(() -> {
            String string;
            try {
                string = this.e.getClient().userInfo_get(this.e.session);
                b.info((Object)"User info received from Zaap");
            }
            catch (TException tException) {
                b.error((Object)"Error during Zaap init ", (Throwable)tException);
                if (emi2 != null) {
                    emi2.a("userInfo.exception");
                }
                return null;
            }
            if (Cz.f(string)) {
                b.error((Object)"User info received from Zaap are empty");
                if (emi2 != null) {
                    emi2.a("userInfo.missing");
                }
                return null;
            }
            try {
                emq emq2 = (emq)new GsonBuilder().create().fromJson(string, emq.class);
                if (emi2 != null) {
                    emi2.a(emq2);
                }
                return emq2;
            }
            catch (Exception exception) {
                b.error((Object)String.format("Mapping error for following user info received from Zaap : \"%s\"", string), (Throwable)exception);
                if (emi2 != null) {
                    emi2.a("userInfo.mapping");
                }
                return null;
            }
        }, emi2);
    }

    private <T> void a(Callable<T> callable, emi emi2) {
        block6: {
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<T> future = executorService.submit(callable);
            try {
                future.get(5L, TimeUnit.SECONDS);
            }
            catch (InterruptedException interruptedException) {
                b.error((Object)"Interruption while connecting to Zaap", (Throwable)interruptedException);
                if (emi2 != null) {
                    emi2.a("interrupted.exception");
                }
            }
            catch (ExecutionException executionException) {
                b.error((Object)"ExecutionException while connecting to Zaap", (Throwable)executionException);
                if (emi2 != null) {
                    emi2.a("execution.exception");
                }
            }
            catch (TimeoutException timeoutException) {
                b.error((Object)"Timeout while connecting to Zaap", (Throwable)timeoutException);
                executorService.shutdownNow();
                if (emi2 == null) break block6;
                emi2.a("timeout.exception");
            }
        }
    }

    public void a(int n, Consumer<emh> consumer) {
        if (this.e == null) {
            this.a(new emm(this, n, consumer), this.f);
            return;
        }
        ((CompletableFuture)CompletableFuture.supplyAsync(this.a(n)).thenAccept(bl -> {
            if (bl.booleanValue()) {
                consumer.accept(emh.a);
            } else {
                consumer.accept(emh.b);
            }
        })).exceptionally(throwable -> {
            if (throwable instanceof InterruptedException) {
                b.error((Object)("Interruption while purchasing article " + n + ": " + throwable.getMessage()));
                consumer.accept(emh.d);
                return null;
            }
            if (throwable instanceof ExecutionException) {
                b.error((Object)("ExecutionException while purchasing article " + n + ": " + throwable.getMessage()));
                consumer.accept(emh.e);
                return null;
            }
            if (throwable instanceof TimeoutException) {
                b.error((Object)("Timeout while purchasing article " + n + ": " + throwable.getMessage()));
                consumer.accept(emh.f);
                return null;
            }
            b.error((Object)("Error while purchasing article " + n), throwable);
            consumer.accept(emh.e);
            return null;
        });
    }

    @NotNull
    private Supplier<Boolean> a(int n) {
        return () -> {
            try {
                Authentication authentication = WakfuClient.c().getAuthentication("AuthAnkamaApiKey");
                if (!(authentication instanceof ApiKeyAuth)) {
                    b.error((Object)"Bad implementation of the zaap client API key retrieval");
                    return false;
                }
                int n2 = this.f();
                if (n2 == -1) {
                    return false;
                }
                boolean bl = this.e.getClient().payArticleWithPid(this.e.session, ((ApiKeyAuth)authentication).getApiKey(), n, n2, g);
                b.info((Object)String.format("Purchase result received from zaap for the article %s. Purchase was %ssuccessful", n, bl ? "" : "un"));
                return bl;
            }
            catch (TException tException) {
                b.info((Object)("Error during purchase of article " + n), (Throwable)tException);
                return false;
            }
        };
    }

    public void a(String string, Consumer<emh> consumer) {
        if (this.e == null) {
            this.a(new emn(this, string, consumer), this.f);
            return;
        }
        ((CompletableFuture)CompletableFuture.supplyAsync(this.c(string)).thenAccept(bl -> {
            if (bl.booleanValue()) {
                consumer.accept(emh.a);
            } else {
                consumer.accept(emh.b);
            }
        })).exceptionally(throwable -> {
            if (throwable instanceof InterruptedException) {
                b.error((Object)("Interruption while purchasing card " + string + ": " + throwable.getMessage()));
                consumer.accept(emh.d);
                return null;
            }
            if (throwable instanceof ExecutionException) {
                b.error((Object)("ExecutionException while purchasing card " + string + ": " + throwable.getMessage()));
                consumer.accept(emh.e);
                return null;
            }
            if (throwable instanceof TimeoutException) {
                b.error((Object)("Timeout while purchasing card " + string + ": " + throwable.getMessage()));
                consumer.accept(emh.f);
                return null;
            }
            b.error((Object)("Error while purchasing card " + string), throwable);
            consumer.accept(emh.e);
            return null;
        });
    }

    @NotNull
    private Supplier<Boolean> c(String string) {
        return () -> {
            try {
                com.ankama.shopi.client.auth.Authentication authentication = WakfuClient.e().getAuthentication("jwt");
                if (!(authentication instanceof HttpBearerAuth)) {
                    b.error((Object)"Bad implementation of the shopi JWT retrieval");
                    return false;
                }
                int n = this.f();
                if (n == -1) {
                    return false;
                }
                String string2 = this.e.session;
                String string3 = ((HttpBearerAuth)authentication).getBearerToken();
                String string4 = cbj_1.a.getValue();
                if (WakfuClient.a.n().p()) {
                    b.info((Object)("[SHOPI-DEBUG] payCartWithPid by zaap with following session : " + string2 + ", accessToken : " + string3 + ", shopKey: " + string4 + ", cartId : " + string + ", pid : " + n + ", position : " + g));
                }
                boolean bl = this.e.getClient().payCartWithPid(string2, string3, string4, string, n, g);
                b.info((Object)String.format("Purchase result received from zaap for the card %s. Purchase was %ssuccessful", string, bl ? "" : "un"));
                return bl;
            }
            catch (TException tException) {
                b.info((Object)("Error during purchase of card " + string), (Throwable)tException);
                return false;
            }
        };
    }

    private int f() {
        return Hw.e(ProcessHandle.current().pid());
    }

    public static void b(String string) {
        String string2 = bae.h().a("zaap.error." + string, new Object[0]);
        fzn_0 fzn_02 = new fzn_0(102, 0, string2, 2L);
        fzn_02.d(cfn_0.a(1));
        fpm_0.b().a(fzn_02);
    }
}

