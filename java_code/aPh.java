/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import org.apache.log4j.Logger;

public class aPh {
    private static final Logger c = Logger.getLogger(aPh.class);
    public static final float a = 4.0f;
    public static final float b = 4.0f;
    private static final aPi d = new aPi();
    private static final aPi e = new aPi();

    public static void a(String string, String string2) {
        d.a(string);
        e.a(string2);
    }

    public static void a(EntityGroup entityGroup, int n, int n2, int n3, float f2, afe_1 afe_12) {
        ays_2 ays_22 = d.a(n);
        float f3 = aPh.b(n2, n3);
        float f4 = aPh.a(n2, n3);
        f4 -= ans_0.D().c().x() / 4.0f;
        try {
            aPh.a(entityGroup, ays_22, f3, f4, f2, afe_12);
        }
        catch (NullPointerException nullPointerException) {
            c.error((Object)("probl\u00e8me avec le patch " + n), (Throwable)nullPointerException);
        }
    }

    static void b(EntityGroup entityGroup, int n, int n2, int n3, float f2, afe_1 afe_12) {
        ays_2 ays_22 = e.a(n);
        float f3 = (float)n2 / 9.0f;
        float f4 = (float)n3 / 9.0f;
        float f5 = aPh.b(f3, f4);
        float f6 = aPh.a(f3, f4);
        try {
            aPh.a(entityGroup, ays_22, f5, f6, f2, afe_12);
        }
        catch (NullPointerException nullPointerException) {
            c.error((Object)("probl\u00e8me avec le building " + n), (Throwable)nullPointerException);
        }
    }

    private static float a(float f2, float f3) {
        return (f2 - f3) * aPh.a();
    }

    private static float b(float f2, float f3) {
        return -(f2 + f3) * aPh.b() + ans_0.D().c().x() * 0.5f;
    }

    private static void a(EntityGroup entityGroup, ays_2 ays_22, float f2, float f3, float f4, afe_1 afe_12) {
        if (ays_22 == null || afe_12 == null) {
            throw new NullPointerException();
        }
        ace_0 ace_02 = ans_0.D().c();
        f3 += ace_02.c(entityGroup.f, entityGroup.g);
        f2 += ace_02.d(entityGroup.f, entityGroup.g) + f4;
        afe_1 afe_13 = ays_22.w();
        EntitySprite entitySprite = aPh.a(ays_22);
        entitySprite.a(f2 += (float)afe_12.b() / 4.0f / 9.0f, f3 += (float)afe_12.a() / 4.0f / 9.0f, afe_13.a() + 1, afe_13.b() + 1);
        entitySprite.l = Hw.c(f3);
        entitySprite.n = Hw.c(f2);
        entitySprite.m = Hw.d(f3 + (float)afe_13.a());
        entitySprite.o = Hw.d(f2 - (float)afe_13.b());
        entityGroup.a(entitySprite);
        entitySprite.u();
    }

    private static EntitySprite a(ays_2 ays_22) {
        afe_1 afe_12 = ays_22.w();
        afe_1 afe_13 = ays_22.x();
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.j.d();
        gLGeometrySprite.a(axn_2.b, axn_2.f);
        gLGeometrySprite.a(0.0f, 0.0f, afe_12.a(), afe_12.b());
        gLGeometrySprite.b(0.0f, 0.0f, (float)afe_12.b() / (float)afe_13.b(), (float)afe_12.a() / (float)afe_13.a());
        EntitySprite entitySprite = (EntitySprite)EntitySprite.a.d();
        entitySprite.a(gLGeometrySprite);
        entitySprite.a(ays_22);
        entitySprite.Q();
        entitySprite.a(0.5f, 0.5f, 0.5f, 1.0f);
        gLGeometrySprite.u();
        return entitySprite;
    }

    private static float a() {
        ace_0 ace_02 = ans_0.D().c();
        return 0.5f * ace_02.w() / 4.0f;
    }

    private static float b() {
        ace_0 ace_02 = ans_0.D().c();
        return 0.5f * ace_02.x() / 4.0f;
    }
}

