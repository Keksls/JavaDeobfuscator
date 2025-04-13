/*
 * Decompiled with CFR 0.152.
 */
public enum fhi implements aqk_2
{
    a(50),
    b(80),
    c(110),
    d(140),
    e(170),
    f(200),
    g(230),
    h(245);

    private final int i;

    private fhi(int n2) {
        this.i = n2;
    }

    public static fhi a(int n) {
        fhi[] fhiArray;
        for (fhi fhi2 : fhiArray = fhi.values()) {
            if (fhi2.i != n) continue;
            return fhi2;
        }
        return null;
    }

    public int a() {
        return this.i;
    }

    public int b() {
        int n = this.ordinal();
        if (n <= 0) {
            return 0;
        }
        return fhi.values()[n - 1].i + 1;
    }

    public int c() {
        return this.i;
    }

    @Override
    public String d() {
        return String.valueOf(this.i);
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return null;
    }
}

