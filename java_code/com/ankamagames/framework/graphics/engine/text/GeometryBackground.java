/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.text;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;

public abstract class GeometryBackground
extends Geometry {
    protected float d;
    protected float e;
    protected short[] f;
    protected short[] g;
    protected VertexBufferPCT h;
    protected auf_2 i;
    protected VertexBufferPCT j;
    protected auf_2 k;
    private int c;
    private int m;
    private final azf_2 n = new azf_2(1.0f, 1.0f, 1.0f, 0.7f);
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private final azf_2 t = new azf_2(0.06f, 0.04f, 0.03f, 0.4f);
    private float u;
    private float v;
    private float[][] w;
    private float[][] x;
    private boolean y;

    public void a(gk_0 gk_02) {
        assert (false) : "Currently not implemented";
    }

    public void a(arf_1 arf_12) {
        assert (false) : "Currently not implemented";
    }

    @Override
    public void a(float f2) {
    }

    public final int c() {
        return this.c;
    }

    public final void a(int n) {
        if (n == this.c) {
            return;
        }
        this.c = n;
        this.r();
    }

    public final int e() {
        return this.m;
    }

    public final void b(int n) {
        if (n == this.m) {
            return;
        }
        this.m = n;
        this.r();
    }

    public float f() {
        return this.u;
    }

    public void b(float f2) {
        if (this.u == f2) {
            return;
        }
        this.u = f2;
        this.r();
    }

    public float g() {
        return this.v;
    }

    public void c(float f2) {
        if (this.v == f2) {
            return;
        }
        this.v = f2;
        this.r();
    }

    public final float h() {
        return this.s;
    }

    public final void d(float f2) {
        if (this.s == f2) {
            return;
        }
        this.s = f2;
        this.r();
    }

    public final azj_2 j() {
        return this.n;
    }

    @Override
    public final void a(float f2, float f3, float f4, float f5) {
        this.n.a(f2, f3, f4, f5);
        this.r();
    }

    public final azj_2 k() {
        return this.t;
    }

    public final void b(float f2, float f3, float f4, float f5) {
        this.t.a(f2, f3, f4, f5);
        this.r();
    }

    public final void a(float f2, float f3) {
        this.d = f2;
        this.e = f3;
        this.r();
    }

    public final void a(float[][] fArray, float[][] fArray2) {
        assert (fArray != null) : "positionOffsets can't be null";
        assert (fArray2 != null) : "sizeMultipliers can't be null";
        assert (fArray.length == fArray2.length) : "positionOffsets and sizeMultipliers must have the same size";
        assert (fArray.length > 0) : "positionOffsets must be greater than zero";
        assert (fArray2.length > 0) : "sizeMultipliers must be greater than zero";
        this.w = fArray;
        this.x = fArray2;
        this.r();
    }

    public final void a(auf_2 auf_22) {
        this.k = auf_22;
        this.r();
    }

    public final void b(auf_2 auf_22) {
        this.i = auf_22;
        this.r();
    }

    public final void c(float f2, float f3, float f4, float f5) {
        if (this.o == f2 && this.p == f3 && this.q == f4 && this.r == f5) {
            return;
        }
        this.o = f2;
        this.p = f3;
        this.q = f4;
        this.r = f5;
        this.r();
    }

    public final float n() {
        return this.o;
    }

    public final float o() {
        return this.p;
    }

    public final float p() {
        return this.q;
    }

    public final float q() {
        return this.r;
    }

    protected final void r() {
        this.y = true;
    }

    protected void s() {
        if (!this.y) {
            return;
        }
        this.y = false;
        this.t();
        float f2 = (float)this.c / this.d;
        float f3 = (float)this.m / this.e;
        float f4 = f2 + this.o + this.p;
        float f5 = f3 + this.q + this.r;
        float f6 = this.n.q();
        float f7 = this.n.r();
        float f8 = this.n.s();
        float f9 = this.n.p();
        float f10 = this.n.q();
        float f11 = this.n.r();
        float f12 = this.n.s();
        float f13 = this.n.p();
        this.h.n();
        this.j.n();
        for (int k = 0; k < this.w.length; ++k) {
            float f14 = this.w[k][0] + this.x[k][0] * f4 + this.u;
            float f15 = this.w[k][1] + this.x[k][1] * f5 + this.v;
            this.h.a(f14, f15, 0.0f, 0.0f, f6, f7, f8, f9);
            this.j.a(f14, f15, 0.0f, 0.0f, f10, f11, f12, f13);
        }
        this.h.o();
        this.j.o();
    }

    private void t() {
        this.h = GeometryBackground.a(this.h, this.w.length);
        this.j = GeometryBackground.a(this.j, this.w.length);
    }

    private static VertexBufferPCT a(VertexBufferPCT vertexBufferPCT, int n) {
        if (vertexBufferPCT == null) {
            return VertexBufferPCT.d.b(n);
        }
        if (vertexBufferPCT.k() < n) {
            vertexBufferPCT.u();
            return VertexBufferPCT.d.b(n);
        }
        return vertexBufferPCT;
    }

    @Override
    public void n_() {
        super.n_();
        if (this.n != null) {
            this.n.a(1.0f, 1.0f, 1.0f, 0.7f);
        }
        if (this.t != null) {
            this.t.a(0.06f, 0.04f, 0.03f, 0.4f);
        }
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0.0f;
        this.d = 1.0f;
        this.e = 1.0f;
        this.s = 1.0f;
        this.r();
    }

    @Override
    public void m() {
        this.v();
        this.w = null;
        this.x = null;
        this.f = null;
        this.g = null;
    }

    private void v() {
        if (this.h != null) {
            this.h.u();
            this.h = null;
        }
        this.i = null;
        if (this.j != null) {
            this.j.u();
            this.j = null;
        }
        this.k = null;
    }
}

