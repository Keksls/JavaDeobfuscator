/*
 * Decompiled with CFR 0.152.
 */
class cYM
implements fkd_1 {
    final /* synthetic */ fvk_0 a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ cYL d;

    cYM(cYL cYL2, fvk_0 fvk_02, int n, int n2) {
        this.d = cYL2;
        this.a = fvk_02;
        this.b = n;
        this.c = n2;
    }

    @Override
    public void a() {
        this.a.setPosition(this.b, this.c);
        this.a.b(this);
    }
}

