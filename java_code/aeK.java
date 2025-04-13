/*
 * Decompiled with CFR 0.152.
 */
class aeK
implements aue_2 {
    private final long d = System.currentTimeMillis();
    private boolean e = false;
    final /* synthetic */ acb_0 a;
    final /* synthetic */ int b;
    final /* synthetic */ aeH c;

    aeK(aeH aeH2, acb_0 acb_02, int n) {
        this.c = aeH2;
        this.a = acb_02;
        this.b = n;
    }

    @Override
    public boolean a() {
        if (!this.a.l()) {
            if (!this.e && System.currentTimeMillis() - this.d < (long)this.b) {
                this.e = true;
            }
            return false;
        }
        auy_2.a().b(this);
        this.c.f = null;
        return true;
    }
}

