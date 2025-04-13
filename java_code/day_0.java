/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from day
 */
class day_0
implements fkd_1 {
    final /* synthetic */ fvk_0 a;
    final /* synthetic */ fvk_0 b;

    day_0(fvk_0 fvk_02, fvk_0 fvk_03) {
        this.a = fvk_02;
        this.b = fvk_03;
    }

    @Override
    public void a() {
        int n;
        float f2 = fpm_0.b().j().E();
        int n2 = this.a.getX() + this.a.getWidth() / 2;
        fvk_0 fvk_02 = n2 < (n = this.b.getX() + this.b.getWidth() / 2) ? this.a : this.b;
        fvk_0 fvk_03 = n2 < n ? this.b : this.a;
        int n3 = fvk_02.getX() + fvk_02.getWidth() - fvk_03.getX();
        if (n3 > 0) {
            int n4 = fvk_02.getX();
            int n5 = (int)f2 - (fvk_03.getX() + fvk_03.getWidth());
            int n6 = Math.min(n3 / 2, n4);
            fvk_02.setX(fvk_02.getX() - n6);
            int n7 = Math.min(n3 - n6, n5);
            fvk_03.setX(fvk_03.getX() + n7);
        }
        this.a.b(this);
    }
}

