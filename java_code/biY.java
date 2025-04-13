/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;

public final class biY {
    private biY() {
    }

    public static int a(blx_1 blx_12) {
        int n = blx_12.bM();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return -1;
        }
        cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
        if (cct_12 != null && cct_12.a()) {
            fhe_0 fhe_02 = cxj_2.a.a();
            TIntArrayList tIntArrayList = fhe_02.i();
            return tIntArrayList.contains(n) ? 800737 : 800738;
        }
        if (bmr_12.ba() != fhD.a && blx_12.ba() != fhD.a && !blx_12.f(erl_2.d)) {
            if (blx_12.fE().l()) {
                return 800880;
            }
            return 800870;
        }
        int n2 = blx_12.fI();
        if (blx_12.fE().e(n2)) {
            return 800456;
        }
        return -1;
    }
}

