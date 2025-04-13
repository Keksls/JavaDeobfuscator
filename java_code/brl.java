/*
 * Decompiled with CFR 0.152.
 */
class brl
implements abb_0 {
    final /* synthetic */ ans_1 a;
    final /* synthetic */ brc_0 b;
    final /* synthetic */ boolean c;
    final /* synthetic */ aby_0 d;
    final /* synthetic */ brd_0 e;

    brl(brd_0 brd_02, ans_1 ans_12, brc_0 brc_02, boolean bl, aby_0 aby_02) {
        this.e = brd_02;
        this.a = ans_12;
        this.b = brc_02;
        this.c = bl;
        this.d = aby_02;
    }

    @Override
    public void animationEnded(abu abu2) {
        fpm_0.b().b(this.a);
        this.e.a(this.b, this.c);
        this.d.b(this);
    }
}

