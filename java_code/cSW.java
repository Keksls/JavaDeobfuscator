/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public final class cSW {
    public static boolean a(long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        long l2 = bmr_12.T_();
        if (!cci_2.a.d(l2)) {
            return false;
        }
        bos_2 bos_22 = bmr_12.eV();
        long l3 = bos_22.d();
        long l4 = cci_2.a.b(l3);
        if (l4 != l2) {
            return false;
        }
        erl_1 erl_12 = bos_22.a(bmr_12.a_());
        if (erl_12 == null) {
            return false;
        }
        ern_1 ern_12 = bos_22.c(erl_12.d());
        return ern_12 != null && ern_12.a(eQt.i);
    }

    public static boolean a(blx_1 blx_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
        if (!cct_12.a()) {
            return false;
        }
        Optional<fhe_0> optional = cxj_2.a.b();
        if (optional.isEmpty()) {
            return false;
        }
        fhe_0 fhe_02 = optional.get();
        return fhe_02.a(bmr_12.bM(), blx_12.bM());
    }

    public static boolean a() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.eZ()) {
            return false;
        }
        bos_2 bos_22 = bmr_12.eV();
        erl_1 erl_12 = bos_22.a(bmr_12.a_());
        return erl_12 != null && erl_12.d() == bos_22.c();
    }
}

