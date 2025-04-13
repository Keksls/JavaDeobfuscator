/*
 * Decompiled with CFR 0.152.
 */
class cVu
implements ans_1 {
    final /* synthetic */ cvt_0 a;

    cVu(cvt_0 cvt_02) {
        this.a = cvt_02;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!"adminMonitorDialog".equals(string)) {
            return;
        }
        azu_0.j().b(cvt_0.a());
        fpm_0.b().b(this);
    }
}

