/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from atM
 */
public enum atm_1 {
    a("none", 0),
    b("Peau", 1),
    c("Cheveux", 2),
    d("SymbolBg", 3),
    e("SymbolFg", 4),
    f("SymbolBorder", 5),
    g("Color_1", 6),
    h("Color_2", 7),
    i("Pupille", 8),
    j("Vetement", 9),
    k("ColorCostume1", 10),
    l("ColorCostume2", 11),
    m("ColorCostume3", 12),
    n("ColorCostume4", 13),
    o("ColorCostume5", 14),
    p("ColorCostume6", 15);

    public static final List<atm_1> q;
    private final String r;
    private final int s;

    private atm_1(String string2, int n2) {
        this.r = string2;
        this.s = n2;
    }

    public static atm_1 a(String string) {
        for (atm_1 atm_12 : atm_1.values()) {
            if (!atm_12.r.equalsIgnoreCase(string)) continue;
            return atm_12;
        }
        return a;
    }

    public static atm_1 a(int n) {
        for (atm_1 atm_12 : atm_1.values()) {
            if (atm_12.s != n) continue;
            return atm_12;
        }
        return a;
    }

    public String a() {
        return this.r;
    }

    public int b() {
        return this.s;
    }

    public static boolean a(atm_1 atm_12) {
        return q.contains((Object)atm_12);
    }

    static {
        q = List.of(k, l, m, n, o, p);
    }
}

