/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBX
 */
public class bbx_1
extends bFZ {
    protected static final Logger q = Logger.getLogger(bbx_1.class);

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.i(true);
        this.b(false);
        this.g(true);
    }

    @Override
    public String al_() {
        return bae.h().a("ie.dimensional.bag.craft.console", new Object[0]);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    protected fo_1 ad() {
        return fo_1.c;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        switch (tv) {
            case a: {
                cXL cXL2 = cXL.a();
                if (!azu_0.j().c(cXL2)) {
                    azu_0.j().a(cXL2);
                } else {
                    azu_0.j().b(cXL2);
                }
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
        return new Tv[]{Tv.a};
    }

    @Override
    public cSS[] az_() {
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = bmr_12.di() == bmr_12.dj();
        cTF cTF2 = (cTF)cSY.w.a();
        cTF2.b(Tv.a);
        cTF2.a(cUL.x.aH);
        cTF2.a("desc.mru.manageCraftFee");
        cTF2.c(bl);
        return new cSS[]{cTF2};
    }

    static /* synthetic */ void a(bbx_1 bbx_12, abm_1 abm_12) {
        bbx_12.a(abm_12);
    }
}

