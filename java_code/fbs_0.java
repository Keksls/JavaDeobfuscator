/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fbS
 */
public enum fbs_0 implements aqk_2
{
    a(1, "Acc\u00e8de aux Infrastructures sp\u00e9ciales de sa nation"),
    b(2, "Peut parrainer un joueur d'une autre nation (Neutre)"),
    c(3, "Peut se pr\u00e9senter aux \u00e9lections"),
    d(4, "Peut devenir Milicien ou Soldat"),
    e(5, "Peut Voter lors des \u00e9lections"),
    f(6, "Profite des Bonus de MdC"),
    g(7, "Est consid\u00e9r\u00e9 enemi de la nation (flag + aggro)"),
    h(8, "Les Miliciens gagnent des bonus contre ce joueur"),
    i(9, "Ne peut plus utiliser les zaaps de la nation"),
    j(10, "DEPRECATED : Ne peut plus louer de points de vente de la nation"),
    k(11, "Ne peut plus acc\u00e9der \u00e0 son Havre-Sac"),
    l(12, "Peut participer aux challenges"),
    m(13, "Peut gagner des points de pvp");

    private final int n;
    private final String o;

    private fbs_0(int n2, String string2) {
        this.n = n2;
        this.o = string2;
    }

    public int a() {
        return this.n;
    }

    @Override
    public String d() {
        return String.valueOf(this.n);
    }

    @Override
    public String e() {
        return this.o;
    }

    @Override
    public String f() {
        return null;
    }

    public static fbs_0 a(int n) {
        fbs_0[] fbs_0Array = fbs_0.values();
        for (int k = 0; k < fbs_0Array.length; ++k) {
            fbs_0 fbs_02 = fbs_0Array[k];
            if (fbs_02.n != n) continue;
            return fbs_02;
        }
        return null;
    }
}

