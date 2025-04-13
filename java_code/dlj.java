/*
 * Decompiled with CFR 0.152.
 */
public abstract class dlj {
    public static final String a = "text";
    protected int b;
    private final boolean f;
    protected final String c;
    protected final short d;
    protected final dly e;
    private final adv_1 g = new dlk(this);

    protected dlj(dly dly2, boolean bl, String string, short s2) {
        this.f = bl;
        this.c = string;
        this.d = s2;
        this.e = dly2;
    }

    public void a(dlw dlw2) {
        fyy_0 fyy_02;
        adi_2.a().a(dlx.a());
        adi_2.a().a(this.g);
        this.b = dlw2.d();
        boolean bl = fpm_0.b().q(this.c);
        if (!bl) {
            fpm_0.b().a(this.c, cfi_0.a(this.c), 8212L, this.d);
        }
        if (dlw2.e() != Integer.MAX_VALUE) {
            adi_2.a().a(dlx.a(), dlw2.e(), 0, 1L);
        }
        if ((fyy_02 = fpm_0.b().h().d(this.c)) == null) {
            return;
        }
        this.a(true, this.c);
        ful_0 ful_02 = (ful_0)fyy_02.a(a);
        if (ful_02 != null) {
            ful_02.c(dlw2.g());
        }
    }

    public void a(boolean bl) {
        if (fpm_0.b().q(this.c)) {
            adi_2.a().a(this.g);
            if (bl) {
                this.a(false, this.c);
            }
            if (bl) {
                adi_2.a().a(this.g, this.b, 0, 1L);
            } else {
                this.a(this.c);
            }
        }
    }

    protected abstract void a(boolean var1, String var2);

    protected abstract void a(String var1);

    protected void a(fvE fvE2, String string) {
        if (fvE2 == null) {
            return;
        }
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setFile(string);
        fbx_12.setAlignment(frs_0.e);
        fvE2.getAppearance().add(fbx_12);
    }

    protected void a(fvE fvE2) {
        if (fvE2 == null) {
            return;
        }
        fvE2.getAppearance().k();
    }

    protected void a(fvE fvE2, boolean bl) {
        if (fvE2 == null) {
            return;
        }
        fqj fqj2 = fvE2.getAppearance();
        fqj2.removeTweensOfType(fjp_2.class);
        azf_2 azf_22 = new azf_2(new float[0]);
        azf_2 azf_23 = new azf_2(new float[0]);
        if (!bl) {
            azf_22.a(azf_2.e.i());
            azf_23.a(azf_2.b.i());
        } else {
            azf_22.a(azf_2.b.i());
            azf_23.a(azf_2.e.i());
        }
        fqj2.addTween(new fjp_2(azf_22, azf_23, fqj2, 0, this.b, 1, false, fjw_2.b));
    }

    public boolean a() {
        return this.f;
    }

    public dly b() {
        return this.e;
    }

    protected static void a(frO frO2) {
        if (frO2 == null) {
            return;
        }
        frO2.getAnimatedElement().E();
        atd_2 atd_22 = frO2.getAnimatedElement().an();
        if (atd_22 != null) {
            atd_22.y();
        }
        frO2.removeTweensOfType(fjp_2.class);
    }
}

