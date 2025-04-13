/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

final class eKz {
    private eKz() {
    }

    public static Comparator<Su> a(efh_0 efh_02, int n, int n2, short s2) {
        if (efh_02.a(eff_0.g)) {
            return new eKx();
        }
        if (efh_02.a(eff_0.x)) {
            return new eKy();
        }
        if (efh_02.a(eff_0.m)) {
            return new eKu(n, n2);
        }
        if (efh_02.a(eff_0.y)) {
            return new eKv(n, n2);
        }
        aqd_1 aqd_12 = efh_02.u();
        if (aqd_12 == null) {
            return null;
        }
        aqe_1 aqe_12 = aqd_12.d();
        switch (aqe_12) {
            case c: 
            case k: 
            case l: {
                return new eKu(n, n2);
            }
        }
        return null;
    }
}

