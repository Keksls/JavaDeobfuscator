/*
 * Decompiled with CFR 0.152.
 */
class cXp
implements fkd_1 {
    final /* synthetic */ fvk_0 a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ cxo_0 d;

    cXp(cxo_0 cxo_02, fvk_0 fvk_02, int n, int n2) {
        this.d = cxo_02;
        this.a = fvk_02;
        this.b = n;
        this.c = n2;
    }

    @Override
    public void a() {
        this.a.setPosition(this.b, this.c + 10 - this.a.getHeight());
        this.a.b(this);
    }
}

