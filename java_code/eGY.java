/*
 * Decompiled with CFR 0.152.
 */
public final class eGY
extends eGH {
    private static final aqr_2 z = new eFw(new eFv("Valeur + \u00e9l\u00e9ment", new eFu("Valeur", eFx.b), new eFu("Element", eFx.c)));

    @Override
    public aqr_2 c_() {
        return z;
    }

    public eGY() {
        this.M();
    }

    public eGY(ru_0 ru_02) {
        super(ru_02);
    }

    public eGY aF() {
        eGY eGY2 = new eGY();
        eGY2.w = this.w;
        return eGY2;
    }

    @Override
    public void j(sd_0 sd_02) {
        this.m = 0;
        if (this.c == null) {
            return;
        }
        this.m = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        int n = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
        efa_0 efa_02 = efa_0.a((byte)n);
        if (efa_02 == null) {
            a.error((Object)("Mauvais param element inconnu " + n));
            return;
        }
        this.m = Hw.c((float)this.m * (1.0f + (float)this.a(efa_02) / 100.0f));
    }

    private int a(efa_0 efa_02) {
        eps_0 eps_02 = efa_02.c();
        int n = 0;
        if (this.e.a(eps_02)) {
            n += this.e.c(eps_02);
        }
        if (this.e.a(eps_0.p)) {
            n += this.e.c(eps_0.p);
        }
        if (this.w == eps_0.Y) {
            if (this.e.a(eps_0.ac)) {
                n += this.e.c(eps_0.ac);
            }
            if (this.e.a(eps_0.af)) {
                n += this.e.c(eps_0.af);
            }
            if (this.e.a(eps_0.ad)) {
                n += this.e.c(eps_0.ad);
            }
        }
        return n;
    }

    @Override
    public void z() {
        super.z();
    }

    @Override
    public /* synthetic */ eGH aG() {
        return this.aF();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aF();
    }
}

