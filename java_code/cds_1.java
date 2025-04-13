/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cds
 */
class cds_1 {
    final cdu_1 b;
    final air_0 c = new air_0();
    final air_0 d = new air_0();
    byte e = 0;
    boolean f = false;
    final /* synthetic */ cdr_1 a;

    cds_1(cdr_1 cdr_12, cdu_1 cdu_12) {
        this.a = cdr_12;
        this.b = cdu_12;
        this.c.b(2.1f);
        this.c.a(0.01f);
        this.d.b(2.1f);
        this.d.a(0.01f);
    }

    public void a(acy_2<cdp_1> acy_22) {
        for (int k = this.a.g.d() - 1; k >= 0; --k) {
            this.f |= this.a.g.h(k).a(this.b.a());
        }
    }
}

