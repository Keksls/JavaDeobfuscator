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
 * Renamed from fjl
 */
public enum fjl_0 implements aqk_2
{
    a(fjm_0.a().a(0).a("Qualit\u00e9 commune (blanc)").a(azf_2.e).a((byte)1)),
    b(fjm_0.a().a(1).a("Qualit\u00e9 rare (vert)").a(new azf_2(0.0f, 0.75f, 0.0f, 1.0f)).a((byte)2)),
    c(fjm_0.a().a(2).a("Mythique (orange)").a(new azf_2(1.0f, 0.6f, 0.0f, 1.0f)).a((byte)3)),
    d(fjm_0.a().a(3).a("L\u00e9gendaire (jaune)").a(new azf_2(1.0f, 1.0f, 0.5f, 1.0f)).a((byte)4)),
    e(fjm_0.a().a(4).a("Epique (rose)").a(new azf_2(1.0f, 0.65f, 0.84f, 1.0f)).a((byte)5)),
    f(fjm_0.a().a(5).a("Relique (violet)").a(new azf_2(0.81f, 0.45f, 0.95f, 1.0f)).a((byte)6)),
    g(fjm_0.a().a(6).a("Souvenir (turquoise)").a(new azf_2(0.58f, 0.94f, 0.96f, 1.0f)).a((byte)7)),
    h(fjm_0.a().a(10).a("Administrateur (rouge)").a(azf_2.g).a((byte)11));

    private final fjm_0 i;
    private static final Comparator<fjl_0> j;
    private static final Comparator<fjl_0> k;

    private fjl_0(fjm_0 fjm_02) {
        this.i = fjm_02;
    }

    public int a() {
        return this.i.a;
    }

    @Override
    public String d() {
        return String.valueOf(this.i.a);
    }

    @Override
    public String e() {
        return this.i.b;
    }

    @Override
    public String f() {
        return null;
    }

    public azj_2 b() {
        return this.i.d;
    }

    public byte c() {
        return this.i.c;
    }

    public static Comparator<fjl_0> g() {
        return j;
    }

    public static Comparator<fjl_0> h() {
        return k;
    }

    public fjl_0 i() {
        Object[] objectArray = fjl_0.values();
        Arrays.sort(objectArray, j);
        int n = ArrayUtils.indexOf((Object[])objectArray, (Object)this);
        return n == 0 ? null : objectArray[n - 1];
    }

    public static fjl_0 a(short s2) {
        for (fjl_0 fjl_02 : fjl_0.values()) {
            if (fjl_02.i.a != s2) continue;
            return fjl_02;
        }
        return a;
    }

    static {
        j = (fjl_02, fjl_03) -> {
            if (fjl_02 == fjl_03) {
                return 0;
            }
            if (fjl_02 == null) {
                return 1;
            }
            if (fjl_03 == null) {
                return -1;
            }
            return Integer.signum(fjl_03.i.c - fjl_02.i.c);
        };
        k = (fjl_02, fjl_03) -> {
            if (fjl_02 == fjl_03) {
                return 0;
            }
            if (fjl_02 == null) {
                return -1;
            }
            if (fjl_03 == null) {
                return 1;
            }
            return Integer.signum(fjl_02.i.c - fjl_03.i.c);
        };
    }
}

