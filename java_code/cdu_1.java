/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cdu
 */
public enum cdu_1 {
    a(0, cep_0.b),
    b(1, cep_0.c),
    c(2, cep_0.d),
    d(3, cep_0.e);

    private final byte e;
    private alo_1 f;
    private final cep_0 g;

    private cdu_1(byte by, cep_0 cep_02) {
        this.e = by;
        this.g = cep_02;
    }

    public byte a() {
        return this.e;
    }

    public alo_1 b() {
        if (this.f == null) {
            this.f = new cdt_1(this);
        }
        return this.f;
    }

    public cep_0 c() {
        return this.g;
    }
}

