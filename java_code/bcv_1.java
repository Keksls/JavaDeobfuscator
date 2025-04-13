/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCV
 */
public class bcv_1
extends bFZ {
    static final Logger q = Logger.getLogger(bcv_1.class);
    private evd_1 r;

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (tv != Tv.a) {
            return false;
        }
        this.a(tv);
        cYF.a().a(this);
        this.b(tv);
        return true;
    }

    @Override
    public Tv ap_() {
        return Tv.a;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.a};
    }

    @Override
    public void ar_() {
        this.r = (evd_1)evl_1.a.a(evg_1.q, Integer.parseInt(this.l));
    }

    @Override
    public cSS[] az_() {
        cto_0 cto_02 = (cto_0)cSY.v.a();
        fii fii2 = fij.a().a(this.r.n());
        cto_02.a(fii2.c());
        return new cSS[]{cto_02};
    }

    @Override
    public String al_() {
        return bae.h().a(107, this.r == null ? -1L : (long)this.r.m(), new Object[0]);
    }

    public String Z() {
        int n = this.r == null ? -1 : this.r.m();
        return bae.h().a(153, (long)n) ? bae.h().a(153, (long)n, new Object[0]) : null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.g = 1;
        this.f(true);
        this.b(true);
        this.g(true);
        this.B = true;
        this.A = true;
    }

    @Override
    public bgf_1 aG_() {
        if (this.G == null) {
            this.G = new bgd_0(this);
        }
        return this.G;
    }

    @Override
    public boolean y() {
        return true;
    }

    public evd_1 ao() {
        return this.r;
    }

    static /* synthetic */ void a(bcv_1 bcv_12, abm_1 abm_12) {
        bcv_12.a(abm_12);
    }
}

