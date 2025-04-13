/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cep
 */
public enum cep_2 {
    a(527L, 1, 32),
    b(1134L, -10, -8),
    c(1136L, 3, 26),
    d(1137L, 4, -89),
    e(1135L, -7, 16),
    f(967L, 0, -5),
    g(1089L, 0, 1),
    h(552L, 0, -12),
    i(1388L, 0, -9);

    private final long j;
    private final int k;
    private final int l;

    private cep_2(long l, int n2, int n3) {
        this.j = l;
        this.k = n2;
        this.l = n3;
    }

    public long a() {
        return this.j;
    }

    public int b() {
        return this.k;
    }

    public int c() {
        return this.l;
    }

    public String d() {
        return bae.h().a(77, this.j, new Object[0]);
    }

    public static cep_2 a(String string) {
        for (cep_2 cep_22 : cep_2.values()) {
            if (!string.equals(cep_22.d())) continue;
            return cep_22;
        }
        return a;
    }
}

