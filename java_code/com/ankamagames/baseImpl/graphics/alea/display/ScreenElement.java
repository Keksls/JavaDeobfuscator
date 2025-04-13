/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.baseImpl.graphics.alea.display;

import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement$ObjectFactory;
import org.apache.log4j.Logger;

public class ScreenElement
extends abh_1 {
    private static final Logger u;
    public static final ScreenElement$ObjectFactory a;
    public byte b;
    public short c;
    public int d;
    public int e;
    public int f;
    public int g;
    public agD h;
    public int i;
    public byte j;
    public int k;
    public short l;
    public int m;
    boolean n;
    public long o;
    public float[] p;
    private static final float[] v;
    private static final float w = 0.5f;
    private static final float x = 1.0f;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 4;
    private static final int[] y;

    public ScreenElement() {
    }

    public ScreenElement(byte by) {
        this.b = by;
        this.p = ScreenElement.e(by);
    }

    public final boolean a(arf_1 arf_12) {
        this.c = arf_12.b();
        this.j = arf_12.a();
        this.i = arf_12.a();
        this.n = arf_12.l();
        this.b = arf_12.l() ? (byte)1 : 0;
        this.b = (byte)(this.b | (arf_12.l() ? 2 : 0));
        this.b = (byte)(this.b | (arf_12.l() ? 4 : 0));
        int n = arf_12.c();
        this.h = agE.a(n);
        if (this.h == null) {
            u.error((Object)("Element of id " + n + " is missing"));
            return false;
        }
        return true;
    }

    public final boolean a() {
        return this.n;
    }

    public final boolean b() {
        return this.h.q();
    }

    public final short c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final byte f() {
        return this.j;
    }

    public final aff_1 g() {
        return new aff_1(this.d, this.e, this.c);
    }

    public final short h() {
        return (short)(this.c - this.j);
    }

    public final agD i() {
        return this.h;
    }

    public int j() {
        return this.m;
    }

    public final int k() {
        return this.k;
    }

    public final short n() {
        return this.l;
    }

    public final boolean o() {
        return (this.b & 4) == 4;
    }

    public final void a(float[] fArray) {
        assert (fArray != null && fArray.length >= 3);
        if ((this.b & 1) != 1) {
            fArray[2] = 0.5f;
            fArray[1] = 0.5f;
            fArray[0] = 0.5f;
            return;
        }
        int n = ScreenElement.f(this.b);
        fArray[0] = this.p[n++];
        fArray[1] = this.p[n++];
        fArray[2] = this.p[n];
    }

    public final void b(float[] fArray) {
        assert (fArray != null && fArray.length >= 4);
        this.a(fArray);
        fArray[3] = this.p();
    }

    public final float p() {
        return (this.b & 2) == 2 ? this.p[ScreenElement.g(this.b)] : 1.0f;
    }

    public final void c(float[] fArray) {
        assert ((this.b & 4) == 4) : "impossible sur un objet non d\u00e9grad\u00e9. tester avec isGradient()";
        assert (fArray != null && fArray.length >= 3);
        if ((this.b & 1) != 1) {
            fArray[2] = 0.5f;
            fArray[1] = 0.5f;
            fArray[0] = 0.5f;
            return;
        }
        int n = ScreenElement.h(this.b);
        fArray[0] = this.p[n++];
        fArray[1] = this.p[n++];
        fArray[2] = this.p[n];
    }

    public final void d(float[] fArray) {
        assert ((this.b & 4) == 4) : "impossible sur un objet non d\u00e9grad\u00e9. tester avec isGradient()";
        assert (fArray != null && fArray.length >= 4);
        this.c(fArray);
        fArray[3] = this.p();
    }

    public final float q() {
        assert ((this.b & 4) == 4) : "impossible sur un objet non d\u00e9grad\u00e9. tester avec isGradient()";
        return (this.b & 2) == 2 ? this.p[ScreenElement.i(this.b)] : 1.0f;
    }

    public void e(float[] fArray) {
        assert (fArray != null);
        assert (fArray.length >= 4);
        this.a(v);
        fArray[0] = fArray[0] * v[0];
        fArray[1] = fArray[1] * v[1];
        fArray[2] = fArray[2] * v[2];
        fArray[3] = fArray[3] * this.p();
    }

    public final void a(gk_0 gk_02) {
        assert (this.h != null);
        gk_02.a(this.c);
        gk_02.a(this.j);
        gk_02.a((byte)this.i);
        gk_02.a(this.n);
        gk_02.a((this.b & 1) == 1);
        gk_02.a((this.b & 2) == 2);
        gk_02.a((this.b & 4) == 4);
        gk_02.a(this.h.a());
    }

    public final void a(int n, int n2, short s2) {
        this.d = n;
        this.e = n2;
        this.c = s2;
    }

    public final void a(int n, int n2) {
        this.g = n;
        this.f = n2;
    }

    public void a(boolean bl) {
        this.n = bl;
    }

    public final void a(int n) {
        this.j = (byte)n;
    }

    public final void a(agD agD2) {
        this.h = agD2;
    }

    public final void b(int n) {
        this.i = n;
    }

    public int r() {
        return this.i;
    }

    public final void a(short s2) {
        this.l = s2;
    }

    public void c(int n) {
        this.m = n;
    }

    public final void d(int n) {
        this.k = n;
    }

    public final void a(float f2, float f3, float f4) {
        if ((this.b & 1) != 1) {
            return;
        }
        int n = ScreenElement.f(this.b);
        this.p[n++] = f2;
        this.p[n++] = f3;
        this.p[n] = f4;
    }

    public final void a(float f2, float f3, float f4, float f5) {
        if ((this.b & 1) == 1) {
            int n = ScreenElement.f(this.b);
            this.p[n++] = f2;
            this.p[n++] = f3;
            this.p[n] = f4;
        }
        if ((this.b & 2) == 2) {
            this.p[ScreenElement.g((int)this.b)] = f5;
        }
    }

    public final void a(float f2) {
        if ((this.b & 2) == 2) {
            this.p[ScreenElement.g((int)this.b)] = f2;
        }
    }

    public final void b(float f2, float f3, float f4) {
        if ((this.b & 4) != 4) {
            return;
        }
        if ((this.b & 1) != 1) {
            return;
        }
        int n = ScreenElement.f(this.b);
        this.p[n++] = f2;
        this.p[n++] = f3;
        this.p[n] = f4;
    }

    public final void b(float f2, float f3, float f4, float f5) {
        if ((this.b & 4) != 4) {
            return;
        }
        if ((this.b & 1) == 1) {
            int n = ScreenElement.f(this.b);
            this.p[n++] = f2;
            this.p[n++] = f3;
            this.p[n] = f4;
        }
        if ((this.b & 2) == 2) {
            this.p[ScreenElement.g((int)this.b)] = f5;
        }
    }

    public final void b(float f2) {
        if ((this.b & 4) != 4) {
            return;
        }
        if ((this.b & 2) == 2) {
            this.p[ScreenElement.g((int)this.b)] = f2;
        }
    }

    public void b(int n, int n2, short s2) {
        this.d = n;
        this.e = n2;
        this.c = s2;
    }

    @Override
    public void n_() {
        this.o = 0L;
        this.b = 0;
        this.c = 0;
        this.e = 0;
        this.d = 0;
        this.g = 0;
        this.f = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = 0L;
    }

    @Override
    public void m() {
        this.p = null;
    }

    public static float a(byte by) {
        return (float)by / 255.0f + 0.5f;
    }

    public static void a(float[] fArray, int n, arf_1 arf_12) {
        int n2 = 0;
        if ((n & 1) == 1) {
            assert (n2 == ScreenElement.f(n));
            fArray[n2++] = ScreenElement.a(arf_12.a());
            fArray[n2++] = ScreenElement.a(arf_12.a());
            fArray[n2++] = ScreenElement.a(arf_12.a());
        }
        if ((n & 2) == 2) {
            assert (n2 == ScreenElement.g(n));
            fArray[n2++] = (float)arf_12.a() / 255.0f + 0.5f;
        }
        if ((n & 4) == 4) {
            if ((n & 1) == 1) {
                assert (n2 == ScreenElement.h(n));
                fArray[n2++] = (float)arf_12.a() / 255.0f + 0.5f;
                fArray[n2++] = (float)arf_12.a() / 255.0f + 0.5f;
                fArray[n2++] = (float)arf_12.a() / 255.0f + 0.5f;
            }
            if ((n & 2) == 2) {
                assert (n2 == ScreenElement.i(n));
                fArray[n2++] = (float)arf_12.a() / 255.0f + 0.5f;
            }
        }
        assert (n2 == fArray.length);
    }

    public static float[] e(int n) {
        int n2 = 0;
        n2 += (n & 1) == 1 ? 3 : 0;
        n2 += (n & 2) == 2 ? 1 : 0;
        return new float[n2 *= (n & 4) == 4 ? 2 : 1];
    }

    static int f(int n) {
        return y[n & 0];
    }

    static int g(int n) {
        return y[n & 1];
    }

    static int h(int n) {
        int n2 = n & 3;
        assert ((n2 & 1) == 1);
        return y[n2];
    }

    static int i(int n) {
        int n2 = n & 3;
        assert ((n2 & 2) == 2);
        return y[n2 + 4];
    }

    public void a(afk_2 afk_22) {
        afk_22.a(this.g, this.g + this.h.d(), this.f - this.h.e(), this.f);
    }

    public void s() {
        this.o = ahi_0.a(this.d, this.e, this.i, 0);
    }

    public void t() {
        this.g = acm_0.a(this.d, this.e) - this.h.b();
        this.f = acm_0.a(this.d, this.e, this.c - this.j) + this.h.c();
    }

    @Override
    public void u() {
        super.u();
    }

    static {
        int n;
        u = Logger.getLogger(ScreenElement.class);
        a = new ScreenElement$ObjectFactory();
        v = new float[4];
        y = new int[8];
        int n2 = 3;
        boolean bl = true;
        ScreenElement.y[0] = 0;
        for (n = 1; n < 2; ++n) {
            ScreenElement.y[n] = 3 + y[n - 1];
        }
        for (n = 2; n < 4; ++n) {
            ScreenElement.y[n] = 1 + y[n - 2];
        }
        for (n = 4; n < y.length; ++n) {
            ScreenElement.y[n] = y[n - 4];
            if ((n & 1) != 1) continue;
            int n3 = n;
            y[n3] = y[n3] + 3;
        }
    }
}

