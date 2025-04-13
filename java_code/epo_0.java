/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePo
 */
public final class epo_0
implements epi_0 {
    private final epc_0 a;
    private final float b;

    public epo_0(epc_0 epc_02, float f2) {
        this.a = epc_02;
        this.b = f2;
    }

    @Override
    public void a(epb_0 epb_02, int n) {
        epa_1 epa_12 = this.a.e(eps_0.b);
        epa_1 epa_13 = this.a.e(eps_0.T);
        epa_1 epa_14 = this.a.e(eps_0.J);
        if (epa_12 == null || epa_14 == null || epa_13 == null) {
            return;
        }
        int n2 = epa_12.c() + epa_13.c();
        int n3 = (int)((float)n2 * this.b);
        int n4 = n2 - (epa_12.a() + epa_13.a());
        float f2 = Math.min((float)n4 / (float)n3 * 100.0f, 100.0f);
        epa_14.b((int)Math.ceil(f2));
    }
}

