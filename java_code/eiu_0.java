/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eIu
 */
public final class eiu_0 {
    private static final int a = 2;

    private eiu_0() {
    }

    public static boolean a(short s2) {
        List<Long> list = enp_2.a.h(ens_2.aJ);
        return list.contains(s2);
    }

    public static int a(int n, eKg eKg2, sk_0 sk_02, sk_0 sk_03) {
        switch (eKg2) {
            case a: {
                return n;
            }
            case b: {
                return sk_02 != null ? xh_0.a((float)(eiu_0.b(sk_02, false) * n) / 100.0f) : 0;
            }
            case c: {
                return sk_02 != null ? xh_0.a((float)(eiu_0.a(sk_02, false) * n) / 100.0f) : 0;
            }
            case e: {
                return sk_03 != null ? xh_0.a((float)(eiu_0.b(sk_03, false) * n) / 100.0f) : 0;
            }
            case f: {
                return sk_03 != null ? xh_0.a((float)(eiu_0.a(sk_03, false) * n) / 100.0f) : 0;
            }
            case d: {
                return sk_02 != null ? xh_0.a((float)((eiu_0.b(sk_02, false) - eiu_0.a(sk_02, false)) * n) / 100.0f) : 0;
            }
            case g: {
                return sk_03 != null ? xh_0.a((float)((eiu_0.b(sk_03, false) - eiu_0.a(sk_03, false)) * n) / 100.0f) : 0;
            }
        }
        return 0;
    }

    public static int a(sk_0 sk_02, boolean bl) {
        rs_0 rs_02 = sk_02.b(eps_0.b);
        rs_0 rs_03 = sk_02.b(eps_0.T);
        int n = 0;
        if (rs_02 != null) {
            n += rs_02.a();
        }
        if (rs_03 != null && bl) {
            n += rs_03.a();
        }
        return n;
    }

    public static int b(sk_0 sk_02, boolean bl) {
        rs_0 rs_02 = sk_02.b(eps_0.b);
        rs_0 rs_03 = sk_02.b(eps_0.T);
        int n = 0;
        if (rs_02 != null) {
            n += rs_02.c();
        }
        if (rs_03 != null && bl) {
            n += rs_03.c();
        }
        return n;
    }

    @Nullable
    public static efa_0 a(sk_0 sk_02) {
        efa_0[] efa_0Array = efa_0.values();
        efa_0 efa_02 = null;
        int n = 0;
        for (int k = 0; k < efa_0Array.length; ++k) {
            eps_0 eps_02;
            efa_0 efa_03 = efa_0Array[k];
            if (efa_03 == efa_0.f || efa_03 == efa_0.g || (eps_02 = efa_03.c()) == null || !sk_02.a(eps_02) || efa_02 != null && n >= sk_02.c(efa_03.c())) continue;
            efa_02 = efa_03;
            n = sk_02.c(efa_03.c());
        }
        return efa_02;
    }

    @Nullable
    public static efa_0 b(sk_0 sk_02) {
        if (sk_02 == null) {
            return null;
        }
        efa_0[] efa_0Array = efa_0.values();
        efa_0 efa_02 = null;
        int n = Integer.MAX_VALUE;
        for (int k = 0; k < efa_0Array.length; ++k) {
            eps_0 eps_02;
            efa_0 efa_03 = efa_0Array[k];
            if (efa_03 == efa_0.f || efa_03 == efa_0.g || !sk_02.a(eps_02 = efa_03.g()) || efa_02 != null && n <= sk_02.c(eps_02)) continue;
            efa_02 = efa_03;
            n = sk_02.c(eps_02);
        }
        return efa_02;
    }

    public static List<Su> a(ejh_0 ejh_02, boolean bl) {
        efh_0 efh_02 = (efh_0)ejh_02.f();
        aff_1 aff_12 = ejh_02.j();
        List<List<Su>> list = ejh_02.a(efh_02, (apq_2)ejh_02.h(), (So<efh_0>)ejh_02.m(), aff_12.d(), aff_12.e(), aff_12.f());
        apc_2 apc_22 = efh_02.Q();
        ArrayList<Su> arrayList = new ArrayList<Su>();
        int n = list.size();
        for (int k = 0; k < n; ++k) {
            List<Su> list2 = list.get(k);
            int n2 = list2.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                Su su = list2.get(i2);
                if (arrayList.contains(su) || bl && apc_22 != null && !apc_22.b(ejh_02.h(), su, ejh_02, ejh_02.m())) continue;
                arrayList.add(su);
            }
        }
        return arrayList;
    }

    public static boolean a(Su su, Su su2, efh_0 efh_02) {
        int n = aob_2.c((aoc_2)su, su2);
        return eiu_0.a(efh_02, eff_0.w) || !eiu_0.a(efh_02) && n > 2;
    }

    public static boolean b(Su su, Su su2, efh_0 efh_02) {
        int n = aob_2.c((aoc_2)su, su2);
        return eiu_0.a(efh_02, eff_0.v) || !eiu_0.a(efh_02) && n <= 2;
    }

    private static boolean a(efh_0 efh_02) {
        return eiu_0.a(efh_02, eff_0.w) || eiu_0.a(efh_02, eff_0.v);
    }

    public static boolean a(efh_0 efh_02, eff_0 eff_02) {
        return efh_02 != null && efh_02.a(eff_02);
    }

    public static int a(eps_0 eps_02, Su su) {
        epa_1 epa_12;
        int n = 0;
        if (su.a(eps_02) && (n += (epa_12 = (epa_1)su.b(eps_02)).b()) > epa_12.x()) {
            n = epa_12.x();
        }
        return n;
    }
}

