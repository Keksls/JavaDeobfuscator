/*
 * Decompiled with CFR 0.152.
 */
public class eIM
extends eig_0 {
    @Override
    public eig_0 aD() {
        return new eIM();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        super.b(sd_02, bl);
        this.aM();
    }

    private void aM() {
        fio_0 fio_02;
        byte by;
        efa_0 efa_02;
        if (this.e == null) {
            return;
        }
        if (this.v == null) {
            return;
        }
        if (!this.v.a(eps_0.p)) {
            return;
        }
        if (this.e.a(eps_0.p)) {
            this.v.b(eps_0.p).c(this.e.c(eps_0.p));
        }
        if (this.v.a(eps_0.o)) {
            if (this.e.a(eps_0.o)) {
                this.v.b(eps_0.o).c(this.e.c(eps_0.o));
            }
            if (this.e.a(eps_0.r)) {
                this.v.b(eps_0.o).c(this.e.c(eps_0.r));
            }
        }
        if (this.v.a(eld_0.j)) {
            this.v.a(eps_0.q, this.e);
            this.v.a(eps_0.r, this.e);
            this.v.a(eps_0.t, this.e);
            this.v.a(eps_0.s, this.e);
            this.v.a(eps_0.ag, this.e);
            this.v.a(eps_0.af, this.e);
            this.v.a(eps_0.ad, this.e);
            this.v.a(eps_0.ae, this.e);
        } else if (((efi_0)this.d).G_() == 11 && this.e.a((efa_02 = efa_0.a(by = ((fin_0)(fio_02 = (fio_0)this.d).r()).q())).c())) {
            this.v.b(eps_0.p).c(this.e.c(efa_02.c()));
        }
    }
}

