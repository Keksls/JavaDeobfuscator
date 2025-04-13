/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnF
 */
final class bnf_2
extends eqk_2 {
    private final sn_2 b;
    final /* synthetic */ bnh_1 a;

    bnf_2(bnh_1 bnh_12, sn_2 sn_22) {
        this.a = bnh_12;
        this.b = sn_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bnh_1.fr().error((Object)"Le client ne devrait pas s\u00e9rialiser les running effects.");
    }

    @Override
    public void b() {
        this.a.dR().a();
        if (this.b.d != null) {
            if (this.a.cD) {
                this.a.dR();
                eJL.a(this.b.d.a, bnh_1.b(this.a), this.a);
            } else {
                this.a.a(this.b.d.a);
            }
        }
    }
}

