/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from CO
 */
public abstract class co_0
extends Enum<co_0> {
    public static final /* enum */ co_0 a = new cp_0();
    public static final /* enum */ co_0 b = new cx_0();
    public static final /* enum */ co_0 c = new cy_0();
    public static final /* enum */ co_0 d = new cz_0();
    public static final /* enum */ co_0 e = new Da();
    public static final /* enum */ co_0 f = new Db();
    public static final /* enum */ co_0 g = new Dc();
    public static final /* enum */ co_0 h = new Dd();
    public static final /* enum */ co_0 i = new De();
    public static final /* enum */ co_0 j = new cq_0();
    public static final /* enum */ co_0 k = new cr_0();
    public static final /* enum */ co_0 l = new cs_0();
    public static final /* enum */ co_0 m = new ct_0();
    public static final /* enum */ co_0 n = new cu_0();
    public static final /* enum */ co_0 o = new cv_0();
    public static final /* enum */ co_0 p = new cw_0();
    private static final Logger q;
    private static final /* synthetic */ co_0[] r;

    public static co_0[] values() {
        return (co_0[])r.clone();
    }

    public static co_0 valueOf(String string) {
        return Enum.valueOf(co_0.class, string);
    }

    public static co_0 a(int n) {
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
                return co_0.n;
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
        r = new co_0[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
        q = Logger.getLogger(co_0.class);
    }
}

