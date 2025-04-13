/*
 * Decompiled with CFR 0.152.
 */
public class agB {
    private static final agB c = new agB();
    public static final float a = 1.0f;
    public static final float b = 1.2f;
    private static final float d = 2.2f;
    private static final float e = 0.5f;
    private static final float f = 10.0f;
    private float g = 1.0f;
    private float h = 2.2f;

    private agB() {
    }

    public static agB a() {
        return c;
    }

    public float b() {
        return this.g;
    }

    public float c() {
        return this.h;
    }

    public void a(float f2) {
        this.g = f2;
    }

    public void b(float f2) {
        this.h = f2;
    }

    public void d() {
        this.g = 1.0f;
        this.h = 2.2f;
    }

    public void e() {
        this.g = 0.5f;
        this.h = 10.0f;
    }
}

