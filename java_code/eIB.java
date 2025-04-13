/*
 * Decompiled with CFR 0.152.
 */
public final class eIB
extends eig_0 {
    @Override
    public eig_0 aD() {
        return new eIB();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        super.b(sd_02, bl);
        this.aM();
    }

    private void aM() {
        if (this.e == null) {
            return;
        }
        if (this.v == null) {
            return;
        }
        if (this.e.a(eps_0.M)) {
            rs_0 rs_02 = this.v.b(eps_0.M);
            rs_02.e(this.e.c(eps_0.M));
            rs_02.n();
            ((ekh_0)this.v).au();
        }
    }
}

