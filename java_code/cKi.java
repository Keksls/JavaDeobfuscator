/*
 * Decompiled with CFR 0.152.
 */
class cKi
implements fzu {
    final /* synthetic */ fvk_0 a;

    cKi(fvk_0 fvk_02) {
        this.a = fvk_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        fso fso2 = this.a.getContainer();
        int n = Hw.a(this.a.getX(), 0, fso2.getWidth() - this.a.getWidth());
        int n2 = Hw.a(this.a.getY(), 0, fso2.getHeight() - this.a.getHeight());
        this.a.setPosition(n, n2);
        return false;
    }
}

