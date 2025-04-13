/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYH
 */
public enum eyh_1 implements aqk_2
{
    a(0, "Non li\u00e9", false, false, false),
    b(1, "Li\u00e9 au personnage quand \u00e9quip\u00e9", true, false, false),
    c(2, "Li\u00e9 au personnage quand ramass\u00e9", true, true, false),
    d(3, "Li\u00e9 au compte quand \u00e9quip\u00e9", false, false, false),
    e(4, "Li\u00e9 au compte quand ramass\u00e9", false, true, false),
    f(5, "Ne pas utiliser", true, false, true),
    g(6, "Ne pas utiliser", true, true, true),
    h(7, "Ne pas utiliser", false, false, true),
    i(8, "Ne pas utiliser", false, true, true);

    private final byte j;
    private final String k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final String o;

    private eyh_1(int n2, String string2, boolean bl, boolean bl2, boolean bl3) {
        this.l = bl;
        this.m = bl2;
        this.n = bl3;
        this.j = Hw.b((long)n2);
        this.k = string2;
        this.o = n2 == 0 ? "item.not.bound" : eyh_1.b(this.m, this.l);
    }

    private static String b(boolean bl, boolean bl2) {
        return "itemBoundType." + (bl2 ? "character" : "account") + "." + (bl ? "pickup" : "equip");
    }

    public byte a() {
        return this.j;
    }

    public boolean b() {
        return this.n;
    }

    public boolean c() {
        return this.m;
    }

    public boolean g() {
        return this.l;
    }

    public String h() {
        return this.o;
    }

    @Override
    public String d() {
        return String.valueOf(this.j);
    }

    @Override
    public String e() {
        return this.k;
    }

    @Override
    public String f() {
        return "";
    }

    public static eyh_1 a(byte by) {
        for (eyh_1 eyh_12 : eyh_1.values()) {
            if (eyh_12.j != by) continue;
            return eyh_12;
        }
        return a;
    }

    public static eyh_1 a(boolean bl, boolean bl2) {
        return eyh_1.a(bl, bl2, false);
    }

    public static eyh_1 a(boolean bl, boolean bl2, boolean bl3) {
        for (eyh_1 eyh_12 : eyh_1.values()) {
            if (eyh_12.l != bl2 || eyh_12.m != bl || eyh_12.n != bl3) continue;
            return eyh_12;
        }
        return null;
    }

    public static eyh_1 a(eyh_1 eyh_12, eyh_1 eyh_13) {
        if (eyh_12 == null && eyh_13 == null) {
            throw new IllegalStateException("Trying to compare 2 null bind types");
        }
        if (eyh_12 == null || eyh_12 == a) {
            return eyh_13;
        }
        if (eyh_13 == null || eyh_13 == a) {
            return eyh_12;
        }
        if (eyh_12 == eyh_13) {
            return eyh_12;
        }
        if (eyh_12.l && !eyh_13.l) {
            return eyh_12;
        }
        if (eyh_13.l && !eyh_12.l) {
            return eyh_13;
        }
        if (eyh_12 == e && eyh_13 == d) {
            return eyh_12;
        }
        if (eyh_13 == e && eyh_12 == d) {
            return eyh_12;
        }
        throw new IllegalStateException("Comparison between two binds but we can't define which is stronger, bind1 : " + eyh_12 + ", bind2 : " + eyh_13);
    }

    public String toString() {
        return "ItemBindType{m_id=" + this.j + ", m_desc='" + this.k + "', m_character=" + this.l + ", m_onPickup=" + this.m + ", m_isForced=" + this.n + ", m_translationKey='" + this.o + "'}";
    }
}

