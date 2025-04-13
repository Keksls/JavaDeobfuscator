/*
 * Decompiled with CFR 0.152.
 */
public class bbZ
extends alc_1 {
    private blx_1 e;

    public bbZ(int n, int n2, int n3, blx_1 blx_12) {
        super(n, n2, n3);
        this.a(n);
        this.b(n2);
        this.c(n3);
        this.a(blx_12);
    }

    @Override
    protected long o() {
        biI biI2 = this.e.bv();
        if (biI2.k("AnimTransEffect-Fin")) {
            biI2.e("AnimTransEffect-Fin");
            return biI2.j("AnimTransEffect-Fin");
        }
        this.p();
        return 0L;
    }

    private void p() {
        biI biI2 = this.e.bv();
        this.e.c(0);
        this.e.aQ();
        biI2.a(biI2.am(), new bca_0(this, biI2));
        fis_1.a().a((ajf_1)this.e, "name", "nameAndLevel");
    }

    @Override
    protected void l() {
        this.p();
    }

    public blx_1 n() {
        return this.e;
    }

    public void a(blx_1 blx_12) {
        this.e = blx_12;
    }
}

