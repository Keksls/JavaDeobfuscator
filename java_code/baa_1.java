/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAA
 */
public class baa_1
extends bFZ {
    static final Logger q = Logger.getLogger(baa_1.class);
    private static final int r = 31;

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case z: {
                q.info((Object)"[BallotBox] vote d'un candidat");
                this.b(tv);
                return true;
            }
        }
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.z;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.z};
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
    }

    @Override
    public cSS[] az_() {
        return cSS.k;
    }

    @Override
    public String al_() {
        return bae.h().a("ie.urne", new Object[0]);
    }

    static /* synthetic */ void a(baa_1 baa_12, abm_1 abm_12) {
        baa_12.a(abm_12);
    }
}

