/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eAo
 */
public enum eao_0 implements aqk_2,
aqs_2
{
    a(1, eap_0.a, "Ne fait rien, permet juste le lancement d'un Script"),
    b(2, eap_0.b, "Permet de forcer le comportement d'un monstre"),
    c(3, eap_0.d, "Detrui le monstre"),
    d(4, eap_0.c, "D\u00e9marre un dialogue", true),
    e(5, eap_0.e, "Ouvre l'\u00e9diteur de Havre-monde");

    private final byte f;
    private final String g;
    private final aqr_2 h;
    private final boolean i;

    private eao_0(int n2, aqr_2 aqr_22, String string2) {
        this(n2, aqr_22, string2, false);
    }

    private eao_0(int n2, aqr_2 aqr_22, String string2, boolean bl) {
        this.f = (byte)n2;
        this.g = string2;
        this.h = aqr_22;
        this.i = bl;
    }

    @Override
    public String d() {
        return String.valueOf(this.f);
    }

    @Override
    public String e() {
        return this.g;
    }

    public static eao_0 a(int n) {
        for (eao_0 eao_02 : eao_0.values()) {
            if (eao_02.f != n) continue;
            return eao_02;
        }
        return null;
    }

    @Override
    public aqr_2 c_() {
        return this.h;
    }

    @Override
    public String f() {
        return null;
    }

    public byte a() {
        return this.f;
    }

    public boolean b() {
        return this.i;
    }
}

