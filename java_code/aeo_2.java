/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEO
 */
public class aeo_2 {
    private int a;
    private int b;

    public aeo_2(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public int a() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public int b() {
        return this.b;
    }

    public void b(int n) {
        this.b = n;
    }

    public boolean c(int n) {
        return n >= this.a && n <= this.b;
    }

    public boolean d(int n) {
        return n > this.b;
    }

    public boolean e(int n) {
        return n < this.a;
    }

    public int c() {
        return this.a + (this.b - this.a) / 2;
    }
}

