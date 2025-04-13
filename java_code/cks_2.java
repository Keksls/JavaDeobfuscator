/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cKS
 */
public class cks_2
extends fvE {
    private static final Logger b = Logger.getLogger(cks_2.class);
    public static final String TAG = "WorldEditor";
    public static final int a = 3;
    private static final azf_2 c = new azf_2(255, 255, 255, 64);
    private static final int d = auc_1.c("HavenWorldBuildingRemoved");
    static final azf_2 e = azf_2.e;
    private static final azf_2 f = new azf_2(255, 0, 0, 255);
    private static final Material g = (Material)Material.d.c();
    private final acy_2<ckw_1> h = new acy_2();
    private csi_1 i;
    private fkj_0 j;
    private fxl_0 k;
    private csm_1 l;
    @NotNull
    private fks_0 m = fks_0.b;
    private int n = Integer.MAX_VALUE;
    private int o = Integer.MAX_VALUE;
    private EntitySprite p;

    public cks_2() {
        for (fks_0 fks_02 : fks_0.values()) {
            this.h.a(fks_02.ordinal(), new ckw_1());
        }
    }

    public csm_1 getTool() {
        if (this.l != null) {
            return this.l;
        }
        this.l = (csm_1)Gy.a().b(csj_1.class).get();
        this.l.a(this);
        return this.l;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public csi_1 getHavenWorldImages() {
        return this.i;
    }

    public fkj_0 getWorkingHavenWorld() {
        return this.j;
    }

    public fks_0 getCurrentLayer() {
        return this.m;
    }

    public void a(fkj_0 fkj_02, csi_1 csi_12) {
        this.j = fkj_02.f();
        this.i = csi_12;
        this.a(fkj_02);
        this.k.f(0.0f, (float)(9 * (fkj_02.i() + fkj_02.m()) / 2));
    }

    public void a(int n, int n2) {
        this.k.f((float)n, (float)n2);
        this.b();
    }

    public float getZoomFactor() {
        return this.k.e();
    }

    public void a() {
        this.k.c(this.k.e() * 2.0f);
        this.b();
    }

    public void b() {
        this.setNeedsToResetMeshes();
    }

    public void c() {
        this.k.c(this.k.e() * 0.5f);
        this.b();
    }

    public void a(float f2, float f3) {
        float f4;
        float f5;
        int n;
        fkj_0 fkj_02 = this.getWorkingHavenWorld();
        afk_2 afk_22 = fkj_02.g();
        afq_2 afq_22 = this.k.f();
        afq_2 afq_23 = this.k.d(f2, f3);
        if (afq_23.a() > 0.0f) {
            n = (afk_22.c + 1) * 9;
            f5 = Math.min((float)n - afq_22.a(), afq_23.a());
        } else {
            n = afk_22.b * 9;
            f5 = Math.max((float)n - afq_22.a(), afq_23.a());
        }
        if (afq_23.b() > 0.0f) {
            int n2 = (afk_22.e + 1) * 9;
            f4 = Math.min((float)n2 - afq_22.b(), afq_23.b());
        } else {
            int n3 = afk_22.d * 9;
            f4 = Math.max((float)n3 - afq_22.b(), afq_23.b());
        }
        this.k.f(afq_22.a() + f5, afq_22.b() + f4);
        this.b();
    }

    public afq_2 getScreenCenter() {
        float f2 = (float)(this.j.h() + this.j.l()) / 2.0f;
        float f3 = (float)(this.j.i() + this.j.m()) / 2.0f - 3.0f;
        return this.k.e((f2 += 0.5f) * 9.0f, (f3 += 0.5f) * 9.0f);
    }

    @Override
    public void setSize(int n, int n2, boolean bl) {
        super.setSize(n, n2, bl);
        this.k.a(n, n2);
    }

    public afe_1 getPatchCoordFromMouse(int n, int n2) {
        afe_1 afe_12 = this.getCellCoordFromMouse(n, n2);
        afe_12.b(fkk_0.b(afe_12.a()), fkk_0.c(afe_12.b()));
        return afe_12;
    }

    public afe_1 getCellCoordFromMouse(int n, int n2) {
        return this.k.g(n, n2);
    }

    public void setCurrentLayer(fks_0 fks_02) {
        if (this.m == fks_02) {
            return;
        }
        this.a(fks_02);
        this.setSelectTool();
    }

    private void a(fks_0 fks_02) {
        this.m = fks_02;
    }

    public void a(clg_1 clg_12) {
        if (this.k == null) {
            return;
        }
        this.k.a(clg_12.c ? 0.4f : 1.0f);
        this.k.a(clg_12.b);
    }

    public void setTool(csm_1 csm_12) {
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.getTool().c();
        this.l = csm_12;
        this.getTool().a(this);
        this.a(this.getTool().a());
        this.b();
    }

    public void b(int n, int n2) {
        afe_1 afe_12 = this.getCellCoordFromMouse(n, n2);
        if (this.n != afe_12.a() || this.o != afe_12.b()) {
            this.getTool().c();
            this.getTool().b(n, n2);
            this.b();
            this.n = afe_12.a();
            this.o = afe_12.b();
        }
    }

    public void c(int n, int n2) {
        this.getTool().c();
        this.getTool().c(n, n2);
        this.b();
    }

    private void a(fkj_0 fkj_02) {
        this.k.c();
        this.k.a(this.i.a(), this.i.b());
        if (fkj_02 == null) {
            b.error((Object)"Le havre monde ne doit pas \u00eatre null");
            return;
        }
        for (int k = fkj_02.i(); k <= fkj_02.m(); ++k) {
            for (int i2 = fkj_02.h(); i2 <= fkj_02.l(); ++i2) {
                this.a(fkj_02.b(i2, k), i2, k);
            }
        }
        fkj_02.a(new ckt_1(this));
        this.k.a(this.j.g());
        this.k.a(true);
    }

    public fkv_0 a(int n, afe_1 afe_12) {
        Entity3D entity3D = this.k.a(afe_12, c);
        fkv_0 fkv_02 = new fkv_0(new etm_2(n), afe_12.a(), afe_12.b());
        this.a(fkv_02, entity3D);
        return fkv_02;
    }

    private fkw a(int n, int n2, int n3) {
        etn_2 etn_22 = eti_2.a.d((short)n);
        if (etn_22 == null) {
            b.error((Object)("Pas de patch d'id " + n));
            return null;
        }
        return this.b(etn_22, n2, n3);
    }

    private fkw b(etn_2 etn_22, int n, int n2) {
        short s2 = etn_22.b();
        ays_2 ays_22 = this.i.c(s2);
        if (ays_22 == null) {
            b.error((Object)("Pas de texture pour le patch " + s2));
            return null;
        }
        fkw fkw2 = new fkw(etn_22, n, n2);
        afe_1 afe_12 = this.i.a(s2);
        EntitySprite entitySprite = this.k.a(fkw2.b(), afe_12, ays_22, azf_2.e);
        this.a(fkw2, entitySprite);
        return fkw2;
    }

    public fkw a(etn_2 etn_22, int n, int n2) {
        fkw fkw2 = this.b(etn_22, n, n2);
        if (fkw2 != null) {
            this.j.a(n, n2, etn_22.b());
        }
        return fkw2;
    }

    fkr_0 c(esy_2 esy_22) {
        etw_2 etw_22 = esy_22.g();
        etw_2 etw_23 = eta_2.c(etw_22);
        if (etw_23 == null) {
            return null;
        }
        int n = etw_23.a(esy_22.e());
        ays_2 ays_22 = this.i.d(n);
        if (ays_22 == null) {
            b.error((Object)("Pas de texture pour le groupe " + n));
            return null;
        }
        afe_1 afe_12 = new afe_1(esy_22.h(), esy_22.i());
        afe_1 afe_13 = this.i.b(n);
        EntitySprite entitySprite = this.k.b(afe_12, afe_13, ays_22, azf_2.e);
        fkr_0 fkr_02 = new fkr_0(esy_22);
        this.a(fkr_02, entitySprite);
        return fkr_02;
    }

    public fkr_0 a(esy_2 esy_22) {
        fkr_0 fkr_02 = this.c(esy_22);
        if (fkr_02 != null) {
            etw_2 etw_22 = eta_2.c(esy_22.g());
            csh_1 csh_12 = Gy.a().a(csh_1.class);
            esy_2 esy_23 = csh_12.a(esy_22.c(), etw_22.a(), esy_22.e(), esy_22.h(), esy_22.i());
            this.j.a(esy_23);
        }
        return fkr_02;
    }

    public fkr_0 b(esy_2 esy_22) {
        fkr_0 fkr_02 = this.c(esy_22);
        this.j.a(esy_22);
        return fkr_02;
    }

    private void a(fkt_0 fkt_02, Entity entity) {
        Entity entity2 = this.a(entity, fkt_02);
        this.a(entity2);
    }

    private void a(Entity entity) {
        this.k.a(entity);
        if (this.p == entity) {
            this.p = null;
        }
    }

    public void a(fkt_0 fkt_02) {
        if (fkt_02 != null) {
            switch (fkt_02.a()) {
                case b: {
                    this.j.b(fkt_02.d());
                    break;
                }
                case c: {
                    this.k.b();
                }
            }
        }
        Entity entity = this.h(fkt_02);
        this.a(entity);
        this.b();
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        this.m_entity.a((Entity)this.k.a());
    }

    public EntityGroup getMapEntity() {
        return this.k.a();
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        if (this.k != null) {
            this.k.d();
            this.k = null;
        }
        this.p = null;
        for (int k = 0; k < this.h.d(); ++k) {
            this.h.h(k).a();
        }
        this.h.c();
        this.l = (csm_1)Gy.a().b(csj_1.class).get();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.k = new fxl_0();
        this.k.c(0.25f);
        fqj fqj2 = fqj.checkOut();
        fqj2.setWidget(this);
        this.add(fqj2);
        this.setNeedsToPreProcess();
        this.setFocusable(true);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }

    public fkw getGroundUnderMouse(int n, int n2) {
        afe_1 afe_12 = this.getPatchCoordFromMouse(n, n2);
        int n3 = afe_12.a() * 9;
        int n4 = afe_12.b() * 9;
        EntitySprite entitySprite = this.k.d(n3, n4);
        return (fkw)this.getItem(fks_0.a, entitySprite);
    }

    public fkw getGround(int n, int n2) {
        int n3 = n * 9;
        int n4 = n2 * 9;
        EntitySprite entitySprite = this.k.d(n3, n4);
        return (fkw)this.getItem(fks_0.a, entitySprite);
    }

    public fkr_0 getBuildingUnderMouse(int n, int n2) {
        EntitySprite entitySprite = this.k.f(n, n2);
        return (fkr_0)this.getItem(fks_0.b, entitySprite);
    }

    public fkr_0 getBuilding(int n, int n2) {
        EntitySprite entitySprite = this.k.e(n, n2);
        return (fkr_0)this.getItem(fks_0.b, entitySprite);
    }

    public void b(fkt_0 fkt_02) {
        if (fkt_02 instanceof fkv_0) {
            this.a(0, fkt_02.b());
            return;
        }
        this.d();
        Entity entity = this.g(fkt_02);
        if (entity instanceof EntitySprite || entity == null) {
            this.a((EntitySprite)entity);
        }
        this.b();
    }

    public void d() {
        if (this.k != null) {
            this.k.b();
        }
    }

    private void a(EntitySprite entitySprite) {
        if (this.p == entitySprite) {
            return;
        }
        if (this.p != null && this.p.av()) {
            this.p.a(Material.b);
        }
        if (entitySprite != null) {
            entitySprite.a(g);
        }
        this.p = entitySprite;
    }

    public void c(fkt_0 fkt_02) {
        Entity entity = this.g(fkt_02);
        if (entity == null) {
            return;
        }
        aug_1 aug_12 = aui_1.a().c();
        if (aug_12.b(d)) {
            entity.a(aug_12, d, null);
        }
    }

    public void d(fkt_0 fkt_02) {
        Entity entity = this.g(fkt_02);
        if (entity == null) {
            return;
        }
        entity.R();
    }

    public void e(fkt_0 fkt_02) {
        Entity entity = this.g(fkt_02);
        if (entity == null) {
            return;
        }
        entity.a(f);
    }

    public void f(fkt_0 fkt_02) {
        Entity entity = this.g(fkt_02);
        if (entity == null) {
            return;
        }
        entity.a(e);
    }

    public void e() {
        for (int k = 0; k < this.h.d(); ++k) {
            this.h.h((int)k).c.forEachValue((TObjectProcedure)new cku_1(this));
        }
    }

    public void setSelectTool() {
        if (this.m == fks_0.a) {
            this.setTool((csm_1)Gy.a().b(csl_1.class).get());
            return;
        }
        if (this.m == fks_0.b) {
            this.setTool((csm_1)Gy.a().b(csk_1.class).get());
            return;
        }
        this.setTool((csm_1)Gy.a().b(csj_1.class).get());
    }

    private Entity g(fkt_0 fkt_02) {
        if (fkt_02 == null) {
            return null;
        }
        return this.getSpriteMap(fkt_02).a(fkt_02);
    }

    private Entity a(Entity entity, fkt_0 fkt_02) {
        return this.getSpriteMap(fkt_02).a(entity, fkt_02);
    }

    private Entity h(fkt_0 fkt_02) {
        return this.getSpriteMap(fkt_02).b(fkt_02);
    }

    private fkt_0 getItem(fks_0 fks_02, EntitySprite entitySprite) {
        return this.getSpriteMap(fks_02).a(entitySprite);
    }

    private ckw_1 getSpriteMap(fkt_0 fkt_02) {
        return this.getSpriteMap(fkt_02.a());
    }

    private ckw_1 getSpriteMap(fks_0 fks_02) {
        return this.h.g(fks_02.ordinal());
    }

    public void getEntities(EntityGroup entityGroup) {
        this.k.a(entityGroup);
    }

    static {
        g.b(0.2f, 0.2f, 0.2f);
    }
}

