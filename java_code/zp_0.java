/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from Zp
 */
public class zp_0
implements zt_0 {
    @Override
    public void a(zo_0 zo_02, int n) {
        int n2 = zo_02.n();
        int n3 = zo_02.g();
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)zo_02.o().b(0);
        zo_02.b((int)zo_0.b(n2, 60.0f, 60.0f, n3));
        zo_02.a(-gLGeometrySprite.p() / 2);
        zo_02.s();
        float f2 = (float)n3 * 0.8f;
        float f3 = Hw.b(zo_0.b(Math.min((float)n2, f2), 20.0f, -20.1f, f2), 0.0f, 1.0f);
        zo_02.o().a(1.0f, 1.0f, 1.0f, f3);
    }
}

