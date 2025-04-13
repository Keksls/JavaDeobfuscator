/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.set.hash.TLongHashSet;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzf
 */
public class bzf_1 {
    public static blx_1 a(long l) {
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 != null) {
            return blx_12;
        }
        return (blx_1)euw_2.a.d(l);
    }

    public static boolean a(byte by) {
        int n;
        int n2;
        int n3;
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return false;
        }
        eQb eQb2 = bmr_12.dE().a();
        int n4 = 0;
        int n5 = 0;
        if (eQb2 != null) {
            n4 = eQb2.c(bmr_12.R()).size();
            n5 = Math.max(0, euw_2.a.h(bmr_12.R()) - 1);
        }
        if (n4 + n5 >= (n3 = enp_2.a.b(ens_2.bp))) {
            return false;
        }
        if (eBy.a.b(bmr_12.R())) {
            return true;
        }
        return !(by == 5 ? n4 >= (n2 = enp_2.a.b(ens_2.bn)) : by == 0 && n5 >= (n = enp_2.a.b(ens_2.bo)));
    }

    @Nullable
    public static bmr_1 a() {
        if (!euu_2.a()) {
            return azu_0.j().k();
        }
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 == null) {
            return null;
        }
        long l = euv_2.a.b(bai_02.u());
        Object t = euw_2.a.d(l);
        if (!(t instanceof bmr_1)) {
            return null;
        }
        return (bmr_1)t;
    }

    public static blx_1 a(bmr_1 bmr_12) {
        if (!euu_2.a()) {
            return bmr_12;
        }
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            return bmr_12;
        }
        bxo_2 bxo_22 = bvx_22.A();
        if (bxo_22 == null) {
            return bmr_12;
        }
        TLongHashSet tLongHashSet = euw_2.a.e(bmr_12.U_());
        int n = bxo_22.r();
        int n2 = Integer.MAX_VALUE;
        long l = 0L;
        int n3 = n;
        long l2 = 0L;
        for (long l3 : tLongHashSet.toArray()) {
            if (!bvx_22.F((epq_2)euw_2.a.d(l3))) continue;
            int n4 = bxo_22.k(l3);
            if (n4 < n3) {
                n3 = n4;
                l2 = l3;
                continue;
            }
            if (n4 <= n || n4 >= n2) continue;
            n2 = n4;
            l = l3;
        }
        if (n2 < Integer.MAX_VALUE) {
            return (blx_1)euw_2.a.d(l);
        }
        if (n3 < n) {
            return (blx_1)euw_2.a.d(l2);
        }
        return bmr_12;
    }

    public static boolean b() {
        bmr_1 bmr_12 = bzf_1.a();
        return bmr_12 == null || bmr_12.T_() == 725L;
    }
}

