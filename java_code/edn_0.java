/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eDN
 */
public class edn_0
extends eds_0 {
    public static final eds_0 a = new edn_0();

    protected edn_0() {
    }

    @Override
    Object[] a(efh_0 efh_02, short s2) {
        int n = efh_02.F();
        Object[] objectArray = new Object[n];
        for (int k = 0; k < n; ++k) {
            float f2 = efh_02.a(k, s2);
            int n2 = efh_02.a(k, s2, eFb.a);
            objectArray[k] = new Hz(n2, f2);
        }
        return objectArray;
    }
}

