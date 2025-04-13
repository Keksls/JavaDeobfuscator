/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVm
 */
class cvm_0
implements Runnable {
    final /* synthetic */ cvk_0 a;

    cvm_0(cvk_0 cvk_02) {
        this.a = cvk_02;
    }

    @Override
    public void run() {
        this.a.b.b(this.a.b.c.poll());
    }
}

