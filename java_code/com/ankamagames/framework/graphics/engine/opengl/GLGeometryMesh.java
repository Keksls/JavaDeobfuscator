/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.opengl;

import com.ankamagames.framework.graphics.engine.geometry.GeometryMeshLine;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh$ObjectFactory;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

public class GLGeometryMesh
extends GeometryMeshLine {
    public static final GLGeometryMesh$ObjectFactory k = new GLGeometryMesh$ObjectFactory();

    GLGeometryMesh() {
    }

    @Override
    public void a(aui_2 aui_22) {
        avx_2 avx_22 = (avx_2)aui_22;
        GL2 gL2 = avx_22.e();
        aud_1.a().a(this);
        axr_2 axr_22 = axr_2.a();
        axr_22.c(this.i);
        axr_22.f(this.j);
        axr_22.a(this.a, this.b);
        axr_22.a(gL2);
        avx_22.i.a(13);
        gL2.glVertexPointer(2, 5126, 0, (Buffer)this.d.b());
        gL2.glColorPointer(4, 5126, 0, (Buffer)this.d.c());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)this.d.d());
        ave_1 ave_12 = this.d();
        switch (ave_12) {
            case d: {
                gL2.glDrawElements(4, this.c.b(), 5123, (Buffer)this.c.c());
                break;
            }
            case e: {
                gL2.glDrawElements(5, this.d.j(), 5123, (Buffer)this.c.c());
                break;
            }
            case g: {
                gL2.glDrawElements(7, this.d.j(), 5123, (Buffer)this.c.c());
                break;
            }
            case c: {
                gL2.glDrawElements(3, this.d.j(), 5123, (Buffer)this.c.c());
                break;
            }
            case b: {
                gL2.glDrawElements(1, this.d.j(), 5123, (Buffer)this.c.c());
                break;
            }
            case a: {
                gL2.glDrawElements(0, this.d.j(), 5123, (Buffer)this.c.c());
                break;
            }
            default: {
                assert (false) : "Unimplemented mesh type";
                break;
            }
        }
    }

    @Override
    public void u() {
        super.u();
    }
}

