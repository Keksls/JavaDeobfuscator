/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRm
 */
class crm_2
implements fzc {
    final /* synthetic */ crl_1 a;

    crm_2(crl_1 crl_12) {
        this.a = crl_12;
    }

    @Override
    public boolean a(int n) {
        if (!fyP.a().h(this.a.b.a)) {
            this.a.b.a.removePostProcessCallback(this);
            this.a.a.run();
        }
        return true;
    }
}

