/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfB
 */
class bfb_1
implements Runnable {
    final /* synthetic */ bfy_1 a;

    bfb_1(bfy_1 bfy_12) {
        this.a = bfy_12;
    }

    @Override
    public void run() {
        bfy_1.c.warn((Object)"Updater token request timeout.");
        this.a.d.b(this.a);
        azu_0.j().a(dai_0.a);
        azu_0.j().a(cvv_0.a());
        if (!emj.a.e()) {
            emj.b("timeout");
        }
    }
}

