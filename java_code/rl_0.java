/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from RL
 */
public class rl_0 {
    private static final wt_0 a = new wt_0(wt_0.b());

    public static boolean a(rm_0 rm_02, wu_0 wu_02) {
        if (!rm_02.m()) {
            return false;
        }
        if (rm_02.e() == null) {
            return true;
        }
        wu_0 wu_03 = wu_02.a(rm_02.e(), rm_02.f());
        a.a(rm_02.k());
        if (wu_03.c(a)) {
            return true;
        }
        rm_02.a(false);
        return false;
    }

    public static boolean b(rm_0 rm_02, wu_0 wu_02) {
        if (rm_02.l() && !rm_02.d()) {
            return false;
        }
        if (!rm_02.l() && rl_0.a(rm_02, wu_02)) {
            return false;
        }
        if (rl_0.e(rm_02, wu_02)) {
            return false;
        }
        if (rl_0.d(rm_02, wu_02)) {
            return false;
        }
        return !rl_0.c(rm_02, wu_02) || rm_02.i();
    }

    public static boolean c(rm_0 rm_02, wu_0 wu_02) {
        return !rl_0.a(rm_02, wu_02) && rm_02.k() != 0L;
    }

    public static boolean d(rm_0 rm_02, wu_0 wu_02) {
        if (rm_02.e() == null || rm_02.k() == 0L) {
            return false;
        }
        a.a(rm_02.k());
        wt_0 wt_02 = new wt_0(wu_02.a(rm_02.e(), rm_02.f()));
        return wt_02.c(a);
    }

    public static boolean e(rm_0 rm_02, wu_0 wu_02) {
        if (rm_02.c() != 0L && rm_02.j() != 0L) {
            a.a(rm_02.j());
            a.a((int)(rm_02.c() / 1000L), 0, 0, 0);
            if (wu_02.b(a)) {
                return true;
            }
            rm_02.a(0L);
        }
        return false;
    }

    public static boolean f(rm_0 rm_02, wu_0 wu_02) {
        if (rm_02.l()) {
            return false;
        }
        if (rm_02.b() == 0) {
            return false;
        }
        if (rm_02.k() == 0L) {
            return false;
        }
        a.a(rm_02.k());
        a.a(rm_02.b() / 1000, 0, 0, 0);
        return wu_02.b(a);
    }

    public static wx_0 g(rm_0 rm_02, wu_0 wu_02) {
        if (rm_02.j() == 0L) {
            return wx_0.g;
        }
        wt_0 wt_02 = wt_0.b(rm_02.j());
        wt_02.a((int)(rm_02.c() / 1000L), 0, 0, 0);
        return wu_02.g(wt_02);
    }

    public static wx_0 a(rk_0 rk_02, wu_0 wu_02) {
        if (rk_02.e() == null) {
            return wx_0.g;
        }
        wt_0 wt_02 = new wt_0(wu_02.a(rk_02.e(), rk_02.f()));
        wt_02.a(rk_02.f());
        return wu_02.g(wt_02);
    }

    public static wx_0 h(rm_0 rm_02, wu_0 wu_02) {
        if (rm_02.b() == 0) {
            return wx_0.g;
        }
        wt_0 wt_02 = wt_0.b(rm_02.k());
        wt_02.a(rm_02.b() / 1000, 0, 0, 0);
        return wu_02.g(wt_02);
    }

    public static wx_0 i(rm_0 rm_02, wu_0 wu_02) {
        if (rm_02.e() == null) {
            return wx_0.g;
        }
        a.a(rm_02.k());
        wt_0 wt_02 = new wt_0(wu_02.a(rm_02.e(), rm_02.f()));
        if (!wt_02.c(a)) {
            return wx_0.g;
        }
        wt_02.a(rm_02.f());
        return wu_02.g(wt_02);
    }
}

