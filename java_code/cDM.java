/*
 * Decompiled with CFR 0.152.
 */
class cDM
extends Thread {
    private boolean b = false;
    final /* synthetic */ cDL a;

    cDM(cDL cDL2) {
        this.a = cDL2;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    @Override
    public void run() {
        while (true) {
            if (this.b) {
                try {
                    this.a.c(System.currentTimeMillis());
                }
                catch (Throwable throwable) {
                    cDL.a.warn((Object)"Exception dans le Thread de moteur d'ambiance.", throwable);
                }
            }
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {
            }
        }
    }
}

