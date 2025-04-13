/*
 * Decompiled with CFR 0.152.
 */
class bXY
implements bwe_1 {
    final /* synthetic */ long b;
    final /* synthetic */ akx_2 c;
    final /* synthetic */ String d;
    final /* synthetic */ akr_2[] e;
    final /* synthetic */ bXX f;

    bXY(bXX bXX2, long l, akx_2 akx_22, String string, akr_2[] akr_2Array) {
        this.f = bXX2;
        this.b = l;
        this.c = akx_22;
        this.d = string;
        this.e = akr_2Array;
    }

    @Override
    public void a(epq_2 epq_22) {
        if (epq_22.a_() == this.b) {
            this.c.a(this.d, this.e, new akq_1[0]);
        }
    }

    @Override
    public long c() {
        return this.b;
    }
}

