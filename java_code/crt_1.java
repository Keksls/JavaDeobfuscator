/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRT
 */
class crt_1
implements fzc {
    final /* synthetic */ crs_2 a;

    crt_1(crs_2 crs_22) {
        this.a = crs_22;
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

