/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bty
 */
public class bty_0
implements ajh_1 {
    public static final String a = "type";
    public static final String b = "name";
    public static final String d = "color";
    public static final String e = "iconUrl";
    public static final String f = "sublimationName";
    public static final String g = "specialSublimationName";
    public static final String h = "formattedSpecialSublimationName";
    public static final String i = "shardsDisplayer";
    public static final String j = "randomElementsText";
    public static final String k = "shardEffectsText";
    public static final String l = "doubleBonusSlotsIcons";
    public static final String m = "doubleBonusSlotsText";
    private static final String n = "hasSublimation";
    private static final String o = "hasSpecialSublimation";
    private btz_0 p;
    private String q;
    private String r;
    private String s;
    private bia_0 t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;
    private String A;
    private exk_2 B;
    private int C;

    public bty_0 a(exk_2 exk_22) {
        this.B = exk_22;
        this.p = btz_0.a;
        this.q = exk_22.N();
        this.s = azs_0.a().f(exk_22.I());
        if (exk_22.y()) {
            eZw eZw2 = exk_22.C();
            this.t = new bia_0(exk_22);
            int n = eZw2.l();
            this.u = n > 0 ? bae.h().a(15, (long)n, new Object[0]) : null;
            int n2 = eZw2.n();
            if (n2 > 0) {
                ezf_0 ezf_02;
                this.v = bae.h().a(15, (long)n2, new Object[0]);
                Object r2 = eyo_1.g().d(n2);
                if (r2 != null && (ezf_02 = ((ezr_0)r2).aa()) != null) {
                    exw_1 exw_12 = ezf_02.b() == ezh_0.b ? exw_1.f : exw_1.h;
                    this.w = new ani_2().i().a(bhc_0.b(exw_12)).a((CharSequence)((ezr_0)r2).e()).j().r();
                }
            } else {
                this.v = null;
                this.w = null;
            }
        }
        this.x = bhv_1.f(exk_22);
        return this;
    }

    public bty_0 a(ezr_0 ezr_02) {
        eZu eZu2 = ezr_02.ab();
        if (eZu2 == null) {
            throw new IllegalStateException("Trying to initialize a search result but provided reference has no ShardDefinition : " + ezr_02);
        }
        this.C = ezr_02.n();
        this.p = btz_0.b;
        this.q = ezr_02.e();
        this.r = bae.h().a(eZu2.c().name().toLowerCase(), new Object[0]);
        this.s = azs_0.a().f(ezr_02.C());
        this.y = bht_1.a(ezr_02, null, (short)0).stream().findFirst().orElse("");
        this.z = bta_1.a(eZu2);
        this.A = bta_1.b(eZu2);
        return this;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.p.a();
        }
        if (string.equals(b)) {
            return this.q;
        }
        if (string.equals(d)) {
            return this.r;
        }
        if (string.equals(e)) {
            return this.s;
        }
        if (string.equals(i)) {
            return this.t;
        }
        if (string.equals(f)) {
            return this.u;
        }
        if (string.equals(g)) {
            return this.v;
        }
        if (string.equals(h)) {
            return this.w;
        }
        if (string.equals(j)) {
            return this.x;
        }
        if (string.equals(k)) {
            return this.y;
        }
        if (string.equals(l)) {
            return this.z;
        }
        if (string.equals(m)) {
            return this.A;
        }
        if (string.equals(n)) {
            return !Cz.f(this.u);
        }
        if (string.equals(o)) {
            return !Cz.f(this.v);
        }
        return null;
    }

    public exk_2 a() {
        return this.B;
    }

    public btz_0 b() {
        return this.p;
    }

    public int c() {
        return this.C;
    }
}

