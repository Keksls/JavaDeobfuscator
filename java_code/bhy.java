/*
 * Decompiled with CFR 0.152.
 */
class bhy
extends dez
implements ahr_1 {
    public static final bhy a = new bhy();
    private final abv_0 b = new abv_0("emoteSelectTarget", bht.a);
    biI c;
    bhu d;
    bhv e;
    private aff_1 f = null;

    bhy() {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fyt_0.a().a(frb_0.s, true);
        String string = this.d.f();
        if (string != null) {
            fzd_0.a().a(string, null, 30, 0, frs_0.d);
        }
        aNF aNF2 = (aNF)ans_0.D().c();
        this.a(aNF2.c(), aNF2.d());
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fyt_0.a().c();
        fzd_0.a().d();
        this.b.a();
        if (this.c != null) {
            this.c.bM();
        }
        this.f = null;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19751: {
                dhL dhL2 = (dhL)adt_12;
                return this.a(dhL2.r(), dhL2.s());
            }
            case 17976: {
                return this.a((dhL)adt_12);
            }
            case 16119: {
                return this.b((dhL)adt_12);
            }
            case 18907: {
                return false;
            }
        }
        return true;
    }

    private boolean a(int n, int n2) {
        bmr_1 bmr_12;
        aNF aNF2 = (aNF)ans_0.D().c();
        abz_0 abz_02 = aNF2.v();
        this.b.a();
        if (this.c != null) {
            this.c.bM();
        }
        this.c = null;
        if (!(abz_02 instanceof biI) || !(((biI)abz_02).bI() instanceof bnh_1)) {
            aff_1 aff_12 = agz.a(aNF2, n, n2, false);
            if (aff_12 == null) {
                return true;
            }
            this.b.a(bht.b);
            this.b.a(aff_12.d(), aff_12.e(), aff_12.f());
            return true;
        }
        biI biI2 = (biI)abz_02;
        blx_1 blx_12 = biI2.bI();
        if (blx_12 == (bmr_12 = azu_0.j().k()) || blx_12.ab_() || blx_12.ak()) {
            return true;
        }
        if (blx_12.fl() != null || biI2.bs()) {
            return true;
        }
        this.c = biI2;
        this.c.bL();
        this.b.a(bht.a);
        this.b.a(this.c.G(), this.c.H(), this.c.I());
        return false;
    }

    private boolean a(dhL dhL2) {
        if (!dhL2.o()) {
            return false;
        }
        this.f = this.d(dhL2);
        return false;
    }

    private boolean b(dhL dhL2) {
        if (dhL2.o()) {
            if (this.c(dhL2)) {
                this.a();
            }
        } else {
            azu_0.j().b(this);
        }
        this.f = null;
        return false;
    }

    private boolean c(dhL dhL2) {
        if (!dhL2.o()) {
            return false;
        }
        aff_1 aff_12 = this.d(dhL2);
        if (this.f == null || aff_12 == null || !this.f.b(aff_12.d(), aff_12.e(), (int)aff_12.f())) {
            return false;
        }
        return this.c != null;
    }

    private boolean a() {
        bmr_1 bmr_12 = azu_0.j().k();
        bht bht2 = bht.i;
        if (!bht2.a(this.d, this.e)) {
            azu_0.j().b(this);
            return false;
        }
        int n = bmr_12.P_().e(this.c.bI().P_());
        if (!this.d.c() || n == 1) {
            this.e.a(this.d, this.c.a());
            azu_0.j().b(this);
            return false;
        }
        bhz bhz2 = new bhz(this, bmr_12);
        biI biI2 = bmr_12.bv();
        biI2.b(bhz2);
        if (!bmr_12.a(this.c.bI(), true, true)) {
            biI2.c(bhz2);
        }
        azu_0.j().b(this);
        return false;
    }

    private aff_1 d(dhL dhL2) {
        aNF aNF2 = (aNF)ans_0.D().c();
        return agz.a(aNF2, dhL2.r(), dhL2.s(), true);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(bhu bhu2, bhv bhv2) {
        if (this.d == bhu2 && azu_0.j().c(this)) {
            azu_0.j().b(this);
            return;
        }
        this.d = bhu2;
        this.e = bhv2;
        if (azu_0.j().c(this)) {
            azu_0.j().b(this);
        }
        azu_0.j().a(this);
    }
}

