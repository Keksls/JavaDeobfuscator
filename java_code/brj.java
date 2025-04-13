/*
 * Decompiled with CFR 0.152.
 */
class brj
implements abb_0 {
    final /* synthetic */ frO a;
    final /* synthetic */ aby_0 b;
    final /* synthetic */ brd_0 c;

    brj(brd_0 brd_02, frO frO2, aby_0 aby_02) {
        this.c = brd_02;
        this.a = frO2;
        this.b = aby_02;
    }

    @Override
    public void animationEnded(abu abu2) {
        this.a.setAnimName("AnimStatique");
        this.b.b(this);
    }
}

