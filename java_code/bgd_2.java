/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bgd
 */
class bgd_2
extends emi {
    final /* synthetic */ bgc_2 a;
    final /* synthetic */ bgc_2 b;

    bgd_2(bgc_2 bgc_22, bgc_2 bgc_23) {
        this.b = bgc_22;
        this.a = bgc_23;
    }

    @Override
    public void a() {
        bgc_2.b.info((Object)("Connected to Zaap. Starting " + emq.class + " fill"));
        emj.a.c(new bge_2(this));
    }

    @Override
    public void a(String string) {
        bgc_2.b.warn((Object)("Error during retrieval of " + emq.class + " connection(" + string + ")"));
        this.b.c.b(this.a);
    }
}

