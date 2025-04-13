/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Color;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from azj
 */
public interface azj_2 {
    public static final int D = 255;
    public static final int E = 255;
    public static final int F = 24;
    public static final int G = 16;
    public static final int H = 8;
    public static final int I = 16;

    default public int i() {
        return this.a();
    }

    public int a();

    default public int j() {
        return azj_2.c(this.c(), this.d(), this.e(), this.b());
    }

    @Deprecated
    default public int k() {
        return azj_2.c(this.b(), this.c(), this.d(), this.e());
    }

    default public byte l() {
        return (byte)this.b();
    }

    default public byte m() {
        return (byte)this.c();
    }

    default public byte n() {
        return (byte)this.d();
    }

    default public byte o() {
        return (byte)this.e();
    }

    public int b();

    public int c();

    public int d();

    public int e();

    default public boolean f() {
        return this.g() != null;
    }

    @Nullable
    public String g();

    default public float p() {
        int n = this.b();
        if (n < 0) {
            n = 256 + n;
        }
        return (float)n / 255.0f;
    }

    default public float q() {
        return (float)this.c() / 255.0f;
    }

    default public float r() {
        return (float)this.d() / 255.0f;
    }

    default public float s() {
        return (float)this.e() / 255.0f;
    }

    default public float t() {
        return Math.max(this.q(), Math.max(this.s(), this.r()));
    }

    default public float u() {
        return (this.q() + this.r() + this.s()) / 3.0f;
    }

    default public float[] v() {
        return new float[]{this.q(), this.r(), this.s(), this.p()};
    }

    public static float c(int n) {
        return (float)(n >> 24 & 0xFF) / 255.0f;
    }

    public static float d(int n) {
        return (float)(n >> 16 & 0xFF) / 255.0f;
    }

    public static float e(int n) {
        return (float)(n >> 8 & 0xFF) / 255.0f;
    }

    public static float f(int n) {
        return (float)(n & 0xFF) / 255.0f;
    }

    public static int c(float f2, float f3, float f4, float f5) {
        return (int)(Hw.b(f5, 0.0f, 1.0f) * 255.0f) << 24 | (int)(Hw.b(f2, 0.0f, 1.0f) * 255.0f) | (int)(Hw.b(f3, 0.0f, 1.0f) * 255.0f) << 8 | (int)(Hw.b(f4, 0.0f, 1.0f) * 255.0f) << 16;
    }

    public static int b(byte by, byte by2, byte by3, byte by4) {
        return aba_1.a(by4) << 24 | aba_1.a(by) | aba_1.a(by2) << 8 | aba_1.a(by3) << 16;
    }

    public static int b(int n, int n2, int n3, int n4) {
        return Hw.a(n4, 0, 255) << 24 | Hw.a(n, 0, 255) | Hw.a(n2, 0, 255) << 8 | Hw.a(n3, 0, 255) << 16;
    }

    public static int g(int n) {
        return azj_2.b(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, n >> 24 & 0xFF);
    }

    public static int c(int n, int n2, int n3, int n4) {
        return Hw.a(n, 0, 255) << 24 | Hw.a(n2, 0, 255) << 16 | Hw.a(n3, 0, 255) << 8 | Hw.a(n4, 0, 255);
    }

    default public String w() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = (this.c() < 16 ? "0" : "") + Integer.toHexString(this.c());
        String string2 = (this.d() < 16 ? "0" : "") + Integer.toHexString(this.d());
        String string3 = (this.e() < 16 ? "0" : "") + Integer.toHexString(this.e());
        stringBuilder.append(string).append(string2).append(string3);
        return stringBuilder.toString();
    }

    default public String x() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = (this.c() < 16 ? "0" : "") + Integer.toHexString(this.c());
        String string2 = (this.d() < 16 ? "0" : "") + Integer.toHexString(this.d());
        String string3 = (this.e() < 16 ? "0" : "") + Integer.toHexString(this.e());
        String string4 = (this.b() < 16 ? "0" : "") + Integer.toHexString(this.b());
        stringBuilder.append(string).append(string2).append(string3).append(string4);
        return stringBuilder.toString();
    }

    public static float a(float f2, float f3, float f4) {
        if (f4 < 0.0f) {
            f4 += 1.0f;
        }
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        if (6.0f * f4 < 1.0f) {
            return f2 + (f3 - f2) * 6.0f * f4;
        }
        if (2.0f * f4 < 1.0f) {
            return f3;
        }
        if (3.0f * f4 < 2.0f) {
            return f2 + (f3 - f2) * 6.0f * (0.6666667f - f4);
        }
        return f2;
    }

    default public float[] y() {
        float f2 = this.q();
        float f3 = this.r();
        float f4 = this.s();
        float f5 = Math.min(f2, Math.min(f3, f4));
        float f6 = Math.max(f2, Math.max(f3, f4));
        float f7 = 0.0f;
        if (f6 == f5) {
            f7 = 0.0f;
        } else if (f6 == f2) {
            f7 = (60.0f * (f3 - f4) / (f6 - f5) + 360.0f) % 360.0f;
        } else if (f6 == f3) {
            f7 = 60.0f * (f4 - f2) / (f6 - f5) + 120.0f;
        } else if (f6 == f4) {
            f7 = 60.0f * (f2 - f3) / (f6 - f5) + 240.0f;
        }
        float f8 = (f6 + f5) / 2.0f;
        float f9 = 0.0f;
        f9 = f6 == f5 ? 0.0f : (f8 <= 0.5f ? (f6 - f5) / (f6 + f5) : (f6 - f5) / (2.0f - f6 - f5));
        return new float[]{f7, f9 * 100.0f, f8 * 100.0f};
    }

    default public Color z() {
        return new Color(this.c(), this.d(), this.e(), this.b());
    }
}

