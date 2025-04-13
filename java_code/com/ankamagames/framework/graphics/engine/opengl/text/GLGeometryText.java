/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.opengl.text;

import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText$ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.GeometryText;

public class GLGeometryText
extends GeometryText {
    public static final GLGeometryText$ObjectFactory c = new GLGeometryText$ObjectFactory();
    private ayf_2 o;

    GLGeometryText() {
    }

    @Override
    public int a(String string) {
        return this.o.a(string);
    }

    @Override
    public int b(String string) {
        return this.o.b(string);
    }

    @Override
    public afe_1 c(String string) {
        return new afe_1(this.a(string), this.b(string));
    }

    @Override
    public void a(ayn_2 ayn_22) {
        if (ayn_22 == this.d) {
            return;
        }
        this.o = ayi_2.a(ayn_22);
        super.a(ayn_22);
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public void a(aui_2 aui_22) {
        if (this.o == null) {
            return;
        }
        int n = this.f.size();
        if (n == 0) {
            return;
        }
        aud_1.a().a(this);
        this.o.a(this.e.q(), this.e.r(), this.e.s(), this.e.p());
        float f2 = this.k * this.m + this.i;
        float f3 = (this.l + (float)(n * this.g)) * this.m + this.j;
        this.o.a(0, 0);
        for (int k = 0; k < n; ++k) {
            char[] cArray = (char[])this.f.get(k);
            this.o.a(cArray, f2, f3 -= (float)this.g * this.m, this.m);
        }
        this.o.g();
    }

    @Override
    public void m() {
    }
}

