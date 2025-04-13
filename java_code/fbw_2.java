/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBW
 */
public class fbw_2
implements aiP {
    public static final float[][] a = new float[][]{{0.0f, 2.0f}, {0.0f, -2.0f}, {2.0f, 0.0f}, {-2.0f, 0.0f}, {0.0f, -2.0f}, {0.0f, 2.0f}, {-2.0f, 0.0f}, {36.0f, 0.0f}, {32.0f, -4.0f}, {36.0f, -8.0f}, {25.0f, -20.0f}, {32.0f, -8.0f}, {26.0f, -4.0f}, {28.0f, 0.0f}, {2.0f, 0.0f}};
    public static final float[][] b = new float[][]{{0.0f, 0.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}};
    public static final auf_2 c = new auf_2(new short[]{0, 1, 2, 14, 14, 2, 3, 6, 3, 6, 5, 4, 13, 12, 8, 7, 12, 11, 9, 8, 11, 10, 9, 11});
    public static final auf_2 d = new auf_2(new short[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 0});
    private static final float[][] e = new float[][]{{0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {0.0f, 0.0f}};
    private float f = 0.0f;
    private float g = 0.0f;
    private boolean h;

    @Override
    public int a() {
        return 20;
    }

    @Override
    public int b() {
        return 5;
    }

    @Override
    public int c() {
        return 5;
    }

    @Override
    public int d() {
        return 5;
    }

    @Override
    public float[][] e() {
        return a;
    }

    @Override
    public float[][] f() {
        return b;
    }

    public final float i() {
        return this.f;
    }

    public final void a(float f2) {
        this.f = f2;
    }

    public final float j() {
        return this.g;
    }

    public final void b(float f2) {
        this.g = f2;
    }

    public final void a(boolean bl) {
        this.h = bl;
    }

    @Override
    public auf_2 g() {
        return c;
    }

    @Override
    public auf_2 h() {
        return d;
    }
}

