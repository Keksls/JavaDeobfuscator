/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eFM
 */
public class efm_0
extends eFs {
    public static final efm_0 m = new efm_0();
    private static final boolean n = false;
    private static final boolean o = true;

    public static efm_0 ai() {
        return m;
    }

    private efm_0() {
        this(false, true, k);
    }

    private efm_0(boolean bl, boolean bl2, float[] fArray) {
        super(-9, -1, aqe_1.a.a(null, (short)0), j, j, j, j, j, j, j, 0L, null, false, 1, 0.0f, bl2, bl, 0, 0.0f, fArray, 100.0f, 0.0f, false, false, false, false, 0, Integer.MAX_VALUE, null, (short)-1, 0.0f, (byte)-1, false, true, true, false, null, false, false, false, false);
    }

    public static efm_0 a(float[] fArray) {
        return new efm_0(false, true, fArray);
    }

    public static efm_0 a(boolean bl, boolean bl2) {
        return new efm_0(bl, bl2, k);
    }
}

