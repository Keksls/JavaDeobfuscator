/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.geometry;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import java.nio.FloatBuffer;

public abstract class GeometryMesh
extends Geometry {
    protected auf_2 c;
    protected VertexBufferPCT d;
    protected ave_1 e = ave_1.d;
    protected float[] f;
    protected int g;
    private static final float[] i = new float[4];

    protected GeometryMesh() {
    }

    public void a(ave_1 ave_12, int n, auf_2 auf_22) {
        this.e = ave_12;
        if (this.d != null) {
            this.d.u();
        }
        assert (n <= auf_22.a());
        this.c = auf_22;
        this.d = VertexBufferPCT.d.b(n);
        this.a(this.d);
    }

    public void a(ave_1 ave_12, VertexBufferPCT vertexBufferPCT, auf_2 auf_22) {
        this.e = ave_12;
        vertexBufferPCT.k_();
        if (this.d != null) {
            this.d.u();
        }
        this.d = vertexBufferPCT;
        this.c = auf_22;
        this.a(this.d);
    }

    public void a(ave_1 ave_12, VertexBufferPCT vertexBufferPCT, auf_2 auf_22, float[] fArray) {
        this.e = ave_12;
        assert (this.d == null);
        assert (this.c == null);
        this.d = vertexBufferPCT;
        this.c = auf_22;
        this.d.k_();
        this.e();
        int n = vertexBufferPCT.j();
        if (n != 0) {
            this.a(fArray, n);
        }
    }

    public final VertexBufferPCT c() {
        return this.d;
    }

    public final ave_1 d() {
        return this.e;
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        if (this.d == null) {
            return;
        }
        if (this.d.c() == null) {
            return;
        }
        GeometryMesh.i[0] = f2;
        GeometryMesh.i[1] = f3;
        GeometryMesh.i[2] = f4;
        GeometryMesh.i[3] = f5;
        for (int k = 0; k < this.d.j(); ++k) {
            this.d.a(k, i);
        }
        this.a(this.d);
    }

    @Override
    public void a(Material material) {
        int n = this.d.j();
        if (this.g != n) {
            return;
        }
        float[] fArray = material.a();
        float[] fArray2 = material.b();
        this.d.f();
        for (int k = 0; k < n; ++k) {
            GeometryMesh.i[0] = this.f[k * 4] * fArray[0] + fArray2[0];
            GeometryMesh.i[1] = this.f[k * 4 + 1] * fArray[1] + fArray2[1];
            GeometryMesh.i[2] = this.f[k * 4 + 2] * fArray[2] + fArray2[2];
            GeometryMesh.i[3] = this.f[k * 4 + 3] * fArray[3];
            this.d.c(i);
        }
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public abstract void a(aui_2 var1);

    public static int a(ave_1 ave_12, int n) {
        switch (ave_12) {
            case b: {
                return n * 2;
            }
            case c: {
                return 2 + (n - 1);
            }
            case a: {
                return n;
            }
            case g: {
                return n * 4;
            }
            case d: {
                return n * 3;
            }
            case f: 
            case e: {
                return 3 + (n - 1);
            }
        }
        return 0;
    }

    @Override
    public void n_() {
        super.n_();
        this.e = ave_1.d;
    }

    @Override
    public void m() {
        if (this.d != null) {
            this.d.u();
            this.d = null;
        }
        this.c = null;
        this.e();
        this.f = null;
    }

    private void a(VertexBufferPCT vertexBufferPCT) {
        int n = vertexBufferPCT.j();
        if (n == 0) {
            this.e();
            return;
        }
        this.e();
        FloatBuffer floatBuffer = vertexBufferPCT.c();
        this.a(n);
        floatBuffer.get(this.f);
    }

    private void e() {
        this.g = 0;
    }

    protected void a(int n) {
        int n2 = n * 4;
        this.g = n;
        if (this.f != null && this.f.length == n2) {
            return;
        }
        float[] fArray = new float[n2];
        if (this.f != null) {
            System.arraycopy(this.f, 0, fArray, 0, Math.min(this.f.length, fArray.length));
        }
        this.f = fArray;
    }

    public final void a(float[] fArray, int n) {
        this.g = n;
        this.f = fArray;
    }
}

