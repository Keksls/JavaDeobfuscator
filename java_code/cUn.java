/*
 * Decompiled with CFR 0.152.
 */
public class cUn
extends cto_0 {
    @Override
    public boolean c() {
        if (!(this.l instanceof beh_0)) {
            return false;
        }
        beh_0 beh_02 = (beh_0)this.l;
        if (beh_02.Z() == fha_0.b) {
            return false;
        }
        if (beh_02.Z() == fha_0.e) {
            return false;
        }
        return super.c();
    }

    @Override
    public boolean d() {
        if (!(this.l instanceof beh_0)) {
            return false;
        }
        if (azu_0.j().k().ba() == fhD.a) {
            this.c(bae.h().a("pvp.mru.error.no.pact", new Object[0]));
            return false;
        }
        beh_0 beh_02 = (beh_0)this.l;
        if (beh_02.ao()) {
            this.c(bae.h().a("pvp.extraction.extract.mru.action.used", new Object[0]));
            return false;
        }
        if (beh_02.Z() == fha_0.c) {
            this.c(bae.h().a("pvp.extraction.extract.mru.action.activating", new Object[0]));
            return false;
        }
        if (bju_1.d.a() <= 0) {
            this.c(bae.h().a("pvp.extraction.extract.mru.action.empty.inventory", new Object[0]));
            return false;
        }
        return !beh_02.ao();
    }

    @Override
    public void o() {
        if (!(this.l instanceof beh_0)) {
            return;
        }
        beh_0 beh_02 = (beh_0)this.l;
        bqd_0.a(new cUo(this, beh_02));
        super.o();
    }

    @Override
    public String r() {
        return "pvp.extraction.extract.mru.action";
    }

    @Override
    protected int t() {
        return cUL.ak.aH;
    }

    @Override
    public cSS v() {
        return new cUn();
    }

    @Override
    protected Tv a() {
        return Tv.F;
    }
}

