/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayd
 */
class ayd_2
implements Runnable {
    final /* synthetic */ ayc_1 a;

    ayd_2(ayc_1 ayc_12) {
        this.a = ayc_12;
    }

    @Override
    public void run() {
        this.a.a.stop();
    }
}

