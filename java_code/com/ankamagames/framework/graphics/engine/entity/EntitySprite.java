/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite$ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

public final class EntitySprite
extends Entity {
    public static final EntitySprite$ObjectFactory a = new EntitySprite$ObjectFactory();
    public static final int b = 2;
    private GeometrySprite x;
    private ays_2 y;
    private ays_2 z;
    private ays_2 A;
    private Material B;
    private boolean C;

    EntitySprite() {
    }

    public void a(GeometrySprite geometrySprite) {
        if (geometrySprite == this.x) {
            return;
        }
        geometrySprite.k_();
        if (this.x != null) {
            this.x.u();
        }
        this.x = geometrySprite;
    }

    public GeometrySprite c() {
        return this.x;
    }

    public void b(float f2, float f3, float f4, float f5) {
        this.x.b(f2, f3, f4, f5);
    }

    public void a(ays_2 ays_22) {
        if (ays_22 != null) {
            ays_22.k_();
        }
        if (this.y != null) {
            this.y.u();
        }
        this.y = ays_22;
    }

    public void b(ays_2 ays_22) {
        if (ays_22 != null) {
            ays_22.k_();
        }
        if (this.z != null) {
            this.z.u();
        }
        this.z = ays_22;
    }

    public void c(ays_2 ays_22) {
        if (ays_22 != null) {
            ays_22.k_();
        }
        if (this.A != null) {
            this.A.u();
        }
        this.A = ays_22;
    }

    public ays_2 d() {
        return this.y;
    }

    public Material e() {
        return this.B;
    }

    public void a(Material material) {
        if (this.B != null && this.B.b(material)) {
            return;
        }
        if (material != null) {
            material.k_();
        }
        if (this.B != null) {
            this.B.u();
        }
        this.B = material;
        this.C = true;
    }

    public void f() {
        this.C = true;
    }

    public void a(float f2, float f3, int n, int n2) {
        this.x.a(f2, f3, n, n2);
    }

    public void a(float f2, float f3) {
        this.x.a(f2, f3);
    }

    public void a(int n, int n2) {
        this.x.a(n, n2);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        this.x.a(f2, f3, f4, f5);
    }

    public void a(auv_2 auv_22, float f2, float f3, float f4, float f5) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        this.x.a(auv_22, f2, f3, f4, f5);
    }

    public void a(auv_2 auv_22, azj_2 azj_22) {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        this.x.a(auv_22, azj_22.q(), azj_22.r(), azj_22.s(), azj_22.p());
    }

    public float g() {
        return this.x.g();
    }

    public float h() {
        return this.x.h();
    }

    public float j() {
        return this.x.j();
    }

    public float k() {
        return this.x.k();
    }

    public float n() {
        return this.x.n();
    }

    public float o() {
        return this.x.o();
    }

    public int p() {
        return this.x.p();
    }

    public int q() {
        return this.x.q();
    }

    public float r() {
        return this.x.e();
    }

    public float s() {
        return this.x.f();
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public void a(aui_2 aui_22) {
        if (this.y != null && !this.y.j()) {
            return;
        }
        GL2 gL2 = aui_22.e();
        axr_2 axr_22 = axr_2.a();
        aui_22.a(this.D().c());
        if (this.C && this.S()) {
            this.C = false;
            this.x.a(this.B);
        }
        this.q.a(gL2);
        if (this.z != null) {
            axr_22.a((GL)gL2, 1);
            axr_22.a(gL2, 1);
            axr_22.a((GL)gL2, (avz_2)this.z);
        }
        if (this.A != null) {
            axr_22.a((GL)gL2, 2);
            axr_22.a(gL2, 2);
            axr_22.a((GL)gL2, (avz_2)this.A);
        }
        axr_22.a((GL)gL2, 0);
        axr_22.a(gL2, 0);
        axr_22.a((GL)gL2, (avz_2)this.y);
        axr_22.a(gL2);
        if (this.B != null) {
            axr_22.a(gL2, this.B);
        }
        this.x.a(aui_22);
        this.r.a(gL2);
    }

    @Override
    public void n_() {
        super.n_();
        assert (this.B == null);
        this.B = (Material)Material.d.d();
        this.B.a(Material.b);
        this.C = false;
    }

    @Override
    public void m() {
        super.m();
        if (this.B != null) {
            this.B.u();
            this.B = null;
        }
        if (this.y != null) {
            this.y.u();
            this.y = null;
        }
        if (this.z != null) {
            this.z.u();
            this.z = null;
        }
        if (this.A != null) {
            this.A.u();
            this.A = null;
        }
        if (this.x != null) {
            this.x.u();
            this.x = null;
        }
    }

    @Override
    public boolean a(VertexBufferPCT vertexBufferPCT) {
        if (vertexBufferPCT.j() + this.x.c().j() > vertexBufferPCT.k()) {
            return false;
        }
        vertexBufferPCT.a(this.x.c());
        return true;
    }

    @Override
    public void a(axr_2 axr_22) {
        avx_2 avx_22 = auj_1.a.a();
        GL2 gL2 = avx_22.e();
        axr_2 axr_23 = axr_2.a();
        avx_22.a(this.D().c());
        if (this.C && this.S()) {
            this.C = false;
            this.x.a(this.B);
        }
        this.q.a(gL2);
        if (this.z != null) {
            axr_23.a((GL)gL2, 1);
            axr_23.a(gL2, 1);
            axr_23.a((GL)gL2, (avz_2)this.z);
        }
        if (this.A != null) {
            axr_23.a((GL)gL2, 2);
            axr_23.a(gL2, 2);
            axr_23.a((GL)gL2, (avz_2)this.A);
        }
        axr_23.a((GL)gL2, 0);
        axr_23.a(gL2, 0);
        axr_23.a((GL)gL2, (avz_2)this.y);
        axr_23.a(gL2);
        if (this.B != null) {
            axr_23.a(gL2, this.B);
        }
    }
}

