/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bEE
 */
public class bee_0
extends bFZ {
    static final Logger q = Logger.getLogger(bee_0.class);

    @Override
    public Tv[] r() {
        return new Tv[]{Tv.a};
    }

    @Override
    protected Tv ap_() {
        return Tv.a;
    }

    @Override
    public cSS[] az_() {
        return new cSS[]{cSY.ar.a(), new cUv("desc.mru.read", () -> {
            cWa.a().a(393);
            azu_0.j().a(cWa.a());
        })};
    }

    @Override
    public boolean b(Tv tv, TF tF) {
        this.a(tv);
        bqd_2 bqd_22 = new bqd_2();
        if (!bqd_22.g()) {
            q.error((Object)"[PvpChangeState] Impossible to start PvpChangeState");
            return false;
        }
        bqd_22.a();
        this.b(tv);
        return true;
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    static /* synthetic */ void a(bee_0 bee_02, abm_1 abm_12) {
        bee_02.a(abm_12);
    }
}

