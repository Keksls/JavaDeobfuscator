/*
 * Decompiled with CFR 0.152.
 */
public class eGO
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Set de Charac, valeur = charac du caster (tention !)", new eFu[0]), new eFv("Set de Charac (tention !)", new eFu("valeur (eventuellement en %)", eFx.b)));
    private ru_0 w;
    private int x = 0;

    @Override
    public aqr_2 c_() {
        return v;
    }

    private eGO() {
    }

    public eGO(ru_0 ru_02) {
        this.w = ru_02;
        this.M();
    }

    public eGO aD() {
        eGO eGO2 = new eGO();
        eGO2.w = this.w;
        return eGO2;
    }

    public ru_0 aE() {
        return this.w;
    }

    @Override
    public void M() {
        super.M();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        switch (this.w.b()) {
            case 0: {
                this.aF();
            }
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        short s2 = this.aZ();
        this.m = this.c != null && ((efh_0)this.c).F() > 0 ? ((efh_0)this.c).a(0, s2, eFb.a) : this.h().c(this.w);
    }

    @Override
    public boolean Q() {
        return true;
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
    public void al() {
        if (this.P && this.as()) {
            switch (this.w.b()) {
                case 0: {
                    this.aG();
                }
            }
        }
        super.al();
    }

    private void aF() {
        if (this.f != null && this.f.a(this.w)) {
            int n = this.h().c(this.w);
            rs_0 rs_02 = this.f.b(this.w);
            this.a(rs_02);
            if (this.w == eps_0.B && this.h.d() != null) {
                this.h.d().t();
            }
            int n2 = this.h().c(this.w) - n;
            if (this.w instanceof eps_0) {
                eps_0 eps_02 = (eps_0)this.w;
                if (eps_02.t() && n2 > 0) {
                    this.c(eps_02.p());
                }
                if (eps_02.u() && n2 < 0) {
                    this.c(eps_02.q());
                }
            }
        } else {
            this.j(true);
        }
    }

    private void aG() {
        if (this.f != null && this.f.a(this.w)) {
            this.b(this.f.b(this.w));
            if (this.w == eps_0.B && this.h != null && this.h.d() != null) {
                this.h.d().t();
            }
        }
    }

    @Override
    private void a(rs_0 rs_02) {
        int n = rs_02.a();
        rs_02.b(this.m);
        this.m = rs_02.a();
        this.x = this.m - n;
    }

    private void b(rs_0 rs_02) {
        int n = rs_02.a() - this.x;
        rs_02.b(n);
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

