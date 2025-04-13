/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bEW
 */
public class bew_0
extends bFZ {
    static final Logger q = Logger.getLogger(bew_0.class);
    private bfa_0 r;

    @Override
    protected fo_1 ad() {
        return new bEX(this);
    }

    @Override
    public cSS[] az_() {
        if (((bgj_0)this.aG_()).a() <= 0) {
            return cSS.k;
        }
        cTF cTF2 = (cTF)cSY.w.a();
        cTF2.a(cUL.a.aH);
        cTF2.a("desc.mru.openSeedSpreader");
        cTF2.b(Tv.r);
        return new cSS[]{cTF2};
    }

    @Override
    public void c(ph_0 ph_02) {
        q.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        q.info((Object)("Action performed on interactive element : " + tv.toString()));
        this.a(tv);
        if (tv == Tv.r) {
            this.r = new bfa_0(this);
            azu_0.j().a(this.r);
            this.b(tv);
        }
        return true;
    }

    public bfa_0 Z() {
        return this.r;
    }

    @Override
    public Tv ap_() {
        return Tv.r;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.r};
    }

    @Override
    public byte W() {
        return 8;
    }

    @Override
    public bgf_1 aG_() {
        if (this.G == null) {
            this.G = new bgj_0(this);
        }
        return this.G;
    }

    @Override
    public boolean y() {
        return true;
    }

    static /* synthetic */ void a(bew_0 bew_02, abm_1 abm_12) {
        bew_02.a(abm_12);
    }
}

