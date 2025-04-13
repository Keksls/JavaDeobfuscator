/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eof
 */
public enum eof_0 implements aqk_2
{
    a(0, "Challenge de base"),
    b(1, "Challenge \u00e0 acheter"),
    c(2, "Challenge de Chaos"),
    d(3, "Challenge d'ecosysteme");

    private final byte e;
    private final String f;

    private eof_0(byte by, String string2) {
        this.e = by;
        this.f = string2;
    }

    public static eof_0 a(byte by) {
        for (eof_0 eof_02 : eof_0.values()) {
            if (eof_02.e != by) continue;
            return eof_02;
        }
        return null;
    }

    public byte a() {
        return this.e;
    }

    @Override
    public String d() {
        return String.valueOf(this.e);
    }

    @Override
    public String e() {
        return this.f;
    }

    @Override
    public String f() {
        return null;
    }
}

