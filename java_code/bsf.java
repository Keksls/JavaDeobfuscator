/*
 * Decompiled with CFR 0.152.
 */
public enum bsf implements aqk_2
{
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(7),
    i(8),
    j(9);

    private final int k;

    private bsf(int n2) {
        this.k = n2;
    }

    public int a() {
        return this.k;
    }

    @Override
    public String d() {
        return Integer.toString(this.k);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return null;
    }

    public static bsf a(byte by) {
        for (bsf bsf2 : bsf.values()) {
            if (bsf2.k != by) continue;
            return bsf2;
        }
        return a;
    }
}

