/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.opengl.text;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground$ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

public class GLGeometryBackground
extends GeometryBackground {
    public static final GLGeometryBackground$ObjectFactory c = new GLGeometryBackground$ObjectFactory();

    GLGeometryBackground() {
    }

    @Override
    public void a(aui_2 aui_22) {
        avx_2 avx_22 = (avx_2)aui_22;
        GL2 gL2 = aui_22.e();
        aud_1.a().a(this);
        this.s();
        axr_2 axr_22 = axr_2.a();
        axr_22.a(this.a, this.b);
        axr_22.a(gL2);
        avx_22.i.a(13);
        this.a(gL2, 7, this.h, this.i);
        float f2 = this.h();
        if (f2 > 0.0f) {
            axr_22.c(f2);
            axr_22.a(gL2);
            this.a(gL2, 3, this.j, this.k);
        }
    }

    private void a(GL2 gL2, int n, VertexBufferPCT vertexBufferPCT, auf_2 auf_22) {
        gL2.glVertexPointer(2, 5126, 0, (Buffer)vertexBufferPCT.b());
        gL2.glColorPointer(4, 5126, 0, (Buffer)vertexBufferPCT.c());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)vertexBufferPCT.d());
        gL2.glDrawElements(n, auf_22.b(), 5123, (Buffer)auf_22.c());
    }
}

