/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVB
 */
class bvb_0
implements fzu {
    final /* synthetic */ fso a;
    final /* synthetic */ bva_0 b;

    bvb_0(bva_0 bva_02, fso fso2) {
        this.b = bva_02;
        this.a = fso2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (this.b.e != null) {
            this.b.e.setVisible(false);
        }
        this.a.setVisible(true);
        return false;
    }
}

