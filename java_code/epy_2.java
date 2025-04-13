/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epy
 */
final class epy_2
extends eqk_2 {
    private final qi_1 b;
    final /* synthetic */ epq_2 a;

    epy_2(epq_2 epq_22, qi_1 qi_12) {
        this.a = epq_22;
        this.b = qi_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        this.b.d = this.a.U_();
        this.b.c = this.a.gY();
    }

    @Override
    public void b() {
        this.a.o(this.b.d);
        this.a.h(this.b.c);
        for (eql_2 eql_22 : this.a.cL) {
            eql_22.b(this.a);
        }
    }
}

