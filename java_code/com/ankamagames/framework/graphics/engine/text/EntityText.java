/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.text;

import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.text.EntityText$ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;
import com.ankamagames.framework.graphics.engine.text.GeometryText;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;
import java.util.ArrayList;

public class EntityText
extends Entity {
    public static final EntityText$ObjectFactory a = new EntityText$ObjectFactory();
    private static final Matrix44 F = (Matrix44)Matrix44.a.c();
    private static final Matrix44 G = (Matrix44)Matrix44.a.c();
    protected String b;
    protected int c;
    protected int x;
    protected int y;
    protected int z;
    protected int A;
    protected final ArrayList<char[]> B;
    protected int C;
    protected int D;
    protected int E;
    private int H;
    private GeometryText I;
    private GeometryBackground J;
    private boolean K;
    private float L = 1.0f;
    private ayc_2 M = ayc_2.h;

    EntityText() {
        this.B = new ArrayList(32);
    }

    public final void a(GeometryText geometryText) {
        geometryText.k_();
        if (this.I != null) {
            this.I.u();
        }
        this.I = geometryText;
    }

    public final void a(GeometryBackground geometryBackground) {
        if (geometryBackground != null) {
            geometryBackground.k_();
        }
        if (this.J != null) {
            this.J.u();
        }
        this.J = geometryBackground;
    }

    public final void b(float f2, float f3, float f4, float f5) {
        if (this.J == null) {
            return;
        }
        this.J.a(f2, f3, f4, f5);
    }

    public final GeometryText c() {
        return this.I;
    }

    public final GeometryBackground e() {
        return this.J;
    }

    @Override
    public final void a(float f2) {
    }

    @Override
    public final void a(aui_2 aui_22) {
        if (!this.at()) {
            return;
        }
        GL2 gL2 = aui_22.e();
        if (this.K) {
            this.b(this.b);
            this.K = false;
        }
        aui_22.a(this.D().c());
        this.q.a(gL2);
        int n = 0;
        int n2 = 0;
        axr_2.a().d(false);
        if (this.J != null) {
            int n3 = Math.max(this.z, this.x);
            int n4 = Math.max(this.A, this.y);
            this.J.a(n3);
            this.J.b(n4);
            this.J.b((float)(this.D + this.M.a(n3)));
            this.J.c(this.E + this.M.b(n4));
            this.J.a(aui_22);
            n = (int)((float)n + this.J.n());
            n2 = (int)((float)n2 + this.J.q());
        }
        this.I.a(this.D, this.E);
        this.I.c(this.M.a(this.z) + n);
        this.I.d(this.M.b(this.A) + n2);
        this.I.a(this.B);
        this.I.b(this.C);
        this.I.b(this.L);
        this.I.a(aui_22);
        this.r.a(gL2);
    }

    public final void a(aft_2 aft_22) {
        ayx_2 ayx_22 = (ayx_2)this.D().c(0);
        ayx_22.a(aft_22);
        this.D().e();
        this.I.a(aft_22);
    }

    public final void a(int n, int n2) {
        this.D = n;
        this.E = n2;
    }

    public void a(ayn_2 ayn_22) {
        this.I.a(ayn_22);
        this.K = true;
    }

    public final void a(String string) {
        this.b = string;
        this.K = true;
    }

    public final String f() {
        return this.b;
    }

    @Override
    public final void a(float f2, float f3, float f4, float f5) {
        this.I.a(f2, f3, f4, f5);
    }

    public final azf_2 g() {
        return this.I.g();
    }

    public final void a(int n) {
        if (n < 0) {
            n = Integer.MAX_VALUE;
        }
        this.c = n;
        this.K = true;
    }

    public final int h() {
        return this.z;
    }

    public final int j() {
        return this.A;
    }

    public final int k() {
        return this.x;
    }

    public int n() {
        return this.c;
    }

    public final void b(int n) {
        this.x = n;
    }

    public final int o() {
        return this.y;
    }

    public final void c(int n) {
        this.y = n;
    }

    public float p() {
        return this.L;
    }

    public void b(float f2) {
        this.L = f2;
    }

    @Override
    public void n_() {
        super.n_();
        this.c = Integer.MAX_VALUE;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.D = 0;
        this.E = 0;
        this.H = 2;
        this.K = false;
        this.L = 1.0f;
        this.M = ayc_2.h;
        ayx_2 ayx_22 = new ayx_2();
        ayx_22.b();
        this.D().a(ayx_22);
    }

    @Override
    public void m() {
        super.m();
        this.B.clear();
        if (this.I != null) {
            this.I.u();
            this.I = null;
        }
        if (this.J != null) {
            this.J.u();
            this.J = null;
        }
    }

    protected void b(String string) {
        this.B.clear();
        this.z = 0;
        this.A = 0;
        if (string == null || string.length() == 0) {
            this.C = 0;
            return;
        }
        if (this.c == 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(128);
        StringBuilder stringBuilder2 = new StringBuilder(128);
        char[] cArray = string.toCharArray();
        int n = 0;
        while (n < cArray.length) {
            String string2;
            StringBuilder stringBuilder3 = new StringBuilder(128);
            afe_1 afe_12 = new afe_1(0, 0);
            boolean bl = false;
            boolean bl2 = false;
            while (afe_12.a() < this.c && n < cArray.length && !bl) {
                char c2;
                char c3 = cArray[n++];
                boolean bl3 = true;
                if (n < cArray.length && ((c2 = cArray[n]) == '.' || c2 == '?' || c2 == '!' || c2 == ':' || c2 == ';' || c2 == ',')) {
                    bl3 = false;
                }
                if (c3 == ' ' && bl3) {
                    stringBuilder3.append(stringBuilder2.toString()).append(' ');
                    stringBuilder2 = new StringBuilder(128);
                    bl2 = true;
                } else if (c3 == '\n') {
                    bl = true;
                    stringBuilder3.append(stringBuilder2.toString());
                    stringBuilder2 = new StringBuilder(128);
                    bl2 = true;
                } else {
                    stringBuilder2.append(c3);
                }
                if (bl) continue;
                stringBuilder.append(c3);
                afe_12 = this.I.c(stringBuilder.toString());
            }
            if (!bl2) {
                stringBuilder3.append(stringBuilder2.toString());
                stringBuilder2 = new StringBuilder(128);
            }
            if (n >= cArray.length) {
                stringBuilder3.append(stringBuilder2.toString());
            }
            stringBuilder = new StringBuilder(128);
            if (stringBuilder2.length() != 0) {
                stringBuilder.append((CharSequence)stringBuilder2);
            }
            if ((string2 = stringBuilder3.toString()).length() < 0) continue;
            afe_12 = this.I.c(string2);
            this.B.add(stringBuilder3.toString().toCharArray());
            this.z = Math.max(this.z, afe_12.a());
            this.A += afe_12.b();
        }
        this.C = this.A / this.B.size() + this.H;
        this.A = this.C * this.B.size();
    }

    public void a(ayc_2 ayc_22) {
        this.M = ayc_22;
    }
}

