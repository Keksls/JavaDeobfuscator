/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

public abstract class ahq
extends ace_0 {
    protected final YK n;
    private float I;
    private float J;
    private float K;
    private boolean L;
    private final EntitySprite M;

    protected ahq(YK yK) {
        this.n = yK;
        this.I = 25.0f;
        this.J = 0.0f;
        this.K = 2.0f;
        this.L = false;
        this.M = (EntitySprite)EntitySprite.a.c();
        this.M.p = this;
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.j.c();
        this.M.a(gLGeometrySprite);
        gLGeometrySprite.u();
        this.M.a(0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable) {
        super.a(gLAutoDrawable);
        this.n.B();
    }

    @Override
    public void b(GL2 gL2) {
        if (!auy_2.a().b() && this.j) {
            gL2.glClearColor(this.i.q(), this.i.r(), this.i.s(), this.i.p());
            this.j = false;
        }
        if (this.J <= 0.0f) {
            super.b(gL2);
            return;
        }
        gL2.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        int n = (int)(this.J * this.E / 100.0f);
        super.b(gL2);
        avx_2 avx_22 = auj_1.a.a();
        ((aui_2)avx_22).b(Matrix44.b);
        this.M.a(-this.E / 2.0f + (float)(n / 2), -this.D / 2.0f, (int)this.D, n / 2);
        this.M.c(avx_22);
        this.M.a(this.E / 2.0f, -this.D / 2.0f, (int)this.D, n / 2);
        this.M.c(avx_22);
        gL2.glClearColor(this.i.q(), this.i.r(), this.i.s(), this.i.p());
    }

    @Override
    public void a(int n) {
        super.a(n);
        if (this.L) {
            this.J += this.I * this.K * (float)n / 1000.0f;
            if (this.J > this.I) {
                this.J = this.I;
            }
        } else if (this.J > 0.0f) {
            this.J -= this.I * this.K * (float)n / 1000.0f;
            if (this.J < 0.0f) {
                this.J = 0.0f;
            }
        }
    }

    public final void a(aoa_1 aoa_12) {
        abY abY2 = this.b();
        abY2.b(aoa_12.a(), aoa_12.b());
        abY2.b(abY2.f());
    }

    public void c(float f2) {
        this.I = f2;
    }

    public void d(float f2) {
        this.J = f2;
    }

    public void e(float f2) {
        this.K = f2;
    }

    public void h(boolean bl) {
        this.L = bl;
    }

    @Override
    public void g() {
        super.g();
        this.M.u();
    }
}

