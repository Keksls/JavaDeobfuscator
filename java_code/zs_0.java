/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from Zs
 */
public class zs_0
implements zt_0 {
    @Override
    public void a(zo_0 zo_02, int n) {
        int n2 = zo_02.n();
        int n3 = zo_02.g();
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)zo_02.o().b(0);
        zo_02.a(-gLGeometrySprite.p() / 2);
        zo_02.s();
        float f2 = 1.0f;
        if (n2 < n3 / 4) {
            f2 = zo_0.b(n2, -0.5f, 1.6f, n3 / 4);
        } else if (n2 > n3 * 3 / 4) {
            f2 = zo_0.b(n2 - n3 * 3 / 4, 1.5f, -1.6f, n3 / 4);
        }
        zo_02.o().a(1.0f, 1.0f, 1.0f, f2);
    }
}

