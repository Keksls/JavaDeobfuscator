/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayDeque;
import java.util.Optional;
import org.apache.log4j.Logger;

public class cZk
implements ahr_1 {
    private static final Logger b = Logger.getLogger(cZk.class);
    private static final cZk c = new cZk();
    public static final int a = 2000;
    private static final float d = 0.4f;
    private static final float e = 1.0f;
    private final ArrayDeque<brm_2> f = new ArrayDeque();
    private fzi g;
    private ans_1 h;

    public static cZk a() {
        return c;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19004: {
                bmr_1 bmr_12;
                dfc dfc2 = (dfc)adt_12;
                int n = dfc2.c();
                Optional<brm_2> optional = brp_2.a().b(n);
                if (optional.isEmpty()) {
                    return false;
                }
                brm_2 brm_22 = optional.get();
                if (brm_22.g().isEmpty()) {
                    b.warn((Object)("No guide element to display for guide=" + n));
                    return false;
                }
                if (!brl_2.b(n)) {
                    brl_2.a(n);
                } else if (!brm_22.d()) {
                    return false;
                }
                if (!((bvx_0)ans_0.D().h()).a(bWe.Z) && !brm_22.d()) {
                    return false;
                }
                if (!(brm_22.e() == null || (bmr_12 = azu_0.j().k()) != null && brm_22.e().b(bmr_12, bmr_12, null, bmr_12.Q_()))) {
                    return false;
                }
                this.a(brm_22);
                return false;
            }
            case 17438: {
                dfc dfc3 = (dfc)adt_12;
                int n = dfc3.c();
                Optional<brm_2> optional = brp_2.a().b(n);
                if (optional.isEmpty()) {
                    return false;
                }
                brm_2 brm_23 = optional.get();
                if (brm_23.g().isEmpty()) {
                    b.warn((Object)("No guide element to display for guide=" + n));
                    return false;
                }
                this.a(brm_23);
                return false;
            }
            case 18676: {
                dfc dfc4 = (dfc)adt_12;
                brr_2 brr_22 = (brr_2)dfc4.j();
                if (brr_22 != null && brr_22.a()) {
                    brr_22.f();
                }
                return false;
            }
            case 17655: {
                dfc dfc5 = (dfc)adt_12;
                brr_2 brr_23 = (brr_2)dfc5.j();
                if (brr_23 != null && brr_23.b()) {
                    brr_23.g();
                }
                return false;
            }
            case 18038: {
                this.c();
                return false;
            }
        }
        return true;
    }

    private void c() {
        if (!fpm_0.b().q("guidePopupDialog")) {
            return;
        }
        if (this.f.isEmpty()) {
            if (!fpm_0.b().q("guideListDialog")) {
                fpm_0.b().e("wakfu.guidePopup");
            }
            fpm_0.b().b(this.h);
            fpm_0.b().o("guidePopupDialog");
            fis_1.a().a("guideViewPopup", (Object)null, "guidePopupDialog");
            fis_1.a().a("guidePopupIsClosable", (Object)true, "guidePopupDialog");
            cff_0.b().b(this.g);
            cdw_0.n().a(1.0f, 1000);
            cdw_0.n().b(1.0f, 1000);
        } else {
            brm_2 brm_22 = this.f.poll();
            fis_1.a().a("guideViewPopup", (Object)new brr_2(brm_22), "guidePopupDialog");
            cZk.d();
        }
    }

    private void a(brm_2 brm_22) {
        if (fpm_0.b().q("guidePopupDialog")) {
            this.f.offer(brm_22);
            return;
        }
        fpm_0.b().a("wakfu.guidePopup", cHg.class);
        fpm_0.b().a("guidePopupDialog", cfi_0.a("guidePopupDialog"), 256L, (short)26000);
        fpm_0.b().a(this.h);
        cdw_0.n().c(600211L);
        cdw_0.n().a(0.4f, 1000);
        cdw_0.n().b(0.4f, 1000);
        fis_1.a().a("guideViewPopup", (Object)new brr_2(brm_22), "guidePopupDialog");
        cff_0.b().a(this.g);
        cZk.d();
    }

    private static void d() {
        fis_1.a().a("guidePopupIsClosable", (Object)false, "guidePopupDialog");
        ado_1.a().a(() -> fis_1.a().a("guidePopupIsClosable", (Object)true, "guidePopupDialog"), 2000L, 1);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.g = string -> {
            brr_2 brr_22 = (brr_2)fis_1.a().d("guideViewPopup", "guidePopupDialog");
            if (brr_22 == null) {
                return fzh.a;
            }
            if (brr_22.a()) {
                brr_22.f();
                return fzh.d;
            }
            boolean bl = fis_1.a().b("guidePopupIsClosable", "guidePopupDialog");
            if (bl) {
                this.c();
            }
            return fzh.d;
        };
        this.h = string -> {
            if (string.equals("guidePopupDialog")) {
                this.f.clear();
                this.c();
            }
        };
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.g = null;
        this.h = null;
        this.f.clear();
        cgu_2.a().b(this);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

