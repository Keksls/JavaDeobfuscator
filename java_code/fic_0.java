/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fiC
 */
public enum fic_0 implements aqk_2
{
    a(1, "Sort feu"),
    b(2, "Sort eau"),
    c(3, "Sort terre"),
    d(4, "Sort air"),
    e(5, "Sort de d\u00e9placement"),
    f(6, "Sort de t\u00e9l\u00e9portation"),
    g(7, "Sort de d\u00e9gagement"),
    h(8, "Sort monocible"),
    i(9, "Sort de zone"),
    j(10, "Sort de mel\u00e9e"),
    k(11, "Sort \u00e0 distance"),
    l(12, "Sort utilisable avec les portails"),
    m(13, "On n'affiche rien pour les cellules invalides dans l'aper\u00e7u de la zone de lancement du sort"),
    n(14, "Les portails de la team sont ciblables, quels que soient la port\u00e9e et la ligne de vue"),
    o(15, "Sort valide uniquement sur le portail de sortie si il utilise un portail d'entr\u00e9e"),
    p(16, "Sort valide sur les heures du Xelor quelque soit la PO et le Rang"),
    q(17, "Sort de lumi\u00e8re : Utilise le symbole de l'\u00e9l\u00e9ment lumi\u00e8re dans la description/Est consid\u00e9r\u00e9 comme sort de lumi\u00e8re par IsActivatedByElement"),
    r(18, "Sort ne pouvant faire d'\u00e9chec critique");

    private final int s;
    private final String t;

    private fic_0(int n2, String string2) {
        this.s = n2;
        this.t = string2;
    }

    @Override
    public String d() {
        return String.valueOf(this.s);
    }

    @Override
    public String e() {
        return this.t;
    }

    @Override
    public String f() {
        return null;
    }

    public static fic_0 a(int n) {
        for (fic_0 fic_02 : fic_0.values()) {
            if (fic_02.s != n) continue;
            return fic_02;
        }
        return null;
    }
}

