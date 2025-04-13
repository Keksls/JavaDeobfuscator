/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class cXC
implements ahr_1,
afb_0,
ebv_0 {
    protected static final Logger a = Logger.getLogger(cXC.class);
    private static final cXC b = new cXC();
    private ans_1 c;
    private TIntObjectHashMap<brk_1> d;
    private brg_1 e;
    private fyy_0 f;
    private int g;
    ftv h;
    private fup_0 i;
    private boolean j;
    private final Runnable k = new cXE(this);

    public static cXC a() {
        return b;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            azu_0.j().b(dei.a());
            azu_0.j().b(cyc_0.d());
            this.c = new cXD(this);
            fpm_0.b().a(this.c);
            bmr_1 bmr_12 = azu_0.j().k();
            if (!cXC.r()) {
                bmr_12.eX().a(this);
            }
            bmr_12.bv().a(this);
            String string = this.j ? "craftTableFreeDialog" : "craftTableDialog";
            this.f = fpm_0.b().a(string, cfi_0.a(string), 1L, (short)10000).getElementMap();
            fis_1.a().a("craft", (Object)this.e, string);
            this.g = 0;
            fis_1.a().a("currentCraftNb", this.g);
            fis_1.a().a("selectedRecipe", (Object)null);
            fis_1.a().a("craftRunning", false);
            fis_1.a().a("recipeIngredientStack", (Object)null);
            cdw_0.n().c(600012L);
            if (!fpm_0.b().d("wakfu.craftTable")) {
                fpm_0.b().a("wakfu.craftTable", cgv_0.class);
            }
            if (!fpm_0.b().d("wakfu.crafts")) {
                fpm_0.b().a("wakfu.crafts", cgu_0.class);
            }
            if (!fpm_0.b().d("wakfu.equipment")) {
                fpm_0.b().a("wakfu.equipment", cgo_0.class);
            }
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (fis_1.a().c("craftRunning") && bmr_12.eE() != null) {
                this.d();
            }
            bmr_12.a(false, true);
            bmr_12.bv().b(this);
            if (!cXC.r()) {
                bmr_12.eX().b(this);
            }
            this.k();
            this.d = null;
            this.f = null;
            fpm_0.b().b(this.c);
            fpm_0.b().o("craftTableDialog");
            fpm_0.b().o("craftTableFreeDialog");
            fpm_0.b().o("splitStackDialog");
            fis_1.a().a("currentCraftNb");
            this.h = null;
            this.i = null;
            fis_1.a().a("selectedRecipe");
            fis_1.a().a("craftRunning");
            fis_1.a().a("recipeIngredientStack");
            fis_1.a().a("craftTableName");
            cdw_0.n().c(600013L);
            if (!azu_0.j().c(cVS.b)) {
                fpm_0.b().e("wakfu.craftTable");
            }
            if (!(azu_0.j().c(cVS.b) || azu_0.j().c(cxa_0.a()) || fpm_0.b().q("recipeViewDialog") || fpm_0.b().q("craftLinkedRecipeDialog"))) {
                fpm_0.b().e("wakfu.crafts");
            }
            if (!azu_0.j().c(cyt_0.a())) {
                fpm_0.b().e("wakfu.equipment");
            }
            azu_0.j().a(dei.a());
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16119: {
                return false;
            }
            case 19745: {
                anw_1 anw_12 = (anw_1)adt_12;
                boolean bl = anw_12.i();
                this.e.a(bl);
                this.d.clear();
                this.n();
                this.l();
                for (exk_2 exk_22 : azu_0.j().k().da().e()) {
                    fis_1.a().a((ajf_1)exk_22, "usedInCurrentRecipe", "movable", "deletable");
                }
                return false;
            }
            case 19904: {
                dfF dfF2 = (dfF)adt_12;
                int n = dfF2.k();
                brk_1 brk_12 = (brk_1)this.d.get(n);
                if (brk_12 != null) {
                    this.d.remove(n);
                    this.n();
                    this.l();
                    cXC.c(n);
                }
                this.a(true);
                return false;
            }
            case 17822: {
                if (fis_1.a().c("craftRunning")) {
                    return false;
                }
                dfG dfG2 = (dfG)adt_12;
                brk_1 brk_13 = dfG2.k();
                int n = brk_13.a().n();
                short s2 = dfG2.e();
                if (s2 == -1 || brk_13.b() == 1) {
                    this.d.remove(n);
                } else {
                    this.d.put(n, (Object)new brk_1((short)(brk_13.b() - 1), brk_13.a()));
                }
                this.l();
                this.n();
                cXC.c(n);
                return false;
            }
            case 16071: {
                dgL dgL2 = (dgL)adt_12;
                exk_2 exk_23 = dgL2.o();
                if (!exk_23.T().i() || fis_1.a().c("craftRunning")) {
                    return false;
                }
                int n = exk_23.aT_();
                brk_1 brk_14 = (brk_1)this.d.get(n);
                short s3 = dgL2.u();
                if (brk_14 != null) {
                    if (s3 != 1) {
                        a.error((Object)"on a encore un item de m\u00eame type dans la liste des ingr\u00e9dients !");
                        return false;
                    }
                    int n2 = brk_14.b() + 1;
                    if (azu_0.j().k().da().h(n) < n2) {
                        return false;
                    }
                    s3 = (short)n2;
                }
                this.d.put(n, (Object)new brk_1(s3 == -1 ? exk_23.e() : s3, (bjw_1)exk_23.T()));
                this.a(false);
                this.l();
                this.n();
                cXC.c(n);
                return false;
            }
            case 16904: {
                if (fis_1.a().c("craftRunning")) {
                    return false;
                }
                dfI dfI2 = (dfI)adt_12;
                brw_0 brw_02 = dfI2.k();
                if (!brw_02.g().a(this.e.C())) {
                    return false;
                }
                brw_02.a(azu_0.j().k().a(brw_02.g()) && this.e.b(brw_02.g()));
                brw_0 brw_03 = (brw_0)fis_1.a().e("selectedRecipe");
                this.k();
                for (brk_1 brk_15 : brw_02.f()) {
                    int n = brk_15.a().n();
                    this.d.put(n, (Object)brk_15);
                    cXC.c(n);
                }
                this.n();
                if (brw_02 == brw_03) {
                    brw_02 = null;
                }
                fis_1.a().a("selectedRecipe", brw_02);
                this.g = 1;
                fis_1.a().a("currentCraftNb", this.g);
                fis_1.a().a((ajf_1)brw_02, "totalCraftFee");
                return false;
            }
            case 17246: {
                dfj_0 dfj_02 = (dfj_0)adt_12;
                if (fis_1.a().c("craftRunning")) {
                    return false;
                }
                if (!this.p()) {
                    dfj_02.o().setSelected(false);
                    String string = bae.h().a("craft.error.inventoryFull", new Object[0]);
                    fzn_0 fzn_02 = new fzn_0(102, 0, string, 2L);
                    fpm_0.b().a(fzn_02);
                } else {
                    this.h = dfj_02.k();
                    this.h.setValue(0.0f);
                    this.i = dfj_02.o();
                    this.q();
                }
                return false;
            }
            case 16332: {
                if (!fis_1.a().c("craftRunning")) {
                    return false;
                }
                this.d();
                return false;
            }
            case 17619: {
                fis_1.a().a("currentCraftNb", (Object)null);
                anw_1 anw_13 = (anw_1)adt_12;
                this.g = anw_13.c();
                brw_0 brw_04 = (brw_0)fis_1.a().e("selectedRecipe");
                if (brw_04 != null) {
                    long l;
                    long l2;
                    long l3;
                    int n = azu_0.j().k().b(brw_04.g());
                    if (this.g > n) {
                        this.g = n;
                    }
                    if ((l3 = brw_04.k()) > 0L && (l2 = (long)this.g * l3) > (l = azu_0.j().k().cq())) {
                        this.g = Hw.e(l / l3);
                    }
                }
                if (this.g == 0) {
                    this.g = 1;
                }
                fis_1.a().a("currentCraftNb", this.g);
                fis_1.a().a((ajf_1)brw_04, "totalCraftFee");
                return false;
            }
            case 17495: {
                this.m();
                return false;
            }
        }
        return true;
    }

    private void k() {
        int[] nArray = this.d.keys();
        this.d.clear();
        for (int n : nArray) {
            cXC.c(n);
        }
    }

    private static void c(int n) {
        for (exk_2 exk_22 : azu_0.j().k().da().i(n)) {
            fis_1.a().a((ajf_1)exk_22, "usedInCurrentRecipe", "movable", "deletable");
        }
    }

    private void l() {
        fis_1.a().a("selectedRecipe", this.o());
    }

    private void m() {
        brw_0 brw_02;
        fis_1.a().a("currentCraftNb", (Object)null);
        Object object = fis_1.a().e("selectedRecipe");
        bmr_1 bmr_12 = azu_0.j().k();
        bHi bHi2 = bmr_12.da();
        if (object != null) {
            long l;
            long l2;
            brw_02 = (brw_0)object;
            this.g = Math.max(1, bmr_12.b(brw_02.g()));
            long l3 = brw_02.k();
            if (l3 > 0L && (l2 = (long)this.g * l3) > (l = azu_0.j().k().cq())) {
                this.g = Hw.e(l / l3);
            }
        } else if (this.d.isEmpty()) {
            this.g = 0;
        } else {
            int n = Integer.MAX_VALUE;
            TIntObjectIterator tIntObjectIterator = this.d.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                int n2 = bHi2.a(tIntObjectIterator.key()) / ((brk_1)tIntObjectIterator.value()).b();
                if (n2 >= n) continue;
                n = n2;
            }
            this.g = n;
        }
        fis_1.a().a("currentCraftNb", this.g);
        if (object != null) {
            brw_02 = (brw_0)object;
            fis_1.a().a((ajf_1)brw_02, "totalCraftFee");
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(bgq_1 bgq_12, boolean bl) {
        bnh_1 bnh_12;
        fis_1.a().a("craftTableName", (Object)bgq_12.al_());
        bmr_1 bmr_12 = azu_0.j().k();
        if (cXC.r()) {
            bsx_2 bsx_22 = azu_0.j().k().di();
            bnh_12 = (bnh_1)bmf_2.a().c(bsx_22.q());
            if (bnh_12 == null) {
                a.warn((Object)"Cannot open secured crafting interface : the craftsman if offline");
                aUh.a("craft.secured.craftsman.absent", new Object[0]);
                return;
            }
        } else {
            bnh_12 = bmr_12;
        }
        this.e = new brg_1(bgq_12.Z(), bnh_12.U_(), bnh_12.eX(), bgq_12);
        this.e.a(new bri_1(this.e, 7));
        this.d = new TIntObjectHashMap();
        this.n();
        this.j = bl;
        azu_0.j().a(this);
    }

    private void n() {
        fis_1.a().a("recipeIngredientStack", this.d.isEmpty() ? null : this.d.values());
    }

    public boolean b(int n) {
        return this.d.containsKey(n);
    }

    public void a(boolean bl) {
        fab_1 fab_12 = (fab_1)((Object)this.f.a("ingredientList"));
        for (ftj_0 ftj_02 : fab_12.getRenderables()) {
            fvE fvE2 = (fvE)ftj_02.getInnerElementMap().a("ingredientBackgroundContainer");
            fvE2.setStyle(bl ? "itemSelectedBackground" : "itemBackground");
        }
    }

    private brw_0 o() {
        for (brw_0 brw_02 : this.e.p()) {
            if (this.d.size() != brw_02.f().size()) continue;
            boolean bl = true;
            for (brk_1 brk_12 : brw_02.f()) {
                brk_1 brk_13 = (brk_1)this.d.get(brk_12.a().n());
                if (brk_13 != null && brk_13.b() == brk_12.b()) continue;
                bl = false;
                break;
            }
            if (!bl) continue;
            fis_1.a().a("currentCraftNb", 1);
            fis_1.a().a((ajf_1)brw_02, "totalCraftFee");
            return brw_02;
        }
        if (!this.d.isEmpty()) {
            fis_1.a().a("currentCraftNb", 1);
            brw_0 brw_03 = (brw_0)fis_1.a().e("selectedRecipe");
            if (brw_03 != null) {
                fis_1.a().a((ajf_1)brw_03, "totalCraftFee");
            }
        }
        return null;
    }

    public void b(long l) {
        if (this.h != null) {
            this.h.setTweenDuration(l);
            ado_1.a().a(this.k, 100L, 1);
        }
        this.e.q().a((short)2);
        this.e.q().aI_();
        brw_0 brw_02 = (brw_0)fis_1.a().e("selectedRecipe");
        if (brw_02 != null) {
            bmr_1 bmr_12 = azu_0.j().k();
            ece_0 ece_02 = bmr_12.eX();
            short s2 = ece_02.f(this.e.e());
            long l2 = ece_02.i(this.e.e());
            long l3 = brw_02.g().a(s2, bmr_12);
            int n = bmr_12.cv().a(eAE.a, this.e.e(), 8);
            float f2 = (float)(100 + n) / 100.0f;
            this.e.a(l2 + (long)Math.round((float)l3 * f2));
        }
    }

    public void c() {
        boolean bl;
        Object object;
        Object object2;
        brw_0 brw_02;
        if (this.h != null) {
            this.h.setValue(0.0f);
        }
        if ((brw_02 = (brw_0)fis_1.a().e("selectedRecipe")) != null) {
            fis_1.a().a((ajf_1)brw_02, brw_02.d());
            eco_0 eco_02 = brw_02.g();
            object2 = this.e.p();
            object = object2.iterator();
            while (object.hasNext()) {
                brw_0 brw_03 = (brw_0)object.next();
                if (brw_03.g().e() != eco_02.e()) continue;
                brw_02 = brw_03;
                fis_1.a().a("selectedRecipe", brw_03);
            }
        }
        this.e.v();
        --this.g;
        boolean bl2 = bl = this.g > 0 && this.p();
        if (bl) {
            if (brw_02 != null) {
                brw_02.a(true);
            }
            this.q();
        } else {
            int n;
            fis_1.a().a("craftRunning", false);
            object2 = azu_0.j().k().da();
            object = new ArrayList();
            boolean bl3 = true;
            Object object3 = this.d.iterator();
            while (object3.hasNext()) {
                object3.advance();
                n = object3.key();
                short s2 = ((brk_1)object3.value()).b();
                if (((bHi)object2).a(n) >= s2) continue;
                object.add(n);
                bl3 = false;
            }
            if (brw_02 != null) {
                brw_02.a(bl3 && this.e.b(brw_02.g()));
            }
            object3 = object.iterator();
            while (object3.hasNext()) {
                n = (Integer)object3.next();
                this.d.remove(n);
                cXC.c(n);
            }
            this.n();
            this.g = bl3 && !this.d.isEmpty() ? 1 : 0;
            this.e.q().a((short)1);
            this.e.q().aI_();
        }
        fis_1.a().a("currentCraftNb", this.g);
        if (brw_02 != null) {
            fis_1.a().a((ajf_1)brw_02, "totalCraftFee");
        }
    }

    private boolean p() {
        brw_0 brw_02 = (brw_0)fis_1.a().e("selectedRecipe");
        eco_0 eco_02 = brw_02 != null ? brw_02.g() : null;
        bHi bHi2 = azu_0.j().k().da();
        if (bHi2.o() != 0) {
            return true;
        }
        boolean bl = eco_02 != null && eco_02.c(ecp_0.b);
        ecs_0 ecs_02 = eco_02 != null ? eco_02.k() : ecs_0.a;
        Object r2 = eyo_1.g().d(ecs_02.a());
        if (r2 == null) {
            return bl;
        }
        exk_2 exk_22 = new exk_2();
        exk_22.b((ezr_0)r2);
        exk_22.a(ecs_02.b());
        ArrayList<Long> arrayList = bHi2.h(exk_22);
        for (Long l : arrayList) {
            exg_2 exg_22 = bHi2.d(l);
            if (exg_22.p() <= 0) continue;
            return true;
        }
        exg_2 exg_23 = bHi2.e(exk_22);
        return exg_23 != null;
    }

    public void d() {
        bpc_2 bpc_22 = azu_0.j().k().eE();
        if (bpc_22 != null) {
            ((bpn_2)bpc_22).h();
        } else {
            a.error((Object)"On tente d'annuler le craft alors que le joueur n'a pas d'occupation !");
        }
        this.f();
    }

    public static void e() {
        azu_0.j().k().a(false, false);
        cXC.b.e.a(-1L);
        cXC.b.g = 0;
        b.f();
    }

    public void f() {
        if (this.h != null) {
            this.h.setValue(0.0f);
        }
        ado_1.a().b(this.k);
        fis_1.a().a("craftRunning", false);
        this.e.q().a((short)1);
        this.e.q().aI_();
    }

    private void q() {
        brw_0 brw_02 = (brw_0)fis_1.a().e("selectedRecipe");
        if (brw_02 != null) {
            Pw pw = this.e.l() ? new cms(this.e.q().a_(), brw_02.g().e(), brw_02.k()) : new cmq(this.e.q().a_(), brw_02.g().e());
            azu_0.j().K().c(pw);
        } else {
            int n;
            byte by;
            eco_0 eco_02 = this.g();
            if (eco_02 == null) {
                by = -1;
                n = 0;
            } else if (!this.e.q().a(eco_02.e())) {
                by = -2;
                n = eco_02.e();
            } else {
                by = 0;
                n = eco_02.e();
            }
            cmr cmr2 = new cmr(this.e.q().a_(), n, by);
            if (by == -1) {
                TIntObjectIterator tIntObjectIterator = this.d.iterator();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    cmr2.a(tIntObjectIterator.key(), ((brk_1)tIntObjectIterator.value()).b());
                }
            }
            azu_0.j().K().c(cmr2);
        }
        fis_1.a().a("craftRunning", true);
    }

    public eco_0 g() {
        TIntObjectIterator<eco_0> tIntObjectIterator = ecn_0.a.a(this.e.e()).f();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            eco_0 eco_02 = (eco_0)tIntObjectIterator.value();
            if (!eco_02.c(ecp_0.a)) continue;
            boolean bl = true;
            Iterator<Map.Entry<Integer, Cm<Short, Short>>> iterator = eco_02.l();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Cm<Short, Short>> entry = iterator.next();
                brk_1 brk_12 = (brk_1)this.d.get(entry.getKey().intValue());
                if (brk_12 != null && brk_12.b() == entry.getValue().a().shortValue()) continue;
                bl = false;
                break;
            }
            if (!bl) continue;
            return eco_02;
        }
        return null;
    }

    @Override
    public void a(@NotNull ect_0 ect_02) {
        throw new UnsupportedOperationException("aucune raison de notifier la crafttableFrame d'un m\u00e9tier appris");
    }

    @Override
    public void a(int n, long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        ece_0 ece_02 = bmr_12.eX();
        long l2 = ece_02.i(n);
        long l3 = l2 - l;
        if (ecu_0.c(l2) != ecu_0.c(l3)) {
            bmr_12.cS();
            this.e.y();
        }
        fis_1.a().a((ajf_1)this.e, "currentXpPercentage", "level", "levelText");
    }

    @Override
    public void a(int n) {
    }

    @Override
    public void a(int n, int n2) {
    }

    public void a(String string) {
        if (this.i == null) {
            return;
        }
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setAlignment(frs_0.e);
        fbx_12.setLevel(1);
        fbx_12.setFile(string);
        fbx_12.setUseParentScissor(true);
        fbx_12.setRemovable(false);
        this.i.getAppearance().add(fbx_12);
    }

    public int h() {
        return this.e.e();
    }

    public void i() {
        if (!cXC.r()) {
            bgg.a.b().c(b.h());
        }
        this.a("6001038.xps");
        this.c();
    }

    public void a(bgq_1 bgq_12) {
        if (bgq_12 == this.e.q()) {
            azu_0.j().b(this);
        }
    }

    private static boolean r() {
        bsx_2 bsx_22 = azu_0.j().k().di();
        return bsx_22 != null && bsx_22.q() != azu_0.j().k().a_();
    }

    public void j() {
        this.e.G();
    }

    @Override
    public void pathStarted(afe_0 afe_02, apl_1 apl_12) {
        azu_0.j().b(b);
    }
}

