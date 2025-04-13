/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRv
 */
class crv_1
implements fzc {
    final /* synthetic */ cru_2 a;

    crv_1(cru_2 cru_22) {
        this.a = cru_22;
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

