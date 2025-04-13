/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhe
 */
public final class bhe_2
extends elg_0 {
    private final asy_2<aqw_0> b;

    public bhe_2(asy_2<aqw_0> asy_22) {
        this.b = asy_22;
    }

    @Override
    public ekr_0 a(long l) {
        if (super.a(l) == null) {
            this.l(l);
        }
        return super.a(l);
    }

    private void l(long l) {
        if (l <= 0L) {
            return;
        }
        aqw_0 aqw_02 = this.b.a((int)l);
        if (aqw_02 == null) {
            return;
        }
        ekk_0 ekk_02 = bgu_2.a.a(aqw_02);
        if (ekk_02 == null) {
            return;
        }
        ekk_02.b(false);
        this.a(ekk_02);
        if (aqw_02.u() == null) {
            return;
        }
        for (int n : aqw_02.u()) {
            efh_0 efh_02 = bgh_0.a().c(n);
            if (efh_02 != null) {
                ekk_02.a(efh_02);
                continue;
            }
            a.error((Object)("Probl\u00e8me de chargmeent de effectArea " + aqw_02.c()));
        }
    }

    @Override
    public ekn_0 b(long l) {
        if (super.b(l) == null) {
            this.l(l);
        }
        return super.b(l);
    }

    @Override
    public ekf_0 c(long l) {
        if (super.c(l) == null) {
            this.l(l);
        }
        return super.c(l);
    }

    @Override
    public ekc_0 d(long l) {
        if (super.d(l) == null) {
            this.l(l);
        }
        return super.d(l);
    }

    @Override
    public eke_0 e(long l) {
        if (super.e(l) == null) {
            this.l(l);
        }
        return super.e(l);
    }

    @Override
    public eko_0 f(long l) {
        if (super.f(l) == null) {
            this.l(l);
        }
        return super.f(l);
    }

    @Override
    public eks_0 g(long l) {
        if (super.g(l) == null) {
            this.l(l);
        }
        return super.g(l);
    }

    @Override
    public ekt_0 h(long l) {
        if (super.h(l) == null) {
            this.l(l);
        }
        return super.h(l);
    }

    @Override
    public ekk_0 i(long l) {
        if (super.i(l) == null) {
            this.l(l);
        }
        return super.i(l);
    }

    @Override
    public ekh_0 j(long l) {
        ekh_0 ekh_02 = super.j(l);
        if (ekh_02 != null) {
            return ekh_02;
        }
        this.l(l);
        return super.j(l);
    }

    @Override
    public ekb_0 k(long l) {
        ekb_0 ekb_02 = super.k(l);
        if (ekb_02 != null) {
            return ekb_02;
        }
        this.l(l);
        return super.k(l);
    }
}

