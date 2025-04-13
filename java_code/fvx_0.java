/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvX
 */
abstract class fvx_0
implements fvV {
    private fyy_0 b;
    static final /* synthetic */ boolean a;

    fvx_0() {
    }

    @Override
    public void a(fvy fvy2) {
        this.b = fpm_0.b().h().d(fvy2.getElementMap().c());
        if (!a && this.b == null) {
            throw new AssertionError((Object)"Impossible de charger une bulle");
        }
    }

    protected void a(String string) {
        if (this.b == null) {
            return;
        }
        ful_0 ful_02 = (ful_0)this.b.a("text");
        if (ful_02 == null) {
            return;
        }
        ful_02.setStyle(string);
    }

    protected void a(String string, fjf_2 fjf_22) {
        if (this.b == null) {
            return;
        }
        fso fso2 = (fso)this.b.a("container");
        if (fso2 == null) {
            return;
        }
        fso2.setStyle(string);
        fso2.setPrefSize(fjf_22);
        fso2.getAppearance().setModulationColor(null);
        fso fso3 = (fso)this.b.a("coloredContainer");
        if (fso3 == null) {
            return;
        }
        fso3.setPrefSize(new fjf_2(fjf_22.getSize().width, fjf_22.getSize().height + 20));
    }

    protected void a(String string, int n, int n2) {
        if (this.b == null) {
            return;
        }
        fsk_0 fsk_02 = (fsk_0)this.b.a("image");
        if (fsk_02 == null) {
            return;
        }
        fsk_02.setStyle(string);
        fsk_02.getAppearance().setModulationColor(null);
        fid_1 fid_12 = (fid_1)fsk_02.getLayoutData();
        fid_12.setXOffset(n);
        fid_12.setYOffset(n2);
    }

    @Override
    public void b(fvy fvy2) {
        this.b = fpm_0.b().h().d(fvy2.getElementMap().c());
        fsk_0 fsk_02 = (fsk_0)this.b.a("image");
        boolean bl = fvy2.isToRight();
        fsk_02.setStyle(bl ? "BubbleArrowLeft" : "BubbleArrowRight");
        fid_1 fid_12 = (fid_1)fsk_02.getLayoutData();
        fid_12.setAlign(bl ? frk_0.m : frk_0.q);
        this.a(fvy2);
    }

    static {
        a = !fvW.class.desiredAssertionStatus();
    }
}

