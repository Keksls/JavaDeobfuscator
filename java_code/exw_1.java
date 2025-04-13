/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from eXW
 */
public enum exw_1 implements aqk_2
{
    a(exx_1.a().a((byte)0).a("Qualit\u00e9 commune (gris)").b((byte)1).a(1).b(16).b("old")),
    b(exx_1.a().a((byte)1).a("Inhabituel (blanc)").b((byte)2).a(1).b(32).b("common")),
    c(exx_1.a().a((byte)2).a("Qualit\u00e9 rare (vert)").b((byte)3).a(8).b(53).b("rare")),
    d(exx_1.a().a((byte)3).a("Mythique (orange)").b((byte)4).a(32).b(80).b("mythic")),
    e(exx_1.a().a((byte)4).a("L\u00e9gendaire (jaune)").b((byte)5).a(128).b(200).b("legendary")),
    f(exx_1.a().a((byte)5).a("Relique (violet)").b((byte)8).a(1024).b(1500).b("relic")),
    g(exx_1.a().a((byte)6).a("Souvenir (turquoise)").b((byte)6).a(128).b(80).b("souvenir")),
    h(exx_1.a().a((byte)7).a("Epique (rose)").b((byte)7).a(1024).b(400).b("epic")),
    i(exx_1.a().a((byte)10).a("Administrateur (rouge)").b((byte)10).a(1).b("admin"));

    private static final String j = "RarityBorder";
    private static final String k = "RarityHoverBorder";
    private static final String l = "RarityPressedBorder";
    private static final String m = "RarityDisabledBorder";
    private static final String n = "RarityColor";
    private final exx_1 o;
    private static final Comparator<exw_1> p;
    private static final Comparator<exw_1> q;

    private exw_1(exx_1 exx_12) {
        this.o = exx_12;
    }

    public byte a() {
        return this.o.a;
    }

    @Override
    public String d() {
        return String.valueOf(this.o.a);
    }

    @Override
    public String e() {
        return this.o.b;
    }

    @Override
    public String f() {
        return null;
    }

    public byte b() {
        return this.o.c;
    }

    public int c() {
        return this.o.d;
    }

    public int g() {
        return this.o.e;
    }

    public String h() {
        return this.o.f + j;
    }

    public String i() {
        return this.o.f + j;
    }

    public String j() {
        return this.o.f + k;
    }

    public String k() {
        return this.o.f + l;
    }

    public String l() {
        return this.o.f + m;
    }

    public String m() {
        return this.o.f + n;
    }

    public static Comparator<exw_1> n() {
        return p;
    }

    public static Comparator<exw_1> o() {
        return q;
    }

    public exw_1 p() {
        Object[] objectArray = exw_1.values();
        Arrays.sort(objectArray, p);
        int n = ArrayUtils.indexOf((Object[])objectArray, (Object)this);
        return n == 0 ? null : objectArray[n - 1];
    }

    public static exw_1 a(short s2) {
        for (exw_1 exw_12 : exw_1.values()) {
            if (exw_12.o.a != s2) continue;
            return exw_12;
        }
        return a;
    }

    static {
        p = (exw_12, exw_13) -> {
            if (exw_12 == exw_13) {
                return 0;
            }
            if (exw_12 == null) {
                return 1;
            }
            if (exw_13 == null) {
                return -1;
            }
            return Integer.signum(exw_13.o.c - exw_12.o.c);
        };
        q = (exw_12, exw_13) -> {
            if (exw_12 == exw_13) {
                return 0;
            }
            if (exw_12 == null) {
                return -1;
            }
            if (exw_13 == null) {
                return 1;
            }
            return Integer.signum(exw_12.o.c - exw_13.o.c);
        };
    }
}

