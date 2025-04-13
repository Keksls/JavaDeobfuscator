/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from afH
 */
final class afh_0 {
    byte a;
    byte b;
    int c;
    int d;
    int e;

    afh_0() {
        this.a();
    }

    void a() {
        this.a = 0;
        this.b = 0;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
    }

    public boolean b() {
        return this.e != Integer.MAX_VALUE;
    }

    boolean a(int n, int n2, int n3) {
        return this.c == n && this.d == n2 && this.e == n3;
    }

    public void b(int n, int n2, int n3) {
        this.c = n;
        this.d = n2;
        this.e = n3;
    }

    public String toString() {
        return "{" + this.c + "," + this.d + "," + this.e + "}";
    }
}

