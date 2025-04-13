/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bEh
extends bFZ
implements ezz_1 {
    static final Logger r = Logger.getLogger(bEh.class);
    int s;
    private evj_1 t;
    private final fo_1 u = new bEi(this, 4);

    @Override
    protected fo_1 ad() {
        return this.u;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    public int Z() {
        return this.s;
    }

    @Override
    public boolean M() {
        return false;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        this.b(tv);
        return true;
    }

    @Override
    public void ar_() {
        super.ar_();
        this.t = (evj_1)evl_1.a.a(evg_1.m, Integer.parseInt(this.l));
    }

    @Override
    public byte W() {
        return 8;
    }

    @Override
    public Tv ap_() {
        return Tv.m;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.m, Tv.n};
    }

    @Override
    public cSS[] az_() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.be() && !bmr_12.bf()) {
            return cSS.k;
        }
        ctz_0 ctz_02 = (ctz_0)cSY.Q.a();
        ctz_02.a(this.t.n());
        return new cSS[]{ctz_02};
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.i(false);
        this.g(false);
        this.t = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.i(true);
        this.g(true);
        this.s = 0;
        assert (this.t == null);
    }

    @Override
    public String al_() {
        return bae.h().a(101, (long)this.t.m(), new Object[0]);
    }

    public String ao() {
        return bae.h().a(102, (long)this.t.a(), new Object[0]);
    }

    @Override
    public ezx_1 ay_() {
        return null;
    }

    static /* synthetic */ void a(bEh bEh2, abm_1 abm_12) {
        bEh2.a(abm_12);
    }
}

