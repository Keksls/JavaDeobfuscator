/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.util.Comparator;

/*
 * Renamed from fwC
 */
public class fwc_0
implements Comparator<Entity> {
    public static final fwc_0 a = new fwc_0();

    public int a(Entity entity, Entity entity2) {
        if (entity instanceof XulorParticleSystem) {
            return -1;
        }
        if (entity2 instanceof XulorParticleSystem) {
            return 1;
        }
        float f2 = ((EntitySprite)entity).s();
        float f3 = ((EntitySprite)entity2).s();
        return (int)(f3 - f2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Entity)object, (Entity)object2);
    }
}

