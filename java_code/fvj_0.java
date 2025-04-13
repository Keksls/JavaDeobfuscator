/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvJ
 */
class fvj_0
implements fzc {
    final /* synthetic */ fvi_0 a;

    fvj_0(fvi_0 fvi_02) {
        this.a = fvi_02;
    }

    @Override
    public boolean a(int n) {
        if (!fyP.a().h(this.a.b.b)) {
            this.a.b.d.removePostProcessCallback(this);
            this.a.a.run();
        }
        return true;
    }
}

