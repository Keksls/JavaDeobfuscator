/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from aFP
 */
public final class afp_1 {
    private static final Map<String, String> a = new HashMap<String, String>();

    private afp_1() {
    }

    public static void a(String string, String string2) {
        a.put(string2, string);
    }

    public static String a(String string) {
        String string2 = a.get(string);
        if (string2 != null) {
            return string2;
        }
        return string;
    }
}

