/*
 * Decompiled with CFR 0.152.
 */
class dbW
implements fkd_1 {
    final /* synthetic */ fvk_0 a;
    final /* synthetic */ dgO b;
    final /* synthetic */ dbU c;

    dbW(dbU dbU2, fvk_0 fvk_02, dgO dgO2) {
        this.c = dbU2;
        this.a = fvk_02;
        this.b = dgO2;
    }

    @Override
    public void a() {
        this.a.setX(Math.min(this.b.p(), fta_0.getInstance().getWidth() - this.a.getWidth()));
        this.a.setY(Math.min(this.b.q(), fta_0.getInstance().getHeight() - this.a.getHeight()));
        this.a.b(this);
    }
}

