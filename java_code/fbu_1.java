/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fBU
 */
public abstract class fbu_1
extends fbr_2 {
    protected azj_2 b = null;
    protected ayo_2[] c;
    protected boolean d = false;
    protected Entity3D e;
    private auw_2 g;

    @Override
    public abstract void a(Dimension var1, Insets var2, Insets var3, Insets var4);

    @Override
    public final Entity g() {
        return this.e;
    }

    public azj_2 b() {
        return this.b;
    }

    public void a(azj_2 azj_22) {
        if (this.b == azj_22) {
            return;
        }
        this.b = azj_22;
        if (this.b != null) {
            this.e.a(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        } else {
            this.e.a(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public void h() {
        this.e.u();
        this.e = null;
        this.b = null;
        if (this.g != null) {
            this.g.a();
            this.g = null;
        }
    }

    @Override
    public void i() {
        assert (this.e == null);
        this.e = (Entity3D)Entity3D.c.d();
    }

    protected final void a(int n, int n2, int n3, int n4, ayo_2 ayo_22) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        this.g.a(n, n2, n3, n4, ayo_22, this.b);
    }

    protected final void a(int n) {
        if (this.g == null) {
            this.g = new auw_2();
        }
        this.g.a(this.e, n);
    }

    protected final void c() {
        this.g.b();
    }
}

