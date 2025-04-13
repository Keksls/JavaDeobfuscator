/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.Arrays;

/*
 * Renamed from fBT
 */
public abstract class fbt_2
extends fbq_2 {
    protected azj_2 a = null;
    protected ayo_2[] b;
    protected Entity3D c;
    private auw_2 e;

    @Override
    public abstract void a(Dimension var1, Insets var2, Insets var3, Insets var4);

    @Override
    public final Entity g() {
        return this.c;
    }

    public azj_2 a() {
        return this.a;
    }

    public void a(azj_2 azj_22) {
        if (this.a == azj_22) {
            return;
        }
        this.a = azj_22;
        if (this.a != null) {
            this.c.a(azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
        } else {
            this.c.a(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public void h() {
        if (this.b != null) {
            Arrays.fill(this.b, null);
        }
        this.c.u();
        this.c = null;
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        this.a = null;
    }

    @Override
    public void i() {
        assert (this.c == null) : "Object already checked out";
        this.c = (Entity3D)Entity3D.c.d();
    }

    protected final void a(int n, int n2, int n3, int n4, ayo_2 ayo_22, float f2, float f3, float f4, float f5) {
        if (n3 == 0 || n4 == 0 || ayo_22 == null || ayo_22.a() == null) {
            return;
        }
        this.e.a(n, n2, n3, n4, ayo_22, f2, f3, f4, f5, this.a);
    }

    protected final void a(int n, int n2, int n3, int n4, ayo_2 ayo_22) {
        if (n3 == 0 || n4 == 0 || ayo_22 == null || ayo_22.a() == null || ayo_22.e() == 0 || ayo_22.d() == 0) {
            return;
        }
        this.e.a(n, n2, n3, n4, ayo_22, this.a);
    }

    protected final void a(int n) {
        if (this.e == null) {
            this.e = new auw_2();
        }
        this.e.a(this.c, n);
    }

    protected final void b() {
        this.e.b();
    }
}

