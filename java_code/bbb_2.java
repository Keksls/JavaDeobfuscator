/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBb
 */
public class bbb_2
extends bFZ {
    protected static final Logger r = Logger.getLogger(bbb_2.class);
    protected int s;
    protected int t;
    protected int u;
    private final fo_1 q = new bbc_2(this, 22);

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.B = true;
        this.C = 40;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.g(true);
        this.b(false);
    }

    @Override
    protected fo_1 ad() {
        return this.q;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case w: {
                this.a(tv);
                this.aI_();
                this.b(tv);
                this.a(tv);
                return true;
            }
        }
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.w;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.w};
    }

    @Override
    public String al_() {
        return bae.h().a("ie.challenge." + this.t, new Object[0]);
    }

    @Override
    public short aL() {
        return (short)((float)this.W() * 10.0f);
    }

    @Override
    public cSS[] az_() {
        cSS[] cSSArray = new cSS[1];
        cTF cTF2 = (cTF)cSY.w.a();
        cTF2.a(this.u);
        cTF2.a("ie.challenge.mru." + this.t);
        cTF2.b(Tv.w);
        cSSArray[0] = cTF2;
        return cSSArray;
    }

    @Override
    public void aE_() {
        super.aE_();
    }

    public void u() {
        if (this.s == -1) {
            ccm_1.g().a((pj_0)this);
        } else {
            for (ph_0 ph_02 : this.av_()) {
                if (!(ph_02 instanceof bfr_0)) continue;
                ph_02.b(this.s);
            }
        }
    }

    static /* synthetic */ void a(bbb_2 bbb_22, abm_1 abm_12) {
        bbb_22.a(abm_12);
    }

    static /* synthetic */ aff_1 a(bbb_2 bbb_22) {
        return bbb_22.e;
    }
}

