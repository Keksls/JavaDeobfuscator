/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bsv
 */
public class bsv_2
extends fff {
    public static boolean a(aff_1 aff_12, cct_1 cct_12) {
        if (!cct_12.o) {
            return false;
        }
        aoc_0 aoc_02 = (aoc_0)aew_0.a().a(aff_12.d(), aff_12.e());
        if (aoc_02 == null) {
            return false;
        }
        if (aoc_02.a(aff_12.d(), aff_12.e(), aff_12.f())) {
            return false;
        }
        bNK bNK2 = bNT.f().c(aff_12.d(), aff_12.e());
        if (bNK2 != null && bNK2.aR().k()) {
            return false;
        }
        boolean bl = aoc_02.j();
        ArrayList<pj_0> arrayList = ccm_1.g().i();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            if (bsv_2.a(aff_12, arrayList.get(k), bl)) continue;
            return false;
        }
        return true;
    }
}

