/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBJ
 */
class bbj_2
extends alc_1 {
    final /* synthetic */ tg_0 e;
    final /* synthetic */ bbi_1 f;

    bbj_2(bbi_1 bbi_12, int n, int n2, int n3, tg_0 tg_02) {
        this.f = bbi_12;
        this.e = tg_02;
        super(n, n2, n3);
    }

    @Override
    protected long o() {
        bwh_0 bwh_02 = bwj_1.a().a(this.f.d.H);
        if (bwh_02 == null) {
            return 0L;
        }
        if (bwh_02 instanceof bvx_2) {
            ((bvx_2)bwh_02).k(this.a_());
        }
        this.f.d.a(this.e);
        return 0L;
    }

    @Override
    protected void l() {
    }
}

