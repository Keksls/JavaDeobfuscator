/*
 * Decompiled with CFR 0.152.
 */
public class cXL
implements ahr_1 {
    private static final cXL a = new cXL();
    private bsp_0 b;
    private final ans_1 c = string -> {
        if (string.equals("dimensionalBagCraftFeeDialog")) {
            azu_0.j().b(cXL.a());
        }
    };
    private final ans_1 d = string -> {
        if (string.equals("recipeViewDialog")) {
            if (!(azu_0.j().c(cVS.b) || azu_0.j().c(cxa_0.a()) || azu_0.j().c(cXC.a()) || fpm_0.b().q("craftLinkedRecipeDialog"))) {
                fpm_0.b().e("wakfu.crafts");
            }
            fis_1.a().a("recipeView");
            fpm_0.b().b(this.c);
        }
    };

    public static cXL a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18069: {
                dfc dfc2 = (dfc)adt_12;
                boolean bl = dfc2.i();
                this.b.b(bl);
                return false;
            }
            case 19187: {
                dfc dfc3 = (dfc)adt_12;
                boolean bl = dfc3.i();
                this.b.a(bl);
                return false;
            }
            case 17916: {
                int n;
                eca_0 eca_02;
                dhv dhv2 = (dhv)adt_12;
                boolean bl = !dhv2.k();
                ebx_0 ebx_02 = dhv2.q();
                eby_0<ebz_0> eby_02 = this.b.a(ebx_02);
                ebz_0 ebz_02 = eby_02.c();
                eca_0 eca_03 = eca_02 = ebz_02 != null ? ebz_02.a() : ebz_0.b();
                if (bl && (ebz_02 == null || eby_02.a())) {
                    return false;
                }
                int n2 = n = bl ? 0 : dhv2.o();
                if (dhv2.r()) {
                    eca_02.a(n);
                } else {
                    eca_02.b(n);
                }
                this.b.a(ebx_02, eca_02.a(), dhv2.p());
                return false;
            }
            case 19233: {
                dhw dhw2 = (dhw)adt_12;
                this.b.c(dhw2.k());
                return false;
            }
            case 17318: {
                dhu dhu2 = (dhu)adt_12;
                int n = dhu2.q();
                if (!dhu2.k()) {
                    this.b.a(n);
                } else {
                    this.b.a(n, dhu2.o(), dhu2.p());
                }
                return false;
            }
            case 16785: {
                String string = "dimensionalBagOverriddenCraftFeeDialog";
                if (!fpm_0.b().q("dimensionalBagOverriddenCraftFeeDialog")) {
                    this.b.c();
                    fpm_0.b().a("dimensionalBagOverriddenCraftFeeDialog", cfi_0.a("dimensionalBagOverriddenCraftFeeDialog"), 32769L, (short)10000);
                } else {
                    fpm_0.b().o("dimensionalBagOverriddenCraftFeeDialog");
                }
                return false;
            }
            case 17960: {
                dfc dfc4 = (dfc)adt_12;
                eco_0 eco_02 = (eco_0)dfc4.j();
                bmr_1 bmr_12 = azu_0.j().k();
                bai_0 bai_02 = azu_0.j().n();
                brg_1 brg_12 = new brg_1(eco_02.p(), bai_02.u(), bmr_12.eX());
                brw_0 brw_02 = new brw_0(eco_02, brg_12);
                fis_1.a().a("recipeView", brw_02);
                String string = "recipeViewDialog";
                if (fpm_0.b().q("recipeViewDialog")) break;
                fpm_0.b().a(this.d);
                fpm_0.b().a("recipeViewDialog", cfi_0.a("recipeViewDialog"), 0L, (short)10000);
                if (fpm_0.b().d("wakfu.crafts")) break;
                fpm_0.b().a("wakfu.crafts", cgu_0.class);
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().a(this.c);
            ece_0 ece_02 = azu_0.j().k().eX();
            this.b = new bsp_0(ece_02);
            fis_1.a().a("dimensionalBagCraftFeeView", this.b);
            fpm_0.b().a("dimensionalBagCraftFeeDialog", cfi_0.a("dimensionalBagCraftFeeDialog"), 32769L, (short)10000);
            fpm_0.b().a("wakfu.dimensionalBag.craftFee", cGz.class);
            cdw_0.n().z();
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bnh_1 bnh_12;
            bmr_1 bmr_12;
            bsx_2 bsx_22;
            fpm_0.b().o("dimensionalBagCraftFeeDialog");
            if (fpm_0.b().q("dimensionalBagOverriddenCraftFeeDialog")) {
                fpm_0.b().o("dimensionalBagOverriddenCraftFeeDialog");
            }
            if ((bsx_22 = (bmr_12 = azu_0.j().k()).di()) != null && (bnh_12 = bsx_22.r()).U_() == bmr_12.U_()) {
                ece_0 ece_02 = bnh_12.eX();
                ece_02.a(this.b.e());
                ece_02.b(!this.b.g());
                ece_02.c(this.b.h());
                ece_02.b(this.b.f());
                cpV cpV2 = new cpV();
                cpV2.a(ece_02.k());
                ans_0.F().K().c(cpV2);
            }
            this.b = null;
            fpm_0.b().b(this.c);
            fis_1.a().a("dimensionalBagCraftFeeView");
            fpm_0.b().e("wakfu.dimensionalBag.craftFee");
            cdw_0.n().A();
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

