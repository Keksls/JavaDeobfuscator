/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anb
 */
public interface anb_0 {
    public static final float a = 1.0f;

    public float c();

    public float d();

    default public float i() {
        if (this.c() == this.d()) {
            return this.c();
        }
        return Hw.a(this.c(), this.d());
    }
}

