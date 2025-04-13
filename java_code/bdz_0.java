/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bDz
 */
public class bdz_0
extends bFZ {
    static final Logger q = Logger.getLogger(bdz_0.class);

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.B = true;
    }

    @Override
    public void c(ph_0 ph_02) {
        q.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        q.info((Object)("Action performed on interactive element : " + tv));
        switch (tv) {
            case m: {
                cza_0.a().a(this);
                this.a(tv);
                this.aI_();
                this.b(tv);
                return true;
            }
            case n: 
            case l: {
                this.a(tv);
                this.aI_();
                this.b(tv);
                return true;
            }
        }
        return false;
    }

    @Override
    public String al_() {
        return bae.h().a("haven.world.entrance.title", new Object[0]);
    }

    @Override
    public Tv ap_() {
        return Tv.m;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.m, Tv.n, Tv.l};
    }

    @Override
    public cSS[] az_() {
        return new cSS[]{cSY.am.a()};
    }

    static /* synthetic */ void a(bdz_0 bdz_02, abm_1 abm_12) {
        bdz_02.a(abm_12);
    }
}

