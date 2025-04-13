/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWA
 */
public class cwa_0
extends cxo_0 {
    public static final cwa_0 a = new cwa_0();
    private static final Logger i = Logger.getLogger(cwa_0.class);
    private ans_1 j;
    bld_0 k;
    private fbx_1 l;

    private cwa_0() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19700: {
                if (azu_0.j().n().f()) {
                    cbx_2.a();
                    return false;
                }
                int n = this.k.f();
                blx_1 blx_12 = this.j().l();
                this.a(blx_12, n);
                return false;
            }
            case 16218: {
                dfc dfc2 = (dfc)adt_12;
                String string = dfc2.h();
                if (this.k.f() < 0) {
                    return false;
                }
                this.d();
                return false;
            }
            case 19066: {
                this.d();
                return false;
            }
            case 19998: {
                dfc dfc3 = (dfc)adt_12;
                blb_0 blb_02 = (blb_0)dfc3.j();
                blx_1 blx_13 = this.j().l();
                ezm_1 ezm_12 = blx_13.dx();
                int n = this.k.f();
                ezj_1 ezj_12 = ezm_12.a(n);
                if (ezj_12 == null) {
                    return false;
                }
                fis_1.a().a((ajf_1)this.k, bld_0.k);
                fis_1.a().a((ajf_1)this.k, "hasInvalidSheet");
                this.d();
                return false;
            }
            case 16657: {
                dfc dfc4 = (dfc)adt_12;
                bkq_2 bkq_22 = (bkq_2)dfc4.j();
                byte by = bkq_22.b();
                fis_1.a().a((ajf_1)this.k, "hasInvalidSheet");
                this.d();
                return false;
            }
            case 19311: {
                dfc dfc5 = (dfc)adt_12;
                bji_1 bji_12 = (bji_1)dfc5.j();
                byte by = (byte)bji_12.f();
                fis_1.a().a((ajf_1)this.k, "hasInvalidSheet");
                this.d();
                return false;
            }
            case 16583: {
                return false;
            }
            case 18070: {
                return false;
            }
            case 19876: {
                return false;
            }
            case 19333: {
                dfc dfc6 = (dfc)adt_12;
                bPK bPK2 = (bPK)dfc6.j();
                int n = bPK2.g();
                fis_1.a().a((ajf_1)this.k, "hasInvalidSheet");
                this.d();
                return false;
            }
            case 16871: {
                dfc dfc7 = (dfc)adt_12;
                long l = dfc7.d();
                bmr_1 bmr_12 = (bmr_1)euw_2.a.d(l);
                if (bmr_12 == null) {
                    return false;
                }
                this.r();
                this.a(bmr_12);
                return false;
            }
            case 17431: {
                if (azu_0.j().n().f()) {
                    cbx_2.a();
                    return false;
                }
                bmr_1 bmr_13 = (bmr_1)this.j().l();
                long l = bmr_13.a_();
                ezm_1 ezm_13 = bmr_13.dx();
                int n = ezm_13.g();
                ezn_1 ezn_12 = new ezn_1();
                int n2 = ezn_12.a(l, bae.h().a("build.default.name", n + 1), -1, false);
                this.k.a((int)((byte)n2));
                this.k.a();
                fis_1.a().a((ajf_1)this.k, this.k.d());
                this.r();
                return false;
            }
            case 17577: {
                if (azu_0.j().n().f()) {
                    cbx_2.a();
                    return false;
                }
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("sheet.remove.confirmation", new Object[0]), cfn_0.a(0), 24L, 102, 1);
                fzm_02.a(new cWB(this));
                return false;
            }
            case 18529: {
                dfc dfc8 = (dfc)adt_12;
                ble_0 ble_02 = (ble_0)dfc8.j();
                int n = ble_02.c();
                if (fpm_0.b().q("buildSheetSetIconsDialog")) {
                    fpm_0.b().o("buildSheetSetIconsDialog");
                }
                this.k.a((int)((byte)n));
                this.k.a();
                fis_1.a().a((ajf_1)this.k, this.k.d());
                fis_1.a().a((ajf_1)this.k, "hasInvalidSheet");
                this.r();
                return false;
            }
            case 17037: {
                int n;
                if (azu_0.j().n().f()) {
                    cbx_2.a();
                    return false;
                }
                blx_1 blx_14 = this.j().l();
                ezm_1 ezm_14 = blx_14.dx();
                ezj_1 ezj_13 = ezm_14.a(n = this.k.f());
                if (ezj_13 == null) {
                    return false;
                }
                String string = ezj_13.b();
                int n3 = ezj_13.c();
                int n4 = ezj_13.e();
                int n5 = ezj_13.e();
                int n6 = ezj_13.e();
                int n7 = ezj_13.d();
                ezn_1 ezn_13 = new ezn_1();
                if (this.k.h() != n3 && !this.a(blx_14, ezj_13)) {
                    this.a(ezj_13, string, n3, n4, n5, n6, n7);
                    fis_1.a().a((ajf_1)this.k, this.k.d());
                    return false;
                }
                this.r();
                clv_0 clv_02 = new clv_0(blx_14.a_(), ezl_1.a(ezj_13));
                azu_0.j().K().c(clv_02);
                fis_1.a().a((ajf_1)this.k, this.k.d());
                if (azu_0.j().c(dcX.a)) {
                    dcX.a.c();
                }
                this.g();
                return false;
            }
            case 16359: {
                this.r();
                return false;
            }
            case 17274: {
                return false;
            }
            case 19982: {
                this.d();
                return false;
            }
            case 19133: {
                return false;
            }
            case 16121: {
                return false;
            }
            case 18150: {
                dfc dfc9 = (dfc)adt_12;
                int n = dfc9.c();
                return false;
            }
            case 18956: {
                dfc dfc10 = (dfc)adt_12;
                ble_0 ble_03 = (ble_0)dfc10.j();
                int n = ble_03.c();
                this.a(n - 1, n);
                return false;
            }
            case 17007: {
                dfc dfc11 = (dfc)adt_12;
                ble_0 ble_04 = (ble_0)dfc11.j();
                int n = ble_04.c();
                this.a(n, n + 1);
                return false;
            }
        }
        return true;
    }

    private void a(int n, int n2) {
    }

    private static void h() {
        bSO bSO2 = ddO.a().f();
        bSO2.a(bSO2.a("wakfu_service"));
        bSO2.c("");
    }

    public void a(bmr_1 bmr_12) {
        bmk_1 bmk_12 = bzg_1.a.a(bmr_12);
        blx_1 blx_12 = bmk_12.l();
        this.k = new bld_0((bmr_1)blx_12);
        this.k.a();
        fis_1.a().a("buildSheetView", this.k);
    }

    private void a(ezj_1 ezj_12, String string, int n, int n2, int n3, int n4, int n5) {
        ezj_12.a(string);
        ezj_12.a(n);
        ezj_12.b(n5);
    }

    private boolean a(blx_1 blx_12, ezj_1 ezj_12) {
        if (new ezn_1().e(blx_12.a_(), ezj_12.e(), this.k.h())) {
            if (azu_0.j().c(cVw.a)) {
                bkr_2.v.a((short)this.k.h());
            }
            return true;
        }
        return false;
    }

    public void a(blx_1 blx_12, int n) {
        ezn_1 ezn_12 = new ezn_1();
        if (ezn_12.a(blx_12.a_(), n)) {
            clo_1 clo_12 = new clo_1();
            clo_12.a(blx_12.a_());
            clo_12.a((byte)n);
            azu_0.j().K().c(clo_12);
            if (this.k != null) {
                this.k.a(true);
                this.g();
            } else {
                cwa_0.a(blx_12);
            }
        }
        if (this.k != null) {
            // empty if block
        }
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            super.a(aav_22, false);
            this.j = new cwc_0(this);
            cdw_0.n().c(600012L);
            fpm_0.b().a(this.j);
            fpm_0.b().a("wakfu.buildSheetSet", cfk_0.class);
            bmk_1 bmk_12 = bzg_1.a.a(bzf_1.a());
            bmk_1 bmk_13 = dcX.a.j();
            bmr_1 bmr_12 = bkr_2.v.r();
            if (bmk_13 != null && bmr_12 == bmk_13.l()) {
                blx_1 blx_12 = bmk_13.l();
                this.k = new bld_0((bmr_1)blx_12);
            } else {
                blx_1 blx_13 = bmk_12.l();
                this.k = new bld_0((bmr_1)blx_13);
            }
            this.k.a();
            fis_1.a().a("buildSheetView", this.k);
            this.r();
        }
    }

    public void a(String ... stringArray) {
        if (this.k != null) {
            fis_1.a().a((ajf_1)this.k, stringArray);
        }
    }

    public static void a() {
        if (!azu_0.j().c(a)) {
            azu_0.j().a(a);
        } else {
            azu_0.j().b(a);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (fpm_0.b().q("buildSheetSetIconsDialog")) {
                fpm_0.b().o("buildSheetSetIconsDialog");
            }
            super.b(aav_22, false);
            cdw_0.n().c(600013L);
            fpm_0.b().b(this.j);
            fpm_0.b().o("buildSheetSetDialog");
            fpm_0.b().e("wakfu.buildSheetSet");
            fis_1.a().a("buildSheetView", (Object)null);
            this.r();
        }
    }

    public final void c() {
        azu_0 azu_02 = azu_0.j();
        if (azu_02.c(this)) {
            azu_02.b(this);
        } else {
            azu_02.a(this);
        }
    }

    public void d() {
    }

    private void i() {
        if (this.l != null) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("buildSheetSetDialog");
        fru_0 fru_02 = (fru_0)fyy_02.a("validateButton");
        this.l = new fbx_1();
        this.l.onCheckOut();
        this.l.setFile("6001078.xps");
        this.l.setAlignment(frs_0.e);
        fru_02.getAppearance().add(this.l);
    }

    void r() {
        if (this.l != null) {
            fyy_0 fyy_02 = fpm_0.b().h().d("buildSheetSetDialog");
            fru_0 fru_02 = (fru_0)fyy_02.a("validateButton");
            if (fru_02 != null) {
                fru_02.getAppearance().c(this.l);
            }
            this.l = null;
        }
    }

    public bld_0 e() {
        return this.k;
    }

    @Override
    public String f() {
        return "buildSheetSetDialog";
    }

    public static boolean a(cyt_0 cyt_02, bmr_1 bmr_12, byte by) {
        if (azu_0.j().c(cyt_02)) {
            cyt_0.a().a(bmr_12);
            cyt_0.b(by);
            return true;
        }
        return false;
    }

    public static boolean a(dcX dcX2, bmr_1 bmr_12, byte by) {
        if (azu_0.j().c(dcX2)) {
            dcX2.a(bmr_12);
            dcX.a.d(by);
            dcX2.a();
            return true;
        }
        return false;
    }

    public void a(dcX dcX2, byte by) {
        dcX.a.a(by);
        dcX.a.d();
    }

    public static boolean a(cVw cVw2, bmr_1 bmr_12, byte by) {
        if (azu_0.j().c(cVw2)) {
            bkr_2.v.a(bmr_12);
            bkr_2.v.a((int)by);
            cVw.a();
            return true;
        }
        bmk_1 bmk_12 = bzg_1.a.a(bmr_12);
        fis_1.a().a("characterSheet", (Object)bmk_12, "characterSheetDialog");
        return false;
    }

    public void a(cVw cVw2, byte by) {
        if (!azu_0.j().c(cwu_0.h())) {
            azu_0.j().a(cwu_0.h());
        }
        cVw2.a(by);
        cVw2.c();
    }

    public void g() {
    }

    private static void a(blx_1 blx_12) {
        ezj_1 ezj_12 = blx_12.dx().d();
        if (ezj_12 == null || !(blx_12 instanceof bmr_1)) {
            return;
        }
        bmr_1 bmr_12 = (bmr_1)blx_12;
        cwa_0.a(cyt_0.a(), bmr_12, (byte)ezj_12.e());
        cwa_0.a(dcX.a, bmr_12, (byte)ezj_12.e());
        cwa_0.a(cVw.a, bmr_12, (byte)ezj_12.e());
    }
}

