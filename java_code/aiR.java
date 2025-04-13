/*
 * Decompiled with CFR 0.152.
 */
public class aiR
implements aiP {
    private static final float[][] a = new float[][]{{0.0f, 2.0f}, {0.0f, -2.0f}, {2.0f, 0.0f}, {-2.0f, 0.0f}, {0.0f, -2.0f}, {0.0f, 2.0f}, {-2.0f, 0.0f}, {2.0f, 0.0f}};
    private static final float[][] b = new float[][]{{0.0f, 0.0f}, {0.0f, 1.0f}, {0.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 1.0f}, {1.0f, 0.0f}, {1.0f, 0.0f}, {0.0f, 0.0f}};
    private static final auf_2 c = new auf_2(new short[]{0, 1, 2, 7, 7, 2, 3, 6, 3, 6, 5, 4});
    private static final auf_2 d = new auf_2(new short[]{0, 1, 2, 3, 4, 5, 6, 7, 0});

    @Override
    public int a() {
        return 5;
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

    @Override
    public auf_2 g() {
        return c;
    }

    @Override
    public auf_2 h() {
        return d;
    }
}

