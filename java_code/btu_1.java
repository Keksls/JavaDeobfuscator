/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from btu
 */
public enum btu_1 {
    a(btw_1.a().a(0)),
    b(btw_1.a().a(1).b(12179).d(true)),
    c(btw_1.a().a(1).b(13446).d(true)),
    d(btw_1.a().a(1).b(13829).d(true)),
    e(btw_1.a().a(2).b(12165).a(true)),
    f(btw_1.a().a(3).b(true)),
    g(btw_1.a().a(3).b(true)),
    h(btw_1.a().a(3).c(true)),
    i(btw_1.a().a(3).c(true)),
    j(btw_1.a().a(3).c(true)),
    k(btw_1.a().a(3).c(true));

    private btw_1 l;

    private btu_1(btw_1 btw_12) {
        this.l = btw_12;
    }

    public int a() {
        return this.l.a;
    }

    public int b() {
        return this.l.b;
    }

    public boolean c() {
        return this.l.d;
    }

    public boolean d() {
        return this.l.e;
    }

    public boolean e() {
        return this.l.f;
    }

    public static btu_1 a(byte by) {
        switch (by) {
            case 0: {
                return h;
            }
            case 1: {
                return i;
            }
            case 2: {
                return j;
            }
            case 3: {
                return k;
            }
        }
        throw new IllegalArgumentException("Invalid index provided : " + by);
    }

    public static byte a(btu_1 btu_12) {
        switch (btu_12) {
            case h: {
                return 0;
            }
            case i: {
                return 1;
            }
            case j: {
                return 2;
            }
            case k: {
                return 3;
            }
        }
        return -1;
    }
}

