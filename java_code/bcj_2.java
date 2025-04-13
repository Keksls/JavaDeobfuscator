/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCj
 */
public class bcj_2
extends bFZ {
    protected static final Logger q = Logger.getLogger(bcj_2.class);
    private static final byte r = 0;
    private static final byte s = 1;

    @Override
    public boolean b(Tv tv, TF tF) {
        q.info((Object)("Action performed on interactive element : " + tv));
        this.a(tv);
        switch (tv) {
            case a: {
                this.b(tv);
                boolean bl = this.B() == 1;
                cpQ cpQ2 = new cpQ();
                cpQ2.a(bl);
                azu_0.j().K().c(cpQ2);
                cdw_0.n().c(bl ? 600143L : 600142L);
                return true;
            }
            case F: {
                cXO cXO2 = cXO.a();
                if (azu_0.j().c(cXO2)) {
                    azu_0.j().b(cXO2);
                } else {
                    azu_0.j().a(cXO2);
                }
                return true;
            }
            case G: {
                boolean bl;
                bmr_1 bmr_12 = azu_0.j().k();
                boolean bl2 = bl = bmr_12.di() == bmr_12.dj();
                if (!bl) break;
                bso_1 bso_12 = bmr_12.dj().v();
                boolean bl3 = !bso_12.q();
                azu_0.j().K().c(new cpP(bl3));
                bso_12.b(bl3);
                aul_0.a().c(bae.h().a(bl3 ? "chat.notify.dimensionalBag.bagRemainAtDisconnection" : "chat.notify.dimensionalBag.bagDoesntRemainAtDisconnection", new Object[0]));
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
    public cSS[] aI() {
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl = bmr_12.di() == bmr_12.dj();
        cTF cTF2 = (cTF)cSY.w.a();
        cTF2.b(Tv.a);
        if (this.B() == 0) {
            cTF2.a(cUL.z.aH);
            cTF2.a("desc.mru.dimensionalBag.unlock");
        } else {
            cTF2.a(cUL.A.aH);
            cTF2.a("desc.mru.dimensionalBag.lock");
        }
        cTF2.c(bl);
        cTF cTF3 = (cTF)cSY.w.a();
        cTF3.b(Tv.F);
        cTF3.a(cUL.o.aH);
        cTF3.a("desc.mru.managePermissions");
        cTF3.c(bl);
        cTF cTF4 = (cTF)cSY.w.a();
        cTF4.b(Tv.G);
        cTF4.a(cUL.G.aH);
        if (bmr_12.dj().v().q()) {
            cTF4.a("desc.mru.dimensionalBag.doesntLeaveBagAtDisconnection");
        } else {
            cTF4.a("desc.mru.dimensionalBag.leaveBagAtDisconnection");
        }
        cTF4.c(bl);
        return new cSS[]{cTF2, cTF3, cTF4};
    }

    @Override
    public short aL() {
        return (short)((float)this.W() * 10.0f);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)0);
        this.b(true);
        this.g(true);
        this.k(true);
        this.m(false);
        this.l(true);
        this.i(true);
    }

    @Override
    public String al_() {
        return bae.h().a("ie.dimensional.bag.lock.console", new Object[0]);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    static /* synthetic */ void a(bcj_2 bcj_22, abm_1 abm_12) {
        bcj_22.a(abm_12);
    }
}

