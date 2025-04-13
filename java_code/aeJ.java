/*
 * Decompiled with CFR 0.152.
 */
class aeJ
implements aue_2 {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ auy_2 c;
    final /* synthetic */ aeH d;

    aeJ(aeH aeH2, long l, int n, auy_2 auy_22) {
        this.d = aeH2;
        this.a = l;
        this.b = n;
        this.c = auy_22;
    }

    @Override
    public boolean a() {
        if (System.currentTimeMillis() - this.a < (long)this.b) {
            return false;
        }
        this.c.b(this);
        return true;
    }
}

