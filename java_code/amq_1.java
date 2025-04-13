/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMq
 */
public class amq_1 {
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final int f;
    private long g = -1L;
    final /* synthetic */ amo_1 a;

    public amq_1(amo_1 amo_12, float f2, float f3, int n) {
        this.a = amo_12;
        this.b = amo_12.i;
        this.c = amo_12.j;
        this.d = f2;
        this.e = f3;
        this.f = n;
    }

    public boolean a(long l) {
        if (this.g == -1L) {
            this.g = l;
            return true;
        }
        int n = (int)(l - this.g);
        int n2 = Hw.a(n, 0, this.f);
        this.a.i = this.a(this.b, this.d, n2, this.f);
        this.a.j = this.a(this.c, this.e, n2, this.f);
        this.a.a(this.a.i, this.a.j);
        return n < this.f;
    }

    private float a(float f2, float f3, int n, int n2) {
        float f4 = (float)n / (float)n2;
        float f5 = (0.5f - f4) * (1.0f - 2.0f * Math.abs(0.5f - f4));
        return f2 + (f3 - f2) * (f4 -= f5);
    }
}

