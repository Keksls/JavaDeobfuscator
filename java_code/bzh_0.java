/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZh
 */
class bzh_0
implements bNQ {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ akx_2 c;
    final /* synthetic */ String d;
    final /* synthetic */ akr_2[] e;
    final /* synthetic */ bZg f;

    bzh_0(bZg bZg2, int n, int n2, akx_2 akx_22, String string, akr_2[] akr_2Array) {
        this.f = bZg2;
        this.a = n;
        this.b = n2;
        this.c = akx_22;
        this.d = string;
        this.e = akr_2Array;
    }

    @Override
    public void a(bNK bNK2) {
        if (bNK2.G() == this.a && bNK2.H() == this.b) {
            this.c.a(this.d, this.e, new akq_1[0]);
            bNT.f().c(this);
        }
    }
}

