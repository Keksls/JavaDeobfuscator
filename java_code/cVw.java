/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@Deprecated
public class cVw
implements ahr_1 {
    public static final cVw a = new cVw();
    protected static final Logger b = Logger.getLogger(cVw.class);
    private fbx_1 c;
    private fbx_1 d;
    private byte e = 0;
    private bmr_1 f;
    private ans_1 g;

    private cVw() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (azu_0.j().c(cZI.a())) {
            return true;
        }
        switch (adt_12.a()) {
            case 19684: {
                bkr_2.v.j();
                return false;
            }
            case 17032: {
                bkr_2.v.n();
                this.f();
                return false;
            }
            case 17853: {
                bkr_2.v.o();
                return false;
            }
            case 17663: {
                dfc dfc2 = (dfc)adt_12;
                bkq_2 bkq_22 = (bkq_2)dfc2.j();
                byte by = bkq_22.b();
                bkr_2.v.a((int)by);
                return false;
            }
            case 18365: {
                dfg_0 dfg_02 = (dfg_0)adt_12;
                bko_2 bko_22 = dfg_02.k();
                boolean bl = bkr_2.v.g();
                for (int k = 0; k < dfg_02.c(); ++k) {
                    if (!bko_22.g()) {
                        bkr_2.v.c(bko_22);
                        if (!bkr_2.v.g()) {
                            this.a((dfh_0)dfg_02);
                            this.a(dfg_02);
                        }
                        return false;
                    }
                    bkr_2.v.a(bko_22);
                }
                bkr_2.v.c(bko_22);
                if (bl) {
                    this.a(dfg_02);
                }
                return false;
            }
            case 16987: {
                dfg_0 dfg_03 = (dfg_0)adt_12;
                bko_2 bko_23 = dfg_03.k();
                boolean bl = bkr_2.v.g();
                for (int k = 0; k < dfg_03.c(); ++k) {
                    if (!bko_23.f()) {
                        bkr_2.v.c(bko_23);
                        if (bkr_2.v.g()) {
                            this.a((dfh_0)dfg_03);
                        }
                        return false;
                    }
                    bkr_2.v.b(bko_23);
                }
                bkr_2.v.c(bko_23);
                if (bl) {
                    this.a(dfg_03);
                }
                if (bkr_2.v.g()) {
                    this.a((dfh_0)dfg_03);
                }
                return false;
            }
            case 16488: {
                anw_1 anw_12 = (anw_1)adt_12;
                bkm_1 bkm_12 = (bkm_1)anw_12.j();
                bkr_2.v.a(bkm_12);
                return false;
            }
            case 16063: {
                dfh_0 dfh_02 = (dfh_0)adt_12;
                bkr_2.v.c();
                this.a(dfh_02);
                return false;
            }
            case 16272: {
                dfh_0 dfh_03 = (dfh_0)adt_12;
                bkr_2.v.f();
                this.a(dfh_03);
                return false;
            }
            case 19832: {
                dfc dfc3 = (dfc)adt_12;
                blb_0 blb_02 = (blb_0)dfc3.j();
                if (blb_02.a() < 0 || blb_02.a() > bkr_2.v.v()) {
                    bkr_2.v.b(blb_02.a());
                } else {
                    fis_1.a().a((ajf_1)bkr_2.v, "currentLevel");
                }
                fis_1.a().a((ajf_1)bkr_2.v, "hasChanges");
                this.d();
                return false;
            }
            case 18100: {
                dfc dfc4 = (dfc)adt_12;
                String string = dfc4.h();
                bkr_2.v.c(string);
                fis_1.a().a((ajf_1)bkr_2.v, "hasChanges");
                this.d();
                return false;
            }
            case 16814: {
                short s2;
                short s3;
                ezx_2 ezx_22 = bkr_2.v.p();
                String string = "activeSheet.getName()";
                String string2 = bkr_2.v.l();
                if (!"activeSheet.getName()".equals(string2) && string2.length() <= 20) {
                    bkr_2.v.a(string2);
                }
                if ((s3 = bkr_2.v.m()) != (s2 = ezx_22.e())) {
                    if (s3 > s2 && s2 > 0 || s3 < 0) {
                        String string3 = "activeSheet.getName()".isEmpty() ? bae.h().a("sheet.aptitudes.default.name", bkr_2.v.s() + 1) : "activeSheet.getName()";
                        String string4 = bae.h().a("aptitudes.change.level.validation", string3);
                        fzn_0 fzn_02 = new fzn_0(102, 0, string4, null, cfn_0.a(1), 12L);
                        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
                        fzm_02.a(new cVx(this, s3));
                    } else {
                        this.a(s3);
                    }
                }
                this.f();
                bkr_2.v.o();
                return false;
            }
            case 17098: {
                bmr_1 bmr_12 = bkr_2.v.r();
                ezm_1 ezm_12 = bmr_12.dx();
                int n = ezm_12.e();
                String string = ezm_12.d().b();
                fzm_0 fzm_03 = fpm_0.b().a(bae.h().a("sheet.add.build.confirmation", string), cfn_0.a(0), 25L, 102, 1);
                fzm_03.a(new cVy(this, bmr_12, n, ezm_12));
                return false;
            }
            case 18272: {
                bmr_1 bmr_13 = bkr_2.v.r();
                int n = bkr_2.v.s();
                clh_1 clh_12 = new clh_1(bmr_13.a_(), (byte)n);
                azu_0.j().K().c(clh_12);
                return false;
            }
            case 16022: {
                bmr_1 bmr_14 = bkr_2.v.r();
                clh_1 clh_13 = new clh_1(bmr_14.a_(), -1);
                azu_0.j().K().c(clh_13);
                return false;
            }
            case 19785: {
                bmr_1 bmr_15 = bkr_2.v.r();
                if (bmr_15 == null) {
                    return false;
                }
                cli_0 cli_02 = new cli_0(bmr_15.a_());
                azu_0.j().K().c(cli_02);
                return false;
            }
        }
        return true;
    }

    void a(byte by) {
        this.e = by;
    }

    static void a() {
        bkr_2.v.k();
    }

    void a(short s2) {
        boolean bl = bkr_2.v.a(blc_0.a.a(s2));
        if (bl) {
            bkr_2.v.e();
        }
    }

    private void a(dfg_0 dfg_02) {
        if (dfg_02.p() != null) {
            dfg_02.p().setVisible(true);
        }
        if (dfg_02.o() != null) {
            fbx_1 fbx_12 = new fbx_1();
            fbx_12.onCheckOut();
            fbx_12.setFile("6001009.xps");
            fbx_12.setAlignment(frs_0.e);
            dfg_02.o().getAppearance().add(fbx_12);
            this.c = fbx_12;
        }
    }

    private void a(dfh_0 dfh_02) {
        if (dfh_02.p() != null) {
            dfh_02.p().setVisible(false);
        }
        if (dfh_02.o() != null) {
            fbx_1 fbx_12 = this.c;
            this.c = null;
            if (fbx_12 != null) {
                dfh_02.o().getAppearance().c(fbx_12);
            }
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bmr_1 bmr_12 = this.f != null ? this.f : azu_0.j().k();
            byte by = this.e >= 0 ? this.e : (byte)bmr_12.dx().d().e();
            bkr_2.v.a((int)by);
            this.g = new cvz_0(this);
            fpm_0.b().a(this.g);
            fpm_0.b().a("aptitudeBonusDialog", cfi_0.a("aptitudeBonusDialog"), 32768L, (short)10000);
            fpm_0.b().a("wakfu.aptitudeBonus", cFA.class);
            if (this.e > -1) {
                cVw.a();
            }
            this.f();
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.f();
            bkr_2.v.f();
            bkr_2.v.i();
            fpm_0.b().b(this.g);
            fpm_0.b().o("aptitudeBonusDialog");
            fpm_0.b().e("wakfu.aptitudeBonus");
            this.c = null;
        }
    }

    public void c() {
        if (!azu_0.j().c(this)) {
            azu_0.j().a(this);
        }
    }

    public void d() {
        if (bkr_2.v.b()) {
            this.e();
        } else {
            this.f();
        }
    }

    private void e() {
        if (this.d != null) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("aptitudeBonusDialog");
        fru_0 fru_02 = (fru_0)fyy_02.a("validateButton");
        this.d = new fbx_1();
        this.d.onCheckOut();
        this.d.setFile("6001078.xps");
        this.d.setAlignment(frs_0.e);
        fru_02.getAppearance().add(this.d);
    }

    private void f() {
        if (this.d != null) {
            fyy_0 fyy_02 = fpm_0.b().h().d("aptitudeBonusDialog");
            fru_0 fru_02 = (fru_0)fyy_02.a("validateButton");
            if (fru_02 != null) {
                fru_02.getAppearance().c(this.d);
            }
            this.d = null;
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

