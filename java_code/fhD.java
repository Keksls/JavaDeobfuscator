/*
 * Decompiled with CFR 0.152.
 */
public enum fhD {
    a(0),
    b(1, 10, 0.2f, 1.25f),
    c(2, 10, 1.0f, 1.5f);

    private final byte d;
    private byte e;
    private float f = 1.0f;
    private float g = 0.0f;

    private fhD(int n2) {
        this.d = (byte)n2;
    }

    private fhD(int n2, int n3, float f2, float f3) {
        this.d = (byte)n2;
        this.e = (byte)n3;
        this.g = f2;
        this.f = f3;
    }

    public byte a() {
        return this.d;
    }

    public byte b() {
        return this.e;
    }

    public float c() {
        return this.f;
    }

    public float d() {
        return this.g;
    }

    public static fhD a(int n) {
        if (n <= 0) {
            return a;
        }
        if (n == fhD.b.d) {
            return b;
        }
        if (n == fhD.c.d) {
            return c;
        }
        return a;
    }
}

