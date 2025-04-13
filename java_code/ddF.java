/*
 * Decompiled with CFR 0.152.
 */
class ddF
implements Runnable {
    final /* synthetic */ ddE a;

    ddF(ddE ddE2) {
        this.a = ddE2;
    }

    @Override
    public void run() {
        if (this.a.e != null && !this.a.e.l()) {
            return;
        }
        ado_1.a().b(this.a.f);
        fis_1.a().a("isNewWorldReady", true);
    }
}

