/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bDH
 */
public class bdh_0
extends bFZ {
    static final Logger q = Logger.getLogger(bdh_0.class);
    private bDK r;

    @Override
    public cSS[] az_() {
        cTF cTF2 = (cTF)cSY.w.a();
        cTF2.a(cUL.a.aH);
        cTF2.a("desc.mru.openResourcesCollector");
        cTF2.b(Tv.m);
        cSS[] cSSArray = new cSS[]{cTF2};
        return cSSArray;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)1);
        this.b(true);
        this.g(true);
    }

    @Override
    public void a(aff_1 aff_12) {
        super.a(aff_12);
        this.S().add(aff_12);
    }

    @Override
    public boolean b(aff_1 aff_12) {
        return aff_12.a((Object)this.P_());
    }

    @Override
    public void c(ph_0 ph_02) {
        q.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        q.info((Object)("Action performed on interactive element : " + tv.toString()));
        this.a(tv);
        if (tv == Tv.m) {
            this.r = new bDK(this);
            azu_0.j().a(this.r);
            this.b(tv);
        }
        if (tv == Tv.n) {
            if (azu_0.j().c(this.r)) {
                azu_0.j().b(this.r);
            }
            this.b(tv);
            azu_0.j().k().dN();
        }
        return false;
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
    public byte W() {
        return 0;
    }

    public bDK Z() {
        return this.r;
    }

    static /* synthetic */ void a(bdh_0 bdh_02, abm_1 abm_12) {
        bdh_02.a(abm_12);
    }
}

