/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;

/*
 * Renamed from adp
 */
public class adp_0
extends adn_0 {
    private EntitySprite a;
    private float f;
    private float g;
    private float h;
    private float i;
    private final Matrix44 j = (Matrix44)Matrix44.a.c();
    private final Matrix44 k = (Matrix44)Matrix44.a.c();
    private final Matrix44 l = (Matrix44)Matrix44.a.c();

    public adp_0() {
        this.a = (EntitySprite)EntitySprite.a.d();
        this.a.p = this;
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.j.d();
        this.a.a(gLGeometrySprite);
        this.a.a(1.0f, 1.0f, 1.0f, 1.0f);
        this.a.a(1.0f, -1.0f, 2, 2);
        this.a.b(0.0f, 0.0f, 1.0f, 1.0f);
        gLGeometrySprite.u();
    }

    @Override
    public void a() {
        this.a.u();
        this.a = null;
    }

    @Override
    public void a(int n) {
        super.a(n);
        float f2 = this.g();
        this.a.a(this.f * f2, this.g * f2, this.h * f2, this.i * f2);
    }

    @Override
    public void a(aui_2 aui_22) {
        GL2 gL2 = aui_22.e();
        axr_2 axr_22 = axr_2.a();
        this.k.a(aui_22.d());
        this.j.a(aui_22.c());
        gL2.glGetFloatv(2983, this.l.c(), 0);
        aui_22.a(Matrix44.b);
        aui_22.b(Matrix44.b);
        axr_22.a(gL2, axp_2.a, Matrix44.b);
        this.a.c(aui_22);
        aui_22.a(this.j);
        aui_22.b(this.k);
        axr_22.a(gL2, axp_2.a, this.l);
    }

    public void a(String string) {
        if (string != null) {
            String string2 = auc_1.a().c() + "textures/" + string;
            long l = 0xEE00EE0000000000L ^ (long)auc_1.d(string2);
            ays_2 ays_22 = ayu_2.a().a((aui_2)auj_1.a.a(), l, string2, false);
            this.a.a(ays_22);
        } else {
            this.a.a((ays_2)null);
        }
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = f5;
    }

    public void a(float f2, float f3) {
        this.a.E().a(f2, f3, 0.0f);
    }

    public void b(float f2, float f3) {
        this.a.E().b(f2, f3, 1.0f);
    }

    public void a(axn_2 axn_22, axn_2 axn_23) {
        this.a.c().a(axn_22, axn_23);
    }

    @Override
    public int j() {
        return 1;
    }
}

