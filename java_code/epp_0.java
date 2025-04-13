/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePp
 */
public final class epp_0
implements epi_0 {
    private final eov_1<epa_1> a;
    private final sk_0 b;

    public epp_0(eov_1<epa_1> eov_12, sk_0 sk_02) {
        this.a = eov_12;
        this.b = sk_02;
    }

    @Override
    public void a(epb_0 epb_02, int n) {
        if (this.b == null) {
            return;
        }
        epa_1 epa_12 = this.a.b(eps_0.aj);
        if (epa_12 == null) {
            return;
        }
        efa_0 efa_02 = eiu_0.a(this.b);
        if (efa_02 == null) {
            return;
        }
        eps_0 eps_02 = efa_02.c();
        int n2 = this.a.c(eps_02);
        int n3 = this.a.c(eps_0.ai);
        int n4 = n2 + n3;
        epa_12.b(n4);
    }

    public String toString() {
        return "LightDmgRecomputeProcedure{m_manager=" + this.a + "}";
    }
}

