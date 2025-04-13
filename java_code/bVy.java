/*
 * Decompiled with CFR 0.152.
 */
class bVy
implements fzu {
    final /* synthetic */ fjf_2 a;
    final /* synthetic */ bVw b;

    bVy(bVw bVw2, fjf_2 fjf_22) {
        this.b = bVw2;
        this.a = fjf_22;
    }

    @Override
    public boolean run(fzs fzs2) {
        fck_2 fck_22 = (fck_2)fzs2;
        int n = fck_22.a(this.b.l);
        int n2 = (int)this.a.getHeight() - fck_22.b(this.b.l);
        for (bvf_0 bvf_02 : this.b.k) {
            if (bvf_02.a(n, n2)) {
                bvf_02.a();
                continue;
            }
            bvf_02.b();
        }
        return false;
    }
}

