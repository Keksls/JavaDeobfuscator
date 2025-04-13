/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from EC
 */
public final class ec_1 {
    private static final short[] a = new short[0];

    private ec_1() {
    }

    public static void a(FY fY, eg_1 eg_12) {
        int n;
        short s2 = eg_12.b();
        fY.a(s2);
        fY.a(eg_12.a());
        if (!fY.h(64)) {
            fY.a(0);
            fY.b(0);
        } else {
            fY.a(eg_12.e());
            fY.a(fY.b().hashCode());
            n = fY.b().indexOf(95) + 1;
            fY.b(fY.b().substring(n).hashCode());
        }
        eg_12.c();
        eg_12.c();
        n = eg_12.b() & 0xFFFF;
        fY.b(n == 0 ? a : eg_12.b(n));
        int n2 = eg_12.b() & 0xFFFF;
        fY.a(n2 == 0 ? null : eg_12.b(n2));
        fY.a(ea_1.a(eg_12));
        if (n == 0 && n2 != 0) {
            fY.a(true);
        }
        fY.c(n);
    }
}

