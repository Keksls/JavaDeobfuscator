/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bEs
 */
public class bes_0
extends bFZ {
    static final Logger q = Logger.getLogger(bes_0.class);

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        if (tv == Tv.C) {
            azu_0.j().a(new bev_0(this));
        }
        this.b(tv);
        return true;
    }

    @Override
    public Tv ap_() {
        return Tv.C;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.C};
    }

    @Override
    public cSS[] az_() {
        cTF cTF2 = (cTF)cSY.w.a();
        cTF2.a(cUL.d.aH);
        cTF2.a("nationSelectionBoard");
        cTF2.b(Tv.C);
        cSS[] cSSArray = new cSS[]{cTF2};
        return cSSArray;
    }

    @Override
    public String al_() {
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)bae.h().a("nationSelectionBoard", new Object[0]));
        return ani_22.r();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.i(true);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
    }

    static /* synthetic */ void a(bes_0 bes_02, abm_1 abm_12) {
        bes_02.a(abm_12);
    }
}

