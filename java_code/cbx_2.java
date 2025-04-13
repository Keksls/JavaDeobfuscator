/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbx
 */
public final class cbx_2 {
    private cbx_2() {
    }

    public static void a(String string) {
        cbx_2.a(bae.h().a("security.account.intervention", new Object[0]), string, blr_1.c);
        fpm_0.b().a(string, cfn_0.a(7), 515L, 102, 1);
    }

    public static void a() {
        cbx_2.a(bae.h().a("security.impossible.action", new Object[0]), bae.h().a("security.impossible.action.account.locked", new Object[0]), blr_1.c);
    }

    public static void b() {
        cbx_2.a(bae.h().a("security.impossible.trade", new Object[0]), bae.h().a("security.impossible.trade.target.locked", new Object[0]), blr_1.f);
    }

    public static void c() {
        cbx_2.a(bae.h().a("security.impossible.duel", new Object[0]), bae.h().a("security.impossible.duel.target.locked", new Object[0]), blr_1.f);
    }

    public static void d() {
        cbx_2.a(bae.h().a("security.returned.loot.title", new Object[0]), bae.h().a("security.returned.loot.text", new Object[0]), blr_1.c);
    }

    private static void a(String string, String string2, blr_1 blr_12) {
        dhc dhc2 = new dhc(string, string2, blr_12);
        add_2.b().a(dhc2);
    }
}

