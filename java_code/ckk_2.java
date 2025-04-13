/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cKK
 */
class ckk_2
extends ckh_2 {
    static final ckk_2 a = new ckk_2(cki_2.b);
    static final ckk_2 b = new ckk_2(cki_2.c);
    private csa_1 c;

    private ckk_2(cki_2 cki_22) {
        super(cki_22);
    }

    private ckk_2(cki_2 cki_22, csa_1 csa_12) {
        super(cki_22);
        this.c = csa_12;
    }

    public ckk_2 a(csa_1 csa_12) {
        this.c = csa_12;
        return this;
    }

    public csa_1 b() {
        return this.c;
    }
}

