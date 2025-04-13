/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRb
 */
class brb_1
implements Runnable {
    final /* synthetic */ TG a;
    final /* synthetic */ long b;
    final /* synthetic */ bra_1 c;

    brb_1(bra_1 bra_12, TG tG, long l) {
        this.c = bra_12;
        this.a = tG;
        this.b = l;
    }

    @Override
    public void run() {
        cqT cqT2 = new cqT(this.a.a_(), this.b);
        azu_0.j().K().c(cqT2);
        azu_0.j().b(del_0.a());
    }
}

