/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbi
 */
public class bbi_0
extends bak_0 {
    private final long e;

    public bbi_0(int n, int n2, int n3, int n4, long l) {
        super(n, n2, n3, n4);
        this.e = l;
    }

    @Override
    protected void r() {
        bwh_0 bwh_02 = this.b();
        if (!(bwh_02 instanceof bvx_2)) {
            return;
        }
        bvx_2 bvx_22 = (bvx_2)bwh_02;
        blx_1 blx_12 = (blx_1)bvx_22.n(this.e);
        blx_12.D(true);
        bvx_22.m(this.e);
        bvx_22.d(blx_12);
        if (blx_12 instanceof bnh_1) {
            blx_12.br();
        }
    }

    @Override
    protected void l() {
    }
}

