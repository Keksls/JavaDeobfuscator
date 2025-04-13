/*
 * Decompiled with CFR 0.152.
 */
public class aes {
    private static final float d = 2.0f;
    public static final int a = azf_2.o.i();
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;
    public final boolean b;
    public final boolean c;
    private final float[] n = new float[]{0.0f, 0.0f, 0.0f};
    private final float[] o;

    public aes(int n, int n2, int n3, boolean bl) {
        float[] fArray;
        this.e = azj_2.f(n) * 2.0f;
        this.f = azj_2.e(n) * 2.0f;
        this.g = azj_2.d(n) * 2.0f;
        this.c = n2 != a;
        this.h = azj_2.f(n2);
        this.i = azj_2.e(n2);
        this.j = azj_2.d(n2);
        if (n3 == a) {
            fArray = null;
        } else {
            float[] fArray2 = new float[3];
            fArray2[0] = 0.0f;
            fArray2[1] = 0.0f;
            fArray = fArray2;
            fArray2[2] = 0.0f;
        }
        this.o = fArray;
        this.k = azj_2.f(n3) - 0.5f;
        this.l = azj_2.e(n3) - 0.5f;
        this.m = azj_2.d(n3) - 0.5f;
        this.b = bl;
    }

    public aes(aes aes2) {
        float[] fArray;
        this.e = aes2.e;
        this.f = aes2.f;
        this.g = aes2.g;
        this.h = aes2.h;
        this.i = aes2.i;
        this.j = aes2.j;
        this.k = aes2.k;
        this.l = aes2.l;
        this.m = aes2.m;
        this.b = aes2.b;
        this.c = aes2.c;
        if (aes2.o == null) {
            fArray = null;
        } else {
            float[] fArray2 = new float[3];
            fArray2[0] = 0.0f;
            fArray2[1] = 0.0f;
            fArray = fArray2;
            fArray2[2] = 0.0f;
        }
        this.o = fArray;
        System.arraycopy(aes2.n, 0, this.n, 0, this.n.length);
    }

    final void a() {
        this.n[0] = this.e;
        this.n[1] = this.f;
        this.n[2] = this.g;
        if (this.o != null) {
            this.o[2] = 0.0f;
            this.o[1] = 0.0f;
            this.o[0] = 0.0f;
        }
    }

    final void a(float f2) {
        if (f2 <= 0.0f || !this.c) {
            this.n[0] = this.e;
            this.n[1] = this.f;
            this.n[2] = this.g;
            return;
        }
        float f3 = this.e;
        float f4 = this.f;
        float f5 = this.g;
        float f6 = f2 * 2.0f;
        float f7 = -f2 + 1.0f;
        f3 *= this.h * f6 + f7;
        f4 *= this.i * f6 + f7;
        f5 *= this.j * f6 + f7;
        f3 = Hw.b(f3, 0.0f, 2.0f);
        f4 = Hw.b(f4, 0.0f, 2.0f);
        f5 = Hw.b(f5, 0.0f, 2.0f);
        this.n[0] = f3;
        this.n[1] = f4;
        this.n[2] = f5;
    }

    final void b(float f2) {
        if (this.o == null) {
            return;
        }
        if (f2 > 0.0f) {
            float f3 = f2 * 2.0f;
            this.o[0] = this.k * f3;
            this.o[1] = this.l * f3;
            this.o[2] = this.m * f3;
        } else {
            this.o[2] = 0.0f;
            this.o[1] = 0.0f;
            this.o[0] = 0.0f;
        }
    }

    public final float[] b() {
        return this.n;
    }

    public final float[] c() {
        return this.o;
    }

    public final boolean d() {
        return this.o != null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        aes aes2 = (aes)object;
        if (this.b != aes2.b) {
            return false;
        }
        if (!Hw.d(aes2.g, this.g)) {
            return false;
        }
        if (!Hw.d(aes2.f, this.f)) {
            return false;
        }
        if (!Hw.d(aes2.e, this.e)) {
            return false;
        }
        if (this.c != aes2.c) {
            return false;
        }
        if (!Hw.d(aes2.m, this.m)) {
            return false;
        }
        if (!Hw.d(aes2.l, this.l)) {
            return false;
        }
        if (!Hw.d(aes2.k, this.k)) {
            return false;
        }
        if (!Hw.d(aes2.j, this.j)) {
            return false;
        }
        if (!Hw.d(aes2.i, this.i)) {
            return false;
        }
        return Hw.d(aes2.h, this.h);
    }
}

