/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJU
 */
public final class eju_0
extends eGX {
    private static final aqr_2 v = new eFw(new eFv("Interdit", new eFu[0]));

    public eju_0() {
        this.M();
    }

    public eju_0 aD() {
        eju_0 eju_02 = new eju_0();
        return eju_02;
    }

    public static eju_0 a(So<efh_0> so, int n, Su su) {
        eju_0 eju_02 = new eju_0();
        eju_02.i = efc_0.f.a();
        eju_02.l = ((ejh_0)efc_0.f.b()).e();
        eju_02.m = n;
        eju_02.M();
        eju_02.f = su;
        eju_02.n = -1;
        eju_02.h = so;
        return eju_02;
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    @Override
    public void M() {
        super.M();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        int n = this.a(this.m, eps_0.ax);
        if (n == 0) {
            this.j(true);
        }
    }

    private int a(int n, ru_0 ru_02) {
        if (this.f == null || n == 0 || !this.f.a(ru_02)) {
            return 0;
        }
        int n2 = this.f.c(ru_02);
        this.f.b(ru_02).d(n);
        return n2 - this.f.c(ru_02);
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean as() {
        return false;
    }

    @Override
    public void z() {
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

