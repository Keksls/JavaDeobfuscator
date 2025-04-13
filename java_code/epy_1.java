/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epY
 */
public enum epy_1 implements aqk_2
{
    a(1, "Ecosyst\u00e8me"),
    b(2, "Donjon"),
    c(3, "Sp\u00e9cial"),
    d(4, "Principale"),
    e(5, "Arcade");

    private final byte f;
    private final String g;

    private epy_1(byte by, String string2) {
        this.f = by;
        this.g = string2;
    }

    @Override
    public String d() {
        return String.valueOf(this.f);
    }

    @Override
    public String e() {
        return this.g;
    }

    @Override
    public String f() {
        return null;
    }

    public static epy_1 a(byte by) {
        for (epy_1 epy_12 : epy_1.values()) {
            if (epy_12.f != by) continue;
            return epy_12;
        }
        return null;
    }
}

