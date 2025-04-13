/*
 * Decompiled with CFR 0.152.
 */
class ZM {
    final ZL a;
    private float b = 1.0f;
    private final int c;

    ZM(ZL zL, int n) {
        this.a = zL;
        this.c = n;
    }

    public int a() {
        return this.c;
    }

    public float b() {
        return this.b;
    }

    public void a(float f2) {
        this.b = f2;
    }

    public final void a(int n) {
        this.a.a(n);
    }

    public final boolean c() {
        return this.b > 0.0f;
    }
}

