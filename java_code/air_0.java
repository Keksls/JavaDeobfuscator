/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from air
 */
public class air_0 {
    private int a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;

    public void a(float f2) {
        this.e = f2;
    }

    public void b(float f2) {
        this.d = f2;
    }

    public void c(float f2) {
        this.c = this.f = f2;
        this.b = this.f;
    }

    public float a() {
        return this.f;
    }

    public void d(float f2) {
        this.b = f2;
        this.a = 0;
    }

    public void e(float f2) {
        this.c = f2;
        this.b = this.f;
        this.a = 0;
    }

    public float b() {
        return this.c;
    }

    public float a(int n) {
        if (Math.abs(this.c - this.f) < this.e) {
            this.c(this.c);
            return this.c;
        }
        this.a += n;
        float f2 = (float)this.a * this.d / 1000.0f;
        if (f2 > 1.0f) {
            this.f = this.c;
        } else {
            float f3 = Hw.f(f2 * 1.5707964f);
            this.f = this.b + (this.c - this.b) * f3;
        }
        return this.f;
    }
}

