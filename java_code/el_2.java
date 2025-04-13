/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.Supplier;

/*
 * Renamed from EL
 */
public final class el_2 {
    public static final Fz[] a = new Fz[0];
    private static final float[] b = new float[0];

    private el_2() {
    }

    public static void a(fy_0 fy_02, eg_1 eg_12) {
        el_2.b(fy_02, eg_12);
        el_2.c(fy_02, eg_12);
        el_2.d(fy_02, eg_12);
        el_2.e(fy_02, eg_12);
    }

    private static void b(fy_0 fy_02, eg_1 eg_12) {
        int n = eg_12.c();
        fy_02.a(n == 0 ? b : eg_12.d(n));
    }

    private static void c(fy_0 fy_02, eg_1 eg_12) {
        int n = eg_12.c();
        fy_02.b(n == 0 ? b : eg_12.d(n));
    }

    private static void d(fy_0 fy_02, eg_1 eg_12) {
        int n = eg_12.c();
        fy_02.c(n == 0 ? b : eg_12.d(n));
    }

    private static void e(fy_0 fy_02, eg_1 eg_12) {
        int n = eg_12.c();
        if (n == 0) {
            fy_02.a(a);
            return;
        }
        Fz[] fzArray = new Fz[n];
        for (int k = 0; k < n; ++k) {
            fk_1 fk_12;
            Optional<DR> optional;
            byte by = (byte)(eg_12.a() & 0xFF);
            byte by2 = (byte)(eg_12.a() & 0xFF);
            Optional<fk_1> optional2 = fk_1.a(by);
            if (optional2.isEmpty() || (optional = DR.a(fk_12 = optional2.get())).isEmpty()) continue;
            DR dR = optional.get();
            Supplier<? extends Fz> supplier = fk_12.b();
            DQ<? extends DP> dQ = dR.b();
            Fz fz = supplier.get();
            DP dP = dQ.a(fz);
            dP.a(by2, eg_12);
            fzArray[k] = fz;
        }
        fy_02.a(fzArray);
    }
}

