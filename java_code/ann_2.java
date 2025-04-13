/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ann
 */
class ann_2 {
    private static final Logger a = Logger.getLogger(ann_2.class);

    ann_2() {
    }

    public static boolean a(aty_1 aty_12, long l) {
        if (!ann_2.a(aty_12)) {
            return false;
        }
        return aty_12.A().a(l);
    }

    public static boolean a(aty_1 aty_12) {
        if (!aty_12.M()) {
            return false;
        }
        return aki_0.h().d();
    }

    public static boolean a(long l) {
        long l2 = System.currentTimeMillis();
        if (!amU.a().a(l2, l)) {
            return false;
        }
        amU.a().b(l2, l);
        return true;
    }

    public static void a(aty_1 aty_12, long l, byte by, short s2, int n, boolean bl) {
        if (l == 0L) {
            a.debug((Object)"Id du son nul");
            return;
        }
        try {
            abu abu2 = (abu)aty_12;
            amk_1 amk_12 = aki_0.h().a(l, (float)by / 100.0f, s2, -1L, -1L, aty_12.az(), abu2, n);
            if (bl && amk_12 != null) {
                abu2.a(l, amk_12.b());
            }
        }
        catch (Exception exception) {
            a.debug((Object)("soundExtension or soundPath not initialized " + exception));
        }
    }

    public static void a(aty_1 aty_12, long l, float f2, float f3, short s2, int n, boolean bl) {
        if (l == 0L) {
            a.debug((Object)"Id du son nul");
            return;
        }
        try {
            abu abu2 = (abu)aty_12;
            amk_1 amk_12 = aki_0.h().a(l, f2 / 100.0f, f3, s2, -1L, -1L, aty_12.az(), abu2, n);
            if (bl && amk_12 != null) {
                abu2.a(l, amk_12.b());
            }
        }
        catch (Exception exception) {
            a.debug((Object)("soundExtension or soundPath not initialized " + exception));
        }
    }

    public static void a(aty_1 aty_12, long l, byte by, short s2, boolean bl) {
        if (l == 0L) {
            a.debug((Object)"Id du son nul");
            return;
        }
        try {
            amk_1 amk_12 = aki_0.h().a(l, (float)by / 100.0f, s2, -1L, -1L, aty_12.az());
            if (bl && amk_12 != null) {
                ((abu)aty_12).a(l, amk_12.b());
            }
        }
        catch (Exception exception) {
            a.debug((Object)("soundExtension or soundPath not initialized " + exception));
        }
    }

    public static void a(aty_1 aty_12, long l, float f2, float f3, short s2, boolean bl) {
        if (l == 0L) {
            a.debug((Object)"Id du son nul");
            return;
        }
        try {
            amk_1 amk_12 = aki_0.h().a(l, f2 / 100.0f, f3, s2, -1L, -1L, aty_12.az());
            if (bl && amk_12 != null) {
                ((abu)aty_12).a(l, amk_12.b());
            }
        }
        catch (Exception exception) {
            a.debug((Object)("soundExtension or soundPath not initialized " + exception));
        }
    }
}

