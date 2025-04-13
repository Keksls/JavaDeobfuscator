/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbj
 */
public final class bbj_0
extends bak_0 {
    private long e;

    public bbj_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void r() {
        bwh_0 bwh_02 = this.b();
        bvw_2 bvw_22 = (bvw_2)bwh_02;
        blx_1 blx_12 = bmf_2.a().c(this.e);
        if (blx_12 == null) {
            a.error((Object)("[_FL_] Le fighter inconnu id=" + this.e + " quitte le fight externe id=" + bwh_02.c()));
            return;
        }
        bvw_22.d(blx_12);
        blx_12.br();
        if (blx_12.cX()) {
            bmf_2.a().e(blx_12);
        }
    }

    @Override
    protected void l() {
    }

    public void d(long l) {
        this.e = l;
    }
}

