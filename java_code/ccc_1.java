/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccC
 */
public abstract class ccc_1
extends Enum<ccc_1>
implements ahn {
    public static final /* enum */ ccc_1 a = new ccd_1(1, "Animation simple");
    public static final /* enum */ ccc_1 b = new cce_1(2, "Animation en fonction de la nation");
    public static final /* enum */ ccc_1 c = new ccf_1(4, "Prend les couleurs de la guilde du HM");
    private final int d;
    private final String e;
    private static final /* synthetic */ ccc_1[] f;

    public static ccc_1[] values() {
        return (ccc_1[])f.clone();
    }

    public static ccc_1 valueOf(String string) {
        return Enum.valueOf(ccc_1.class, string);
    }

    ccc_1(int n2, String string2) {
        this.d = n2;
        this.e = string2;
    }

    @Override
    public String d() {
        return String.valueOf(this.d);
    }

    @Override
    public String e() {
        return this.e;
    }

    @Override
    public String f() {
        return this.e;
    }

    public int b() {
        return this.d;
    }

    public static ccc_1 a(int n) {
        for (int k = 0; k < ccc_1.values().length; ++k) {
            ccc_1 ccc_12 = ccc_1.values()[k];
            if (ccc_12.d != n) continue;
            return ccc_12;
        }
        throw new UnsupportedOperationException("Impossible de trouver le type d'\u00e9l\u00e9ment Dynamique " + n);
    }

    static {
        f = new ccc_1[]{a, b, c};
    }
}

