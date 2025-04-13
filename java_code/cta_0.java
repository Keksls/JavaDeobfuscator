/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTA
 */
class cta_0
implements afy_0 {
    final /* synthetic */ cTz a;

    cta_0(cTz cTz2) {
        this.a = cTz2;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this.a.r);
        if (!this.a.c()) {
            return;
        }
        bnh_1 bnh_12 = (bnh_1)this.a.l;
        int n3 = bnh_12.G() - afe_02.G();
        int n4 = bnh_12.H() - afe_02.H();
        if (Math.abs(n3) <= 1 && Math.abs(n4) <= 1) {
            afe_02.a(afs_2.a(n3, n4));
            cmg_0 cmg_02 = new cmg_0();
            cmg_02.a(bnh_12.a_());
            azu_0.j().K().c(cmg_02);
        }
    }
}

