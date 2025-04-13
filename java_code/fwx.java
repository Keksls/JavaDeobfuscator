/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class fwx
implements Comparable<fwx> {
    final short i;
    final short j;
    float a;
    float b;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    private fwx k;
    private fwx l;
    private fwx m;
    private fwx n;

    public fwx(short s2, short s3, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.i = s2;
        this.j = s3;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = f6;
        this.f = f7;
        this.g = f8;
        this.h = f9;
    }

    public short a() {
        return this.i;
    }

    public short b() {
        return this.j;
    }

    public float c() {
        return this.a;
    }

    public void a(float f2) {
        this.a = f2;
    }

    public float d() {
        return this.b;
    }

    public void b(float f2) {
        this.b = f2;
    }

    public float e() {
        return this.c;
    }

    public void c(float f2) {
        this.c = f2;
    }

    public float f() {
        return this.d;
    }

    public void d(float f2) {
        this.d = f2;
    }

    public float g() {
        return this.e;
    }

    public void e(float f2) {
        this.e = f2;
    }

    public float h() {
        return this.f;
    }

    public void f(float f2) {
        this.f = f2;
    }

    public float i() {
        return this.g;
    }

    public void g(float f2) {
        this.g = f2;
    }

    public float j() {
        return this.h;
    }

    public void h(float f2) {
        this.h = f2;
    }

    public int a(@NotNull fwx fwx2) {
        if (fwx2.j != this.j) {
            return this.j - fwx2.j;
        }
        return this.i - fwx2.i;
    }

    public fwx k() {
        return this.k;
    }

    public void b(fwx fwx2) {
        this.k = fwx2;
    }

    public fwx l() {
        return this.l;
    }

    public void c(fwx fwx2) {
        this.l = fwx2;
    }

    public fwx m() {
        return this.m;
    }

    public void d(fwx fwx2) {
        this.m = fwx2;
    }

    public fwx n() {
        return this.n;
    }

    public void e(fwx fwx2) {
        this.n = fwx2;
    }

    public float[] o() {
        return new float[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h};
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((fwx)object);
    }
}

