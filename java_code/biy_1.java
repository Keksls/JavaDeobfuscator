/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIY
 */
class biy_1
implements fzp_0 {
    final /* synthetic */ ftj_0 a;
    final /* synthetic */ bix_0 b;

    biy_1(bix_0 bix_02, ftj_0 ftj_02) {
        this.b = bix_02;
        this.a = ftj_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.b.b.d(this.b.a);
            cgo_0.addRollElementsParticleToContainer(this.a);
        }
    }
}

