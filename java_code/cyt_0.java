/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from cYt
 */
public class cyt_0
extends cxo_0
implements ahr_1,
fjd_2 {
    private static final cyt_0 l = new cyt_0();
    public static final int a = 330;
    public static final int i = 616;
    public static final int j = 280;
    private static final int m = 3;
    static final Set<exw_1> n = Collections.unmodifiableSet(EnumSet.of(exw_1.f, exw_1.h, exw_1.e, exw_1.g, exw_1.d));
    private static final int o = 650;
    private static final int p = 380;
    private static final int q = 50;
    private fzk_0 r;
    protected static final Logger k = Logger.getLogger(cyt_0.class);
    private final ans_1 s = new cyu_0(this);
    private long t;
    private final List<String> u = new ArrayList<String>();
    private fbx_1 v;
    private final cus_0 w = new cus_0();
    private fdc_2 x;
    private boolean y;
    private Runnable z;
    private fso A;
    private boolean B = false;
    private boolean C = false;
    private boolean D;

    public static cyt_0 a() {
        return l;
    }

    public void a(Runnable runnable) {
        this.z = runnable;
    }

    public void a(boolean bl) {
        this.y = bl;
    }

    private boolean u() {
        return this.y;
    }

    public void c() {
        this.y = false;
        this.z.run();
    }

    @Override
    public void a(String string) {
        if (string != null && !string.equals("inventoryDialog")) {
            fpm_0.b().o("inventoryDialog");
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public String f() {
        return "inventoryDialog";
    }

    public static void b(boolean bl) {
        fis_1.a().a("equipment.inventory.enableMove", bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16198: {
                ajf_1 ajf_12;
                dfc dfc2 = (dfc)adt_12;
                if (this.t == dfc2.d()) {
                    return false;
                }
                long l = azu_0.j().n().u();
                long l2 = euv_2.a.b(l);
                if (bvz_2.a.b() != null) {
                    this.t = l2 > 0L ? l2 : 0L;
                    ajf_12 = bzg_1.a.a((bnh_1)euw_2.a.d(l2));
                    fis_1.a().a("characterSheet", (Object)ajf_12, "inventoryDialog");
                } else {
                    this.t = dfc2.d();
                }
                ajf_12 = (bmr_1)euw_2.a.d(this.t);
                if (ajf_12 == null) {
                    k.error((Object)("On essaye d'afficher l'inventaire d'un personnage qu'on ne connait pas : characterId = " + this.t));
                    return false;
                }
                this.a((bmr_1)ajf_12);
                return false;
            }
            case 16908: {
                apc_2 apc_22;
                dgL dgL2 = (dgL)adt_12;
                bmr_1 bmr_12 = (bmr_1)euu_2.b(azu_0.j().k().U_(), dgL2.s());
                bmr_1 bmr_13 = (bmr_1)euw_2.a.d(dgL2.y().l().a_());
                if (bmr_12 == null || bmr_13 == null) {
                    return false;
                }
                if (flC.a(bmr_12.hB())) {
                    return false;
                }
                if (flC.a(bmr_13.hB())) {
                    return false;
                }
                bHi bHi2 = bmr_13.da();
                exg_2 exg_22 = bmr_12.da().d(dgL2.s());
                exk_2 exk_22 = dgL2.o();
                byte by = bHi2.a(exd_1.a.b(exk_22.aT_()));
                if (by == -1) {
                    aUh.a("error.bagContainerFull", new Object[0]);
                    return false;
                }
                if (!exg_2.a(exk_22, bmr_12)) {
                    aUh.a("item.error.impossibilityToEquip", new Object[0]);
                    return false;
                }
                if (bmr_12.a_() != bmr_13.a_() && (apc_22 = exk_22.T().a(exz_1.e)) != null && !apc_22.b(bmr_12, euu_2.d(bmr_12.U_()), exk_22, bmr_12.ge())) {
                    aUh.a("item.error.badBind", new Object[0]);
                    return false;
                }
                if (exg_22 != null) {
                    byte by2 = dgL2.r() == -1 ? by : (byte)dgL2.r();
                    cnL cnL2 = new cnL();
                    cnL2.b(exk_22.a());
                    cnL2.f(exg_22.f());
                    cnL2.a(bmr_13.a_());
                    cnL2.a(by2);
                    azu_0.j().K().c(cnL2);
                } else {
                    k.warn((Object)("On ne trouve pas la source de l'item que le joueur veut ajouter. Id de la source transmis : " + dgL2.s()));
                }
                return false;
            }
            case 18094: {
                Object object;
                Cm<exg_2, Short> cm;
                short s2;
                long l;
                dgL dgL3 = (dgL)adt_12;
                long l3 = dgL3.s();
                bmr_1 bmr_14 = (bmr_1)euu_2.b(azu_0.j().k().U_(), l3);
                if (bmr_14 == null) {
                    return false;
                }
                if (flC.a(bmr_14.hB())) {
                    return false;
                }
                bHi bHi3 = bmr_14.da();
                exg_2 exg_23 = bHi3.d(l3);
                if (!exg_23.n()) {
                    aUh.a("error.bagNotEmpty", new Object[0]);
                    return false;
                }
                Object r2 = eyo_1.g().d(exg_23.d());
                exk_2 exk_23 = exk_2.a(exg_23.f(), r2);
                if (exk_23 == null) {
                    return false;
                }
                exk_23.a((short)1);
                if (dgL3.t() != -1L) {
                    l = dgL3.t();
                    s2 = dgL3.r();
                } else {
                    cm = bHi3.a(exk_23, l3);
                    if (cm == null) {
                        return false;
                    }
                    l = cm.a().f();
                    s2 = cm.b();
                }
                if (l == exg_23.f()) {
                    aUh.a("error.sameBag", new Object[0]);
                    return false;
                }
                cm = euu_2.l(bmr_14.U_(), l);
                bmr_1 bmr_15 = (bmr_1)euu_2.b(bmr_14.U_(), l);
                if (cm == null) {
                    return false;
                }
                if (bmr_14.a_() != bmr_15.a_() && (object = ((ezr_0)r2).a(exz_1.e)) != null && !((apc_2)object).b(bmr_14, euu_2.d(bmr_14.U_()), r2, bmr_14.ge())) {
                    aUh.a("item.error.badBind", new Object[0]);
                    return false;
                }
                try {
                    if (!((exg_2)((Object)cm)).a(exk_23)) {
                        boolean bl = false;
                        return bl;
                    }
                }
                catch (Exception exception) {
                    boolean bl = false;
                    return bl;
                }
                finally {
                    exk_23.release();
                }
                object = new cnW();
                ((cnO)object).b(l);
                ((cnO)object).e(exg_23.f());
                ((cnO)object).f(l3);
                ((cnO)object).c(l);
                ((cnW)object).a((byte)s2);
                azu_0.j().K().c(object);
                cyt_0.c(exg_23.f());
                return false;
            }
            case 19986: {
                bmr_1 bmr_16 = azu_0.j().k();
                if (bmr_16 == null) {
                    return false;
                }
                if (flC.a(bmr_16.hB())) {
                    return false;
                }
                dfc dfc3 = (dfc)adt_12;
                cnM cnM2 = new cnM();
                cnM2.a(dfc3.b());
                cnM2.a(dfc3.d());
                azu_0.j().K().c(cnM2);
                return false;
            }
            case 16099: {
                dgL dgL4 = (dgL)adt_12;
                cnZ cnZ2 = new cnZ();
                bmr_1 bmr_17 = azu_0.j().k();
                if (bmr_17 == null) {
                    return false;
                }
                if (flC.a(bmr_17.hB())) {
                    return false;
                }
                long l = dgL4.y().f();
                exg_2 exg_24 = ((epq_2)euw_2.a.d(l)).dS().a((byte)dgL4.r());
                cnZ2.b(dgL4.o().a());
                cnZ2.a((byte)dgL4.r());
                cnZ2.a(exg_24.f());
                azu_0.j().K().c(cnZ2);
                return false;
            }
            case 16317: {
                dfc dfc4 = (dfc)adt_12;
                if (fpm_0.b().q("splitStackDialog")) {
                    fpm_0.b().o("splitStackDialog");
                }
                azu_0.j().k().da().c();
                fpm_0.b().o(dfc4.h());
                return false;
            }
            case 19309: {
                bjz_1 bjz_12 = bjb_1.a.l();
                cyt_0.z();
                bjz_12.a(false);
                fis_1.a().a((ajf_1)bjz_12, bjz_1.a);
                return false;
            }
            case 19741: {
                boolean bl;
                this.D = bl = bjb_1.a.s();
                if (bl) {
                    bjb_1.a.n();
                    fis_1.a().a("equipment.closeButton.xOffset", (Object)280, "inventoryDialog");
                } else {
                    fis_1.a().a("equipment.closeButton.xOffset", (Object)616, "inventoryDialog");
                }
                bjb_1.a.c(!bl);
                fis_1.a().a((ajf_1)bjb_1.a, bjb_1.a.d());
                return false;
            }
            case 17575: {
                fis_1.a().a("selectedItemInventoryDescription", (Object)null);
                dgL dgL5 = (dgL)adt_12;
                fis_1.a().a("selectedItemInventoryDescription", dgL5.o());
                return false;
            }
            case 19299: {
                dgI dgI2 = (dgI)adt_12;
                bjb_1.a.a(dgI2.k(), dgI2.o(), dgI2.p());
                return false;
            }
            case 16269: {
                dfc dfc5 = (dfc)adt_12;
                cyt_0.s().da().a(dfc5.h());
                fis_1.a().a((ajf_1)cyt_0.s().da(), "currentInventoryView");
                return false;
            }
            case 17010: {
                if (this.w()) {
                    this.d();
                } else {
                    this.v();
                }
                return false;
            }
            case 18832: {
                boolean bl = this.B = !this.B;
                if (fpm_0.b().q("pvpInventoryDialog")) {
                    fpm_0.b().o("pvpInventoryDialog");
                } else {
                    fpm_0.b().a("pvpInventoryDialog", cfi_0.a("pvpInventoryDialog"), 32769L, (short)10000);
                    fis_1.a().a("pvpInventoryView", (Object)bju_1.d, "pvpInventoryDialog");
                }
                return false;
            }
            case 16173: {
                dgL dgL6 = (dgL)adt_12;
                this.a(dgL6);
                return false;
            }
            case 18751: {
                if (this.C) {
                    return false;
                }
                bmr_1 bmr_18 = azu_0.j().k();
                if (bmr_18 == null) {
                    return false;
                }
                if (flC.b(bmr_18.hB())) {
                    return false;
                }
                this.C = true;
                azu_0.j().K().c(new cos_0());
                return false;
            }
        }
        return super.a(adt_12);
    }

    private void a(dgL dgL2) {
        if (this.C) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        if (flC.a(bmr_12.hB())) {
            return;
        }
        if (!(dgL2.o() instanceof bjt_1)) {
            return;
        }
        bjt_1 bjt_12 = (bjt_1)dgL2.o();
        if (!bju_1.d.a(bjt_12.aT_(), bjt_12.e())) {
            return;
        }
        this.C = true;
        long l = Optional.ofNullable(euu_2.b(bmr_12.U_(), dgL2.t())).map(object -> ((epq_2)object).a_()).orElse(-1L);
        cou_0 cou_02 = new cou_0(bjt_12.aT_(), dgL2.u(), l);
        cou_02.a(dgL2.t());
        cou_02.a(dgL2.r());
        azu_0.j().K().c(cou_02);
    }

    public void c(boolean bl) {
        this.C = bl;
    }

    private void v() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null || bmr_12.ak()) {
            return;
        }
        if (flC.b(bmr_12.hB())) {
            return;
        }
        fyt_0.a().a(frb_0.q, true);
        this.x = new cYv(this);
        dei.a().a(this.x);
        fta_0.getInstance().addEventListener(frd_0.B, this.x, true);
        fis_1.a().a("recycleInventory", (Object)true, "inventoryDialog");
        this.a("recycleInventory", (Object)true);
    }

    static void a(exk_2 exk_22) {
        if (exk_22.aQ_()) {
            dbU.a().d(exk_22);
        }
        clu_0 clu_02 = new clu_0(exk_22.a());
        azu_0.j().K().c(clu_02);
        fis_1.a().a("itemDetail", (Object)null, "inventoryDialog");
        cyt_0.a().a("itemDetail", null);
        fis_1.a().a("pet", null, (Object)"inventoryDialog");
    }

    private boolean w() {
        return this.x != null;
    }

    public void d() {
        fta_0.getInstance().removeEventListener(frd_0.B, this.x, true);
        fyt_0.a().c();
        dei.a().b(this.x);
        fis_1.a().a("recycleInventory", (Object)false, "inventoryDialog");
        this.a("recycleInventory", (Object)false);
        this.x = null;
    }

    private void a(String string, Object object) {
        this.u.forEach(string2 -> fis_1.a().a(string, object, (String)string2));
    }

    static void b(byte by) {
        bjb_1.a.a((int)by);
        bHi bHi2 = bjb_1.a.g().da();
        exk_2 exk_22 = (exk_2)fis_1.a().d("itemDetail", "inventoryDialog");
        fis_1.a().a((ajf_1)bHi2, "currentInventoryView");
        fis_1.a().a((ajf_1)exk_22, "levelDescription");
        fis_1.a().a((ajf_1)bjb_1.a.h(), bji_1.b);
    }

    public void a(bmr_1 bmr_12) {
        this.t = bmr_12.a_();
        bmk_1 bmk_12 = bzg_1.a.a(bmr_12);
        fis_1.a().a("characterSheet", (Object)bmk_12, "inventoryDialog");
        fyy_0 fyy_02 = fpm_0.b().h().d("inventoryDialog");
        bjb_1.a.a(bmr_12);
        fis_1.a().a("itemDetail", (Object)null, fyy_02);
        fis_1.a().a("previewDialogActor", (Object)null, fyy_02);
        this.c(bmr_12);
    }

    public static void c(long l) {
        fyy_0 fyy_02;
        bmr_1 bmr_12 = cyt_0.s();
        bHi bHi2 = bmr_12.da();
        bHi2.c();
        bmr_12.ch();
        exk_2 exk_22 = (exk_2)fis_1.a().d("itemDetail", "inventoryDialog");
        if (exk_22 != null && exk_22.a() == l && (fyy_02 = fpm_0.b().h().d("inventoryDialog")) != null) {
            fis_1.a().a("itemDetail", "isEquiped", fyy_02);
        }
    }

    public boolean e() {
        return azu_0.j().c(this);
    }

    public void g() {
        this.d(false);
    }

    public void d(boolean bl) {
        if (!this.e()) {
            this.D = bl;
            azu_0.j().a(this);
            azu_0.j().a(cxy_0.a());
        }
    }

    @Override
    public String c(bmk_1 bmk_12) {
        if (!fpm_0.b().q("inventoryDialog")) {
            btn_0.a().a(btr_0.c, "inventoryDialog");
        }
        String string = super.c(bmk_12);
        cyt_0.b(string);
        return string;
    }

    public static void b(String string) {
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        fue_0 fue_02 = (fue_0)fyy_02.a("inventoriesScrollContainer");
        fue_02.setAutoScrollVertical(true);
        fue_02.setDndListenerContentValidator(new cyw_0());
        fis_1.a().a("editableBag", (Object)null, fyy_02);
    }

    @Override
    public String a(bmk_1 bmk_12, String string, int n, int n2) {
        String string2 = super.a(bmk_12, string, n, n2);
        if (string2 == null) {
            return null;
        }
        if (!bmk_12.k()) {
            cyt_0.b(string2);
        }
        fis_1.a().a("itemLevelController", (Object)null, string2);
        fis_1.a().a("itemDetail", (Object)null, string2);
        fis_1.a().a("equipment.showBags", (Object)false, string2);
        fis_1.a().a("equipment.closeButton.xOffset", (Object)330, string2);
        bua_0.a.a(new buw_1());
        cyt_0.c(string2);
        return string2;
    }

    public String b(bmk_1 bmk_12, String string, String string2, int n, int n2, fvk_0 fvk_02) {
        String string3 = super.a(bmk_12, string, string2, n, n2, fvk_02);
        this.u.add(string3);
        if (string3 == null) {
            return null;
        }
        cyt_0.b(string3);
        if (!fpm_0.b().d("wakfu.equipment")) {
            fpm_0.b().a("wakfu.equipment", cgo_0.class);
        }
        blx_1 blx_12 = bmk_12.l();
        fis_1.a().a("itemLevelController", (Object)null, string3);
        fis_1.a().a("localPlayer", (Object)blx_12, string3);
        fis_1.a().a("equipment.showBags", (Object)true, string3);
        fis_1.a().a("equipment.closeButton.xOffset", (Object)280, string3);
        return string3;
    }

    @Override
    public String a(bmk_1 bmk_12, String string, String string2, int n, int n2, fvk_0 fvk_02) {
        String string3 = super.a(bmk_12, string, string2, n, n2, fvk_02);
        this.u.add(string3);
        if (string3 == null) {
            return null;
        }
        if (!bmk_12.k()) {
            cyt_0.b(string3);
        }
        if (!fpm_0.b().d("wakfu.equipment")) {
            fpm_0.b().a("wakfu.equipment", cgo_0.class);
        }
        fyy_0 fyy_02 = fpm_0.b().h().d(string3);
        fvk_0 fvk_03 = (fvk_0)fyy_02.a(string2);
        fvk_03.a(new cyx_0(this, fvk_03, n, n2));
        fis_1.a().a("itemLevelController", (Object)null, string3);
        fis_1.a().a("localPlayer", euw_2.a.d(bmk_12.l().a_()), string3);
        fis_1.a().a("equipment.showBags", (Object)true, string3);
        fis_1.a().a("equipment.closeButton.xOffset", (Object)280, string3);
        return string3;
    }

    public void h() {
        for (String string : this.u) {
            fpm_0.b().o(string);
        }
    }

    private static void x() {
        fyy_0 fyy_02 = fpm_0.b().h().d("worldAndFightBarDialog");
        if (fyy_02 == null) {
            return;
        }
        fvE fvE2 = (fvE)fyy_02.a("inventoryButton");
        if (fvE2 == null) {
            return;
        }
        fvE2.getAppearance().removeTweensOfType(fjp_2.class);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        bmr_1 bmr_12 = this.h != null ? this.h : azu_0.j().k();
        byte by = this.g >= 0 ? this.g : (byte)bmr_12.dx().d().e();
        bjb_1.a.b(by);
        bjb_1.a.a(bmr_12);
        bmr_12.da().a(bhs_0.a);
        super.a(aav_22, bl);
        cyt_0.x();
        bHi bHi2 = bmr_12.da();
        this.t = bmr_12.a_();
        bmk_1 bmk_12 = bzg_1.a.a(bmr_12);
        fis_1.a().a("characterSheet", (Object)bmk_12, this.f());
        fis_1.a().a("equipmentDialogActor", (Object)bjb_1.a.b(), "inventoryDialog");
        fis_1.a().a("previewDialogActor", (Object)bjb_1.a.c(), "inventoryDialog");
        fis_1.a().a("buildEquipment", (Object)bjb_1.a, "inventoryDialog");
        fis_1.a().a("localPlayer", (Object)bmr_12, "inventoryDialog");
        fis_1.a().a("equipment.showBags", (Object)true, "inventoryDialog");
        fis_1.a().a("equipment.showEquipment", (Object)true, "inventoryDialog");
        fis_1.a().a("equipment.closeButton.xOffset", (Object)616, "inventoryDialog");
        fis_1.a().a("recycleInventory", (Object)false, "inventoryDialog");
        this.a("recycleInventory", (Object)false);
        fis_1.a().a((ajf_1)bmr_12, "formatedKamas");
        this.r = new cYy(this);
        fzn.a().a(this.r);
        bHi2.c();
        if (!fpm_0.b().d("wakfu.equipment")) {
            fpm_0.b().a("wakfu.equipment", cgo_0.class);
        }
        cdw_0.n().c(600026L);
        fpm_0.b().a(this.s);
        this.A();
        cgo_0.addListener(this.w);
        fyy_0 fyy_02 = fpm_0.b().h().d("inventoryDialog");
        this.A = (fso)fyy_02.a("pvpInventory");
        this.C = false;
        fis_1.a().a("cosmeticPreviewType", bol_1.d(ft_1.c));
        if (this.D) {
            fis_1.a().a("equipment.closeButton.xOffset", (Object)280, "inventoryDialog");
            bjb_1.a.c(false);
            fis_1.a().a((ajf_1)bjb_1.a, bjb_1.a.d());
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        bmr_1 bmr_12 = cyt_0.s();
        bmr_12.da().a((String)null);
        this.h();
        this.A();
        bjb_1.a.r();
        fis_1.a().a("itemDetail", (Object)null, "inventoryDialog");
        fis_1.a().a("pet", (Object)null, "inventoryDialog");
        if (!azu_0.j().c(cXC.a())) {
            fpm_0.b().e("wakfu.equipment");
        }
        fzn.a().b(this.r);
        this.r = null;
        bmr_1 bmr_13 = bzf_1.a();
        if (bmr_13 != null) {
            this.t = 0L;
        }
        if (this.w()) {
            this.d();
        }
        if (this.u()) {
            this.c();
        }
        cdw_0.n().c(600027L);
        fpm_0.b().b(this.s);
        cgo_0.removeListener(this.w);
        this.A = null;
        this.B = false;
        bjb_1.a.c().a(bmr_12.en());
        super.b(aav_22, false);
    }

    private int e(boolean bl) {
        if (bl) {
            return 650;
        }
        return this.D ? 50 : 380;
    }

    private void y() {
        fyy_0 fyy_02 = fpm_0.b().h().d("inventoryDialog");
        fso fso2 = (fso)fyy_02.a("containerBottom");
        fqm_0 fqm_02 = (fqm_0)fyy_02.a("margin");
        int n = this.B ? 250 : 0;
        Insets insets = new Insets(0, 44, 0, n);
        fso fso3 = fqm_02.getParentOfType(fso.class);
        fso3.getAppearance().setMargin(insets);
        fso3.getContainer().getLayoutManager().a(fso3);
        fso2.invalidateMinSize();
    }

    void a(fvk_0 fvk_02) {
        fvk_02.a(new cyz_0(this, fvk_02));
    }

    private void c(bmr_1 bmr_12) {
        for (String string : this.e) {
            fyy_0 fyy_02 = fpm_0.b().h().d(string);
            for (String string2 : bmr_1.bu) {
                fis_1.a().a("characterSheet", string2, fyy_02);
            }
            fis_1.a().a((ajf_1)euw_2.a.d(this.t), bmr_1.bu);
            fis_1.a().a((ajf_1)bmr_12, "formatedKamas");
        }
    }

    public void i() {
        TLongObjectIterator tLongObjectIterator = c.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            for (String string : this.e) {
                Object object;
                fyy_0 fyy_02 = fpm_0.b().h().d(string);
                bmk_1 bmk_12 = (bmk_1)tLongObjectIterator.value();
                for (String string2 : bmr_1.bu) {
                    fis_1.a().a("characterSheet", string2, fyy_02);
                }
                if (bmk_12.k()) {
                    if (bmk_12.m().e(exh_2.p.A) != null) {
                        if (fyy_02 == null) continue;
                        if (fyy_02.c("localPlayerDisplay") && bmk_12.l().a_() == this.t) {
                            object = (frO)fyy_02.a("localPlayerDisplay");
                            ((frO)object).setDirection(aej_2.d.a());
                        }
                    }
                } else if (bmk_12.l().cG().a(exh_2.p) != null) {
                    if (fyy_02 == null) continue;
                    if (fyy_02.c("localPlayerDisplay") && bmk_12.l().a_() == this.t) {
                        object = (frO)fyy_02.a("localPlayerDisplay");
                        ((frO)object).setDirection(aej_2.d.a());
                    }
                }
                fis_1.a().a("itemDetail", "isEquiped", fyy_02);
                object = azu_0.j().k();
                fis_1.a().a((ajf_1)object, bmr_1.bu);
            }
        }
    }

    public long r() {
        return this.t == 0L ? azu_0.j().k().a_() : this.t;
    }

    public static bmr_1 s() {
        return cyt_0.l.t == 0L ? azu_0.j().k() : (bmr_1)euw_2.a.d(cyt_0.l.t);
    }

    public void t() {
        TIntObjectIterator tIntObjectIterator = b.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            for (String string : this.e) {
                bmk_1 bmk_12;
                fyy_0 fyy_02 = fpm_0.b().h().d(string);
                if (fyy_02 == null || !(bmk_12 = (bmk_1)tIntObjectIterator.value()).k()) continue;
                for (String string2 : bqU.aj) {
                    fis_1.a().a("characterSheet", string2, fyy_02);
                }
                fis_1.a().a("itemDetail", "isEquiped", fyy_02);
            }
        }
    }

    public void d(long l) {
        if (this.u.contains("newInventoryOnlyDialog" + l)) {
            fpm_0.b().o("newInventoryOnlyDialog" + l);
        }
        if (this.t != l) {
            return;
        }
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null || bmr_12.a_() == this.t) {
            return;
        }
        this.t = bmr_12.a_();
        this.a(bmr_12);
        bmk_1 bmk_12 = bzg_1.a.a(bmr_12);
        fis_1.a().a("characterSheet", (Object)bmk_12, "inventoryDialog");
    }

    private static void c(String string) {
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        fso fso2 = (fso)fyy_02.a("containerBottom");
        fqm_0 fqm_02 = (fqm_0)fyy_02.a("margin");
        Insets insets = new Insets(0, 0, 0, 0);
        fso fso3 = fqm_02.getParentOfType(fso.class);
        fso3.getAppearance().setMargin(insets);
        fso3.getContainer().getLayoutManager().a(fso3);
        fso2.invalidateMinSize();
    }

    private static void z() {
        fyy_0 fyy_02 = fpm_0.b().h().d("inventoryDialog");
        fug_0 fug_02 = (fug_0)fyy_02.a("textEditor");
        fug_0 fug_03 = (fug_0)fyy_02.a("minLevel");
        fug_0 fug_04 = (fug_0)fyy_02.a("maxLevel");
        fug_02.c("");
        fug_03.c("");
        fug_04.c("");
    }

    private void A() {
        if (this.v != null) {
            fyy_0 fyy_02 = fpm_0.b().h().d("inventoryDialog");
            fru_0 fru_02 = (fru_0)fyy_02.a("validateButton");
            if (fru_02 != null) {
                fru_02.getAppearance().c(this.v);
            }
            this.v = null;
        }
    }
}

