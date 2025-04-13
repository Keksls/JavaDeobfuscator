/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eps
 */
final class eps_2
extends eqk_2 {
    private final pj_1 c;
    static final /* synthetic */ boolean a;
    final /* synthetic */ epq_2 b;

    public eps_2(epq_2 epq_22, pj_1 pj_12) {
        this.b = epq_22;
        this.c = pj_12;
        this.c.a().a(this);
    }

    @Override
    public void a() {
        if (this.b.cY == epn_2.b) {
            epq_2.cJ.warn((Object)"Serialisation d'une breed NONE ! probablement pas normal");
        }
        this.c.c = this.b.cY.s();
    }

    @Override
    public void b() {
        short s2 = this.c.c;
        if (this.b.cY == null || s2 != this.b.cY.s()) {
            Object b2 = this.b.T().b(s2);
            if (!a && b2 == null) {
                throw new AssertionError((Object)("breed == null. Invalid BreedId : " + s2 + " ?"));
            }
            this.b.c((epq_1)b2);
            if (this.b.cQ == null || this.b.cQ.length() == 0) {
                this.b.c("");
            }
            for (eql_2 eql_22 : this.b.cL) {
                eql_22.f(this.b);
            }
        }
    }

    static {
        a = !epq_2.class.desiredAssertionStatus();
    }
}

