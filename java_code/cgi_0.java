/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGI
 */
class cgi_0
implements ans_1 {
    cgi_0() {
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!"ladderRewardsDialog".equals(string)) {
            return;
        }
        if (!(azu_0.j().c(cYF.a()) || azu_0.j().c(dct.a()) || azu_0.j().c(cxq_0.a))) {
            fpm_0.b().e("wakfu.exchangeMachine");
        }
        fpm_0.b().b(this);
    }
}

