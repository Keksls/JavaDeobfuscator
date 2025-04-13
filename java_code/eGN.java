/*
 * Decompiled with CFR 0.152.
 */
public abstract class eGN
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Modif de Charac", new eFu("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", eFx.b)), new eFv("Modif de Charac variable", new eFu("", eFx.b), new eFu("D", eFx.b), new eFu("+", eFx.b), new eFu("(fake, sert \u00e0 rien, laisser \u00e0 0)", eFx.c)), new eFv("Specification du type de Modif (% ou fixe)", new eFu("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", eFx.b), new eFu("Fixe = 0; %=1", eFx.c)), new eFv("Avec id de la charac (cf FighterCharacteriticType)", new eFu("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", eFx.b), new eFu("Fixe = 0; %=1", eFx.c), new eFu("Id de la charac", eFx.c)), new eFv("Avec % d'application", new eFu("valeur (eventuellement en %) (-1 pour valeur de l'effet declencheur)", eFx.b), new eFu("Fixe = 0; %=1", eFx.c), new eFu("Id de la charac (defaut = -1)", eFx.c), new eFu("% d'application (defaut = -1)", eFx.c), new eFu("(fake, sert \u00e0 rien, laisser \u00e0 0)", eFx.c)));
    protected ru_0 w;
    protected int x;
    protected boolean y;

    @Override
    public aqr_2 c_() {
        return v;
    }

    protected eGN() {
    }

    protected eGN(ru_0 ru_02) {
        this.w = ru_02;
        this.y = false;
        this.M();
    }

    protected eGN(ru_0 ru_02, boolean bl) {
        this.w = ru_02;
        this.y = bl;
        this.M();
    }

    public ru_0 aJ() {
        return this.w;
    }

    public int aK() {
        return this.x;
    }

    @Override
    public boolean ab() {
        if (this.m == 0 && this.aE()) {
            return false;
        }
        return super.ab();
    }

    protected boolean aE() {
        return true;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.aD()) {
            this.j(true);
            return;
        }
        rs_0 rs_02 = this.aF();
        if (rs_02 == null) {
            this.j(true);
            return;
        }
        if (this.y && this.D()) {
            this.b(rs_02);
        }
        this.a(rs_02);
        this.aG();
    }

    @Override
    public void a(int n, float f2, boolean bl) {
        switch (n) {
            case 0: {
                if (bl) break;
                this.m += xh_0.a((float)this.m * f2 / 100.0f);
                break;
            }
            case 1: {
                if (bl) {
                    this.m = xh_0.a(f2);
                    break;
                }
                this.m = (int)((float)this.m + f2);
                break;
            }
        }
        if (this.m == 0) {
            this.ba();
        }
    }

    boolean aD() {
        return this.w == null || this.aM() == null || !this.aM().a(this.w);
    }

    private rs_0 aF() {
        rs_0 rs_02 = null;
        switch (this.w.b()) {
            case 0: {
                rs_02 = this.aM().b(this.w);
                break;
            }
            default: {
                a.warn((Object)("On veut appliquer une modification de charac sur autre chose qu'une fighterCharac " + this.w));
            }
        }
        return rs_02;
    }

    private void b(rs_0 rs_02) {
        this.m = (int)((float)rs_02.a() / 100.0f * (float)this.m);
    }

    @Override
    abstract void a(rs_0 var1);

    private void aG() {
        if (this.w == eps_0.B && this.h != null && this.h.d() != null) {
            this.h.d().t();
        }
    }

    @Override
    public void j(sd_0 sd_02) {
        Object object;
        if (this.c == null) {
            return;
        }
        short s2 = this.aZ();
        if (((efh_0)this.c).F() == 4) {
            this.m = xc_0.a(((efh_0)this.c).a(0, s2, eFb.a), ((efh_0)this.c).a(1, s2, eFb.a), ((efh_0)this.c).a(2, s2, eFb.a));
        } else {
            int n;
            this.m = ((efh_0)this.c).a(0, s2, eFb.a);
            if (((efh_0)this.c).F() > 1) {
                boolean bl = this.y = ((efh_0)this.c).a(1, s2, eFb.a) == 1;
            }
            if (((efh_0)this.c).F() > 2 && ((n = ((efh_0)this.c).a(2, s2, eFb.a)) != -1 || this.w == null)) {
                object = eps_0.a((byte)n);
                if (object == null) {
                    a.error((Object)("Param\u00e9trage foireux d'un effet de modification de charac " + ((efh_0)this.c).i()));
                } else {
                    this.w = object;
                }
            }
        }
        if (this.m == -1) {
            ejh_0 ejh_02 = (ejh_0)sd_02;
            if (ejh_02 == null) {
                ejh_02 = ((efn_0)this.l()).f();
            }
            if (ejh_02 == null) {
                a.error((Object)"On ne peut pas copier la valeur de l'effet declencheur, celui-ci est inconnu");
                this.m = 0;
                return;
            }
            if (ejh_02 instanceof efz_0) {
                object = (efz_0)ejh_02;
                byte by = this.w.a();
                if (by == eps_0.c.a()) {
                    this.m = ((efz_0)object).aF();
                } else if (by == eps_0.d.a()) {
                    this.m = ((efz_0)object).aE();
                } else if (by == eps_0.e.a()) {
                    this.m = ((efz_0)object).aD();
                }
            } else {
                this.m = ejh_02.n();
            }
        }
        this.x = this.m;
    }

    @Override
    public final void al() {
        if (this.P && this.as() && this.w != null) {
            switch (this.w.b()) {
                case 0: {
                    if (this.aM() == null || !this.aM().a(this.w)) break;
                    this.aI();
                    this.aG();
                }
            }
        }
        super.al();
    }

    abstract void aI();

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public efa_0 br_() {
        efa_0 efa_02;
        if (this.w != null && this.w.b() == 0 && (efa_02 = ((eps_0)this.w).w()) != null) {
            return efa_02;
        }
        return efa_0.a;
    }

    @Override
    protected boolean bq_() {
        return this.bi();
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().c(this.w != null ? (int)this.w.a() : 0).h(this.x));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            this.w = eps_0.a(Hw.b((long)iO2.r().i()));
            this.x = iO2.r().K();
        }
    }

    protected Su aM() {
        return this.f;
    }

    void a(rs_0 rs_02, int n) {
        if (this.f == null) {
            return;
        }
        int n2 = rs_02.a();
        int n3 = n - Math.abs(n2);
        if (n3 <= 0) {
            return;
        }
        se_0 se_02 = this.f.x_();
        for (sd_0 sd_02 : se_02) {
            egi_0 egi_02;
            if (!(sd_02 instanceof egi_0) || (egi_02 = (egi_0)sd_02).bt_() != this.bt_() || egi_02.bk() != 0) continue;
            if (n3 <= 0) {
                return;
            }
            int n4 = egi_02.n();
            int n5 = egi_02.aK();
            if (n5 == n4) continue;
            int n6 = n5 - n4;
            int n7 = Math.min(n3, n6);
            rs_02.d(n7);
            n3 -= n7;
            egi_02.m += n7;
        }
    }
}

