/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRp
 */
class crp_1
implements fzc {
    final /* synthetic */ cro_1 a;

    crp_1(cro_1 cro_12) {
        this.a = cro_12;
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

