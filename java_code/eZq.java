/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public final class eZq {
    private static final float a = 2.0f;
    private static final double b = 30.0;
    private static final int c = 200;
    private static final float d = 1.2f;
    private static final float e = 1.0f;

    private eZq() {
    }

    public static Optional<Cm<Integer, Float>> a(int n, int n2) {
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            return Optional.empty();
        }
        return eZq.a(r2, n2, true);
    }

    public static Optional<Cm<Integer, Float>> a(@NotNull exk_2 exk_22) {
        ezr_0<?> ezr_02 = exk_22.T();
        if (ezr_02 == null) {
            return Optional.empty();
        }
        short s2 = exk_22.e();
        return eZq.a(ezr_02, s2, exk_22.ah());
    }

    private static Optional<Cm<Integer, Float>> a(ezr_0<?> ezr_02, int n, boolean bl) {
        exy_1 exy_12 = ezr_02.R();
        if (exy_12 == exy_1.a) {
            return Optional.empty();
        }
        if (ezr_02.b(ext_1.m)) {
            return Optional.empty();
        }
        float f2 = ezr_02.U() ? (float)eZq.a(ezr_02, bl) : eZq.a(ezr_02);
        float f3 = (float)n * f2;
        int n2 = eZq.a(exy_12);
        return Optional.of(new Cm<Integer, Float>(n2, Float.valueOf(f3)));
    }

    public static eZp a(exk_2 exk_22, epq_2 epq_22) {
        if (exk_22.T().R() == exy_1.a) {
            return eZp.b;
        }
        if (exk_22.T().b(ext_1.m)) {
            return eZp.b;
        }
        apc_2 apc_22 = exk_22.T().a(exz_1.h);
        if (apc_22 != null && !apc_22.b(epq_22, null, null, epq_22.cK())) {
            return eZp.b;
        }
        if (exk_22.y() && exk_22.C().e()) {
            return eZp.c;
        }
        return eZp.a;
    }

    private static int a(exy_1 exy_12) {
        if (exy_12 == exy_1.b) {
            return 27083;
        }
        if (exy_12 == exy_1.c) {
            return 27093;
        }
        return 0;
    }

    private static double a(ezr_0<?> ezr_02, boolean bl) {
        double d2 = eZq.a(ezr_02);
        float f2 = bl ? 1.2f : 1.0f;
        return (double)f2 * d2;
    }

    private static float a(ezr_0<?> ezr_02) {
        return ezr_02.Q() >= 0.0f ? ezr_02.Q() : ezr_02.P();
    }

    public static double a(short s2, exw_1 exw_12) {
        double d2 = eZq.a(s2);
        int n = exw_12.c();
        return d2 * (double)n * 2.0;
    }

    private static double a(short s2) {
        int n = Hw.a((int)s2, 0, 245);
        double d2 = (double)(n - 200) / 30.0;
        return StrictMath.pow(2.0, d2);
    }
}

