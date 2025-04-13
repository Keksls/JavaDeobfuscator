/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLJ
 */
public class alj_1 {
    public static float a = 0.4f;
    public static float b = 700.0f;
    private float c = 0.0f;
    private float d = a;
    private float e = b;
    private final ald_1 f;

    public alj_1(ald_1 ald_12) {
        this.f = ald_12;
    }

    public void a() {
        if (this.f == null) {
            return;
        }
        this.c = this.f.a();
        this.f.a(this.d * this.f.a(), this.e);
    }

    public void b() {
        if (this.f == null) {
            return;
        }
        this.f.a(this.c, this.e);
    }

    public void a(float f2) {
        this.d = f2;
    }

    public void b(float f2) {
        this.e = f2;
    }

    public void c() {
        this.d = a;
    }

    public void d() {
        this.e = b;
    }
}

