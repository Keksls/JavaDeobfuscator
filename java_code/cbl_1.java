/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbL
 */
public class cbl_1
implements cba_1 {
    @Override
    public float a(float f2) {
        return 1.0f - 0.5f * f2;
    }

    @Override
    public float a(float f2, float f3) {
        return (1.1f - f2) * Hw.a(0.5f, 1.0f, f3);
    }

    @Override
    public float a() {
        return 1.0f;
    }
}

