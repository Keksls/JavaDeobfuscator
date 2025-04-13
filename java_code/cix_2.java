/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cix
 */
final class cix_2
extends chd_1<cqw_0, bvw_2> {
    cix_2() {
    }

    @Override
    public boolean a(cqw_0 cqw_02) {
        blx_1 blx_12 = bmf_2.a().c(cqw_02.b());
        if (blx_12 != null && blx_12.bA() != -1 && cic_1.a.b.contains(blx_12.bA())) {
            if (cic_1.a.m.get(blx_12.bA()) == null) {
                cic_1.a.m.put(blx_12.bA(), (Object)bac_0.a(7, emd_1.w.a(), 0, blx_12.bv(), cqw_02.c()));
            } else {
                ((bac_0)cic_1.a.m.get(blx_12.bA())).a(blx_12.bv(), cqw_02.c());
            }
            return false;
        }
        return true;
    }
}

