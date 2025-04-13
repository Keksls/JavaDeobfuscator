/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXX
 */
class exx_1 {
    byte a;
    String b;
    byte c;
    int d;
    int e;
    String f;

    private exx_1() {
    }

    static exx_1 a() {
        return new exx_1();
    }

    exx_1 a(byte by) {
        this.a = by;
        return this;
    }

    exx_1 a(String string) {
        this.b = string;
        return this;
    }

    exx_1 b(byte by) {
        this.c = by;
        return this;
    }

    exx_1 a(int n) {
        this.d = n;
        return this;
    }

    exx_1 b(int n) {
        this.e = n;
        return this;
    }

    exx_1 b(String string) {
        this.f = string;
        return this;
    }
}

