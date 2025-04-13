/*
 * Decompiled with CFR 0.152.
 */
public enum bUO {
    a(0, "governorTitle.wise"),
    b(1, "governorTitle.despot"),
    c(2, "governorTitle.negociator"),
    d(3, "governorTitle.oppressor"),
    e(4, "governorTitle.strategist"),
    f(5, "governorTitle.machiavellian"),
    g(6, "governorTitle.diplomat"),
    h(7, "governorTitle.bully"),
    i(8, "governorTitle.protector"),
    j(9, "governorTitle.warlike"),
    k(10, "governorTitle.careful"),
    l(11, "governorTitle.reckless"),
    m(12, "governorTitle.benefactor"),
    n(13, "governorTitle.criminal"),
    o(14, "governorTitle.reformer"),
    p(15, "governorTitle.conservative");

    private final short q;
    private final String r;

    private bUO(short s2, String string2) {
        this.q = s2;
        this.r = string2;
    }

    public short a() {
        return this.q;
    }

    public String b() {
        return this.r;
    }

    public static bUO a(short s2) {
        for (bUO bUO2 : bUO.values()) {
            if (bUO2.a() != s2) continue;
            return bUO2;
        }
        return null;
    }
}

