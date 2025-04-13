/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVD
 */
class cvd_0
implements Runnable {
    int a;
    final /* synthetic */ fsQ b;
    final /* synthetic */ cVA c;

    cvd_0(cVA cVA2, fsQ fsQ2) {
        this.c = cVA2;
        this.b = fsQ2;
    }

    @Override
    public void run() {
        if (this.b.isUnloading()) {
            return;
        }
        ftj_0 ftj_02 = this.b.getRenderableByOffset(this.a);
        fyb_0 fyb_02 = ftj_02.getInnerElementMap().a("rewardIcon");
        fsk_0 fsk_02 = (fsk_0)fyb_02;
        if (!fsk_02.getVisible()) {
            fsk_02 = (fsk_0)ftj_02.getInnerElementMap().a("rewardIcon2");
        }
        fsk_02.setModulationColor(azf_2.e);
        ++this.a;
    }
}

