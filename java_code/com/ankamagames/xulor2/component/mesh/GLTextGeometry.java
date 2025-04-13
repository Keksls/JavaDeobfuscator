/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.xulor2.component.mesh;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.xulor2.component.mesh.GLTextGeometry$ObjectFactory;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import java.awt.Color;
import java.util.ArrayList;

public final class GLTextGeometry
extends Geometry {
    public static final GLTextGeometry$ObjectFactory c = new GLTextGeometry$ObjectFactory();
    public static final boolean d = true;
    private static final int g = 400;
    private fxD h;
    private long i = 0L;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private azj_2 m = null;
    private long n = 0L;
    VertexBufferPCT e;

    GLTextGeometry() {
    }

    public void a(fxD fxD2) {
        this.h = fxD2;
    }

    public void a(gk_0 gk_02) {
        assert (false) : "Currently not implemented";
    }

    public void a(arf_1 arf_12) {
        assert (false) : "Currently not implemented";
    }

    @Override
    public void a(float f2) {
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        assert (false) : "Currently not implemented";
    }

    public boolean c() {
        return this.k;
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    public boolean e() {
        return this.l;
    }

    public void b(boolean bl) {
        this.l = bl;
    }

    public void a(azj_2 azj_22) {
        if (this.m == azj_22) {
            return;
        }
        this.m = azj_22;
    }

    public azj_2 f() {
        return this.m;
    }

    public void a(long l) {
        this.n = l;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(aui_2 aui_22) {
        fxB fxB2;
        int n;
        int n2;
        GL2 gL2 = aui_22.e();
        axr_2 axr_22 = axr_2.a();
        azt_1 azt_12 = fdn_2.a().e();
        ful_0 ful_02 = this.h.Y();
        ArrayList<fxB> arrayList = this.h.q();
        int n3 = arrayList.size();
        int n4 = this.h.G();
        int n5 = this.h.M();
        fyX fyX2 = fpm_0.b().j();
        float f2 = fyX2.G();
        int n6 = (int)((float)(ful_02.getScreenY() + ful_02.getAppearance().getBottomInset()) * f2);
        long l = this.h.Z();
        int n7 = n2 = l > 0L && this.n != -1L ? this.b(l) : -1;
        if (n2 != -1 && n2 >= this.h.b().getTextBuilder().m() && this.n != -1L) {
            this.h.b().l();
            this.n = -1L;
        }
        int n8 = 0;
        block4: for (int k = this.h.z(); k < n3 && (n = (fxB2 = arrayList.get(k)).h() - n5 + n4) + fxB2.i() > 0; ++k) {
            if (azt_12 != null) {
                int n9 = Hw.b((float)n * f2);
                if (n9 + n6 >= azt_12.e() + azt_12.b()) continue;
                if (n9 + fxB2.i() + n6 <= azt_12.e()) break;
            }
            float f3 = fxB2.n() > 0 ? (float)(this.h.E().width - fxB2.j()) / (float)fxB2.n() : 0.0f;
            float f4 = 0.0f;
            ArrayList<fxH> arrayList2 = fxB2.t();
            int n10 = 0;
            int n11 = arrayList2.size();
            while (n10 < n11) {
                fxH fxH2 = arrayList2.get(n10);
                switch (fxH2.g()) {
                    case c: {
                        fxH fxH3 = (fxK)fxH2;
                        ayo_2 ayo_22 = ((fxK)fxH3).m();
                        if (ayo_22 == null || ayo_22.a() == null) break;
                        int n12 = Hw.b((float)(fxB2.g() + fxH3.b()) + f4);
                        int n13 = ((fxK)fxH3).d();
                        int n14 = ((fxK)fxH3).n();
                        int n15 = (fxB2.i() - n14) / 2;
                        if (this.m != null) {
                            gL2.glColor4f(this.m.q(), this.m.r(), this.m.s(), this.m.p());
                        } else {
                            gL2.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                        }
                        axr_22.a((GL)gL2, (avz_2)ayo_22.a());
                        axr_22.a(gL2);
                        gL2.glBegin(7);
                        gL2.glTexCoord2f(ayo_22.a, ayo_22.c);
                        gL2.glVertex2i(n12, n + n15);
                        gL2.glTexCoord2f(ayo_22.b, ayo_22.c);
                        gL2.glVertex2i(n12 + n13, n + n15);
                        gL2.glTexCoord2f(ayo_22.b, ayo_22.d);
                        gL2.glVertex2i(n12 + n13, n + n14 + n15);
                        gL2.glTexCoord2f(ayo_22.a, ayo_22.d);
                        gL2.glVertex2i(n12, n + n14 + n15);
                        gL2.glEnd();
                        if (n8 + 1 > n2 && n2 != -1) break block4;
                        ++n8;
                        break;
                    }
                    case b: {
                        fxH fxH3 = (fxL)fxH2;
                        boolean bl = false;
                        String string = ((fxL)fxH3).l();
                        if (string.length() + n8 > n2 && n2 != -1) {
                            bl = true;
                        }
                        ayf_2 ayf_22 = ((fxL)fxH3).o();
                        Color color = ((fxL)fxH3).r();
                        int n15 = ((fxL)fxH3).s();
                        boolean bl2 = ((fxL)fxH3).t();
                        if (color == null) {
                            color = this.h.e();
                        }
                        if (ayf_22 == null) {
                            ayf_22 = this.h.c();
                        }
                        if (ayf_22 != null && color != null && fxH3.d() != 0 && fxH3.e() != 0) {
                            int n16;
                            int n17 = Hw.b((float)(fxB2.g() + fxH3.b()) + f4);
                            f4 += (float)((fxL)fxH3).q() * f3;
                            if (this.k) {
                                color = color.brighter().brighter();
                            }
                            if (this.l) {
                                color = color.darker();
                            }
                            float f5 = (float)color.getAlpha() / 255.0f;
                            float f6 = (float)color.getRed() / 255.0f;
                            float f7 = (float)color.getGreen() / 255.0f;
                            float f8 = (float)color.getBlue() / 255.0f;
                            if (this.m != null) {
                                f6 *= this.m.q();
                                f7 *= this.m.r();
                                f8 *= this.m.s();
                                f5 *= this.m.p();
                            }
                            ayf_22.h();
                            ayf_22.a(f6, f7, f8, f5);
                            ayf_22.a(((fxL)fxH3).m(), n17, bl ? n2 - n8 : string.length(), n + fxB2.k(), 1.0f, f3);
                            ayf_22.i();
                            if (n15 != 0) {
                                axr_22.d(false);
                                axr_22.c(1.0f);
                                axr_22.a(gL2);
                                gL2.glColor4f(f6, f7, f8, f5);
                                gL2.glBegin(1);
                                gL2.glVertex2i(n17, n);
                                n16 = Hw.b((float)fxH3.d() + (float)((fxL)fxH3).q() * f3);
                                gL2.glVertex2i(n17 + n16, n);
                                gL2.glEnd();
                            }
                            if (bl2) {
                                axr_22.d(false);
                                axr_22.c(1.0f);
                                axr_22.a(gL2);
                                gL2.glColor4f(f6, f7, f8, f5);
                                gL2.glBegin(1);
                                gL2.glVertex2i(n17, n + fxB2.i() / 2);
                                n16 = Hw.b((float)fxH3.d() + (float)((fxL)fxH3).q() * f3);
                                gL2.glVertex2i(n17 + n16, n + fxB2.i() / 2);
                                gL2.glEnd();
                            }
                        }
                        n8 += string.length();
                        if (bl) break block4;
                    }
                }
                ++n10;
            }
            fxM fxM2 = fxB2.e();
            if (fxM2 == null) continue;
            n11 = fxB2.g() + fxM2.b();
            int n18 = fxM2.d();
            if (fxM2.f()) {
                if (System.currentTimeMillis() - this.i >= 400L) {
                    this.j = !this.j;
                    this.i = System.currentTimeMillis();
                }
            } else {
                this.j = true;
            }
            if (!this.j) continue;
            axr_22.d(false);
            axr_22.a(axn_2.h, axn_2.a);
            axr_22.a(gL2);
            gL2.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            gL2.glBegin(7);
            gL2.glVertex2i(n11, n);
            gL2.glVertex2i(n11 + n18, n);
            gL2.glVertex2i(n11 + n18, n + fxB2.i());
            gL2.glVertex2i(n11, n + fxB2.i());
            gL2.glEnd();
        }
        axr_22.e();
        axr_22.a(gL2);
    }

    private int b(long l) {
        long l2 = System.currentTimeMillis();
        if (this.n == 0L) {
            this.n = l2;
        }
        long l3 = l2 - this.n;
        return (int)(l3 / l);
    }

    public void g() {
        this.n = 0L;
    }

    @Override
    public void n_() {
        this.n = 0L;
        this.i = 0L;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    @Override
    public void m() {
        this.h = null;
        this.m = null;
    }
}

