/*
 * Decompiled with CFR 0.152.
 */
public class daB
implements ahr_1 {
    private static final daB a = new daB();
    private ans_1 b;

    public static daB a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19247: {
                String string = bae.h().a("contactModerator.ask", new Object[0]);
                fzn_0 fzn_02 = new fzn_0(102, 0, string, 65542L);
                fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
                fzm_02.a(new daC(this));
                azu_0.j().b(this);
                return false;
            }
            case 17946: {
                azu_0.j().a(dbA.a());
                return false;
            }
            case 19015: {
                azu_0.j().H();
                return false;
            }
            case 16782: {
                azu_0.j().J();
                return false;
            }
            case 19547: {
                azu_0.j().b(this);
                return false;
            }
            case 18928: {
                fzm_0 fzm_03 = fpm_0.b().a(bae.h().a("question.changeCharacter", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                fzm_03.a(new daD(this));
                return false;
            }
        }
        return true;
    }

    public static void c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null) {
            bmr_12.cg().p();
        }
        ans_0.D().x();
        azu_0.j().a(cgs_2.a());
        azu_0.j().a(ddp.a());
        azu_0.j().a(cfb_0.a());
        cuo_0.e().a(true).a(bae.h().a("charactersLoading.progress", new Object[0]), 0);
        ceX.a().a(true);
        azu_0.j().a(ceX.a());
        azu_0.j().K().c(new cqR());
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            Object object;
            bvd_0 bvd_02;
            ajf_1 ajf_12;
            if (azu_0.j().c(cvv_0.a()) && (ajf_12 = cvv_0.a().e()) != null && (bvd_02 = ((bVw)ajf_12).c()) != null && bvd_02.e() && (object = bvd_02.c()) != null && ((bvh_0)object).e()) {
                dfc.d((short)16090);
            }
            this.b = new daf_0(this);
            fpm_0.b().a(this.b);
            fis_1.a().a("isConnected", azu_0.j().E());
            fpm_0.b().a("menuDialog", cfi_0.a("menuDialog"), 256L, (short)26000);
            fpm_0.b().a("wakfu.menu", chg_0.class);
            cdw_0.n().c(600023L);
            cIi.setSelectedTabIndex(0);
            ajf_12 = azu_0.j().k();
            boolean bl2 = false;
            if (ajf_12 != null) {
                object = ((bnh_1)ajf_12).N_();
                bl2 = enp_2.a.d(ens_2.K) && ((emg_0)object).l() == emx_0.a;
            }
            fis_1.a().a("antiAddictionEnabled", bl2);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fis_1.a().a("isConnected");
            fpm_0.b().o("menuDialog");
            fpm_0.b().e("wakfu.menu");
            fpm_0.b().b(this.b);
            cdw_0.n().c(600024L);
            cIi.setSelectedTabIndex(3);
        }
    }
}

