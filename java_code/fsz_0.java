/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsZ
 */
class fsz_0
implements fzu {
    final /* synthetic */ fsY a;

    fsz_0(fsY fsY2) {
        this.a = fsY2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2.e() == fta_0.getInstance()) {
            this.a.ap = true;
            this.a.setNeedsToPreProcess();
        }
        return false;
    }
}

