/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCR
 */
public final class bcr_1
extends bFZ {
    static final Logger r = Logger.getLogger(bcr_1.class);
    public static final int q = -1;
    private evc_2 s;
    private final fo_1 t = new bcs_1(this);
    private bHe u;
    private exk_2 v;
    int w = -1;
    private bfb_0 J;

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.m, Tv.n};
    }

    @Override
    public cSS[] az_() {
        return new cSS[]{cSY.Y.a()};
    }

    @Override
    protected Tv ap_() {
        return Tv.i;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.v = null;
        this.J = null;
        azu_0.j().b(cYr.a());
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.i(true);
        this.g(true);
        this.w = -1;
        this.u = new bHe(0L, 0, ue_0.o, 1);
    }

    @Override
    public String al_() {
        return bae.h().a("equipable.dummy", new Object[0]);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    protected fo_1 ad() {
        return this.t;
    }

    @Override
    public void ar_() {
        if (!Cz.f(this.l)) {
            this.s = (evc_2)evl_1.a.a(evg_1.w, Integer.parseInt(this.l));
        }
        if (this.s == null) {
            throw new IllegalArgumentException("Impossible de trouver le param\u00e8tre " + this.l + " pour l'\u00e9l\u00e9ment interactif d'id=" + this.d);
        }
    }

    public void a(Uo uo) {
        this.u.b(uo);
    }

    public void a(int n, int n2, vf_2 vf_22) {
        if (n == n2) {
            return;
        }
        if (n != -1 && this.v != null) {
            exk_2 exk_22 = this.v;
            this.v = null;
            this.u.e(exk_22);
        }
        if (n2 != -1) {
            if (vf_22.b > 0) {
                this.v = new exk_2();
                this.v.b(vf_22);
            } else {
                this.v = new exk_2(abd_1.c());
                this.v.b((ezr_0)eyo_1.g().d(this.w));
                this.v.a((short)1);
            }
            try {
                this.u.f(this.v);
            }
            catch (uz_0 uz_02) {
                r.warn((Object)"Ne devrait pas arriver, on a nettoy\u00e9 l'inventaire avant");
            }
            catch (Uy uy) {
                r.warn((Object)"Ne devrait pas arriver, on a nettoy\u00e9 l'inventaire avant");
            }
        }
    }

    public exk_2 Z() {
        return this.v;
    }

    public String ao() {
        return this.s.a();
    }

    public byte ap() {
        return this.s.d();
    }

    public int aq() {
        return this.w;
    }

    public void a(int n) {
        this.w = n;
    }

    public void a(bfb_0 bfb_02) {
        this.J = bfb_02;
    }

    public bfb_0 ar() {
        return this.J;
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        if (tv == Tv.x) {
            azu_0.j().b(cYr.a());
        }
        this.a(tv);
        return true;
    }

    @Override
    public bgf_1 aG_() {
        if (this.G == null) {
            this.G = new bgc_0(this);
        }
        return this.G;
    }

    @Override
    public boolean y() {
        return true;
    }

    static /* synthetic */ void a(bcr_1 bcr_12, abm_1 abm_12) {
        bcr_12.a(abm_12);
    }
}

