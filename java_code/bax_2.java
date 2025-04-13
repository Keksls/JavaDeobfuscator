/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAx
 */
public class bax_2
extends bFZ
implements ezz_1 {
    static final Logger t = Logger.getLogger(bax_2.class);
    public static final short q = 1;
    protected eut_1 r;

    protected bax_2() {
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a((short)1);
        this.f(true);
        this.g(true);
        this.b(true);
        assert (this.r == null);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.r = null;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (tv == Tv.a) {
            cWa cWa2 = cWa.a();
            cWa2.a(this.r.a());
            azu_0.j().a(cWa2);
            this.b(tv);
            return true;
        }
        return false;
    }

    @Override
    public void ar_() {
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 1) {
            t.error((Object)("[LD] L'IE de BackgroundDisplay " + this.d + " doit avoir 1 param\u00e8tre"));
            return;
        }
        eut_1 eut_12 = (eut_1)evl_1.a.a(evg_1.f, Integer.valueOf(stringArray[0]));
        if (eut_12 == null) {
            t.error((Object)("[LD] L'IE de BackgroundDisplay " + this.d + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.r = eut_12;
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
        fii fii2 = fij.a().a(this.r.n());
        if (fii2 == null) {
            t.error((Object)("[LD] Impossible de trouver le visuel " + this.r.n() + " pour l'IE " + this.d), (Throwable)new IllegalArgumentException());
            return cSS.k;
        }
        ctb_0 ctb_02 = (ctb_0)cSY.R.a();
        ctb_02.a(fii2.c());
        ctb_02.a("desc.mru." + fii2.d());
        ctb_02.b(this.v());
        return new cSS[]{ctb_02};
    }

    @Override
    public String al_() {
        return bae.h().a(79, (long)this.r.m(), new Object[0]);
    }

    @Override
    public ezx_1 ay_() {
        return this.r;
    }

    static /* synthetic */ void a(bax_2 bax_22, abm_1 abm_12) {
        bax_22.a(abm_12);
    }
}

