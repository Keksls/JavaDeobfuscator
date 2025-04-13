/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cfL
 */
public class cfl_2
implements ahr_1 {
    private static final cfl_2 a = new cfl_2();
    private static final Logger b = Logger.getLogger(cfl_2.class);

    public static cfl_2 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 12218: {
                cvg_2 cvg_22 = (cvg_2)adt_12;
                byte[] byArray = cvg_22.b();
                bmr_1 bmr_12 = (bmr_1)euw_2.a.d(cvg_22.c());
                bmr_12.b(byArray);
                fis_1.a().a((ajf_1)bmr_12, bmr_12.d());
                cnq_0 cnq_02 = new cnq_0();
                cnq_02.a(bmr_12.a_());
                azu_0.j().K().c(cnq_02);
                return false;
            }
            case 13296: {
                cvu_1 cvu_12 = (cvu_1)adt_12;
                long l = cvu_12.b();
                exk_2 exk_22 = azu_0.j().k().g(l);
                bjv_1 bjv_12 = new bjv_1(exk_22);
                bjv_12.a();
                return false;
            }
            case 13544: {
                cvf_2 cvf_22 = (cvf_2)adt_12;
                if (cvf_22.b()) {
                    bHK.a().b();
                }
                ArrayList<Long> arrayList = cvf_22.c();
                for (long l : arrayList) {
                    bHK.a().a(l);
                }
                return false;
            }
            case 13370: {
                cvh_2 cvh_22 = (cvh_2)adt_12;
                bmr_1 bmr_13 = (bmr_1)euu_2.c(azu_0.j().k().U_(), cvh_22.b());
                exk_2 exk_23 = bmr_13.da().i(cvh_22.b());
                if (exk_23 != null) {
                    if (exk_23.e() > -cvh_22.c()) {
                        exk_23.b(cvh_22.c());
                    } else {
                        bha_0.a(bmr_13, exk_23.a(), false);
                        bmr_13.cg().a(exk_23.a(), true);
                    }
                }
                return false;
            }
            case 12433: {
                cvk_1 cvk_12 = (cvk_1)adt_12;
                exk_2 exk_24 = cvk_12.b();
                aUh.b("market.item.sold", exk_24.e(), aUi.a(exk_24), cvk_12.c());
                if (azu_0.j().c(daw.d()) && daw.l()) {
                    daw.d().e();
                }
                if (fpm_0.b().q("marketSoldItemsDetailDialog")) {
                    daw.d().d(bky_0.a().o().e(), true);
                }
                return false;
            }
            case 13650: {
                cvl_1 cvl_12 = (cvl_1)adt_12;
                aUh.b("market.offer.fulfilled", cvl_12.c(), aUi.a(cvl_12.b()), cvl_12.d());
                if (azu_0.j().c(daw.d()) && daw.n()) {
                    daw.d().f();
                }
                if (fpm_0.b().q("marketPurchasedItemsDetailDialog")) {
                    daw.d().h(bky_0.a().s().e(), true);
                }
                return false;
            }
            case 14584: {
                cAU cAU2 = (cAU)adt_12;
                int n = cAU2.b();
                long l = cAU2.c();
                aUh.b("market.item.sold.connection", n, l);
                return false;
            }
            case 14463: {
                cAX cAX2 = (cAX)adt_12;
                aUh.b("market.offer.fulfilled.connection", cAX2.b());
                return false;
            }
            case 15370: {
                cAV cAV2 = (cAV)adt_12;
                bjo_1.a().a(cAV2.b());
                return false;
            }
            case 13619: {
                cvi_2 cvi_22 = (cvi_2)adt_12;
                exk_2 exk_25 = eyl_1.a(cvi_22.d());
                bmr_1 bmr_14 = (bmr_1)euu_2.b(azu_0.j().k().U_(), cvi_22.b());
                if (bmr_14 == null) {
                    return false;
                }
                bHi bHi2 = bmr_14.da();
                if (bHi2 == null) {
                    return false;
                }
                exg_2 exg_22 = bHi2.d(cvi_22.b());
                if (exg_22 == null) {
                    return false;
                }
                try {
                    short s2 = cvi_22.c();
                    if (s2 != -1) {
                        if (exg_22.b(exk_25, s2)) {
                            exg_22.c(exk_25, s2);
                            if (cvi_22.e()) {
                                bjy_1.a(exk_25, bmr_14);
                            }
                        } else {
                            b.error((Object)"Erreur : impossible d'ajouter l'item \u00e0 l'endroit d\u00e9sir\u00e9 par le serveur");
                        }
                    } else if (exg_22.a(exk_25)) {
                        exg_22.f(exk_25);
                        if (cvi_22.e()) {
                            bjy_1.a(exk_25, bmr_14);
                        }
                    } else {
                        b.error((Object)"Erreur : impossible d'ajouter l'item \u00e0 l'endroit d\u00e9sir\u00e9 par le serveur");
                    }
                }
                catch (Uy | uc_0 | uz_0 ua_02) {
                    b.warn((Object)ua_02.getMessage(), (Throwable)ua_02);
                }
                return false;
            }
            case 13660: {
                cuy_1 cuy_12 = (cuy_1)adt_12;
                try {
                    bjp_1.a(cuy_12.b(), cuy_12.c());
                }
                catch (uz_0 uz_02) {
                    b.error((Object)"D\u00e9Synchro d'inventaire : Trop d'item", (Throwable)uz_02);
                }
                catch (Uy uy) {
                    b.error((Object)"D\u00e9Synchro d'inventaire : Duplication", (Throwable)uy);
                }
                catch (uc_0 uc_02) {
                    b.error((Object)"D\u00e9Synchro d'inventaire : Mauvaise position", (Throwable)uc_02);
                }
                return false;
            }
            case 13155: {
                cux_1 cux_12 = (cux_1)adt_12;
                tc_2 tc_22 = cux_12.c();
                try {
                    bjp_1.a(cux_12.b());
                }
                catch (uz_0 uz_03) {
                    b.error((Object)"D\u00e9Synchro d'inventaire : Trop d'item", (Throwable)uz_03);
                }
                catch (Uy uy) {
                    b.error((Object)"D\u00e9Synchro d'inventaire : Duplication", (Throwable)uy);
                }
                catch (uc_0 uc_03) {
                    b.error((Object)"D\u00e9Synchro d'inventaire : Mauvaise position", (Throwable)uc_03);
                }
                bmr_1 bmr_15 = (bmr_1)euw_2.a.d(cux_12.d());
                if (bmr_15 == null) {
                    return false;
                }
                bHi bHi3 = bmr_15.da();
                bHe bHe2 = new bHe(0L, 0, exb_1.o, 0);
                if (!bHe2.b(tc_22)) {
                    b.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du bag uniqueId=" + tc_22.a + ", on ignore les bags restants"));
                    return false;
                }
                bHi3.c(bHe2);
                bHe2.b(bvm_2.a);
                bmr_15.bI();
                cyt_0.c(bHe2.f());
                return false;
            }
            case 12497: {
                cvn_1 cvn_12 = (cvn_1)adt_12;
                long l = cvn_12.d();
                try {
                    bjp_1.a(cvn_12.b());
                }
                catch (uz_0 uz_04) {
                    b.error((Object)"D\u00e9Synchro d'inventaire : Trop d'item", (Throwable)uz_04);
                }
                catch (Uy uy) {
                    b.error((Object)"D\u00e9Synchro d'inventaire : Duplication", (Throwable)uy);
                }
                catch (uc_0 uc_04) {
                    b.error((Object)"D\u00e9Synchro d'inventaire : Mauvaise position", (Throwable)uc_04);
                }
                Object t = euu_2.b(azu_0.j().k().U_(), l);
                ((epq_2)t).dS().k(l);
                ((epq_2)t).bI();
                cyt_0.c(l);
                return false;
            }
            case 13600: {
                boolean bl;
                cuz_1 cuz_12 = (cuz_1)adt_12;
                bHi bHi4 = ((bmr_1)euu_2.b(azu_0.j().k().U_(), cuz_12.b())).da();
                exg_2 exg_23 = bHi4.e(cuz_12.b());
                if (exg_23 == null) {
                    b.error((Object)("Bag " + cuz_12.b() + " doesn't exist"));
                    return false;
                }
                bHg bHg2 = bHi4.b(exg_23.f());
                boolean bl2 = bl = bHg2 != null ? bHg2.a() : false;
                if (cuz_12.d()) {
                    exg_2 exg_24 = bHi4.e(cuz_12.e());
                    if (exg_24 == null) {
                        b.error((Object)("Bag " + cuz_12.e() + " doesn't exist"));
                    } else {
                        bHg bHg3 = bHi4.b(exg_24.f());
                        boolean bl3 = bHg3 != null ? bHg3.a() : false;
                        exg_24.a(cuz_12.f());
                        if (bHg3 != null) {
                            bHg3.a(bl3);
                        }
                    }
                } else if (bHg2 != null) {
                    bHg2.n();
                }
                exg_23.a(cuz_12.c());
                if (bHg2 != null) {
                    bHg2.a(bl);
                }
                bHi4.g();
                return false;
            }
            case 12344: {
                cvb_2 cvb_22 = (cvb_2)adt_12;
                exh_2 exh_22 = cvb_22.b();
                boolean bl = cvb_22.c();
                azu_0.j().k().R_().a(exh_22, bl);
                return false;
            }
            case 13705: {
                cva_2 cva_22 = (cva_2)adt_12;
                this.a(cva_22);
                return false;
            }
            case 12884: {
                cvm_2 cvm_22 = (cvm_2)adt_12;
                this.a(cvm_22);
                return false;
            }
            case 12764: {
                cvo_2 cvo_22 = (cvo_2)adt_12;
                this.a(cvo_22);
                return false;
            }
            case 12369: {
                cvj_2 cvj_22 = (cvj_2)adt_12;
                this.a(cvj_22);
                return false;
            }
            case 13738: {
                cvk_2 cvk_22 = (cvk_2)adt_12;
                this.c(cvk_22.b());
                return false;
            }
            case 12437: {
                cvh_1 cvh_12 = (cvh_1)adt_12;
                this.a(cvh_12);
                return false;
            }
            case 12543: {
                cvf_1 cvf_12 = (cvf_1)adt_12;
                long l = cvf_12.b();
                eyt_0 eyt_02 = bjd_1.a.a(cvf_12.c());
                Optional<exk_2> optional = eyt_02.a((Long)l);
                cZI.a().a(cvf_12.c(), l);
                if (optional.isEmpty()) {
                    b.error((Object)("Try to remove an unknown item id=" + l + " from Equipement Inventory of character " + cvf_12.c()));
                }
                return false;
            }
            case 12948: {
                cvg_1 cvg_12 = (cvg_1)adt_12;
                long l = cvg_12.b();
                byte by = cvg_12.c();
                eZc eZc2 = new eZc();
                eZc2.a(azu_0.j().k().R(), l, by);
                bmr_1 bmr_16 = bjb_1.a.g();
                if (bmr_16.a_() == l && bjb_1.a.k() == by) {
                    int n = bmr_16.dx().d().e();
                    if (n >= by) {
                        --n;
                    }
                    bjb_1.a.b((byte)n);
                    bjb_1.a.a(bmr_16);
                }
                fis_1.a().a((ajf_1)bjb_1.a, bjb_1.a.d());
                return false;
            }
            case 12693: {
                cvp_2 cvp_22 = (cvp_2)adt_12;
                this.a(cvp_22);
                return false;
            }
            case 13745: {
                cvs_1 cvs_12 = (cvs_1)adt_12;
                cfl_2.a(cvs_12);
                return false;
            }
            case 12049: {
                cvi_1 cvi_12 = (cvi_1)adt_12;
                this.a(cvi_12);
                return false;
            }
        }
        return true;
    }

    @Nullable
    private static exk_2 b(long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        fhy_0 fhy_02 = fhx_0.a(l, bmr_12);
        if (fhy_02.b() != fhz_0.f) {
            return fhy_02.a();
        }
        if (cZI.A()) {
            return cZI.a().h(l);
        }
        return null;
    }

    private void a(cvh_1 cvh_12) {
        long l = cvh_12.c();
        eyz_0 eyz_02 = eyy_0.a(cvh_12.d());
        byte by = cvh_12.b();
        eZb eZb2 = eZe.a.a(azu_0.j().k().U_(), l);
        eyz_0 eyz_03 = eZb2.a(by);
        eZb2.a((int)by, eyz_02);
        if (bjb_1.a.g() == null) {
            bjb_1.a.a(azu_0.j().k());
        }
        if (eyz_03 == null) {
            bjb_1.a.a((int)by);
        }
        bjb_1.a.a(bjb_1.a.g());
        if (eyz_03 == null) {
            bjb_1.a.a(true);
        }
        fis_1.a().a((ajf_1)bjb_1.a.h(), bjb_1.a.h().d());
        bnh_1 bnh_12 = (bnh_1)euw_2.a.d(cvh_12.c());
        if (bnh_12 != null && cvh_12.e() >= 0) {
            bld_0 bld_02 = cwa_0.a.e();
            bld_02.b();
            cwa_0.a.d();
            int n = bnh_12.dB().b() - 1;
            if (!fpm_0.b().q("inventoryDialog")) {
                cyt_0.a().g();
            }
            dfc dfc2 = new dfc(18833);
            dfc2.a(cwa_0.a.e().b(n + 1));
            add_2.b().a(dfc2);
            add_2.b().a(new dfc(17773));
        }
    }

    private void a(cvj_2 cvj_22) {
        long l = cvj_22.b();
        int n = cvj_22.c();
        bmr_1 bmr_12 = azu_0.j().k();
        exk_2 exk_22 = euu_2.k(bmr_12.R(), l);
        exk_22.a(n);
        fis_1.a().a((ajf_1)exk_22, "iconUrl", "hasMimiSymbic");
    }

    private void c(long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        exk_2 exk_22 = euu_2.k(bmr_12.R(), l);
        if (exk_22 == null) {
            b.error((Object)("[MIMISYMBIC] On re\u00e7oit une demande de suppression de skin d'un item qui n'existe pas " + l));
            return;
        }
        b.info((Object)("[MIMISYMBIC] Suppression du skin de l'item " + exk_22));
        exk_22.a(0);
        fis_1.a().a((ajf_1)exk_22, "iconUrl", "hasMimiSymbic");
    }

    private void a(cvo_2 cvo_22) {
        eym_2 eym_22 = cvo_22.f();
        if (eym_22 != eym_2.a) {
            String string;
            switch (eym_22) {
                case b: {
                    string = "identification.error.no.enough.space";
                    break;
                }
                case c: {
                    string = "identification.error.too.high.level";
                    break;
                }
                default: {
                    string = "identification.error.unknownError";
                }
            }
            fpm_0.b().a(bae.h().a(string, new Object[0]), cfn_0.a(1), 1027L, 102, 1);
            return;
        }
        long l = cvo_22.c();
        eyj_1 eyj_12 = cvo_22.b();
        eZw eZw2 = cvo_22.e();
        exk_2 exk_22 = cfl_2.b(l);
        if (exk_22 == null) {
            b.error((Object)"We received a roll notification for an unknown item");
            return;
        }
        if (eZw2 != null) {
            exk_22.a(eZw2);
        }
        if (eyj_12 != null) {
            exk_22.a(eyj_12);
        }
        exk_22.P();
        fis_1.a().a((ajf_1)exk_22, "effect", "caracteristic", "effectAndCaracteristic", "allCharacteristics", "identificationNeeded");
        if (cZI.A()) {
            cZI.a().a(exk_22);
        }
        fis_1.a().a("itemPopupDetail", exk_22);
    }

    private void a(cvp_2 cvp_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        exk_2 exk_22 = cfl_2.b(cvp_22.b());
        if (exk_22 == null) {
            b.error((Object)("We received a sublimation notification for an unknown item : " + cvp_22.b()));
            return;
        }
        long l = cvp_22.c();
        exk_2 exk_23 = euu_2.k(bmr_12.R(), l);
        if (exk_23 == null) {
            b.error((Object)("We received a sublimation notification with an unknown sublimation item : " + l));
            return;
        }
        eZy.a(exk_22, exk_23);
        exk_22.P();
        cyq_0.a.c();
    }

    private void a(cvm_2 cvm_22) {
        int n = cvm_22.b();
        if (azu_0.j().c(cwi_0.a())) {
            cwi_0.a().b(n);
        }
    }

    private void a(cva_2 cva_22) {
        int n = cva_22.b();
        int n2 = cva_22.c();
        aUh.b("recycle.resultMessage", n, n2);
    }

    private static void a(cvs_1 cvs_12) {
        ajf_1 ajf_12;
        int n;
        long l = cvs_12.b();
        bmr_1 bmr_12 = azu_0.j().k();
        exk_2 exk_22 = euu_2.k(bmr_12.R(), l);
        if (exk_22 == null) {
            cdw_0.n().c(600125L);
            b.error((Object)("We received a roll notification for an unknown item : " + l));
            return;
        }
        eZw eZw2 = exk_22.y() ? exk_22.C() : new eZw();
        eZw eZw3 = cvs_12.d();
        boolean bl = cvs_12.f();
        int n2 = n = bl ? 600204 : 600125;
        if (eZw3.a(tc_0.e) > eZw2.a(tc_0.e)) {
            n = 600205;
        }
        cdw_0.n().c((long)n);
        exk_22.a(eZw3);
        exk_22.a(cvs_12.c());
        exk_22.P();
        exk_2 exk_23 = cyq_0.a.a();
        if (exk_23 != null) {
            ajf_12 = euu_2.k(bmr_12.R(), exk_23.a());
            cyq_0.a.b((exk_2)(ajf_12 == null || ((exk_2)ajf_12).e() <= 0 ? null : ajf_12));
        }
        cyq_0.a.c();
        ajf_12 = cyq_0.a.d();
        ((btb_1)ajf_12).c(bl ? "enchantment.item.success" : "enchantment.item.success.without.modification");
    }

    private void a(cvi_1 cvi_12) {
        String string = bae.h().a("account.mimiSymbic.confirmed", aUi.a(cvi_12.b()));
        aul_0.a().c(string);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

