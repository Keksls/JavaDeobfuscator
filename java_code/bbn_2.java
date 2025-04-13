/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bBn
 */
class bbn_2
extends bnh_1 {
    private final eaa_0 al;

    bbn_2(eaa_0 eaa_02) {
        this.al = eaa_02;
        this.a(abd_1.c());
    }

    @Override
    @NotNull
    public biI bv() {
        if (this.Z == null) {
            this.a(new bbm_2(this));
        }
        return this.Z;
    }

    public eaa_0 cy() {
        return this.al;
    }

    public void cB() {
        Object r2;
        this.c(bkt_1.a().a(this.al.g()).f());
        this.g(this.al.h());
        if (this.al instanceof fbh_0) {
            this.fE().a(fbc_0.a.a(((fbh_0)((Object)this.al)).c()));
        }
        eb eb2 = this.al.k();
        this.a(eb2.c(), true);
        this.b(eb2.e(), true);
        this.c(eb2.g(), true);
        this.a(eb2, true);
        this.aO();
        this.a((byte)eb2.u(), true);
        this.b((byte)eb2.w(), true);
        this.aP();
        bbm_2 bbm_22 = (bbm_2)this.bv();
        if (eb2.B() && eb2.C() > 0 && (r2 = eyo_1.g().d(eb2.C())) != null) {
            bbm_22.a((ezr_0)r2, (short)exh_2.a.A);
        }
        if (eb2.D() && eb2.E() > 0 && (r2 = eyo_1.g().d(eb2.E())) != null) {
            bbm_22.a((ezr_0)r2, (short)exh_2.d.A);
        }
        if (eb2.F() && eb2.G() > 0 && (r2 = eyo_1.g().d(eb2.G())) != null) {
            bbm_22.a((ezr_0)r2, (short)exh_2.f.A);
        }
        this.c(bae.h().a("ie.statue", this.al.f()));
    }

    @Override
    public cSS[] aI() {
        return cSS.k;
    }

    @Override
    @NotNull
    public /* synthetic */ YQ cm() {
        return this.bv();
    }
}

