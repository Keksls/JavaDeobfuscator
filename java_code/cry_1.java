/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRy
 */
class cry_1
implements fzc {
    final /* synthetic */ crx_2 a;

    cry_1(crx_2 crx_22) {
        this.a = crx_22;
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

