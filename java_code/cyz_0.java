/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYz
 */
class cyz_0
implements fkd_1 {
    final /* synthetic */ fvk_0 a;
    final /* synthetic */ cyt_0 b;

    cyz_0(cyt_0 cyt_02, fvk_0 fvk_02) {
        this.b = cyt_02;
        this.a = fvk_02;
    }

    @Override
    public void a() {
        fyy_0 fyy_02 = fpm_0.b().h().d("inventoryDialog");
        if (fyy_02 == null) {
            return;
        }
        fvk_0 fvk_02 = (fvk_0)fyy_02.a("equipInventWindow");
        float f2 = fpm_0.b().j().E();
        int n = fvk_02.getX();
        int n2 = (float)(n + fvk_02.getWidth() + this.a.getWidth()) < f2 ? (int)Hw.b(n + fvk_02.getWidth() + 20, 0.0f, f2 - (float)this.a.getWidth()) : (int)Hw.b(n - this.a.getWidth() - 20, 0.0f, f2 - (float)this.a.getWidth());
        this.a.setX(n2);
        this.a.b(this);
    }
}

