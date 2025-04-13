/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eJr
 */
public abstract class ejr_0
extends ejh_0 {
    private static final aqr_2 y = new eFw(new aqq_2[0]);
    protected boolean v = true;
    protected boolean w = false;
    protected boolean x = true;
    private aff_1 z;

    @Override
    public aqr_2 c_() {
        return y;
    }

    protected ejr_0() {
        this.M();
    }

    public abstract ejr_0 aD();

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        Su su = this.aE();
        if (!this.v) {
            if (su != null) {
                this.g.g(su.P_());
            }
            return;
        }
        if (su != null && su.t() && !this.aA()) {
            this.ba();
            return;
        }
        this.a(sd_02, bl, su);
    }

    @Override
    public void M() {
        super.M();
        this.c(189);
    }

    protected abstract Su aE();

    public aff_1 aF() {
        return this.z;
    }

    private void a(sd_0 sd_02, boolean bl, Su su) {
        tg_0 tg_02;
        boolean bl2 = true;
        if (su == null) {
            a.error((Object)"caster null sur un running effect teleport");
            bl2 = false;
        }
        if ((tg_02 = this.h.e()) == null) {
            a.warn((Object)("No fightmap for context " + this.h));
            bl2 = false;
        }
        aff_1 aff_12 = this.a(tg_02);
        if (!bl2 || aff_12 == null) {
            return;
        }
        int n = su.G();
        int n2 = su.H();
        short s2 = su.I();
        this.z = new aff_1(n, n2, s2);
        elr_0 elr_02 = null;
        if (this.D() && this.h instanceof efq_0) {
            elr_02 = new elr_0(((efq_0)this.h).l(), su, aff_12);
            elr_02.b(su.P_());
        }
        su.b(aff_12.d(), aff_12.e(), aff_12.f());
        this.c(sd_02, bl);
        if (this.h.g() != null && this.D() && elr_02 != null) {
            aej_2 aej_22 = new afs_2(n, n2, s2, su.G(), su.H(), su.I()).h();
            su.b(aej_22);
            elr_02.a(su.P_());
            elr_02.c();
            if (elr_02.d()) {
                elr_02.g();
            }
            su.b((aej_2)null);
        }
    }

    protected aff_1 a(tg_0 tg_02) {
        return this.g;
    }

    @Override
    public void j(sd_0 sd_02) {
        Su su = this.aE();
        tg_0 tg_02 = this.h.e();
        if (tg_02 == null) {
            a.warn((Object)("No fightmap for context " + this.h));
            this.v = false;
            return;
        }
        aff_1 aff_12 = this.a(tg_02);
        if (!(su instanceof epq_2) || aff_12 == null) {
            this.v = false;
            return;
        }
        ys_0 ys_02 = tg_02.c(aff_12.d(), aff_12.e(), aff_12.f());
        if (ys_02 == null) {
            this.v = false;
            return;
        }
        if (!this.w && su.a(eoz_1.ad)) {
            this.v = false;
            return;
        }
        if (!this.a(eff_0.I)) {
            boolean bl;
            if (!this.w && su.a(eoz_1.l)) {
                this.v = false;
                return;
            }
            boolean bl2 = bl = this.e != null && ((eqq_1)((Object)su)).Y() == ((eqq_1)((Object)this.e)).Y();
            if (!this.w && su.a(eoz_1.bd) && !bl) {
                this.v = false;
                return;
            }
            if (!this.w && su.a(eoz_1.be) && bl && ((erc_2)((Object)su)).hh() && !this.aG()) {
                this.v = false;
            }
        }
        if (this.x && !tg_02.a(su, aff_12)) {
            a.error((Object)("Try to telport on invalid cell. Position : " + aff_12 + " for instance " + tg_02.p()));
            this.v = false;
        }
    }

    protected boolean aG() {
        return false;
    }

    @Override
    public abstract boolean Q();

    @Override
    public abstract boolean R();

    @Override
    public abstract boolean S();

    @Override
    public void z() {
        this.z = null;
        this.w = false;
        this.x = true;
        super.z();
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(ik_0.i().a(this.g.d()).b(this.g.e()).c(this.g.f())).f(this.v));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            iq_0 iq_02 = iO2.r();
            this.v = iq_02.S();
            ik_0 ik_02 = iq_02.o();
            this.g.c(ik_02.c(), ik_02.e(), Hw.c((long)ik_02.g()));
        }
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

