/*
 * Decompiled with CFR 0.152.
 */
class cWJ
implements fac_2 {
    final /* synthetic */ bmp_1 a;
    final /* synthetic */ fsQ b;
    final /* synthetic */ cWI c;

    cWJ(cWI cWI2, bmp_1 bmp_12, fsQ fsQ2) {
        this.c = cWI2;
        this.a = bmp_12;
        this.b = fsQ2;
    }

    @Override
    public void a() {
        int n;
        blx_1 blx_12;
        if (!this.c.j) {
            return;
        }
        if (this.c.e() && this.a.d() > 0 && (blx_12 = (bnh_1)this.a.f()) != null) {
            this.c.b((bnh_1)blx_12);
            return;
        }
        if (this.a.c() == null && (blx_12 = cWI.f().orElse(this.a.f())) != null) {
            this.c.a(blx_12);
            this.a.e(blx_12);
        }
        if ((n = boi_1.b.a(this.a.c())) != -1) {
            this.b.setOffset(n);
            this.b.removeListContentLoadListener(this);
        }
    }
}

