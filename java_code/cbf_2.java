/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  io.sentry.Sentry
 *  io.sentry.SentryClient
 *  io.sentry.context.Context
 *  io.sentry.event.User
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Maps;
import io.sentry.Sentry;
import io.sentry.SentryClient;
import io.sentry.context.Context;
import io.sentry.event.User;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;

/*
 * Renamed from cbf
 */
public final class cbf_2 {
    private static final Logger a = Logger.getLogger(cbf_2.class);
    private static final Set<Long> b = Stream.of(38L, 48L).collect(Collectors.toCollection(HashSet::new));
    private static boolean c = false;

    private cbf_2() {
    }

    public static void a() {
        SentryClient sentryClient = null;
        try {
            sentryClient = Sentry.getStoredClient();
        }
        catch (Exception exception) {
            a.error((Object)"Failed to initialize sentry client", (Throwable)exception);
        }
        if (sentryClient == null) {
            return;
        }
        Context context = Sentry.getContext();
        context.addTag("os", System.getProperty("os.name"));
        context.addTag("os_arch", System.getProperty("os.arch"));
        context.addTag("os_version", System.getProperty("os.version"));
        context.addTag("java_vendor", System.getProperty("java.vendor"));
        context.addTag("java_version", System.getProperty("java.version"));
        context.addTag("version", epj.f);
        String string2 = System.getProperty("user.name");
        Optional<String> optional = azm_0.b();
        Optional<String> optional2 = azm_0.c();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("user", string2);
        optional.ifPresent(string -> hashMap.put("hostname", (String)string));
        optional2.ifPresent(string -> hashMap.put("mac", (String)string));
        String string3 = azm_0.a().orElse(string2);
        User user = new User(null, string3, null, null, hashMap);
        context.setUser(user);
    }

    public static void b() {
        if (Sentry.getStoredClient() == null) {
            return;
        }
        Context context = Sentry.getContext();
        context.addTag("partner", eoW.a().b());
    }

    public static void a(Locale locale) {
        if (Sentry.getStoredClient() == null) {
            return;
        }
        Context context = Sentry.getContext();
        context.addTag("locale", locale.toString());
    }

    public static void a(HashMap<String, String> hashMap) {
        if (Sentry.getStoredClient() == null) {
            return;
        }
        Context context = Sentry.getContext();
        context.addTag("gl_version", hashMap.get("Version"));
        context.addTag("gl_vendor", hashMap.get("Vendor"));
        context.addTag("gl_renderer", hashMap.get("Renderer"));
    }

    public static void a(bai_0 bai_02) {
        if (Sentry.getStoredClient() == null) {
            return;
        }
        String string = String.valueOf(bai_02.u());
        String string2 = bai_02.r();
        Context context = Sentry.getContext();
        User user = context.getUser();
        HashMap hashMap = Maps.newHashMap((Map)user.getData());
        hashMap.put("nickname", string2);
        context.setUser(new User(string, user.getUsername(), user.getIpAddress(), user.getEmail(), (Map)hashMap));
        context.addTag("has_hero_in_party", "0");
        context.addTag("has_own_hero_in_party", "0");
        context.addTag("has_sidekick_in_party", "0");
        context.addTag("has_own_sidekick_in_party", "0");
        context.addTag("is_player_turn", "0");
        context.addTag("is_in_fight", "0");
        context.addTag("is_in_fight_spectator", "0");
    }

    public static void a(String string) {
        if (Sentry.getStoredClient() == null) {
            return;
        }
        Context context = Sentry.getContext();
        context.addTag("server_id", string);
    }

    public static void a(bmr_1 bmr_12) {
        if (Sentry.getStoredClient() == null) {
            return;
        }
        Context context = Sentry.getContext();
        if (bmr_12 == null) {
            context.removeTag("character_id");
            context.removeTag("character_breed");
        } else {
            context.addTag("character_id", String.valueOf(bmr_12.a_()));
            context.addTag("character_breed", String.valueOf(bmr_12.gO()));
        }
    }

    public static void a(String string, boolean bl) {
        if (Sentry.getStoredClient() == null) {
            return;
        }
        Sentry.getContext().addTag(string, bl ? "1" : "0");
    }

    public static boolean c() {
        return c;
    }

    public static void b(bai_0 bai_02) {
        if (bai_02 == null) {
            return;
        }
        long l = bai_02.u() % 100L;
        if (!b.contains(l) && ans_0.D().P()) {
            return;
        }
        c = true;
    }

    public static void d() {
        if (!ans_0.D().P()) {
            c = false;
        }
    }
}

