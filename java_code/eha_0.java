/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHa
 */
public class eha_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Echange de position standard", new eFu[0]), new eFv("Bypass stabilisation", new eFu("Bypass stabilisation (0 = false, 1 = true)", eFx.b)));
    private elr_0 w;
    private elr_0 x;
    private int y;
    private int z;
    private short A;
    private int B;
    private int C;
    private short D;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eha_0() {
        this.M();
    }

    @Override
    public final void M() {
        super.M();
        this.c(184);
    }

    public eha_0 aD() {
        eha_0 eha_02 = new eha_0();
        eha_02.y = this.y;
        eha_02.z = this.z;
        eha_02.A = this.A;
        eha_02.B = this.B;
        eha_02.C = this.C;
        eha_02.D = this.D;
        return eha_02;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        boolean bl2 = true;
        if (this.e instanceof erc_2) {
            if (((erc_2)((Object)this.e)).hh()) {
                bl2 = false;
            }
            if (this.e.p() || this.e.t()) {
                bl2 = false;
            }
        }
        if (this.f instanceof erc_2 && ((erc_2)((Object)this.f)).hh()) {
            bl2 = false;
        }
        Su su = this.f;
        Su su2 = this.e;
        boolean bl3 = false;
        if (((efh_0)this.c).F() == 1) {
            boolean bl4 = bl3 = ((efh_0)this.c).a(0, this.aZ(), eFb.a) == 1;
        }
        if (!bl3 && !this.a(eff_0.I)) {
            boolean bl5;
            boolean bl6;
            boolean bl7;
            boolean bl8 = bl7 = this.f != null && !this.f.a(eoz_1.ab);
            if (this.f != null && (this.f.a(eoz_1.l) || !bl7)) {
                this.j(true);
                return;
            }
            boolean bl9 = bl6 = this.e != null && !this.e.a(eoz_1.ab);
            if (this.e != null && (this.e.a(eoz_1.l) || !bl6)) {
                this.j(true);
                return;
            }
            boolean bl10 = this.e != null && this.f != null;
            boolean bl11 = bl10 && ((eqq_1)((Object)this.f)).Y() == ((eqq_1)((Object)this.e)).Y();
            boolean bl12 = bl7 && bl6;
            boolean bl13 = bl10 && (this.f.a(eoz_1.bd) || this.e.a(eoz_1.bd));
            boolean bl14 = bl5 = bl10 && (this.f.a(eoz_1.be) || this.e.a(eoz_1.be));
            if (!(bl11 || bl12 && !bl13)) {
                this.j(true);
                return;
            }
            if (bl11 && (!bl12 || bl5)) {
                this.j(true);
                return;
            }
        }
        if (bl2 && su2 != null && su != null && this.f instanceof eKm) {
            if (this.D()) {
                this.y = su2.G();
                this.z = su2.H();
                this.A = su2.I();
                this.B = su.G();
                this.C = su.H();
                this.D = su.I();
            }
            if (this.D() && su instanceof epq_2 && su2 instanceof epq_2) {
                this.a((epq_2)su, (epq_2)su2);
            }
            su2.b(this.B, this.C, this.D);
            su.b(this.y, this.z, this.A);
            sd_0 sd_03 = this.m(sd_02);
            if (sd_03 != null) {
                if (this.ar()) {
                    sd_03.b(su);
                } else {
                    sd_03.b(su2);
                }
            }
            this.c(sd_03, bl);
            if (this.h.g() != null && this.D()) {
                this.a(su, su2);
            }
        } else {
            this.j(true);
        }
    }

    private void a(epq_2 epq_22, epq_2 epq_23) {
        elm_0 elm_02 = ((efq_0)this.h).l();
        this.w = new elr_0(elm_02, epq_23, epq_23.P_());
        this.w.b(epq_23.P_());
        this.x = new elr_0(elm_02, epq_22, epq_22.P_());
        this.x.b(epq_22.P_());
    }

    private void a(Su su, Su su2) {
        if (this.w == null || this.x == null) {
            return;
        }
        this.w.a(su2.P_());
        this.w.c();
        if (this.w.d()) {
            this.w.g();
        }
        this.x.a(su.P_());
        this.x.c();
        if (this.x.d()) {
            this.x.g();
        }
    }

    @Override
    public void j(sd_0 sd_02) {
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
    public void z() {
        this.w = null;
        this.x = null;
        super.z();
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(ik_0.i().a(this.B).b(this.C).c(this.D)).b(ik_0.i().a(this.y).b(this.z).c(this.A)));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            ik_0 ik_02 = iq_02.o();
            this.B = ik_02.c();
            this.C = ik_02.e();
            this.D = Hw.c((long)ik_02.g());
            ik_0 ik_03 = iq_02.F();
            this.y = ik_03.c();
            this.z = ik_03.e();
            this.A = Hw.c((long)ik_03.g());
        }
    }

    public int aE() {
        return this.y;
    }

    public int aF() {
        return this.z;
    }

    public short aG() {
        return this.A;
    }

    public int aI() {
        return this.B;
    }

    public int aJ() {
        return this.C;
    }

    public short aK() {
        return this.D;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

