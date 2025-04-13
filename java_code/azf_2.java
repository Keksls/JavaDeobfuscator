/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from azf
 */
public final class azf_2
implements azj_2 {
    public static final azf_2 a = new azf_2(0.0f, 0.0f, 0.0f, 0.0f);
    public static final azf_2 b = new azf_2(1.0f, 1.0f, 1.0f, 0.0f);
    public static final azf_2 c = new azf_2(1.0f, 1.0f, 1.0f, 0.5f);
    public static final azf_2 d = new azf_2(1.0f, 1.0f, 1.0f, 0.25f);
    public static final azf_2 e = new azf_2(1.0f, 1.0f, 1.0f);
    public static final azf_2 f = new azf_2(0.0f, 0.0f, 0.0f);
    public static final azf_2 g = new azf_2(217, 65, 65, 255);
    public static final azf_2 h = new azf_2(1.0f, 0.0f, 0.0f);
    public static final azf_2 i = new azf_2(217, 0, 0, 255);
    public static final azf_2 j = new azf_2(0.0f, 1.0f, 0.0f);
    public static final azf_2 k = new azf_2(0.0f, 0.4f, 0.0f);
    public static final azf_2 l = new azf_2(34, 170, 213, 255);
    public static final azf_2 m = new azf_2(0.0f, 0.0f, 1.0f);
    public static final azf_2 n = new azf_2(0.0f, 1.0f, 1.0f);
    public static final azf_2 o = new azf_2(128, 128, 128, 255);
    public static final azf_2 p = new azf_2(64, 64, 64, 255);
    public static final azf_2 q = new azf_2(192, 192, 192, 255);
    public static final azf_2 r = new azf_2(224, 224, 224, 255);
    public static final azf_2 s = new azf_2(0.57f, 0.2f, 0.75f, 0.66f);
    public static final azf_2 t = new azf_2(255, 190, 220, 255);
    public static final azf_2 u = new azf_2(1.0f, 0.5f, 0.75f);
    public static final azf_2 v = new azf_2(0.95f, 0.64f, 0.25f);
    public static final azf_2 w = new azf_2(237, 172, 97, 255);
    public static final azf_2 x = new azf_2(217, 117, 0, 255);
    public static final azf_2 y = new azf_2(50, 248, 255, 255);
    public static final azf_2 z = new azf_2(0.32f, 0.39f, 0.42f);
    public static final azf_2 A = new azf_2(0.85f, 0.18f, 0.0f);
    public static final azf_2 B = new azf_2(0.8f, 0.0f, 0.4f);
    private int J;

    public azf_2(@NotNull azj_2 azj_22) {
        this.J = azj_22.a();
    }

    public azf_2(float ... fArray) {
        if (fArray.length == 0) {
            this.J = 0;
            return;
        }
        float f2 = fArray.length == 4 ? fArray[3] : 1.0f;
        this.a(fArray[0], fArray[1], fArray[2], f2);
    }

    public azf_2(int n) {
        this.J = n;
    }

    public azf_2(byte by, byte by2, byte by3, byte by4) {
        this.a(by, by2, by3, by4);
    }

    public azf_2(int n, int n2, int n3, int n4) {
        this.a(n, n2, n3, n4);
    }

    public azf_2(azj_2 azj_22, float f2) {
        this(azj_22.q(), azj_22.r(), azj_22.s(), f2);
    }

    public azf_2(Color color) {
        this(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    @Override
    public int a() {
        return this.J;
    }

    @Override
    public int b() {
        return this.J >> 24 & 0xFF;
    }

    @Override
    public int c() {
        return this.J & 0xFF;
    }

    @Override
    public int d() {
        return this.J >> 8 & 0xFF;
    }

    @Override
    public int e() {
        return this.J >> 16 & 0xFF;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    @Nullable
    public String g() {
        return null;
    }

    public void a(float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f) : "Invalid intensity value " + f2;
        float f3 = Math.max(this.q(), Math.max(this.s(), this.r()));
        if (f3 == 0.0f) {
            this.a(f2, f2, f2, this.p());
            return;
        }
        float f4 = f2 / f3;
        float f5 = Math.min(1.0f, this.q() * f4);
        float f6 = Math.min(1.0f, this.s() * f4);
        float f7 = Math.min(1.0f, this.r() * f4);
        this.a(f5, f7, f6, this.p());
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.J = azj_2.c(f2, f3, f4, f5);
    }

    public void b(float f2) {
        float f3 = Hw.b(f2, 0.0f, 1.0f);
        this.J = this.J & 0xFFFFFF | (int)(f3 * 255.0f) << 24;
    }

    public void a(azj_2 azj_22) {
        this.J = azj_22.a();
    }

    public void a(int n) {
        this.J = n;
    }

    public void b(int n) {
        this.J = azj_2.g(n);
    }

    public void a(byte by, byte by2, byte by3, byte by4) {
        this.J = azj_2.b(by, by2, by3, by4);
    }

    public void a(int n, int n2, int n3, int n4) {
        this.J = azj_2.b(n, n2, n3, n4);
    }

    public void b(azj_2 azj_22) {
        this.a(this.q() * azj_22.q(), this.r() * azj_22.r(), this.s() * azj_22.s(), this.p() * azj_22.p());
    }

    public void h() {
        this.a(Hw.b(0, 255), Hw.b(0, 255), Hw.b(0, 255), Hw.b(0, 255));
    }

    public static azf_2 a(azj_2 azj_22, azj_2 azj_23) {
        azf_2 azf_22 = new azf_2(azj_22);
        azf_22.b(azj_23);
        return azf_22;
    }

    public String toString() {
        return String.format("%s, %s, %s, %s", Float.valueOf(azj_2.f(this.J)), Float.valueOf(azj_2.e(this.J)), Float.valueOf(azj_2.d(this.J)), Float.valueOf(azj_2.c(this.J)));
    }

    public static azf_2 a(String string) {
        if (string.charAt(0) == '#') {
            string = string.substring(1);
        }
        int n = Integer.parseInt(string.substring(0, 2), 16);
        int n2 = Integer.parseInt(string.substring(2, 4), 16);
        int n3 = Integer.parseInt(string.substring(4, 6), 16);
        int n4 = string.length() == 8 ? Integer.parseInt(string.substring(6, 8), 16) : 255;
        return new azf_2(n, n2, n3, n4);
    }

    public static azf_2 a(int n, int n2, int n3) {
        return azf_2.b((float)n, (float)n2, (float)n3, 1.0f);
    }

    public static azf_2 b(float f2, float f3, float f4, float f5) {
        if (f3 < 0.0f || f3 > 100.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Saturation");
        }
        if (f4 < 0.0f || f4 > 100.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Luminance");
        }
        if (f5 < 0.0f || f5 > 1.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Alpha");
        }
        float f6 = f3 / 100.0f;
        float f7 = f4 / 100.0f;
        float f8 = (double)f7 < 0.5 ? f7 * (1.0f + f6) : f7 + f6 - f7 * f6;
        float f9 = 2.0f * f7 - f8;
        float f10 = f2 % 360.0f / 360.0f;
        float f11 = Math.max(0.0f, azj_2.a(f9, f8, f10 + 0.33333334f));
        float f12 = Math.max(0.0f, azj_2.a(f9, f8, f10));
        float f13 = Math.max(0.0f, azj_2.a(f9, f8, f10 - 0.33333334f));
        f11 = Math.min(f11, 1.0f);
        f12 = Math.min(f12, 1.0f);
        f13 = Math.min(f13, 1.0f);
        return new azf_2(f11, f12, f13, f5);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        azf_2 azf_22 = (azf_2)object;
        return this.J == azf_22.J;
    }

    public int hashCode() {
        return this.J;
    }
}

