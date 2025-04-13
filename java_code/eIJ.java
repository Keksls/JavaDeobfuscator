/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class eIJ
extends eig_0 {
    private static final aqr_2 B = new eFw(new eFv("Param standard", new eFu("id de la zone heure", eFx.a), new eFu("heure", eFx.c)));
    private byte C = 0;

    @Override
    public aqr_2 c_() {
        return B;
    }

    @Override
    public eig_0 aD() {
        return new eIJ();
    }

    public eIJ aI() {
        eIJ eIJ2 = (eIJ)super.aE();
        eIJ2.C = 0;
        return eIJ2;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        Iterable<sr_0> iterable;
        if (this.v == null) {
            iterable = elg_0.a().f(this.m);
            if (iterable != null) {
                short s2;
                if (this.C == 0 && this.c != null) {
                    s2 = this.aZ();
                    this.C = (byte)((efh_0)this.c).a(1, s2, eFb.a);
                }
                s2 = this.aZ();
                this.v = ((ekk_0)iterable).b(new elb_0(this.w, this.g.d(), this.g.e(), this.g.f(), this.h, this.e.a_(), this.e, s2, this.e.F()));
                ((eko_0)this.v).c(this.C);
            } else {
                a.error((Object)("EffectArea inexistante pour l'id " + this.m));
                this.j(true);
                return;
            }
        }
        iterable = new ArrayList();
        for (sr_0 sr_02 : this.h.g().f()) {
            if (sr_02.w() != ele_0.b.a() || sr_02.v() != this.e || ((eko_0)sr_02).ay() != this.C) continue;
            ((ArrayList)iterable).add((sr_0)sr_02);
        }
        for (sr_0 sr_02 : iterable) {
            this.h.g().b(sr_02);
        }
        if (this.v != null) {
            this.c(sd_02, bl);
            this.h.g().a(this.v);
        } else {
            this.j(true);
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        super.j(sd_02);
        this.C = (byte)((efh_0)this.c).a(1, this.aZ(), eFb.a);
    }

    @Override
    public /* synthetic */ eig_0 aE() {
        return this.aI();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aI();
    }
}

