/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTM
 */
public class etm_2
extends etl_2 {
    public static final int a = 250000;
    public static final float b = 1.05f;
    private final int c;

    public etm_2(int n) {
        super((short)-1, -1, (short)-1);
        this.c = n;
    }

    @Override
    public int a() {
        return this.c;
    }
}

