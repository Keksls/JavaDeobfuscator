/*
 * Decompiled with CFR 0.152.
 */
class cKj
implements fzu {
    final /* synthetic */ fvk_0 a;

    cKj(fvk_0 fvk_02) {
        this.a = fvk_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        int n;
        int n2;
        fbi_2 fbi_22;
        fso fso2 = this.a.getContainer();
        fbe_2 fbe_22 = this.a.getStickData();
        fbi_2 fbi_23 = fbi_22 = fbe_22 != null ? fbe_22.c() : null;
        if (fbi_22 == null || fbi_22 == fbi_2.a) {
            n2 = Hw.a(this.a.getX(), 0, fso2.getWidth() - this.a.getWidth());
            n = Hw.a(this.a.getY(), 0, fso2.getHeight() - this.a.getHeight());
        } else {
            n2 = fbi_22.a(this.a.getX(), this.a);
            n = fbi_22.b(this.a.getY(), this.a);
        }
        this.a.setPosition(n2, n);
        return false;
    }
}

