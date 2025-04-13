/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.net.URL;

/*
 * Renamed from Gg
 */
public class gg_0 {
    public static boolean a = false;

    public static gq_0 a(String string) {
        String string2 = gg_0.e(string);
        return go_0.a().a(gg_0.d(string2));
    }

    public static void a(gn_0 gn_02) {
        go_0.a().a(gn_02);
    }

    public static byte[] b(String string) {
        String string2 = gg_0.e(string);
        return gi_0.b(string2);
    }

    public static byte[] a(String string, int n) {
        String string2 = gg_0.e(string);
        return gi_0.a(string2, n);
    }

    public static InputStream c(String string) {
        String string2 = gg_0.e(string);
        return gi_0.c(string2);
    }

    public static URL d(String string) {
        String string2 = gg_0.e(string);
        return new URL(string2);
    }

    public static String a(String string, Object ... objectArray) {
        String string2 = String.format(string, objectArray);
        return gg_0.e(string2);
    }

    public static String e(String string) {
        gj_0.a(string);
        return string;
    }
}

