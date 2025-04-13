/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDG
 */
public enum cdg_0 implements aqk_2
{
    a(-1, "Aucun"),
    b(0, "Plaine"),
    c(25, "Plaine sombre"),
    d(39, "Plaine Chuchoteur"),
    e(1, "Prairie"),
    f(23, "Prairie sombre"),
    g(2, "For\u00eat"),
    h(9, "Foret sombre"),
    i(3, "D\u00e9sert froid"),
    j(20, "D\u00e9sert chaud"),
    k(50, "D\u00e9sert venteux"),
    l(4, "Montagne"),
    m(6, "Grotte", true),
    n(7, "Crypte"),
    o(8, "Cimeti\u00e8re", true),
    p(10, "Prison"),
    q(41, "Prison exterieur"),
    r(49, "Prison alarm"),
    s(11, "Village"),
    t(27, "Village sombre"),
    u(38, "Village Chuchoteur"),
    v(15, "Petites chutes d'eau"),
    w(12, "Grandes chutes d'eau"),
    x(13, "Marais"),
    y(14, "Souterrains"),
    z(40, "Souterrain chuchoteur"),
    A(45, "Souterrain Frigost"),
    B(48, "Souterrain Laboratoire"),
    C(16, "Volcan"),
    D(24, "Volcan Ext"),
    E(18, "Plage"),
    F(19, "Jungle"),
    G(29, "Ile"),
    H(42, "Poup Island"),
    I(21, "Shukroute"),
    J(22, "Port"),
    K(5, "Incarnam"),
    L(17, "Rocher sifflant Amakna"),
    M(26, "Troue sombre"),
    N(28, "Chaos Ogrest"),
    O(30, "Bateau"),
    P(35, "Bateau - mauvais temps"),
    Q(31, "Bateau - tempete"),
    R(43, "Donjon Capuche"),
    S(32, "Zenith"),
    T(33, "Mont Zenith bas"),
    U(34, "Mont Zenith haut"),
    V(36, "Medieval chaos"),
    W(37, "Katrepate"),
    X(44, "Frigost"),
    Y(46, "Zepplin"),
    Z(47, "Dimension Gelax"),
    aa(51, "Xelorium"),
    ab(52, "Incendie"),
    ac(53, "Inonde"),
    ad(54, "Siege Riktus Amakna"),
    ae(55, "Int\u00e9rieur bateau \u00e9chou\u00e9"),
    af(56, "Ile maudite"),
    ag(57, "Ile Tropicale"),
    ah(58, "Zone Steamer Sous-Marine"),
    ai(59, "Ile - Hommes Poissons"),
    aj(60, "Grotte Cire Momore"),
    ak(61, "Sous-terrain Zwombit"),
    al(62, "Savane"),
    am(63, "Horloge de Nox"),
    an(64, "Temple"),
    ao(65, "Sanctuaire");

    private final byte ap;
    private final String aq;
    private boolean ar = false;

    private cdg_0(byte by, String string2) {
        this.ap = by;
        this.aq = string2;
    }

    private cdg_0(byte by, String string2, boolean bl) {
        this.ap = by;
        this.aq = string2;
        this.ar = bl;
    }

    public byte a() {
        return this.ap;
    }

    public boolean b() {
        return this.ar;
    }

    @Override
    public String d() {
        return String.valueOf(this.ap);
    }

    @Override
    public String e() {
        return this.aq;
    }

    @Override
    public String f() {
        return null;
    }

    public static cdg_0 a(byte by) {
        for (cdg_0 cdg_02 : cdg_0.values()) {
            if (cdg_02.ap != by) continue;
            return cdg_02;
        }
        return null;
    }

    public static cdg_0[] c() {
        cdg_0[] cdg_0Array = cdg_0.values();
        cdg_0[] cdg_0Array2 = new cdg_0[cdg_0Array.length - 1];
        int n = 0;
        for (cdg_0 cdg_02 : cdg_0Array) {
            if (cdg_02 == a) continue;
            cdg_0Array2[n++] = cdg_02;
        }
        return cdg_0Array2;
    }

    public String toString() {
        return this.aq;
    }
}

