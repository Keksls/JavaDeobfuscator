/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRH
 */
class crh_1
implements fzc {
    final /* synthetic */ crg_1 a;

    crh_1(crg_1 crg_12) {
        this.a = crg_12;
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

