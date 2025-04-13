/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnr
 */
final class bnr_2
extends eqk_2 {
    private final qu_2 b;
    final /* synthetic */ bnh_1 a;

    bnr_2(bnh_1 bnh_12, qu_2 qu_22) {
        this.a = bnh_12;
        this.b = qu_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("Pas de serialisation de part ici.");
    }

    @Override
    public void b() {
        this.a.az = this.b.c;
        if (this.a.aw instanceof bov_2) {
            ((bov_2)this.a.aw).d(this.b.c);
        }
    }
}

