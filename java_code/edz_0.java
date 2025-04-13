/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eDZ
 */
public class edz_0
extends eDO {
    @Override
    protected String a(efh_0 efh_02, String string, Object[] objectArray, boolean bl, eDl eDl2) {
        if (efh_02.j() == efc_0.ed.a()) {
            int n = ((Number)objectArray[0]).intValue();
            fin_0 fin_02 = eDi.ar.a((short)n);
            ani_2 ani_22 = eDi.aq.a();
            eDi.ar.a(ani_22, fin_02);
            objectArray[0] = ani_22.r();
        } else if (efh_02.j() == efc_0.ei.a()) {
            int n = ((Number)objectArray[2]).intValue();
            fin_0 fin_03 = eDi.ar.a((short)n);
            ani_2 ani_23 = eDi.aq.a();
            eDi.ar.a(ani_23, fin_03);
            objectArray[2] = ani_23.r();
        }
        return Cr.a(string, objectArray);
    }
}

