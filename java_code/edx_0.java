/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eDX
 */
public class edx_0
extends eDO {
    @Override
    protected String a(efh_0 efh_02, String string, Object[] objectArray, boolean bl, eDl eDl2) {
        int n;
        eld_0 eld_02;
        if (efh_02.F() >= 1 && (efh_02.j() == efc_0.cC.a() || efh_02.j() == efc_0.cD.a())) {
            int n2 = ((Number)objectArray[0]).intValue();
            eoz_1 eoz_12 = eoz_1.a(n2);
            if (eoz_12 != null) {
                objectArray[0] = eDi.ar.a(eoz_12);
            }
        } else if (efh_02.F() >= 1 && (efh_02.j() == efc_0.cA.a() || efh_02.j() == efc_0.cB.a())) {
            int n3 = ((Number)objectArray[0]).intValue();
            erl_2 erl_22 = erl_2.a(n3);
            if (erl_22 != null) {
                objectArray[0] = eDi.ar.a(erl_22);
            }
        } else if (efh_02.F() >= 1 && (efh_02.j() == efc_0.cE.a() || efh_02.j() == efc_0.cF.a()) && (eld_02 = eld_0.a(n = ((Number)objectArray[0]).intValue())) != null) {
            objectArray[0] = eDi.ar.a(eld_02);
        }
        return Cr.a(string, objectArray);
    }
}

