/*
 * Decompiled with CFR 0.152.
 */
class bFS
implements afu_0<bfr_0> {
    final /* synthetic */ bfr_0 a;

    bFS(bfr_0 bfr_02) {
        this.a = bfr_02;
    }

    @Override
    public void a(bfr_0 bfr_02, boolean bl) {
        if (!bfr_02.at() || !bfr_02.aM()) {
            return;
        }
        if (bl) {
            if (this.a.ag) {
                bfr_02.aP();
            }
            if (this.a.aE()) {
                aNC.a(bfr_02);
            }
        } else {
            dbm_0.a().a((YP)bfr_02);
            aNC.c(bfr_02);
        }
    }
}

