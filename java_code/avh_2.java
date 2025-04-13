/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from avh
 */
public abstract class avh_2 {
    protected float b;
    protected float c;
    protected float d;
    protected float e = 1.0f;
    protected float f = 1.0f;
    protected float g = 1.0f;
    protected float h = 3.0f;
    protected boolean i = true;
    protected boolean j = true;
    protected int k = 0;
    private static int a = 1;
    private final int l = avh_2.o();

    public avh_2() {
        this.b = Float.MAX_VALUE;
        this.c = Float.MAX_VALUE;
        this.d = Float.MAX_VALUE;
    }

    public final float c() {
        return this.h;
    }

    public final void a(float f2) {
        this.h = f2;
        this.j = true;
    }

    public final float d() {
        return this.i ? this.e : 0.0f;
    }

    public final void b(float f2) {
        this.e = f2;
        this.j = true;
    }

    public final float e() {
        return this.i ? this.f : 0.0f;
    }

    public final void c(float f2) {
        this.f = f2;
        this.j = true;
    }

    public final float f() {
        return this.i ? this.g : 0.0f;
    }

    public final void d(float f2) {
        this.g = f2;
        this.j = true;
    }

    public void a(float f2, float f3, float f4) {
        if (this.e == f2 && this.f == f3 && this.g == f4) {
            return;
        }
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.j = true;
    }

    public final void b(float f2, float f3, float f4) {
        this.e += f2;
        this.f += f3;
        this.g += f4;
        this.j = true;
    }

    public final boolean g() {
        return this.i;
    }

    public final void a(boolean bl) {
        if (this.i == bl) {
            return;
        }
        this.i = bl;
        this.j = true;
    }

    public final void h() {
        this.j = false;
    }

    public final void i() {
        this.j = true;
    }

    public final float j() {
        return this.b;
    }

    public final float k() {
        return this.c;
    }

    public final float l() {
        return this.d;
    }

    public final void e(float f2) {
        this.b = f2;
        this.j = true;
    }

    public final void f(float f2) {
        this.c = f2;
        this.j = true;
    }

    public final void g(float f2) {
        this.d = f2;
        this.j = true;
    }

    public final void c(float f2, float f3, float f4) {
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.j = true;
    }

    public int m() {
        return this.l;
    }

    public int n() {
        return this.k;
    }

    public void b(int n) {
        this.k = n;
    }

    public abstract boolean b();

    public abstract void a(int var1);

    public abstract boolean a(float var1, float var2, float var3, float[] var4);

    static int o() {
        if (a == Integer.MAX_VALUE) {
            a = 0;
        }
        return a++;
    }
}

