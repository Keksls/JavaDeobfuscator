/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnD
 */
final class bnd_1
extends eqk_2 {
    private final rj_2 b;
    final /* synthetic */ bnh_1 a;

    bnd_1(bnh_1 bnh_12, rj_2 rj_22) {
        this.a = bnh_12;
        this.b = rj_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("Pas de serialisation dans le client (Server->Client only)");
    }

    @Override
    public void b() {
        if (this.a.cX()) {
            return;
        }
        if (this.b.d != null) {
            this.a.b(this.b.d.a, this.b.d.b, this.b.d.c, this.b.d.d, this.b.d.e);
        } else {
            this.a.eq();
        }
        if (this.b.c != null) {
            this.a.a(this.b.c.a, this.b.c.b, this.b.c.c, this.b.c.d, this.b.c.e);
        } else {
            this.a.ep();
        }
    }
}

