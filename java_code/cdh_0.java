/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDH
 */
public enum cdh_0 implements aqk_2
{
    a(0, "Aucun"),
    b(7, "Insects flys"),
    c(8, "Frogs"),
    d(54, "Prayers weird"),
    e(55, "Sleck nest"),
    f(56, "Sleck canvas"),
    g(85, "Message alert Trool"),
    h(9, "barbecue"),
    i(10, "firecamp boiling water small"),
    j(11, "firecamp boiling water med"),
    k(12, "firecamp small"),
    l(13, "smokestack small"),
    m(14, "smokestack med"),
    n(15, "volcano fall small"),
    o(17, "volcano fall med"),
    p(18, "volcano fall med distant"),
    q(19, "volcano fall big"),
    r(20, "volcano fall big distant"),
    s(21, "volcano lava small"),
    t(23, "volcano lava med"),
    u(24, "volcano lava med distant"),
    v(25, "volcano lava big"),
    w(26, "volcano lava big distant"),
    x(5, "Dark hole"),
    y(52, "Hiboss board"),
    z(58, "Plastic duck"),
    A(59, "Graveyard"),
    B(60, "Machines casino"),
    C(61, "Train engine"),
    D(57, "Eliatrope technology"),
    E(63, "Hum machine"),
    F(64, "Mechanical small"),
    G(66, "Machine bubble"),
    H(73, "Old engine"),
    I(76, "machine hidden"),
    J(77, "machine ventilation"),
    K(78, "rotor blade"),
    L(74, "Coins"),
    M(84, "Distant construction"),
    N(86, "Portal Shukrute"),
    O(89, "Lighthouse Mechanical Squeak"),
    P(65, "Church bells"),
    Q(46, "metal maechanism small"),
    R(47, "Metal maechanism med"),
    S(48, "Metal low squeak"),
    T(49, "Metal creak small"),
    U(50, "Metal creak med"),
    V(87, "Metal coinfall"),
    W(2, "Mud bubbles"),
    X(69, "Music chuchoteur stele air"),
    Y(70, "Music chuchoteur stele fire"),
    Z(71, "Music chuchoteur stele earth"),
    aa(72, "Music chuchoteur stele water"),
    ab(79, "Music Bilyza Ecran tv"),
    ac(80, "Music Bilyza Show Gelax"),
    ad(81, "Music Bilyza Radeau de la tentation"),
    ae(82, "Music Bilbyza Full Gelax party"),
    af(83, "Music Bilyza Discotheque"),
    ag(1, "Rocks fall"),
    ah(68, "Rocks whistle"),
    ai(4, "FX horror"),
    aj(39, "FX wakfu"),
    ak(40, "FX Stasis"),
    al(6, "Wind tree"),
    am(41, "Wind int"),
    an(44, "Wind large"),
    ao(42, "Steam small"),
    ap(43, "Steam med"),
    aq(53, "Tornade Ogrest"),
    ar(27, "Water boiling small"),
    as(28, "Water boiling med"),
    at(29, "Water boiling big"),
    au(38, "Water pool"),
    av(30, "Water dripping small"),
    aw(31, "Water dripping med"),
    ax(32, "Water dripping big"),
    ay(33, "Water waves lapping"),
    az(51, "Waterfall little"),
    aA(34, "Waterfall small"),
    aB(35, "Waterfall med"),
    aC(36, "Waterfall med distant"),
    aD(37, "Waterfall big"),
    aE(88, "Waterfall ascending"),
    aF(3, "Waterfall big distant"),
    aG(67, "Drops"),
    aH(45, "Wood creak large"),
    aI(62, "Wood thin creak"),
    aJ(75, "Wood old creak");

    private final int aK;
    private final String aL;

    private cdh_0(int n2, String string2) {
        this.aK = n2;
        this.aL = string2;
    }

    public static cdh_0 a(int n) {
        for (cdh_0 cdh_02 : cdh_0.values()) {
            if (cdh_02.aK != n) continue;
            return cdh_02;
        }
        return null;
    }

    public int a() {
        return this.aK;
    }

    @Override
    public String d() {
        return String.valueOf(this.aK);
    }

    @Override
    public String e() {
        return this.aL;
    }

    @Override
    public String f() {
        return null;
    }

    public String toString() {
        return this.e();
    }
}

