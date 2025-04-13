/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGE
 */
public class ege_0
extends ejh_0 {
    private static final aqr_2 z = new eFw(new eFv("Buff de charac", new eFu("Valeur (-1 = valeur de l'effet declencheur, -2 = 2*la valeur de l'effet d\u00e9clencheur)", eFx.b), new eFu("Augmente la valeur courante (0 non 1 oui)", eFx.c), new eFu("Diminue \u00e0 la d\u00e9sapplication (0 g\u00e9n\u00e9ralement. Si vous h\u00e9sitez, demandez ! Bug \u00e0 l'horizon)", eFx.c)));
    protected ru_0 v;
    protected boolean w = true;
    protected boolean x = true;
    protected int y = 0;

    @Override
    public aqr_2 c_() {
        return z;
    }

    protected ege_0() {
    }

    public ege_0(ru_0 ru_02) {
        this.v = ru_02;
        this.M();
    }

    public ege_0 aD() {
        ege_0 ege_02 = new ege_0();
        ege_02.v = this.v;
        return ege_02;
    }

    public ru_0 aE() {
        return this.v;
    }

    @Override
    public void M() {
        super.M();
        if (this.v == null) {
            return;
        }
        switch (this.v.b()) {
            case 0: {
                eps_0 eps_02 = (eps_0)this.v;
                if (!eps_02.r()) break;
                this.c(eps_02.n());
            }
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.aF() != null && this.aF().a(this.v)) {
            rs_0 rs_02 = this.aF().b(this.v);
            if (this.m == -1 && sd_02 != null) {
                this.m = sd_02.n();
            }
            int n = rs_02.d();
            int n2 = rs_02.c();
            int n3 = rs_02.p().m();
            this.a(n, n3);
            rs_02.e(this.m);
            int n4 = rs_02.c();
            if (this.D()) {
                this.m = rs_02.d() - n;
                this.y = n4 - n2;
            }
            if (this.w && this.y != 0) {
                eps_0 eps_02;
                int n5 = this.aF().b(this.v).c(this.y);
                if (n5 != 0 && this.v.b() == 0 && (eps_02 = (eps_0)this.v).r()) {
                    this.c(eps_02.n());
                }
                this.P = true;
            }
            if (this.v == eps_0.B && this.h.d() != null) {
                this.h.d().t();
            }
        } else {
            this.j(true);
        }
    }

    private void a(int n, int n2) {
        if (!this.D() || n2 == -1) {
            return;
        }
        if (this.k() == null) {
            return;
        }
        if (this.a(eff_0.p)) {
            return;
        }
        this.m = Math.min(n2 - n, this.m);
    }

    public void d(boolean bl) {
        this.w = bl;
    }

    public void e(boolean bl) {
        this.x = bl;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        short s2 = this.aZ();
        this.w = ((efh_0)this.c).a(1, s2, eFb.a) != 0;
        this.x = ((efh_0)this.c).a(2, s2, eFb.a) != 0;
        this.m = ((efh_0)this.c).a(0, s2, eFb.a);
        if (this.m == -2 && this.l() != null && ((efn_0)this.l()).f() != null && ((efn_0)this.l()).f().n() > 0) {
            this.m = ((efn_0)this.l()).f().n() * 2;
        }
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        switch (n) {
            case 0: {
                if (bl) break;
                this.m += xh_0.a((float)this.m * f2 / 100.0f);
                break;
            }
            case 1: {
                if (bl) {
                    this.m = xh_0.a(f2);
                    break;
                }
                this.m = (int)((float)this.m + f2);
                break;
            }
        }
        if (this.m == 0) {
            this.ba();
        }
    }

    protected Su aF() {
        return this.f;
    }

    @Override
    public void al() {
        if (this.P) {
            if (this.aF() != null && this.aF().a(this.v)) {
                int n = this.m;
                if (this.v == eps_0.b) {
                    int n2 = this.aF().c(this.v);
                    int n3 = n = this.y > n2 ? n2 - 1 : this.y;
                }
                if (this.x) {
                    this.aF().b(this.v).d(n);
                }
                this.aF().b(this.v).e(-this.m);
            }
            if (this.v == eps_0.B && this.h.d() != null) {
                this.h.d().t();
            }
        }
        super.al();
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
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().d(this.w).e(this.x).a(this.y));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.w = iq_02.O();
            this.x = iq_02.Q();
            this.y = iq_02.e();
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

