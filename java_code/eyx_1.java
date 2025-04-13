/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from eYx
 */
public enum eyx_1 implements aqk_2,
aqs_2
{
    a(2, eyy_1.f, "Permet la plantation d'un item", false),
    b(3, eyy_1.g, "Permet de jouer un Script", false),
    c(5, eyy_1.i, "Permet de d\u00e9ployer un \u00e9l\u00e9ment interactif", false),
    d(6, eyy_1.j, "Permet de spawn un monstre \u00e0 cot\u00e9 du joueur", false),
    e(7, eyy_1.k, "Permet de lancer un sc\u00e9nario sur un joueur", false),
    f(8, eyy_1.l, "Donne des kamas au joueur", false),
    g(9, eyy_1.m, "T\u00e9l\u00e9porte un joueur", false),
    h(10, eyy_1.n, "Donne un titre \u00e0 un joueur", false),
    i(11, eyy_1.o, "Ouvre une interface background", false),
    j(12, eyy_1.p, "Affiche le passeport", false),
    k(13, eyy_1.q, "Apprend une Emote", false),
    l(15, eyy_1.r, "Ajoute une boussole", false),
    m(16, eyy_1.e, "r\u00e9duit de 1 les Malus de mort", false),
    n(17, eyy_1.d, "Joue une emote", false),
    o(18, eyy_1.c, "Active un exploit", false),
    p(19, eyy_1.b, "Suit un exploit", false),
    q(20, eyy_1.a, "Fusionne des items", false),
    r(21, eyy_1.s, "Apprend une custom de Havre-Sac", false),
    s(23, eyy_1.t, "Donne de l'xp au joueur", false),
    t(24, eyy_1.u, "R\u00e9initialise un achievement", false),
    u(26, eyy_1.v, "S\u00e9pare un objet \u00e9l\u00e9ments d'une panoplie", false),
    v(28, eyy_1.w, "Donne un item dans la liste", false),
    w(31, eyy_1.x, "Retour au point de respawn", false),
    x(33, eyy_1.y, "Active un restat", false),
    y(34, eyy_1.A, "Active la recherche de tr\u00e9sor", false),
    z(36, eyy_1.B, "Donne des items", false),
    A(37, eyy_1.C, "Change de nation", false),
    B(38, eyy_1.D, "Tue les monstres dans un rayon", false),
    C(39, eyy_1.E, "Active un compagnon", false),
    D(43, eyy_1.G, "Lance la recustom d'un personnage", false),
    E(44, eyy_1.H, "Reinitialise les aptitudes de carac", false),
    F(45, eyy_1.I, "Diffuse un message aux joueurs pr\u00e9sents dans l'instance", false),
    G(46, eyy_1.L, "Rajoute des niveaux aux pets", false),
    H(47, eyy_1.M, "Heal un pet", false),
    I(50, eyy_1.N, "Roll de nouveaux \u00e9l\u00e9ments (effets \u00e0 \u00e9l\u00e9ts variables) pour cet item", false),
    J(52, eyy_1.O, "Ouvre l'interface mimibiote", true),
    K(53, eyy_1.P, "Apprend une recette au joueur", true),
    L(54, eyy_1.R, "Restat une page d'aptitudes", false),
    M(55, eyy_1.Q, "Apprend plusieurs recettes au joueur", true),
    N(56, eyy_1.S, "Applique le parchemin de sublimation", false),
    O(57, eyy_1.T, "Converti un objet en un ensemble d'autres objets", false),
    P(59, eyy_1.J, "Apprend l'objet en tant qu'\u00e9l\u00e9ment cosm\u00e9tique", false),
    Q(60, eyy_1.U, "Apprend l'apparence de l'objet cibl\u00e9 en tant qu'\u00e9l\u00e9ment cosm\u00e9tique", false),
    R(61, eyy_1.K, "Apprend l'objet en tant que mobilier de compte", false);

    public static final List<eyx_1> S;
    private final byte T;
    private final String U;
    private final aqr_2 V;
    private final boolean W;

    private eyx_1(int n2, aqr_2 aqr_22, String string2, boolean bl) {
        this.T = (byte)n2;
        this.U = string2;
        this.V = aqr_22;
        this.W = bl;
    }

    @Override
    public String d() {
        return String.valueOf(this.T);
    }

    @Override
    public String e() {
        return this.U;
    }

    public boolean a() {
        return this.W;
    }

    public static eyx_1 a(int n) {
        for (eyx_1 eyx_12 : eyx_1.values()) {
            if (eyx_12.T != n) continue;
            return eyx_12;
        }
        return null;
    }

    @Override
    public aqr_2 c_() {
        return this.V;
    }

    @Override
    public String f() {
        return null;
    }

    public byte b() {
        return this.T;
    }

    static {
        S = Arrays.asList(h, k, r, K, M, P, R);
    }
}

