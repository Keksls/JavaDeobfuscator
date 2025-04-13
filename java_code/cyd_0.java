/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYD
 */
class cyd_0
implements ans_1 {
    final /* synthetic */ cyc_0 a;

    cyd_0(cyc_0 cyc_02) {
        this.a = cyc_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("exchangeDialog")) {
            this.a.g();
            fpm_0.b().b(this.a.e);
        }
    }
}

