/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bYA
 */
class bya_0
implements abb_0 {
    final /* synthetic */ ahv a;
    final /* synthetic */ akx_2 b;
    final /* synthetic */ int c;
    final /* synthetic */ byz_0 d;

    bya_0(byz_0 byz_02, ahv ahv2, akx_2 akx_22, int n) {
        this.d = byz_02;
        this.a = ahv2;
        this.b = akx_22;
        this.c = n;
    }

    @Override
    public void animationEnded(abu abu2) {
        this.a.b(this);
        this.b.b(this.c);
    }
}

