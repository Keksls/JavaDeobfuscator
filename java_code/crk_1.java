/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRK
 */
class crk_1
implements fzc {
    final /* synthetic */ crj_2 a;

    crk_1(crj_2 crj_22) {
        this.a = crj_22;
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

