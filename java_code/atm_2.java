/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from atm
 */
public abstract class atm_2
extends Enum<atm_2> {
    public static final /* enum */ atm_2 a = new atn_1();
    public static final /* enum */ atm_2 b = new atv_1();
    public static final /* enum */ atm_2 c = new atw_2();
    public static final /* enum */ atm_2 d = new atx_2();
    public static final /* enum */ atm_2 e = new aty_2();
    public static final /* enum */ atm_2 f = new atz_2();
    public static final /* enum */ atm_2 g = new ata_2();
    public static final /* enum */ atm_2 h = new atb_2();
    public static final /* enum */ atm_2 i = new atc_2();
    public static final /* enum */ atm_2 j = new ato_1();
    public static final /* enum */ atm_2 k = new atp_1();
    public static final /* enum */ atm_2 l = new atq_2();
    public static final /* enum */ atm_2 m = new atr_1();
    public static final /* enum */ atm_2 n = new ats_1();
    public static final /* enum */ atm_2 o = new att_2();
    public static final /* enum */ atm_2 p = new atu_2();
    private static final Logger q;
    private static final /* synthetic */ atm_2[] r;

    public static atm_2[] values() {
        return (atm_2[])r.clone();
    }

    public static atm_2 valueOf(String string) {
        return Enum.valueOf(atm_2.class, string);
    }

    public static atm_2 a(int n) {
        switch (n) {
            case 3: {
                return i;
            }
            case 2: {
                return m;
            }
            case 0: {
                return a;
            }
            case 8: {
                return b;
            }
            case 12: {
                return c;
            }
            case 4: {
                return d;
            }
            case 1: {
                return e;
            }
            case 9: {
                return f;
            }
            case 13: {
                return g;
            }
            case 5: {
                return h;
            }
            case 11: {
                return j;
            }
            case 15: {
                return k;
            }
            case 7: {
                return l;
            }
            case 10: {
                return atm_2.n;
            }
            case 14: {
                return o;
            }
            case 6: {
                return p;
            }
        }
        q.error((Object)("type inconnu " + n));
        return null;
    }

    public abstract void a(Ft var1, fy_0 var2, Fx var3, Fx var4);

    static void a(Fx fx, Fx fx2) {
        fx2.g(fx.l());
        fx2.h(fx.m());
        fx2.i(fx.n());
        fx2.j(fx.o());
    }

    static void b(Fx fx, Fx fx2) {
        fx2.b(fx.k());
        fx2.e(fx.h());
        fx2.f(fx.i());
    }

    static void c(Fx fx, Fx fx2) {
        fx2.a(fx.j());
        fx2.a(fx.d());
        fx2.c(fx.f());
        fx2.b(fx.e());
        fx2.d(fx.g());
    }

    static void a(Fx fx, Fx fx2, float[] fArray, int n) {
        fx2.g(fx.l() + fArray[n]);
        fx2.h(fx.m() + fArray[n + 1]);
        fx2.i(fx.n() + fArray[n + 2]);
        fx2.j(fx.o() + fArray[n + 3]);
    }

    static void b(Fx fx, Fx fx2, float[] fArray, int n) {
        fx2.g(fx.l() * fArray[n]);
        fx2.h(fx.m() * fArray[n + 1]);
        fx2.i(fx.n() * fArray[n + 2]);
        fx2.j(fx.o() * fArray[n + 3]);
    }

    static void a(Fx fx, Fx fx2, float[] fArray, int n, int n2) {
        fx2.g(fx.l() * fArray[n2] + fArray[n]);
        fx2.h(fx.m() * fArray[n2 + 1] + fArray[n + 1]);
        fx2.i(fx.n() * fArray[n2 + 2] + fArray[n + 2]);
        fx2.j(fx.o() * fArray[n2 + 3] + fArray[n + 3]);
    }

    static void c(Fx fx, Fx fx2, float[] fArray, int n) {
        fx2.a(false);
        float f2 = fArray[n];
        float f3 = fArray[n + 1];
        float f4 = fArray[n + 2];
        float f5 = fArray[n + 3];
        if (fx.j()) {
            fx2.a(f2);
            fx2.b(f3);
            fx2.c(f4);
            fx2.d(f5);
        } else {
            fx2.a(f2 * fx.d() + f3 * fx.f());
            fx2.b(f2 * fx.e() + f3 * fx.g());
            fx2.c(f4 * fx.d() + f5 * fx.f());
            fx2.d(f4 * fx.e() + f5 * fx.g());
        }
    }

    static void d(Fx fx, Fx fx2, float[] fArray, int n) {
        fx2.b(false);
        float f2 = fArray[n];
        float f3 = fArray[n + 1];
        if (fx.j()) {
            fx2.e(f2 + fx.h());
            fx2.f(f3 + fx.i());
        } else {
            fx2.e(f2 * fx.d() + f3 * fx.f() + fx.h());
            fx2.f(f2 * fx.e() + f3 * fx.g() + fx.i());
        }
    }

    static void a(Fx fx, Fx fx2, float[] fArray, int n, float[] fArray2, int n2) {
        fx2.a(false);
        fx2.b(false);
        float f2 = fArray[n];
        float f3 = fArray[n + 1];
        float f4 = fArray[n + 2];
        float f5 = fArray[n + 3];
        float f6 = fArray2[n2];
        float f7 = fArray2[n2 + 1];
        float f8 = fx.h();
        float f9 = fx.i();
        if (fx.j()) {
            fx2.a(f2);
            fx2.b(f3);
            fx2.c(f4);
            fx2.d(f5);
            fx2.e(f6 + f8);
            fx2.f(f7 + f9);
            return;
        }
        float f10 = fx.d();
        float f11 = fx.f();
        float f12 = fx.e();
        float f13 = fx.g();
        fx2.a(f2 * f10 + f3 * f11);
        fx2.b(f2 * f12 + f3 * f13);
        fx2.c(f4 * f10 + f5 * f11);
        fx2.d(f4 * f12 + f5 * f13);
        fx2.e(f6 * f10 + f7 * f11 + f8);
        fx2.f(f6 * f12 + f7 * f13 + f9);
    }

    static {
        r = new atm_2[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
        q = Logger.getLogger(atm_2.class);
    }
}

