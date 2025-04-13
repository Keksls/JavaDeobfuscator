/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from baq
 */
public class baq_0
extends bam_0 {
    private final ejh_0 m;

    public baq_0(int n, int n2, int n3, int n4, ejh_0 ejh_02) {
        super(n, n2, n4, n3);
        this.m = ejh_02;
    }

    @Override
    public long o() {
        if (this.m != null) {
            if (this.h() != 0L) {
                this.m.b(this.h());
            }
            if (this.m.i() != null) {
                this.c(this.m.i().a_());
            }
            if (this.m.h() != null) {
                this.b(this.m.h().a_());
            }
            this.m.B();
        }
        return super.o();
    }

    @Override
    protected void l() {
        Su su = this.m.S() || this.m.ar() ? this.m.h() : this.m.i();
        if ((this.m.as() || this.m.aq()) && su != null && (this.m.P() || this.m.aq()) && su.x_() != null) {
            su.x_().a((sd_0)this.m);
        }
        this.m.Y();
        this.m.bv();
    }

    public int r() {
        return this.m.n();
    }
}

