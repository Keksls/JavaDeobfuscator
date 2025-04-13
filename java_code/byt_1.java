/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byT
 */
public class byt_1
implements agx {
    public static final int a = 64;
    public static final int b = 64;
    private final float c;
    private final float d;
    private final float e;

    public byt_1(float f2, float f3, float f4) {
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override
    public int a() {
        return 64;
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public float a(atd_2 atd_22) {
        return this.c;
    }

    @Override
    public float b(atd_2 atd_22) {
        float f2 = 32.0f;
        return 32.0f * (this.d - 0.5f) / this.c;
    }

    @Override
    public float c(atd_2 atd_22) {
        float f2 = 32.0f;
        return 32.0f * (this.e - 0.5f) / this.c;
    }
}

