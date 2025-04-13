/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;

/*
 * Renamed from avx
 */
public final class avx_2
extends aui_2 {
    public final avy_2 i = new avy_2();

    public avx_2() {
        this.b = (Matrix44)Matrix44.a.c();
        this.c = (Matrix44)Matrix44.a.c();
        this.b.b();
        this.c.b();
    }

    @Override
    public auj_1 a() {
        return auj_1.a;
    }

    @Override
    public ays_2 a(long l, String string, boolean bl) {
        return new avz_2(l, string, bl);
    }

    @Override
    public ays_2 a(long l, azk_2 azk_22, boolean bl) {
        return new avz_2(l, azk_22, bl);
    }

    @Override
    public ays_2 a(long l, int n, int n2, boolean bl) {
        return new avz_2(l, n, n2, false);
    }

    @Override
    public void a(Matrix44 matrix44) {
        if (!this.b.d(matrix44)) {
            this.b.a(matrix44);
            this.b();
        }
    }

    @Override
    public void b(Matrix44 matrix44) {
        if (!this.c.d(matrix44)) {
            this.c.a(matrix44);
            this.b();
        }
    }

    @Override
    public void a(ays_2 ays_22) {
        this.e = ays_22;
        if (ays_22 == null) {
            this.a.glBindFramebuffer(36160, 0);
        } else {
            avz_2 avz_22 = (avz_2)ays_22;
            this.a.glBindFramebuffer(36160, avz_22.b());
        }
    }

    @Override
    public void a(GL2 gL2) {
        super.a(gL2);
        this.i.a(gL2);
        int[] nArray = new int[1];
        gL2.glGetIntegerv(34018, nArray, 0);
        this.f = nArray[0];
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, int n) {
        axr_2.a().d(false);
        axr_2.a().a(this.a);
        this.a(Matrix44.b);
        this.b(Matrix44.b);
        this.a.glBegin(7);
        this.a.glColor4f(azj_2.f(n), azj_2.e(n), azj_2.d(n), azj_2.c(n));
        this.a.glVertex2f(f2, f3);
        this.a.glVertex2f(f2, f3 + f5);
        this.a.glVertex2f(f2 + f4, f3 + f5);
        this.a.glVertex2f(f2 + f4, f3);
        this.a.glEnd();
    }

    @Override
    public boolean f() {
        return axy_2.b.a(axx_2.a);
    }

    @Override
    public void b() {
        if (this.b.e() && this.c.e()) {
            this.d.b();
        } else {
            this.d.a(this.b, this.c);
        }
        axr_2.a().a(this.a, axp_2.c, this.d);
    }
}

