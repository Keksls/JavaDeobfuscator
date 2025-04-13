/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.geometry;

import com.ankamagames.framework.graphics.engine.material.Material;

public abstract class Geometry
extends abh_1 {
    protected axn_2 a;
    protected axn_2 b;

    public final void a(axn_2 axn_22, axn_2 axn_23) {
        this.a = axn_22;
        this.b = axn_23;
    }

    public final axn_2 a() {
        return this.a;
    }

    public final axn_2 b() {
        return this.b;
    }

    public abstract void a(float var1, float var2, float var3, float var4);

    public void a(Material material) {
    }

    public abstract void a(float var1);

    public abstract void a(aui_2 var1);

    @Override
    public void n_() {
        this.a(axn_2.e, axn_2.f);
    }
}

