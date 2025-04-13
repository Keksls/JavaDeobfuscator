/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bDn
extends bFZ {
    static final Logger q = Logger.getLogger(bDn.class);
    private static final String r = "guild.machine";

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case a: {
                cZl.a().a(this, byi_1.a);
                return true;
            }
            case F: {
                cZl.a().a(this, byi_1.b);
                return true;
            }
            case G: {
                cZl.a().a(this, byi_1.c);
                return true;
            }
        }
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.a;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.a, Tv.F, Tv.G};
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
        cTI cTI2 = (cTI)cSY.T.a();
        cTI2.a(cUL.ab.aH);
        cTI2.d("guild.mru.create");
        cTG cTG2 = (cTG)cSY.ak.a();
        cTG2.b(Tv.F);
        cTG2.a(cUL.aF.aH);
        cTG2.a("guild.mru.change.blazon");
        cTH cTH2 = (cTH)cSY.al.a();
        cTH2.b(Tv.G);
        cTH2.a(cUL.aG.aH);
        cTH2.a("guild.mru.change.name");
        return new cSS[]{cTI2, cTG2, cTH2};
    }

    @Override
    public String al_() {
        return bae.h().a(r, new Object[0]);
    }

    static /* synthetic */ void a(bDn bDn2, abm_1 abm_12) {
        bDn2.a(abm_12);
    }
}

