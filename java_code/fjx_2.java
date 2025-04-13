/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJx
 */
public class fjx_2
extends fjw_2 {
    @Override
    public float a(float f2, float f3, int n, int n2) {
        float f4 = (float)n / (float)n2 / 2.0f + 0.5f;
        float f5 = (0.5f - f4) * (1.0f - 2.0f * Math.abs(0.5f - f4));
        f4 = (f4 - f5 - 0.5f) * 2.0f;
        return f2 + (f3 - f2) * f4;
    }
}

