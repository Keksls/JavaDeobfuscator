/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnB
 */
final class bnb_1
extends eqk_2 {
    private final ra_1 b;
    final /* synthetic */ bnh_1 a;

    bnb_1(bnh_1 bnh_12, ra_1 ra_12) {
        this.a = bnh_12;
        this.b = ra_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bnh_1.ft().error((Object)"L'occupation en cours ne devrait pas \u00e9tre envoy\u00e9e par le client");
    }

    @Override
    public void b() {
        if (this.b.c != null) {
            short s2 = this.b.c.a;
            switch (s2) {
                case 4: {
                    bqp_2 bqp_22 = new bqp_2(this.a);
                    bqp_22.a(this.b.c.b);
                    bqp_22.a();
                    break;
                }
                case 20: {
                    bps_2 bps_22 = new bps_2(this.a);
                    bps_22.a(this.b.c.b);
                    bps_22.a();
                    break;
                }
                case 1: {
                    bqh_2 bqh_22 = new bqh_2(this.a);
                    bqh_22.a();
                    break;
                }
                case 14: {
                    bqi_2 bqi_22 = new bqi_2(this.a);
                    bqi_22.a();
                    break;
                }
                case 16: {
                    bql_2 bql_22 = new bql_2(this.a);
                    bql_22.a(this.b.c.b);
                    this.a.a(bql_22);
                    break;
                }
                default: {
                    bnh_1.fu().error((Object)("Occupation inconnue : id=" + s2));
                }
            }
        }
    }
}

