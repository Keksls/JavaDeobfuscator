/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class aXw
extends aXj
implements adv_1 {
    protected static final Logger a = Logger.getLogger(aXw.class);
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private static final int f = 200;
    private static int g = 0;
    private static boolean h = false;
    private static long i = 0L;
    private final int j;
    private final int k;

    public aXw(int n) {
        this.k = n;
        this.j = -1;
    }

    public aXw(int n, int n2) {
        this.k = n;
        this.j = n2;
    }

    @Override
    public boolean a() {
        switch (this.k) {
            case 0: 
            case 1: 
            case 3: {
                return true;
            }
            case 2: {
                return this.j > 200;
            }
        }
        return false;
    }

    @Override
    public void b() {
        switch (this.k) {
            case 0: {
                aXw.e();
                return;
            }
            case 1: {
                aXw.d();
                return;
            }
            case 3: {
                aXw.c();
                return;
            }
            case 2: {
                aXw.a(this, this.j);
                return;
            }
        }
    }

    private static void a(adv_1 adv_12, int n) {
        if (!h) {
            i = adi_2.a().a(adv_12, n, 1);
            h = true;
            aXw.b("Auto ping every " + n + " ms started (clock id " + i + ")");
        }
    }

    private static void c() {
        if (h) {
            adi_2.a().a(i);
            h = false;
            i = 0L;
            aXw.b("Auto ping stopped");
        }
    }

    private static boolean d() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("You need to be connected to access this command.");
            return false;
        }
        aaw_22.c(new px_0(2, ++g));
        aaw_22.c(new px_0(3, g));
        aaw_22.c(new px_0(1, g));
        aaw_22.c(new px_0(6, g));
        aaw_22.c(new px_0(4, g));
        aXw.b("===== Ping (n\u00b0 " + g + ") =====");
        return true;
    }

    private static void e() {
        aXw.a("=== Ping command");
        aXw.a("\"ping\" \"help\" : show help");
        aXw.a("\"ping\" : ping every server once");
        aXw.a("\"ping\" \"start\" &lt;Delay in ms&gt; : auto ping all servers with the specified delay (> 200 ms)");
        aXw.a("\"ping\" \"start\" : auto ping all servers once every second");
        aXw.a("\"ping\" \"stop\" : stop the auto ping");
        aXw.a("");
        aXw.a("In the ping response, \"RTT\" is the round trip time, and \"PT\" is the server processing time.");
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12.a() == Integer.MIN_VALUE) {
            if (!aXw.d()) {
                aXw.c();
            }
            return false;
        }
        return true;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }
}

