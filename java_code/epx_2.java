/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epx
 */
final class epx_2
extends eqk_2 {
    private final qg_2 b;
    final /* synthetic */ epq_2 a;

    epx_2(epq_2 epq_22, qg_2 qg_22) {
        this.a = epq_22;
        this.b = qg_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        this.b.c = this.a.a_();
    }

    @Override
    public void b() {
        this.a.a(this.b.c);
        for (eql_2 eql_22 : this.a.cL) {
            eql_22.b(this.a);
        }
    }
}

