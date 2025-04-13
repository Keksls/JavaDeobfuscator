/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from ayq
 */
public class ayq_1 {
    private static final Logger i = Logger.getLogger(ayq_1.class);
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final String d = "plain";
    public static final String e = "bold";
    public static final String f = "italic";
    public static final String g = "bordered";
    public static final String h = "shadowed";
    private static final HashMap<ayo_1, ayn_2> j = new HashMap();
    private static byte k = (byte)2;
    private static String l = "";

    private ayq_1() {
    }

    public static void a(byte by) {
        k = by;
    }

    public static void a(String string) {
        l = string;
    }

    public static ayn_2 a(ayo_1 ayo_12, boolean bl) {
        ayn_2 ayn_22 = ayq_1.a(ayo_12);
        if (ayn_22 == null) {
            return ayq_1.b(ayo_12, bl);
        }
        return ayn_22;
    }

    public static ayn_2 b(String string) {
        return ayq_1.a(ayo_1.a(string), false);
    }

    public static ayn_2 a(String string, boolean bl) {
        return ayq_1.a(ayo_1.a(string), bl);
    }

    public static ayn_2 a(String string, int n, int n2) {
        return ayq_1.a(string, n, n2, false);
    }

    public static ayn_2 a(String string, int n, int n2, boolean bl) {
        return ayq_1.a(string, n, n2, 0, 0, bl);
    }

    public static ayn_2 a(String string, int n, int n2, int n3, int n4, boolean bl) {
        ayo_1 ayo_12 = new ayo_1(string, n, n2, n3, n4);
        return ayq_1.a(ayo_12, bl);
    }

    public static int a(String string, String string2) {
        int n = ayq_1.c(string);
        if (string2 == null) {
            return n;
        }
        if (string2.equals(g)) {
            n |= 4;
        }
        if (string2.equals(h)) {
            n |= 8;
        }
        return n;
    }

    public static int c(String string) {
        int n = 0;
        if (string == null) {
            return n;
        }
        String string2 = string.toLowerCase();
        if (string2.contains(e)) {
            n |= 1;
        }
        if (string2.contains(f)) {
            n |= 2;
        }
        if (string2.contains(g)) {
            n |= 4;
        }
        if (string2.contains(h)) {
            n |= 8;
        }
        return n;
    }

    public static int d(String string) {
        int n = string.lastIndexOf(45) + 1;
        if (n == 0) {
            return 0;
        }
        String string2 = string.substring(n);
        try {
            return Integer.parseInt(string2);
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public static String e(String string) {
        int n = string.indexOf(45);
        if (n <= 0) {
            return string;
        }
        return string.substring(0, n);
    }

    private static ayn_2 a(ayo_1 ayo_12) {
        return j.get(ayo_12);
    }

    private static ayn_2 b(ayo_1 ayo_12, boolean bl) {
        boolean bl2 = ayq_1.a(bl);
        ayn_2 ayn_22 = ayi_2.a(ayo_12, l, bl2);
        if (ayn_22 == null) {
            i.warn((Object)("Unable to load the font " + ayo_12 + " from path " + l));
            ayn_22 = ayq_1.b(ayo_12);
        }
        j.put(ayo_12, ayn_22);
        return ayn_22;
    }

    public static boolean a(boolean bl) {
        boolean bl2;
        switch (k) {
            case 2: {
                bl2 = true;
                break;
            }
            case 1: {
                bl2 = false;
                break;
            }
            default: {
                bl2 = bl;
            }
        }
        return bl2;
    }

    private static ayn_2 b(ayo_1 ayo_12) {
        ayn_2 ayn_22 = null;
        float f2 = Float.MAX_VALUE;
        for (Map.Entry<ayo_1, ayn_2> entry : j.entrySet()) {
            ayo_1 ayo_13 = entry.getKey();
            float f3 = ayq_1.a(ayo_12, ayo_13);
            if (!(f3 < f2)) continue;
            f2 = f3;
            ayn_22 = entry.getValue();
        }
        return ayn_22;
    }

    private static float a(ayo_1 ayo_12, ayo_1 ayo_13) {
        String string = ayo_12.a();
        int n = ayo_12.c();
        int n2 = ayo_12.b();
        int n3 = ayo_12.d();
        int n4 = ayo_12.e();
        String string2 = ayo_13.a();
        int n5 = ayo_13.c();
        int n6 = ayo_13.b();
        int n7 = ayo_13.d();
        int n8 = ayo_13.e();
        float f2 = 0.0f;
        if (!string2.equals(string)) {
            f2 += 2.0f;
        }
        f2 += (float)Math.abs(n - n5);
        if (n6 != n2) {
            f2 += 4.0f;
        }
        f2 += (float)Math.abs(n3 - n7) / 4.0f;
        return f2 += (float)Math.abs(n4 - n8) / 4.0f;
    }
}

