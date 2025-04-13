/*
 * Decompiled with CFR 0.152.
 */
class cXE
implements Runnable {
    final /* synthetic */ cXC a;

    cXE(cXC cXC2) {
        this.a = cXC2;
    }

    @Override
    public void run() {
        if (this.a.h != null) {
            this.a.h.setValue(1.0f);
        }
    }
}

