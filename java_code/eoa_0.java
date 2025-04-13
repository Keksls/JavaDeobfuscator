/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eoa
 */
public enum eoa_0 implements aqk_2
{
    a(-1, "", "pas de tag"),
    b(1, "Pluie", "effet utilis\u00e9 pour la pluie"),
    c(2, "Neige", "effet utilis\u00e9 pour la neige"),
    d(3, "Brouillard", "effet utilis\u00e9 pour le brouillard"),
    e(14, "Transition entr\u00e9e", "effet utilis\u00e9 pour l'entr\u00e9e dans l'instance"),
    f(15, "Transition sortie", "effet utilis\u00e9 pour la sortie de l'instance"),
    g(16, "T\u00e9l\u00e9port", "effet utilis\u00e9 pour les t\u00e9l\u00e9portations dans l'instance");

    private final int h;
    private final String i;
    private final String j;

    private eoa_0(int n2, String string2, String string3) {
        this.h = n2;
        this.i = string2;
        this.j = string3;
    }

    public int a() {
        return this.h;
    }

    public static eoa_0 a(int n) {
        for (eoa_0 eoa_02 : eoa_0.values()) {
            if (eoa_02.h != n) continue;
            return eoa_02;
        }
        return null;
    }

    @Override
    public String d() {
        return String.valueOf(this.h);
    }

    @Override
    public String e() {
        return this.i;
    }

    @Override
    public String f() {
        return this.j;
    }
}

