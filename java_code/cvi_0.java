/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVI
 */
class cvi_0
implements Runnable {
    final /* synthetic */ cvg_0 a;

    cvi_0(cvg_0 cvg_02) {
        this.a = cvg_02;
    }

    @Override
    public void run() {
        fis_1.a().a("splashText", (Object)null);
        this.a.c.a(this.a.c.f.poll());
    }
}

