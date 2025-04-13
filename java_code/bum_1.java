/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bum
 */
public enum bum_1 implements aqk_2,
aqs_2
{
    a(1, buj_1.b),
    b(2, bul_1.b),
    c(3, buk_1.b),
    d(4, buf_0.b),
    e(5, buh_1.b),
    f(6, bug_0.b);

    private final int g;
    private final aqr_2 h;

    private bum_1(int n2, aqr_2 aqr_22) {
        this.g = n2;
        this.h = aqr_22;
    }

    @Override
    public String d() {
        return Integer.toString(this.g);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return null;
    }

    @Override
    public aqr_2 c_() {
        return this.h;
    }

    public int a() {
        return this.g;
    }

    public static bue_0 a(int n, int n2) {
        if (n == a.a()) {
            return new buj_1(n2);
        }
        if (n == b.a()) {
            return new bul_1(n2);
        }
        if (n == c.a()) {
            return new buk_1(n2);
        }
        if (n == d.a()) {
            return new buf_0(n2);
        }
        if (n == e.a()) {
            return new buh_1(n2);
        }
        if (n == f.a()) {
            return new bug_0(n2);
        }
        return null;
    }
}

