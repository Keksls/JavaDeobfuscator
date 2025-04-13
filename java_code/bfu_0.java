/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bFu
 */
public class bfu_0
extends bFZ {
    static final Logger r = Logger.getLogger(bfu_0.class);
    evp_1 s;
    fiy_0 t;
    private final fo_1 u = new bFv(this);

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case m: {
                this.a(tv);
                bpe_2 bpe_22 = new bpe_2(this);
                if (!bpe_22.g()) {
                    r.error((Object)"[Account Chest] Impossible to start browsing account chest");
                    return false;
                }
                bpe_22.a();
                this.b(tv);
                return true;
            }
            case n: {
                this.a(tv);
                if (azu_0.j().c(cVg.b)) {
                    azu_0.j().b(cVg.b);
                }
                this.b(tv);
                azu_0.j().k().dN();
                return true;
            }
        }
        r.error((Object)("Impossible d'effectuer l'action " + tv), (Throwable)new IllegalArgumentException());
        return false;
    }

    @Override
    protected fo_1 ad() {
        return this.u;
    }

    @Override
    public Tv ap_() {
        return Tv.m;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.m, Tv.n};
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
        this.k(true);
        assert (this.s == null);
        assert (this.t == null);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.b(false);
        this.g(false);
        this.i(false);
        this.k(false);
        this.s = null;
        this.t = null;
    }

    @Override
    public void ar_() {
        this.s = (evp_1)evl_1.a.a(evg_1.n, Integer.parseInt(this.l));
        if (this.s == null) {
            r.error((Object)("Impossible de trouver le param\u00e8tre " + this.l));
            return;
        }
        this.t = new fiy_0(this.s.d());
    }

    @Override
    public cSS[] az_() {
        return new cSS[]{cSY.ao.a()};
    }

    @Override
    public String al_() {
        return bae.h().a(104, (long)this.s.m(), new Object[0]);
    }

    public fiy_0 Z() {
        return this.t;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    public evp_1 ao() {
        return this.s;
    }

    @Override
    public String toString() {
        return "StorageBox{m_info=" + this.s + ", m_inventory=" + this.t + "}";
    }

    static /* synthetic */ void a(bfu_0 bfu_02, abm_1 abm_12) {
        bfu_02.a(abm_12);
    }
}

