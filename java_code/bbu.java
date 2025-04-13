/*
 * Decompiled with CFR 0.152.
 */
public class bbu
extends alb_2 {
    private final bmv_1 m;
    private final blx_1 n;
    private final long o;

    public bbu(int n, int n2, int n3, int n4, bmv_1 bmv_12, blx_1 blx_12) {
        super(n, n2, n3);
        this.m = bmv_12;
        this.n = blx_12;
        this.o = -1L;
        this.a(new bYQ(this));
        this.e(n4);
    }

    public bbu(int n, int n2, int n3, int n4, bmv_1 bmv_12, long l) {
        super(n, n2, n3);
        this.m = bmv_12;
        this.n = null;
        this.o = l;
        this.a(new bYQ(this));
        this.e(n4);
    }

    public bmv_1 r() {
        return this.m;
    }

    public blx_1 s() {
        return this.n;
    }

    public long t() {
        return this.o;
    }

    @Override
    public long o() {
        long l = super.o();
        if (l != -1L || this.g) {
            this.j();
            this.g = false;
        }
        return -1L;
    }

    @Override
    public void a(akx_2 akx_22) {
        super.a(akx_22);
        if (this.m != null) {
            this.m.a((bbu)null);
        }
        if (this.n != null && this.n instanceof bmv_1) {
            ((bmv_1)this.n).a((bbu)null);
        }
    }

    public void u() {
        if (this.h != null) {
            this.h.n();
        }
    }
}

