/*
 * Decompiled with CFR 0.152.
 */
public class ddp
implements ahr_1 {
    private static final ddp a = new ddp();
    private final bQA b = new ddq_0(this);
    private bnw_0 c;

    public static ddp a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18197: {
                azu_0.j().a(daB.a());
                return false;
            }
            case 16191: {
                if (!azu_0.j().c(cXF.a())) {
                    azu_0.j().a(cXF.a());
                }
                cXF.c();
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.generateDebugInformation", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                fzm_02.a(new ddr_0(this));
                return false;
            }
            case 19885: {
                if (!azu_0.j().c(cvt_0.a())) {
                    azu_0.j().a(cvt_0.a());
                } else {
                    azu_0.j().b(cvt_0.a());
                }
                return false;
            }
            case 18296: {
                if (!azu_0.j().c(cvs_0.a())) {
                    azu_0.j().a(cvs_0.a());
                } else {
                    azu_0.j().b(cvs_0.a());
                }
                return false;
            }
            case 16571: {
                dfc dfc2 = (dfc)adt_12;
                fis_1.a().a("battlegroundBarDetail", dfc2.i());
                return false;
            }
            case 19597: {
                dfc dfc3 = (dfc)adt_12;
                cWa cWa2 = cWa.a();
                cWa2.a(dfc3.c());
                azu_0.j().a(cWa2);
            }
        }
        return true;
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
        if (bl) {
            return;
        }
        fpm_0.b().a("systemBarDialog", cfi_0.a("systemBarDialog"), 8192L, (short)10000);
        if (this.c == null) {
            this.c = new bnw_0();
            fis_1.a().a("pvpInfo", this.c);
        }
        this.c.a();
        fpm_0.b().a("pvpInformationDialog", cfi_0.a("pvpInformationDialog"), 8192L, (short)10000);
        fpm_0.b().a("battlegroundBarDialog", cfi_0.a("battlegroundBarDialog"), 8192L, (short)10000);
        fpm_0.b().a("menuBarDialog", cfi_0.a("menuBarDialog"), 8192L, (short)10000);
        fis_1.a().a("reportBug", azs_0.a().a("bugReport.enable", false));
        fis_1.a().a("battlegroundBarDetail", false);
        bqz_1.a.a(this.b);
        cgu_2.a().a(this);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fpm_0.b().o("systemBarDialog");
        fpm_0.b().o("menuBarDialog");
        this.c.b();
        fpm_0.b().o("pvpInformationDialog");
        cgu_2.a().b(this);
    }

    public void c() {
        fpm_0.b().a("menuBarDialog", cfi_0.a("menuBarDialog"), 8208L, (short)10000);
    }

    public bnw_0 d() {
        return this.c;
    }
}

