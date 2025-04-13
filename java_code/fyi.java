/*
 * Decompiled with CFR 0.152.
 */
public class fyi
implements fzd<fzq> {
    private final Class<fzq> a = fzq.class;

    public fzq a(String string) {
        return null;
    }

    public fzq a(Class<? extends fzq> clazz, String string) {
        return this.a(clazz, string, null);
    }

    public fzq a(Class<? extends fzq> clazz, String string, fyy_0 fyy_02) {
        fzr fzr2 = null;
        if (string != null) {
            if (clazz.equals(fcx_2.class)) {
                fzr2 = new fcx_2();
            } else if (clazz.equals(fcz_2.class)) {
                fzr2 = new fcz_2();
            } else if (clazz.equals(fdh_2.class)) {
                fzr2 = new fdh_2();
            } else if (clazz.equals(fdm_2.class)) {
                fzr2 = new fdm_2();
            } else if (clazz.equals(fdn_1.class)) {
                fzr2 = new fdn_1();
            } else if (clazz.equals(fdo_1.class)) {
                fzr2 = new fdo_1();
            } else if (clazz.equals(fdq_1.class)) {
                fzr2 = new fdq_1();
            } else if (clazz.equals(fdr_1.class)) {
                fzr2 = new fdr_1();
            } else if (clazz.equals(fds_1.class)) {
                fzr2 = new fds_1();
            } else if (clazz.equals(fdb_1.class)) {
                fzr2 = new fdb_1();
            } else if (clazz.equals(fdc_2.class)) {
                fzr2 = new fdc_2();
            } else if (clazz.equals(fdt_1.class)) {
                fzr2 = new fdt_1();
            } else if (clazz.equals(fdu_1.class)) {
                fzr2 = new fdu_1();
            } else if (clazz.equals(fdy_1.class)) {
                fzr2 = new fdy_1();
            } else if (clazz.equals(fdz_1.class)) {
                fzr2 = new fdz_1();
            } else if (clazz.equals(fdx_1.class)) {
                fzr2 = new fdx_1();
            } else if (clazz.equals(fdw_1.class)) {
                fzr2 = new fdw_1();
            } else if (clazz.equals(fdv_1.class)) {
                fzr2 = new fdv_1();
            } else if (clazz.equals(fda_1.class)) {
                fzr2 = new fda_1();
            } else if (clazz.equals(fdc_2.class)) {
                fzr2 = new fdc_2();
            } else if (clazz.equals(fdd_1.class)) {
                fzr2 = new fdd_1();
            } else if (clazz.equals(fdk_1.class)) {
                fzr2 = new fdk_1();
            } else if (clazz.equals(fdi_2.class)) {
                fzr2 = new fdi_2();
            } else if (clazz.equals(fdj_2.class)) {
                fzr2 = new fdj_2();
            } else if (clazz.equals(fdl_1.class)) {
                fzr2 = new fdl_1();
            } else if (clazz.equals(fdm_1.class)) {
                fzr2 = new fdm_1();
            } else if (clazz.equals(fdk_2.class)) {
                fzr2 = new fdk_2();
            } else if (clazz.equals(fdl_2.class)) {
                fzr2 = new fdl_2();
            } else if (clazz.equals(fdi_1.class)) {
                fzr2 = new fdi_1();
            } else if (clazz.equals(fdj_1.class)) {
                fzr2 = new fdj_1();
            } else if (clazz.equals(fdb_2.class)) {
                fzr2 = new fdb_2();
            } else if (clazz.equals(fdc_1.class)) {
                fzr2 = new fdc_1();
            } else if (clazz.equals(fdd_2.class)) {
                fzr2 = new fdd_2();
            } else if (clazz.equals(fde_1.class)) {
                fzr2 = new fde_1();
            } else if (clazz.equals(fdf_1.class)) {
                fzr2 = new fdf_1();
            } else if (clazz.equals(fdp_1.class)) {
                fzr2 = new fdp_1();
            } else if (clazz.equals(fde_2.class)) {
                fzr2 = new fde_2();
            } else if (clazz.equals(fdf_2.class)) {
                fzr2 = new fdf_2();
            } else if (clazz.equals(fcy_2.class)) {
                fzr2 = new fcy_2();
            } else if (clazz.equals(fdh_1.class)) {
                fzr2 = new fdh_1();
            } else if (clazz.equals(fda_2.class)) {
                fzr2 = new fda_2();
            }
        }
        if (fzr2 != null) {
            fzr2.a(string);
        }
        return fzr2;
    }

    @Override
    public Class<fzq> a() {
        return this.a;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends fzq> clazz, String string, fya_0 fya_02) {
        String string2 = fkr_22.b();
        fkr_22.a(clazz);
        fkr_22.a(new fkw_1(clazz, string2, "new " + clazz.getSimpleName() + "()"));
        fkr_22.a(new fkv_1(null, "setCallBackFunc", string2, "\"" + string + "\""));
        return string2;
    }

    @Override
    public /* synthetic */ Object b(String string) {
        return this.a(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.a(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fyy_0 fyy_02) {
        return this.a(clazz, string, fyy_02);
    }
}

