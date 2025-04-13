/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public enum cUL implements aqk_2
{
    a(0, "Sac"),
    b(1, "Echange"),
    c(2, "Epee"),
    d(3, "Livre"),
    e(4, "Lib\u00e9rer"),
    f(5, "Bulle"),
    g(6, "Panier"),
    h(7, "Pioche"),
    i(8, "Hache"),
    j(9, "Cisailles"),
    k(10, "Faux"),
    l(11, "Une main"),
    m(12, "Jarre"),
    n(13, "Cadena"),
    o(14, "Kicker"),
    p(15, "Tonneau"),
    q(16, "Amis"),
    r(17, "March\u00e9"),
    s(18, "Cloche"),
    t(19, "Fleurs"),
    u(20, "Billet"),
    v(21, "Epingle"),
    w(22, "Marteau enchant\u00e9"),
    x(23, "Marteau"),
    y(24, "Personnage"),
    z(25, "Tonneau ouvert"),
    A(26, "Tonneau ferm\u00e9"),
    B(27, "Tonneau en d\u00e9placement"),
    C(28, "Blop upgrade"),
    D(29, "Blop downgrade"),
    E(30, "Crochet"),
    F(31, "Liste"),
    G(32, "Sac dimensionnel"),
    H(33, "Main droite"),
    I(34, "Main gauche"),
    J(35, "Deux mains"),
    K(36, "Rune"),
    L(37, "Cible"),
    M(38, "Tondeuse"),
    N(39, "Pot \u00e0 lait"),
    O(40, "Aiguille"),
    P(41, "Chaussure"),
    Q(42, "Flasque"),
    R(43, "Poison"),
    S(44, "Joyau"),
    T(45, "Viande"),
    U(46, "Pain"),
    V(47, "Gemme"),
    W(48, "Tube \u00e0 essai"),
    X(49, "Tire-jus"),
    Y(50, "Champignon"),
    Z(51, "Zaap"),
    aa(52, "Piege"),
    ab(53, "Guilde"),
    ac(54, "PetPack"),
    ad(55, "PetUnpack"),
    ae(56, "PetInventory"),
    af(57, "spectator"),
    ag(58, "sit"),
    ah(59, "Bisou"),
    ai(60, "Allumer"),
    aj(61, "Eteindre"),
    ak(62, "Cadenas Ouvert"),
    al(63, "\u00c9p\u00e9e blanche"),
    am(64, "Fl\u00e8che sur quadrillage"),
    an(65, "Point d'interrogation"),
    ao(66, "Toque de chef"),
    ap(67, "Shifumi - feuille"),
    aq(68, "Shifumi - ciseaux"),
    ar(69, "Shifumi - pierre"),
    as(70, "Pelle"),
    at(71, "Rotation"),
    au(72, "Rune Bris\u00e9e"),
    av(73, "Rune"),
    aw(74, "Fusion de Runes"),
    ax(75, "Suivre"),
    ay(76, "Pierre tombale"),
    az(77, "Fourchette et couteau"),
    aA(78, "Coeur"),
    aB(79, "Tour"),
    aC(80, "Downscale"),
    aD(81, "Paw"),
    aE(82, "Tour dor\u00e9e"),
    aF(83, "Changement de blazon de guilde"),
    aG(84, "Changement de nom de guilde");

    public final int aH;
    private final String aI;

    private cUL(int n2, String string2) {
        this.aH = n2;
        this.aI = string2;
    }

    @Override
    public String d() {
        return String.valueOf(this.aH);
    }

    @Override
    public String e() {
        return this.aI;
    }

    @Override
    @Nullable
    public String f() {
        return null;
    }
}

