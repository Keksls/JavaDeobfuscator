/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOD
 */
class cod_1
implements fzc {
    final /* synthetic */ coc_1 a;

    cod_1(coc_1 coc_12) {
        this.a = coc_12;
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

