/*
 * Decompiled with CFR 0.152.
 */
final class aPe
implements aox_0 {
    private boolean a = true;
    private boolean b = false;

    aPe() {
    }

    @Override
    public void a(bwh_0 bwh_02, blx_1 blx_12) {
        aoy_0.b(blx_12);
    }

    @Override
    public void b(bwh_0 bwh_02, blx_1 blx_12) {
        aoy_0.a(blx_12);
    }

    @Override
    public void a(bwh_0 bwh_02, sr_0 sr_02) {
    }

    @Override
    public void b(bwh_0 bwh_02, sr_0 sr_02) {
    }

    @Override
    public void c(bwh_0 bwh_02, sr_0 sr_02) {
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    @Override
    public boolean a() {
        return this.a;
    }

    public void b(boolean bl) {
        this.b = bl;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public void a(bvw_2 bvw_22) {
        this.a((bwh_0)bvw_22);
    }

    @Override
    public void a(bwh_0 bwh_02) {
        aoy_0.a(bwh_02, aPf.b);
        aoy_0.c(bwh_02);
        if (this.b) {
            aoy_0.g(bwh_02);
            aoy_0.e(bwh_02);
        } else {
            aoy_0.f(bwh_02);
            aoy_0.d(bwh_02);
        }
        aoy_0.b(bwh_02);
    }
}

