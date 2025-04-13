/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eqr
 */
public enum eqr_1 {
    a,
    b(a),
    c(a),
    d(c),
    e,
    f;

    private final eqr_1 g;

    private eqr_1() {
        this.g = null;
    }

    private eqr_1(eqr_1 eqr_12) {
        this.g = eqr_12;
    }

    public boolean a(eqr_1 eqr_12) {
        eqr_1 eqr_13 = this;
        while (eqr_13 != null) {
            if (eqr_13 == eqr_12) {
                return true;
            }
            eqr_13 = eqr_13.g;
        }
        return false;
    }
}

