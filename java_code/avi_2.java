/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from avi
 */
public class avi_2 {
    public static final avi_2 a = new avi_2(1.0f, 1.0f, 1.0f);
    public static final avi_2 b = new avi_2(0.0f, 0.0f, 0.0f);
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    protected int i;
    protected int j;

    public avi_2(avi_2 avi_22) {
        this(avi_22.c, avi_22.d, avi_22.e);
    }

    public avi_2(float f2, float f3, float f4) {
        this.f = this.c = f2;
        this.g = this.d = f3;
        this.h = this.e = f4;
        this.j = 0;
        this.i = 0;
    }

    public float a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.e;
    }

    public void a(float f2, float f3, float f4, int n) {
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.j = n;
        this.i = 0;
    }

    public void a(float f2, float f3, float f4) {
        this.c = this.f = f2;
        this.d = this.g = f3;
        this.e = this.h = f4;
        this.j = 0;
        this.i = 0;
    }

    public void a(int n) {
        if (this.j == 0) {
            return;
        }
        this.i += n;
        if (this.i < this.j) {
            float f2 = (float)this.i / (float)this.j;
            this.c = Hw.a(this.c, this.f, f2);
            this.d = Hw.a(this.d, this.g, f2);
            this.e = Hw.a(this.e, this.h, f2);
        } else {
            this.c = this.f;
            this.d = this.g;
            this.e = this.h;
            this.j = 0;
        }
    }

    public boolean d() {
        return this.j != 0;
    }

    public String toString() {
        return "{" + this.c + " ; " + this.d + " ; " + this.e + "}";
    }
}

