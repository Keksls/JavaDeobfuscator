/*
 * Decompiled with CFR 0.152.
 */
public class biG {
    public static final int a = 1000000;
    public static final int b = 990000;

    public static int a(int n) {
        return n % 10;
    }

    public static int b(int n) {
        return n / 10;
    }

    public static boolean c(int n) {
        return n >= 1000000;
    }

    public static boolean d(int n) {
        return n >= 990000 && !biG.c(n);
    }

    public static biI a(eaa_0 eaa_02) {
        Object r2;
        biH biH2 = new biH();
        biH2.c(bkt_1.a().a(eaa_02.g()).f());
        biH2.g(eaa_02.h());
        eb eb2 = eaa_02.k();
        biH2.a(eb2.c(), true);
        biH2.b(eb2.e(), true);
        biH2.c(eb2.g(), true);
        biH2.aO();
        biH2.a(eb2, true);
        biH2.a((byte)eb2.u(), true);
        biH2.b((byte)eb2.w(), true);
        biH2.aP();
        biI biI2 = biH2.bv();
        if (eb2.B() && eb2.C() > 0 && (r2 = eyo_1.g().d(eb2.C())) != null) {
            biI2.a((ezr_0)r2, (short)exh_2.a.A);
        }
        if (eb2.D() && eb2.E() > 0 && (r2 = eyo_1.g().d(eb2.E())) != null) {
            biI2.a((ezr_0)r2, (short)exh_2.d.A);
        }
        if (eb2.F() && eb2.G() > 0 && (r2 = eyo_1.g().d(eb2.G())) != null) {
            biI2.a((ezr_0)r2, (short)exh_2.f.A);
        }
        biI2.e("AnimStatique");
        biI2.g("AnimStatique");
        return biH2.bv();
    }

    public static String e(int n) {
        if (biG.c(n)) {
            return "npcGfxPath";
        }
        if (biG.d(n)) {
            return "petGfxPath";
        }
        return "playerGfxPath";
    }
}

