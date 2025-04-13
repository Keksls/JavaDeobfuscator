/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTk
 */
public final class etk_1 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public void a(int n) {
        this.c += n;
    }

    public void b(int n) {
        this.d = n;
    }

    public void c(int n) {
        this.a += n;
    }

    public void d(int n) {
        this.b += n;
    }

    public int a() {
        return Hw.a(-100, this.c + this.d, new int[0]);
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public void e(int n) {
        this.e = n;
    }

    public int e() {
        return this.e;
    }
}

