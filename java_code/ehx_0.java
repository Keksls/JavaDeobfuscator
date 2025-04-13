/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHx
 */
public class ehx_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Pas de params", new eFu[0]), new eFv("Set (certaines propri\u00e9t\u00e9s seulement)", new eFu("valeur", eFx.b)));
    private rx_0 w;
    private boolean x;
    private boolean y = false;
    private byte z = (byte)-1;
    private aff_1 A;
    private aej_2 B;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ehx_0() {
        this.M();
    }

    public ehx_0(rx_0 rx_02) {
        this.w = rx_02;
        this.M();
    }

    @Override
    public void z() {
        this.y = false;
        super.z();
    }

    public rx_0 aD() {
        return this.w;
    }

    public ehx_0 aE() {
        ehx_0 ehx_02 = new ehx_0();
        ehx_02.w = this.w;
        ehx_02.x = this.x;
        ehx_02.z = this.z;
        return ehx_02;
    }

    @Override
    public void M() {
        super.M();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        tg_0 tg_02;
        boolean bl2;
        if (this.f == null || this.w == null) {
            this.j(true);
            return;
        }
        switch (this.w.a()) {
            case 4: {
                if (!(this.f instanceof sr_0)) break;
                if (this.z > 0) {
                    byte by = this.f.b(this.w);
                    if (by + this.z > 127) {
                        this.z = (byte)(127 - by);
                    }
                    this.f.a(this.w, this.z);
                } else {
                    this.f.c(this.w);
                }
                this.y = true;
                break;
            }
            case 0: {
                if (this.m().h() != 1) {
                    if (this.z > 0) {
                        byte by = this.f.b(this.w);
                        if (by + this.z > 127) {
                            this.z = (byte)(127 - by);
                        }
                        this.f.a(this.w, this.z);
                    } else {
                        this.f.c(this.w);
                    }
                    this.y = true;
                    break;
                }
                eoz_1 eoz_12 = ((erl_2)this.w).c();
                if (eoz_12 == null) break;
                if (this.z > 0) {
                    byte by = this.f.b(this.w);
                    if (by + this.z > 127) {
                        this.z = (byte)(127 - by);
                    }
                    this.f.a(eoz_12, this.z);
                } else {
                    this.f.c(eoz_12);
                }
                this.y = true;
                break;
            }
            default: {
                if (this.z > 0) {
                    byte by = this.f.b(this.w);
                    if (by + this.z > 127) {
                        this.z = (byte)(127 - by);
                    }
                    this.f.a(this.w, (byte)(by + this.z));
                } else {
                    this.f.c(this.w);
                }
                this.y = true;
            }
        }
        boolean bl3 = bl2 = this.h.d() != null;
        if (this.w == eoz_1.K && bl2) {
            ((eof_2)this.h.d()).C(this.f.a_());
        }
        if (this.w == eoz_1.k && bl2) {
            this.h.d().t();
        }
        if (this.w == eoz_1.E && this.f.a(eps_0.c)) {
            this.f.b(eps_0.c).o();
        }
        if (this.w == eoz_1.H && this.f.a(eps_0.d)) {
            this.f.b(eps_0.d).o();
        }
        if (this.w == eoz_1.y && this.f.a(eps_0.e)) {
            rs_0 rs_02 = this.f.b(eps_0.e);
            if (rs_02 == null) {
                a.error((Object)("charac nulle alors hasCharac renvoie true " + this.f + ", " + this.f.getClass().getSimpleName()));
            } else {
                rs_02.s();
            }
        }
        if ((this.w == eoz_1.f || this.w == eoz_1.r) && this.f instanceof ti_0 && (tg_02 = this.h.e()) != null) {
            tg_02.d((ti_0)((Object)this.f));
        }
    }

    public byte aF() {
        if (this.c == null) {
            return -1;
        }
        short s2 = this.aZ();
        if (((efh_0)this.c).F() > 1) {
            return (byte)((efh_0)this.c).a(1, s2, eFb.a);
        }
        if (((efh_0)this.c).F() == 1) {
            return (byte)((efh_0)this.c).a(0, s2, eFb.a);
        }
        return -1;
    }

    @Override
    public void j(sd_0 sd_02) {
        this.y = false;
        short s2 = this.aZ();
        this.z = this.c == null ? (byte)-1 : (((efh_0)this.c).F() == 1 ? (byte)((efh_0)this.c).a(0, s2, eFb.a) : (byte)-1);
        this.m = this.w.b();
    }

    @Override
    public void al() {
        if (this.y && this.f != null && this.w != null) {
            byte by;
            if (this.z > 1) {
                by = (byte)(this.f.b(this.w) - this.z);
                this.f.a(this.w, by);
            } else {
                this.f.d(this.w);
            }
            this.x = false;
            if (this.w == eoz_1.k && this.h.d() != null) {
                this.h.d().t();
            }
            byte by2 = by = this.w == eoz_1.f || this.w == eoz_1.r ? (byte)1 : 0;
            if (by != 0) {
                tg_0 tg_02;
                if (this.A != null) {
                    this.f.b(this.A.d(), this.A.e(), this.A.f());
                    this.f.a(this.B);
                }
                if ((tg_02 = this.h.e()) != null) {
                    if (this.f instanceof ti_0) {
                        tg_02.c((ti_0)((Object)this.f));
                    }
                    tg_02.e((ti_0)((Object)this.f));
                } else {
                    a.error((Object)("pas de combat associ\u00e9 \u00e0 la target " + this.f.toString()));
                }
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
    public void a(aff_1 aff_12) {
        this.A = aff_12;
    }

    @Override
    protected void b(iQ iQ2) {
        is is2 = iq_0.ai();
        is2.f(this.y);
        if (this.w != eoz_1.f && this.w != eoz_1.r) {
            return;
        }
        iQ2.a(is2.a(ik_0.i().a(this.f.G()).b(this.f.H()).c(this.f.I())).e(this.f.F().l));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.y = iq_02.S();
            if (!iq_02.n()) {
                return;
            }
            ik_0 ik_02 = iq_02.o();
            this.A = new aff_1(ik_02.c(), ik_02.e(), Hw.c((long)ik_02.g()));
            this.B = aej_2.a(iq_02.r());
        }
    }

    @Override
    public boolean bm_() {
        if (this.w == eoz_1.f || this.w == eoz_1.r) {
            return true;
        }
        return super.bm_();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aE();
    }
}

