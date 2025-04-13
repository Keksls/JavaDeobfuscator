/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cYq
 */
public class cyq_0
implements ahr_1 {
    public static final cyq_0 a = new cyq_0();
    protected static final Logger b = Logger.getLogger(cyq_0.class);
    private btb_1 c;
    private ans_1 d;

    private cyq_0() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18729: {
                this.c.a(((dfv_0)adt_12).k());
                return false;
            }
            case 17847: {
                this.c.a((exk_2)((anw_1)adt_12).j());
                return false;
            }
            case 18975: {
                this.c.b((exk_2)((anw_1)adt_12).j());
                return false;
            }
            case 16469: {
                this.a(this.c.g().b());
                return false;
            }
            case 16929: {
                eyo_2 eyo_22;
                dfy_0 dfy_02 = (dfy_0)adt_12;
                ezb_0 ezb_02 = dfy_02.o();
                int n = cyq_0.a(dfy_02.k(), ezb_02);
                for (int k = 0; k < n && (eyo_22 = this.c.a(dfy_02.k(), ezb_02.e())) != eyo_2.q; ++k) {
                    if (eyo_22 != eyo_2.b) {
                        this.c.a("enchantment.shards.result." + eyo_22.name());
                        break;
                    }
                    this.c.f();
                }
                return false;
            }
            case 16228: {
                this.e();
                return false;
            }
            case 19267: {
                this.c.c();
                this.c.f();
                return false;
            }
            case 17488: {
                this.c.a((bty_0)((anw_1)adt_12).j());
                return false;
            }
            case 16497: {
                this.c.b(!this.c.j());
                return false;
            }
            case 19761: {
                this.c.a(btx_0.a(this.c, (dfx_0)adt_12));
                return false;
            }
            case 18315: {
                this.a((dfw_0)adt_12);
                return false;
            }
            case 16525: {
                this.c.k().a(((anw_1)adt_12).b());
                return false;
            }
        }
        return true;
    }

    private static int a(bib_0 bib_02, ezb_0 ezb_02) {
        if (!ezb_02.d()) {
            return 1;
        }
        if (ezb_02.a() == ezc_0.e) {
            return bib_02.h().d() - bib_02.e();
        }
        if (ezb_02.a() == ezc_0.d) {
            return bib_02.e();
        }
        return 0;
    }

    private void a(int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        long l = this.c.h().a();
        long l2 = this.c.i() == null ? -1L : this.c.i().a();
        long l3 = bmr_12.U_();
        long l4 = bmr_12.R();
        fhy_0 fhy_02 = fhx_0.a(l, l3, l4);
        fhy_0 fhy_03 = fhx_0.a(l2, l3, l4);
        if (!eyl_2.a(azu_0.j().k(), fhy_02, fhy_03)) {
            return;
        }
        exk_2 exk_22 = fhy_02.a();
        exk_2 exk_23 = fhy_03.a();
        if (exk_23 != null && exk_23.B()) {
            this.c.a("enchantment.error.item.must.have.no.sublimation");
            return;
        }
        if (exk_23 != null && exk_23.A() == 4) {
            String string2 = bae.h().a("enchantment.confirmation.maxSlotShards", new Object[0]);
            fzm_0 fzm_02 = fpm_0.b().a(string2, cfn_0.a(0), 7L, 102, 1);
            fzm_02.a((int n2, String string) -> {
                if (n2 == 2) {
                    this.a(n, exk_22, l, l2, l3);
                }
            });
            return;
        }
        this.a(n, exk_22, l, l2, l3);
    }

    private void a(int n, exk_2 exk_22, long l, long l2, long l3) {
        if (this.a(n, exk_22) || this.b(n, exk_22) || this.c(n, exk_22)) {
            cyq_0.a(n, l, l2, l3);
        }
    }

    private boolean a(int n, exk_2 exk_22) {
        if (n != 13829) {
            return false;
        }
        if (!exk_22.y()) {
            this.c.a("enchantment.error.item.must.have.shards.slots");
            return false;
        }
        eZw eZw2 = exk_22.C();
        if (eZw2.h()) {
            this.c.a("enchantment.error.item.is.monochromatic");
            return false;
        }
        if (eZw2.m()) {
            this.c.a("enchantment.error.item.must.have.no.sublimation");
            return false;
        }
        return true;
    }

    private boolean b(int n, exk_2 exk_22) {
        if (n != 12179) {
            return false;
        }
        if (exk_22.C().b() >= 4) {
            this.c.a("enchantment.max.slots.count.reached");
            return false;
        }
        return true;
    }

    private boolean c(int n, exk_2 exk_22) {
        if (n != 13446) {
            return false;
        }
        if (exk_22.C().m()) {
            this.c.a("enchantment.error.item.must.have.no.sublimation");
            return false;
        }
        if (exk_22.C().e()) {
            this.c.a("enchantment.error.item.must.not.have.shards.slotted");
            return false;
        }
        if (exk_22.C().h() && exk_22.C().b((byte)0).c() == tc_0.e) {
            this.c.a("enchantment.best.colors.reached");
            return false;
        }
        return true;
    }

    private static void a(int n, long l, long l2, long l3) {
        azu_0.j().K().c(new cmb_0(n).a(l).b(l2).c(l3));
    }

    private void e() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        azu_0.j().K().c(new cma_0().b(bmr_12.U_()).a(this.c.h().a()).a(this.c.b()));
        this.c.c();
    }

    public void a(boolean bl) {
        if (this.c == null) {
            return;
        }
        this.c.a(bl);
    }

    public void a(exk_2 exk_22) {
        if (azu_0.j().c(a)) {
            this.c.a();
        }
        if (exk_22 == null) {
            this.c.a((exk_2)null);
            return;
        }
        fhy_0 fhy_02 = fhx_0.a(exk_22.a(), azu_0.j().k());
        if (!fhy_02.b().b() && !fhy_02.b().a()) {
            this.c.a((exk_2)null);
            return;
        }
        this.c.a(exk_22);
    }

    public void b(exk_2 exk_22) {
        this.c.b(exk_22);
    }

    public exk_2 a() {
        return this.c.i();
    }

    public void c() {
        if (this.c == null) {
            return;
        }
        this.c.e();
    }

    private void a(dfw_0 dfw_02) {
        long l = this.c.h().a();
        cmz_0 cmz_02 = new cmz_0(dfw_02.k(), l);
        azu_0.j().K().c(cmz_02);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.d = string -> {
                if (string.equals("enchantmentDialog")) {
                    azu_0.j().b(a);
                }
            };
            this.c = new btb_1();
            this.c.a(-120);
            this.c.a(btu_1.a, btu_1.f);
            bpc_2 bpc_22 = azu_0.j().k().eE();
            if (bpc_22 != null && bpc_22.ac_() == 30) {
                this.c.a(true);
            }
            fis_1.a().a("itemDetail", (Object)null, "enchantmentDialog");
            fis_1.a().a("pet", (Object)null, "enchantmentDialog");
            fis_1.a().a("enchantmentView", this.c);
            fpm_0.b().a(this.d);
            fpm_0.b().a("enchantmentDialog", cfi_0.a("enchantmentDialog"), 32768L, (short)10000);
            fpm_0.b().a("wakfu.enchantment", cgm_0.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = null;
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 != null && bmr_12.eE() != null && bmr_12.eE().ac_() == 30) {
                bmr_12.dN();
            }
            fpm_0.b().b(this.d);
            fpm_0.b().o("enchantmentDialog");
            fpm_0.b().e("wakfu.enchantment");
            fis_1.a().a("enchantmentView");
        }
    }

    public btb_1 d() {
        return this.c;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

