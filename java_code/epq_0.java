/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePq
 */
public final class epq_0
implements epi_0 {
    private final epc_0 a;

    public epq_0(epc_0 epc_02) {
        this.a = epc_02;
    }

    @Override
    public void a(epb_0 epb_02, int n) {
        epa_1 epa_12 = this.a.e(eps_0.al);
        epa_1 epa_13 = this.a.e(eps_0.e);
        if (epa_12 == null || epa_13 == null) {
            return;
        }
        if (epb_02 != epb_0.c) {
            return;
        }
        epq_0.a(epa_12, epa_13);
    }

    public static void a(rs_0 rs_02, rs_0 rs_03) {
        rs_02.g(50 + rs_03.c() * 75);
    }
}

