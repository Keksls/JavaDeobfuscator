/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJq
 */
public class ejq_0
extends eGX {
    private static final aqr_2 v = new eFw(new eFv("Interdit", new eFu[0]));

    public ejq_0() {
        this.M();
    }

    public ejq_0 aD() {
        ejq_0 ejq_02 = new ejq_0();
        return ejq_02;
    }

    public static ejq_0 a(So<efh_0> so, fiy fiy2, Su su) {
        ejq_0 ejq_02 = new ejq_0();
        ejq_02.i = efc_0.d.a();
        ejq_02.l = ((ejh_0)efc_0.d.b()).e();
        ejq_02.m = fiy2.a(eps_0.d);
        ejq_02.M();
        ejq_02.f = su;
        ejq_02.n = -1;
        ejq_02.h = so;
        return ejq_02;
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    @Override
    public void M() {
        super.M();
        this.c(76);
        if (this.n() > 0) {
            this.c(65);
            this.c(2242);
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        int n = this.a(this.m, eps_0.d);
        if (n == 0) {
            this.j(true);
        }
    }

    private int a(int n, ru_0 ru_02) {
        if (this.f != null && n > 0 && this.f.a(ru_02)) {
            int n2 = this.f.c(ru_02);
            this.f.b(ru_02).d(n);
            return n2 - this.f.c(ru_02);
        }
        return 0;
    }

    @Override
    public void j(sd_0 sd_02) {
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

