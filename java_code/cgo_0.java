/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cGO
 */
@fpw_0
public class cgo_0
extends cGQ {
    public static final String PACKAGE = "wakfu.equipment";
    public static final String a = "_AnimStatique";
    private static long f;
    protected static final Logger b;
    private static fvk_0 g;
    private static fsk_0 h;
    private static final ArrayList<cHx> i;
    private static fbx_1 j;

    public static void addListener(cHx cHx2) {
        i.add(cHx2);
    }

    public static void removeListener(cHx cHx2) {
        i.remove(cHx2);
    }

    public static void onSlotClick(fck_2 fck_22, bja_1 bja_12) {
        exh_2 exh_22 = bja_12.a();
        dfc dfc2 = new dfc(17417);
        dfc2.a(bja_12);
        add_2.b().a(dfc2);
    }

    public static void filterItems(fzs fzs2, fuh_0 fuh_02, fug_0 fug_02, fug_0 fug_03) {
        if (fzs2 instanceof fcd_2 && ((fcd_2)fzs2).k() != 10) {
            return;
        }
        short s2 = -1;
        String string = fug_02.getText();
        String string2 = fug_03.getText();
        if (string != null && string.length() > 0) {
            s2 = Co.h(string);
        }
        short s3 = -1;
        if (string2 != null && string2.length() > 0) {
            s3 = Co.h(string2);
        }
        dgI dgI2 = new dgI();
        dgI2.b(fuh_02.getText());
        dgI2.b(s2);
        dgI2.c(s3);
        add_2.b().a(dgI2);
    }

    public static void itemDropped(fcv_2 fcv_22, bja_1 bja_12) {
        long l;
        Object object = fcv_22.n();
        if (object == null) {
            return;
        }
        if (object instanceof exk_2) {
            l = ((exk_2)object).a();
        } else {
            if (!(object instanceof bja_1)) {
                return;
            }
            l = ((bja_1)object).h().a();
        }
        cgo_0.onDropItem();
        dfc dfc2 = new dfc(19312);
        dfc2.a(bjb_1.a.h().a(bja_12.a()));
        dfc2.a(l);
        add_2.b().a(dfc2);
    }

    public static void itemChoosen(fcb_2 fcb_22) {
        Object object = fcb_22.j();
        if (!(object instanceof bja_1)) {
            return;
        }
        bja_1 bja_12 = (bja_1)object;
        exk_2 exk_22 = bja_12.h();
        if (exk_22 == null) {
            return;
        }
        bja_1 bja_13 = bjb_1.a.h().a(bja_12.a());
        long l = exk_22.a();
        dfc dfc2 = new dfc(19312);
        dfc2.a(bja_13);
        dfc2.a(l);
        add_2.b().a(dfc2);
    }

    public static void equipmentItemDropOut(fcx_1 fcx_12) {
        Object object = fcx_12.l();
        if (!(object instanceof bja_1)) {
            return;
        }
        bja_1 bja_12 = (bja_1)object;
        dfc dfc2 = new dfc(19941);
        dfc2.a(bja_12);
        add_2.b().a(dfc2);
    }

    public static void onSheetNameChanged(fcz_1 fcz_12) {
        if (!fcz_12.j()) {
            fug_0 fug_02 = (fug_0)fcz_12.e();
            dfc dfc2 = new dfc(16175);
            dfc2.a(fug_02.getText());
            add_2.b().a(dfc2);
        }
    }

    public static void onSheetNameChanged(fcd_2 fcd_22) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        dfc dfc2 = new dfc(16175);
        dfc2.a(fug_02.getText());
        add_2.b().a(dfc2);
    }

    public static void changeSheetLevel(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(17146);
            dfc2.a(((blb_0)fcf_22.l()).a());
            add_2.b().a(dfc2);
        }
    }

    public static void setToCurrentBuildSheet(fzs fzs2) {
        dfc dfc2 = new dfc(18332);
        dfc2.b(bjb_1.a.k());
        add_2.b().a(dfc2);
    }

    public static void addNewSheet(fck_2 fck_22) {
        bmr_1 bmr_12 = bjb_1.a.g();
        if (bmr_12 == null) {
            return;
        }
        eZb eZb2 = bmr_12.dB();
    }

    public static void removeSheet(fck_2 fck_22) {
        dfc dfc2 = new dfc(16588);
        dfc2.b(bjb_1.a.k());
        add_2.b().a(dfc2);
    }

    public static void selectPage(fcb_2 fcb_22) {
        dfc dfc2 = new dfc(18833);
        dfc2.a(fcb_22.j());
        add_2.b().a(dfc2);
    }

    public static void inventoryDragItem(fcp_1 fcp_12, exk_2 exk_22, bmk_1 bmk_12) {
        exg_2 exg_22 = azu_0.j().k().da().f(exk_22.a());
        if (exg_22 != null) {
            cgo_0.inventoryDragItem(fcp_12, ((bHe)exg_22).b(), bmk_12);
        }
    }

    public static void inventoryDragItem(fcp_1 fcp_12, exk_2 exk_22, bmr_1 bmr_12) {
        exg_2 exg_22 = azu_0.j().k().da().f(exk_22.a());
        if (exg_22 != null) {
            cgo_0.inventoryDragItem(fcp_12, ((bHe)exg_22).b(), bzg_1.a.a(bmr_12));
        }
    }

    public static void inventoryDragItem(fcp_1 fcp_12, bHg bHg2, bmr_1 bmr_12) {
        cgo_0.inventoryDragItem(fcp_12, bHg2, bzg_1.a.a(bmr_12));
    }

    public static void inventoryDragItem(fcp_1 fcp_12, bHg bHg2, bmk_1 bmk_12) {
        bHe bHe2 = bHg2.o();
        Object object = fcp_12.l();
        if (object != null && object instanceof exk_2) {
            if (fpm_0.b().q("splitStackDialog")) {
                fpm_0.b().o("splitStackDialog");
            }
            exk_2 exk_22 = (exk_2)object;
            short s2 = bHe2.a(exk_22.a());
            f = exk_22.a();
            cjk_0.setSourceUniqueId(bHe2.f());
            cjk_0.setSourcePosition((byte)s2);
            short s3 = azu_0.j().k().gO();
            bmk_1 bmk_13 = bmk_12 == null || bmk_12.k() ? cxo_0.c(s3) : bmk_12;
            cjk_0.setSourceCharacter(bmk_13);
            fis_1.a().a("exchange.sourceBag", bHe2);
            fis_1.a().a("exchange.sourcePosition", s2);
            cgo_0.onDragItem(exk_22);
        }
    }

    public static void dropItem(fzs fzs2) {
        fis_1.a().a("exchange.sourceBag");
        fis_1.a().a("exchange.sourcePosition");
        if (fzs2 instanceof fcv_2 || fzs2 instanceof fcx_1) {
            cgo_0.onDropItem();
        }
    }

    public static void onDropItem() {
        for (cHx cHx2 : i) {
            try {
                cHx2.a();
            }
            catch (Exception exception) {
                b.error((Object)exception);
            }
        }
        if (cZI.A()) {
            cZI.a().v();
        }
    }

    public static void onDragItem(exk_2 exk_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bvz_2.a.b() != null) {
            return;
        }
        if (cZI.A()) {
            cZI.a().c(exk_22);
        }
        for (cHx cHx2 : i) {
            try {
                cHx2.a(exk_22);
            }
            catch (Exception exception) {
                b.error((Object)exception);
            }
        }
    }

    public static void moveItemsFromHeroesToCurrentInventory(fck_2 fck_22) {
        if (!euu_2.a()) {
            return;
        }
        bmr_1 bmr_12 = cyt_0.s();
        long l = bmr_12.U_();
        euu_2.a(l, cgo_0::a);
    }

    private static void a(epq_2 epq_22) {
        if (epq_22 == null) {
            return;
        }
        bmr_1 bmr_12 = cyt_0.s();
        if (epq_22.a_() == bmr_12.a_()) {
            return;
        }
        bmk_1 bmk_12 = bzg_1.a.a((bnh_1)epq_22);
        bmk_1 bmk_13 = bzg_1.a.a(bmr_12);
        dgN dgN2 = new dgN();
        dgN2.a(bmk_12);
        dgN2.b(bmk_13);
        dgN2.a_(18194);
        add_2.b().a(dgN2);
    }

    public static void openAllHeroesViews(fck_2 fck_22, fvk_0 fvk_02) {
        if (!euu_2.a()) {
            return;
        }
        bmr_1 bmr_12 = cyt_0.s();
        long l = bmr_12.U_();
        int n = fck_22.v();
        int n2 = fck_22.w();
        euu_2.a(l, (T epq_22) -> {
            if (epq_22.a_() == bmr_12.a_()) {
                return;
            }
            bmk_1 bmk_12 = bzg_1.a.a((bnh_1)epq_22);
            cyt_0.a().b(bmk_12, "newInventoryOnlyDialog", "equipInventWindow", n, n2, fvk_02);
        });
    }

    public static void openHeroView(fck_2 fck_22, fvk_0 fvk_02, bnh_1 bnh_12) {
        if (!euu_2.a()) {
            return;
        }
        int n = fck_22.v();
        int n2 = fck_22.w();
        bmk_1 bmk_12 = bzg_1.a.a(bnh_12);
        if (bmk_12 == null) {
            return;
        }
        cyt_0.a().b(bmk_12, "newInventoryOnlyDialog", "equipInventWindow", n, n2, fvk_02);
    }

    public static void openCompanionView(fck_2 fck_22, fvk_0 fvk_02, brn brn2) {
        cyt_0.a().a(cxo_0.c(brn2.f()), "equipInventWindow", fck_22.v(), fck_22.w());
    }

    public static void equipmentDragItem(fzs fzs2, String string, bmk_1 bmk_12) {
        if (fzs2 instanceof fcp_1) {
            fcp_1 fcp_12;
            if (fpm_0.b().q("splitStackDialog")) {
                fpm_0.b().o("splitStackDialog");
            }
            if ((fcp_12 = (fcp_1)fzs2).l() != null && fcp_12.l() instanceof exk_2) {
                f = ((exk_2)fcp_12.l()).a();
                cjk_0.setSourceUniqueId(2L);
                cjk_0.setSourcePosition(Byte.valueOf(string).byteValue());
                cjk_0.setSourceCharacter(bmk_12);
                fis_1.a().a("exchange.sourceBag", azu_0.j().k().dC());
                fis_1.a().a("exchange.sourcePosition", cjk_0.getSourcePosition());
                exk_2 exk_22 = (exk_2)fcp_12.l();
                cgo_0.onDragItem(exk_22);
            }
        }
    }

    public static void itemDropOut(fcx_1 fcx_12) {
        cgo_0.itemDropOut(fcx_12, null);
    }

    public static void itemDropOut(fcx_1 fcx_12, bmk_1 bmk_12) {
        cgo_0.dropItem(fcx_12);
        if (fcx_12.l() instanceof bhz_1) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bvz_2.a.b() != null) {
            return;
        }
        if (!azu_0.j().k().a(enw_0.k)) {
            aUh.a("error.playerNotSubscribed", new Object[0]);
            return;
        }
        if (fcx_12.l() instanceof exk_2) {
            exk_2 exk_22 = (exk_2)fcx_12.l();
            if (fta_0.getInstance().getWidget(fcx_12.v(), fcx_12.w()) == fta_0.getInstance() && exk_22.a() == f) {
                if (bmk_12 != null && bmk_12.k()) {
                    short s2 = azu_0.j().k().gO();
                    bmk_1 bmk_13 = cxo_0.c(s2);
                    dgL dgL2 = new dgL();
                    dgL2.a(exk_22);
                    dgL2.b(bmk_12.m().f(exk_22.a()));
                    dgL2.a(bmk_12);
                    dgL2.b(bmk_13);
                    dgL2.a_(17408);
                    add_2.b().a(dgL2);
                    return;
                }
                cgo_0.deleteItem(exk_22);
            }
        }
    }

    public static void dropBag(fzs fzs2) {
        if (!(fzs2 instanceof fcv_2)) {
            return;
        }
        cgo_0.onDropItem();
        fcv_2 fcv_22 = (fcv_2)fzs2;
        Object object = fcv_22.n();
        if (object == null) {
            return;
        }
        if (object instanceof exk_2) {
            exk_2 exk_22 = (exk_2)object;
            if (exk_22.U().d() == 218 || exk_22.U().d() == 399) {
                bvc_2 bvc_22 = bvz_2.a.b();
                if (bvc_22 != null && exk_22.a() == bvc_22.o()) {
                    dgf_0 dgf_02 = new dgf_0();
                    dgf_02.a_(18612);
                    dgf_02.b(bvc_22.a());
                    dgf_02.a(exk_22);
                    dgf_02.c(exk_22.e());
                    add_2.b().a(dgf_02);
                    bvc_22.f(-1L);
                    return;
                }
                ftj_0 ftj_02 = fcv_22.k().getRenderableParent();
                byte by = (byte)(ftj_02.getCollection().getTableIndex(ftj_02) + 1);
                short s2 = cjk_0.getSourcePosition();
                dgL dgL2 = new dgL();
                dgL2.a(exk_22);
                dgL2.c(s2);
                dgL2.e(by);
                dgL2.b(bzg_1.a.a(cyt_0.s()));
                dgL2.b(cjk_0.getSourceUniqueId());
                if (cyt_0.s().da().a(by) == null) {
                    dgL2.a_(16908);
                } else {
                    dgL2.a_(16099);
                }
                add_2.b().a(dgL2);
            } else {
                ftj_0 ftj_03 = fcv_22.k().getRenderableParent();
                byte by = (byte)(ftj_03.getCollection().getTableIndex(ftj_03) + 1);
                short s3 = cjk_0.getSourcePosition();
                exg_2 exg_22 = azu_0.j().k().da().a(by);
                if (exg_22 != null) {
                    boolean bl;
                    cjk_0.setDestinationUniqueId(exg_22.f());
                    short s4 = exg_22.c(exk_22);
                    if (s4 == -1) {
                        s4 = exg_22.l();
                    }
                    if (s4 == -1) {
                        fpm_0.b().a(bae.h().a("error.bagFull", new Object[0]), cfn_0.a(1), 1027L, 102, 1);
                        return;
                    }
                    cjk_0.setDestinationPosition(s4);
                    boolean bl2 = fcv_22.t();
                    boolean bl3 = ((bvx_0)ans_0.D().h()).a(bWe.P);
                    boolean bl4 = bl = exk_22.e() > 1 && bl2 ^ bl3;
                    if (bl) {
                        cjk_0.setDestinationUniqueId(exg_22.f());
                        cjk_0.setMaxQuantity(exk_22.e());
                        cjk_0.setItem(exk_22);
                        cjk_0.setMessageType((short)16942);
                        dgL dgL3 = new dgL();
                        dgL3.a(exk_22);
                        dgL3.g((short)fcv_22.v());
                        dgL3.h((short)fcv_22.w());
                        dgL3.a_(18919);
                        add_2.b().a(dgL3);
                    } else {
                        dgL dgL4 = new dgL();
                        dgL4.c(s3);
                        dgL4.b(cjk_0.getSourceUniqueId());
                        dgL4.c(exg_22.f());
                        dgL4.e(cjk_0.getDestinationPosition());
                        dgL4.a(cjk_0.getSourceCharacter());
                        dgL4.a(exk_22);
                        dgL4.f((short)-1);
                        dgL4.a_(16942);
                        add_2.b().a(dgL4);
                    }
                }
            }
        } else if (object instanceof bHg) {
            bHe bHe2 = ((bHg)object).o();
            dfc dfc2 = new dfc();
            ftj_0 ftj_04 = fcv_22.k().getRenderableParent();
            dfc2.a((byte)(ftj_04.getCollection().getTableIndex(ftj_04) + 1));
            dfc2.a(bHe2.f());
            dfc2.a_(19986);
            add_2.b().a(dfc2);
        }
    }

    public static void equipmentDropItem(fzs fzs2, String string) {
        cgo_0.equipmentDropItem(fzs2, string, null);
    }

    public static void equipmentDropItem(fzs fzs2, String string, bmk_1 bmk_12) {
        fcv_2 fcv_22;
        cjk_0.setDestinationUniqueId(2L);
        cjk_0.setDestinationPosition(Short.parseShort(string));
        if (fzs2 instanceof fcv_2 && (fcv_22 = (fcv_2)fzs2).n() != null && fcv_22.n() instanceof exk_2) {
            Object object;
            exk_2 exk_22 = (exk_2)fcv_22.n();
            chj_0.checkDragItemDropped(exk_22);
            cgo_0.dropItem(fzs2);
            if (azu_0.j().k().dh() && (object = fis_1.a().f("temporaryInventory.currentDragItemId")) != null && exk_22.a() == ((fit_1)object).m()) {
                dgL dgL2 = new dgL();
                dgL2.a_(17553);
                dgL2.a(exk_22);
                dgL2.f(exk_22.e());
                dgL2.c(cjk_0.getDestinationUniqueId());
                dgL2.e(cjk_0.getDestinationPosition());
                add_2.b().a(dgL2);
                return;
            }
            object = bvz_2.a.b();
            if (object != null) {
                if (exk_22.a() == ((bvc_2)object).o()) {
                    dgf_0 dgf_02 = new dgf_0();
                    dgf_02.a_(18612);
                    dgf_02.b(((ty_0)object).a());
                    dgf_02.a(exk_22);
                    dgf_02.c(exk_22.e());
                    add_2.b().a(dgf_02);
                    ((bvc_2)object).f(-1L);
                }
            } else if (exk_22.a() == f) {
                dgL dgL3 = new dgL();
                dgL3.f((short)1);
                dgL3.b(cjk_0.getSourceUniqueId());
                dgL3.c(2L);
                dgL3.e(cjk_0.getDestinationPosition());
                dgL3.c(cjk_0.getSourcePosition());
                dgL3.c(cjk_0.getDestinationUniqueId());
                dgL3.a(exk_22);
                dgL3.a(cjk_0.getSourceCharacter());
                dgL3.b(bmk_12);
                dgL3.a_(16942);
                add_2.b().a(dgL3);
            }
        }
    }

    public static void equipmentDropItem(fzs fzs2) {
        cgo_0.equipmentDropItem(fzs2, "-1");
    }

    public static void inventoryDropItem(fcv_2 fcv_22) {
        Object object = fcv_22.n();
        if (object == null) {
            return;
        }
        bHe bHe2 = null;
        bHi bHi2 = azu_0.j().k().da();
        exk_2 exk_22 = null;
        if (object instanceof bHg) {
            bHe bHe3 = ((bHg)object).o();
            dgL dgL2 = new dgL();
            dgL2.e((short)-1);
            dgL2.c(-1L);
            dgL2.b(bHe3.f());
            dgL2.a_(18094);
            add_2.b().a(dgL2);
            return;
        }
        if (object instanceof exk_2) {
            exk_22 = (exk_2)fcv_22.n();
        } else if (object instanceof bHN) {
            exk_22 = ((bHN)fcv_22.n()).h();
        }
        bHe2 = (bHe)bHi2.e(exk_22);
        if (bHe2 == null) {
            bHe2 = (bHe)bHi2.a(exk_22);
        }
        if (bHe2 != null) {
            cgo_0.inventoryDropItem(fcv_22, bHe2.b(), bHe2.l());
        }
    }

    public static boolean inventoryDropItem(fzs fzs2, bHg bHg2) {
        return cgo_0.inventoryDropItem(fzs2, bHg2, (short)-1);
    }

    public static boolean validateInventoryDrop(fsv_0 fsv_02, Object object, fsv_0 fsv_03, Object object2, Object object3) {
        if (object instanceof exk_2) {
            return true;
        }
        if (object instanceof bHN) {
            return true;
        }
        if (object instanceof bHg) {
            return true;
        }
        return object instanceof bss_1;
    }

    public static boolean inventoryDropItem(fzs fzs2, bHg bHg2, short s2) {
        if (!(fzs2 instanceof fcv_2)) {
            return true;
        }
        fcv_2 fcv_22 = (fcv_2)fzs2;
        Object object = fcv_22.n();
        if (object == null) {
            return true;
        }
        if (object instanceof bjt_1) {
            bjt_1 bjt_12 = (bjt_1)object;
            if (bjt_12.k()) {
                b.warn((Object)"Dropped a locked item in inventory, this shouldn't be possible");
                return false;
            }
            cgo_0.a(fcv_22, bjt_12, bHg2);
            return true;
        }
        if (object instanceof exk_2) {
            cgo_0.inventoryDropRealItem(fcv_22, bHg2, (exk_2)object, s2);
        } else if (object instanceof bHN) {
            cgo_0.inventoryDropMerchantItem(fcv_22, bHg2, (bHN)object, s2);
        } else if (object instanceof bHg) {
            cgo_0.inventoryDropBagView(fcv_22, bHg2, (bHg)object, s2);
        } else if (object instanceof bss_1) {
            cgo_0.inventoryDropGemItem(fcv_22, bHg2, (bss_1)object, s2);
        } else {
            return false;
        }
        return true;
    }

    private static void a(fcv_2 fcv_22, bjt_1 bjt_12, bHg bHg2) {
        bHe bHe2 = bHg2.o();
        ftj_0 ftj_02 = fcv_22.k().getRenderableParent();
        byte by = (byte)ftj_02.getCollection().getTableIndex(ftj_02);
        if (bjt_12.e() == 1) {
            dgL dgL2 = new dgL();
            dgL2.a(bjt_12);
            dgL2.f((short)1);
            dgL2.c(bHe2.f());
            dgL2.e(by);
            dgL2.a_(16173);
            add_2.b().a(dgL2);
            return;
        }
        cjk_0.setMaxQuantity(bjt_12.e());
        cjk_0.setItem(bjt_12);
        cjk_0.setDestinationPosition(by);
        cjk_0.setDestinationUniqueId(bHe2.f());
        cjk_0.setMessageType((short)16173);
        dgL dgL3 = new dgL();
        dgL3.a(bjt_12);
        dgL3.g((short)fcv_22.v());
        dgL3.h((short)fcv_22.w());
        dgL3.a_(18919);
        add_2.b().a(dgL3);
    }

    public static void prepareSplitStack(short s2, bHe bHe2, fcv_2 fcv_22) {
        cjk_0.setDestinationUniqueId(bHe2.f());
        if (s2 == -1) {
            ftj_0 ftj_02 = fcv_22.k().getRenderableParent();
            s2 = (short)ftj_02.getCollection().getTableIndex(ftj_02);
        }
        cjk_0.setDestinationPosition(s2);
    }

    public static void inventoryDropRealItem(fcv_2 fcv_22, bHg bHg2, exk_2 exk_22, short s2) {
        if (exk_22.equals(cjt_0.getDraggedItem())) {
            return;
        }
        if (chj_0.checkDragItemDropped(exk_22)) {
            return;
        }
        bHe bHe2 = bHg2.o();
        cgo_0.prepareSplitStack(s2, bHe2, fcv_22);
        boolean bl = fcv_22.t();
        boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe.P);
        bmk_1 bmk_12 = bzg_1.a.a((bnh_1)euu_2.b(azu_0.j().k().U_(), bHe2.f()));
        cgo_0.dropItem(fcv_22);
        if (cjq_0.getDraggedItemId() != -1L) {
            cjq_0.setDraggedItemId(-1L);
            return;
        }
        boolean bl3 = exk_22.e() > 1 && bl ^ bl2;
        fit_1 fit_12 = fis_1.a().f("temporaryInventory.currentDragItemId");
        if (azu_0.j().k().dh() && fit_12 != null && exk_22.a() == fit_12.m()) {
            if (bl3) {
                cjk_0.setMaxQuantity(exk_22.e());
                cjk_0.setItem(exk_22);
                cjk_0.setMessageType((short)17553);
                dgL dgL2 = new dgL();
                dgL2.a(exk_22);
                dgL2.g((short)fcv_22.v());
                dgL2.h((short)fcv_22.w());
                dgL2.a_(18919);
                add_2.b().a(dgL2);
            } else {
                dgL dgL3 = new dgL();
                dgL3.a_(17553);
                dgL3.a(exk_22);
                dgL3.f(exk_22.e());
                dgL3.c(cjk_0.getDestinationUniqueId());
                dgL3.e(cjk_0.getDestinationPosition());
                add_2.b().a(dgL3);
            }
            return;
        }
        short s3 = -1;
        if (exk_22.a() == cGi.getDraggedItemId()) {
            s3 = 18118;
            cGi.setDraggedItemId(-1L);
        } else if (exk_22.a() == cjo_0.getDraggedItemId()) {
            s3 = 19489;
            cjo_0.setDraggedItemId(-1L);
        } else if (exk_22.a() == cfo_0.getDraggedItemId()) {
            cfo_0.setDraggedItemId(-1L);
            s3 = 16358;
        } else {
            if (exk_22.a() == cFI.getDraggedItemId()) {
                cFI.setDraggedItemId(-1L);
                ftj_0 ftj_02 = fcv_22.j().getRenderableParent();
                short s4 = (short)ftj_02.getCollection().getTableIndex(ftj_02);
                cFI.removeBook(s4);
                return;
            }
            if (exk_22.a() == chq_0.getDraggedItemId()) {
                chq_0.setDraggedItemId(-1L);
                chq_0.removeItem((exi_2)exk_22);
                return;
            }
            if (exk_22.a() == cGN.getDraggedItemId()) {
                cGN.setDraggedItemId(-1L);
                cGN.unequipItem(exk_22.aT_());
                return;
            }
        }
        if (s3 != -1) {
            if (bl3) {
                cjk_0.setMaxQuantity(exk_22.e());
                cjk_0.setItem(exk_22);
                cjk_0.setMessageType(s3);
                cjk_0.setDestinationCharacter(bmk_12);
                dgL dgL4 = new dgL();
                dgL4.a(exk_22);
                dgL4.g((short)fcv_22.v());
                dgL4.h((short)fcv_22.w());
                dgL4.a_(18919);
                add_2.b().a(dgL4);
            } else {
                dgL dgL5 = new dgL();
                dgL5.a_(s3);
                dgL5.a(exk_22);
                dgL5.f(exk_22.e());
                dgL5.c(cjk_0.getDestinationUniqueId());
                dgL5.e(cjk_0.getDestinationPosition());
                dgL5.b(bmk_12);
                add_2.b().a(dgL5);
            }
            return;
        }
        bvc_2 bvc_22 = bvz_2.a.b();
        if (bvc_22 != null) {
            if (exk_22.a() == bvc_22.o()) {
                if (bl3) {
                    cjk_0.setMaxQuantity(exk_22.e());
                    cjk_0.setItem(exk_22);
                    cjk_0.setExchangeId(bvc_22.a());
                    cjk_0.setMessageType((short)18612);
                    dgL dgL6 = new dgL();
                    dgL6.a(exk_22);
                    dgL6.g((short)fcv_22.v());
                    dgL6.h((short)fcv_22.w());
                    dgL6.a_(18919);
                    add_2.b().a(dgL6);
                } else {
                    dgf_0 dgf_02 = new dgf_0();
                    dgf_02.a_(18612);
                    dgf_02.b(bvc_22.a());
                    dgf_02.a(exk_22);
                    dgf_02.c(exk_22.e());
                    add_2.b().a(dgf_02);
                }
                bvc_22.f(-1L);
            }
        } else if (exk_22.a() == f) {
            if (cjk_0.getSourcePosition() == cjk_0.getDestinationPosition() && bHe2.f() == cjk_0.getSourceUniqueId()) {
                return;
            }
            if (bl3) {
                cjk_0.setDestinationUniqueId(bHe2.f());
                cjk_0.setMaxQuantity(exk_22.e());
                cjk_0.setItem(exk_22);
                cjk_0.setMessageType((short)16942);
                dgL dgL7 = new dgL();
                dgL7.a(exk_22);
                dgL7.g((short)fcv_22.v());
                dgL7.h((short)fcv_22.w());
                dgL7.a(cjk_0.getSourceCharacter());
                dgL7.b(bmk_12);
                dgL7.a_(18919);
                add_2.b().a(dgL7);
            } else {
                dgL dgL8 = new dgL();
                dgL8.e(cjk_0.getDestinationPosition());
                dgL8.c(cjk_0.getSourcePosition());
                dgL8.b(cjk_0.getSourceUniqueId());
                dgL8.c(bHe2.f());
                dgL8.a(cjk_0.getSourceCharacter());
                dgL8.b(bmk_12);
                dgL8.a(exk_22);
                dgL8.f((short)-1);
                dgL8.a_(16942);
                add_2.b().a(dgL8);
            }
        }
    }

    public static void inventoryDropBagView(fcv_2 fcv_22, bHg bHg2, bHg bHg3, short s2) {
        cgo_0.prepareSplitStack(s2, bHg2.o(), fcv_22);
        bHe bHe2 = bHg3.o();
        dgL dgL2 = new dgL();
        dgL2.e(cjk_0.getDestinationPosition());
        dgL2.c(bHg2.o().f());
        dgL2.b(bHe2.f());
        dgL2.a_(18094);
        add_2.b().a(dgL2);
    }

    public static void inventoryDropGemItem(fcv_2 fcv_22, bHg bHg2, bss_1 bss_12, short s2) {
        cgo_0.prepareSplitStack(s2, bHg2.o(), fcv_22);
        dgL dgL2 = new dgL();
        dgL2.c(cjk_0.getDestinationUniqueId());
        dgL2.e(cjk_0.getDestinationPosition());
        dgL2.c(bHg2.o().f());
        dgL2.a(bss_12.a());
        dgL2.a(bss_12.b());
        dgL2.f((short)1);
        dgL2.a_(16477);
        add_2.b().a(dgL2);
    }

    public static void inventoryDropMerchantItem(fcv_2 fcv_22, bHg bHg2, bHN bHN2, short s2) {
        cgo_0.prepareSplitStack(s2, bHg2.o(), fcv_22);
        boolean bl = fcv_22.t();
        boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe.P);
        if (bHN2.e() > 1 && bl ^ bl2) {
            cjk_0.setMaxQuantity(bHN2.e());
            cjk_0.setMerchantItem(bHN2);
            cjk_0.setMessageType((short)16751);
            dgL dgL2 = new dgL();
            dgL2.a(bHN2.h());
            dgL2.g((short)fcv_22.v());
            dgL2.h((short)fcv_22.w());
            dgL2.a_(18919);
            add_2.b().a(dgL2);
        } else {
            dfb_0 dfb_02 = new dfb_0();
            dfb_02.a(bHN2);
            dfb_02.b(cjk_0.getDestinationPosition());
            dfb_02.b(cjk_0.getDestinationUniqueId());
            dfb_02.a_(16751);
            add_2.b().a(dfb_02);
        }
    }

    public static void onItemDoubleClick(fcb_2 fcb_22, String string) {
        cgo_0.onItemDoubleClick(fcb_22);
    }

    public static void onItemDoubleClick(fcb_2 fcb_22) {
        exk_2 exk_22 = (exk_2)fcb_22.j();
        bmr_1 bmr_12 = cyt_0.s();
        if (exk_22 instanceof bjt_1) {
            if (fcb_22.x() != 1) {
                return;
            }
            bjt_1 bjt_12 = (bjt_1)exk_22;
            if (bjt_12.k()) {
                return;
            }
            if (bmr_12.bz() != null) {
                aUh.a("error.impossibleDuringFight", new Object[0]);
                return;
            }
            exg_2 exg_22 = bmr_12.da().e(bjt_12);
            if (exg_22 == null) {
                exg_22 = bmr_12.da().b(bjt_12);
            }
            if (exg_22 == null) {
                return;
            }
            short s2 = exg_22.c(bjt_12);
            if (s2 == -1) {
                s2 = exg_22.l();
            }
            if (s2 == -1) {
                return;
            }
            dgL dgL2 = new dgL();
            dgL2.a(bjt_12);
            dgL2.f(bjt_12.e());
            dgL2.c(exg_22.f());
            dgL2.e(s2);
            dgL2.a_(16173);
            add_2.b().a(dgL2);
            return;
        }
        exg_2 exg_23 = euu_2.m(bmr_12.U_(), exk_22.a());
        if (exg_23 != null) {
            cgo_0.onItemDoubleClick(fcb_22, ((bHe)exg_23).b());
        }
    }

    public static void changeItemBackground(fck_2 fck_22, bmk_1 bmk_12, String string, fvk_0 fvk_02) {
        cgo_0.changeItemBackground(fck_22, bmk_12, null, string, fvk_02, null);
    }

    public static void changeItemBackground(fck_2 fck_22, fvk_0 fvk_02, fil_1 fil_12) {
    }

    public static void changeItemBackground(fck_2 fck_22, bmk_1 bmk_12, fvk_0 fvk_02, Object object, fil_1 fil_12) {
        if (object instanceof bja_1) {
            object = ((bja_1)object).h();
        }
        if (object instanceof bHR) {
            object = ((bHR)object).a();
        }
        if (object instanceof bjx_2) {
            cgo_0.a(fck_22, (bjx_2)object, fvk_02, fil_12);
            return;
        }
        if (object instanceof bjt_1) {
            cgo_0.a(fck_22, (bjt_1)object);
        } else if (object instanceof exk_2) {
            cgo_0.changeItemBackground(fck_22, bmk_12, (exk_2)object, null, fvk_02, fil_12);
        }
    }

    public static void changeItemBackground(fck_2 fck_22, bnh_1 bnh_12, fvk_0 fvk_02, Object object, fil_1 fil_12) {
        if (object instanceof bja_1) {
            object = ((bja_1)object).h();
        }
        if (object instanceof bHR) {
            object = ((bHR)object).a();
        }
        if (object instanceof bjt_1) {
            cgo_0.a(fck_22, (bjt_1)object);
        } else if (object instanceof exk_2) {
            cgo_0.changeItemBackground(fck_22, bzg_1.a.a(bnh_12), (exk_2)object, null, fvk_02, fil_12);
        }
    }

    private static void a(fck_2 fck_22, bjt_1 bjt_12) {
        if (bjt_12.k()) {
            return;
        }
        fvE fvE2 = (fvE)fck_22.e();
        String string = "";
        string = fck_22.f() == frd_0.y ? bhx_0.b.a() : (fck_22.f() == frd_0.z ? bhx_0.d.a() : bhx_0.c.a());
        fvE2.setStyle(string);
    }

    private static void a(fck_2 fck_22, bjx_2 bjx_22, fvk_0 fvk_02, fil_1 fil_12) {
        if (bjx_22.b()) {
            return;
        }
        fvE fvE2 = (fvE)fck_22.e();
        fvE2.setStyle(fck_22.f() == frd_0.y ? bhx_0.b.a() : bhx_0.d.a());
    }

    public static void changeItemBackground(fck_2 fck_22, bmk_1 bmk_12, exk_2 exk_22, String string, fvk_0 fvk_02, fil_1 fil_12) {
        String string2 = "";
        fvE fvE2 = (fvE)fck_22.e();
        if (bvz_2.a.b() != null && fis_1.a().e("exchange.sourceBag") instanceof bHe) {
            return;
        }
        if (exk_22 == null) {
            return;
        }
        long l = azu_0.j().k().U_();
        if (string != null) {
            exk_2 exk_23 = exk_22 = bmk_12 == null ? euu_2.k(l, exk_22.a()) : (exk_2)bmk_12.m().e(Short.parseShort(string));
        }
        if (exk_22 != null) {
            boolean bl = false;
            if (fck_22.f() == frd_0.y) {
                bl = true;
                string2 = exk_22.T().x() != 0 ? "itemSetSelectedBackground" : "itemSelectedBackground";
            } else if (fck_22.f() == frd_0.z) {
                string2 = bhv_1.i(exk_22);
            }
            fvE2.setStyle(string2);
            if (exk_22.T().x() != 0) {
                // empty if block
            }
        }
        if (fil_12 != null) {
            if (fck_22.f() == frd_0.y) {
                cJl.showPopup(fck_22, exk_22, fil_12, fvE2);
            } else {
                cJl.closePopup(fck_22);
            }
        }
    }

    public static void onItemDoubleClick(fcb_2 fcb_22, bHg bHg2) {
        if (fcb_22.j() instanceof bhz_1) {
            return;
        }
        if (fpm_0.b().q("splitStackDialog")) {
            fpm_0.b().o("splitStackDialog");
        }
        exk_2 exk_22 = (exk_2)fcb_22.j();
        bmr_1 bmr_12 = azu_0.j().k();
        cjk_0.setDestinationPosition((short)-1);
        bvc_2 bvc_22 = bvz_2.a.b();
        if (bvc_22 != null) {
            exg_2 exg_22 = euu_2.m(bmr_12.U_(), exk_22.a());
            if (exg_22 == null) {
                return;
            }
            short s2 = exg_22.a(exk_22.a());
            fis_1.a().a("exchange.sourceBag", bHg2.o());
            fis_1.a().a("exchange.sourcePosition", s2);
            dgf_0 dgf_02 = new dgf_0();
            dgf_02.a_(17119);
            dgf_02.b(bvc_22.a());
            dgf_02.a(exk_22);
            dgf_02.c(exk_22.e());
            add_2.b().a(dgf_02);
            return;
        }
        if (fpm_0.b().q("havenWorldResourcesCollectorDialog")) {
            if (bhv_1.c(exk_22)) {
                return;
            }
            dgL dgL2 = new dgL();
            dgL2.a(exk_22.a());
            dgL2.f(exk_22.e());
            dgL2.a_(17594);
            add_2.b().a(dgL2);
            return;
        }
        if (fpm_0.b().q("storageBoxDialog")) {
            dgL dgL3 = new dgL();
            dgL3.a(exk_22.a());
            dgL3.a(exk_22.e());
            dgL3.e(cjk_0.getDestinationPosition());
            dgL3.a_(16838);
            add_2.b().a(dgL3);
        } else if (fpm_0.b().q("freeCollectMachineDialog")) {
            dgL dgL4 = new dgL();
            dgL4.a(exk_22.a());
            dgL4.a(exk_22.e());
            dgL4.a_(17530);
            add_2.b().a(dgL4);
        } else if (fpm_0.b().q("accountChestDialog")) {
            if (!cVg.b.e().e()) {
                dgL dgL5 = new dgL();
                dgL5.a(exk_22.a());
                dgL5.a(exk_22);
                dgL5.f(exk_22.e());
                dgL5.a(cVg.b.e().c());
                dgL5.e((short)-1);
                dgL5.a_(17093);
                add_2.b().a(dgL5);
            }
        } else if (azu_0.j().c(daw.d()) && daw.j()) {
            cHE.a((fck_2)fcb_22, (Object)exk_22);
        } else {
            if (exk_22.T().ag() && !exk_22.ak()) {
                dcB dcB2 = dcB.a();
                dcB2.a(exk_22);
                azu_0.j().a(dcB2);
                return;
            }
            if (exk_22.T().U() && exk_22.T().p() == null) {
                if ((exk_22.ah() || exk_22.ai()) && !bvz_2.a.a()) {
                    if (exk_22.ag()) {
                        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("identification.oldRune.confirmation", new Object[0]), cfn_0.a(0), 25L, 102, 1);
                        fzm_02.a((n, string) -> {
                            if (n == 8) {
                                cgo_0.sendRollRequest(exk_22, fcb_22);
                            }
                        });
                        return;
                    }
                    cgo_0.sendRollRequest(exk_22, fcb_22);
                    return;
                }
                cgo_0.a(fcb_22, bHg2.o());
            } else if (exk_22.T().F().h().length == 0 || exk_22.T().p() != null) {
                cJz.useUsableItem(exk_22, true);
            }
        }
    }

    public static void sendRollRequest(exk_2 exk_22, fzs fzs2) {
        dfc dfc2 = new dfc();
        dfc2.a_(16321);
        dfc2.a(exk_22.a());
        add_2.b().a(dfc2);
        ftj_0 ftj_02 = (ftj_0)fzs2.d();
        if (ftj_02 != null) {
            cgo_0.addRollElementsParticleToContainer(ftj_02);
        }
    }

    public static void addRollElementsParticleToContainer(ftj_0 ftj_02) {
        if (ftj_02 == null) {
            return;
        }
        if (j == null) {
            j = new fbx_1();
        }
        j.onCheckOut();
        j.setFile("6001057.xps");
        j.setAlignment(frs_0.a);
        j.setFollowBorders(true);
        j.setSpeed(500.0f);
        j.setTurnNumber(1);
        fso fso2 = (fso)ftj_02.getInnerElementMap().a("equipmentContainer", false);
        if (fso2 == null) {
            fso2 = (fso)ftj_02.getInnerElementMap().a("itemContainer", false);
        }
        if (fso2 == null) {
            return;
        }
        fqj fqj2 = fso2.getAppearance();
        fqj2.add(j);
    }

    private static void a(fcb_2 fcb_22, bHe bHe2) {
        if (bvz_2.a.b() != null) {
            b.error((Object)"Erreur : impossible de modifier l'\u00e9quipement en \u00e9change");
            return;
        }
        Object object = fcb_22.j();
        if (object instanceof exk_2) {
            cgo_0.a((exk_2)object, bHe2);
        }
    }

    private static void a(exk_2 exk_22, bHe bHe2) {
        if (exk_22.U().d() == 218 || exk_22.U().d() == 399) {
            dgL dgL2 = new dgL();
            dgL2.a(exk_22);
            dgL2.c(cjk_0.getSourcePosition());
            dgL2.e((short)-1);
            dgL2.b(bHe2.f());
            dgL2.b(bzg_1.a.a(cyt_0.s()));
            dgL2.a_(16908);
            add_2.b().a(dgL2);
        } else if (cZI.A()) {
            dfj dfj2 = new dfj(exk_22, null);
            add_2.b().a(dfj2);
            det.b(0);
        }
    }

    public static void onEquipmentDoubleClick(fcb_2 fcb_22, bmk_1 bmk_12, String string) {
        exk_2 exk_22 = (exk_2)fcb_22.j();
        bmr_1 bmr_12 = azu_0.j().k();
        bvc_2 bvc_22 = bvz_2.a.b();
        if (bvc_22 == null) {
            cgo_0.unEquip(fcb_22, bmk_12, string);
            return;
        }
        if (bmk_12.k()) {
            return;
        }
        fis_1.a().a("exchange.sourceBag", bmr_12.dC());
        fis_1.a().a("exchange.sourcePosition", (Object)string);
        dgf_0 dgf_02 = new dgf_0();
        dgf_02.a_(17119);
        dgf_02.b(bvc_22.a());
        dgf_02.a(exk_22);
        dgf_02.c(exk_22.e());
        add_2.b().a(dgf_02);
    }

    public static void unEquip(fck_2 fck_22, bja_1 bja_12) {
        exh_2 exh_22 = bja_12.a();
        exk_2 exk_22 = bja_12.h();
        if (exk_22 == null) {
            return;
        }
        if (exk_22.ah() || exk_22.ai()) {
            String string2 = exk_22.ag() ? "identification.oldRune.confirmation" : "identification.confirmation";
            fzm_0 fzm_02 = fpm_0.b().a(bae.h().a(string2, new Object[0]), cfn_0.a(0), 25L, 102, 1);
            fzm_02.a((n, string) -> {
                if (n == 8) {
                    dfc dfc2 = new dfc();
                    dfc2.a_(16321);
                    dfc2.a(exk_22.a());
                    add_2.b().a(dfc2);
                }
            });
            return;
        }
        dfc dfc2 = new dfc(19941);
        dfc2.a(bja_12);
        add_2.b().a(dfc2);
    }

    public static void unEquip(fcb_2 fcb_22, bmk_1 bmk_12, String string) {
        if (bvz_2.a.b() != null) {
            return;
        }
        Object object = fcb_22.j();
        if (object instanceof exk_2) {
            bmk_1 bmk_13 = bzg_1.a.a((bnh_1)euu_2.d(azu_0.j().k().U_(), ((exk_2)object).a()));
            bmk_1 bmk_14 = bmk_13 != null ? bmk_13 : bzg_1.a.a(azu_0.j().k());
            dgL dgL2 = new dgL();
            dgL2.a((exk_2)object);
            dgL2.b(Short.valueOf(string));
            dgL2.a(bmk_12);
            dgL2.b(bmk_14);
            dgL2.a_(17408);
            add_2.b().a(dgL2);
        }
    }

    public static void closeWindow(fzs fzs2) {
        if (fzs2.f() == frd_0.C) {
            dgJ dgJ2 = new dgJ();
            dgJ2.a_(16317);
            dgJ2.a(((fyb_0)fzs2.d()).getElementMap().c());
            add_2.b().a(dgJ2);
        }
    }

    public static void closeItemsList(fzs fzs2) {
        if (fzs2.f() == frd_0.C) {
            dgJ dgJ2 = new dgJ();
            dgJ2.a_(19309);
            dgJ2.a(((fyb_0)fzs2.d()).getElementMap().c());
            add_2.b().a(dgJ2);
        }
    }

    public static void unequipInventory(fcb_2 fcb_22) {
        bHe bHe2 = ((bHg)fcb_22.j()).o();
        dgL dgL2 = new dgL();
        dgL2.e((short)-1);
        dgL2.c(-1L);
        dgL2.b(bHe2.f());
        dgL2.a_(18094);
        add_2.b().a(dgL2);
    }

    public static void minimizeMaximizeDialog(fzs fzs2, fvk_0 fvk_02) {
        if (fzs2.f() == frd_0.D) {
            fvE fvE2 = (fvE)fvk_02.getElementMap().a("contentWindow");
            fvE fvE3 = (fvE)fvk_02.getElementMap().a("barCloseButton");
            if (!fvE2.getVisible()) {
                fvk_02.setPrefSize(new fjf_2(0, 0));
            } else {
                fvk_02.setPrefSize(new fjf_2(0, fvE2.getHeight()));
            }
            fvE2.setVisible(!fvE2.getVisible());
            fvE3.setVisible(!fvE3.getVisible());
        }
    }

    public static void showInfos(fzs fzs2, fvk_0 fvk_02, String string) {
        if (fzs2.f() == frd_0.C) {
            fvE fvE2;
            fvE2.setVisible(!(fvE2 = (fvE)fvk_02.getElementMap().a(string + "Info")).getVisible());
            fvE fvE3 = (fvE)fvk_02.getElementMap().a(string + "Button");
            if (fvE3.getStyle().equals("add")) {
                fvE3.setStyle("remove");
            } else {
                fvE3.setStyle("add");
            }
        }
    }

    public static void addToShortcuts(fcb_2 fcb_22) {
        if (fcb_22.j() instanceof bhz_1) {
            return;
        }
        if (fcb_22.j() instanceof bHg) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcb_22.j();
        if (fcb_22.x() != 1 || !fcb_22.r()) {
            return;
        }
        if (exk_22 == null || exk_22.T().F().h().length == 0 && !exk_22.X()) {
            return;
        }
        dhy dhy2 = new dhy();
        dhy2.b(exk_22);
        dhy2.c(-1);
        dhy2.d(-1);
        dhy2.a_(19194);
        dhy2.a(true);
        add_2.b().a(dhy2);
    }

    public static void showItemDetailPopup(fcb_2 fcb_22, fvk_0 fvk_02) {
        Object object = fcb_22.j();
        cJl.showPopup((ajf_1)object, 500);
    }

    public static void showSetDetailPopup(fzs fzs2, Short s2, String string, fil_1 fil_12) {
        bhd_1 bhd_12 = bhe_0.a().a(s2);
        if (Boolean.parseBoolean(string)) {
            cJl.showPopup(fzs2, (ajf_1)bhd_12, fil_12);
        } else {
            fpu_0.closePopup(fzs2, fil_12);
        }
    }

    public static void showCharacterDetailPopup(fzs fzs2, fvk_0 fvk_02) {
        fil_1 fil_12 = (fil_1)fvk_02.getElementMap().a("characterDetailPopup");
        if (fzs2.f() == frd_0.y && !fta_0.getInstance().isDragging()) {
            fpu_0.popup(fzs2, fil_12);
        } else if (fzs2.f() == frd_0.z) {
            fpu_0.closePopup(fzs2, fil_12);
        }
    }

    public static void changeSetBonusList(fcf_2 fcf_22, bhd_1 bhd_12, fuk_0 fuk_02) {
        if (fcf_22.k() && bhd_12 != null && fuk_02 != null) {
            int n = 0;
            if (fcf_22.l() instanceof Integer) {
                n = (Integer)fcf_22.l();
            }
            fuk_02.c(bhd_12.a(n));
        }
    }

    public static void selectPet(fzs fzs2) {
        String string = ((fyb_0)fzs2.d()).getRenderableParent().getElementMap().c();
        fis_1.a().a("itemDetail", (Object)null, string);
    }

    public static void onMouseOverBag(fzs fzs2, fil_1 fil_12) {
        fpu_0.popup(fzs2, fil_12);
        fvE fvE2 = (fvE)fzs2.e();
        fvE2.setStyle("itemSelectedBackground");
    }

    public static void onMouseOutBag(fzs fzs2, fil_1 fil_12) {
        fpu_0.closePopup(fzs2, fil_12);
        fvE fvE2 = (fvE)fzs2.e();
        fvE2.setStyle("itemBackground");
    }

    public static void deleteItem(fzs fzs2) {
        String string = ((fyb_0)fzs2.d()).getElementMap().c();
        exk_2 exk_22 = (exk_2)fis_1.a().d("itemDetail", string);
        cgo_0.deleteItem(exk_22);
        fru_0 fru_02 = (fru_0)fzs2.e();
        fqd_0 fqd_02 = fru_02.getAppearance();
        fqd_02.b();
    }

    public static void deleteItem(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 == null) {
            return;
        }
        bmk_1 bmk_12 = bzg_1.a.a(bmr_12);
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.b(bmk_12);
        dgL2.a_(19313);
        add_2.b().a(dgL2);
    }

    public static void regenWith(fzs fzs2) {
        bmr_1 bmr_12 = cyt_0.s();
        String string = ((fyb_0)fzs2.d()).getElementMap().c();
        exk_2 exk_22 = (exk_2)fis_1.a().d("itemDetail", string);
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.a_(16568);
        dgL2.b(bzg_1.a.a(bmr_12));
        add_2.b().a(dgL2);
    }

    public static void checkFilter(fzs fzs2, bht_0 bht_02) {
        cgo_0.checkFilter(fzs2, bht_02, azu_0.j().k());
    }

    public static void checkFilter(fzs fzs2, bht_0 bht_02, bmr_1 bmr_12) {
        bmr_12.da().a(bmr_12.a_());
        bmr_12.da().a(bht_02.a());
    }

    public static void onMouseOverFilter(fcb_2 fcb_22) {
        if (((bht_0)fcb_22.j()).a().equals(azu_0.j().k().da().f())) {
            return;
        }
        h = (fsk_0)((ftj_0)fcb_22.d()).getInnerElementMap().a("image");
        ((fid_1)h.getLayoutData()).setYOffset(1);
        h.getContainer().invalidateMinSize();
    }

    public static void onMouseOutFilter(fcb_2 fcb_22) {
        if (h == null) {
            return;
        }
        ((fid_1)h.getLayoutData()).setYOffset(-2);
        h.getContainer().invalidateMinSize();
        h = null;
    }

    public static void useItem(fzs fzs2) {
        String string = ((fyb_0)fzs2.d()).getElementMap().c();
        exk_2 exk_22 = (exk_2)fis_1.a().d("itemDetail", string);
        if (cJz.useUsableItem(exk_22, true)) {
            fis_1.a().a("itemDetail", (Object)null, string);
            fru_0 fru_02 = (fru_0)fzs2.e();
            fru_02.getAppearance().b();
        }
    }

    public static void mimiSymbicUnmake(fzs fzs2) {
        String string = ((fyb_0)fzs2.d()).getElementMap().c();
        exk_2 exk_22 = (exk_2)fis_1.a().d("itemDetail", string);
        if (exk_22.l() != 0) {
            String string2 = bae.h().a("mimiSymbic.unmakeValidation", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 1, string2, 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a(new cGP(exk_22));
        }
    }

    public static void sortInventories(fzs fzs2, bmr_1 bmr_12) {
        bha_0.a(bmr_12);
    }

    public static void toggleRecycleMode(fzs fzs2) {
        add_2.b().a(new dfc(17010));
    }

    public static void dropView(fcx_1 fcx_12) {
        brn brn2 = (brn)fcx_12.k();
        if (brn2.c()) {
            return;
        }
        int n = fcx_12.v();
        int n2 = fcx_12.w();
        cyt_0.a().a(cxo_0.c(brn2.f()), "equipInventWindow", n, n2);
    }

    public static void dropHeroView(fcx_1 fcx_12, fvk_0 fvk_02) {
        if (!euu_2.a()) {
            return;
        }
        bmr_1 bmr_12 = (bmr_1)fcx_12.k();
        int n = fcx_12.v();
        int n2 = fcx_12.w();
        bmk_1 bmk_12 = bzg_1.a.a(bmr_12);
        cyt_0.a().a(bmk_12, "newInventoryOnlyDialog", "equipInventWindow", n, n2, fvk_02);
    }

    public static void displayList(fck_2 fck_22) {
        add_2.b().a(new dfc(17240));
    }

    public static void closePageList(fck_2 fck_22) {
        add_2.b().a(new dfc(19003));
    }

    public static void modifyPage(fck_2 fck_22) {
        add_2.b().a(new dfc(17773));
    }

    public static void validate(fck_2 fck_22) {
        add_2.b().a(new dfc(19977));
    }

    public static void displayEquipment(fck_2 fck_22) {
        add_2.b().a(new dfc(19741));
    }

    public static void togglePvpInventory(fck_2 fck_22) {
        add_2.b().a(new dfc(18832));
    }

    public static void clearPvpInventory(fzs fzs2) {
        if (azu_0.j().k().bz() != null) {
            aUh.a("error.impossibleDuringFight", new Object[0]);
            return;
        }
        fzn_0 fzn_02 = new fzn_0(102, 0, bae.h().a("inventory.pvp.clear.confirmation", new Object[0]), null, cfn_0.a(0), 24L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((n, string) -> {
            if (n != 8) {
                return;
            }
            add_2.b().a(new dfc(18751));
        });
    }

    public static void clickOnItem(fck_2 fck_22, Object object) {
        cHE.a(fck_22, object);
    }

    public static void showRefItemPopup(fcb_2 fcb_22, fil_1 fil_12, fil_1 fil_13) {
        if (fcb_22.j() instanceof bHR) {
            cfq_0.showItemPopup(fcb_22, fil_12);
        } else if (fcb_22.j() instanceof bjx_2) {
            cfq_0.showItemPopup(fcb_22, fil_13);
        }
    }

    static {
        b = Logger.getLogger(cgo_0.class);
        i = new ArrayList();
    }
}

