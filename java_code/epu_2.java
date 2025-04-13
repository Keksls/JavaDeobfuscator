/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epu
 */
final class epu_2
extends eqk_2 {
    private final qj_1 b;
    final /* synthetic */ epq_2 a;

    epu_2(epq_2 epq_22, qj_1 qj_12) {
        this.a = epq_22;
        this.b = qj_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        els_0 els_02 = this.a.ck();
        this.b.c = els_02 != null ? els_02.c() : -1;
        this.b.d = this.a.ha();
        this.b.e = this.a.ab_();
        this.b.f = this.a.C_();
        this.b.g = this.a.hm();
        this.b.h = this.a.Z();
        eqy_1 eqy_12 = this.a.fC();
        if (eqy_12 != null) {
            this.b.i = new qm_1();
            eqy_12.a(this.b.i.a);
        }
    }

    @Override
    public void b() {
        int n = this.b.c;
        this.a.a(n);
        if (n > 0) {
            this.a.C(true);
            this.a.dk();
        }
        this.a.a_(this.b.e);
        this.a.A(this.b.d);
        this.a.z(this.b.f);
        this.a.D(this.b.g);
        this.a.a(this.b.h);
        if (this.b.i != null) {
            eqy_1 eqy_12;
            if (this.b.i.a.g != null) {
                erd_2 erd_22;
                if (this.b.i.a.g.a.d == 1) {
                    erd_22 = erd_2.s();
                } else if (this.b.i.a.g.a.d == 2) {
                    erd_22 = eqz_1.d();
                } else if (this.b.i.a.g.a.d == 3) {
                    erd_22 = erf_2.d();
                } else {
                    epq_2.cJ.error((Object)("Type d'invoc de double inconnue " + this.b.i.a.g.a.d));
                    erd_22 = erd_2.s();
                }
                eqy_12 = this.a.aZ() != null ? erd_22.b((short)22, this.a.aZ().a(), this.a.aZ().e(), false, false, false) : erd_22.b();
            } else {
                eqy_12 = this.b.i.a.h != null ? erg_2.b().a() : new eqy_1();
            }
            eqy_12.b(this.b.i.a);
            this.a.a(eqy_12);
        }
        this.a.bK();
    }
}

