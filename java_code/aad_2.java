/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAd
 */
public class aad_2 {
    private int a;
    private int b;
    private int c;
    private int d;

    public aad_2(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public final int a() {
        return this.a;
    }

    public final void a(int n) {
        this.a = n;
    }

    public final int b() {
        return this.b;
    }

    public final void b(int n) {
        this.b = n;
    }

    public final int c() {
        return this.c;
    }

    public final void c(int n) {
        this.c = n;
    }

    public final int d() {
        return this.d;
    }

    public final void d(int n) {
        this.d = n;
    }

    public final float e() {
        return (float)(this.c() - this.a()) * 0.5f;
    }

    public final float f() {
        return (float)(this.d() - this.b()) * 0.5f;
    }

    public final aad_2 g() {
        return new aad_2(this.a, this.b, this.c, this.d);
    }

    public final void a(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public final boolean b(int n, int n2, int n3, int n4) {
        return this.a == n && this.b == n2 && this.c == n3 && this.d == n4;
    }
}

