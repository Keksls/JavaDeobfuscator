/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bES
extends bFZ
implements ezz_1 {
    static final Logger t = Logger.getLogger(bES.class);
    public static final short q = 1;
    protected evn_1 r;

    protected bES() {
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
            String string = bae.h().a(119, (long)this.r.m(), new Object[0]);
            String string2 = bae.h().a(120, (long)this.r.m(), new Object[0]);
            fis_1.a().a("arcadeDungeon", new bgr(string, string2, this.r.a()));
            fpm_0.b().a("arcadeDungeonTeaserDialog", cfi_0.a("arcadeDungeonTeaserDialog"), 257L, (short)10000);
            bET bET2 = new bET(this);
            fpm_0.b().a(bET2);
            fpm_0.b().a("wakfu.arcadeDungeon", cFB.class);
            cdw_0.n().c(600120L);
            return true;
        }
        return false;
    }

    @Override
    public void ar_() {
        String[] stringArray = this.l.split(";");
        if (stringArray.length != 1) {
            t.error((Object)("[LD] L'IE de RewardDisplayer " + this.d + " doit avoir 1 param\u00e8tre"));
            return;
        }
        evn_1 evn_12 = (evn_1)evl_1.a.a(evg_1.u, Integer.valueOf(stringArray[0]));
        if (evn_12 == null) {
            t.error((Object)("[LD] L'IE de RewardDisplayer " + this.d + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.r = evn_12;
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
        return "";
    }

    @Override
    public ezx_1 ay_() {
        return this.r;
    }

    static /* synthetic */ void a(bES bES2, abm_1 abm_12) {
        bES2.a(abm_12);
    }
}

