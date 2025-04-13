/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjj
 */
public class bjj_0
extends bjf_0<bjl_0> {
    @Override
    protected void a(biI biI2, bjl_0 bjl_02) {
    }

    @Override
    public void a(bjl_0 bjl_02, bjl_0 bjl_03, biI biI2) {
        blx_1 blx_12 = biI2.bI();
        bjl_0 bjl_04 = (bjl_0)this.c();
        blx_12.bv().f(bjl_03.b);
        if (bjl_04 == null) {
            blx_12.c(0);
        } else {
            blx_12.c(Co.c(bjl_04.a));
        }
        blx_12.aQ();
        biI2.a(new bjk_0(this, biI2));
    }
}

