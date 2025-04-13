/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRN
 */
class crn_1
implements fzc {
    final /* synthetic */ crm_1 a;

    crn_1(crm_1 crm_12) {
        this.a = crm_12;
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

