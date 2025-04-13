/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D$ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.jogamp.opengl.GL2;
import java.util.ArrayList;

public class Entity3D
extends Entity {
    public static final Entity3D$ObjectFactory c = new Entity3D$ObjectFactory();
    private final ArrayList<auu_2> a = new ArrayList(2);

    public void c() {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            this.a.get(k).a();
        }
        this.a.clear();
    }

    public final int V() {
        return this.a.size();
    }

    public final int a(Geometry geometry) {
        this.a.add(new auu_2(geometry, null, null));
        return this.a.size() - 1;
    }

    public final int a(Geometry geometry, ays_2 ays_22, Material material) {
        this.a.add(new auu_2(geometry, ays_22, material));
        return this.a.size() - 1;
    }

    public final void b(Geometry geometry) {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            auu_2 auu_22 = this.a.get(k);
            if (auu_22.b() != geometry) continue;
            auu_22.a();
            this.a.remove(auu_22);
            break;
        }
    }

    public final Geometry b(int n) {
        return this.a.get(n).b();
    }

    public final void a(int n, ays_2 ays_22) {
        assert (n < this.a.size());
        this.a.get(n).a(ays_22);
    }

    public final ays_2 c(int n) {
        return this.a.get(n).c();
    }

    public final void a(Material material) {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            auu_2 auu_22 = this.a.get(k);
            if (auu_22.d() != material) continue;
            auu_22.e();
        }
    }

    public final Material g(int n) {
        return this.a.get(n).d();
    }

    @Override
    public final void a(float f2, float f3, float f4, float f5) {
        for (auu_2 auu_22 : this.a) {
            Geometry geometry = auu_22.b();
            if (geometry == null) continue;
            geometry.a(f2, f3, f4, f5);
        }
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public void a(aui_2 aui_22) {
        if (this.V() == 0) {
            return;
        }
        avx_2 avx_22 = (avx_2)aui_22;
        GL2 gL2 = aui_22.e();
        aui_22.a(this.D().c());
        boolean bl = this.S();
        this.q.a(gL2);
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            this.a.get(k).a(avx_22, bl);
        }
        this.r.a(gL2);
    }

    @Override
    public void m() {
        super.m();
        this.c();
        this.a.trimToSize();
    }
}

