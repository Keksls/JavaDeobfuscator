/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnn
 */
final class bnn_2
extends eqk_2 {
    private final pt_1 b;
    final /* synthetic */ bnh_1 a;

    bnn_2(bnh_1 bnh_12, pt_1 pt_12) {
        this.a = bnh_12;
        this.b = pt_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("Pas de serialisation dans le client (Server->Client only)");
    }

    @Override
    public void b() {
        this.a.gP().b(this.b.c);
    }
}

