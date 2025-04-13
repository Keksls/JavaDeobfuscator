/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bma
 */
class bma_2
implements Runnable {
    final /* synthetic */ bmr_1 a;
    final /* synthetic */ blx_1 b;

    bma_2(blx_1 blx_12, bmr_1 bmr_12) {
        this.b = blx_12;
        this.a = bmr_12;
    }

    @Override
    public void run() {
        bOw bOw2 = this.a.cg();
        bOw2.x();
        bOw2.z();
        if (this.b.bo() && this.a.eU() != null) {
            this.a.eU().b();
        }
    }
}

