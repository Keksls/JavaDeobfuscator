/*
 * Decompiled with CFR 0.152.
 */
public class eJp
extends eGX {
    private static final aqr_2 v = new eFw(new eFv("Interdit", new eFu[0]));

    public eJp() {
        this.M();
    }

    public eJp aD() {
        eJp eJp2 = new eJp();
        return eJp2;
    }

    public static eJp a(So<efh_0> so, fiy fiy2, Su su) {
        eJp eJp2 = new eJp();
        eJp2.i = efc_0.c.a();
        eJp2.l = ((ejh_0)efc_0.c.b()).e();
        eJp2.m = fiy2.a(eps_0.c);
        eJp2.M();
        eJp2.f = su;
        eJp2.n = -1;
        eJp2.h = so;
        return eJp2;
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
            this.c(55);
            this.c(2241);
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        int n = this.a(this.m, eps_0.c);
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

