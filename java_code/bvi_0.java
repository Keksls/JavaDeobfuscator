/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVI
 */
class bvi_0
implements fzu {
    final /* synthetic */ bvh_0 a;

    bvi_0(bvh_0 bvh_02) {
        this.a = bvh_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        this.a.o = ((Long)((fct_1)fzs2).j()).longValue();
        fis_1.a().a((ajf_1)this.a, "videoProgressionValue", "videoCurrentTimeText", "videoTotalTimeText");
        return false;
    }
}

