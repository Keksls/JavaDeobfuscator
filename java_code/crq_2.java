/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRQ
 */
class crq_2
implements fzc {
    final /* synthetic */ crp_2 a;

    crq_2(crp_2 crp_22) {
        this.a = crp_22;
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

