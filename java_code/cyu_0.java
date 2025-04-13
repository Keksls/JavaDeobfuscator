/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYu
 */
class cyu_0
implements ans_1 {
    final /* synthetic */ cyt_0 a;

    cyu_0(cyt_0 cyt_02) {
        this.a = cyt_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("inventoryDialog")) {
            if (azu_0.j().c(cxy_0.a())) {
                azu_0.j().b(cxy_0.a());
            }
            this.a.h();
            azu_0.j().b(cyt_0.a());
        }
    }
}

