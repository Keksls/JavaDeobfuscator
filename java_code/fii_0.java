/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fiI
 */
public enum fii_0 implements aqk_2
{
    a(-1),
    b(0),
    c(1);

    private final byte d;

    public static fii_0 a(byte by) {
        for (fii_0 fii_02 : fii_0.values()) {
            if (fii_02.d != by) continue;
            return fii_02;
        }
        return b;
    }

    private fii_0(byte by) {
        this.d = by;
    }

    @Override
    public String d() {
        return Byte.toString(this.d);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return null;
    }
}

