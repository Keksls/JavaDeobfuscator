/*
 * Decompiled with CFR 0.152.
 */
public enum epg implements aqk_2
{
    a(0, "Sp\u00e9cial", "Etat sp\u00e9cial, utilis\u00e9 pour le Gameplay. Son application ne peut \u00eatre ni boost\u00e9e, ni r\u00e9duite", new eph().a()),
    b(1, "Normal", "Etat classique, infligeant principalement des d\u00e9g\u00e2ts", new eph().a(1.0f, 1.0f)),
    c(2, "Semi Game Breaker", "Etat bloquant partiellement le joueur", new eph().a(0.75f, 1.0f)),
    d(3, "Game Breaker", "Etat bloquant totalement le joueur", new eph().a(0.25f, 1.0f));

    private final int e;
    private final String f;
    private final String g;
    private final eph h;

    private epg(int n2, String string2, String string3, eph eph2) {
        this.e = n2;
        this.f = string2;
        this.g = string3;
        this.h = eph2;
    }

    public static epg a(int n) {
        for (epg epg2 : epg.values()) {
            if (epg2.e != n) continue;
            return epg2;
        }
        return a;
    }

    public float a() {
        return this.h.a;
    }

    public float b() {
        return this.h.b;
    }

    @Override
    public String d() {
        return Integer.toString(this.e);
    }

    @Override
    public String e() {
        return this.f;
    }

    @Override
    public String f() {
        return this.g;
    }
}

