/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFG
 */
class bfg_0
implements Runnable {
    final /* synthetic */ bmr_1 a;
    final /* synthetic */ evt_1 b;
    final /* synthetic */ bfc_0 c;

    bfg_0(bfc_0 bfc_02, bmr_1 bmr_12, evt_1 evt_12) {
        this.c = bfc_02;
        this.a = bmr_12;
        this.b = evt_12;
    }

    @Override
    public void run() {
        this.c.a(this.a, this.b);
    }
}

