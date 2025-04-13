/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSF
 */
public enum csf_1 {
    a("marchand_artefacts", eyk_1.e),
    b("marchand_combattant", eyk_1.d),
    c("marchand_crafts", eyk_1.c),
    d("marchand_garde_manger", eyk_1.b);

    private final eyk_1 e;
    private final String f;

    private csf_1(String string2, eyk_1 eyk_12) {
        this.f = string2;
        this.e = eyk_12;
    }

    public eyk_1 a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }
}

