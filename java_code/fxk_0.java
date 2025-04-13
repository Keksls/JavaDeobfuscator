/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Insets;

/*
 * Renamed from fxk
 */
public final class fxk_0 {
    private azj_2 b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h = false;
    private EntitySprite i;

    public int a() {
        return this.c;
    }

    public void a(int n) {
        this.c = n;
    }

    public int b() {
        return this.d;
    }

    public void b(int n) {
        this.d = n;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public void a(int n, int n2) {
        this.e = n;
        this.f = n2;
    }

    public void a(azj_2 azj_22) {
        if (azj_22 == this.b) {
            return;
        }
        if (azj_22 != null) {
            this.i.a(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        } else {
            this.i.a(1.0f, 1.0f, 1.0f, 1.0f);
        }
        this.b = azj_22;
    }

    public azj_2 e() {
        return this.b;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public void a(ayz_2 ayz_22, Insets insets, Insets insets2, Insets insets3) {
        if (this.i == null) {
            return;
        }
        if (ayz_22 == null || !ayz_22.g()) {
            this.i.b(false);
            return;
        }
        int n = insets2.right + insets3.left + insets3.right;
        int n2 = insets.left + insets2.left + insets3.left;
        int n3 = insets.top + insets.bottom + insets2.top;
        int n4 = insets.bottom + insets2.bottom + insets3.bottom;
        int n5 = this.e - (n2 + n);
        int n6 = this.f - (n3 + n4);
        int n7 = ayz_22.m();
        int n8 = ayz_22.n();
        if (n6 == 0 || n8 == 0) {
            this.i.b(false);
            return;
        }
        float f2 = (float)n5 / (float)n6;
        float f3 = (float)n7 / (float)n8;
        if (!this.h || Hw.c(f2, f3, 0.01f)) {
            this.i.a((float)(this.f - n3), (float)n2, n5, n6);
        } else if (f2 > f3) {
            float f4 = (float)n6 * f3;
            float f5 = ((float)n5 - f4) / 2.0f;
            this.i.a((float)(this.f - n3), (float)n2 + f5, Math.round(f4), n6);
        } else {
            float f6 = (float)n5 / f3;
            float f7 = ((float)n6 - f6) / 2.0f;
            this.i.a((float)(this.f - n3) - f7, (float)n2, n5, Math.round(f6));
        }
        this.i.b(true);
        if (this.b != null) {
            this.i.a(this.b);
        } else {
            this.i.a(1.0f, 1.0f, 1.0f, 1.0f);
        }
        this.i.a(ayz_22.h());
        this.i.D().a(0, -this.e / 2, -this.f / 2);
        this.i.D().a(1, this.e / 2, this.f / 2);
        this.a(ayz_22);
    }

    private void a(ayz_2 ayz_22) {
        float f2 = this.g ? ayz_22.i() : ayz_22.j();
        float f3 = this.g ? ayz_22.j() : ayz_22.i();
        float f4 = ayz_22.k();
        float f5 = ayz_22.l();
        this.i.c().a(f2, f4, f3, f5, avg_1.a);
    }

    public void f() {
        this.b = null;
        this.i.u();
        this.i = null;
    }

    public void g() {
        assert (this.i == null);
        this.i = (EntitySprite)EntitySprite.a.d();
        this.i.p = this;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.j.d();
        this.i.a(geometrySprite);
        geometrySprite.u();
        BatchTransformer batchTransformer = this.i.D();
        batchTransformer.a(new ayx_2());
        batchTransformer.a(new ayx_2());
    }

    public Entity h() {
        return this.i;
    }

    public void b(boolean bl) {
        this.h = bl;
    }
}

