/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAE
 */
public class bae_1
extends bFZ {
    static final Logger q = Logger.getLogger(bae_1.class);

    bae_1() {
    }

    public fhg p() {
        return fhg.a(this.B());
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        q.info((Object)String.format("Action %s performed by player %s", tv, tF.a_()));
        if (tv != Tv.a) {
            return false;
        }
        this.a(tv);
        this.aI_();
        this.b(tv);
        return true;
    }

    @Override
    public cSS[] az_() {
        cto_0 cto_02 = (cto_0)cSY.aj.a();
        cto_02.a(cUL.F.aH);
        return new cSS[]{cto_02};
    }

    @Override
    public void c(ph_0 ph_02) {
        q.info((Object)("Update view : " + ph_02));
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
    public String al_() {
        return bae.h().a(103, (long)this.af(), new Object[0]);
    }

    static /* synthetic */ void a(bae_1 bae_12, abm_1 abm_12) {
        bae_12.a(abm_12);
    }
}

