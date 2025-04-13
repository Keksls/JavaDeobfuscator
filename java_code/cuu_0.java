/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUU
 */
public abstract class cuu_0 {
    private static bsx_2 c;
    protected static ahx a;
    protected static long b;

    public static bsx_2 a() {
        return c;
    }

    public static void a(bsx_2 bsx_22) {
        c = bsx_22;
    }

    public void c() {
        if (c == null) {
            return;
        }
        c.w().g();
        fis_1.a().a("flea", c);
        fis_1.a().a("fleaSelectedGood", (Object)null);
        fis_1.a().a("fleaTitle", (Object)bae.h().a("flea.of", c.s()));
        fpm_0.b().a("wakfu.flea", cGY.class);
    }

    public void d() {
        if (c == null) {
            return;
        }
        c.a((bhm_0)null);
        fis_1.a().a("flea");
        fis_1.a().a("fleaSelectedGood");
        fis_1.a().a("currentItemQuantity");
        fis_1.a().a("currentItemTotalPrice");
        fis_1.a().a("currentItemFormatedTotalPrice");
        fis_1.a().a("fleaTitle");
        if (fpm_0.b().q("confirmFleaPurchaseDialog")) {
            fpm_0.b().o("confirmFleaPurchaseDialog");
        }
        fpm_0.b().e("wakfu.flea");
        ahs.d().c(b);
    }

    public abstract void a(Object var1, bpc_2 var2);
}

