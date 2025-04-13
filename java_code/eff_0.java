/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eFf
 */
public enum eff_0 implements aqk_2
{
    a(1, "Bypass : se d\u00e9clenche sur ne d\u00e9clenche rien niveau 1"),
    b(2, "Bypass : ignore la Parade (HP_LOSS)"),
    c(3, "Misc : n'affiche pas la zone de l'effet dans le client"),
    d(4, "Flag : effet Zone (HP_LOSS)"),
    e(5, "Bypass : ne d\u00e9clenche rien niveau 1"),
    f(6, "Bypass : ne d\u00e9clenche rien niveau 2"),
    g(8, "Order : tri les cibles par %PV Restants (croissant)"),
    h(9, "Bypass : n'est pas d\u00e9sappliqu\u00e9 quand le porteur passe OffPlay"),
    i(10, "Flag : bonus de Havre-Monde destin\u00e9 aux membres de la guilde dans le HM"),
    j(11, "Flag : bonus de Havre-Monde destin\u00e9 aux visiteurs"),
    k(12, "Flag : bonus de Havre-Monde destin\u00e9 aux membres de la guilde hors du HM"),
    l(13, "Bypass : ignore la stabilisation pour les effets pousser et tirer"),
    m(14, "Order : tri les cibles par distance (croissant)"),
    n(15, "Bybass : peut \u00eatre ex\u00e9cut\u00e9 sur un fighter KO"),
    o(16, "Misc : transmet son niveau de container \u00e0 ses sous effets"),
    p(17, "Bypass : ignore le maximum PA/PM hors combat"),
    q(18, "Scenario : d\u00e9clenche un \u00e9v\u00e8nement de sc\u00e9nario apr\u00e8s son ex\u00e9cution"),
    r(19, "Bypass : n'applique pas Volont\u00e9"),
    s(20, "Flag : bonus de Guilde"),
    t(21, "Bypass : bonus de Prospection autoris\u00e9 pour les companions"),
    u(22, "Flag : effet Monocible (HP_LOSS)"),
    v(23, "Flag : effet M\u00eal\u00e9e (HP_LOSS)"),
    w(24, "Flag : effet Distance (HP_LOSS)"),
    x(25, "Order : tri les cibles par %PV Restants (d\u00e9croissant)"),
    y(26, "Order : tri les cibles par distance (d\u00e9croissant)"),
    z(27, "Misc : ne met pas \u00e0 jour la position des fighters invisibles pour l'IA"),
    A(28, "Bypass : ignore l'Armure et la Barri\u00e8re (HP_LOSS)"),
    B(29, "Flag : effet de vol de vie (HP_GAIN)"),
    C(30, "Bypass : ignore la Volont\u00e9"),
    D(31, "Flag : effet de Bombe"),
    E(32, "Misc : n'envoie pas de notification \u00e0 l'IA"),
    F(33, "Bypass : effet de soin qui n'est pas affect\u00e9 par la propri\u00e9t\u00e9 MORT VIVANT"),
    G(34, "Bypass : la perte de PV n'est pas consid\u00e9r\u00e9e comme indirecte"),
    H(35, "Flag : aura de relique"),
    I(36, "Bypass : ne prend pas en compte les propri\u00e9t\u00e9s de stabilisation des fighters");

    private final byte J;
    private final String K;

    private eff_0(int n2, String string2) {
        this.K = string2;
        this.J = (byte)n2;
    }

    @Override
    public String d() {
        return String.valueOf(this.J);
    }

    public byte a() {
        return this.J;
    }

    @Override
    public String e() {
        return this.K;
    }

    @Override
    public String f() {
        return null;
    }

    public static eff_0 a(int n) {
        for (eff_0 eff_02 : eff_0.values()) {
            if (eff_02.J != n) continue;
            return eff_02;
        }
        return null;
    }
}

