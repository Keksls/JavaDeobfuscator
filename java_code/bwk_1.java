/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bwk
 */
public final class bwk_1 {
    private bwk_1() {
    }

    public static emr_2 a(@NotNull fha fha2, @NotNull epq_2 epq_22) {
        boolean bl;
        boolean bl2 = fha2 instanceof bnh_1;
        boolean bl3 = epq_22 instanceof bnh_1;
        boolean bl4 = epq_22 instanceof bmv_1;
        cct_1 cct_12 = ccs_1.a().a(epq_22.T_());
        boolean bl5 = bl = cct_12 != null && cct_12.a();
        if (bl) {
            return bwk_1.b(fha2, epq_22);
        }
        faV faV2 = fha2.fE();
        int n = faV2.n();
        int n2 = epq_22.fI();
        faV faV3 = epq_22.fE();
        boolean bl6 = faV2.k() != fhD.a && faV3.k() != fhD.a;
        boolean bl7 = faV3.e(n2);
        if (bl2 && bl3) {
            return bl6 || bl7 && n == n2 ? emr_2.v : emr_2.n;
        }
        if (bl2 && !bl4) {
            return emr_2.b;
        }
        return emt_2.a(epq_22);
    }

    @Nullable
    private static emr_2 b(@NotNull fha fha2, @NotNull epq_2 epq_22) {
        boolean bl = fha2 instanceof bnh_1;
        boolean bl2 = epq_22 instanceof bnh_1;
        boolean bl3 = epq_22.f(erl_2.be);
        boolean bl4 = epq_22.f(erl_2.bb);
        if (bl && bl2) {
            return emr_2.l;
        }
        if (bl && bl3) {
            return emr_2.k;
        }
        if (bl && bl4) {
            return emr_2.m;
        }
        return emt_2.a(epq_22);
    }
}

