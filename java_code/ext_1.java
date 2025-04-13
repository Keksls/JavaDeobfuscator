/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eXT
 */
public enum ext_1 implements aqk_2
{
    a(1, "Objet tr\u00e9sor (interface sp\u00e9ciale)"),
    b(2, "Objet de qu\u00eate"),
    c(3, "Prend la couleur de la guilde"),
    d(4, "Ne peut pas \u00eatre drop\u00e9 par la bourse enutrof"),
    e(5, "Livre qui peut \u00eatre plac\u00e9 dans une biblioth\u00e8que"),
    f(6, "Cet item ne demande pas les feedbacks sur les actions qu'il d\u00e9clenche (plantation)"),
    g(7, "Item propos\u00e9 uniquement au shop"),
    h(8, "[Relique] Il ne peut y avoir qu'un seul Item ayant cette propri\u00e9t\u00e9 \u00e9quip\u00e9 \u00e0 la fois"),
    i(9, "Au drop de l'item, un \u00e9v\u00e8nement de jeu est cr\u00e9\u00e9 (pour les qu\u00eates et les scenarios)"),
    j(10, "Pas de jet bonus de loot pour cet item"),
    k(11, "1 xp = 1 level, level max = 32000 et ne gagne de l'xp uniquement via la commande admin"),
    l(12, "[Relique2] Il ne peut y avoir qu'un seul Item ayant cette propri\u00e9t\u00e9 \u00e9quip\u00e9 \u00e0 la fois"),
    m(13, "L'objet ne peut pas \u00eatre recycl\u00e9"),
    n(14, "L'objet n'est pas consomm\u00e9 \u00e0 l'utilisation (avec effets uniquement)"),
    o(15, "N'est pas soumis \u00e0 la condition de niveau pour pouvoir runer des gemmes"),
    p(16, "La difficult\u00e9 Stasis augmente le nombre de tentatives de loot sur les Transmutations"),
    q(17, "La difficult\u00e9 Stasis augmente le nombre de tentatives de loot sur les Ressources de Boss"),
    r(18, "Cache l'objet dans la liste de ressources r\u00e9coltables ou craftables d'un m\u00e9tier"),
    s(19, "Ajoute un slot de gemme \u00e9pique \u00e0 un objet"),
    t(20, "Ajoute un slot de gemme relique \u00e0 un objet "),
    u(21, "Objet de qu\u00eate li\u00e9 au compte"),
    v(22, "Objet cach\u00e9 (Applicable qu'aux objets de qu\u00eates)"),
    w(23, "Objet exclus des listes d'objets comme l'auto compl\u00e9tion ou les offres d'achat");

    private final int x;
    private final String y;

    private ext_1(int n2, String string2) {
        this.x = n2;
        this.y = string2;
    }

    @Nullable
    public static ext_1 a(int n) {
        for (ext_1 ext_12 : ext_1.values()) {
            if (ext_12.x != n) continue;
            return ext_12;
        }
        return null;
    }

    @Override
    public String d() {
        return String.valueOf(this.x);
    }

    public int a() {
        return this.x;
    }

    @Override
    public String e() {
        return this.y;
    }

    @Override
    public String f() {
        return this.y;
    }
}

