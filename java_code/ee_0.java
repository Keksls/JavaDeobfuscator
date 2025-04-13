/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from EE
 */
public final class ee_0 {
    private ee_0() {
    }

    public static void a(fz_0 fz_02, eg_1 eg_12) {
        short s2 = eg_12.b();
        fz_02.a(s2);
        fz_02.a(eg_12.a());
        if (!fz_02.h(64)) {
            fz_02.a(0);
            fz_02.b(0);
        } else {
            fz_02.a(eg_12.e());
            fz_02.a(fz_02.b().hashCode());
            int n = fz_02.b().indexOf(95) + 1;
            fz_02.b(fz_02.b().substring(n).hashCode());
        }
        eg_12.c();
        eg_12.c();
        fz_02.b(eg_12.b());
        fz_02.a(ea_1.a(eg_12));
        fz_02.c(1);
    }
}

