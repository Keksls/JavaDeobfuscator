/*
 * Decompiled with CFR 0.152.
 */
public final class eHA
extends ehc_0 {
    private static final aqr_2 v = new eFw(new eFv("Nombre d'ex\u00e9cutions fixe", new eFu("Nombre d'executions", eFx.b)), new eFv("Nombre d'ex\u00e9cutions fixe, avec condition d'arr\u00eat", new eFu("Nombre d'executions", eFx.b), new eFu("Doit s'arr\u00eater quand un effet n'est pas ex\u00e9cut\u00e9 (1=oui, 0=non,d\u00e9faut)", eFx.b)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHA() {
        this.M();
    }

    public eHA aD() {
        return new eHA();
    }

    @Override
    protected int k(sd_0 sd_02) {
        if (this.c == null || ((efh_0)this.c).F() < 1) {
            return 0;
        }
        return ((efh_0)this.c).a(0, this.aZ(), eFb.a);
    }

    @Override
    protected boolean l(sd_0 sd_02) {
        if (this.c == null || ((efh_0)this.c).F() < 2) {
            return false;
        }
        return ((efh_0)this.c).a(1, this.aZ(), eFb.a) == 1;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

