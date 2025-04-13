/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRj
 */
class crj_1
implements fzc {
    final /* synthetic */ cri_2 a;

    crj_1(cri_2 cri_22) {
        this.a = cri_22;
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

