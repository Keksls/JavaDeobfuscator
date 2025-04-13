/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from acN
 */
class acn_0 {
    private int a;
    private int b;
    private int c;
    private int d;
    boolean e = true;

    acn_0() {
        this.a();
    }

    void a() {
        this.d = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.a = Integer.MAX_VALUE;
        this.e = true;
    }

    public boolean a(int n, int n2, int n3, int n4) {
        boolean bl = this.e = this.a != n || this.b != n2 || this.c != n3 || this.d != n4;
        if (this.e) {
            this.a = n;
            this.b = n2;
            this.c = n3;
            this.d = n4;
        }
        return this.e;
    }
}

