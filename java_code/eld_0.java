/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLd
 */
public enum eld_0 implements rx_0,
aqk_2
{
    a(0, "Stoppe le mouvement"),
    b(1, "Ne peut pas \u00eatre activ\u00e9e par les alli\u00e9s"),
    c(2, "L'IA \u00e9vite d'aller sur la zone"),
    d(3, "Zone non n\u00e9gative pour l'\u00e9quipe rouge"),
    e(4, "Invisible pour les ennemis"),
    f(5, "Le propri\u00e9taire de la zone est le caster des effets (pas fonctionnel sur toutes les zones, cf getLauncher())."),
    g(6, "L'ia essaie de terminer son tour sur cette zone"),
    h(7, "Ne r\u00e9duit pas les HPLoss \u00e0 0"),
    i(8, "N'affiche pas l'overhead de la zone"),
    j(9, "Prend en compte les d\u00e9g\u00e2ts \u00e9l\u00e9mentaires et secondaires  du caster (pi\u00e8ges uniquement)"),
    k(10, "Ne bloque plus les lignes de vue"),
    l(11, "Balise Cra"),
    m(12, "Force un RunningEffectManager"),
    n(13, "Rend l'alpha des cellules de la zone d'effet transparent"),
    o(14, "N'attend pas la dur\u00e9e de l'animation lors de la destruction de la zone");

    private final byte p;
    private final String q;

    private eld_0(byte by, String string2) {
        this.p = by;
        this.q = string2;
    }

    @Override
    public String d() {
        return String.valueOf(this.p);
    }

    @Override
    public String e() {
        return this.q;
    }

    @Override
    public String f() {
        return null;
    }

    @Override
    public byte b() {
        return this.p;
    }

    @Override
    public byte a() {
        return 4;
    }

    public static eld_0 a(int n) {
        for (eld_0 eld_02 : eld_0.values()) {
            if (eld_02.p != n) continue;
            return eld_02;
        }
        return null;
    }
}

