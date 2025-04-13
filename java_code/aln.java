/*
 * Decompiled with CFR 0.152.
 */
class aln
implements afy_0 {
    final /* synthetic */ akx_2 a;
    final /* synthetic */ String b;
    final /* synthetic */ akr_2[] c;
    final /* synthetic */ alm_0 d;

    aln(alm_0 alm_02, akx_2 akx_22, String string, akr_2[] akr_2Array) {
        this.d = alm_02;
        this.a = akx_22;
        this.b = string;
        this.c = akr_2Array;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.a.a(this.b, this.c, new akq_1[0]);
    }
}

