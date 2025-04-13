/*
 * Decompiled with CFR 0.152.
 */
public final class bUK {
    private bUK() {
    }

    public static azj_2 a(faV faV2, faX faX2) {
        if (fbc_0.a.a(faV2.n()).F().c(faX2.c()) == fbl_0.a) {
            return bmi_0.b;
        }
        return bmi_0.a;
    }

    public static azj_2 a(bmr_1 bmr_12, blx_1 blx_12) {
        int n;
        int n2;
        int n3 = bmr_12.a(erl_2.bi) ? 0 : (n2 = bmr_12.a(erl_2.bj) ? 1 : -1);
        int n4 = blx_12.a(erl_2.bi) ? 0 : (n = blx_12.a(erl_2.bj) ? 1 : -1);
        if (n == -1 || n2 == -1) {
            return bmi_0.d;
        }
        return n2 == n ? bmi_0.a : bmi_0.b;
    }
}

