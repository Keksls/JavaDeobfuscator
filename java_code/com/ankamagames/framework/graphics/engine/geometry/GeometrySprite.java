/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.geometry;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.material.Material;
import java.util.Arrays;

public abstract class GeometrySprite
extends GeometryMesh {
    private static final float[] j = new float[16];
    private static final float[] k = new float[8];
    private static final float[] l = new float[8];
    private int m;
    private int n;
    private float o;
    private float p;
    private boolean q;

    public GeometrySprite() {
        this.c = auf_2.a;
        this.e = ave_1.e;
        this.a(4);
    }

    public final void b(float f2, float f3, float f4, float f5) {
        this.a(f2, f3, f4, f5, avg_1.a);
    }

    public final void a(float f2, float f3, float f4, float f5, avg_1 avg_12) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        this.d.g();
        GeometrySprite.a(this.d, f2, f3, f4, f5, avg_12);
    }

    public static void a(VertexBufferPCT vertexBufferPCT, float f2, float f3, float f4, float f5, avg_1 avg_12) {
        switch (avg_12) {
            case a: {
                GeometrySprite.k[0] = f3;
                GeometrySprite.k[1] = f4;
                GeometrySprite.k[2] = f3;
                GeometrySprite.k[3] = f2;
                GeometrySprite.k[4] = f5;
                GeometrySprite.k[5] = f2;
                GeometrySprite.k[6] = f5;
                GeometrySprite.k[7] = f4;
                break;
            }
            case b: {
                GeometrySprite.k[0] = f5;
                GeometrySprite.k[1] = f4;
                GeometrySprite.k[2] = f3;
                GeometrySprite.k[3] = f4;
                GeometrySprite.k[4] = f3;
                GeometrySprite.k[5] = f2;
                GeometrySprite.k[6] = f5;
                GeometrySprite.k[7] = f2;
                break;
            }
            case c: {
                GeometrySprite.k[0] = f5;
                GeometrySprite.k[1] = f2;
                GeometrySprite.k[2] = f5;
                GeometrySprite.k[3] = f4;
                GeometrySprite.k[4] = f3;
                GeometrySprite.k[5] = f4;
                GeometrySprite.k[6] = f3;
                GeometrySprite.k[7] = f2;
                break;
            }
            case d: {
                GeometrySprite.k[0] = f3;
                GeometrySprite.k[1] = f2;
                GeometrySprite.k[2] = f5;
                GeometrySprite.k[3] = f2;
                GeometrySprite.k[4] = f5;
                GeometrySprite.k[5] = f4;
                GeometrySprite.k[6] = f3;
                GeometrySprite.k[7] = f4;
            }
        }
        vertexBufferPCT.g(k);
    }

    public final void a(float f2, float f3) {
        if (this.o != f2 || this.p != f3) {
            this.o = f2;
            this.p = f3;
            this.s();
        }
    }

    public final void a(int n, int n2) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        if (this.m != n || this.n != n2) {
            this.m = n;
            this.n = n2;
            this.s();
        }
    }

    public final void a(float f2, float f3, int n, int n2) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        if (this.o != f2 || this.p != f3 || this.m != n || this.n != n2) {
            this.o = f2;
            this.p = f3;
            this.m = n;
            this.n = n2;
            this.s();
        }
    }

    @Override
    public final void a(float f2, float f3, float f4, float f5) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        for (int k = 0; k < 4; ++k) {
            this.f[k * 4] = f2;
            this.f[k * 4 + 1] = f3;
            this.f[k * 4 + 2] = f4;
            this.f[k * 4 + 3] = f5;
        }
        this.d.f();
        GeometrySprite.a(this.d, f2, f3, f4, f5);
        this.q = true;
    }

    public static void a(VertexBufferPCT vertexBufferPCT, float f2, float f3, float f4, float f5) {
        GeometrySprite.j[8] = GeometrySprite.j[12] = f2;
        GeometrySprite.j[4] = GeometrySprite.j[12];
        GeometrySprite.j[0] = GeometrySprite.j[12];
        GeometrySprite.j[9] = GeometrySprite.j[13] = f3;
        GeometrySprite.j[5] = GeometrySprite.j[13];
        GeometrySprite.j[1] = GeometrySprite.j[13];
        GeometrySprite.j[10] = GeometrySprite.j[14] = f4;
        GeometrySprite.j[6] = GeometrySprite.j[14];
        GeometrySprite.j[2] = GeometrySprite.j[14];
        GeometrySprite.j[11] = GeometrySprite.j[15] = f5;
        GeometrySprite.j[7] = GeometrySprite.j[15];
        GeometrySprite.j[3] = GeometrySprite.j[15];
        vertexBufferPCT.c(j);
    }

    public final void a(auv_2 auv_22, float f2, float f3, float f4, float f5) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        int n = auv_22.ordinal();
        this.f[n * 4] = f2;
        this.f[n * 4 + 1] = f3;
        this.f[n * 4 + 2] = f4;
        this.f[n * 4 + 3] = f5;
        this.d.a(auv_22.ordinal(), f2, f3, f4, f5);
        this.q = false;
    }

    @Override
    public final void a(Material material) {
        if (!this.q) {
            this.a(auv_2.b, material);
            this.a(auv_2.a, material);
            this.a(auv_2.d, material);
            this.a(auv_2.c, material);
        } else {
            this.b(material);
        }
    }

    private void b(Material material) {
        float[] fArray = material.a();
        float[] fArray2 = material.b();
        float f2 = this.f[0] * fArray[0] + fArray2[0];
        float f3 = this.f[1] * fArray[1] + fArray2[1];
        float f4 = this.f[2] * fArray[2] + fArray2[2];
        float f5 = this.f[3] * fArray[3];
        GeometrySprite.j[8] = GeometrySprite.j[12] = f2;
        GeometrySprite.j[4] = GeometrySprite.j[12];
        GeometrySprite.j[0] = GeometrySprite.j[12];
        GeometrySprite.j[9] = GeometrySprite.j[13] = f3;
        GeometrySprite.j[5] = GeometrySprite.j[13];
        GeometrySprite.j[1] = GeometrySprite.j[13];
        GeometrySprite.j[10] = GeometrySprite.j[14] = f4;
        GeometrySprite.j[6] = GeometrySprite.j[14];
        GeometrySprite.j[2] = GeometrySprite.j[14];
        GeometrySprite.j[11] = GeometrySprite.j[15] = f5;
        GeometrySprite.j[7] = GeometrySprite.j[15];
        GeometrySprite.j[3] = GeometrySprite.j[15];
        this.d.f(j);
    }

    public void a(auv_2 auv_22, Material material) {
        int n = auv_22.ordinal();
        float[] fArray = material.a();
        float[] fArray2 = material.b();
        float f2 = this.f[n * 4] * fArray[0] + fArray2[0];
        float f3 = this.f[n * 4 + 1] * fArray[1] + fArray2[1];
        float f4 = this.f[n * 4 + 2] * fArray[2] + fArray2[2];
        float f5 = this.f[n * 4 + 3] * fArray[3];
        this.d.a(n, f2, f3, f4, f5);
    }

    public final float e() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.p + (float)this.m * 0.5f;
    }

    public final float f() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.o - (float)this.n * 0.5f;
    }

    public final float g() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.p;
    }

    public final float h() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.p + (float)this.m;
    }

    public final float j() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.o;
    }

    public final float k() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return this.o - (float)this.n;
    }

    public final float n() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return (float)this.m * 0.5f;
    }

    public final float o() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        return (float)this.n * 0.5f;
    }

    public final int p() {
        return this.m;
    }

    public final int q() {
        return this.n;
    }

    @Override
    public abstract void a(aui_2 var1);

    @Override
    public void n_() {
        super.n_();
        this.n = 0;
        this.m = 0;
        this.p = 0.0f;
        this.o = 0.0f;
        if (this.f != null) {
            Arrays.fill(this.f, 1.0f);
        }
        this.q = true;
        assert (this.d == null);
        this.d = VertexBufferPCT.d.b(4);
    }

    @Override
    public void m() {
        this.d.u();
        this.d = null;
    }

    private void s() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        this.d.e();
        GeometrySprite.b(this.d, this.o, this.p, this.m, this.n);
    }

    public static void b(VertexBufferPCT vertexBufferPCT, float f2, float f3, float f4, float f5) {
        float f6 = f2 - f5;
        float f7 = f3 + f4;
        GeometrySprite.l[0] = f3;
        GeometrySprite.l[1] = f6;
        GeometrySprite.l[2] = f3;
        GeometrySprite.l[3] = f2;
        GeometrySprite.l[4] = f7;
        GeometrySprite.l[5] = f2;
        GeometrySprite.l[6] = f7;
        GeometrySprite.l[7] = f6;
        vertexBufferPCT.a(l);
    }
}

