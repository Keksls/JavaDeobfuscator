/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bYb
 */
class byb_0
implements bwe_1 {
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ akx_2 d;
    final /* synthetic */ String e;
    final /* synthetic */ akr_2[] f;
    final /* synthetic */ bYa g;

    byb_0(bYa bYa2, long l, long l2, akx_2 akx_22, String string, akr_2[] akr_2Array) {
        this.g = bYa2;
        this.b = l;
        this.c = l2;
        this.d = akx_22;
        this.e = string;
        this.f = akr_2Array;
    }

    @Override
    public void a(epq_2 epq_22, long l) {
        if (epq_22.a_() == this.b && l == this.c) {
            this.d.a(this.e, this.f, new akq_1[0]);
        }
    }

    @Override
    public long c() {
        return this.b;
    }
}

