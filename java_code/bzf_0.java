/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZf
 */
class bzf_0
implements bNP {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ akx_2 c;
    final /* synthetic */ String d;
    final /* synthetic */ akr_2[] e;
    final /* synthetic */ bze_0 f;

    bzf_0(bze_0 bze_02, int n, int n2, akx_2 akx_22, String string, akr_2[] akr_2Array) {
        this.f = bze_02;
        this.a = n;
        this.b = n2;
        this.c = akx_22;
        this.d = string;
        this.e = akr_2Array;
    }

    @Override
    public void b(bNK bNK2) {
        if (bNK2.G() == this.a && bNK2.H() == this.b) {
            this.c.a(this.d, this.e, new akq_1[0]);
            bNT.f().c(this);
        }
    }
}

