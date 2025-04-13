/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bDk
 */
public class bdk_0
extends bFZ {
    static final Logger q = Logger.getLogger(bdk_0.class);

    @Override
    public boolean b(Tv tv, TF tF) {
        if (tv != Tv.a) {
            return false;
        }
        this.a(tv);
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
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
        this.k(true);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.b(false);
        this.g(false);
        this.i(false);
        this.k(false);
    }

    @Override
    public cSS[] az_() {
        cto_0 cto_02 = (cto_0)cSY.v.a();
        cto_02.a(cUL.l.aH);
        return new cSS[]{cto_02};
    }

    @Override
    public String al_() {
        return bae.h().a("guild.ladder", new Object[0]);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    static /* synthetic */ void a(bdk_0 bdk_02, abm_1 abm_12) {
        bdk_02.a(abm_12);
    }
}

