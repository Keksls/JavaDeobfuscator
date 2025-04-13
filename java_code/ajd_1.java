/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Set;

/*
 * Renamed from aJD
 */
public interface ajd_1 {
    public static final double l = 0.0;
    public static final float m = 0.0f;
    public static final int n = 0;
    public static final long o = 0L;
    public static final String p = "";

    public static boolean f(String string) {
        return Boolean.parseBoolean(string);
    }

    public static double g(String string) {
        if (string == null) {
            return 0.0;
        }
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0.0;
        }
    }

    public static float h(String string) {
        if (string == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0.0f;
        }
    }

    public static int i(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    public static long j(String string) {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
    }

    public static String k(String string) {
        if (string == null) {
            return p;
        }
        return string;
    }

    public Set<String> b();

    public Map<String, String> c();

    default public boolean l(String string) {
        return this.a(string, false);
    }

    public boolean a(String var1, boolean var2);

    public boolean b(String var1);

    default public boolean m(String string) {
        return this.b(string) && !this.a(string, true);
    }

    public String a(String var1);

    default public boolean n(String string) {
        return ajd_1.f(this.a(string));
    }

    default public double o(String string) {
        return ajd_1.g(this.a(string));
    }

    default public float p(String string) {
        return ajd_1.h(this.a(string));
    }

    default public int q(String string) {
        return ajd_1.i(this.a(string));
    }

    default public long r(String string) {
        return ajd_1.j(this.a(string));
    }

    default public String s(String string) {
        return ajd_1.k(this.a(string));
    }

    public String c(String var1);

    default public boolean t(String string) {
        return ajd_1.f(this.c(string));
    }

    default public double u(String string) {
        return ajd_1.g(this.c(string));
    }

    default public float v(String string) {
        return ajd_1.h(this.c(string));
    }

    default public int w(String string) {
        return ajd_1.i(this.c(string));
    }

    default public long x(String string) {
        return ajd_1.j(this.c(string));
    }

    default public String y(String string) {
        return ajd_1.k(this.c(string));
    }
}

