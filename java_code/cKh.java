/*
 * Decompiled with CFR 0.152.
 */
class cKh
implements fzu {
    final /* synthetic */ fvM a;
    final /* synthetic */ fvk_0 b;
    final /* synthetic */ int c;

    cKh(fvM fvM2, fvk_0 fvk_02, int n) {
        this.a = fvM2;
        this.b = fvk_02;
        this.c = n;
    }

    @Override
    public boolean run(fzs fzs2) {
        this.a.removeEventListener(fzs2.f(), this, false);
        int n = fyf_0.a().c() - this.a.getX(this.b) - this.a.getWidth() / 2;
        int n2 = fyf_0.a().d() - this.a.getY(this.b) - this.a.getHeight() / 2;
        this.b.setPosition(n, n2);
        fta_0.getInstance().setDragged(this.a, this.c);
        this.a.setDragMousePosition(fyf_0.a().c(), fyf_0.a().d());
        return false;
    }
}

