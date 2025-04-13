/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fiq
 */
public final class fiq_0 {
    private final float a;
    private final float b;

    public fiq_0(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public float a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }

    public int a(int n) {
        return Hw.c(this.a + (float)n * this.b);
    }
}

