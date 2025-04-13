/*
 * Decompiled with CFR 0.152.
 */
public class adQ
implements aei_0 {
    private final float a = 0.3f;
    private static final adQ b = new adQ();

    public static adQ a() {
        return b;
    }

    private adQ() {
    }

    @Override
    public void b(int n) {
    }

    @Override
    public int e() {
        return 300;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        float f2 = 0.3f;
        if (fArray[0] < 0.3f) {
            fArray[0] = 0.3f;
        }
        if (fArray[1] < 0.3f) {
            fArray[1] = 0.3f;
        }
        if (fArray[2] < 0.3f) {
            fArray[2] = 0.3f;
        }
    }
}

