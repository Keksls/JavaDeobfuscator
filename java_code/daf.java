/*
 * Decompiled with CFR 0.152.
 */
class daf
implements fkd_1 {
    final /* synthetic */ fvk_0 a;
    final /* synthetic */ dgE b;
    final /* synthetic */ dab_0 c;

    daf(dab_0 dab_02, fvk_0 fvk_02, dgE dgE2) {
        this.c = dab_02;
        this.a = fvk_02;
        this.b = dgE2;
    }

    @Override
    public void a() {
        this.a.setX(Math.min(this.b.p(), fta_0.getInstance().getWidth() - this.a.getWidth()));
        this.a.setY(Math.min(this.b.q(), fta_0.getInstance().getHeight() - this.a.getHeight()));
        this.a.b(this);
    }
}

