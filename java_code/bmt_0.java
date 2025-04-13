/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bMT
 */
public enum bmt_0 implements aqk_2
{
    a(new bMU(1), "Protecteur attaqu\u00e9", "Le protecteur est attaqu\u00e9 par une nation, il propose aux joueurs de le d\u00e9fendre"),
    b(new bMV(2), "Protecteur a d\u00e9fendu", "Le protecteur a vaincu ses assaillants (avec ou sans aide)"),
    c(new bmw_0(3), "Protecteur vaincu", "Le protecteur a \u00e9t\u00e9 vaincu et a chang\u00e9 de nation"),
    d(new bMX(4), "Message de bienvenue", "Le joueur rencontre un protecteur"),
    e(new bmy_0(5), "Challenge propos\u00e9", "Le protecteur propose un challenge"),
    f(new bmz_0(6), "Changement de pr\u00e9vision meteo", "Les pr\u00e9visions m\u00e9t\u00e9o de la zone ont chang\u00e9"),
    g(new bna_0(7), "Changement de satisfaction", "La satisfaction du protecteur a chang\u00e9"),
    h(new bnb_0(8), "D\u00e9but de chaos", "Un chaos a \u00e9t\u00e9 d\u00e9clench\u00e9 dans un territoire"),
    i(new bnc_0(9), "Fin de chaos", "Un chaos a \u00e9t\u00e9 stopp\u00e9 dans un territoire");

    private final bms_0 j;
    private final String k;
    private final String l;

    private bmt_0(bms_0 bms_02, String string2, String string3) {
        this.j = bms_02;
        this.k = string2;
        this.l = string3;
    }

    public static bmt_0 a(int n) {
        for (bmt_0 bmt_02 : bmt_0.values()) {
            if (n != bmt_02.a()) continue;
            return bmt_02;
        }
        return null;
    }

    public int a() {
        return this.j.a();
    }

    @Override
    public String d() {
        return Integer.toString(this.j.a());
    }

    @Override
    public String e() {
        return this.k;
    }

    @Override
    public String f() {
        return this.l;
    }

    public bmr_0 b() {
        return this.j.c();
    }
}

