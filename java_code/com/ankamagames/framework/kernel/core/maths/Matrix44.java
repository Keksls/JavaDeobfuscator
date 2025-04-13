/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.framework.kernel.core.maths;

import com.ankamagames.framework.kernel.core.maths.Matrix44$ObjectFactory;
import org.apache.log4j.Logger;

public final class Matrix44
extends abh_1 {
    public static final Matrix44$ObjectFactory a = new Matrix44$ObjectFactory();
    private static final Logger d = Logger.getLogger(Matrix44.class);
    private static final float[] e = new float[16];
    public static final Matrix44 b = Matrix44.a();
    private final float[] f = new float[16];
    private boolean g;

    Matrix44() {
    }

    public Matrix44(Matrix44 matrix44) {
        this.a(matrix44);
    }

    public Matrix44(float[] fArray) {
        this.a(fArray);
    }

    public Matrix44(afj_1 afj_12) {
        this.a(afj_12);
    }

    public Matrix44(afj_1 afj_12, aft_2 aft_22) {
        this.a(afj_12, aft_22);
    }

    public Matrix44(aft_2 aft_22, aft_2 aft_23, aft_2 aft_24, aft_2 aft_25) {
        this.a(aft_22, aft_23, aft_24, aft_25);
    }

    public static Matrix44 a() {
        Matrix44 matrix44 = new Matrix44();
        matrix44.b();
        return matrix44;
    }

    public void a(arf_1 arf_12) {
        for (int k = 0; k < this.f.length; ++k) {
            this.f[k] = arf_12.d();
        }
        this.g = false;
    }

    public void a(gk_0 gk_02) {
        for (int k = 0; k < this.f.length; ++k) {
            gk_02.a(this.f[k]);
        }
    }

    public void a(Matrix44 matrix44) {
        this.g = matrix44.g;
        System.arraycopy(matrix44.f, 0, this.f, 0, this.f.length);
    }

    public void a(float[] fArray) {
        assert (fArray.length >= 16) : "Buffer length must be at least of 16 float";
        System.arraycopy(fArray, 0, this.f, 0, 16);
        this.g = false;
    }

    public void a(afj_1 afj_12) {
        float f2 = afj_12.a();
        float f3 = afj_12.b();
        float f4 = afj_12.c();
        float f5 = afj_12.d();
        float f6 = f2 + f2;
        float f7 = f3 + f3;
        float f8 = f4 + f4;
        float f9 = f2 * f6;
        float f10 = f2 * f7;
        float f11 = f2 * f8;
        float f12 = f3 * f7;
        float f13 = f3 * f8;
        float f14 = f4 * f8;
        float f15 = f5 * f6;
        float f16 = f5 * f7;
        float f17 = f5 * f8;
        this.f[0] = 1.0f - (f12 + f14);
        this.f[1] = f10 + f17;
        this.f[2] = f11 - f16;
        this.f[3] = 0.0f;
        this.f[4] = f10 - f17;
        this.f[5] = 1.0f - (f9 + f14);
        this.f[6] = f13 + f15;
        this.f[7] = 0.0f;
        this.f[8] = f11 + f16;
        this.f[9] = f13 - f15;
        this.f[10] = 1.0f - (f9 + f12);
        this.f[11] = 0.0f;
        this.f[12] = 0.0f;
        this.f[13] = 0.0f;
        this.f[14] = 0.0f;
        this.f[15] = 1.0f;
        this.g = false;
    }

    public void a(afj_1 afj_12, aft_2 aft_22) {
        this.a(afj_12);
        this.d(aft_22);
        this.f();
        this.g = false;
    }

    public void a(afj_1 afj_12, aft_2 aft_22, aft_2 aft_23) {
        this.a(afj_12);
        this.d(aft_22);
        this.f();
        float f2 = aft_23.a();
        float f3 = aft_23.b();
        float f4 = aft_23.c();
        if (f2 != 1.0f || f3 != 1.0f || f4 != 1.0f) {
            this.f[0] = this.f[0] * f2;
            this.f[1] = this.f[1] * f2;
            this.f[2] = this.f[2] * f2;
            this.f[4] = this.f[4] * f3;
            this.f[5] = this.f[5] * f3;
            this.f[6] = this.f[6] * f3;
            this.f[8] = this.f[8] * f4;
            this.f[9] = this.f[9] * f4;
            this.f[10] = this.f[10] * f4;
        }
        this.g = false;
    }

    public void a(aft_2 aft_22, aft_2 aft_23, aft_2 aft_24, aft_2 aft_25) {
        this.a(aft_22);
        this.b(aft_23);
        this.c(aft_24);
        this.d(aft_25);
        this.g = false;
    }

    public void a(aft_2 aft_22) {
        this.f[0] = aft_22.a();
        this.f[1] = aft_22.b();
        this.f[2] = aft_22.c();
        this.g = false;
    }

    public void b(aft_2 aft_22) {
        this.f[4] = aft_22.a();
        this.f[5] = aft_22.b();
        this.f[6] = aft_22.c();
        this.g = false;
    }

    public void c(aft_2 aft_22) {
        this.f[8] = aft_22.a();
        this.f[9] = aft_22.b();
        this.f[10] = aft_22.c();
        this.g = false;
    }

    public void d(aft_2 aft_22) {
        this.f[12] = aft_22.a();
        this.f[13] = aft_22.b();
        this.f[14] = aft_22.c();
        this.g = false;
    }

    public void a(float f2, float f3, float f4) {
        this.f[12] = f2;
        this.f[13] = f3;
        this.f[14] = f4;
        this.g = false;
    }

    public void e(aft_2 aft_22) {
        this.f[12] = this.f[12] + aft_22.a();
        this.f[13] = this.f[13] + aft_22.b();
        this.f[14] = this.f[14] + aft_22.c();
        this.g = false;
    }

    public void b(float f2, float f3, float f4) {
        this.f();
        if (f2 == 1.0f && f3 == 1.0f && f4 == 1.0f) {
            return;
        }
        this.f[0] = this.f[0] * f2;
        this.f[1] = this.f[1] * f2;
        this.f[2] = this.f[2] * f2;
        this.f[4] = this.f[4] * f3;
        this.f[5] = this.f[5] * f3;
        this.f[6] = this.f[6] * f3;
        this.f[8] = this.f[8] * f4;
        this.f[9] = this.f[9] * f4;
        this.f[10] = this.f[10] * f4;
    }

    public void f(aft_2 aft_22) {
        this.b(aft_22.a(), aft_22.b(), aft_22.c());
    }

    public void b() {
        try {
            System.arraycopy(e, 0, this.f, 0, 16);
        }
        catch (Exception exception) {
            d.error((Object)"Exception during setIdentity", (Throwable)exception);
        }
        this.f[15] = 1.0f;
        this.f[10] = 1.0f;
        this.f[5] = 1.0f;
        this.f[0] = 1.0f;
        this.g = true;
    }

    public void a(aft_2 aft_22, aft_2 aft_23) {
        float f2 = aft_22.a();
        float f3 = aft_22.b();
        float f4 = aft_22.c();
        aft_23.a(f2 * this.f[0] + f3 * this.f[4] + f4 * this.f[8], f2 * this.f[1] + f3 * this.f[5] + f4 * this.f[9], f2 * this.f[2] + f3 * this.f[6] + f4 * this.f[10], 0.0f);
    }

    public void b(aft_2 aft_22, aft_2 aft_23) {
        float f2 = aft_22.a();
        float f3 = aft_22.b();
        float f4 = aft_22.c();
        float f5 = aft_22.d();
        aft_23.a(f2 * this.f[0] + f3 * this.f[4] + f4 * this.f[8] + f5 * this.f[12], f2 * this.f[1] + f3 * this.f[5] + f4 * this.f[9] + f5 * this.f[13], f2 * this.f[2] + f3 * this.f[6] + f4 * this.f[10] + f5 * this.f[14], f2 * this.f[3] + f3 * this.f[7] + f4 * this.f[11] + f5 * this.f[15]);
    }

    public void a(float f2) {
        this.g = false;
        this.f[0] = this.f[0] * f2;
        this.f[1] = this.f[1] * f2;
        this.f[2] = this.f[2] * f2;
        this.f[3] = this.f[3] * f2;
        this.f[4] = this.f[4] * f2;
        this.f[5] = this.f[5] * f2;
        this.f[6] = this.f[6] * f2;
        this.f[7] = this.f[7] * f2;
        this.f[8] = this.f[8] * f2;
        this.f[9] = this.f[9] * f2;
        this.f[10] = this.f[10] * f2;
        this.f[11] = this.f[11] * f2;
        this.f[12] = this.f[12] * f2;
        this.f[13] = this.f[13] * f2;
        this.f[14] = this.f[14] * f2;
        this.f[15] = this.f[15] * f2;
    }

    public void b(Matrix44 matrix44) {
        if (this.g) {
            matrix44.a(this);
        } else {
            matrix44.f[0] = this.f[0];
            matrix44.f[1] = this.f[4];
            matrix44.f[2] = this.f[8];
            matrix44.f[3] = this.f[12];
            matrix44.f[4] = this.f[1];
            matrix44.f[5] = this.f[5];
            matrix44.f[6] = this.f[9];
            matrix44.f[7] = this.f[13];
            matrix44.f[8] = this.f[2];
            matrix44.f[9] = this.f[6];
            matrix44.f[10] = this.f[10];
            matrix44.f[11] = this.f[14];
            matrix44.f[12] = this.f[3];
            matrix44.f[13] = this.f[7];
            matrix44.f[14] = this.f[11];
            matrix44.f[15] = this.f[15];
            matrix44.g = false;
        }
    }

    public void c(Matrix44 matrix44) {
        this.g = false;
        float f2 = this.f[0];
        float f3 = this.f[1];
        float f4 = this.f[2];
        float f5 = this.f[3];
        float f6 = this.f[4];
        float f7 = this.f[5];
        float f8 = this.f[6];
        float f9 = this.f[7];
        float f10 = this.f[8];
        float f11 = this.f[9];
        float f12 = this.f[10];
        float f13 = this.f[11];
        float f14 = this.f[12];
        float f15 = this.f[13];
        float f16 = this.f[14];
        float f17 = this.f[15];
        float f18 = matrix44.f[0];
        float f19 = matrix44.f[1];
        float f20 = matrix44.f[2];
        float f21 = matrix44.f[3];
        float f22 = matrix44.f[4];
        float f23 = matrix44.f[5];
        float f24 = matrix44.f[6];
        float f25 = matrix44.f[7];
        float f26 = matrix44.f[8];
        float f27 = matrix44.f[9];
        float f28 = matrix44.f[10];
        float f29 = matrix44.f[11];
        float f30 = matrix44.f[12];
        float f31 = matrix44.f[13];
        float f32 = matrix44.f[14];
        float f33 = matrix44.f[15];
        this.f[0] = f2 * f18 + f3 * f22 + f4 * f26 + f5 * f30;
        this.f[1] = f2 * f19 + f3 * f23 + f4 * f27 + f5 * f31;
        this.f[2] = f2 * f20 + f3 * f24 + f4 * f28 + f5 * f32;
        this.f[3] = f2 * f21 + f3 * f25 + f4 * f29 + f5 * f33;
        this.f[4] = f6 * f18 + f7 * f22 + f8 * f26 + f9 * f30;
        this.f[5] = f6 * f19 + f7 * f23 + f8 * f27 + f9 * f31;
        this.f[6] = f6 * f20 + f7 * f24 + f8 * f28 + f9 * f32;
        this.f[7] = f6 * f21 + f7 * f25 + f8 * f29 + f9 * f33;
        this.f[8] = f10 * f18 + f11 * f22 + f12 * f26 + f13 * f30;
        this.f[9] = f10 * f19 + f11 * f23 + f12 * f27 + f13 * f31;
        this.f[10] = f10 * f20 + f11 * f24 + f12 * f28 + f13 * f32;
        this.f[11] = f10 * f21 + f11 * f25 + f12 * f29 + f13 * f33;
        this.f[12] = f14 * f18 + f15 * f22 + f16 * f26 + f17 * f30;
        this.f[13] = f14 * f19 + f15 * f23 + f16 * f27 + f17 * f31;
        this.f[14] = f14 * f20 + f15 * f24 + f16 * f28 + f17 * f32;
        this.f[15] = f14 * f21 + f15 * f25 + f16 * f29 + f17 * f33;
    }

    public void a(Matrix44 matrix44, Matrix44 matrix442) {
        this.g = false;
        float f2 = matrix44.f[0];
        float f3 = matrix44.f[1];
        float f4 = matrix44.f[2];
        float f5 = matrix44.f[3];
        float f6 = matrix44.f[4];
        float f7 = matrix44.f[5];
        float f8 = matrix44.f[6];
        float f9 = matrix44.f[7];
        float f10 = matrix44.f[8];
        float f11 = matrix44.f[9];
        float f12 = matrix44.f[10];
        float f13 = matrix44.f[11];
        float f14 = matrix44.f[12];
        float f15 = matrix44.f[13];
        float f16 = matrix44.f[14];
        float f17 = matrix44.f[15];
        float f18 = matrix442.f[0];
        float f19 = matrix442.f[1];
        float f20 = matrix442.f[2];
        float f21 = matrix442.f[3];
        float f22 = matrix442.f[4];
        float f23 = matrix442.f[5];
        float f24 = matrix442.f[6];
        float f25 = matrix442.f[7];
        float f26 = matrix442.f[8];
        float f27 = matrix442.f[9];
        float f28 = matrix442.f[10];
        float f29 = matrix442.f[11];
        float f30 = matrix442.f[12];
        float f31 = matrix442.f[13];
        float f32 = matrix442.f[14];
        float f33 = matrix442.f[15];
        this.f[0] = f2 * f18 + f3 * f22 + f4 * f26 + f5 * f30;
        this.f[1] = f2 * f19 + f3 * f23 + f4 * f27 + f5 * f31;
        this.f[2] = f2 * f20 + f3 * f24 + f4 * f28 + f5 * f32;
        this.f[3] = f2 * f21 + f3 * f25 + f4 * f29 + f5 * f33;
        this.f[4] = f6 * f18 + f7 * f22 + f8 * f26 + f9 * f30;
        this.f[5] = f6 * f19 + f7 * f23 + f8 * f27 + f9 * f31;
        this.f[6] = f6 * f20 + f7 * f24 + f8 * f28 + f9 * f32;
        this.f[7] = f6 * f21 + f7 * f25 + f8 * f29 + f9 * f33;
        this.f[8] = f10 * f18 + f11 * f22 + f12 * f26 + f13 * f30;
        this.f[9] = f10 * f19 + f11 * f23 + f12 * f27 + f13 * f31;
        this.f[10] = f10 * f20 + f11 * f24 + f12 * f28 + f13 * f32;
        this.f[11] = f10 * f21 + f11 * f25 + f12 * f29 + f13 * f33;
        this.f[12] = f14 * f18 + f15 * f22 + f16 * f26 + f17 * f30;
        this.f[13] = f14 * f19 + f15 * f23 + f16 * f27 + f17 * f31;
        this.f[14] = f14 * f20 + f15 * f24 + f16 * f28 + f17 * f32;
        this.f[15] = f14 * f21 + f15 * f25 + f16 * f29 + f17 * f33;
    }

    public void a(Matrix44 matrix44, Matrix44 matrix442, Matrix44 matrix443) {
        Matrix44 matrix444 = new Matrix44();
        matrix444.a(matrix442, matrix443);
        this.a(matrix44, matrix444);
        this.g = false;
    }

    public void a(Matrix44 matrix44, Matrix44 matrix442, Matrix44 matrix443, Matrix44 matrix444) {
        Matrix44 matrix445 = new Matrix44();
        matrix445.a(matrix442, matrix443, matrix444);
        this.a(matrix44, matrix445);
        this.g = false;
    }

    public float[] c() {
        return this.f;
    }

    public void a(int n, float f2) {
        this.g = false;
        this.f[n] = f2;
    }

    public boolean e() {
        return this.g;
    }

    public boolean d(Matrix44 matrix44) {
        if (matrix44 == this) {
            return true;
        }
        for (int k = 0; k < this.f.length; ++k) {
            if (this.f[k] == matrix44.f[k]) continue;
            return false;
        }
        return true;
    }

    @Override
    public void n_() {
        this.g = false;
    }

    @Override
    public void m() {
    }

    private void f() {
        this.f[3] = 0.0f;
        this.f[7] = 0.0f;
        this.f[11] = 0.0f;
        this.f[15] = 1.0f;
    }

    static {
        for (int k = 0; k < 16; ++k) {
            Matrix44.e[k] = 0.0f;
        }
    }
}

