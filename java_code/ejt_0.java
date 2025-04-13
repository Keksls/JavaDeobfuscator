/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJT
 */
public final class ejt_0
extends eGX {
    private static final aqr_2 v = new eFw(new eFv("Interdit", new eFu[0]));

    public ejt_0() {
        this.M();
    }

    public ejt_0 aD() {
        ejt_0 ejt_02 = new ejt_0();
        return ejt_02;
    }

    public static ejt_0 a(So<efh_0> so, int n, Su su) {
        ejt_0 ejt_02 = new ejt_0();
        ejt_02.i = efc_0.e.a();
        ejt_02.l = ((ejh_0)efc_0.e.b()).e();
        ejt_02.m = n;
        ejt_02.M();
        ejt_02.f = su;
        ejt_02.n = -1;
        ejt_02.h = so;
        return ejt_02;
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    @Override
    public void M() {
        super.M();
        this.c(2246);
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        int n = this.a(this.m, eps_0.al);
        if (n == 0) {
            this.j(true);
        }
    }

    private int a(int n, ru_0 ru_02) {
        if (this.f == null || n == 0 || !this.f.a(ru_02)) {
            return 0;
        }
        int n2 = this.f.c(ru_02);
        if (n > 0) {
            this.f.b(ru_02).c(n);
        } else if (n < 0) {
            this.f.b(ru_02).d(-n);
        }
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

