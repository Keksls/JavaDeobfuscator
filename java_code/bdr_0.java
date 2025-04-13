/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bDr
 */
public class bdr_0
extends bFZ {
    static final Logger q = Logger.getLogger(bdr_0.class);

    @Override
    public boolean b(Tv tv, TF tF) {
        switch (tv) {
            case m: {
                this.a(tv);
                bph_2 bph_22 = new bph_2(this);
                if (!bph_22.g()) {
                    q.error((Object)"[STORAGE_BOX] Impossible de d\u00e9marrer le browsing");
                    return false;
                }
                bph_22.a();
                this.b(tv);
                azu_0.j().a(ddi_0.d());
                return true;
            }
            case n: {
                this.a(tv);
                if (azu_0.j().c(ddi_0.d())) {
                    azu_0.j().b(ddi_0.d());
                }
                this.b(tv);
                azu_0.j().k().dN();
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
        return new Tv[]{Tv.m, Tv.n};
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.b(true);
        this.g(true);
        this.i(true);
        this.k(true);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.b(false);
        this.g(false);
        this.i(false);
        this.k(false);
    }

    @Override
    public cSS[] az_() {
        ctj_0 ctj_02 = (ctj_0)cSY.V.a();
        ctj_02.a(cUL.l.aH);
        return new cSS[]{ctj_02};
    }

    @Override
    public String al_() {
        return bae.h().a("guild.storageBox", new Object[0]);
    }

    @Override
    public void c(ph_0 ph_02) {
    }

    @Override
    public boolean aF_() {
        bmr_1 bmr_12 = azu_0.j().k();
        return emj_0.a.a(new emh_0[]{bmr_12});
    }

    static /* synthetic */ void a(bdr_0 bdr_02, abm_1 abm_12) {
        bdr_02.a(abm_12);
    }
}

