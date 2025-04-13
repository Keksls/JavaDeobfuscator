/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cKU
 */
class cku_1
implements TObjectProcedure<Entity> {
    final /* synthetic */ cks_2 a;

    cku_1(cks_2 cks_22) {
        this.a = cks_22;
    }

    public boolean a(Entity entity) {
        if (entity instanceof EntitySprite) {
            entity.a(cks_2.e);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((Entity)object);
    }
}

