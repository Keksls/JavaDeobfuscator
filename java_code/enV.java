/*
 * Decompiled with CFR 0.152.
 */
public enum enV implements aqk_2
{
    a(0, "Pas d'effet (d\u00e9faut)", "Aucun effet n'est ex\u00e9cut\u00e9, mais le co\u00fbt de lancement est consomm\u00e9"),
    b(1, "Pas d'effet, suppression des PA", "Aucun effet n'est ex\u00e9cut\u00e9, co\u00fbt consomm\u00e9 et PA remis \u00e0 0"),
    c(2, "Pas d'effet, suppression des PA/PM/PW", "AUcun effet n'est ex\u00e9cut\u00e9, co\u00fbt consomm\u00e9 et les PA/PM/PW remis \u00e0 0");

    private final int d;
    private final String e;
    private final String f;

    private enV(int n2, String string2, String string3) {
        this.d = n2;
        this.e = string2;
        this.f = string3;
    }

    public static enV a(int n) {
        for (enV enV2 : enV.values()) {
            if (enV2.d != n) continue;
            return enV2;
        }
        return a;
    }

    @Override
    public String d() {
        return Integer.toString(this.d);
    }

    @Override
    public String e() {
        return this.e;
    }

    @Override
    public String f() {
        return this.f;
    }
}

