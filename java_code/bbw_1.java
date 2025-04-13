/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBw
 */
public class bbw_1
extends bFZ
implements bqI {
    static final Logger r = Logger.getLogger(bbw_1.class);
    private euw_1 s;
    private bqK t;

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        switch (tv) {
            case m: {
                try {
                    bpf_2 bpf_22 = new bpf_2(this, new bbx_2(this));
                    if (!bpf_22.g()) {
                        r.error((Object)"[IE] Impossible de d\u00e9marrer le browsing");
                        return false;
                    }
                    bpf_22.a();
                    this.b(tv);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    r.error((Object)"[IE] Impossible de d\u00e9marrer le browsing", (Throwable)unsupportedOperationException);
                    return false;
                }
                return true;
            }
            case n: {
                azu_0.j().b(bqJ.a);
                this.b(tv);
                azu_0.j().k().dN();
                return true;
            }
        }
        r.error((Object)("Action non trait\u00e9e sur une Collector : " + tv));
        return false;
    }

    @Override
    public eAZ c() {
        return (eAZ)((Object)this.t);
    }

    @Override
    public euw_1 a() {
        return this.s;
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
    public String al_() {
        return bae.h().a(86, (long)this.s.m(), new Object[0]);
    }

    @Override
    public void a(byte[] byArray) {
        this.t.a(byArray);
    }

    @Override
    public bFZ b() {
        return this;
    }

    @Override
    public cSS[] az_() {
        fii fii2 = fij.a().a(this.s.n());
        cSS[] cSSArray = new cSS[1];
        cto_0 cto_02 = (cto_0)cSY.v.a();
        cto_02.a(fii2.c());
        cto_02.d("desc.mru." + fii2.d());
        cSSArray[0] = cto_02;
        return cSSArray;
    }

    @Override
    public void ar_() {
        this.s = (euw_1)evl_1.a.a(evg_1.i, Integer.valueOf(this.l));
        this.t = this.s.f() ? new bqM(this.s) : new bqL(this.s);
        this.i(true);
        this.g(true);
        this.b(true);
    }

    @Override
    public boolean aF_() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.b.a(new emh_0[]{bmr_12});
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.s = null;
        this.t = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        assert (this.s == null);
        assert (this.t == null);
    }

    @Override
    public String toString() {
        return "Collector : \r\nm_info=" + this.s + "\r\nm_inventory=" + this.t;
    }

    static /* synthetic */ void a(bbw_1 bbw_12, abm_1 abm_12) {
        bbw_12.a(abm_12);
    }
}

