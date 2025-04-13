/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eIK
 */
public final class eik_0
extends eig_0 {
    @Override
    public eig_0 aD() {
        return new eik_0();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        super.b(sd_02, bl);
        this.aM();
    }

    @Override
    public void j(sd_0 sd_02) {
        super.j(sd_02);
        this.y = true;
    }

    private void aM() {
        int n = this.g.d() - this.e.G();
        int n2 = this.g.e() - this.e.H();
        aej_2 aej_22 = n > 1 || n < -1 || n2 > 1 || n2 < -1 ? aej_2.h : aej_2.a(n, n2);
        this.v.a(aej_22);
    }
}

