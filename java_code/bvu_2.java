/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from bvU
 */
public final class bvu_2 {
    public static final bvu_2 a = new bvu_2();
    private final Set<sr_0<?, ?>> b = new HashSet();
    private static final Set<Integer> c = ImmutableSet.of((Object)ele_0.k.a(), (Object)ele_0.b.a(), (Object)ele_0.e.a());

    private bvu_2() {
    }

    public void a(blx_1 blx_12) {
        this.a(blx_12, ele_0.e);
        if (blx_12.Z_() == epn_2.g) {
            this.a(blx_12, ele_0.b);
            return;
        }
        if (blx_12.Z_() == epn_2.e || blx_12.f(erl_2.aJ)) {
            this.a(blx_12, ele_0.k);
        }
    }

    public void b(blx_1 blx_12) {
        for (sr_0<?, ?> sr_02 : this.b) {
            if (sr_02.w() != ele_0.e.a() || sr_02.v() != blx_12) continue;
            apw_0.a().c(sr_02);
        }
        this.a(blx_12, ele_0.e);
    }

    public void a(sr_0<?, ?> sr_02, blx_1 blx_12) {
        bvx_2 bvx_22 = blx_12.bz();
        if (!bvx_22.e(sr_02) || !c.contains(sr_02.w())) {
            return;
        }
        this.a(sr_02, bvx_22);
    }

    private void a(blx_1 blx_12, ele_0 ele_02) {
        if (blx_12 == null) {
            return;
        }
        bvx_2 bvx_22 = blx_12.bz();
        if (bvx_22 == null) {
            return;
        }
        ss_0 ss_02 = bvx_22.i();
        Collection<sr_0> collection = ss_02.f();
        for (sr_0 sr_02 : collection) {
            if (sr_02.v() != blx_12 && sr_02.v() != blx_12.aq() || sr_02.w() != ele_02.a()) continue;
            this.a(sr_02, bvx_22);
        }
    }

    private void a(sr_0<?, ?> sr_02, bvx_2 bvx_22) {
        if (!bvx_22.e(sr_02)) {
            return;
        }
        apw_0.a().a(sr_02);
        this.b.add(sr_02);
    }

    public void a() {
        int n = euw_2.a.h(azu_0.j().n().u());
        bmr_1 bmr_12 = azu_0.j().k();
        for (sr_0<?, ?> sr_02 : this.b) {
            if (n == 1 && sr_02.v() == bmr_12) continue;
            apw_0.a().c(sr_02);
        }
    }
}

