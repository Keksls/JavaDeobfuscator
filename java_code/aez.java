/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import org.apache.log4j.Logger;

class aez
extends abd_0 {
    private static final Logger d = Logger.getLogger(aez.class);
    private Entity3D e;

    aez() {
    }

    @Override
    public void b() {
        super.b();
        this.e.u();
        this.e = null;
    }

    @Override
    public EntityGroup a(abu abu2) {
        EntityGroup entityGroup = super.a(abu2);
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.j.d();
        int n = 48 + abu2.ag() * 8;
        gLGeometrySprite.a((float)(n - 16), -24.0f, 48, n);
        gLGeometrySprite.a(0.5f, 0.5f, 0.5f, 1.0f);
        gLGeometrySprite.b(0.0f, 0.0f, 1.0f, 1.0f);
        assert (this.e == null);
        this.e = (Entity3D)Entity3D.c.d();
        this.e.a(gLGeometrySprite, auc_1.a().a, Material.b);
        gLGeometrySprite.u();
        this.e.a(aui_1.a().b(), aup_1.d, aup_1.H);
        this.e.a(aec_0.a);
        this.e.b(aey.a);
        this.e.b(false);
        entityGroup.a(this.e);
        return entityGroup;
    }

    @Override
    public void a(boolean bl) {
        if (bl) {
            aug_1 aug_12 = aui_1.a().b();
            this.e.b(!aug_12.b(aup_1.e));
        } else {
            this.e.b(false);
        }
    }
}

