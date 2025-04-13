/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eDT
 */
public class edt_0
extends eDO {
    @Override
    protected String a(efh_0 efh_02, String string, Object[] objectArray, boolean bl, eDl eDl2) {
        if (efh_02.j() == efc_0.ee.a()) {
            int n = ((Number)objectArray[0]).intValue();
            efa_0 efa_02 = efa_0.a((byte)n);
            ani_2 ani_22 = eDi.aq.a();
            eDi.ar.a(ani_22, efa_02);
            objectArray[0] = ani_22.r();
        }
        return Cr.a(string, objectArray);
    }
}

