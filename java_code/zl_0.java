/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zl
 */
public class zl_0
implements aiP {
    public static final int a = 72;
    public static final int b = 20;
    private static final float[][] c = new float[][]{{1.0f, -11.0f}, {2.0f, -11.0f}, {0.0f, -11.0f}, {0.0f, -8.0f}, {2.0f, -8.0f}, {2.0f, -7.0f}, {1.0f, -7.0f}, {1.0f, -4.0f}, {4.0f, -4.0f}, {4.0f, -6.0f}, {6.0f, -6.0f}, {6.0f, -4.0f}, {4.0f, -4.0f}, {4.0f, -1.0f}, {7.0f, -1.0f}, {7.0f, -2.0f}, {8.0f, -2.0f}, {8.0f, 0.0f}, {11.0f, 0.0f}, {11.0f, -2.0f}, {11.0f, -1.0f}, {-11.0f, -1.0f}, {-11.0f, -2.0f}, {-11.0f, 0.0f}, {-8.0f, 0.0f}, {-8.0f, -2.0f}, {-7.0f, -2.0f}, {-7.0f, -1.0f}, {-4.0f, -1.0f}, {-4.0f, -4.0f}, {-6.0f, -4.0f}, {-6.0f, -6.0f}, {-4.0f, -6.0f}, {-4.0f, -4.0f}, {-1.0f, -4.0f}, {-1.0f, -7.0f}, {-2.0f, -7.0f}, {-2.0f, -8.0f}, {0.0f, -8.0f}, {0.0f, -11.0f}, {-2.0f, -11.0f}, {-1.0f, -11.0f}, {-1.0f, 31.0f}, {-2.0f, 31.0f}, {0.0f, 31.0f}, {0.0f, 28.0f}, {-2.0f, 28.0f}, {-2.0f, 27.0f}, {-1.0f, 27.0f}, {-1.0f, 24.0f}, {-4.0f, 24.0f}, {-4.0f, 26.0f}, {-6.0f, 26.0f}, {-6.0f, 24.0f}, {-4.0f, 24.0f}, {-4.0f, 21.0f}, {-7.0f, 21.0f}, {-7.0f, 22.0f}, {-8.0f, 22.0f}, {-8.0f, 20.0f}, {-11.0f, 20.0f}, {-11.0f, 22.0f}, {-11.0f, 21.0f}, {-11.0f, 21.0f}, {-11.0f, 21.0f}, {-11.0f, 21.0f}, {-11.0f, 21.0f}, {-11.0f, 21.0f}, {-11.0f, 21.0f}, {-11.0f, 21.0f}, {-11.0f, 21.0f}, {27.0f, 21.0f}, {17.0f, 0.0f}, {19.0f, 21.0f}, {11.0f, 21.0f}, {11.0f, 22.0f}, {11.0f, 20.0f}, {8.0f, 20.0f}, {8.0f, 22.0f}, {7.0f, 22.0f}, {7.0f, 21.0f}, {4.0f, 21.0f}, {4.0f, 24.0f}, {6.0f, 24.0f}, {6.0f, 26.0f}, {4.0f, 26.0f}, {4.0f, 24.0f}, {1.0f, 24.0f}, {1.0f, 27.0f}, {2.0f, 27.0f}, {2.0f, 28.0f}, {0.0f, 28.0f}, {0.0f, 31.0f}, {2.0f, 31.0f}, {1.0f, 31.0f}};
    private static final float[][] d = new float[][]{{0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}};
    private static final auf_2 e = new auf_2(new short[]{0, 41, 42, 94, 2, 3, 38, 39, 92, 91, 45, 44, 4, 5, 36, 37, 90, 89, 47, 46, 6, 7, 8, 9, 35, 34, 33, 32, 88, 87, 86, 85, 48, 49, 50, 51, 6, 9, 32, 35, 88, 85, 51, 48, 10, 11, 30, 31, 84, 83, 53, 52, 11, 12, 13, 14, 30, 29, 28, 27, 83, 82, 81, 80, 53, 54, 55, 56, 11, 15, 26, 30, 83, 79, 57, 53, 11, 14, 15, 11, 30, 27, 26, 30, 83, 80, 79, 83, 53, 56, 57, 53, 16, 17, 18, 19, 25, 24, 23, 22, 78, 77, 76, 75, 58, 59, 60, 61, 19, 20, 21, 22, 75, 74, 62, 61, 71, 72, 73, 71});
    private static final auf_2 f = new auf_2(new short[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 0});
    private float[][] g = new float[c.length][2];
    private float h;
    private float i;
    private boolean j;

    @Override
    public int a() {
        return 32;
    }

    @Override
    public int b() {
        return 12;
    }

    @Override
    public int c() {
        return 12;
    }

    @Override
    public int d() {
        return 12;
    }

    @Override
    public float[][] e() {
        return this.g;
    }

    @Override
    public float[][] f() {
        return d;
    }

    @Override
    public auf_2 g() {
        return e;
    }

    @Override
    public auf_2 h() {
        return f;
    }

    public zl_0() {
        System.arraycopy(c, 0, this.g, 0, c.length);
        this.h = 0.0f;
        this.i = 0.0f;
    }

    public final float i() {
        return this.h;
    }

    public final void a(float f2) {
        this.h = f2;
    }

    public final float j() {
        return this.i;
    }

    public final void b(float f2) {
        this.i = f2;
    }

    public final void a(boolean bl) {
        int n = bl ? 20 : 0;
        float f2 = this.g[73][0] + (this.g[71][0] - this.g[73][0]) / 2.0f;
        float f3 = this.g[73][1] + (this.g[71][1] - this.g[73][1]) / 2.0f;
        float[] fArray = new float[]{(float)(Math.cos(-2.0943951023931953) * (double)n + (double)f2), (float)(Math.sin(-2.0943951023931953) * (double)n + (double)f3)};
        this.g[72] = fArray;
    }

    public void c(float f2) {
        if ((f2 %= (float)Math.PI) > 0.0f) {
            f2 = (float)((double)f2 - Math.PI);
        }
        float f3 = this.g[73][0] + (this.g[71][0] - this.g[73][0]) / 2.0f;
        float f4 = this.g[73][1] + (this.g[71][1] - this.g[73][1]) / 2.0f;
        float[] fArray = new float[]{(float)(Math.cos(f2) * 20.0 + (double)f3), (float)(Math.sin(f2) * 20.0 + (double)f4)};
        this.g[72] = fArray;
    }
}

