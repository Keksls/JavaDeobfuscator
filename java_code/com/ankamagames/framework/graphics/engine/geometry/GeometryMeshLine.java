/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.geometry;

import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;

public abstract class GeometryMeshLine
extends GeometryMesh {
    protected float i = 1.0f;
    protected boolean j;

    public float e() {
        return this.i;
    }

    public void b(float f2) {
        this.i = f2;
    }

    public boolean f() {
        return this.j;
    }

    public void a(boolean bl) {
        this.j = bl;
    }

    @Override
    public void n_() {
        super.n_();
        this.i = 1.0f;
        this.j = false;
    }
}

