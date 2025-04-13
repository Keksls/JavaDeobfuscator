/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCL
 */
public class bcl_1
extends bFZ {
    static final Logger q = Logger.getLogger(bcl_1.class);

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        this.b(tv);
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.E;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.E};
    }

    @Override
    public cSS[] az_() {
        fii fii2 = fij.a().a(83);
        cto_0 cto_02 = (cto_0)cSY.v.a();
        cto_02.a(fii2.c());
        cto_02.d("desc.mru." + fii2.d());
        return new cSS[]{cto_02};
    }

    @Override
    public short aL() {
        return 60;
    }

    @Override
    public String al_() {
        return bae.h().a("ie.ladderBoard", new Object[0]);
    }

    @Override
    public void ar_() {
        String[] stringArray = this.l.split(";");
        if (stringArray.length != this.Z()) {
            q.error((Object)("[LevelDesign] La DungeonLadderBoard " + this.d + " doit avoir " + this.Z() + " param\u00e8tres : instanceId"));
            return;
        }
        super.ar_();
    }

    protected int Z() {
        return 1;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.g = 1;
        this.f(true);
        this.b(false);
        this.g(true);
        this.B = true;
        this.A = true;
    }

    static /* synthetic */ void a(bcl_1 bcl_12, abm_1 abm_12) {
        bcl_12.a(abm_12);
    }
}

