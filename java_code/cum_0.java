/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUm
 */
public class cum_0
extends cto_0 {
    @Override
    public boolean c() {
        if (!(this.l instanceof beh_0)) {
            return false;
        }
        beh_0 beh_02 = (beh_0)this.l;
        if (beh_02.Z() != fha_0.b && beh_02.Z() != fha_0.e) {
            return false;
        }
        return super.c();
    }

    @Override
    public boolean d() {
        if (!(this.l instanceof beh_0)) {
            return false;
        }
        beh_0 beh_02 = (beh_0)this.l;
        if (beh_02.Z() == fha_0.e) {
            this.c(bae.h().a("pvp.extraction.activate.mru.action.replenishing.phase", new Object[0]));
            return false;
        }
        if (bju_1.d.a() <= 0) {
            this.c(bae.h().a("pvp.extraction.activate.mru.action.empty.inventory", new Object[0]));
            return false;
        }
        if (azu_0.j().k().ba() == fhD.a) {
            this.c(bae.h().a("pvp.mru.error.no.pact", new Object[0]));
            return false;
        }
        return true;
    }

    @Override
    public String r() {
        return "pvp.extraction.activate.mru.action";
    }

    @Override
    protected int t() {
        return cUL.e.aH;
    }

    @Override
    public cSS v() {
        return new cum_0();
    }

    @Override
    protected Tv a() {
        return Tv.a;
    }
}

