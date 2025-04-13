/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ED
 */
public class ed_1 {
    public static void a(fx_0 fx_02, eg_1 eg_12) {
        int n;
        short s2 = eg_12.b();
        fx_02.a(s2);
        fx_02.a(eg_12.a());
        if (!fx_02.h(64)) {
            fx_02.a(0);
            fx_02.b(0);
        } else {
            fx_02.a(eg_12.e());
            fx_02.a(fx_02.b().hashCode());
            n = fx_02.b().indexOf(95) + 1;
            fx_02.b(fx_02.b().substring(n).hashCode());
        }
        eg_12.c();
        eg_12.c();
        fx_02.b(eg_12.b());
        n = eg_12.b() & 0xFFFF;
        fx_02.a(eg_12.b(n));
        fx_02.a(ea_1.a(eg_12));
        fx_02.c(1);
    }
}

