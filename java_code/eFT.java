/*
 * Decompiled with CFR 0.152.
 */
public class eFT
extends egi_0 {
    private static final aqr_2 v = new eFw(new eFv("Modif de Charac", new eFu("valeur (-1 pour valeur de l'effet declencheur)", eFx.b)));
    private static final short z = 5227;

    public eFT() {
    }

    public eFT(ru_0 ru_02) {
        super(ru_02);
    }

    public eFT aC() {
        eFT eFT2 = new eFT();
        eFT2.w = this.w;
        return eFT2;
    }

    public static eFT a(So<efh_0> so, ru_0 ru_02, Su su, Su su2) {
        eFT eFT2 = new eFT(ru_02);
        eFT2.b(so, ru_02, su, su2);
        return eFT2;
    }

    private void b(So<efh_0> so, ru_0 ru_02, Su su, Su su2) {
        if (ru_02 == eps_0.c) {
            this.i = efc_0.ap.a();
            this.l = ((ejh_0)efc_0.ap.b()).e();
        } else if (ru_02 == eps_0.d) {
            this.i = efc_0.ar.a();
            this.l = ((ejh_0)efc_0.ar.b()).e();
        } else {
            throw new UnsupportedOperationException("We can't checkout an effect of this type for something else than AP/MP loss");
        }
        this.M();
        this.e = su;
        this.f = su2;
        this.n = -1;
        this.h = so;
        this.w = ru_02;
    }

    @Override
    boolean aD() {
        if (super.aD()) {
            return true;
        }
        return this.w == eps_0.d && this.aM().a(eoz_1.e);
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.f == null) {
            this.m = 0;
            a.error((Object)("Can't apply effect " + this.bt_() + ", target is null (parent container id : " + ((efi_0)this.k()).aS_() + ")"));
            return;
        }
        if (this.c == null) {
            return;
        }
        short s2 = this.aZ();
        int n = this.m = ((efh_0)this.c).a(0, s2, eFb.a);
        if (this.m == -1) {
            ejh_0 ejh_02 = (ejh_0)sd_02;
            if (ejh_02 == null) {
                ejh_02 = ((efn_0)this.l()).f();
            }
            if (ejh_02 == null) {
                a.error((Object)"On ne peut pas copier la valeur de l'effet declencheur, celui-ci est inconnu");
                this.m = 0;
                return;
            }
            if (ejh_02 instanceof efz_0) {
                efz_0 efz_02 = (efz_0)ejh_02;
                byte by = this.w.a();
                if (by == eps_0.c.a()) {
                    this.m = efz_02.aF();
                } else if (by == eps_0.d.a()) {
                    this.m = efz_02.aE();
                } else if (by == eps_0.e.a()) {
                    this.m = efz_02.aD();
                }
            } else {
                this.m = ejh_02.n();
            }
        }
        int n2 = 0;
        int n3 = 0;
        if (this.f != this.e && !this.a(eff_0.C)) {
            n2 = this.f.a(eps_0.P) ? this.f.c(eps_0.P) : 0;
            n3 = this.e.a(eps_0.P) ? this.e.c(eps_0.P) : 0;
        }
        float f2 = (float)this.m * 0.5f * (1.0f + (float)n3 / 100.0f - (float)n2 / 100.0f);
        this.m = xh_0.a(f2);
        if (this.m < 0) {
            this.m = 0;
        }
        if (n != this.m) {
            if (this.w.a() == eps_0.c.a()) {
                this.c(58);
            } else if (this.w.a() == eps_0.d.a()) {
                this.c(75);
            }
        }
        this.m = Hw.a(this.m, 0, n);
        if (this.m == 0) {
            this.b((byte)3);
        }
    }

    @Override
    void a(rs_0 rs_02) {
        super.a(rs_02);
        if (this.m > 0) {
            if (!this.D()) {
                return;
            }
            if (!this.a(eff_0.r)) {
                int n;
                eGm eGm2 = eGm.a(this.m(), this.i(), (short)5227, (short)0, false);
                eGm2.b(this.i());
                eGm2.a(this);
                eGm2.a(this.i());
                float[] fArray = new float[]{5227.0f, 0.0f, this.m * 10, 0.0f, 100.0f, 0.0f};
                fie_0 fie_02 = fih_0.a().a(5227);
                if (fie_02 != null) {
                    n = fie_02.D();
                } else {
                    a.error((Object)"Unable to find state 5227");
                    n = 245;
                }
                efl_0 efl_02 = efl_0.a(fArray, n);
                eGm2.a(efl_02);
                eGm2.a(this.m());
                eGm2.aL();
                eGm2.c(this.i());
                eGm2.q();
            }
        } else {
            eps_0 eps_02 = (eps_0)this.w;
            if (eps_02.u()) {
                this.d(eps_02.q());
            }
        }
    }

    @Override
    protected boolean aE() {
        if (this.f == null) {
            return true;
        }
        if (!this.f.a(this.w)) {
            return true;
        }
        return this.f.b(this.w).a() == ((epa_1)this.f.b(this.w)).w();
    }

    @Override
    public aqr_2 c_() {
        return v;
    }

    @Override
    public /* synthetic */ egi_0 aF() {
        return this.aC();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aC();
    }
}

