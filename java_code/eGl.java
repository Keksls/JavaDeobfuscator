/*
 * Decompiled with CFR 0.152.
 */
public final class eGl
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("D\u00e9faut", new eFu("Id de la propri\u00e9t\u00e9", eFx.b)));
    private aff_1 w;
    private aej_2 x;

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eGl() {
        this.M();
    }

    @Override
    public void a(aff_1 aff_12) {
        this.w = aff_12;
    }

    @Override
    public sd_0<efh_0, efi_0> x() {
        eGl eGl2 = new eGl();
        eGl2.m = this.m;
        return eGl2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        Object object;
        boolean bl2;
        if (this.f == null) {
            this.j(true);
            return;
        }
        if (!(this.f instanceof epq_2)) {
            a.error((Object)("Can not use ApplyFightProperty " + this.m + " on something else than BasicCharacterInfo, effectId : " + this.o()));
            this.j(true);
            return;
        }
        eoz_1 eoz_12 = eoz_1.a(this.m);
        if (eoz_12 == null) {
            this.j(true);
            return;
        }
        this.f.c(eoz_12);
        boolean bl3 = bl2 = this.h.d() != null;
        if (eoz_12 == eoz_1.K && bl2) {
            ((eof_2)this.h.d()).C(this.f.a_());
        }
        if (eoz_12 == eoz_1.k && bl2) {
            this.h.d().t();
        }
        if (eoz_12 == eoz_1.E && this.f.a(eps_0.c)) {
            this.f.b(eps_0.c).o();
        }
        if (eoz_12 == eoz_1.H && this.f.a(eps_0.d)) {
            this.f.b(eps_0.d).o();
        }
        if (eoz_12 == eoz_1.y && this.f.a(eps_0.e)) {
            object = this.f.b(eps_0.e);
            if (object == null) {
                a.error((Object)("charac nulle alors hasCharac renvoie true " + this.f + ", " + this.f.getClass().getSimpleName()));
            } else {
                ((rs_0)object).s();
            }
        }
        if ((eoz_12 == eoz_1.f || eoz_12 == eoz_1.r) && this.f instanceof ti_0 && (object = this.h.e()) != null) {
            ((tg_0)object).d((ti_0)((Object)this.f));
        }
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
    public void j(sd_0 sd_02) {
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
    }

    @Override
    public void al() {
        boolean bl;
        if (this.f == null) {
            return;
        }
        eoz_1 eoz_12 = eoz_1.a(this.m);
        if (eoz_12 == null) {
            return;
        }
        this.f.d(eoz_12);
        boolean bl2 = bl = eoz_12 == eoz_1.f || eoz_12 == eoz_1.r;
        if (bl) {
            tg_0 tg_02;
            if (this.w != null) {
                this.f.b(this.w.d(), this.w.e(), this.w.f());
                this.f.a(this.x);
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

    @Override
    protected void b(iQ iQ2) {
        is is2 = iq_0.ai();
        is2.f(this.P);
        eoz_1 eoz_12 = eoz_1.a(this.m);
        if (eoz_12 != eoz_1.f && eoz_12 != eoz_1.r) {
            return;
        }
        iQ2.a(is2.a(ik_0.i().a(this.f.G()).b(this.f.H()).c(this.f.I())).e(this.f.F().l));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.P = iq_02.S();
            if (!iq_02.n()) {
                return;
            }
            ik_0 ik_02 = iq_02.o();
            this.w = new aff_1(ik_02.c(), ik_02.e(), Hw.c((long)ik_02.g()));
            this.x = aej_2.a(iq_02.r());
        }
    }

    @Override
    public boolean bm_() {
        eoz_1 eoz_12 = eoz_1.a(this.m);
        if (eoz_12 == eoz_1.f || eoz_12 == eoz_1.r) {
            return true;
        }
        return super.bm_();
    }
}

