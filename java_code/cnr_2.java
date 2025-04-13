/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cNR
 */
class cnr_2
implements fzc {
    final /* synthetic */ cnq_2 a;

    cnr_2(cnq_2 cnq_22) {
        this.a = cnq_22;
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

