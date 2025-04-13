/*
 * Decompiled with CFR 0.152.
 */
public class dhI
implements ahr_1 {
    private static final int a = 5;
    private static final dhI b = new dhI();
    private long c;
    private int d;
    private afk_0<afe_0> e;
    private ema_0 f;

    public static dhI a() {
        return b;
    }

    private dhI() {
    }

    public void b(long l) {
        this.c = l;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        blx_1 blx_12 = bmf_2.a().c(this.c);
        if (blx_12 == null || blx_12.ab_() || blx_12.ak()) {
            azu_0.j().b(this);
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        this.e = (afe_02, n, n2, s2) -> {
            blx_1 blx_12 = ((biI)afe_02).bI();
            if (blx_12.ak()) {
                azu_0.j().b(this);
                return;
            }
            if (bmr_12.bv().bp()) {
                return;
            }
            if (bmr_12.gg().b(n, n2, s2) > 1) {
                aff_1 aff_12 = new aff_1(n, n2, s2);
                boolean bl = bmr_12.a(blx_12, true, true);
                if (!bl) {
                    bl = bmr_12.a(aff_12, true, true);
                }
                int n3 = this.d = bl ? 0 : this.d + 1;
                if (this.d >= 5) {
                    azu_0.j().b(this);
                }
            }
        };
        this.f = new dhJ(this);
        ((afv)blx_12.bv()).a(this.e);
        bmr_12.a(this.f);
        this.d = 0;
        this.a("chat.notify.follow.start");
    }

    private void a(String string) {
        blx_1 blx_12 = bmf_2.a().c(this.c);
        if (blx_12 == null) {
            return;
        }
        aUh.b(string, blx_12.dp());
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        bmr_1 bmr_12;
        if (bl) {
            return;
        }
        blx_1 blx_12 = bmf_2.a().c(this.c);
        if (blx_12 != null) {
            blx_12.bv().c(this.e);
        }
        if ((bmr_12 = azu_0.j().k()) != null) {
            bmr_12.b(this.f);
        }
        this.e = null;
        this.f = null;
        this.a("chat.notify.follow.stop");
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16119: 
            case 18907: {
                azu_0.j().b(this);
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public static boolean a(bnh_1 bnh_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.cW()) {
            return false;
        }
        if (bmr_12.ak()) {
            return false;
        }
        if (bvz_2.a.a()) {
            return false;
        }
        if (bmr_12.a(erl_2.V)) {
            return false;
        }
        if (bnh_12.ak() || bnh_12.ab_()) {
            return false;
        }
        return !bnh_12.a(erl_2.V);
    }
}

