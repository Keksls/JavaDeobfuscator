/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAT
 */
public final class bat_2
extends bFZ {
    static final Logger q = Logger.getLogger(bat_2.class);
    private euv_1 r;
    int[] s;
    private bHe t;
    private String u;
    private final fo_1 v = new bau_1(this);

    @Override
    public boolean b(Tv tv, TF tF) {
        if (tv == Tv.x) {
            azu_0.j().b(cwp_0.a());
        }
        return false;
    }

    @Override
    public String al_() {
        return this.u;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.o, Tv.p};
    }

    @Override
    public cSS[] az_() {
        if (this.aG_().m() == azu_0.j().k().a_() || cSW.a(this.aH_().m())) {
            return new cSS[]{cSY.Z.a()};
        }
        return new cSS[]{cSY.ab.a()};
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.i(true);
        this.g(true);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.t = null;
        azu_0.j().b(cwp_0.a());
    }

    @Override
    protected fo_1 ad() {
        return this.v;
    }

    @Override
    public void ar_() {
        if (!Cz.f(this.l)) {
            this.r = (euv_1)evl_1.a.a(evg_1.x, Integer.parseInt(this.l));
        }
        if (this.r == null) {
            throw new IllegalArgumentException("Impossible de trouver le param\u00e8tre " + this.l + " pour l'\u00e9l\u00e9ment interactif d'id=" + this.d);
        }
        this.u = bae.h().a(150, (long)this.r.m(), new Object[0]);
        this.t = new bHe(0L, 0, exb_1.o, this.r.a());
    }

    public void u() {
        if (this.s.length != this.t.h()) {
            throw new IllegalArgumentException("La taille des donn\u00e9es dynamiques ne correspond pas \u00e0 la taille des donn\u00e9es statiques. Bookcase id=" + this.d);
        }
        boolean bl = cdw_0.n().v();
        cdw_0.n().f(false);
        short s2 = this.t.h();
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            int n;
            exk_2 exk_22 = this.t.a(s3);
            int n2 = exk_22 == null ? 0 : exk_22.aT_();
            if (n2 == (n = this.s[s3])) continue;
            if (exk_22 != null) {
                this.t.b(s3);
            }
            if (n == 0) continue;
            exk_2 exk_23 = new exk_2(abd_1.c());
            Object r2 = eyo_1.g().d(n);
            if (r2 == null) continue;
            exk_23.b((ezr_0)r2);
            exk_23.a((short)1);
            try {
                this.t.c(exk_23, s3);
                continue;
            }
            catch (uz_0 uz_02) {
                q.warn((Object)"Ne devrait pas arriver, on a nettoy\u00e9 l'inventaire avant");
                continue;
            }
            catch (Uy uy) {
                q.warn((Object)"Ne devrait pas arriver, on a nettoy\u00e9 l'inventaire avant");
                continue;
            }
            catch (uc_0 uc_02) {
                q.warn((Object)"Ne devrait pas arriver, on a nettoy\u00e9 l'inventaire avant");
            }
        }
        cdw_0.n().f(bl);
    }

    public void a(Uo uo) {
        this.t.b(uo);
    }

    public bHe Z() {
        return this.t;
    }

    public int[] aa() {
        return this.s;
    }

    public void b(int[] nArray) {
        this.s = nArray;
    }

    public int ab() {
        if (this.s == null) {
            return 0;
        }
        int n = 0;
        for (int k = 0; k < this.s.length; ++k) {
            int n2 = this.s[k];
            if (n2 <= 0) continue;
            ++n;
        }
        return n;
    }

    @Override
    protected Tv ap_() {
        return Tv.i;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public bgf_1 aG_() {
        if (this.G == null) {
            this.G = new bgx_0(this);
        }
        return this.G;
    }

    @Override
    public boolean y() {
        return true;
    }

    static /* synthetic */ void a(bat_2 bat_22, abm_1 abm_12) {
        bat_22.a(abm_12);
    }
}

