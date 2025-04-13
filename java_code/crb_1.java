/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRB
 */
class crb_1
implements fzc {
    final /* synthetic */ cra_2 a;

    crb_1(cra_2 cra_22) {
        this.a = cra_22;
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

