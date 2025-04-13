/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOi
 */
class coi_2
implements fzc {
    final /* synthetic */ coh_2 a;

    coi_2(coh_2 coh_22) {
        this.a = coh_22;
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

