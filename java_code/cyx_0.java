/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYx
 */
class cyx_0
implements fkd_1 {
    final /* synthetic */ fvk_0 a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ cyt_0 d;

    cyx_0(cyt_0 cyt_02, fvk_0 fvk_02, int n, int n2) {
        this.d = cyt_02;
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

