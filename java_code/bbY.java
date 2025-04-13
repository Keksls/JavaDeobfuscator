/*
 * Decompiled with CFR 0.152.
 */
public class bbY
extends bam_0 {
    private final byte[] m;
    private final long o;
    private final long p;
    private ejh_0 q;

    public bbY(int n, int n2, int n3, int n4, si_0<efh_0, efi_0> si_02, long l, long l2, byte[] byArray) {
        super(n, n2, n4, n3);
        this.m = byArray;
        this.o = l2;
        this.p = l;
    }

    @Override
    public long o() {
        blx_1 blx_12 = this.d(this.o);
        if (blx_12 != null && blx_12.dR() != null) {
            this.q = (ejh_0)blx_12.dR().g_(this.p);
        }
        if (this.q != null) {
            this.q.b(this.m);
            if (this.q.i() != null) {
                this.c(this.q.i().a_());
            }
            if (this.q.h() != null) {
                this.b(this.q.h().a_());
            }
            this.q.B();
        }
        return super.o();
    }

    @Override
    protected void l() {
        if (this.q == null) {
            return;
        }
        if (!this.q.bm_()) {
            return;
        }
        if (this.q.A() != null) {
            this.q.A().b(this.q);
        } else {
            this.q.bv();
        }
    }

    public int r() {
        return this.q.n();
    }
}

