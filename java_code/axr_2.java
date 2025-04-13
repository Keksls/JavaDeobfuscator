/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

/*
 * Renamed from axr
 */
public final class axr_2 {
    private static final axr_2 a = new axr_2();
    private final int[] b;
    private final short[] c;
    private final float[] d;
    private final boolean[] e;
    private final int[] f;
    private final short[] g;
    private final float[] h;
    private final boolean[] i;
    private avz_2 j;
    private final aad_2 k = new aad_2(0, 0, 0, 0);
    private final Matrix44[] l = new Matrix44[axp_2.values().length];
    private boolean m;
    private final float[] n = new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    private final float[] o = new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN};

    private axr_2() {
        axs_2[] axs_2Array = axs_2.values();
        int n = axs_2Array.length;
        this.f = new int[n];
        this.h = new float[n];
        this.g = new short[n];
        this.i = new boolean[n];
        this.b = new int[n];
        this.d = new float[n];
        this.c = new short[n];
        this.e = new boolean[n];
        for (axs_2 axs_22 : axs_2Array) {
            this.f[axs_22.ordinal()] = 0;
            this.h[axs_22.ordinal()] = 0.0f;
            this.g[axs_22.ordinal()] = 0;
            this.i[axs_22.ordinal()] = false;
        }
        for (int k = 0; k < this.l.length; ++k) {
            this.l[k] = (Matrix44)Matrix44.a.c();
        }
        this.m = false;
    }

    public static axr_2 a() {
        return a;
    }

    public void b() {
        this.a(true);
        this.a(axn_2.b, axn_2.a);
        this.a(1.0f);
        this.b(false);
        this.b(1.0f);
        this.c(false);
        this.c(1.0f);
        this.a(1);
        this.a((short)0);
        this.e(false);
        this.a(0, 0, 0, 0);
        this.d(true);
        this.a(axw_2.b);
        this.g(false);
    }

    private void a(int n, boolean bl) {
        this.a(n, bl ? 1 : 0);
    }

    private void a(int n, int n2) {
        if (this.f[n] == n2) {
            return;
        }
        if (this.m) {
            this.e[n] = n2 == this.b[n];
        }
        this.f[n] = n2;
        this.i[n] = false;
    }

    private void a(int n, short s2) {
        if (this.g[n] == s2) {
            return;
        }
        if (this.m) {
            this.e[n] = s2 == this.c[n];
        }
        this.g[n] = s2;
        this.i[n] = false;
    }

    private void a(int n, float f2) {
        if (this.h[n] == f2) {
            return;
        }
        if (this.m) {
            this.e[n] = f2 == this.d[n];
        }
        this.h[n] = f2;
        this.i[n] = false;
    }

    public void a(boolean bl) {
        this.a(axs_2.a.ordinal(), bl);
    }

    public void a(axn_2 axn_22, axn_2 axn_23) {
        this.a(axs_2.b.ordinal(), axn_22.l);
        this.a(axs_2.c.ordinal(), axn_23.l);
    }

    public void b(boolean bl) {
        this.a(axs_2.e.ordinal(), bl);
    }

    public void c(boolean bl) {
        this.a(axs_2.h.ordinal(), bl);
    }

    public void a(axw_2 axw_22) {
        this.a(axs_2.r.ordinal(), axw_22.f);
    }

    public void d(boolean bl) {
        this.a(bl, null);
    }

    private void a(boolean bl, avz_2 avz_22) {
        this.a(axs_2.s.ordinal(), bl ? 1 : 0);
        this.j = avz_22;
    }

    public void e(boolean bl) {
        this.a(axs_2.m.ordinal(), bl);
    }

    public void f(boolean bl) {
        this.a(axs_2.i.ordinal(), bl);
    }

    public void g(boolean bl) {
        this.a(axs_2.t.ordinal(), bl);
    }

    public void h(boolean bl) {
        this.a(axs_2.u.ordinal(), bl);
    }

    public void a(int n, int n2, int n3, int n4) {
        this.a(axs_2.n.ordinal(), n);
        this.a(axs_2.o.ordinal(), n2);
        this.a(axs_2.p.ordinal(), n3);
        this.a(axs_2.q.ordinal(), n4);
    }

    public void a(float f2) {
        this.a(axs_2.d.ordinal(), f2);
    }

    public void b(float f2) {
        this.a(axs_2.f.ordinal(), f2);
    }

    public void c(float f2) {
        this.a(axs_2.g.ordinal(), f2);
    }

    public void a(int n) {
        this.a(axs_2.j.ordinal(), n);
    }

    public void a(short s2) {
        this.a(axs_2.k.ordinal(), s2);
    }

    public void a(GL2 gL2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12 = axs_2.s.ordinal();
        if (!this.i[n12]) {
            this.i[n12] = true;
            if (this.f[n12] == 1) {
                gL2.glEnable(3553);
            } else {
                gL2.glDisable(3553);
            }
        }
        if (!this.i[n11 = axs_2.r.ordinal()]) {
            this.i[n11] = true;
            gL2.glTexEnvi(8960, 8704, this.f[n11]);
        }
        if (!this.i[n10 = axs_2.a.ordinal()]) {
            this.i[n10] = true;
            if (this.f[n10] == 1) {
                gL2.glEnable(3042);
            } else {
                gL2.glDisable(3042);
            }
        }
        int n13 = axs_2.b.ordinal();
        int n14 = axs_2.c.ordinal();
        if (!this.i[n13] || !this.i[n14]) {
            this.i[n13] = true;
            this.i[n14] = true;
            gL2.glBlendFunc(this.f[n13], this.f[n14]);
        }
        if (!this.i[n9 = axs_2.e.ordinal()]) {
            this.i[n9] = true;
            if (this.f[n9] == 1) {
                gL2.glEnable(2832);
            } else {
                gL2.glDisable(2832);
            }
        }
        if (!this.i[n8 = axs_2.h.ordinal()]) {
            this.i[n8] = true;
            if (this.f[n8] == 1) {
                gL2.glEnable(2848);
            } else {
                gL2.glDisable(2848);
            }
        }
        if (!this.i[n7 = axs_2.d.ordinal()]) {
            this.i[n7] = true;
            this.a((GL)gL2, 0);
            gL2.glTexEnvf(8960, 8704, 34160.0f);
            gL2.glTexEnvf(8960, 34161, 8448.0f);
            gL2.glTexEnvf(8960, 34176, 5890.0f);
            gL2.glTexEnvf(8960, 34163, this.h[n7]);
        }
        if (!this.i[n6 = axs_2.f.ordinal()]) {
            this.i[n6] = true;
            gL2.glPointSize(this.h[n6]);
        }
        if (!this.i[n5 = axs_2.g.ordinal()]) {
            this.i[n5] = true;
            gL2.glLineWidth(this.h[n5]);
        }
        if (!this.i[n4 = axs_2.i.ordinal()]) {
            this.i[n4] = true;
            if (this.f[n4] == 1) {
                gL2.glEnable(2852);
            } else {
                gL2.glDisable(2852);
            }
        }
        int n15 = axs_2.j.ordinal();
        int n16 = axs_2.k.ordinal();
        if (!this.i[n15] || !this.i[n16]) {
            this.i[n15] = true;
            this.i[n16] = true;
            gL2.glLineStipple(this.f[n15], this.g[n16]);
        }
        if (!this.i[n3 = axs_2.m.ordinal()]) {
            this.i[n3] = true;
            if (this.f[n3] == 1) {
                gL2.glEnable(3089);
            } else {
                gL2.glDisable(3089);
            }
        }
        int n17 = axs_2.n.ordinal();
        int n18 = axs_2.o.ordinal();
        int n19 = axs_2.p.ordinal();
        int n20 = axs_2.q.ordinal();
        if (!(this.i[n17] && this.i[n18] && this.i[n19] && this.i[n20])) {
            this.i[n17] = true;
            this.i[n18] = true;
            this.i[n19] = true;
            this.i[n20] = true;
            gL2.glScissor(this.f[n17], this.f[n18], this.f[n19], this.f[n20]);
        }
        if (!this.i[n2 = axs_2.t.ordinal()]) {
            this.i[n2] = true;
            if (this.f[n2] == 1) {
                gL2.glEnable(2929);
            } else {
                gL2.glDisable(2929);
            }
        }
        if (!this.i[n = axs_2.u.ordinal()]) {
            this.i[n] = true;
            gL2.glDepthMask(this.f[n] == 1);
        }
    }

    public void a(GL gL, int n) {
        int n2 = axs_2.v.ordinal();
        if (this.f[n2] == n) {
            return;
        }
        this.f[n2] = n;
        gL.glActiveTexture(33984 + n);
    }

    public void a(GL2 gL2, int n) {
        int n2 = axs_2.w.ordinal();
        if (this.f[n2] == n) {
            return;
        }
        this.f[n2] = n;
        gL2.glClientActiveTexture(33984 + n);
    }

    public void a(GL2 gL2, axp_2 axp_22) {
        int n = axs_2.l.ordinal();
        int n2 = axp_22.d;
        this.l[axp_22.ordinal()].b(0.0f, 0.0f, 0.0f);
        if (this.f[n] == n2) {
            return;
        }
        this.f[n] = n2;
        gL2.glMatrixMode(n2);
    }

    public void a(GL2 gL2, axp_2 axp_22, Matrix44 matrix44) {
        Matrix44 matrix442;
        int n;
        int n2 = axs_2.l.ordinal();
        if (this.f[n2] != (n = axp_22.d)) {
            this.f[n2] = n;
            gL2.glMatrixMode(n);
        }
        if (!(matrix442 = this.l[axp_22.ordinal()]).d(matrix44)) {
            matrix442.a(matrix44);
            if (matrix44.e()) {
                gL2.glLoadIdentity();
            } else {
                gL2.glLoadMatrixf(matrix44.c(), 0);
            }
        }
    }

    public void a(GL gL, avz_2 avz_22) {
        if (this.j == avz_22) {
            return;
        }
        if (avz_22 == null) {
            this.a(false, avz_22);
        } else {
            this.a(true, avz_22);
            this.a(avz_22.l());
            this.j.c(gL);
        }
    }

    public void c() {
        this.m = true;
        System.arraycopy(this.f, 0, this.b, 0, this.f.length);
        System.arraycopy(this.h, 0, this.d, 0, this.h.length);
        System.arraycopy(this.g, 0, this.c, 0, this.g.length);
        System.arraycopy(this.i, 0, this.e, 0, this.i.length);
    }

    public void d() {
        if (this.m) {
            System.arraycopy(this.b, 0, this.f, 0, this.f.length);
            System.arraycopy(this.d, 0, this.h, 0, this.h.length);
            System.arraycopy(this.c, 0, this.g, 0, this.g.length);
            System.arraycopy(this.e, 0, this.i, 0, this.i.length);
            this.m = false;
        }
    }

    public void e() {
        this.a(false, null);
    }

    public aad_2 f() {
        return this.k.g();
    }

    public void g() {
        this.k.a(0, 0, 0, 0);
    }

    public void a(GL gL, int n, int n2, int n3, int n4) {
        if (this.k.b(n, n2, n3, n4)) {
            return;
        }
        gL.glViewport(n, n2, n3, n4);
        this.k.a(n, n2, n3, n4);
    }

    public void a(GL2 gL2, aad_2 aad_22) {
        this.a((GL)gL2, aad_22.a(), aad_22.b(), aad_22.c(), aad_22.d());
        this.a(gL2, axp_2.a);
        gL2.glLoadIdentity();
        float f2 = aad_22.e();
        float f3 = aad_22.f();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < 1.0f) {
            f3 = 1.0f;
        }
        gL2.glOrtho((double)(-f2), (double)f2, (double)(-f3), (double)f3, 0.0, 65535.0);
    }

    public void a(GL2 gL2, Material material) {
        if (!material.b(this.n)) {
            material.c(this.n);
            gL2.glMaterialfv(1032, 4609, this.n, 0);
        }
        if (!material.g(this.o)) {
            material.h(this.o);
            gL2.glMaterialfv(1032, 4610, this.o, 0);
        }
    }
}

