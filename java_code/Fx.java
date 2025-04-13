/*
 * Decompiled with CFR 0.152.
 */
public class Fx {
    private float a = 1.0f;
    private float b;
    private float c;
    private float d = 1.0f;
    private float e;
    private float f;
    private boolean g = true;
    private boolean h = true;
    private float i = 1.0f;
    private float j = 1.0f;
    private float k = 1.0f;
    private float l = 1.0f;
    private byte m;

    public final void a() {
        this.g = true;
        this.a = 1.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 1.0f;
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.g = f2 == 1.0f && f3 == 0.0f && f4 == 0.0f && f5 == 1.0f;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    public final void a(float f2, float f3) {
        this.h = f2 == 0.0f && f3 == 0.0f;
        this.e = f2;
        this.f = f3;
    }

    public final boolean b() {
        return this.a != 1.0f || this.b != 0.0f || this.c != 0.0f || this.d != 1.0f;
    }

    public final boolean c() {
        return this.e != 0.0f || this.f != 0.0f;
    }

    public float d() {
        return this.a;
    }

    public void a(float f2) {
        this.a = f2;
    }

    public float e() {
        return this.b;
    }

    public void b(float f2) {
        this.b = f2;
    }

    public float f() {
        return this.c;
    }

    public void c(float f2) {
        this.c = f2;
    }

    public float g() {
        return this.d;
    }

    public void d(float f2) {
        this.d = f2;
    }

    public float h() {
        return this.e;
    }

    public void e(float f2) {
        this.e = f2;
    }

    public float i() {
        return this.f;
    }

    public void f(float f2) {
        this.f = f2;
    }

    public boolean j() {
        return this.g;
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    public boolean k() {
        return this.h;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    public float l() {
        return this.i;
    }

    public void g(float f2) {
        this.i = f2;
    }

    public float m() {
        return this.j;
    }

    public void h(float f2) {
        this.j = f2;
    }

    public float n() {
        return this.k;
    }

    public void i(float f2) {
        this.k = f2;
    }

    public float o() {
        return this.l;
    }

    public void j(float f2) {
        this.l = f2;
    }

    public byte p() {
        return this.m;
    }

    public void a(byte by) {
        this.m = by;
    }
}

