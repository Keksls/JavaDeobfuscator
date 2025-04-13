/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

/*
 * Renamed from ayJ
 */
public class ayj_1
extends ayf_2 {
    private ayg_2 a;
    private static final VertexBufferPCT b;
    private static final float[] c;
    private static final float[] d;
    private static final float[] e;
    private static final float[] f;
    private float g = 0.0f;
    private float h = 0.0f;
    private final int i = 1;
    private float j = 1.0f;

    public ayj_1() {
        ayj_1.d[3] = 1.0f;
        ayj_1.d[7] = 1.0f;
        ayj_1.d[11] = 1.0f;
        ayj_1.d[15] = 1.0f;
        ayj_1.e[3] = 1.0f;
        ayj_1.e[7] = 1.0f;
        ayj_1.e[11] = 1.0f;
        ayj_1.e[15] = 1.0f;
    }

    public void a(ayg_2 ayg_22) {
        this.a = ayg_22;
    }

    @Override
    public String a() {
        if (this.a == null) {
            return null;
        }
        return this.a.d();
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
        ayh_1 ayh_12 = this.a.a((short)c2);
        if (ayh_12 == null) {
            return 4;
        }
        if (c2 == ' ') {
            return ayh_12.g;
        }
        return ayh_12.g + ayh_12.f;
    }

    @Override
    public int b(char c2) {
        ayh_1 ayh_12 = this.a.a((short)c2);
        if (ayh_12 == null) {
            return 4;
        }
        return ayh_12.d;
    }

    @Override
    public int c(char c2) {
        ayh_1 ayh_12 = this.a.a((short)c2);
        if (ayh_12 == null) {
            return 4;
        }
        return ayh_12.e;
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
        int n3 = this.a.c();
        char[] cArray = string.toCharArray();
        boolean bl = true;
        for (int k = 0; k < cArray.length; ++k) {
            if (k == n) {
                return n;
            }
            char c2 = cArray[k];
            ayh_1 ayh_12 = this.a.a((short)c2);
            if (ayh_12 == null) continue;
            if (bl) {
                n3 += ayh_12.f;
                bl = false;
            }
            n3 = c2 == ' ' ? (n3 += ayh_12.g) : (n3 += ayh_12.g);
            if (n3 <= n2) continue;
            return k;
        }
        return string.length();
    }

    @Override
    public int a(String string) {
        if (this.a == null) {
            return 4 * string.length();
        }
        int n = 0;
        char[] cArray = string.toCharArray();
        boolean bl = true;
        for (int k = 0; k < cArray.length; ++k) {
            char c2 = cArray[k];
            ayh_1 ayh_12 = this.a.a((short)c2);
            if (ayh_12 == null) continue;
            if (bl) {
                n += ayh_12.f;
                bl = false;
            }
            if (c2 == ' ') {
                n += ayh_12.g;
                continue;
            }
            n += ayh_12.g;
        }
        return n += this.a.c();
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
        return 0;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        ayj_1.d[0] = f2 * f5;
        ayj_1.d[1] = f3 * f5;
        ayj_1.d[2] = f4 * f5;
        ayj_1.d[3] = f5;
        ayj_1.d[4] = f2 * f5;
        ayj_1.d[5] = f3 * f5;
        ayj_1.d[6] = f4 * f5;
        ayj_1.d[7] = f5;
        ayj_1.d[8] = f2 * f5;
        ayj_1.d[9] = f3 * f5;
        ayj_1.d[10] = f4 * f5;
        ayj_1.d[11] = f5;
        ayj_1.d[12] = f2 * f5;
        ayj_1.d[13] = f3 * f5;
        ayj_1.d[14] = f4 * f5;
        ayj_1.d[15] = f5;
        ayj_1.e[3] = f5;
        ayj_1.e[7] = f5;
        ayj_1.e[11] = f5;
        ayj_1.e[15] = f5;
    }

    public void a(char[] cArray, float f2, int n, float f3) {
        this.a(cArray, f2, n, f3, 1.0f);
    }

    @Override
    public void a(char[] cArray, float f2, float f3) {
        this.a(cArray, f2, cArray.length, f3, 1.0f);
    }

    @Override
    public void a(char[] cArray, float f2, float f3, float f4) {
        this.a(cArray, f2, cArray.length, f3, f4);
    }

    @Override
    public void a(char[] cArray, float f2, int n, float f3, float f4, float f5) {
        this.a(cArray, f2, cArray.length, f3, f4);
    }

    @Override
    public void a(char[] cArray, float f2, int n, float f3, float f4) {
        int n2;
        if (this.a == null) {
            return;
        }
        this.j = f4;
        ays_2 ays_22 = this.a.e();
        short s2 = this.a.c();
        f2 += this.g - (float)s2;
        f3 += this.h - (float)s2;
        avx_2 avx_22 = auj_1.a.a();
        GL2 gL2 = avx_22.e();
        b.p();
        ays_22.a(gL2);
        afe_1 afe_12 = ays_22.b(0);
        float f5 = afe_12.a();
        float f6 = afe_12.b();
        boolean bl = true;
        for (n2 = 0; n2 < Math.min(cArray.length, n); ++n2) {
            char c2 = cArray[n2];
            ayh_1 ayh_12 = this.a.a((short)c2);
            if (ayh_12 == null) continue;
            if (bl) {
                f2 += (float)ayh_12.f * this.j;
                bl = false;
            }
            f2 -= (float)ayh_12.f * this.j;
            if (c2 == ' ') {
                f2 += (float)ayh_12.g * this.j;
                continue;
            }
            this.a(f2, f3, f5, f6, ayh_12, d);
            f2 += (float)(ayh_12.g + ayh_12.f) * this.j;
        }
        n2 = b.j();
        gL2.glVertexPointer(2, 5126, 0, (Buffer)b.b());
        gL2.glColorPointer(4, 5126, 0, (Buffer)b.c());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)b.d());
        gL2.glDrawArrays(7, 0, n2);
    }

    private void b(String string, int n, int n2) {
        ays_2 ays_22 = this.a.e();
        afe_1 afe_12 = ays_22.b(0);
        float f2 = afe_12.a();
        float f3 = afe_12.b();
        char[] cArray = string.toCharArray();
        for (int k = 0; k < cArray.length; ++k) {
            char c2 = cArray[k];
            ayh_1 ayh_12 = this.a.a((short)c2);
            if (ayh_12 == null) continue;
            if (c2 == ' ') {
                n += ayh_12.g;
                continue;
            }
            boolean bl = true;
            for (int i2 = -1; i2 <= 1; ++i2) {
                for (int i3 = -1; i3 <= 1; ++i3) {
                    if (i2 == 0 && i3 == 0) continue;
                    this.a(n + i2, (float)(n2 + i3), f2, f3, ayh_12, e);
                }
            }
            n += ayh_12.g;
        }
    }

    private void a(float f2, float f3, float f4, float f5, ayh_1 ayh_12, float[] fArray) {
        ayj_1.c[0] = f2;
        ayj_1.c[1] = f3;
        ayj_1.f[0] = (float)ayh_12.b / f4;
        ayj_1.f[1] = (float)(ayh_12.c + ayh_12.e) / f5;
        ayj_1.c[2] = f2;
        ayj_1.c[3] = f3 + (float)ayh_12.e * this.j;
        ayj_1.f[2] = (float)ayh_12.b / f4;
        ayj_1.f[3] = (float)ayh_12.c / f5;
        ayj_1.c[4] = f2 + (float)ayh_12.d * this.j;
        ayj_1.c[5] = f3 + (float)ayh_12.e * this.j;
        ayj_1.f[4] = (float)(ayh_12.b + ayh_12.d) / f4;
        ayj_1.f[5] = (float)ayh_12.c / f5;
        ayj_1.c[6] = f2 + (float)ayh_12.d * this.j;
        ayj_1.c[7] = f3;
        ayj_1.f[6] = (float)(ayh_12.b + ayh_12.d) / f4;
        ayj_1.f[7] = (float)(ayh_12.c + ayh_12.e) / f5;
        b.a(c);
        b.g(f);
        b.c(fArray);
        b.a(b.j() + 4);
    }

    @Override
    public void a(int n, int n2) {
        this.g = -n / 2;
        this.h = -n2 / 2;
        avx_2 avx_22 = auj_1.a.a();
        avx_22.i.a(13);
        axr_2.a().a(axn_2.b, axn_2.f);
    }

    @Override
    public void g() {
        avx_2 avx_22 = auj_1.a.a();
        axr_2.a().a(axn_2.e, axn_2.f);
    }

    @Override
    public void h() {
        this.g = 0.0f;
        this.h = 0.0f;
        avx_2 avx_22 = auj_1.a.a();
        avx_22.i.a(13);
        axr_2.a().a(axn_2.b, axn_2.f);
    }

    @Override
    public void i() {
        avx_2 avx_22 = auj_1.a.a();
        axr_2.a().a(axn_2.e, axn_2.f);
    }

    static {
        c = new float[8];
        d = new float[16];
        e = new float[16];
        f = new float[8];
        int n = 4096;
        b = VertexBufferPCT.d.a(4096);
    }
}

