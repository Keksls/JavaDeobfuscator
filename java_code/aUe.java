/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

public enum aUe implements aUW
{
    a("local"),
    b("whisp"),
    c("party"),
    d("guild"),
    e("trade"),
    f("battleground"),
    g("intergame"),
    h("politic"),
    i("public politic", "(" + bae.h().a("publicChannel", new Object[0]) + ")"),
    j("admin"),
    k("defaultCommunity"),
    l("frCommunity", Ow.a),
    m("enCommunity", Ow.b),
    n("esCommunity", Ow.c),
    o("ptCommunity", Ow.d),
    p("defaultRecruitment"),
    q("frRecruitment", Ow.a),
    r("enRecruitment", Ow.b),
    s("esRecruitment", Ow.c),
    t("ptRecruitment", Ow.d);

    public static final List<aUe> u;
    public static final List<aUe> v;
    private final String w;
    private final String x;
    private final Ow y;

    private aUe(String string2) {
        this(string2, null, null);
    }

    private aUe(String string2, String string3) {
        this(string2, string3, null);
    }

    private aUe(String string2, Ow ow) {
        this(string2, null, ow);
    }

    private aUe(String string2, String string3, Ow ow) {
        this.x = string2;
        this.w = string3;
        this.y = ow;
    }

    @Override
    public String a() {
        return this.w;
    }

    @Override
    public String b() {
        return this.x;
    }

    @Override
    public Ow c() {
        return this.y;
    }

    @Override
    public boolean d() {
        return this == h || this == i;
    }

    public static aUe a(String string) {
        for (aUe aUe2 : aUe.values()) {
            if (!aUe2.x.equals(string)) continue;
            return aUe2;
        }
        return null;
    }

    @Nullable
    public static aUe a(Ow ow) {
        for (aUe aUe2 : u) {
            if (aUe2.y != ow) continue;
            return aUe2;
        }
        return null;
    }

    @Nullable
    public static aUe b(Ow ow) {
        for (aUe aUe2 : v) {
            if (aUe2.y != ow) continue;
            return aUe2;
        }
        return null;
    }

    static {
        u = List.of(l, m, n, o);
        v = List.of(q, r, s, t);
    }
}

