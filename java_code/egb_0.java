/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGB
 */
public final class egb_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Params", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public egb_0() {
        this.M();
    }

    public egb_0 aD() {
        egb_0 egb_02 = new egb_0();
        return egb_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.f == null || this.e == null) {
            return;
        }
        if (this.f instanceof epq_2) {
            this.m = ((epq_2)this.f).dr();
        } else if (this.f instanceof ekk_0) {
            this.m = ((ekk_0)this.f).c();
        }
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.e == null || !(this.e instanceof epq_2) || ((epq_2)this.e).gO() != 1620 || this.m == 0) {
            this.ba();
            return;
        }
        epq_2 epq_22 = (epq_2)this.e;
        epj_2 epj_22 = (epj_2)epq_22.Z_();
        short s2 = epj_22.u();
        short s3 = epq_22.dr();
        if (s3 == s2) {
            this.ba();
            return;
        }
        short s4 = ((epq_2)this.e).ci().dr();
        if (s3 >= s4) {
            this.ba();
            return;
        }
        int n = epq_22.d(eps_0.b);
        int n2 = epq_22.c(eps_0.b);
        short s5 = (short)Math.min(Math.min(s3 + this.m, s2), s4);
        epq_22.a_(s5);
        epq_22.V_();
        int n3 = epq_22.d(eps_0.b);
        int n4 = n3 - n;
        int n5 = n2 + n4;
        epq_22.a_(eps_0.b).b(n5);
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
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

