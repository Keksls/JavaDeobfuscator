/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;

/*
 * Renamed from erl
 */
public enum erl_2 implements rx_0,
aqk_2
{
    a(0, "Rien"),
    b(1, "RIGHT_HAND_LEVEL"),
    c(2, "Est un Boss invoqu\u00e9 par un Boss"),
    d(3, "Est 'invisible PvP' (pas de FX et n'appara\u00eet pas au V)"),
    e(4, "A un tour de jeu plus court que la normale (20 sec)"),
    f(5, "Force l'orientation en 4 direction uniquement"),
    g(8, "N'attaque pas"),
    h(12, "Ne meurt pas", eoz_1.m),
    i(13, "Ne peut pas \u00eatre attaqu\u00e9"),
    j(14, "Bloque les mouvements"),
    k(15, "Ne peut \u00eatre rejoint"),
    l(16, "Ne donne pas d'exp\u00e9rience", eoz_1.p),
    m(17, "Est enceinte"),
    n(18, "Est occup\u00e9"),
    o(19, "Est mort"),
    p(20, "Est un NPC de challenge"),
    q(21, "Est un NPC cr\u00e9\u00e9 par une commande admin"),
    r(28, "s\u00e9duite pour la fin de combat"),
    s(29, "Est gardien de prison"),
    t(30, "Est un NPC d'entrainement"),
    u(31, "Est bien nourri"),
    v(32, "Ne peut pas \u00eatre attaqu\u00e9 pour une dur\u00e9e d\u00e9termin\u00e9e"),
    w(33, "Ne peut pas lancer une poursuite (mais aggro quand m\u00eame)"),
    x(34, "Pas besoin d'avoir un chemin jusqu'au mob pour l'affronter"),
    y(35, "T\u00e9l\u00e9porte le monstre au lieu de le d\u00e9placer lors de son entr\u00e9e en combat"),
    z(36, "Est un NPC PNJ (overhead special)"),
    A(37, "Est un partisan d'Amakna"),
    B(38, "Est un partisan de Bonta"),
    C(39, "Est un partisan de Brakmar"),
    D(40, "Est un monstre de donjon type rushu rush"),
    E(42, "Est un encapuchonn\u00e9 (cache le niveau)"),
    F(43, "Est un boss"),
    G(44, "Est un partisan de Sufokia"),
    H(45, "Est un NPC Archimonstre"),
    I(46, "Monstre avec lequel on ne peut pas effectuer d'actions"),
    J(47, "Est un monstre de donjon arcade"),
    K(48, "Est un NPC d'une vague de donjon arcade"),
    L(49, "Est un boss ultime"),
    M(50, "Ne peut pas se faire engager (PvP)"),
    N(51, "Est un NPC d'Almanach"),
    O(52, "Est un NPC de chaos d'ogrest"),
    P(53, "Ne laisse pas de cadavre \u00e0 sa mort"),
    Q(54, "Ne peut pas engager de combat Duel"),
    R(55, "Ne peut pas cr\u00e9er/engager de combat PvP (mais peut rejoindre)"),
    S(56, "Ne peut pas faire d'\u00e9change"),
    T(57, "Ne peut pas cr\u00e9er ou rejoindre un groupe (MRU + refus auto)"),
    U(58, "Ne peut pas envoyer de message priv\u00e9 (MRU)"),
    V(59, "Ne peut pas suivre un autre joueur (MRU)"),
    W(60, "Ne peut pas interagir avec les monstres (MRU)"),
    X(61, "Ne peut pas engager un combat PvM (MRU)"),
    Y(62, "Ne peut pas r\u00e9colter sur les monstres (MRU)"),
    Z(63, "Ne peut pas modifier les barres de raccourcis"),
    aa(65, "Ne peut pas interagir avec l'interface chat"),
    ab(66, "Ne peut pas interagir avec l'interface suivi de qu\u00eate"),
    ac(67, "Force l'activation de la boussole quand une qu\u00eate est activ\u00e9."),
    ad(68, "Affiche des informations de MDC all\u00e9g\u00e9es"),
    ae(69, "Le protecteur ne donne pas son bonus de region"),
    af(70, "Ne peut pas appeler \u00e0 l'aide en combat"),
    ag(71, "Ne peut pas verrouiller le combat"),
    ah(72, "Ne peut pas montrer une cellule"),
    ai(73, "Combattants transparents d\u00e9sactiv\u00e9s"),
    aj(74, "Abandon d\u00e9sactiv\u00e9"),
    ak(75, "Ne peut pas rejoindre un combat (MRU)"),
    al(76, "Ne peut pas fermer l'interface tutoriel"),
    am(77, "Ne gagne pas d'exp\u00e9rience"),
    an(78, "D\u00e9sactive le MRU qui permet de lancer des collectes de resources"),
    ao(79, "D\u00e9sactive les modifications de la jauge de Wakfu"),
    ap(80, "Ne peut pas grouper avec un personnage d'une autre classe"),
    aq(81, "Est un compagnon"),
    ar(82, "Compagnon dispo aux non-abo"),
    as(83, "Ne peut pas utiliser les compagnons en combat"),
    at(84, "Pas de bonus Xp pour les reroll", eoz_1.bj),
    au(85, "Peut sauter les obstacles"),
    av(87, "N'utilise pas de scripts sur ses sorts."),
    aw(88, "Permet de bypasser le blocage d'\u00e9change (mod\u00e9rateurs)"),
    ax(89, "Ne peut pas supprimer un objet"),
    ay(90, "Ne peut pas l\u00e2cher un objet"),
    az(91, "Ne peut pas utiliser un objet"),
    aA(92, "Le familier ne perd pas de vie"),
    aB(93, "Ne peut pas modifier l'\u00e9quipement des compagnons"),
    aC(94, "Ne peut pas retirer un compagnon"),
    aD(95, "Ne peut pas interagir avec l'interface cadeaux"),
    aE(96, "Est un partisan de la nation Bandit"),
    aF(97, "Ne peut pas ouvrir l'interface coffre de compte"),
    aG(98, "Ne peut pas utiliser les h\u00e9ros en combat"),
    aH(99, "Est un boss de raid"),
    aI(100, "Est dans une instance d'ar\u00e8ne Pvp"),
    aJ(101, "Est un Phorreur Enutrof"),
    aK(102, "Est d\u00e9truit \u00e0 la fin d'un combat"),
    aL(103, "Est un huppermage encapuchonn\u00e9 (cache le niveau)"),
    aM(104, "Affiche le personnage dans les bulles de combats"),
    aN(105, "Permet d'escalader certaines falaises"),
    aO(106, "La pr\u00e9sence de ce personnage dans un combat d\u00e9sactive la vue externe du combat"),
    aP(107, "Ne peut pas interagir avec l'interface aptitude"),
    aQ(108, "Ne peut pas interagir avec l'interface fiche de combattant"),
    aR(109, "Force le facteur d'exp\u00e9rience d'abonnement \u00e0 1", eoz_1.bi),
    aS(110, "Ne peut pas interagir avec l'interface inventaire"),
    aT(111, "Ne peut pas interagir avec l'interface qu\u00eate"),
    aU(112, "Ne peut pas interagir avec l'interface sort"),
    aV(113, "Ne peut pas interagir avec l'interface fiche de personnage"),
    aW(114, "Ne peut pas utiliser les Zaaps"),
    aX(115, "Est un NPC dominant"),
    aY(116, "Est une invocation qui drop du loot"),
    aZ(117, "Permet de marcher sur les nuages"),
    ba(118, "Permet de nager en eau peu profonde"),
    bb(119, "Est un NPC de champs de bataille (PvP)", eoz_1.bk),
    bc(120, "Ne peut pas \u00eatre attaqu\u00e9 durant un d\u00e9placement"),
    bd(121, "D\u00e9sactive les plantations pour le joueur"),
    be(122, "Est un G\u00e9n\u00e9ral de champs de bataille (PvP)", eoz_1.bl),
    bf(123, "Ne peut pas engager un combat contre un G\u00e9n\u00e9ral de champ de bataille"),
    bg(124, "Ne peut pas rejoindre un combat contre un G\u00e9n\u00e9ral de champ de bataille"),
    bh(125, "Ne peut pas utiliser de monture"),
    bi(126, "Fait partie de l'\u00e9quipe des attaquants (team 0) dans un champ de bataille", eoz_1.bm),
    bj(127, "Fait partie de l'\u00e9quipe des d\u00e9fenseurs (team 1) dans un champ de bataille", eoz_1.bn);

    private final byte bk;
    private final String bl;
    private eoz_1 bm = null;
    private static final ImmutableSet<erl_2> bn;

    private erl_2(int n2, String string2) {
        this.bk = (byte)n2;
        this.bl = string2;
    }

    private erl_2(int n2, String string2, eoz_1 eoz_12) {
        this.bk = (byte)n2;
        this.bl = string2;
        this.bm = eoz_12;
    }

    @Override
    public byte a() {
        return 0;
    }

    @Override
    public byte b() {
        return this.bk;
    }

    public eoz_1 c() {
        return this.bm;
    }

    @Override
    public String d() {
        return String.valueOf(this.bk);
    }

    @Override
    public String e() {
        return this.bl;
    }

    @Override
    public String f() {
        return null;
    }

    public static erl_2 a(int n) {
        for (erl_2 erl_22 : erl_2.values()) {
            if (erl_22.b() != n) continue;
            return erl_22;
        }
        return null;
    }

    public static boolean a(erl_2 erl_22) {
        return bn.contains((Object)erl_22);
    }

    static {
        bn = ImmutableSet.copyOf((Object[])new erl_2[]{R, M, au, aN, aZ, ba, Q, S, V, T, aI, U, d, f});
    }
}

