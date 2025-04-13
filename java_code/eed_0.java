/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

/*
 * Renamed from eEd
 */
public class eed_0
extends eDO {
    @Override
    protected String a(efh_0 efh_02, String string, Object[] objectArray, boolean bl, eDl eDl2) {
        eyj_1 eyj_12;
        edc_0 edc_02 = (edc_0)eDl2;
        exk_2 exk_22 = edc_02.m();
        eyj_1 eyj_13 = eyj_12 = exk_22 == null ? null : exk_22.al();
        if (eyj_12 == null || eyj_12.b()) {
            return Cr.a(string, objectArray);
        }
        HashSet<efa_0> hashSet = eyj_12.b(efh_02.j());
        if (hashSet == null || hashSet.isEmpty()) {
            return Cr.a(string, objectArray);
        }
        ani_2 ani_22 = eDi.aq.a();
        for (efa_0 efa_02 : hashSet) {
            ani_22.a((CharSequence)eDi.ar.a(eDi.aq.a(), efa_02).r());
            if (efa_02 == hashSet.toArray()[hashSet.size() - 1]) continue;
            ani_22.a((CharSequence)" ");
        }
        Object[] objectArray2 = new Object[objectArray.length + 1];
        System.arraycopy(objectArray, 0, objectArray2, 0, objectArray.length);
        objectArray2[objectArray2.length - 1] = ani_22.r();
        return Cr.a(string, objectArray2);
    }
}

