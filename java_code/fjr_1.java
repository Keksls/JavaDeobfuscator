/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJR
 */
class fjr_1
implements Runnable {
    final /* synthetic */ fjp_1 a;

    fjr_1(fjp_1 fjp_12) {
        this.a = fjp_12;
    }

    @Override
    public void run() {
        this.a.b.destroySelfFromParent();
        this.a.a = null;
    }
}

