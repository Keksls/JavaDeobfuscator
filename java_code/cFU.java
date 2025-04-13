/*
 * Decompiled with CFR 0.152.
 */
class cFU
implements fkd_1 {
    final /* synthetic */ fvk_0 a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ aUv d;

    cFU(fvk_0 fvk_02, int n, int n2, aUv aUv2) {
        this.a = fvk_02;
        this.b = n;
        this.c = n2;
        this.d = aUv2;
    }

    @Override
    public void a() {
        this.a.setPosition(this.b - 50, this.c + 10 - this.a.getHeight());
        this.a.b(this);
        this.d.q();
    }
}

