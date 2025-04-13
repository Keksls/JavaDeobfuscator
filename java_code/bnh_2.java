/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnH
 */
final class bnh_2
extends eqk_2 {
    private final ta_2 b;
    final /* synthetic */ bnh_1 a;

    bnh_2(bnh_1 bnh_12, ta_2 ta_22) {
        this.a = bnh_12;
        this.b = ta_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("Pas de serialisation dans le client (Server->Client only)");
    }

    @Override
    public void b() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.a == bmr_12) {
            if (this.b.c) {
                this.a.bv().d(this.a.bv().aw());
            } else {
                this.a.bv().e(0.5f);
            }
        } else {
            this.a.bv().c(this.b.c);
        }
    }
}

