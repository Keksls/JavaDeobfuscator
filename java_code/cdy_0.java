/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDy
 */
class cdy_0
implements cdn_0 {
    long a = System.currentTimeMillis();
    final /* synthetic */ cdw_0 b;

    cdy_0(cdw_0 cdw_02) {
        this.b = cdw_02;
    }

    @Override
    public void a(long l) {
        if (l > this.a + 10000L) {
            bmh_1.a();
            boa_0.a();
            cdi_0.a();
            this.a = l;
        }
    }

    @Override
    public void a(cer_0 cer_02) {
    }
}

