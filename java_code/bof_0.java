/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bOf
 */
public enum bof_0 {
    a(bj_0.a, azf_2.j),
    b(bj_0.b, azf_2.x),
    c(bj_0.d, azf_2.y),
    d(bj_0.c, azf_2.g);

    private final int e;
    private final azj_2 f;

    private bof_0(bj_0 bj_02, azj_2 azj_22) {
        this.e = bj_02.getNumber();
        this.f = azj_22;
    }

    public int a() {
        return this.e;
    }

    public azj_2 b() {
        return this.f;
    }

    public static bof_0 a(int n) {
        for (bof_0 bof_02 : bof_0.values()) {
            if (bof_02.e != n) continue;
            return bof_02;
        }
        return null;
    }
}

