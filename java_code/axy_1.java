/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

/*
 * Renamed from axY
 */
public class axy_1
extends ayf_2 {
    private axu_1 a;
    private static final VertexBufferPCT b;
    private static final float[] c;
    private float d = 0.0f;
    private float e = 0.0f;
    private float f = 1.0f;

    public void a(axu_1 axu_12) {
        this.a = axu_12;
    }

    @Override
    public String a() {
        return this.a == null ? null : this.a.d();
    }

    @Override
    public int b() {
        if (this.a == null) {
            return 0;
        }
        return this.a.b();
    }

    @Override
    public ayn_2 c() {
        return this.a;
    }

    @Override
    public ayn_2 a(int n, float f2) {
        return null;
    }

    @Override
    public int a(char c2) {
        axx_1 axx_12 = this.a.a(c2);
        if (axx_12 == null) {
            return 4;
        }
        return axx_12.h;
    }

    @Override
    public int b(char c2) {
        axx_1 axx_12 = this.a.a(c2);
        if (axx_12 == null) {
            return 4;
        }
        return axx_12.d;
    }

    @Override
    public int c(char c2) {
        axx_1 axx_12 = this.a.a(c2);
        if (axx_12 == null) {
            return 4;
        }
        return axx_12.e;
    }

    @Override
    public int d() {
        if (this.a == null) {
            return 8;
        }
        return this.a.g() + this.a.c() * 2;
    }

    @Override
    public int e() {
        if (this.a == null) {
            return 12;
        }
        return this.a.h() + this.a.c() * 2;
    }

    @Override
    public int a(String string, int n, int n2) {
        if (string == null || string.length() == 0) {
            return 0;
        }
        if (this.a == null) {
            return string.length();
        }
        float f2 = this.a.c();
        char[] cArray = string.toCharArray();
        for (int k = 0; k < cArray.length; ++k) {
            if (k == n) {
                return n;
            }
            axx_1 axx_12 = this.a.a(cArray[k]);
            if (axx_12 == null) continue;
            f2 += (float)axx_12.h;
            if (axx_12.i != null && k < cArray.length - 1) {
                f2 += (float)axx_12.i.g(cArray[k + 1]);
            }
            if (!(f2 > (float)n2)) continue;
            return k;
        }
        return string.length();
    }

    @Override
    public int a(String string) {
        if (this.a == null) {
            return 4 * string.length();
        }
        float f2 = 0.0f;
        char[] cArray = string.toCharArray();
        for (int k = 0; k < cArray.length; ++k) {
            axx_1 axx_12 = this.a.a(cArray[k]);
            if (axx_12 == null) continue;
            if (axx_12.i != null && k < cArray.length - 1) {
                f2 += (float)axx_12.i.g(cArray[k + 1]);
            }
            f2 += (float)axx_12.h;
        }
        return (int)(f2 += (float)this.a.c());
    }

    @Override
    public int b(String string) {
        if (this.a == null) {
            return 12;
        }
        return this.a.f();
    }

    @Override
    public int c(String string) {
        return this.a.j();
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        axy_1.c[0] = f2 * f5;
        axy_1.c[1] = f3 * f5;
        axy_1.c[2] = f4 * f5;
        axy_1.c[3] = f5;
    }

    @Override
    public final void a(char[] cArray, float f2, float f3) {
        this.a(cArray, f2, cArray.length, f3, 1.0f);
    }

    @Override
    public final void a(char[] cArray, float f2, float f3, float f4) {
        this.a(cArray, f2, cArray.length, f3, f4);
    }

    @Override
    public final void a(char[] cArray, float f2, int n, float f3, float f4) {
        this.a(cArray, f2, n, f3, f4, 0.0f);
    }

    @Override
    public void a(char[] cArray, float f2, int n, float f3, float f4, float f5) {
        int n2;
        if (this.a == null) {
            return;
        }
        float f6 = f2;
        this.f = f4;
        short s2 = this.a.c();
        f6 += this.d - (float)s2;
        f3 += this.e - (float)s2 + (float)this.a.i();
        avx_2 avx_22 = auj_1.a.a();
        GL2 gL2 = avx_22.e();
        ays_2 ays_22 = this.a.e();
        axr_2.a().a((GL)gL2, (avz_2)ays_22);
        axr_2.a().a(gL2);
        afe_1 afe_12 = ays_22.b(0);
        float f7 = afe_12.a();
        float f8 = afe_12.b();
        b.n();
        int n3 = Math.min(cArray.length, n);
        for (n2 = 0; n2 < n3; ++n2) {
            char c2 = cArray[n2];
            axx_1 axx_12 = this.a.a(c2);
            if (axx_12 == null) continue;
            if (c2 == ' ') {
                f6 += ((float)axx_12.h + f5) * this.f;
                continue;
            }
            float f9 = (float)(axx_12.g + axx_12.e) / 2.0f;
            float f10 = (float)Hw.b(f6) + (float)axx_12.f * this.f;
            float f11 = f3 - f9 * this.f - f9;
            float f12 = f10 + (float)axx_12.d * this.f;
            float f13 = f11 + (float)axx_12.e * this.f;
            float f14 = (float)axx_12.b / f7;
            float f15 = (float)axx_12.c / f8;
            float f16 = (float)(axx_12.b + axx_12.d) / f7;
            float f17 = (float)(axx_12.c + axx_12.e) / f8;
            b.a(f10, f11, f14, f17, c);
            b.a(f10, f13, f14, f15, c);
            b.a(f12, f13, f16, f15, c);
            b.a(f12, f11, f16, f17, c);
            if (axx_12.i != null && n2 < n3 - 1) {
                f6 += (float)axx_12.i.g(cArray[n2 + 1]) * this.f;
            }
            f6 += (float)axx_12.h * this.f;
        }
        b.o();
        n2 = b.j();
        gL2.glVertexPointer(2, 5126, 0, (Buffer)b.b());
        gL2.glColorPointer(4, 5126, 0, (Buffer)b.c());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)b.d());
        gL2.glDrawArrays(7, 0, n2);
    }

    @Override
    public void a(int n, int n2) {
        this.d = -n / 2;
        this.e = -n2 / 2;
        avx_2 avx_22 = auj_1.a.a();
        avx_22.i.a(13);
        axr_2.a().a(axn_2.e, axn_2.f);
    }

    @Override
    public void g() {
    }

    @Override
    public void h() {
        this.d = 0.0f;
        this.e = 0.0f;
        avx_2 avx_22 = auj_1.a.a();
        avx_22.i.a(13);
        axr_2.a().a(axn_2.e, axn_2.f);
    }

    @Override
    public void i() {
    }

    static {
        c = new float[4];
        int n = 4096;
        b = VertexBufferPCT.d.a(4096);
    }
}

