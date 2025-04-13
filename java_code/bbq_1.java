/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBQ
 */
public class bbq_1
extends bFZ {
    static final Logger q = Logger.getLogger(bbq_1.class);

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)0);
        this.f(true);
        this.b(true);
        this.g(true);
        this.i(true);
    }

    @Override
    public String al_() {
        return bae.h().a("ie.dimensionalBagAdminConsole", new Object[0]);
    }

    @Override
    public void c(ph_0 ph_02) {
        q.info((Object)("[ON VIEW UPDATED] " + ph_02));
    }

    @Override
    protected fo_1 ad() {
        return fo_1.c;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        ans_0.D();
        azu_0 azu_02 = ans_0.F();
        switch (tv) {
            case a: {
                if (!azu_02.c(cXQ.d())) {
                    azu_02.a(cXQ.d());
                } else {
                    azu_02.b(cXQ.d());
                }
                return true;
            }
            case F: {
                if (!azu_02.c(cxi_0.a())) {
                    azu_02.a(cxi_0.a());
                } else {
                    azu_02.b(cxi_0.a());
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
        return new Tv[]{Tv.a, Tv.F};
    }

    @Override
    public cSS[] az_() {
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = bmr_12.di() == bmr_12.dj();
        cTF cTF2 = (cTF)cSY.w.a();
        cTF2.b(Tv.a);
        cTF2.a(cUL.V.aH);
        cTF2.a("desc.mru.manageRooms");
        cTF2.c(bl);
        cTF cTF3 = (cTF)cSY.w.a();
        cTF3.b(Tv.F);
        cTF3.a(cUL.a.aH);
        cTF3.a("desc.mru.manageBagAppearance");
        cTF3.c(bl);
        return new cSS[]{cTF2, cTF3};
    }

    @Override
    public byte W() {
        return 4;
    }

    static /* synthetic */ void a(bbq_1 bbq_12, abm_1 abm_12) {
        bbq_12.a(abm_12);
    }
}

