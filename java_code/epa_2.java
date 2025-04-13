/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epA
 */
final class epa_2
extends eqk_2 {
    private final rr_2 b;
    final /* synthetic */ epq_2 a;

    epa_2(epq_2 epq_22, rr_2 rr_22) {
        this.a = epq_22;
        this.b = rr_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        aff_1 aff_12 = this.a.P_();
        this.b.c = aff_12.d();
        this.b.d = aff_12.e();
        this.b.e = aff_12.f();
        this.b.g = (byte)this.a.F().l;
        this.b.f = this.a.T_();
        aff_1 aff_13 = this.a.gT();
        if (aff_13 == null) {
            return;
        }
        this.b.h = new ru_1();
        this.b.h.a = aff_13.d();
        this.b.h.b = aff_13.e();
        this.b.h.c = aff_13.f();
        this.b.h.d = this.a.gU();
    }

    @Override
    public void b() {
        this.a.a(this.b.c, this.b.d, this.b.e);
        this.a.a(aej_2.a(this.b.g));
        this.a.k(this.b.f);
        if (this.b.h != null) {
            this.a.d(new aff_1(this.b.h.a, this.b.h.b, this.b.h.c));
            this.a.n(this.b.h.d);
        }
        for (eql_2 eql_22 : this.a.cL) {
            eql_22.g(this.a);
            eql_22.h(this.a);
        }
    }
}

