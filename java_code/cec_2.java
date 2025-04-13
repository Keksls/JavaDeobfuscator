/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEc
 */
public enum cec_2 {
    a(0, new ced_2()),
    b(1, new cef_2()),
    c(2, new ceg_2()),
    d(3, new ceh_2()),
    e(4, new cei_1()),
    f(6, new cej_1()),
    g(5, new cek_1()),
    h(7, new cel_1()),
    i(8, new cem_1());

    private final byte j;
    private final cep_1 k;

    private cec_2(byte by, cep_1 cep_12) {
        this.j = by;
        this.k = cep_12;
    }

    public byte a() {
        return this.j;
    }

    public ceo_1 b() {
        return this.k.a();
    }

    public static cec_2 a(byte by) {
        for (cec_2 cec_22 : cec_2.values()) {
            if (cec_22.j != by) continue;
            return cec_22;
        }
        return null;
    }

    public String toString() {
        switch (this) {
            case a: {
                return "Saison";
            }
            case b: {
                return "Temp\u00e9rature";
            }
            case c: {
                return "P\u00e9riode de la journ\u00e9e";
            }
            case d: {
                return "Type de zone";
            }
            case e: {
                return "Wakfu";
            }
            case f: {
                return "Et";
            }
            case g: {
                return "Ou";
            }
            case h: {
                return "Joueurs alentours";
            }
            case i: {
                return "Altitude";
            }
        }
        return super.toString();
    }

    public static ceo_1 a(arf_1 arf_12) {
        ceo_1 ceo_12 = cec_2.a(arf_12.a()).b();
        ceo_12.b(arf_12);
        return ceo_12;
    }

    public static void a(gk_0 gk_02, ceo_1 ceo_12) {
        gk_02.a(ceo_12.d());
        ceo_12.b(gk_02);
    }
}

