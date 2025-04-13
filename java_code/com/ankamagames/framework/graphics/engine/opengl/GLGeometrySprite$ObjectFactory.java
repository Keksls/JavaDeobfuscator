/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.opengl;

import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

public final class GLGeometrySprite$ObjectFactory
extends abi_1<GLGeometrySprite> {
    public GLGeometrySprite$ObjectFactory() {
        super(GLGeometrySprite.class);
    }

    public final GLGeometrySprite a() {
        return new GLGeometrySprite();
    }

    public final String toString() {
        return "Factory pour les GLGeometrySprite";
    }

    @Override
    public /* synthetic */ abh_1 b() {
        return this.a();
    }
}

