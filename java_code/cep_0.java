/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEP
 */
public enum cep_0 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    final byte f;

    private cep_0(byte by) {
        this.f = by;
    }

    public static cep_0 a(byte by) {
        for (cep_0 cep_02 : cep_0.values()) {
            if (cep_02.f != by) continue;
            return cep_02;
        }
        return null;
    }
}

