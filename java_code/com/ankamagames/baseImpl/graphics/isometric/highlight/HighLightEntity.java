/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.baseImpl.graphics.isometric.highlight;

import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity$ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;

public class HighLightEntity
extends Entity3D {
    public static final HighLightEntity$ObjectFactory a = new HighLightEntity$ObjectFactory();
    public boolean b;

    HighLightEntity() {
    }

    @Override
    public void n_() {
        super.n_();
        this.Q();
    }

    @Override
    public void c() {
        super.c();
        this.b = false;
    }
}

