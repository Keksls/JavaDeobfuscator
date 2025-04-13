/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;

public class daJ
implements ahr_1 {
    public static final daJ a = new daJ();
    private ans_1 c;
    bln_0 b;
    private final blm_0 d = new blm_0();

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16310: {
                Object object;
                dgL dgL2 = (dgL)adt_12;
                exk_2 exk_22 = dgL2.o();
                long l = azu_0.j().n().u();
                if (exk_22 != null && euu_2.c(l, exk_22.a()) == null) {
                    daJ.a("mimiSymbic.error.itemNotInInventory");
                    return false;
                }
                if (exk_22 != null && (object = faq_0.a(exk_22)) != far_0.a) {
                    String string = object == far_0.g ? "mimiSymbic.error.stack" : "mimiSymbic.error.invalidStatItem";
                    daJ.a(string);
                    return false;
                }
                object = this.b.c();
                if (faq_0.a(exk_22, (exk_2)object) != far_0.a) {
                    this.b.b((exk_2)null);
                }
                exk_2 exk_23 = this.b.b();
                this.b.a(exk_22);
                fis_1.a().a((ajf_1)exk_22, "movable");
                fis_1.a().a((ajf_1)exk_23, "movable");
                return false;
            }
            case 16195: {
                dgL dgL3 = (dgL)adt_12;
                exk_2 exk_24 = this.b.b();
                long l = azu_0.j().n().u();
                if (exk_24 == null) {
                    daJ.a("mimiSymbic.error.notStat");
                    return false;
                }
                exk_2 exk_25 = dgL3.o();
                if (exk_25 == null) {
                    exk_2 exk_26 = this.b.c();
                    this.b.b((exk_2)null);
                    if (exk_26 != null) {
                        fis_1.a().a((ajf_1)exk_26, "movable");
                    }
                    return false;
                }
                if (euu_2.c(l, exk_25.a()) == null) {
                    daJ.a("mimiSymbic.error.itemNotInInventory");
                    return false;
                }
                far_0 far_02 = faq_0.a(exk_24, exk_25);
                if (far_02 != far_0.a) {
                    String string;
                    switch (far_02) {
                        case g: {
                            string = "mimiSymbic.error.stack";
                            break;
                        }
                        case d: {
                            string = "mimiSymbic.error.sameSkinItem";
                            break;
                        }
                        case e: {
                            string = "mimiSymbic.error.invalidType";
                            break;
                        }
                        case f: {
                            string = "mimiSymbic.error.invalidLevel";
                            break;
                        }
                        default: {
                            string = "mimiSymbic.error.invalidSkinItem";
                        }
                    }
                    daJ.a(string);
                    return false;
                }
                exk_2 exk_27 = this.b.c();
                this.b.b(exk_25);
                fis_1.a().a((ajf_1)exk_25, "movable");
                fis_1.a().a((ajf_1)exk_27, "movable");
                this.c();
                return false;
            }
            case 19929: {
                String string = bae.h().a("mimiSymbic.validation", new Object[0]);
                fzn_0 fzn_02 = new fzn_0(102, 1, string, 24L);
                fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
                fzm_02.a(new dak_0(this));
                return false;
            }
        }
        return true;
    }

    private void c() {
        fyy_0 fyy_02 = fpm_0.b().h().d("mimiSymbicDialog");
        fru_0 fru_02 = (fru_0)fyy_02.a("makeButton");
        azf_2 azf_22 = new azf_2(azf_2.e.i());
        azf_2 azf_23 = new azf_2(anr_0.v.i());
        fqd_0 fqd_02 = fru_02.getAppearance();
        fqd_02.removeTweensOfType(fjp_2.class);
        fjp_2 fjp_22 = new fjp_2(azf_23, azf_22, fqd_02, 0, 500, 4, fjw_2.b);
        fqd_02.addTween(fjp_22);
    }

    public static void a(String string) {
        String string2 = bae.h().a(string, new Object[0]);
        fzn_0 fzn_02 = new fzn_0(102, 1, string2, 1026L);
        fpm_0.b().a(fzn_02);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.c = new dal_0(this);
            fpm_0.b().a(this.c);
            fpm_0.b().a("mimiSymbicDialog", cfi_0.a("mimiSymbicDialog"), 32768L, (short)10000);
            fis_1.a().a("itemDetail", (Object)null, "mimiSymbicDialog");
            fis_1.a().a("pet", (Object)null, "mimiSymbicDialog");
            fpm_0.b().a("wakfu.mimiSymbic", chj_0.class);
            fis_1.a().a("mimiSymbicView", this.b);
            bmr_1 bmr_12 = azu_0.j().k();
            bHi bHi2 = bmr_12.da();
            bHi2.c();
            TLongObjectIterator<exg_2> tLongObjectIterator = bHi2.i();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ((exg_2)tLongObjectIterator.value()).b(this.d);
            }
        }
    }

    public void a(exk_2 exk_22) {
        this.b = new bln_0(exk_22);
        azu_0.j().a(this);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            fpm_0.b().o("mimiSymbicDialog");
            fpm_0.b().e("wakfu.mimiSymbic");
            chj_0.clean();
            bmr_1 bmr_12 = azu_0.j().k();
            bHi bHi2 = bmr_12.da();
            bHi2.c();
            TLongObjectIterator<exg_2> tLongObjectIterator = bHi2.i();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ((exg_2)tLongObjectIterator.value()).a(this.d);
            }
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public bln_0 a() {
        return this.b;
    }
}

