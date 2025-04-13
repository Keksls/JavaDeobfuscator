/*
 * Decompiled with CFR 0.152.
 */
public enum fjv implements aqk_2
{
    a(1),
    b(2),
    c(3),
    d(4),
    e(5),
    f(6);

    private final byte g;

    private fjv(byte by) {
        this.g = by;
    }

    public byte a() {
        return this.g;
    }

    public static fjv a(byte by) {
        fjv[] fjvArray = fjv.values();
        for (int k = 0; k < fjvArray.length; ++k) {
            fjv fjv2 = fjvArray[k];
            if (fjv2.g != by) continue;
            return fjv2;
        }
        return null;
    }

    public String toString() {
        return this.name() + " (" + this.g + ")";
    }

    @Override
    public String d() {
        return String.valueOf(this.g);
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

