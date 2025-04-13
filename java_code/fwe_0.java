/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

/*
 * Renamed from fwE
 */
public class fwe_0 {
    public static boolean a(EntitySprite entitySprite, int n, int n2) {
        return entitySprite.g() <= (float)n && entitySprite.h() >= (float)n && entitySprite.k() <= (float)n2 && entitySprite.j() >= (float)n2;
    }
}

