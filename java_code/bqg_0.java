/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bqG
 */
public final class bqg_0 {
    private static final float a = 0.299f;
    private static final float b = 0.587f;
    private static final float c = 0.114f;
    private static final int d = 256;
    private static final float e = 0.5f;

    private bqg_0() {
    }

    public static float a(azj_2 azj_22) {
        return ((float)azj_22.c() * 0.299f + (float)azj_22.d() * 0.587f + (float)azj_22.e() * 0.114f) / 256.0f;
    }

    public static boolean b(azj_2 azj_22) {
        return bqg_0.a(azj_22) < 0.5f;
    }
}

