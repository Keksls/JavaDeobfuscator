/*
 * Decompiled with CFR 0.152.
 */
public class eGs
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Rappelle l'invocation dans le symbiote", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eGs() {
        this.M();
    }

    public eGs aF() {
        return new eGs();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        Su su = this.aE();
        if (!(su instanceof epq_2) || !(su instanceof erk_2)) {
            this.ba();
            return;
        }
        erk_2 erk_22 = (erk_2)((Object)su);
        Object t = erk_22.dQ();
        if (t == null) {
            this.ba();
            return;
        }
        if (!(this.f instanceof epq_2)) {
            this.ba();
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        if (epq_22.ci() != erk_22) {
            this.ba();
            return;
        }
        this.f.c(eoz_1.al);
        this.f.c(eoz_1.am);
        this.f.c(eoz_1.s);
        this.f.c(eoz_1.m);
        this.c(sd_02, bl);
        this.f.b(eps_0.b).o();
        this.f.b(eps_0.l).g(0);
    }

    protected Su aE() {
        return this.e;
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aF();
    }
}

