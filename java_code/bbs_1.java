/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBs
 */
public class bbs_1
extends bFZ {
    static final Logger q = Logger.getLogger(bbs_1.class);

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case o: {
                bpx_2 bpx_22 = new bpx_2(this);
                if (!bpx_22.g()) {
                    q.error((Object)"[COIN_MACHINE] Impossible de d\u00e9marrer le browsing");
                    return false;
                }
                bpx_22.a();
                this.b(tv);
            }
            case p: {
                this.a(tv);
                this.b(tv);
                azu_0.j().k().dN();
                return true;
            }
            case m: {
                this.a(tv);
                this.b(tv);
                return true;
            }
            case n: {
                this.a(tv);
                this.b(tv);
                return true;
            }
            case a: {
                this.a(tv);
                this.b(tv);
                return true;
            }
        }
        q.error((Object)("Impossible d'effectuer l'action " + tv), (Throwable)new IllegalArgumentException());
        return false;
    }

    @Override
    public Tv ap_() {
        return Tv.m;
    }

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.o, Tv.p, Tv.m, Tv.a, Tv.n};
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
    }

    @Override
    public boolean aF_() {
        return false;
    }

    @Override
    public cSS[] az_() {
        return new cSS[]{cSY.v.a()};
    }

    @Override
    public String al_() {
        return "TODO Clem: Bandit-manchot";
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    static /* synthetic */ void a(bbs_1 bbs_12, abm_1 abm_12) {
        bbs_12.a(abm_12);
    }
}

