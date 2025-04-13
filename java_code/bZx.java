/*
 * Decompiled with CFR 0.152.
 */
class bZx {
    protected final int a;
    protected final byte b;
    protected final String c;
    protected final int d;
    protected final epq_1 e;
    protected final byte f;

    public bZx(epq_1 epq_12, int n, String string, byte by, byte by2, int n2) {
        this.e = epq_12;
        this.d = n;
        this.c = string;
        this.f = by;
        this.b = by2;
        this.a = n2;
    }

    public epq_1 a() {
        return this.e;
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.c;
    }

    public byte d() {
        return this.f;
    }

    public boolean e() {
        return this.b == 1;
    }

    public boolean f() {
        return this.b == 2;
    }

    public boolean g() {
        return this.b == 0;
    }

    public boolean h() {
        return this.b == 5;
    }

    public int i() {
        return this.a;
    }
}

