/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBB
 */
public class bbb_1
extends bFZ
implements bgq_1,
ezz_1 {
    static final Logger r = Logger.getLogger(bbb_1.class);
    private static final cSS[] s = new cSS[]{new cUi()};
    private bgl_1 t;

    bbb_1() {
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
        if (this.t == null) {
            r.error((Object)("Pas de m_info pour craftTableId=" + this.d));
            return s;
        }
        fii fii2 = fij.a().a(this.t.n());
        if (fii2 == null) {
            r.error((Object)("Pas de visual id=" + this.t.n()));
            return s;
        }
        cTn cTn2 = (cTn)cSY.o.a();
        cTn2.a(fii2);
        boolean bl = this.c(eud_1.a);
        if (!bl) {
            cTn cTn3 = (cTn)cSY.O.a();
            cTn3.a(fii2);
            return new cSS[]{cTn2, cTn3};
        }
        return new cSS[]{cTn2};
    }

    @Override
    public short aL() {
        return this.W();
    }

    @Override
    public String al_() {
        if (this.t == null) {
            r.error((Object)("Pas de param\u00e9trage valide pour craftTableId=" + this.d));
            return "#ERROR#";
        }
        return bae.h().a(59, (long)this.t.m(), new Object[0]);
    }

    @Override
    public boolean a(int n, byte by) {
        return by == -2 || by == -1 || this.t.e().contains(n);
    }

    @Override
    public boolean a(int n) {
        return this.t.e().contains(n);
    }

    @Override
    public int aL_() {
        if (this.t == null) {
            return -1;
        }
        return this.t.n();
    }

    @Override
    public int Z() {
        return this.t.d();
    }

    @Override
    public void ar_() {
        bgl_1 bgl_12 = (bgl_1)evl_1.a.a(evg_1.a, Integer.valueOf(this.l));
        if (bgl_12 == null) {
            r.error((Object)("[LD] La Machine de Craft " + this.d + " \u00e0 un param\u00e8tre [" + Integer.valueOf(this.l) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.t = bgl_12;
        this.i(true);
    }

    @Override
    public void aE_() {
        super.aE_();
        if (azu_0.j().c(cXC.a())) {
            cXC.a().a(this);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.t = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        assert (this.t == null);
    }

    @Override
    public boolean aF_() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.b.a(new emh_0[]{bmr_12});
    }

    @Override
    public ezx_1 ay_() {
        return this.t;
    }

    @Override
    public bgl_1 aa() {
        return this.t;
    }

    static /* synthetic */ void a(bbb_1 bbb_12, abm_1 abm_12) {
        bbb_12.a(abm_12);
    }
}

