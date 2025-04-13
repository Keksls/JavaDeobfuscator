/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVO
 */
public enum evo_2 {
    a(evp_2.a),
    b(evx_2.a),
    c(evv_2.a),
    d(evr_2.a),
    e(evz_2.a),
    f(evp_2.a);

    private final abr_1<evn_2> g;

    private evo_2(abr_1<evn_2> abr_12) {
        this.g = abr_12;
    }

    public static evn_2 a(byte by) {
        evo_2 evo_22 = evo_2.values()[by];
        if (evo_22 == null) {
            throw new UnsupportedOperationException("Impossible de trouver le type d'action " + evo_22);
        }
        return evo_22.g.createNew();
    }
}

