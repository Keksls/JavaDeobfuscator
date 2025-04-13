/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIG
 */
public enum big_0 implements aqk_2
{
    a(0, "useTertiary", "desc.mru.use"),
    b(1, "moveTertiary", "desc.splitItem"),
    c(2, "useTertiary", "desc.addCompass");

    private final byte d;
    private final String e;
    private final String f;

    private big_0(byte by, String string2, String string3) {
        this.d = by;
        this.e = string2;
        this.f = string3;
    }

    public static big_0 a(byte by) {
        for (big_0 big_02 : big_0.values()) {
            if (big_02.d != by) continue;
            return big_02;
        }
        return null;
    }

    public byte a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    @Override
    public String d() {
        return String.valueOf(this.d);
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

