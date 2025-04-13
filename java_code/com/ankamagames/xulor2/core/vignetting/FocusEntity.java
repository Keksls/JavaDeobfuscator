/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.xulor2.core.vignetting;

import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.xulor2.core.vignetting.FocusEntity$FocusEntityFactory;
import com.jogamp.opengl.GL2;

public class FocusEntity
extends Entity3D {
    private float b;
    private float y;
    private float z;
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    public static final abi_1<FocusEntity> a = new FocusEntity$FocusEntityFactory();

    public void a(float f2, float f3) {
        this.b = f2;
        this.y = f3;
    }

    public void b(float f2, float f3, float f4, float f5) {
        this.z = f2;
        this.A = f3;
        this.B = f4;
        this.C = f5;
    }

    public void a(float f2, float f3, float f4) {
        this.D = f2;
        this.E = f3;
        this.F = f4;
    }

    public void b(float f2) {
        this.G = f2;
    }

    public void e() {
        this.D = 0.0f;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.75f;
    }

    @Override
    public void a(aui_2 aui_22) {
        GL2 gL2 = aui_22.e();
        gL2.glBegin(5);
        gL2.glColor4f(this.D, this.E, this.F, this.G);
        gL2.glVertex2f(0.0f, 0.0f);
        gL2.glVertex2f(this.z, this.A);
        gL2.glVertex2f(this.b, 0.0f);
        gL2.glVertex2f(this.B, this.A);
        gL2.glVertex2f(this.b, this.y);
        gL2.glVertex2f(this.B, this.C);
        gL2.glVertex2f(0.0f, this.y);
        gL2.glVertex2f(this.z, this.C);
        gL2.glVertex2f(0.0f, 0.0f);
        gL2.glVertex2f(this.z, this.A);
        gL2.glEnd();
        super.a(aui_22);
    }
}

