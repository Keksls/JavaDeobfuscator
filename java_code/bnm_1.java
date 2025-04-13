/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnM
 */
class bnm_1
implements ans_1 {
    final /* synthetic */ bnl_2 a;

    bnm_1(bnl_2 bnl_22) {
        this.a = bnl_22;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.startsWith("questActivationDialog")) {
            fpm_0.b().b(this);
            fpm_0.b().e("wakfu.quests");
            cff_0.b().b(this.a.g);
        }
    }
}

