/*
 * Decompiled with CFR 0.152.
 */
public class bHe
extends exg_2
implements Uo {
    private final bHg i;

    public bHe(long l, int n, tt_0 tt_02, short s2) {
        super(l, n, tt_02, s2);
        this.b(this);
        this.i = new bHg(this);
    }

    @Override
    public void a(Uk uk) {
        switch (uk.b()) {
            case h: {
                fis_1.a().a((ajf_1)this.i, "bagInventory", "bagSize", "bagNameSize", "bagSizeMaxSize");
                break;
            }
            case b: 
            case a: {
                fis_1.a().a((ajf_1)this.i, "bagInventory", "bagSize", "bagNameSize", "bagSizeMaxSize");
                um_0 um_02 = (um_0)uk;
                if (um_02.c() instanceof exk_2) {
                    exk_2 exk_22 = (exk_2)um_02.c();
                    if (exk_22.aU_()) {
                        bHe.i(exk_22);
                    }
                    if (exk_22.aQ_()) {
                        dbU.a().d(exk_22);
                    }
                    bha_0.a(exk_22.a());
                }
                cdw_0.n().C();
                break;
            }
            case d: 
            case c: {
                um_0 um_03 = (um_0)uk;
                fis_1.a().a((ajf_1)this.i, "bagInventory", "bagSize", "bagNameSize", "bagSizeMaxSize");
                ts_0 ts_02 = um_03.c();
                exk_2 exk_23 = (exk_2)fis_1.a().d("itemDetail", "inventoryDialog");
                if (exk_23 != null && exk_23.equals(ts_02)) {
                    fis_1.a().a("itemDetail", (Object)null, "inventoryDialog");
                    fis_1.a().a("pet", (Object)null, "inventoryDialog");
                }
                exh_2 exh_22 = null;
                if (um_03.c() instanceof exk_2) {
                    exq_1<?> exq_12;
                    exh_2[] exh_2Array;
                    exk_2 exk_24 = (exk_2)ts_02;
                    if (exk_24.aU_()) {
                        bHe.i(exk_24);
                        if (exk_24.aQ_()) {
                            dbU.a().d(exk_24);
                        }
                    }
                    if ((exh_2Array = (exq_12 = exk_24.T().F()).h()).length > 0) {
                        exh_22 = exh_2Array[0];
                    }
                    bha_0.a(exk_24.a());
                }
                cdw_0.n().b(exh_22);
                break;
            }
            case e: {
                exk_2 exk_25;
                fis_1.a().a((ajf_1)this.i, "bagInventory");
                um_0 um_04 = (um_0)uk;
                if (!(um_04.c() instanceof exk_2) || !(exk_25 = (exk_2)um_04.c()).aU_()) break;
                exk_25.P();
                break;
            }
        }
    }

    @Override
    public exg_2 a() {
        return new bHe(this.c, this.d, this.g, this.h());
    }

    private static void i(exk_2 exk_22) {
        exk_22.P();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null && bmr_12.cg() != null) {
            bmr_12.cg().a(exk_22);
        }
    }

    public bHg b() {
        return this.i;
    }
}

