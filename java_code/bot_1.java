/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bot
 */
public class bot_1 {
    public static String a(int n, boolean bl) {
        boolean bl2 = true;
        return bot_1.a(n, bl, true, elw_1.dF);
    }

    public static String a(int n, boolean bl, elw_1 elw_12) {
        boolean bl2 = true;
        return bot_1.a(n, bl, true, elw_12);
    }

    public static String a(int n, boolean bl, boolean bl2, elw_1 elw_12) {
        Object object;
        azj_2 azj_22 = n < 0 ? fys_0.a.a(elw_1.dG) : fys_0.a.a(elw_12);
        Object object2 = object = bl2 ? n + "%" : String.valueOf(n);
        if (bl) {
            ani_2 ani_22 = new ani_2();
            ani_22.i().a(azj_22).a((CharSequence)object);
            return ani_22.r();
        }
        return object;
    }

    public static String a(int n, int n2) {
        azj_2 azj_22 = n < 0 ? fys_0.a.a(elw_1.dG) : fys_0.a.a(elw_1.dF);
        String string = bae.h().a("resist.for.charac.sheet", n, n2);
        ani_2 ani_22 = new ani_2();
        ani_22.i().a(azj_22).a((CharSequence)string);
        return ani_22.r();
    }

    public static String a(int n, boolean bl, boolean bl2, boolean bl3) {
        Object object;
        Object object2 = object = bl2 ? n + "%" : String.valueOf(n);
        if (bl3) {
            azj_2 azj_22 = n < 0 ? fys_0.a.a(elw_1.dG) : fys_0.a.a(elw_1.dF);
            if (bl) {
                ani_2 ani_22 = new ani_2();
                ani_22.i().a(azj_22).a((CharSequence)object);
                return ani_22.r();
            }
            return object;
        }
        return object;
    }

    public static String a(int n, int n2, boolean bl) {
        String string = bae.h().a("resist.for.charac.sheet", n, n2);
        ani_2 ani_22 = new ani_2();
        if (bl) {
            azj_2 azj_22 = n < 0 ? fys_0.a.a(elw_1.dG) : fys_0.a.a(elw_1.dF);
            ani_22.i().a(azj_22).a((CharSequence)string);
            return ani_22.r();
        }
        return string;
    }

    public static String a(int n, elw_1 elw_12) {
        ani_2 ani_22 = new ani_2();
        if (n < 0) {
            ani_22.i().a(fys_0.a.a(elw_1.dG));
        } else if (n > 0) {
            ani_22.i().a(fys_0.a.a(elw_12));
        }
        ani_22.d(n);
        return ani_22.r();
    }
}

