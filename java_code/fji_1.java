/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJI
 */
public class fji_1 {
    private fjg_1 a;
    private fjg_1 b;
    private float[] c;

    public fji_1(fjg_1 fjg_12, fjg_1 fjg_13, float f2, float f3, float f4, float f5) {
        this.a = fjg_12;
        this.b = fjg_13;
        this.c = new float[]{f2, f3, f4, f5};
    }

    public void a(fjg_1 fjg_12) {
        this.a = fjg_12;
    }

    public void b(fjg_1 fjg_12) {
        this.b = fjg_12;
    }

    public void a(float[] fArray) {
        this.c = fArray;
    }

    public fjg_1 a() {
        return this.a;
    }

    public fjg_1 b() {
        return this.b;
    }

    public float[] c() {
        return this.c;
    }
}

