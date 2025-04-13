/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from baB
 */
public class bab_0 {
    private bab_0() {
    }

    public static void a(Runnable runnable) {
        bvx_2 bvx_22;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null && (bvx_22 = bmr_12.cP()) != null) {
            baa_0.a().a(bvx_22, (aku_1)new bbn_0(runnable));
            baa_0.a().a(bvx_22);
            return;
        }
        runnable.run();
    }
}

