/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOZ
 */
public enum eoz_1 implements rx_0,
aqk_2
{
    a(0, "Rien"),
    b(1, "Passe son tour"),
    c(2, "Reduit au CAC"),
    d(3, "Insensible aux effets de d\u00e9placement"),
    e(4, "Insensible aux pertes de PM"),
    f(5, "Invisible"),
    g(6, "Voit les invisibles"),
    h(7, ""),
    i(8, "Peut d\u00e9passer la limite de r\u00e9sistance \u00e9l\u00e9mentaire"),
    j(9, "S'enfuit"),
    k(10, "Se dep\u00eache"),
    l(11, "Est stabilis\u00e9"),
    m(12, "Ne meurt pas"),
    n(14, "Ne drop rien en fin de combat"),
    o(15, "Ne peut pas tacler"),
    p(16, "Ne donne pas d'exp\u00e9rience"),
    q(17, "MAX_PA_COST"),
    r(18, "Invisible ++"),
    s(19, "Ne peut pas \u00eatre KO"),
    t(20, "Est endommag\u00e9 par les soins"),
    u(21, "Ne peut pas \u00eatre cibl\u00e9 de mani\u00e8re directe"),
    v(22, "Plus de chance d'\u00eatre attaqu\u00e9 par les monstres"),
    w(23, "Augmente de 1 le co\u00fbt en PW"),
    x(24, "Augmente de 2 le co\u00fbt en PW"),
    y(25, "Interdit les co\u00fbts en PW"),
    z(26, "Moins de chance d'\u00eatre attaqu\u00e9 par les monstres"),
    A(27, "loot en fin de combat"),
    B(28, "Ne peut pas \u00eatre s\u00e9duite"),
    C(29, "Augmente de 1 le co\u00fbt en PA"),
    D(30, "Augmente de 2 le co\u00fbt en PA"),
    E(31, "Interdit les co\u00fbts en PA"),
    F(32, "Augmente de 1 le co\u00fbt en PM"),
    G(33, "Augmente de 1 le co\u00fbt en PM"),
    H(34, "Interdit les co\u00fbts en PM"),
    I(35, "Double le co\u00fbt en PM des d\u00e9placements"),
    J(36, "Double les PM"),
    K(37, "Extra-tour"),
    L(38, "Essaye de cibler toutes les cases \u00e0 port\u00e9e (pour l'IA)"),
    M(39, "Voit les pi\u00e8ges (pour l'IA)"),
    N(40, "Peut \u00eatre s\u00e9duite"),
    O(41, "Ne peut pas utiliser d'objet"),
    P(42, "Ne peut pas \u00eatre cibl\u00e9"),
    Q(43, "Interrompt le lancement de sort en cours"),
    R(44, "Est une poup\u00e9e de Sadida"),
    S(45, "Est un totem de Sadida non bloquant"),
    T(46, "Inverse l'\u00e9valuation des sorts sur une cible qui porte cette propri\u00e9t\u00e9"),
    U(47, "Insensible \u00e0 la localisation des dommages re\u00e7us (dos/c\u00f4t\u00e9)"),
    V(48, "Peut cibler des combattants KO (pour l'IA)"),
    W(49, "Phorzerker"),
    X(50, "Les PA deviennent des PM"),
    Y(51, "Ne change pas d'orientation"),
    Z(52, "La chrage annule les effets qui la modifie"),
    aa(54, "Ne bloque pas la ligne de vue"),
    ab(55, "Ne peut pas transposer"),
    ac(56, "Ne peut pas \u00eatre tir\u00e9 ou pouss\u00e9"),
    ad(57, "Ne peut pas se t\u00e9l\u00e9porter soi-m\u00eame"),
    ae(58, "Ne perd pas de charge quand re\u00e7oit un soin"),
    af(59, "Permet \u00e0 l'IA de cibler des fighters KO"),
    ag(60, "Est une copie de son controller"),
    ah(61, "A invoqu\u00e9 des copies de lui m\u00eame, et ne veut pas qu'on le diff\u00e9rencie"),
    ai(62, "Est sous l'effet du sort Nature Morte"),
    aj(63, "Ne d\u00e9clenche pas les zone en arrivant en combat"),
    ak(64, "A \u00e9t\u00e9 Rollback\u00e9 ce tour"),
    al(65, "Ne d\u00e9clenche pas de trigger de KO"),
    am(66, "Ne peut pas \u00eatre ressuscit\u00e9"),
    an(67, "Reste invisible apr\u00e8s avoir utilis\u00e9 un sort ou une arme"),
    ao(68, "Force la validation de la cible dans l'ia si le mob possede aussi la prop 42 CANNOT_BE_EFFECT_TARGET"),
    ap(69, "Ne peut pas \u00eatre tacl\u00e9"),
    aq(70, "Ne peut pas \u00eatre port\u00e9"),
    ar(71, "Ne peut pas se rapproch\u00e9 via GetCloser"),
    as(72, "Ne peut pas \u00eatre la cible d'\u00e9tats"),
    at(73, "Est affich\u00e9 comme un d\u00e9cors et non un joueur (pas de rollOver)"),
    au(74, "Ne compte pas comme un fighter lors du calcul de fin de combat (utile pour Gris XIII combat mob vs (mob + joueur))"),
    av(75, "Insensible aux effets de combat"),
    aw(76, "Les caract\u00e9ristiques de l'invoc du localPlayer cibl\u00e9e sont affich\u00e9es quand ce n'est pas son tour, \u00e0 la place de celle du localPlayer"),
    ax(77, "Ne peut se d\u00e9placer que sur des Rails"),
    ay(78, "D\u00e9sactive les bonus de v\u00e9locit\u00e9"),
    az(79, "Ne saute pas quand il est port\u00e9"),
    aA(80, "Utilise la maitrise des m\u00e9canismes (Obsol\u00e8te)"),
    aB(81, "Utilise la valeur de degats en % de l'invocateur"),
    aC(82, "Permet d'arreter le calcul d'ia en cours (suite a un changement de type d'ia par ex)"),
    aD(83, "Ne peut pas s'\u00e9loigner d'une cible ou d'une cellule"),
    aE(84, "N'utilise pas la maitrise des invocations"),
    aF(85, "Simule un KO"),
    aG(86, "Ne passe pas son tour apres un tacle"),
    aH(87, "Se teleporte quand se deplace en combat"),
    aI(88, "Ne peut pas se d\u00e9placer"),
    aJ(90, "Pas de limite au % d'esquive"),
    aK(91, "Ne droppe pas de kamas"),
    aL(92, "Se d\u00e9place sans \u00e0 coup sur les zones d'effets"),
    aM(93, "Se d\u00e9place droit devant en combat"),
    aN(94, "Attaque droit devant en combat"),
    aO(95, "Ne peut pas lancer de sorts"),
    aP(96, "Le joueur ne gagne pas d'xp de sort."),
    aQ(97, "Le monstre donne le double d'xp (utile pour des \"challenges de combat\""),
    aR(98, "Le d\u00e9placement sur les Rails co\u00fbte toujours 1 PM"),
    aS(99, "Ne loot rien en fin de combat"),
    aT(100, "Loot \u00e0 chaque fois en fin de combat"),
    aU(101, "Est une copie visuelle de l'invocateur"),
    aV(102, "D\u00e9sactive les challenges pour le combat"),
    aW(103, "N'est pas compt\u00e9 comme une invocation"),
    aX(104, "Mini jeu reversi, le pion est inversable"),
    aY(105, "Ne peut pas utiliser les portails pour se d\u00e9placer"),
    aZ(106, "Minimise les dommages al\u00e9atoires"),
    ba(107, "Maximise les dommages al\u00e9atoires"),
    bb(108, "Poss\u00e8de des sorts similaires \u00e0 l'invocateur"),
    bc(109, "Huppermage en mode coeur de feu"),
    bd(110, "Est stabilis\u00e9 pour les ennemis uniquement"),
    be(111, "Est stabilis\u00e9 pour les alli\u00e9s uniquement"),
    bf(112, "Ne peut pas changer manuellement son orientation"),
    bg(113, "Ne consid\u00e8re pas les bordures de bulles comme n\u00e9gatives pour un d\u00e9placement dans l'IA"),
    bh(114, "Pas pr\u00e9sent dans la timeline"),
    bi(115, "Force le facteur d'exp\u00e9rience d'abonnement \u00e0 1"),
    bj(116, "Pas de bonus Xp pour les reroll"),
    bk(117, "Est un NPC de champs de bataille (PvP)"),
    bl(118, "Est un G\u00e9n\u00e9ral de champs de bataille (PvP)"),
    bm(119, "Fait partie de l'\u00e9quipe des attaquants (team 0) dans un champ de bataille"),
    bn(120, "Fait partie de l'\u00e9quipe des d\u00e9fenseurs (team 1) dans un champ de bataille"),
    bo(121, "Est une invocation qui utilise le bonus de v\u00e9locit\u00e9"),
    bp(122, "La barre de vie n'appara\u00eet pas");

    private final byte bq;
    private final String br;

    private eoz_1(int n2, String string2) {
        this.br = string2;
        this.bq = (byte)n2;
    }

    @Override
    public byte b() {
        return this.bq;
    }

    @Override
    public byte a() {
        return 1;
    }

    public static eoz_1 a(int n) {
        for (eoz_1 eoz_12 : eoz_1.values()) {
            if (eoz_12.b() != n) continue;
            return eoz_12;
        }
        return null;
    }

    @Override
    public String d() {
        return String.valueOf(this.bq);
    }

    @Override
    public String e() {
        return this.br;
    }

    @Override
    public String f() {
        return null;
    }
}

