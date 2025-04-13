/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.log4j.Logger;

public class dce
implements ahr_1 {
    private static final dce a = new dce();
    private static final Logger b = Logger.getLogger(dce.class);
    bMn c;
    private ans_1 d;
    private afb_0 e;
    private float f;

    public static dce a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12 instanceof adh_2) {
            bwy_2.h().i();
            return false;
        }
        switch (adt_12.a()) {
            case 18644: {
                bnl_0 bnl_02 = (bnl_0)fis_1.a().e("selectedProtectorMerchantItem");
                bni_0 bni_02 = bnl_02.i();
                bnh_0 bnh_02 = ((dhq)adt_12).k();
                if (bnh_02 == null) {
                    return false;
                }
                String string = bnh_02.t() != eyk_1.g ? "question.confirmPurchase" : "question.confirmPurchaseReplace";
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a(string, bnl_02.a()), cfn_0.a(0), 2073L, 102, 1);
                fzm_02.a(new dcf(this, bni_02, bnh_02));
                return false;
            }
            case 19448: {
                dfc dfc2 = (dfc)adt_12;
                fzm_0 fzm_03 = fpm_0.b().a(bae.h().a("question.confirmTaxChanges", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                fzm_03.a(new dch(this));
                return false;
            }
            case 18945: {
                dfc dfc3 = (dfc)adt_12;
                int n = dfc3.c();
                fgo_0 fgo_02 = fgo_0.a(dfc3.b());
                fzm_0 fzm_04 = fpm_0.b().a(bae.h().a("question.confirmAllocateBudget", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                fzm_04.a(new dci(this, fgo_02, n));
                return false;
            }
            case 19575: {
                dfc dfc4 = (dfc)adt_12;
                int n = (int)dfc4.d();
                int n2 = dfc4.c();
                fzm_0 fzm_05 = fpm_0.b().a(bae.h().a("question.confirmTransferKamas", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                fzm_05.a(new dcj(this, n2, n));
                return false;
            }
            case 17693: {
                dfc dfc5 = (dfc)adt_12;
                int n = dfc5.c();
                boolean bl = dfc5.i();
                TIntArrayList tIntArrayList = this.c.s();
                int n3 = tIntArrayList.indexOf(n);
                if (bl && n3 == -1) {
                    tIntArrayList.add(n);
                } else if (!bl && n3 != -1) {
                    tIntArrayList.removeAt(n3);
                } else {
                    return false;
                }
                cqo_0 cqo_02 = new cqo_0();
                cqo_02.c(n);
                cqo_02.b(this.c.B());
                cqo_02.a(bl);
                azu_0.j().K().c(cqo_02);
                return false;
            }
            case 17870: {
                dfc dfc6 = (dfc)adt_12;
                boolean bl = dfc6.i();
                bMn bMn2 = bwy_2.h().j();
                bwe_2 bwe_22 = bMn2.y().a();
                bwd_2 bwd_22 = bwe_22.a(dfc6.c(), bl);
                if (bMn2.l().b(fgo_0.c) >= (long)bwd_22.k()) {
                    fzm_0 fzm_06 = fpm_0.b().a(bae.h().a("question.confirmPurchaseGeneral", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                    fzm_06.a(new dcl(this, bl, bMn2, dfc6));
                } else {
                    fpm_0.b().a(bae.h().a("error.notEnoughKamas", new Object[0]), cfn_0.a(1), 2051L, 102, 1);
                }
                return false;
            }
            case 17191: {
                dfc dfc7 = (dfc)adt_12;
                boolean bl = dfc7.i();
                bMn bMn3 = bwy_2.h().j();
                fzm_0 fzm_07 = fpm_0.b().a(bae.h().a("question.confirmUnprotect", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                fzm_07.a(new dcm_0(this, bl, bMn3, dfc7));
                return false;
            }
            case 18714: {
                dfc dfc8 = (dfc)adt_12;
                boolean bl = dfc8.i();
                bMn bMn4 = bwy_2.h().j();
                bwe_2 bwe_23 = bMn4.y().a();
                bwd_2 bwd_23 = bwe_23.a(dfc8.c(), bl);
                if (bMn4.l().b(fgo_0.c) >= (long)bwd_23.l()) {
                    fzm_0 fzm_08 = fpm_0.b().a(bae.h().a("question.confirmPurchaseGeneral", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                    fzm_08.a(new dcn_0(this, bl, bMn4, dfc8));
                } else {
                    fpm_0.b().a(bae.h().a("error.notEnoughKamas", new Object[0]), cfn_0.a(1), 2051L, 102, 1);
                }
                return false;
            }
            case 16441: {
                fpm_0.b().a(bae.h().a("question.confirmLawChanges", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                return false;
            }
        }
        return true;
    }

    void c() {
        this.f = bwy_2.h().a(fjb_0.a).b().a();
        cqp_0 cqp_02 = new cqp_0();
        cqp_02.b(this.c.B());
        cqp_02.a(bwy_2.h().a(fjb_0.a).b());
        ans_0.F().K().c(cqp_02);
    }

    @Override
    public long a_() {
        return 4L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bmr_1 bmr_12 = azu_0.j().k();
            this.e = new dco(this);
            bmr_12.bv().a(this.e);
            this.c = bwy_2.h().j();
            if (this.c == null) {
                b.error((Object)"Impossible d'initialiser l'interface de management du protecteur, aucun protecteur n'est d\u00e9finie dans la vue !");
                return;
            }
            cqs_0 cqs_02 = new cqs_0();
            cqs_02.b(this.c.B());
            ans_0.F().K().c(cqs_02);
            ans_0.F().K().c(new cAa());
            fis_1.a().a("selectedProtectorMerchantItem", (Object)null);
            this.f = bwy_2.h().a(fjb_0.a).b().a();
            this.d = new dcp_0(this);
            fpm_0.b().a(this.d);
            fis_1.a().a("weather.manager", brh_0.a());
            fzw_0.a.b("protectorEcosystemLock");
            fyb_0 fyb_02 = fpm_0.b().a("protectorManagementDialog", cfi_0.a("protectorManagementDialog"), 32768L, (short)10000);
            fis_1.a().a("currentPage", (Object)0, fyb_02.getElementMap());
            fpm_0.b().a("wakfu.protectorManagement", cjm_0.class);
            adi_2.a().a(this, 1000L, -1);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bwy_2.h().a(fjb_0.a).b().a(this.f);
            azu_0.j().k().bv().b(this.e);
            this.e = null;
            fzw_0.a.c("protectorEcosystemLock");
            fpm_0.b().e("wakfu.protectorManagement");
            fpm_0.b().b(this.d);
            fis_1.a().a("selectedProtectorMerchantItem");
            fis_1.a().a("weather.manager");
            fpm_0.b().o("protectorManagementDialog");
            adi_2.a().a(this);
        }
    }
}

