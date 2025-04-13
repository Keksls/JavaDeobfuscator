/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aUh {
    public static final Pattern a = Pattern.compile(" ");

    public static void a(String string, String string2) {
        String string3 = aUh.c(string);
        if (string3 == null) {
            return;
        }
        ckq_0 ckq_02 = new ckq_0();
        ckq_02.b(string2);
        ckq_02.a(string3);
        azu_0.j().K().c(ckq_02);
    }

    public static void a(String string) {
        String[] stringArray = a.split(string, 2);
        aUh.a("error.chat.commandNotFound", new Object[]{stringArray[0]});
    }

    public static boolean a() {
        return aUh.a(null, eAO.e);
    }

    public static boolean a(String string, eAO eAO2) {
        boolean bl = eAQ.a().a(aUJ.a, string, eAO2);
        if (bl) {
            aUh.a("error.chat.flood", new Object[0]);
        }
        return bl;
    }

    public static String b(String string) {
        boolean bl = eAQ.a().a(aUJ.a, string);
        if (bl) {
            aUh.a("error.chat.flood", new Object[0]);
            return null;
        }
        return string;
    }

    public static void a(int n, boolean bl) {
        aUh.b(n, bl);
        aUh.c(n, bl);
    }

    public static void b(int n, boolean bl) {
        dfc dfc2 = new dfc(19090);
        dfc2.a(bl);
        dfc2.b(n);
        dfc2.a(0L);
        add_2.b().a(dfc2);
    }

    public static void c(int n, boolean bl) {
        dfc dfc2 = new dfc(16373);
        dfc2.a(bl);
        dfc2.b(n);
        dfc2.a(5000L);
        add_2.b().a(dfc2);
    }

    public static void a(String string, Object ... objectArray) {
        String string2 = bae.h().a(string, objectArray);
        aul_0.a().b(string2);
    }

    public static void b(String string, Object ... objectArray) {
        String string2 = bae.h().a(string, objectArray);
        aul_0.a().c(string2);
    }

    public static void c(String string, Object ... objectArray) {
        String string2 = bae.h().a(string, objectArray);
        aul_0.a().d(string2);
    }

    public static void b() {
        aul_0.a().c("");
    }

    @Nullable
    public static String c(String string) {
        if (string == null) {
            return null;
        }
        if ((string = aUh.b(string.trim())) == null) {
            return null;
        }
        if ((string = cby_2.b(string)).isBlank()) {
            aUh.a("error.chat.operationNotPermited", new Object[0]);
            return null;
        }
        string = aUi.a().a(string);
        if (string == null) {
            return null;
        }
        return string;
    }

    @NotNull
    public static Ow a(List<aUe> list, String string) {
        for (aUe aUe2 : list) {
            if (!string.equals(aUf.a(aUe2))) continue;
            return aUe2.c();
        }
        return bah_0.d();
    }

    public static String a(Ow ow, String string) {
        return aUh.a(ow, aUe.k, aup_0.a(ow), string);
    }

    public static String b(Ow ow, String string) {
        return aUh.a(ow, aUe.p, aup_0.b(ow), string);
    }

    private static String a(Ow ow, aUe aUe2, aup_0 aup_02, String string) {
        if (!enp_2.a(ow)) {
            cgs_2.a(ow);
            return null;
        }
        if (!((bvx_0)ans_0.D().h()).b(ow)) {
            cgs_2.b(ow);
            return null;
        }
        boolean bl = ((bvx_0)ans_0.D().h()).a(bWe.ae);
        if (string == null || bl) {
            if (ow == bah_0.d()) {
                aUh.a(aUf.a(aUe2.b()).a());
            } else {
                aUh.a(aup_02);
            }
        }
        return aUh.c(string);
    }

    public static void a(aup_0 aup_02, String string) {
        aUh.a(aup_02.i(), string);
    }

    public static void a(aUW aUW2, String string) {
        boolean bl = ((bvx_0)ans_0.D().h()).a(bWe.ae);
        if (string == null || string.trim().isEmpty() || bl) {
            aUh.a(aUW2);
        }
    }

    private static void a(aup_0 aup_02) {
        aUh.a(aup_02.i());
    }

    private static void a(aUW aUW2) {
        aUv aUv2 = aUxx.a().f();
        if (aUv2 == null) {
            return;
        }
        aUr aUr2 = aUv2.h();
        if (aUr2 == null) {
            return;
        }
        aUr2.a(aUW2, true);
    }
}

