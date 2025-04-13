/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.opengl;

import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite$ObjectFactory;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

public class GLGeometrySprite
extends GeometrySprite {
    public static final GLGeometrySprite$ObjectFactory j = new GLGeometrySprite$ObjectFactory();

    GLGeometrySprite() {
    }

    @Override
    public void a(aui_2 aui_22) {
        avx_2 avx_22 = (avx_2)aui_22;
        GL2 gL2 = aui_22.e();
        aud_1.a().a(this);
        axr_2 axr_22 = axr_2.a();
        axr_22.a(this.a, this.b);
        axr_22.a(gL2);
        avx_22.i.a(13);
        gL2.glVertexPointer(2, 5126, 0, (Buffer)this.d.b());
        gL2.glColorPointer(4, 5126, 0, (Buffer)this.d.c());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)this.d.d());
        gL2.glDrawArrays(7, 0, 4);
    }
}

