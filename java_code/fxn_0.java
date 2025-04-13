/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import java.util.ArrayList;

/*
 * Renamed from fxn
 */
class fxn_0
extends ArrayList<EntitySprite> {
    fxn_0() {
    }

    @Override
    public void clear() {
        for (EntitySprite entitySprite : this) {
            entitySprite.u();
        }
        super.clear();
    }

    public void a(float f2) {
        for (EntitySprite entitySprite : this) {
            entitySprite.a(f2, f2, f2, f2);
        }
    }
}

