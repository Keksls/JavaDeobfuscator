/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbE
 */
class cbe_1 {
    private float a;
    private float b;
    private float c;
    private long d;
    private long e;

    cbe_1(float f2) {
        this.a = f2;
        this.c = f2;
        this.b = f2;
        this.d = 0L;
        this.e = 0L;
    }

    void a(float f2) {
        this.a = f2;
        this.c = f2;
        this.b = f2;
        this.d = 0L;
        this.e = 0L;
    }

    void a(float f2, long l, long l2) {
        this.c = f2;
        this.b = this.a;
        this.e = Math.max(l, 1L);
        this.d = l2;
    }

    float a() {
        return this.a;
    }

    public float b() {
        return this.c;
    }

    boolean a(long l) {
        return l > this.d + this.e;
    }

    void b(long l) {
        long l2 = l - this.d;
        if (l2 < this.e) {
            float f2 = (float)l2 / (float)this.e;
            this.a = Hw.a(this.b, this.c, f2);
        } else {
            this.a = this.c;
        }
    }
}

