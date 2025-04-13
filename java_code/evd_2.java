/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVD
 */
public enum evd_2 implements aqk_2,
aqs_2
{
    a(1, eve_2.g, "Permet de jouer un Script"),
    b(2, eve_2.k, "Applique un \u00e9tat sur le joueur"),
    c(3, eve_2.h, "T\u00e9l\u00e9porte le joueur"),
    d(4, eve_2.i, "Donne un item au joueur depuis une table de loot"),
    e(5, eve_2.a, "Donne des kamas au joueur"),
    f(6, eve_2.b, "Active un achievement/qu\u00eate"),
    g(7, eve_2.c, "Donne une emote au joueur"),
    h(9, eve_2.e, "Lance une recustom de perso"),
    i(10, eve_2.f, "Lance un sc\u00e9nario"),
    j(11, eve_2.l, "Ouvre le comptoir de mercenaire"),
    k(12, eve_2.j, "Donne un item par id au joueur"),
    l(13, eve_2.m, "Soigne le joueur");

    private final byte m;
    private final String n;
    private final aqr_2 o;

    private evd_2(int n2, aqr_2 aqr_22, String string2) {
        this.m = (byte)n2;
        this.n = string2;
        this.o = aqr_22;
    }

    @Override
    public String d() {
        return String.valueOf(this.m);
    }

    @Override
    public String e() {
        return this.n;
    }

    public static evd_2 a(int n) {
        for (evd_2 evd_22 : evd_2.values()) {
            if (evd_22.m != n) continue;
            return evd_22;
        }
        return null;
    }

    @Override
    public aqr_2 c_() {
        return this.o;
    }

    @Override
    public String f() {
        return null;
    }

    public byte a() {
        return this.m;
    }
}

