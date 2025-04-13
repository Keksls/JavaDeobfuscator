/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePn
 */
public final class epn_1
implements epi_0 {
    private final eov_1<epa_1> a;
    private final eps_0 b;
    private final eps_0 c;
    private final float d;
    private int e = 0;

    public epn_1(eov_1<epa_1> eov_12, eps_0 eps_02, eps_0 eps_03, float f2) {
        this.a = eov_12;
        this.b = eps_02;
        this.c = eps_03;
        this.d = f2;
    }

    @Override
    public void a(epb_0 epb_02, int n) {
        if (n == 0) {
            return;
        }
        epa_1 epa_12 = this.a.b(this.b);
        epa_1 epa_13 = this.a.b(this.c);
        epa_13.d(this.e);
        int n2 = epa_12.a();
        int n3 = (int)Math.floor(this.d * (float)n2);
        this.e = epa_13.c(n3);
    }
}

