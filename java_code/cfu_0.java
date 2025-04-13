/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFu
 */
class cfu_0
implements fkd_1 {
    boolean a = false;
    final /* synthetic */ fvk_0 b;
    final /* synthetic */ int c;

    cfu_0(fvk_0 fvk_02, int n) {
        this.b = fvk_02;
        this.c = n;
    }

    @Override
    public void a() {
        if (this.a) {
            this.b.setVisible(true);
            this.b.b(this);
        } else {
            this.a = true;
            this.b.setY(this.c - this.b.getHeight());
        }
    }
}

