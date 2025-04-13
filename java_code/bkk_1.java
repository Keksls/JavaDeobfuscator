/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkk
 */
public final class bkk_1 {
    public static final int a = 15;
    public static final long b = 900000L;
    private static final Runnable c = new bkl_1();

    private bkk_1() {
    }

    public static void a(eza_1 eza_12) {
        String string = bae.h().a("antiAddictionLevel.name." + eza_12.b(), new Object[0]);
        String string2 = bae.h().a("antiAddictionLevel.desc." + eza_12.b(), new Object[0]);
        if (Cz.f(string) && Cz.f(string2)) {
            return;
        }
        dhc dhc2 = new dhc(string, string2, blr_1.a, 600011);
        add_2.b().a(dhc2);
        aul_0.a().c(string2);
        if (eza_12 == eza_1.h) {
            bkk_1.a();
            ado_1.a().a(c, 900000L, 1);
        }
    }

    public static void a() {
        ado_1.a().b(c);
    }
}

