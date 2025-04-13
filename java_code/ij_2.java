/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Histogram
 *  com.codahale.metrics.Meter
 *  com.codahale.metrics.Reservoir
 *  com.codahale.metrics.Timer
 *  com.codahale.metrics.UniformReservoir
 */
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.Reservoir;
import com.codahale.metrics.Timer;
import com.codahale.metrics.UniformReservoir;

/*
 * Renamed from Ij
 */
public final class ij_2 {
    private static final String a = "ai.decision.compute.";
    private static final String b = ".time";
    private static final String c = "network.message.compute.";
    private static final String d = ".time";
    private static final String e = "instance.";
    private static final String f = ".count";
    private static final String g = "instance.";
    private static final String h = ".life";
    private static final String i = "network.message.in.";
    private static final String j = ".size";
    private static final String k = "network.message.out.";
    private static final String l = ".size";
    private static final Histogram m = new Histogram((Reservoir)new UniformReservoir());
    private static final Meter n = new Meter();
    private static final Timer o = new Timer();
    private static boolean p = true;

    private ij_2() {
    }

    public static Timer a(int n) {
        if (ij_2.b()) {
            return o;
        }
        ha_1 ha_12 = Gy.a().a(ha_1.class);
        return ha_12.c(a + n + ".time", () -> new hn_1(n));
    }

    public static Timer b(int n) {
        if (ij_2.b()) {
            return o;
        }
        ha_1 ha_12 = Gy.a().a(ha_1.class);
        return ha_12.c(c + n + ".time", () -> new ig_2(n));
    }

    public static Histogram a(long l) {
        if (ij_2.b()) {
            return m;
        }
        ha_1 ha_12 = Gy.a().a(ha_1.class);
        return ha_12.b("instance." + l + f, () -> new hp_1(l));
    }

    public static Timer b(long l) {
        if (ij_2.b()) {
            return o;
        }
        ha_1 ha_12 = Gy.a().a(ha_1.class);
        return ha_12.c("instance." + l + h, () -> new hr_2(l));
    }

    public static Histogram c(int n) {
        if (ij_2.b()) {
            return m;
        }
        ha_1 ha_12 = Gy.a().a(ha_1.class);
        return ha_12.b(i + n + ".size", () -> new ik_2(n));
    }

    public static Histogram d(int n) {
        if (ij_2.b()) {
            return m;
        }
        ha_1 ha_12 = Gy.a().a(ha_1.class);
        return ha_12.b(k + n + ".size", () -> new im_2(n));
    }

    private static boolean b() {
        return !p || !Gy.a().b();
    }

    public static void a() {
        p = false;
    }
}

