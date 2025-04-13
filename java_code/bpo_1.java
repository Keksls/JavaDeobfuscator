/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bpo
 */
public class bpo_1
extends eqx_1 {
    private static final bpo_1 b = new bpo_1();

    private bpo_1() {
    }

    public static bpo_1 a() {
        return b;
    }

    public long a(bmv_1 bmv_12, erl_2 erl_22) {
        if (erl_22 == erl_2.n) {
            bpo_1.a(bmv_12);
        }
        return super.a(bmv_12, erl_22);
    }

    private static void a(bmv_1 bmv_12) {
        cSN cSN2 = dan.a().c();
        if (cSN2 == null) {
            return;
        }
        int n = cSN2.b();
        for (int k = 0; k < n; ++k) {
            cUM cUM2 = cSN2.a(k);
            if (!(cUM2 instanceof bmv_1) || ((bmv_1)cUM2).a_() != bmv_12.a_()) continue;
            dan.a().d();
            break;
        }
    }
}

