/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYh
 */
class cyh_0
implements Runnable {
    final /* synthetic */ cyf_0 a;

    cyh_0(cyf_0 cyf_02) {
        this.a = cyf_02;
    }

    @Override
    public void run() {
        fis_1.a().a("splashText", (Object)null);
        this.a.b.a(this.a.b.h.poll());
    }
}

