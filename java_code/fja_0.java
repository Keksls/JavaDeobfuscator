/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fja
 */
public class fja_0 {
    private final fjb_0 a;
    private float b;

    public fja_0(fjb_0 fjb_02) {
        this.a = fjb_02;
        this.b = fjb_02.c;
    }

    public fja_0(fjb_0 fjb_02, float f2) {
        this(fjb_02);
        this.b = f2;
    }

    public long a(long l) {
        return Math.round((double)l * (double)this.b);
    }

    public float a() {
        return this.b;
    }

    public void a(float f2) {
        this.b = Math.max(Math.min(f2, this.a.e), this.a.d);
    }

    public fjb_0 b() {
        return this.a;
    }
}

