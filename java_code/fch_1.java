/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCh
 */
public class fch_1
implements aiP {
    private static final float[][] a = new float[][]{{1.0f, -11.0f}, {2.0f, -11.0f}, {0.0f, -11.0f}, {0.0f, -8.0f}, {2.0f, -8.0f}, {2.0f, -7.0f}, {1.0f, -7.0f}, {1.0f, -4.0f}, {4.0f, -4.0f}, {4.0f, -6.0f}, {6.0f, -6.0f}, {6.0f, -4.0f}, {4.0f, -4.0f}, {4.0f, -1.0f}, {7.0f, -1.0f}, {7.0f, -2.0f}, {8.0f, -2.0f}, {8.0f, 0.0f}, {11.0f, 0.0f}, {11.0f, -2.0f}, {11.0f, -1.0f}, {-11.0f, -1.0f}, {-11.0f, -2.0f}, {-11.0f, 0.0f}, {-8.0f, 0.0f}, {-8.0f, -2.0f}, {-7.0f, -2.0f}, {-7.0f, -1.0f}, {-4.0f, -1.0f}, {-4.0f, -4.0f}, {-6.0f, -4.0f}, {-6.0f, -6.0f}, {-4.0f, -6.0f}, {-4.0f, -4.0f}, {-1.0f, -4.0f}, {-1.0f, -7.0f}, {-2.0f, -7.0f}, {-2.0f, -8.0f}, {0.0f, -8.0f}, {0.0f, -11.0f}, {-2.0f, -11.0f}, {-1.0f, -11.0f}, {-1.0f, 11.0f}, {-2.0f, 11.0f}, {0.0f, 11.0f}, {0.0f, 8.0f}, {-2.0f, 8.0f}, {-2.0f, 7.0f}, {-1.0f, 7.0f}, {-1.0f, 4.0f}, {-4.0f, 4.0f}, {-4.0f, 6.0f}, {-6.0f, 6.0f}, {-6.0f, 4.0f}, {-4.0f, 4.0f}, {-4.0f, 1.0f}, {-7.0f, 1.0f}, {-7.0f, 2.0f}, {-8.0f, 2.0f}, {-8.0f, 0.0f}, {-11.0f, 0.0f}, {-11.0f, 2.0f}, {-11.0f, 1.0f}, {11.0f, 1.0f}, {11.0f, 2.0f}, {11.0f, 0.0f}, {8.0f, 0.0f}, {8.0f, 2.0f}, {7.0f, 2.0f}, {7.0f, 1.0f}, {4.0f, 1.0f}, {4.0f, 4.0f}, {6.0f, 4.0f}, {6.0f, 6.0f}, {4.0f, 6.0f}, {4.0f, 4.0f}, {1.0f, 4.0f}, {1.0f, 7.0f}, {2.0f, 7.0f}, {2.0f, 8.0f}, {0.0f, 8.0f}, {0.0f, 11.0f}, {2.0f, 11.0f}, {1.0f, 11.0f}};
    private static final float[][] b = new float[][]{{0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}, {0.0f, 0.0f}};
    private static final auf_2 c = new auf_2(new short[]{0, 0, 0, 0});
    private static final auf_2 d = new auf_2(new short[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 0});
    private float e = 0.0f;
    private float f = 0.0f;
    private boolean g;

    @Override
    public int a() {
        return 12;
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
        return a;
    }

    @Override
    public float[][] f() {
        return b;
    }

    @Override
    public auf_2 g() {
        return c;
    }

    @Override
    public auf_2 h() {
        return d;
    }

    public final float i() {
        return this.e;
    }

    public final void a(float f2) {
        this.e = f2;
    }

    public final float j() {
        return this.f;
    }

    public final void b(float f2) {
        this.f = f2;
    }

    public final void a(boolean bl) {
        this.g = bl;
    }
}

