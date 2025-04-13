/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAr
 */
public class bar_1
extends bFZ {
    static final Logger q = Logger.getLogger(bar_1.class);
    private static final cSS[] r = new cSS[]{new cUi()};
    private eur_1 s;

    bar_1() {
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
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
    public cSS[] az_() {
        if (this.s == null) {
            q.error((Object)("No m_info for ArtisansBook with id=" + this.d));
            return r;
        }
        fii fii2 = fij.a().a(this.s.n());
        if (fii2 == null) {
            q.error((Object)("No visual id=" + this.s.n()));
            return r;
        }
        cTa cTa2 = (cTa)cSY.p.a();
        cTa2.a(fii2);
        return new cSS[]{cTa2};
    }

    @Override
    public short aL() {
        return this.W();
    }

    @Override
    public String al_() {
        return bae.h().a("craft.artisansBook.name", new Object[0]);
    }

    @Override
    public void ar_() {
        eur_1 eur_12 = (eur_1)evl_1.a.a(evg_1.C, Integer.parseInt(this.l));
        if (eur_12 == null) {
            q.error((Object)("[LD] The artisans' book " + this.d + " has its parameter [" + Integer.valueOf(this.l) + "] that has no match in Admins"));
            return;
        }
        this.s = eur_12;
        this.i(true);
    }

    @Override
    public void aE_() {
        super.aE_();
        if (azu_0.j().c(cVS.b)) {
            cVS.b.a(this);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    public int p() {
        return this.s.a();
    }

    static /* synthetic */ void a(bar_1 bar_12, abm_1 abm_12) {
        bar_12.a(abm_12);
    }
}

