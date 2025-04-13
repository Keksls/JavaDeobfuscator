/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eYc
 */
public enum eyc_1 implements aqk_2
{
    a(0, "Classique (pas de contour)", azf_2.b, 1),
    b(1, "Relique (Cuivre)", new azf_2(0.89f, 0.45f, 0.175f, 1.0f), 2),
    c(2, "Wakfu (Bleu Wakfu)", new azf_2(0.24f, 0.9f, 0.9f, 1.0f), 3),
    d(3, "Stasis (Violet Stasis)", new azf_2(0.5f, 0.0f, 0.9f, 0.72f), 4),
    e(4, "Event (Violet)", new azf_2(1.0f, 0.6f, 0.6f, 1.0f), 5);

    private final int f;
    private final String g;
    final byte h;
    private final azj_2 i;
    private static final Comparator<eyc_1> j;

    private eyc_1(int n2, String string2, azj_2 azj_22, int n3) {
        this.f = n2;
        this.g = string2;
        this.i = azj_22;
        this.h = (byte)n3;
    }

    @Override
    public String d() {
        return this.toString();
    }

    @Override
    public String e() {
        return this.g;
    }

    @Override
    public String f() {
        return null;
    }

    public azj_2 a() {
        return this.i;
    }

    public byte b() {
        return this.h;
    }

    public static Comparator<eyc_1> c() {
        return j;
    }

    static {
        j = new eyd_2();
    }
}

