/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.wakfu.client.console.command.commonIn.RideMountCommand;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

@fpw_0
public class cJz {
    public static final String PACKAGE = "wakfu.shortcutBar";
    private static final Logger b = Logger.getLogger(cJz.class);
    public static boolean a = true;
    private static final int c = 1500;
    private static final int d = 3;
    private static Hy e = new Hy(1500, TimeUnit.MILLISECONDS);
    private static final int f = 4;
    private static final int g = 6;
    private static byte h = (byte)-1;
    private static int i = -1;

    public static void closeShortcutBarDialog(fzs fzs2) {
        dfc.d((short)16401);
    }

    public static void openCloseAdditionalShortcutBar(fzs fzs2, Byte by) {
        dfc dfc2 = new dfc(19241);
        dfc2.a(by);
        add_2.b().a(dfc2);
    }

    public static void activateBuildSheet(fcb_2 fcb_22) {
        dfc dfc2 = new dfc(18843);
        dfc2.a(fcb_22.j());
        add_2.b().a(dfc2);
    }

    private static void a(short s2, short s3) {
        bvx_2 bvx_22 = azu_0.j().k().bz();
        if (bvx_22 == null) {
            dfc.d(s3);
            return;
        }
        if (!bvx_22.A().p()) {
            return;
        }
        if (bvx_22.A().H().M()) {
            return;
        }
        if (fis_1.a().c("isInFightPlacement")) {
            dfc.d(s2);
            return;
        }
        if (bvx_22.A().H().bp()) {
            dfc.d(s2);
            return;
        }
    }

    public static void setSouthEastDirection(fzs fzs2) {
        cJz.a((short)19266, (short)16377);
    }

    public static void setSouthWestDirection(fzs fzs2) {
        cJz.a((short)19380, (short)19296);
    }

    public static void setNorthWestDirection(fzs fzs2) {
        cJz.a((short)18819, (short)17515);
    }

    public static void setNorthEastDirection(fzs fzs2) {
        cJz.a((short)16836, (short)19011);
    }

    public static void openCloseSpellInventoryDialog(fzs fzs2) {
        dfc.d((short)19573);
    }

    public static void openCloseFightActions(fzs fzs2) {
        dfc.d((short)18537);
    }

    public static void openCloseItemInventoryDialog(fzs fzs2) {
        dfc.d((short)16597);
    }

    public static void openCloseKardsInventoryDialog(fzs fzs2) {
        dfc.d((short)18338);
    }

    public static void openCloseSecondaryShortcutBar(fzs fzs2, Integer n) {
        dfc dfc2 = new dfc();
        dfc2.a_(18782);
        dfc2.b(n);
        add_2.b().a(dfc2);
    }

    public static void displaySpellRange(fcb_2 fcb_22) {
        Object object;
        if (!((bvx_0)ans_0.D().h()).a(bWe.v)) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.ak()) {
            return;
        }
        fib fib2 = (fib)fcb_22.j();
        if (fib2.n() != fie.a) {
            return;
        }
        bpl_0 bpl_02 = bmr_12.c(fib2.a());
        if (bpl_02 == null) {
            object = cZa.a().d();
            if (object == null) {
                return;
            }
            bpl_0 bpl_03 = ((blx_1)object).c(fib2.a());
            if (bpl_03 != null) {
                bpl_02 = bpl_03;
            } else {
                return;
            }
        }
        object = new dhc_0();
        ((dhc_0)object).a(bpl_02);
        ((dhc_0)object).b(true);
        ((anw_1)object).a_(16054);
        add_2.b().a((adt_1)object);
    }

    public static void undisplaySpellRange(fcb_2 fcb_22) {
        if (!((bvx_0)ans_0.D().h()).a(bWe.v)) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.ak()) {
            return;
        }
        dhc_0 dhc_02 = new dhc_0();
        dhc_02.b(false);
        dhc_02.a_(16054);
        add_2.b().a(dhc_02);
    }

    public static void dropItem(fzs fzs2, Byte by) {
        if (fzs2 instanceof fcv_2) {
            Object object;
            cgo_0.onDropItem();
            fcv_2 fcv_22 = (fcv_2)fzs2;
            int n = ((fyb_0)fcv_22.e()).getRenderableParent().getCollection().getTableIndex(((fyb_0)fcv_22.e()).getRenderableParent());
            bmr_1 bmr_12 = azu_0.j().k();
            bOw bOw2 = bmr_12.cg();
            fid fid2 = bOw2.f(by).a();
            if (fcv_22.n() instanceof exk_2) {
                boolean bl;
                exk_2 exk_22 = (exk_2)fcv_22.n();
                cgo_0.onDropItem();
                boolean bl2 = fid2 == fid.a;
                boolean bl3 = bl = fid2 == fid.b && exk_22.V();
                if (!bl2 && !bl) {
                    return;
                }
                dhy dhy2 = new dhy();
                dhy2.b(exk_22);
                dhy2.c(by.byteValue());
                dhy2.d(n);
                dhy2.a_(19194);
                dhy2.a(true);
                add_2.b().a(dhy2);
                return;
            }
            if (fcv_22.n() instanceof bpl_0) {
                return;
            }
            if (fcv_22.n() instanceof boq_0 && ((fib)(object = (boq_0)fcv_22.n())).n() == fie.a) {
                dfc dfc2 = new dfc(18154);
                dfc2.b(((fib)object).aT_());
                int n2 = by - 4;
                int n3 = n2 * 6;
                dfc2.a((byte)(n3 + n));
                add_2.b().a(dfc2);
                return;
            }
            if (fcv_22.n() != null) {
                object = new dhy();
                ((dhy)object).b(fcv_22.n());
                ((dhy)object).c(by.byteValue());
                ((dhy)object).d(n);
                ((dhy)object).b(h);
                ((dhy)object).e(i);
                ((anw_1)object).a_(19194);
                ((anw_1)object).a(true);
                add_2.b().a((adt_1)object);
            }
        }
        h = (byte)-1;
        i = -1;
    }

    public static void dragItem(fzs fzs2, Byte by) {
        if (fzs2 instanceof fcp_1) {
            fcp_1 fcp_12 = (fcp_1)fzs2;
            int n = ((fyb_0)fcp_12.e()).getRenderableParent().getCollection().getItemIndex(fcp_12.l());
            if (fcp_12.l() != null) {
                dhy dhy2 = new dhy();
                dhy2.b(fcp_12.l());
                dhy2.c(by.byteValue());
                h = by;
                i = n;
                dhy2.d(n);
                dhy2.a_(18564);
                add_2.b().a(dhy2);
            }
        }
    }

    public static void dropOutItem(fzs fzs2, Byte by) {
        fcx_1 fcx_12;
        if (fzs2 instanceof fcx_1 && (fcx_12 = (fcx_1)fzs2).l() != null) {
            Object object;
            int n = 19562;
            if (fcx_12.l() instanceof boq_0 && ((fib)(object = (boq_0)fcx_12.l())).n() == fie.a) {
                n = 19194;
            }
            object = new dhy();
            ((dhy)object).b(fcx_12.l());
            ((dhy)object).c(by.byteValue());
            ((dhy)object).d(i);
            ((anw_1)object).a_(n);
            add_2.b().a((adt_1)object);
        }
        h = (byte)-1;
        i = -1;
    }

    public static void addItem(fcb_2 fcb_22, Integer n) {
        dhy dhy2 = new dhy();
        dhy2.b(fcb_22.j());
        dhy2.c(n);
        dhy2.d(-1);
        dhy2.a_(19194);
        dhy2.a(true);
        add_2.b().a(dhy2);
    }

    public static void selectPreviousShortcutBar(fck_2 fck_22) {
        if (fck_22.x() == 1) {
            dfc.d((short)17752);
        }
    }

    public static void selectNextShortcutBar(fck_2 fck_22) {
        if (fck_22.x() == 1) {
            dfc.d((short)16577);
        }
    }

    public static void useItem(fcb_2 fcb_22) {
        if (fcb_22.j() != null && fcb_22.j() instanceof boq_0) {
            boq_0 boq_02 = (boq_0)fcb_22.j();
            cJz.useItem(fcb_22, boq_02, false);
        }
    }

    public static void doubleClickItem(fcb_2 fcb_22) {
        if (fcb_22.j() != null && fcb_22.j() instanceof boq_0) {
            boq_0 boq_02 = (boq_0)fcb_22.j();
            cJz.useItem(fcb_22, boq_02, true);
        }
    }

    public static void selectSpell(fcb_2 fcb_22, bpl_0 bpl_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        blx_1 blx_12 = bmr_12;
        if (fcb_22 != null && fcb_22.x() == 3) {
            if (bpl_02 == null) {
                b.error((Object)"On tente d'utiliser un sort null dans les barres raccourcis !!! ");
                return;
            }
            fyy_0 fyy_02 = ((fyb_0)fcb_22.d()).getElementMap();
            if (fyy_02 != null) {
                cGj.openSpellDescription(3, bpl_02, fyy_02.c());
            }
        } else if (bmr_12.ak() && bmr_12.bz() != null) {
            bph_0 bph_02;
            if (bpl_02 == null) {
                b.error((Object)"On tente d'utiliser un sort null dans les barres raccourcis !!! ");
                return;
            }
            blx_12 = bmr_12.bz().A().H();
            if (blx_12 == null) {
                blx_12 = bmr_12;
            }
            if ((bph_02 = (bph_0)bpl_02.r()) == null) {
                b.error((Object)("spell null pour le spellLevel (uniqueId=" + bpl_02.a() + ")"));
                return;
            }
            if (bph_02.y()) {
                dgn_0 dgn_02 = new dgn_0();
                dgn_02.a(blx_12.c(bpl_02.a()));
                exk_2 exk_22 = blx_12.cG().a(blx_12.dC(), exh_2.p);
                dgn_02.b(exh_2.p.a());
                dgn_02.a(exk_22);
                dgn_02.a_(19549);
                add_2.b().a(dgn_02);
            } else {
                dhb_0 dhb_02 = new dhb_0();
                dhb_02.a(blx_12.c(bpl_02.a()));
                dhb_02.a_(16245);
                if (bph_02.i() == 7348) {
                    if (!fpm_0.b().q("osamodasSymbiotDialog")) {
                        azu_0.j().a(dbJ.a());
                    } else {
                        add_2.b().a(dhb_02);
                    }
                } else {
                    add_2.b().a(dhb_02);
                }
            }
        }
    }

    public static void useLeftHandWeapon(fcb_2 fcb_22) {
        boq_0 boq_02 = (boq_0)fcb_22.j();
        if (boq_02 == null || !boq_02.m()) {
            return;
        }
        dfc.d((short)18517);
        cdw_0.n().c(600004L);
    }

    public static void useRightHandWeapon(fcb_2 fcb_22) {
        boq_0 boq_02 = (boq_0)fcb_22.j();
        if (boq_02 == null || !boq_02.m()) {
            return;
        }
        dfc.d((short)16126);
        cdw_0.n().c(600004L);
    }

    public static void useItem(fcb_2 fcb_22, boq_0 boq_02, boolean bl) {
        if (boq_02 != null && boq_02.m()) {
            if (e.c() > 3) {
                return;
            }
            e.a();
            bmr_1 bmr_12 = azu_0.j().k();
            switch (boq_02.n()) {
                case f: {
                    dfc dfc2 = new dfc(18843);
                    dfc2.a(boq_02);
                    add_2.b().a(dfc2);
                    break;
                }
                case e: {
                    if (bl) {
                        return;
                    }
                    bhx bhx2 = bhA.a.a(boq_02.aT_());
                    if (bhx2.o()) {
                        ((bhu)bhx2).j();
                        break;
                    }
                    dfx dfx2 = new dfx();
                    dfx2.a(bhx2);
                    add_2.b().a(dfx2);
                    break;
                }
                case a: {
                    if (bl) {
                        return;
                    }
                    bvx_2 bvx_22 = bmr_12.bz();
                    blx_1 blx_12 = bmr_12;
                    if (!(bvx_22 == null || (blx_12 = bvx_22.A().H()) != null && blx_12.bp())) {
                        blx_12 = bmr_12;
                    }
                    bpl_0 bpl_02 = blx_12.c(boq_02.a());
                    cJz.selectSpell(fcb_22, bpl_02);
                    break;
                }
                case d: {
                    if (bl) {
                        return;
                    }
                    dgm_0 dgm_02 = new dgm_0();
                    bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(2145);
                    exk_2 exk_22 = new exk_2(-1L);
                    exk_22.b(bjw_12);
                    exk_22.a((short)1);
                    dgm_02.a(exk_22, bjw_12.F().h()[0].A);
                    dgm_02.a_(18450);
                    add_2.b().a(dgm_02);
                    break;
                }
                case b: {
                    exk_2 exk_23 = (exk_2)bmr_12.da().d(boq_02.aT_());
                    if (fcb_22 == null || fcb_22.x() == 1) {
                        if (exk_23 == null) {
                            return;
                        }
                        cJz.useUsableItem(exk_23, bl);
                        break;
                    }
                    if (fcb_22.x() != 3) break;
                    dgK dgK2 = new dgK();
                    dgK2.a_(16130);
                    dgK2.c(fcb_22.v());
                    dgK2.d(fcb_22.w() + 20);
                    dgK2.a(exk_23);
                    add_2.b().a(dgK2);
                    break;
                }
                case c: {
                    Object object;
                    exk_2 exk_24;
                    if (bl) {
                        return;
                    }
                    switch (boq_02.k()) {
                        case 2: 
                        case 4: 
                        case 5: {
                            exk_24 = (exk_2)bmr_12.da().d(boq_02.aT_());
                            if (fcb_22 != null && fcb_22.x() != 1) break;
                            if (exk_24 == null) {
                                exk_24 = bmr_12.dC().b(boq_02.aT_());
                            }
                            if (exk_24 == null || !exk_24.aU_()) break;
                            cJz.a(boq_02, exk_24, bmr_12, bl);
                            break;
                        }
                        case 3: {
                            exk_24 = bmr_12.cG().a(bmr_12.dC(), boq_02.aT_());
                            if (exk_24 == null || !exk_24.aQ_() || !exk_24.f().a().k()) break;
                            object = (bmr_1)euu_2.f(bmr_12.U_(), exk_24.a());
                            if (((epq_2)object).a_() != bmr_12.a_()) {
                                return;
                            }
                            RideMountCommand.a(bmr_12);
                            break;
                        }
                    }
                    if (fcb_22 == null || fcb_22.x() != 3) break;
                    exk_24 = (exk_2)bmr_12.da().d(boq_02.aT_());
                    if (exk_24.aQ_()) {
                        object = new dgO<bMi>(new bMi(exk_24));
                        ((anw_1)object).a_(18168);
                    } else {
                        object = new dgK();
                        ((dgE)object).a(exk_24);
                        ((anw_1)object).a_(16130);
                    }
                    ((dgE)object).c(fcb_22.v());
                    ((dgE)object).d(fcb_22.w() + 20);
                    add_2.b().a((adt_1)object);
                }
            }
        }
    }

    private static bja_1 a(bmr_1 bmr_12, exk_2 exk_22) {
        bji_1 bji_12;
        exh_2 exh_22;
        if (!azu_0.j().c(cyt_0.a())) {
            bjb_1.a.a();
            bjb_1.a.a(bmr_12);
        }
        if ((exh_22 = cJz.a(exk_22, bji_12 = bjb_1.a.h())) == null) {
            return null;
        }
        return bji_12.a(exh_22);
    }

    @Nullable
    private static exh_2 a(exk_2 exk_22, bji_1 bji_12) {
        exh_2[] exh_2Array;
        exh_2 exh_22 = null;
        exh_2 exh_23 = null;
        for (exh_2 exh_24 : exh_2Array = exk_22.U().h()) {
            if (exh_24 == exh_2.x) continue;
            exh_22 = exh_24;
            bja_1 bja_12 = bji_12.a(exh_24);
            if (bja_12.h() != null && bja_12.h().a() != exk_22.a()) continue;
            exh_23 = exh_24;
        }
        if (exh_23 == null && exh_22 == null) {
            return null;
        }
        if (exh_23 == null) {
            exh_23 = exh_22;
        }
        return exh_23;
    }

    private static boolean a(exk_2 exk_22, exz_1 exz_12) {
        return exk_22.T().a(exz_12) != null;
    }

    private static boolean a(exk_2 exk_22, bmr_1 bmr_12, exz_1 exz_12) {
        apc_2 apc_22 = exk_22.T().a(exz_12);
        return apc_22 == null || apc_22.b(bmr_12, bmr_12.P_(), exk_22, bmr_12.ge());
    }

    private static void a(boq_0 boq_02, exk_2 exk_22, bmr_1 bmr_12, boolean bl) {
        eyw_1 eyw_12 = exk_22.T().p();
        if (!(eyw_12 == null || bmr_12.ak() && bmr_12.bz().e() != elp_0.b)) {
            if (cJz.a(exk_22, bmr_12, exz_1.a)) {
                bua_0.a.a(new buk_2(exk_22.T()));
                ((big_1)eyw_12).a(exk_22);
            }
            return;
        }
        if (bmr_12.ak()) {
            if (exk_22.V() && !cJz.a(exk_22, exz_1.b) || cJz.a(exk_22, bmr_12, exz_1.b)) {
                dgm_0 dgm_02 = new dgm_0();
                if (boq_02.k() == 2) {
                    try {
                        dgm_02.a(exk_22, exk_22.T().F().h()[0].a());
                    }
                    catch (Exception exception) {
                        dgm_02.a(exk_22, (byte)-1);
                    }
                } else {
                    dgm_02.a(exk_22, (byte)-1);
                }
                dgm_02.a_(18450);
                add_2.b().a(dgm_02);
            }
            return;
        }
        if (exk_22.W() && !cJz.a(exk_22, exz_1.a) || cJz.a(exk_22, bmr_12, exz_1.a)) {
            dhs dhs2 = new dhs(exk_22, (byte)boq_02.aT_(), bl);
            dhs2.a_(17597);
            add_2.b().a(dhs2);
            return;
        }
    }

    private static void a(exk_2 exk_22, bmr_1 bmr_12, boolean bl) {
        if (bmr_12.ak()) {
            if (bmr_12.cG().a(exk_22.a()) != null) {
                dgm_0 dgm_02 = new dgm_0();
                try {
                    exh_2[] exh_2Array = exk_22.T().F().h();
                    dgm_02.a(exk_22, exh_2Array.length > 0 ? exh_2Array[0].A : (byte)-1);
                }
                catch (Exception exception) {
                    dgm_02.a(exk_22, (byte)-1);
                }
                dgm_02.a_(18450);
                add_2.b().a(dgm_02);
            } else {
                dhs dhs2 = new dhs(exk_22, (byte)exk_22.aT_(), bl);
                dhs2.a_(17597);
                add_2.b().a(dhs2);
            }
            return;
        }
        dhs dhs3 = new dhs(exk_22, (byte)exk_22.aT_(), bl);
        dhs3.a_(17597);
        add_2.b().a(dhs3);
    }

    public static boolean useUsableItem(exk_2 exk_22, boolean bl) {
        bmr_1 bmr_12 = cyt_0.s();
        bmr_1 bmr_13 = bzf_1.a();
        if (bmr_13 != null && bmr_13.ab_()) {
            bQG.a();
            bQG.a(6, new Object[0]);
            return false;
        }
        if (exk_22 == null) {
            b.error((Object)"Trying to use a null item");
            return false;
        }
        if (exk_22.aU_() && bhv_1.k(exk_22)) {
            cJz.a(exk_22, bmr_12, bl);
            return true;
        }
        if (!exk_22.W()) {
            return false;
        }
        if (fgh.a.d(exk_22.aT_())) {
            bQG.a();
            bQG.a(64, new Object[0]);
            return false;
        }
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 != null && bpc_22.ac_() == 14) {
            cJz.a(exk_22, bmr_12, bl);
            return true;
        }
        bQG.a();
        bQG.a(61, new Object[0]);
        return false;
    }

    public static void openCloseShortcutDescription(fcb_2 fcb_22) {
        cJz.openCloseShortcutDescription(fcb_22, (Byte)null);
    }

    public static void openCloseShortcutDescription(fcb_2 fcb_22, String string) {
        cJz.openCloseShortcutDescription(fcb_22, Byte.parseByte(string));
    }

    public static void openCloseShortcutDescription(fcb_2 fcb_22, Byte by) {
        Object object;
        abo_1 abo_12;
        Object object2;
        if (fcb_22.j() == null || !(fcb_22.j() instanceof fib)) {
            return;
        }
        fso fso2 = (fso)fcb_22.e();
        bmr_1 bmr_12 = azu_0.j().k();
        Object object3 = bmr_12;
        if (bmr_12.ak() && bmr_12.bz() != null) {
            if (bmr_12.bz().A().p()) {
                boolean bl;
                object2 = bmr_12.bz().A().H();
                boolean bl2 = bl = !((epq_2)object2).gk() && ((blx_1)object2).bp();
                if (((epq_2)object2).a_() == bmr_12.a_() || bl) {
                    object3 = object2;
                }
            }
            if (object3 == null) {
                object3 = bmr_12;
            }
        }
        if (((fib)(object2 = (fib)fcb_22.j())).n() == fie.a) {
            bpl_0 bpl_02 = ((blx_1)object3).c(((fib)object2).a());
            fis_1.a().a("currentShortcutShortcut", (Object)cJz.a(cJz.a((fib)object2, by)));
            cJF.openCloseDescription(fcb_22, bpl_02, "spellDetailPopup");
        }
        if (((fib)object2).n() == fie.d) {
            fil_1 fil_12 = (fil_1)fso2.getElementMap().a("itemDetailPopup");
            if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
                if (((fib)object2).aT_() == 2145) {
                    abo_12 = new exk_2(-1L);
                    object = eyo_1.g().d(2145);
                    ((exk_2)abo_12).b((ezr_0)object);
                    ((exk_2)abo_12).a((short)1);
                } else {
                    object = bmr_12.dC().b(((fib)object2).a());
                    abo_12 = ((Optional)object).orElseGet(() -> cJz.a(bmr_12, (fib)object2));
                }
                fis_1.a().a("handsOfWeapon", (Object)"twoHands");
                fis_1.a().a("itemPopupDetail", abo_12);
                fis_1.a().a("isFromEquipedShortcut", true);
                fis_1.a().a("currentShortcutShortcut", (Object)cJz.a(cJz.a((fib)object2, by)));
                fpu_0.popup(fil_12, fso2);
            } else if (fcb_22.f() == frd_0.l) {
                fis_1.a().a("itemPopupDetail", (Object)null);
                fis_1.a().a("isFromEquipedShortcut", false);
                fis_1.a().a("isFromShortcut", false);
                fis_1.a().a("handsOfWeapon", (Object)"none");
                fis_1.a().a("currentShortcutShortcut", (Object)null);
                fpu_0.closePopup(fcb_22, fil_12);
            }
        }
        if (((fib)object2).n() == fie.e) {
            bhx bhx2 = bhA.a.a(((fib)object2).aT_());
            fis_1.a().a("currentDescribedEmote", bhx2);
            abo_12 = (fil_1)fso2.getElementMap().a("emotePopup");
            if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
                fis_1.a().a("currentShortcutShortcut", (Object)cJz.a(cJz.a((fib)object2, by)));
                fpu_0.popup((fil_1)abo_12, fso2);
            } else if (fcb_22.f() == frd_0.l) {
                fis_1.a().a("currentShortcutShortcut", (Object)null);
                fpu_0.closePopup(fcb_22, (fil_1)abo_12);
            }
        }
        if (((fib)object2).n() == fie.f) {
            ezj_1 ezj_12 = azu_0.j().k().dx().a(((fib)object2).aT_());
            if (ezj_12 == null) {
                return;
            }
            fis_1.a().a("currentDescribedBuild", (Object)ezj_12.b());
            abo_12 = (fil_1)fso2.getElementMap().a("buildPopup");
            if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
                fis_1.a().a("currentShortcutShortcut", (Object)cJz.a(cJz.a((fib)object2, by)));
                fpu_0.popup((fil_1)abo_12, fso2);
            } else if (fcb_22.f() == frd_0.l) {
                fis_1.a().a("currentShortcutShortcut", (Object)null);
                fpu_0.closePopup(fcb_22, (fil_1)abo_12);
            }
        }
        if (((fib)object2).n() == fie.c) {
            exk_2 exk_22 = bmr_12.cG().a(bmr_12.dC(), ((fib)object2).aT_());
            if (exk_22 != null) {
                short s2 = bmr_12.cG().a(exk_22.a()).a();
                if (s2 == 15 || s2 == 16) {
                    object = (fil_1)fso2.getElementMap().a("itemDetailPopup");
                    if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
                        if (s2 == 15) {
                            if (exk_22.T().B()) {
                                fis_1.a().a("handsOfWeapon", (Object)"twoHands");
                            } else {
                                fis_1.a().a("handsOfWeapon", (Object)"rightHand");
                            }
                            aZF aZF2 = (aZF)aZH.a().b("closeCombatRight");
                            fis_1.a().a("currentShortcutShortcut", (Object)cJz.a(aZF2 != null ? aZF2.a() : bae.h().a("shortcut.unknown", new Object[0])));
                        } else if (s2 == 16) {
                            fis_1.a().a("handsOfWeapon", (Object)"leftHand");
                            aZF aZF3 = (aZF)aZH.a().b("closeCombatLeft");
                            fis_1.a().a("currentShortcutShortcut", (Object)cJz.a(aZF3 != null ? aZF3.a() : bae.h().a("shortcut.unknown", new Object[0])));
                        }
                        fis_1.a().a("itemPopupDetail", exk_22);
                        fis_1.a().a("isFromEquipedShortcut", true);
                        fpu_0.popup((fil_1)object, fso2);
                    } else if (fcb_22.f() == frd_0.l) {
                        fis_1.a().a("itemPopupDetail", (Object)null);
                        fis_1.a().a("isFromEquipedShortcut", false);
                        fis_1.a().a("isFromShortcut", false);
                        fis_1.a().a("handsOfWeapon", (Object)"none");
                        fis_1.a().a("currentShortcutShortcut", (Object)null);
                        fpu_0.closePopup(fcb_22, (fil_1)object);
                    }
                } else {
                    fis_1.a().a("isFromShortcut", false);
                    if (exk_22.X()) {
                        fis_1.a().a("isFromEquipedShortcut", true);
                    } else {
                        fis_1.a().a("isFromEquipedShortcut", false);
                    }
                    object = (fil_1)fso2.getElementMap().a("itemDetailPopup");
                    if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
                        fis_1.a().a("itemPopupDetail", exk_22);
                        fis_1.a().a("currentShortcutShortcut", (Object)cJz.a(cJz.a((fib)object2, by)));
                        fpu_0.popup((fil_1)object, fso2);
                    } else if (fcb_22.f() == frd_0.l) {
                        fis_1.a().a("itemPopupDetail", (Object)null);
                        fis_1.a().a("currentShortcutShortcut", (Object)null);
                        fpu_0.closePopup(fcb_22, (fil_1)object);
                    }
                }
            } else {
                exk_22 = (exk_2)azu_0.j().k().da().d(((fib)object2).aT_());
                if (exk_22 != null) {
                    abo_12 = (fil_1)fso2.getElementMap().a("itemDetailPopup");
                    if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
                        fis_1.a().a("itemPopupDetail", exk_22);
                        fis_1.a().a("isFromShortcut", true);
                        fis_1.a().a("currentShortcutShortcut", (Object)cJz.a(cJz.a((fib)object2, by)));
                        fpu_0.popup((fil_1)abo_12, fso2);
                    } else if (fcb_22.f() == frd_0.l) {
                        fis_1.a().a("itemPopupDetail", (Object)null);
                        fis_1.a().a("isFromShortcut", false);
                        fis_1.a().a("isFromEquipedShortcut", false);
                        fis_1.a().a("currentShortcutShortcut", (Object)null);
                        fpu_0.closePopup(fcb_22, (fil_1)abo_12);
                    }
                }
            }
        } else if (fie.b == ((fib)object2).n()) {
            bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(((fib)object2).aT_());
            if (bjw_12 == null) {
                return;
            }
            abo_12 = (fil_1)fso2.getElementMap().a("itemDetailPopup");
            if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
                fis_1.a().a("itemPopupDetail", bjw_12);
                fis_1.a().a("isFromShortcut", true);
                fis_1.a().a("currentShortcutShortcut", (Object)cJz.a(cJz.a((fib)object2, by)));
                fpu_0.popup((fil_1)abo_12, fso2);
            } else if (fcb_22.f() == frd_0.l) {
                fis_1.a().a("itemPopupDetail", (Object)null);
                fis_1.a().a("isFromShortcut", false);
                fis_1.a().a("isFromEquipedShortcut", false);
                fis_1.a().a("currentShortcutShortcut", (Object)null);
                fpu_0.closePopup(fcb_22, (fil_1)abo_12);
            }
        }
    }

    private static String a(String string) {
        return bae.h().a("shortcuts", new Object[0]) + " (" + aZF.a(string) + ")";
    }

    private static String a(fib fib2, Byte by) {
        bOv bOv2;
        int n;
        if (by == null) {
            return bae.h().a("shortcut.unknown", new Object[0]);
        }
        bOw bOw2 = azu_0.j().m();
        if (fib2.n() == fie.a || fib2.n() == fie.d) {
            n = by - 4;
            bOv2 = bOw2.d((byte)n);
        } else {
            n = by.byteValue();
            bOv2 = bOw2.c((byte)n);
        }
        short s2 = bOv2.a((boq_0)fib2);
        aZF aZF2 = (aZF)aZH.a().b("shortcut" + n + s2);
        return aZF2 != null ? aZF2.a() : bae.h().a("shortcut.unknown", new Object[0]);
    }

    public static void toggleShortcutBarMode(fzs fzs2) {
        add_2.b().a(new dfc(19973));
    }

    public static void openEmotesInventory(fcp_2 fcp_22) {
        boolean bl = fcp_22.j();
        if (!bl && azu_0.j().c(cYo.a())) {
            azu_0.j().b(cYo.a());
        } else if (bl && !azu_0.j().c(cYo.a())) {
            azu_0.j().a(cYo.a());
        }
        cxu_0.a().b(bl);
    }

    public static void displaySpellDescription(fzs fzs2, bpl_0 bpl_02) {
    }

    private static /* synthetic */ exk_2 a(bmr_1 bmr_12, fib fib2) {
        return bmr_12.da().i(fib2.a());
    }
}

