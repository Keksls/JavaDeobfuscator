/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddP
 */
class ddp_0
implements Runnable {
    final /* synthetic */ ddO a;

    ddp_0(ddO ddO2) {
        this.a = ddO2;
    }

    @Override
    public void run() {
        if (this.a.m != null) {
            try {
                this.a.m.n();
            }
            catch (Exception exception) {
                ddO.a.warn((Object)exception.getMessage(), (Throwable)exception);
            }
        }
    }
}

