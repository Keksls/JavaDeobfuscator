/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bav
 */
public class bav_0
extends ban {
    public bav_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    public long o() {
        sr_0 sr_02;
        if (this.s() != null && (sr_02 = this.s().b(this.f())) != null) {
            if (sr_02.a(eld_0.o)) {
                return 0L;
            }
            if (sr_02 instanceof bhr_2) {
                bhr_2 bhr_22 = (bhr_2)((Object)sr_02);
                bhn_2 bhn_22 = bhr_22.aq();
                if (bhr_22.a("AnimMort") && bhn_22.t()) {
                    return bhn_22.b("AnimMort");
                }
                return 0L;
            }
        }
        return 0L;
    }

    @Override
    protected void l() {
        sr_0 sr_02;
        if (this.s() != null && (sr_02 = this.s().b(this.f())) != null) {
            bhr_2 bhr_22 = (bhr_2)((Object)sr_02);
            dbm_0.a().a(bhr_22.aq().q());
            this.t().g().b(sr_02);
        }
        super.l();
    }
}

