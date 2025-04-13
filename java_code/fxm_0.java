/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.Comparator;

/*
 * Renamed from fxm
 */
class fxm_0
implements Comparator<Entity> {
    fxm_0() {
    }

    public int a(Entity entity, Entity entity2) {
        return (int)(entity.e - entity2.e);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Entity)object, (Entity)object2);
    }
}

